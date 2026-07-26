package tech.kw.android.pandora;

import android.app.Application;
import android.os.Build;
import android.util.Log;

import tech.kw.android.pandora.db.StoreDatabase;
import tech.kw.android.pandora.utils.ThreadPool;

/**
 * Created by kw on 30/05/2018.
 */

public class MyApp extends Application {

    private static Application mThis;

    @Override
    public void onCreate() {
        super.onCreate();
        mThis = this;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            ThreadPool.post(() -> {
                // the store.db if exist will be moved to the Device encrypted storage area.
                createDeviceProtectedStorageContext().moveDatabaseFrom(mThis, StoreDatabase.NAME);
            });
        }
    }

    public static Application getContext() {
        return mThis;
    }

}
