package my.project

import grails.test.*

class CompanyTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testConstraints() {
       def co = new Company(name:'m1')
       def coDup = new Company(name:'m1')
       mockForConstraintsTests(Company,[co,coDup])

        assertFalse co.validate()
        assertFalse coDup.validate()

        assertEquals "unique", co.errors['name']
        assertEquals 'unique', coDup.errors['name']

    }
}
