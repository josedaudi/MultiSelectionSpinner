package com.bytcode.lib.spinner.multiselectspinner.interfaces;

import com.bytcode.lib.spinner.multiselectspinner.data.KeyPairBoolData;

import java.util.List;

public interface SpinnerListener {
    void onItemsSelected(List<KeyPairBoolData> items);
}
