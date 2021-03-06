package com.disorder.looxlike.activities;

import android.os.Build;

import com.disorder.looxlike.BuildConfig;
import com.disorder.looxlike.R;
import com.disorder.looxlike.fragments.ToolbarFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    private MainActivity subjectUnderTest;

    @Before
    public void setUp() throws Exception {
        subjectUnderTest = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void toolbarFragmentIsLoaded() {
        int idMainFragment = R.id.fragment_container;
        ToolbarFragment toolbarFragment = (ToolbarFragment) subjectUnderTest.getSupportFragmentManager().findFragmentById(idMainFragment);
        assertNotNull(toolbarFragment);
    }
}