package org.klu.application;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class Application extends TestCase {
	     //@param testName name of the test case
	    public Application( String testName )
	    {
	        super( testName );
	    }
	      //return the suite of tests being tested
	    public static Test suite()
	    {
	        return new TestSuite( Application.class );
	    }
	    public void testApp()
	    {
	        assertTrue( true );
	    }
}