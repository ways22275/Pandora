package tech.kw.pandora.ui.fragment;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import tech.kw.pandora.R;
import tech.kw.pandora.inspector.BaseLineView;
import tech.kw.pandora.ui.GeneralDialog;

/**
 * Created by kw on 2019/3/5.
 */

public class MeasureFragment extends BaseFragment {

    @Override
    protected Toolbar onCreateToolbar() {
        return null;
    }

    @Override
    protected boolean enableSwipeBack() {
        return false;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected View getLayoutView() {
        return new BaseLineView(getContext());
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            return;
        }
        GeneralDialog.build(-1)
                .title(R.string.pd_help_title)
                .message(R.string.pd_help_baseline)
                .positiveButton(R.string.pd_ok)
                .show(this);
    }


}
