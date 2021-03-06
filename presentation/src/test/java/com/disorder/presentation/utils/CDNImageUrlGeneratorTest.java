package com.disorder.presentation.utils;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CDNImageUrlGeneratorTest {

    private CDNImageUrlGenerator subjectUnderTest;

    private static final String c10 = "37647512DD";

    @Before
    public void setUp() throws Exception {
        subjectUnderTest = new CDNImageUrlGenerator();
    }

    @Test
    public void testLowQuality() throws Exception {
        String expected = "http://cdn.yoox.biz/37/37647512DD_10_f.jpg";
        String result = subjectUnderTest.getUrl(c10, ImageUrlGenerator.ZOOM_LEVEL.LOW);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testMediumQuality() throws Exception {
        String expected = "http://cdn.yoox.biz/37/37647512DD_11_f.jpg";
        String result = subjectUnderTest.getUrl(c10, ImageUrlGenerator.ZOOM_LEVEL.MEDIUM);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testHighQuality() throws Exception {
        String expected = "http://cdn.yoox.biz/37/37647512DD_13_f.jpg";
        String result = subjectUnderTest.getUrl(c10, ImageUrlGenerator.ZOOM_LEVEL.HIGH);
        assertThat(result).isEqualTo(expected);
    }
}