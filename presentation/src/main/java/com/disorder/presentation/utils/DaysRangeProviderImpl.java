package com.disorder.presentation.utils;

import android.content.Context;

import com.disorder.presentation.R;

import javax.inject.Inject;

public class DaysRangeProviderImpl implements DaysRangeProvider {

    private final Context mContex;

    @Inject
    public DaysRangeProviderImpl(Context mContex) {
        this.mContex = mContex.getApplicationContext();
    }

    @Override
    public String getString(int days) {

        if (days == 0)
            return mContex.getString(R.string.today);

        return mContex.getResources().getQuantityString(R.plurals.days, days, days);
    }
}
