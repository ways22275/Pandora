package tech.kw.pandora.preference.protocol;

import android.content.Context;

import java.io.File;
import java.util.List;

/**
 * Created by kw on 04/06/2018.
 */

public interface IProvider {

    List<File> getSharedPrefFiles(Context context);
}
