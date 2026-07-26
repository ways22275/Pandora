package tech.kw.pandora.ui.item;

import tech.kw.pandora.R;
import tech.kw.pandora.ui.recyclerview.BaseItem;
import tech.kw.pandora.ui.recyclerview.UniversalAdapter;

public class ExceptionItem extends BaseItem<String> {
    public ExceptionItem(String data) {
        super(data);
    }

    @Override
    public void onBinding(int position, UniversalAdapter.ViewPool pool, String data) {
        pool.setText(R.id.text, data);
    }

    @Override
    public int getLayout() {
        return R.layout.pd_item_exception;
    }
}
