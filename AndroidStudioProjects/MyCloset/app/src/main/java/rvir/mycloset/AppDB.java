package rvir.mycloset;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Eva on 26.3.2018.
 */
@Database(entities = {Oblacilo.class},version=1)
public abstract class AppDB extends RoomDatabase {
    public abstract OblaciloDao oblaciloDao();
}
