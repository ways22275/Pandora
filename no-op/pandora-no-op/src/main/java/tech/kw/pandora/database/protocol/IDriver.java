package tech.kw.pandora.database.protocol;

import android.database.sqlite.SQLiteException;

import java.util.List;

import tech.kw.pandora.database.DatabaseResult;

/**
 * Created by kw on 29/05/2018.
 *
 * Database driver：SQLite、ContentProvider
 */

public interface IDriver<T extends IDescriptor> {
    List<T> getDatabaseNames();

    List<String> getTableNames(T databaseDesc) throws SQLiteException;

    void executeSQL(T databaseDesc, String query, DatabaseResult result) throws SQLiteException;
}
