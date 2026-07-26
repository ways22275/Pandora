package tech.kw.android.pandora.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import tech.kw.android.pandora.db.entity.Drink;


/**
 * Created by kw on 2018/3/13.
 *
 */

@Dao
public interface DrinkDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insert(Drink... drinks);

    @Query("DELETE FROM Drink")
    void delete();

}
