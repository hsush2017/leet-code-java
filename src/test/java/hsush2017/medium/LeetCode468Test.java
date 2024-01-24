package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode468Test {
    private LeetCode468 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode468();
    }

    @Test
    public void testIPv4_1() {
        Assertions.assertThat(sut.validIPAddress("172.16.254.1")).isEqualTo("IPv4");
    }

    @Test
    public void testIPv4_2() {
        Assertions.assertThat(sut.validIPAddress("192.168.1.1")).isEqualTo("IPv4");
    }

    @Test
    public void testIPv4_3() {
        Assertions.assertThat(sut.validIPAddress("192.168.1.0")).isEqualTo("IPv4");
    }

    @Test
    public void testIPv4_4() {
        Assertions.assertThat(sut.validIPAddress("192.168.01.1")).isEqualTo("Neither");
    }

    @Test
    public void testIPv4_5() {
        Assertions.assertThat(sut.validIPAddress("192.168.1.00")).isEqualTo("Neither");
    }

    @Test
    public void testIPv4_6() {
        Assertions.assertThat(sut.validIPAddress("192.168@1.1")).isEqualTo("Neither");
    }

    @Test
    public void testIPv4_7() {
        Assertions.assertThat(sut.validIPAddress("1.1.1.1.")).isEqualTo("Neither");
    }

    @Test
    public void testIPv4_8() {
        Assertions.assertThat(sut.validIPAddress("219.219.219.219")).isEqualTo("IPv4");
    }

    @Test
    public void testIPv6_1() {
        Assertions.assertThat(sut.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334")).isEqualTo("IPv6");
    }

    @Test
    public void testIPv6_2() {
        Assertions.assertThat(sut.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334")).isEqualTo("IPv6");
    }

    @Test
    public void testIPv6_3() {
        Assertions.assertThat(sut.validIPAddress("2001:0db8:85a3::8A2E:037j:7334")).isEqualTo("Neither");
    }

    @Test
    public void testIPv6_4() {
        Assertions.assertThat(sut.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334")).isEqualTo("Neither");
    }
}