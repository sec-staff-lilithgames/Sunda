package aa;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("create table if not exists defiCourantTable (idDefi integer(11) not null, baselogiqueid integer(11) not null, titre char(256) not null, PRIMARY KEY (idDefi, baselogiqueid));");
        sQLiteDatabase.execSQL("create table if not exists persosCourantTable (baseId integer(11), nom char(256) not null, description char(256), photoBase64 TEXT, pourcentage FLOAT, trouve integer(1), idDefi integer(11) not null, baselogiqueid integer(11) not null, persoGz integer(5) default 0, persoIndice text default null,persoIndiceUnlocked integer default 0,PRIMARY KEY (baseId, idDefi, baselogiqueid));");
        sQLiteDatabase.execSQL("create table if not exists defiPrecedantTable (idDefi integer(11) not null, baselogiqueid integer(11) not null, titre char(256) not null, PRIMARY KEY (idDefi, baselogiqueid));");
        sQLiteDatabase.execSQL("create table if not exists persosPrecedantTable (baseId integer(11), nom char(256) not null, description char(256), photoBase64 TEXT, pourcentage FLOAT, trouve integer(1), idDefi integer(11) not null, baselogiqueid integer(11) not null, persoGz integer(5) default 0, persoIndice text default null,persoIndiceUnlocked integer default 0,PRIMARY KEY (baseId, idDefi, baselogiqueid));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS defiAwardTable (defiAwarldLevel integer(11) not null, baselogiqueid integer(11) not null, baseId integer(11) not null)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS persosCourantTable");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS defiCourantTable");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS defiPrecedantTable");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS persosPrecedantTable");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS defiAwardTable");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (i10 < 4) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS persosCourantTable");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS defiCourantTable");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS defiPrecedantTable");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS persosPrecedantTable");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS defiAwardTable");
            onCreate(sQLiteDatabase);
            return;
        }
        if (i10 == 4) {
            sQLiteDatabase.execSQL("ALTER TABLE persosCourantTable ADD persoGz integer(5) default 0;");
            sQLiteDatabase.execSQL("ALTER TABLE persosPrecedantTable ADD persoGz integer(5) default 0;");
            sQLiteDatabase.execSQL("ALTER TABLE persosCourantTable ADD persoIndice text default null;");
            sQLiteDatabase.execSQL("ALTER TABLE persosCourantTable ADD persoIndiceUnlocked integer default 0;");
            sQLiteDatabase.execSQL("ALTER TABLE persosPrecedantTable ADD persoIndice text default null;");
            sQLiteDatabase.execSQL("ALTER TABLE persosPrecedantTable ADD persoIndiceUnlocked integer default 0;");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS defiAwardTable (defiAwarldLevel integer(11) not null, baselogiqueid integer(11) not null, baseId integer(11) not null)");
            return;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS defiAwardTable (defiAwarldLevel integer(11) not null, baselogiqueid integer(11) not null, baseId integer(11) not null)");
            }
        } else {
            sQLiteDatabase.execSQL("ALTER TABLE persosCourantTable ADD persoIndice text default null;");
            sQLiteDatabase.execSQL("ALTER TABLE persosCourantTable ADD persoIndiceUnlocked integer default 0;");
            sQLiteDatabase.execSQL("ALTER TABLE persosPrecedantTable ADD persoIndice text default null;");
            sQLiteDatabase.execSQL("ALTER TABLE persosPrecedantTable ADD persoIndiceUnlocked integer default 0;");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS defiAwardTable (defiAwarldLevel integer(11) not null, baselogiqueid integer(11) not null, baseId integer(11) not null)");
        }
    }
}
