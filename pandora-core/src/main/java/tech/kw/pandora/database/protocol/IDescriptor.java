package tech.kw.pandora.database.protocol;

/**
 * Created by kw on 29/05/2018.
 *
 * associated with Driver, can be used to carry some information of the database
 */

public interface IDescriptor {
    String name();
    boolean exist();
}
