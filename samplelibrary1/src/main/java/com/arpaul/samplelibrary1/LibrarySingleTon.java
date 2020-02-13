package com.arpaul.samplelibrary1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.arpaul.samplemodule1.SampleModuleActivity;

public class LibrarySingleTon {
    private static LibrarySingleTon INSTANCE = null;

    private LibrarySingleTon(){}

    public static LibrarySingleTon getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new LibrarySingleTon();
        }

        return INSTANCE;
    }

    public void initSampleModule(Activity context) {
        Intent intent = new Intent(context, SampleModuleActivity.class);
        context.startActivity(intent);
    }
}
