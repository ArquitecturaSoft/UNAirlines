package unairlines



import grails.test.mixin.*
import spock.lang.*

@TestFor(FlightClassController)
@Mock(FlightClass)
class FlightClassControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.flightClassInstanceList
            model.flightClassInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.flightClassInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def flightClass = new FlightClass()
            flightClass.validate()
            controller.save(flightClass)

        then:"The create view is rendered again with the correct model"
            model.flightClassInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            flightClass = new FlightClass(params)

            controller.save(flightClass)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/flightClass/show/1'
            controller.flash.message != null
            FlightClass.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def flightClass = new FlightClass(params)
            controller.show(flightClass)

        then:"A model is populated containing the domain instance"
            model.flightClassInstance == flightClass
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def flightClass = new FlightClass(params)
            controller.edit(flightClass)

        then:"A model is populated containing the domain instance"
            model.flightClassInstance == flightClass
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/flightClass/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def flightClass = new FlightClass()
            flightClass.validate()
            controller.update(flightClass)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.flightClassInstance == flightClass

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            flightClass = new FlightClass(params).save(flush: true)
            controller.update(flightClass)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/flightClass/show/$flightClass.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/flightClass/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def flightClass = new FlightClass(params).save(flush: true)

        then:"It exists"
            FlightClass.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(flightClass)

        then:"The instance is deleted"
            FlightClass.count() == 0
            response.redirectedUrl == '/flightClass/index'
            flash.message != null
    }
}
