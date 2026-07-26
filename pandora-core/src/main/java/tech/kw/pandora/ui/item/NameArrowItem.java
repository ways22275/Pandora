package tech.kw.pandora.ui.item;

import android.view.View;

import tech.kw.pandora.R;
import tech.kw.pandora.ui.recyclerview.UniversalAdapter;

/**
 * Created by kw on 2018/7/24.
 */

public class NameArrowItem extends NameItem {
    private String arrowValue;

    public NameArrowItem(String data, String arrowValue) {
        super(data);
        this.arrowValue = arrowValue;
    }

    @Override
    public void onBinding(int position, UniversalAdapter.ViewPool pool, String data) {
        super.onBinding(position, pool, data);
        pool.setVisibility(R.id.common_item_arrow, View.VISIBLE).setText(R.id.common_item_arrow, arrowValue);
    }
}
