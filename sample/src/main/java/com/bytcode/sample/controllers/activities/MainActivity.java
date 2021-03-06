package com.bytcode.sample.controllers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.bytcode.lib.spinner.multiselectspinner.data.KeyPairBoolData;
import com.bytcode.lib.spinner.multiselectspinner.spinners.MultiSpinnerSearch;
import com.bytcode.lib.spinner.multiselectspinner.spinners.SingleSpinner;
import com.bytcode.lib.spinner.multiselectspinner.spinners.SingleSpinnerSearch;
import com.bytcode.lib.spinner.multiselectspinner.interfaces.SpinnerListener;
import com.bytcode.sample.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Getting array of String to Bind in Spinner
         */
        final List<String> list = Arrays.asList(getResources().getStringArray(R.array.sports_array));

        final List<KeyPairBoolData> listArray0 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray0.add(h);
        }

        final List<KeyPairBoolData> listArray1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray1.add(h);
        }

        final List<KeyPairBoolData> listArray2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray2.add(h);
        }
        final List<KeyPairBoolData> listArray3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray3.add(h);
        }
        /**
         * Simple MultiSelection Spinner (Without Search/Filter Functionality)
         *
         *  Using MultiSpinner class
         */
        /*MultiSpinner simpleSpinner = (MultiSpinner) findViewById(R.id.simpleMultiSpinner);

        simpleSpinner.setItems(listArray0, -1, new MultiSpinnerListener() {

            @Override
            public void onItemsSelected(boolean[] selected) {
            }

        });*/

        /**
         * Search MultiSelection Spinner (With Search/Filter Functionality)
         *
         *  Using MultiSpinnerSearch class
         */
        MultiSpinnerSearch searchMultiSpinnerUnlimited = (MultiSpinnerSearch) findViewById(R.id.searchMultiSpinnerUnlimited);
        MultiSpinnerSearch searchMultiSpinnerLimit = (MultiSpinnerSearch) findViewById(R.id.searchMultiSpinnerLimit);
        SingleSpinnerSearch searchSingleSpinner = (SingleSpinnerSearch) findViewById(R.id.searchSingleSpinner);
        SingleSpinner singleSpinner = (SingleSpinner) findViewById(R.id.singleSpinner);

        searchMultiSpinnerUnlimited.setItems(listArray0, -1, new SpinnerListener() {

            @Override
            public void onItemsSelected(List<KeyPairBoolData> items) {

                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).isSelected()) {
                        Log.i(TAG, i + " : " + items.get(i).getName() + " : " + items.get(i).isSelected());
                    }
                }
            }
        });

        /***
         * -1 is no by default selection
         * 0 to length will select corresponding values
         */
        searchMultiSpinnerLimit.setItems(listArray1, -1, new SpinnerListener() {

            @Override
            public void onItemsSelected(List<KeyPairBoolData> items) {

                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).isSelected()) {
                        Log.i(TAG, i + " : " + items.get(i).getName() + " : " + items.get(i).isSelected());
                    }
                }
            }
        });

        searchMultiSpinnerLimit.setLimit(2, new MultiSpinnerSearch.LimitExceedListener() {
            @Override
            public void onLimitListener(KeyPairBoolData data) {
                Toast.makeText(getApplicationContext(),
                        "Limit exceed ", Toast.LENGTH_LONG).show();
            }
        });

        searchSingleSpinner.setItems(listArray2, -1, new SpinnerListener() {

            @Override
            public void onItemsSelected(List<KeyPairBoolData> items) {

                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).isSelected()) {
                        Log.i(TAG, i + " : " + items.get(i).getName() + " : " + items.get(i).isSelected());
                    }
                }
            }
        });

        singleSpinner.setItems(listArray3, -1, new SpinnerListener() {

            @Override
            public void onItemsSelected(List<KeyPairBoolData> items) {

                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).isSelected()) {
                        Log.i(TAG, i + " : " + items.get(i).getName() + " : " + items.get(i).isSelected());
                    }
                }
            }
        });
    }
}
