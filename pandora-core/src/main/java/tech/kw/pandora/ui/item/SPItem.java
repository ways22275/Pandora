package tech.kw.pandora.ui.item;

import java.io.File;

/**
 * Created by kw on 05/06/2018.
 */

public class SPItem extends NameItem {
    public File descriptor;

    public SPItem(String data, File descriptor) {
        super(data);
        this.descriptor = descriptor;
    }
}
