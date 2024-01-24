package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CarTest.class, FamilyCarTest.class, FastCarTest.class })
public class AllTests {

}
