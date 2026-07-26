package tech.kw.pandora.ui.recyclerview;

import androidx.annotation.LayoutRes;

/**
 * Created by kw on 03/06/2018.
 */

public abstract class BaseItem<T> {

    public T data;

    public BaseItem(T data) {
        this.data = data;
    }

    public abstract void onBinding(int position, UniversalAdapter.ViewPool pool, T data);

    public abstract @LayoutRes int getLayout();

    private Object tag;

    public final BaseItem setTag(Object tag) {
        this.tag = tag;
        return this;
    }

    public final Object getTag() {
        return tag;
    }
}
