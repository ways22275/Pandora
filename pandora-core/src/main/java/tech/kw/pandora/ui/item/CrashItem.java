package tech.kw.pandora.ui.item;

import android.text.TextUtils;
import android.view.View;

import tech.kw.pandora.cache.Crash;
import tech.kw.pandora.R;
import tech.kw.pandora.ui.recyclerview.BaseItem;
import tech.kw.pandora.ui.recyclerview.UniversalAdapter;
import tech.kw.pandora.util.Utils;

/**
 * Created by kw on 04/06/2018.
 */

public class CrashItem extends BaseItem<Crash> {

    public CrashItem(Crash data) {
        super(data);
    }

    @Override
    public void onBinding(int position, UniversalAdapter.ViewPool pool, Crash data) {
        pool
                .setVisibility(R.id.common_item_arrow, View.VISIBLE)
                .setText(R.id.common_item_info, TextUtils.isEmpty(data.cause) ? data.type : data.cause)
                .setText(R.id.common_item_title, Utils.millis2String(data.createTime, Utils.HHMMSS));
    }

    @Override
    public int getLayout() {
        return R.layout.pd_item_common;
    }
}
