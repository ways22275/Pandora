package tech.kw.pandora;

import tech.kw.pandora.database.Databases;
import tech.kw.pandora.function.IFunc;
import tech.kw.pandora.inspector.attribute.AttrFactory;
import tech.kw.pandora.network.OkHttpInterceptor;
import tech.kw.pandora.preference.SharedPref;

/**
 * Created by kw on 29/05/2018.
 */
public final class Pandora {


    public static Pandora get() {
        return new Pandora();
    }

    private Pandora() {
    }

    public OkHttpInterceptor getInterceptor() {
        return new OkHttpInterceptor();
    }

    public Databases getDatabases() {
        return new Databases();
    }

    public SharedPref getSharedPref() {
        return new SharedPref();
    }

    public AttrFactory getAttrFactory() {
        return new AttrFactory();
    }

    public void addFunction(IFunc func) {
    }

    public void open() {
    }

    public void close() {
    }

    public void disableShakeSwitch() {
    }
}
