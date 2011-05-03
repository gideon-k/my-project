package my.project

import grails.test.*

class ContactTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testConstraints(){
        def existingContact = new Contact(email:'joe@shmoe.com')
        mockForConstraintsTests(Contact,[existingContact])

        def anotherContact = new Contact()
        mockForConstraintsTests(Contact,[anotherContact]) //this should fail?

        assertFalse anotherContact.validate()
        assertEquals "nullable", anotherContact.errors["email"]

        def badEmailContact = new Contact(email: 'dummy')
        assertFalse badEmailContact.validate()
        assertEquals "email",badEmailContact.errors["email"]

    }
}
