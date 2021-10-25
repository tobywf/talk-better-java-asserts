package asserts;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JUnit4 {
    @Test
    public void BadJUnit() {
        assertFalse(true);
    }

    @Test
    public void JSONAssert() throws org.json.JSONException {
        JSONAssert.assertEquals("\"EXPECTED\"", "\"ACTUAL\"", true);
    }

    @Test
    public void MixActualAndExpected1JUnit() {
        assertEquals(false, true);
    }
    @Test
    public void MixActualAndExpected1AssertJ() {
        final boolean a = false;
        assertThat(a).isTrue();
    }
    @Test
    public void MixActualAndExpected2JUnit() {
        final Object a = "foo";
        assertEquals("bar", a);
    }
    @Test
    public void MixActualAndExpected2AssertJ() {
        assertThat("foo").isEqualTo("bar");
    }
    @Test
    public void DifferentDataTypes1JUnit() {
        assertEquals(1, "1");
    }
    @Test
    public void DifferentDataTypes1AssertJ() {
        assertThat("1").isEqualTo((Object)1);
    }
    @Test
    public void DifferentDataTypes2JUnit() {
        assertEquals("1", 1);
    }
    @Test
    public void DifferentDataTypes2AssertJ() {
        assertThat(1).isEqualTo((Object)"1");
    }
    @Test
    public void EqualsIgnoreCaseJUnit() {
        assertTrue("foo".equalsIgnoreCase("bar"));
    }
    @Test
    public void EqualsIgnoreCaseAssertJ() {
        assertThat("foo").isEqualToIgnoringCase("bar");
    }
    @Test
    public void IsEmptyNPEJUnit() {
        assertTrue(((String)null).isEmpty());
    }
    @Test
    public void IsEmptyNPEAssertJ() {
        final String a = null;
        assertThat(a).isEmpty();
    }
    @Test
    public void SizeNPEJUnit() {
        final List<String> list = null;
        assertTrue(list.size() == 1);
    }
    @Test
    public void SizeNPEAssertJ() {
        final List<String> list = null;
        assertThat(list).hasSize(1);
    }
    @Test
    public void SizeJUnit() {
        final List<String> list = new ArrayList<String>();
        list.add("foo");
        assertTrue(list.size() == 2);
    }
    @Test
    public void SizeAssertJ() {
        final List<String> list = new ArrayList<String>();
        list.add("foo");
        assertThat(list).hasSize(2);
    }
}
