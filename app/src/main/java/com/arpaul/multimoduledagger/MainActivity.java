package com.arpaul.multimoduledagger;

import android.os.Bundle;

import com.arpaul.multimoduledagger.component.AppComponent;
import com.arpaul.multimoduledagger.component.DaggerAppComponent;
import com.arpaul.multimoduledagger.model.AppModel;
import com.arpaul.samplelibrary1.dummy.DummyClass;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;


//HOW TO CREATE AAR FILE
// https://dominoc925.blogspot.com/2015/09/how-to-create-and-use-android-archive.html
// https://proandroiddev.com/using-dagger-in-a-multi-module-project-1e6af8f06ffc

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Inject
    AppModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DummyClass dummy = new DummyClass();
                Snackbar.make(view, dummy.getDummy_text(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        AppComponent component = DaggerAppComponent.builder().build();
        component.inject(this);

//        model = component.getModel();

    }

    @Override
    protected void onResume() {
        super.onResume();

        if(model != null) {
            Log.v(TAG, model.getModelName());
        } else {
            Log.v(TAG, "null");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
