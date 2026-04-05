package mb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.amazon.device.ads.DtbDeviceData;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import lb.b1;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static SQLiteDatabase f74137b;

    /* renamed from: c, reason: collision with root package name */
    public static a f74138c;

    /* renamed from: d, reason: collision with root package name */
    public static C0747a f74139d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f74140a = new LinkedList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: mb.a$a, reason: collision with other inner class name */
    public static class C0747a extends SQLiteOpenHelper {
        public C0747a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
            super(context, str, cursorFactory, i10);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("create table language (_id integer auto_increment, code_lang text not null, lang_label text not null, flag_url text not null, last_tokens_sync text, last_ws_sync text, coef_android text, smartphone_font text, PRIMARY KEY (code_lang));");
            sQLiteDatabase.execSQL("create table traduction (_id integer auto_increment primary key, code_lang text not null, code_subject text not null, marker text not null, label text );CREATE INDEX index_marker ON traduction(marker);");
            sQLiteDatabase.execSQL("create table mbcharac ( idbase integer(11) not null, name text not null, njoue integer(11) not null, cks text not null);");
            sQLiteDatabase.execSQL("create table language_theme( code_lang text not null, code_subject text not null, last_tokens_sync text, primary key (code_lang,code_subject));");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traduction");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS language");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mbcharac");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS language_theme");
            onCreate(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traduction");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS language");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mbcharac");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS language_theme");
            onCreate(sQLiteDatabase);
        }
    }

    public static String md5(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static a sharedInstance() {
        if (f74138c == null) {
            f74138c = new a();
        }
        return f74138c;
    }

    public void addOneTradToSave(b1.c cVar) {
        this.f74140a.add(cVar);
    }

    public void cleanTokensForOneLang(String str) {
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    f74137b.delete("traduction", "code_lang = ?", new String[]{str});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized ("sqliteLock") {
            f74137b.close();
        }
    }

    public ArrayList<b1.b> getAllLanguages() {
        ArrayList<b1.b> arrayList = new ArrayList<>();
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    Cursor cursorQuery = f74137b.query(true, DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, new String[]{"code_lang", "lang_label", "flag_url", "last_tokens_sync", "last_ws_sync", "coef_android", "smartphone_font"}, null, null, null, null, null, null);
                    if (cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(new b1.b(cursorQuery.getString(0), cursorQuery.getString(1), cursorQuery.getString(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getString(5), cursorQuery.getString(6)));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public String getDateLastSynchro(String str, int i10) {
        String string;
        String[] strArr = {str, Integer.toString(i10)};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                string = null;
                if (isOpen()) {
                    Cursor cursorQuery = f74137b.query(true, "language_theme", new String[]{"last_tokens_sync"}, "code_lang = ? AND code_subject= ?", strArr, null, null, null, "1");
                    if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(0);
                    }
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public b1.b getLanguage(String str) {
        b1.b bVar;
        String[] strArr = {str};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                bVar = null;
                if (isOpen()) {
                    try {
                        Cursor cursorQuery = f74137b.query(true, DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, new String[]{"lang_label", "flag_url", "last_tokens_sync", "last_ws_sync", "coef_android", "smartphone_font"}, "code_lang = ?", strArr, null, null, null, "1");
                        if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                            bVar = new b1.b(str, cursorQuery.getString(0), cursorQuery.getString(1), cursorQuery.getString(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getString(5));
                        }
                        cursorQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public b1.c getToken(String str, String str2, String str3) {
        b1.c cVar;
        String[] strArr = {str, str2, str3};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                cVar = null;
                if (isOpen()) {
                    Cursor cursorQuery = f74137b.query(true, "traduction", new String[]{"label"}, "code_lang = ? AND code_subject = ? AND marker = ?", strArr, null, null, null, "1");
                    if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                        cVar = new b1.c(str, str2, str3, cursorQuery.getString(0));
                    }
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public ArrayList<b1.c> getTokensForOneLangAndTradsID(String str, String str2) {
        ArrayList<b1.c> arrayList = new ArrayList<>();
        String[] strArr = {str, str2};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    Cursor cursorQuery = f74137b.query(true, "traduction", new String[]{"marker", "label"}, "code_lang = ? AND code_subject = ? ", strArr, null, null, null, null);
                    try {
                        if (cursorQuery.getCount() != 0 && cursorQuery.moveToFirst()) {
                            do {
                                arrayList.add(new b1.c(str, str2, cursorQuery.getString(0), cursorQuery.getString(1)));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void init(Context context) {
        if (f74139d == null) {
            f74139d = new C0747a(context, "elokenceapi.db", null, 6);
        }
        open();
    }

    public boolean isOpen() {
        SQLiteDatabase sQLiteDatabase = f74137b;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public void open() throws SQLiteException {
        SQLiteDatabase sQLiteDatabase = f74137b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            try {
                f74137b = f74139d.getWritableDatabase();
            } catch (SQLiteException e10) {
                Timber.tag("AkDBAdapter").e(e10, "Opening error : ", new Object[0]);
            }
        }
    }

    public void saveAllTokensForOneLang(ArrayList<b1.c> arrayList) {
        Iterator<b1.c> it = arrayList.iterator();
        while (it.hasNext()) {
            saveOneTraduction(it.next());
        }
    }

    public void saveOneTraduction(b1.c cVar) {
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    Timber.tag("AkDBAdapter").d("Ajout token : %s", cVar);
                    f74137b.delete("traduction", "code_lang =? AND marker =? AND code_subject =? ", new String[]{cVar.getCode(), cVar.getMarker(), cVar.getTradsAppId()});
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("code_lang", cVar.getCode());
                    contentValues.put("code_subject", cVar.getTradsAppId());
                    contentValues.put("label", cVar.getLabel());
                    contentValues.put("marker", cVar.getMarker());
                    f74137b.insert("traduction", null, contentValues);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void saveOrUpdateAllLanguages(ArrayList<b1.b> arrayList) {
        Iterator<b1.b> it = arrayList.iterator();
        while (it.hasNext()) {
            saveOrUpdateLanguage(it.next());
        }
    }

    public void saveOrUpdateLanguage(b1.b bVar) {
        if (bVar != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("lang_label", bVar.getLabel());
            contentValues.put("last_ws_sync", bVar.getLastWsSync());
            contentValues.put("flag_url", bVar.getFlagUrl());
            contentValues.put("coef_android", bVar.getFontCoeffAndroid());
            contentValues.put("smartphone_font", bVar.getSmartphoneFont());
            synchronized ("sqliteLock") {
                try {
                    if (!isOpen()) {
                        open();
                    }
                    if (isOpen()) {
                        b1.b language = getLanguage(bVar.getCode());
                        if (language == null) {
                            contentValues.put("code_lang", bVar.getCode());
                            f74137b.insert(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, null, contentValues);
                        } else {
                            contentValues.put("last_tokens_sync", language.getLastTokensSync());
                            f74137b.update(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, contentValues, "code_lang =?", new String[]{bVar.getCode()});
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void saveTradsToSave() {
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    f74137b.beginTransaction();
                    try {
                        for (b1.c cVar : this.f74140a) {
                            Timber.tag("AkDBAdapter").d("Ajout token : %s", cVar.toString());
                            f74137b.delete("traduction", "code_lang =? AND marker =? AND code_subject =? ", new String[]{cVar.getCode(), cVar.getMarker(), cVar.getTradsAppId()});
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("code_lang", cVar.getCode());
                            contentValues.put("code_subject", cVar.getTradsAppId());
                            contentValues.put("label", cVar.getLabel());
                            contentValues.put("marker", cVar.getMarker());
                            f74137b.insert("traduction", null, contentValues);
                        }
                        f74137b.setTransactionSuccessful();
                        this.f74140a.clear();
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        f74137b.endTransaction();
                        throw th2;
                    }
                    f74137b.endTransaction();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void updateTokensDateSynchro(b1.b bVar) {
        String lastWsSync = bVar.getLastWsSync();
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("last_tokens_sync", lastWsSync);
                    f74137b.update(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, contentValues, "code_lang =?", new String[]{bVar.getCode()});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updateTokensDateSynchro(b1.b bVar, int i10) {
        String lastWsSync = bVar.getLastWsSync();
        updateTokensDateSynchro(bVar);
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("last_tokens_sync", lastWsSync);
                    contentValues.put("code_lang", bVar.getCode());
                    contentValues.put("code_subject", Integer.toString(i10));
                    f74137b.replace("language_theme", null, contentValues);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
