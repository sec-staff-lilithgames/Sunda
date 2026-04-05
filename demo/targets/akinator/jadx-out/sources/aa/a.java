package aa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import ca.m;
import com.amazon.device.ads.DtbDeviceData;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import lb.e;
import lb.s0;
import p0.o2;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static SQLiteDatabase f4225b;

    /* renamed from: c, reason: collision with root package name */
    public static a f4226c;

    /* renamed from: d, reason: collision with root package name */
    public static C0001a f4227d;

    /* renamed from: a, reason: collision with root package name */
    public Context f4228a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: aa.a$a, reason: collision with other inner class name */
    public static class C0001a extends SQLiteOpenHelper {
        public C0001a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
            super(context, str, cursorFactory, i10);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("create table if not exists character ( id_base integer(11) not null, name text not null, originalName text ,url_photo text not null, original_url_photo text, code_lang text not null);");
            sQLiteDatabase.execSQL("create table if not exists characters_already_played( language char(3), id integer(11), award integer(2), name varchar(100), desc varchar(255), baselogiqueid integer(10));");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS character");
            sQLiteDatabase.execSQL("DROP table if exists characters_already_played");
            onCreate(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
            if (i10 <= 6) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traduction");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS language");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mbcharac");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS character");
            }
            if (i10 == 6 && i11 >= 7) {
                sQLiteDatabase.execSQL("create table if not exists character ( id_base integer(11) not null, name text not null, originalName text ,url_photo text not null, original_url_photo text, code_lang text not null);");
                sQLiteDatabase.execSQL("ALTER TABLE characters_already_played ADD baselogiqueid integer(10);");
            } else {
                if (i10 >= 6 || i11 < 7) {
                    return;
                }
                sQLiteDatabase.execSQL("create table if not exists character ( id_base integer(11) not null, name text not null, originalName text ,url_photo text not null, original_url_photo text, code_lang text not null);");
                sQLiteDatabase.execSQL("DROP table if exists characters_already_played");
                sQLiteDatabase.execSQL("create table if not exists characters_already_played( language char(3), id integer(11), award integer(2), name varchar(100), desc varchar(255), baselogiqueid integer(10));");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f4229a;

        /* renamed from: b, reason: collision with root package name */
        public String f4230b;

        /* renamed from: c, reason: collision with root package name */
        public int f4231c;
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
        } catch (NoSuchAlgorithmException e10) {
            Timber.tag("AkinatorDbAdapter").e(e10);
            return "";
        }
    }

    public static a sharedInstance() {
        if (f4226c == null) {
            f4226c = new a();
        }
        return f4226c;
    }

    public void addCharacter(String str, int i10, String str2, int i11, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, str);
        contentValues.put("id", Integer.valueOf(str2));
        contentValues.put("award", Integer.valueOf(i11));
        contentValues.put("name", str3);
        contentValues.put(CampaignEx.JSON_KEY_DESC, str4);
        contentValues.put("baselogiqueid", Integer.valueOf(i10));
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    f4225b.insert("characters_already_played", null, contentValues);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        f4225b.close();
    }

    public void deleteTables() {
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    f4225b.delete("characters_already_played", "1", null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void eraseCharacterFromDB(e.f fVar) {
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    f4225b.delete("character", "id_base = ?", new String[]{String.valueOf(fVar.getIdBase())});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String getAllBaseIdAndBaseLogiqueId() {
        String[] strArr = {DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, "id", "baselogiqueid"};
        String strSubstring = "";
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (isOpen()) {
                    Cursor cursorQuery = null;
                    try {
                        try {
                            cursorQuery = f4225b.query("characters_already_played", strArr, null, null, null, null, null);
                            if (cursorQuery != null && cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                                do {
                                    String string = cursorQuery.getString(0);
                                    int i10 = cursorQuery.getInt(1);
                                    int baseLogiqueId = cursorQuery.getInt(2);
                                    if (baseLogiqueId == 0) {
                                        if ("en".equals(string) && "en".equals(m.sharedInstance().getCurrentInstance().getLanguage())) {
                                            baseLogiqueId = m.sharedInstance().getCurrentInstance().getBaseLogiqueId();
                                        } else if (string.equals("cn")) {
                                            baseLogiqueId = 11;
                                        } else if (string.equals("fr")) {
                                            baseLogiqueId = 1;
                                        } else if (string.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                                            baseLogiqueId = 5;
                                        } else if (string.equals("es")) {
                                            baseLogiqueId = 3;
                                        } else if (string.equals("pt")) {
                                            baseLogiqueId = 4;
                                        } else if (string.equals("pl")) {
                                            baseLogiqueId = 26;
                                        } else if (string.equals("ru")) {
                                            baseLogiqueId = 6;
                                        } else if (string.equals("tr")) {
                                            baseLogiqueId = 8;
                                        } else if (string.equals("nl")) {
                                            baseLogiqueId = 9;
                                        } else if (string.equals("il")) {
                                            baseLogiqueId = 13;
                                        } else if (string.equals("it")) {
                                            baseLogiqueId = 7;
                                        } else if (string.equals("kr")) {
                                            baseLogiqueId = 10;
                                        } else if (string.equals("ar")) {
                                            baseLogiqueId = 12;
                                        } else if (string.equals("jp")) {
                                            baseLogiqueId = 16;
                                        }
                                        if (baseLogiqueId != 0) {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("baselogiqueid", Integer.valueOf(baseLogiqueId));
                                            if (f4225b.update("characters_already_played", contentValues, "id =? AND language =?", new String[]{String.valueOf(i10), string}) <= 0) {
                                                Timber.tag("AkinatorBase").e("problem update " + i10 + " " + string, new Object[0]);
                                            }
                                        }
                                    }
                                    strSubstring = strSubstring + i10 + "-" + baseLogiqueId + ",";
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                } while (!cursorQuery.isAfterLast());
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                            }
                        } catch (Exception e10) {
                            Timber.tag("AkinatorDbAdapter").e(e10);
                            if (cursorQuery != null) {
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return strSubstring;
    }

    public TreeSet<Integer> getBaseLogiqueIdsAlreadyPlayed() {
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (!isOpen()) {
                    return null;
                }
                TreeSet<Integer> treeSet = new TreeSet<>();
                Cursor cursorQuery = f4225b.query(true, "characters_already_played", new String[]{"baselogiqueid"}, null, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                    do {
                        treeSet.add(Integer.valueOf(cursorQuery.getString(0)));
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                    } while (!cursorQuery.isAfterLast());
                }
                cursorQuery.close();
                return treeSet;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List<Pair<String, String>> getCharactersPlayedForAwardLevel(int i10) {
        try {
            return getCharactersPlayedForAwardLevel(i10, m.sharedInstance().getCurrentInstance().getBaseLogiqueId());
        } catch (Exception unused) {
            return null;
        }
    }

    public ArrayList<b> getEveryPersoIdJackpotFromDB(int i10) {
        String[] strArr = {String.valueOf(i10)};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (!isOpen()) {
                    return null;
                }
                ArrayList<b> arrayList = new ArrayList<>();
                Cursor cursorQuery = f4225b.query("characters_already_played", new String[]{"id", "baselogiqueid", DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, "name", CampaignEx.JSON_KEY_DESC, "award"}, "baselogiqueid = ? ", strArr, null, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() >= 1 && cursorQuery.moveToFirst()) {
                    do {
                        b bVar = new b();
                        bVar.f4229a = Integer.parseInt(cursorQuery.getString(0));
                        cursorQuery.getString(1);
                        cursorQuery.getString(2);
                        bVar.f4230b = cursorQuery.getString(3);
                        cursorQuery.getString(4);
                        bVar.f4231c = Integer.parseInt(cursorQuery.getString(5));
                        arrayList.add(bVar);
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                    } while (!cursorQuery.isAfterLast());
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getNbCharactersPlayedForAwardLevel(int i10) {
        try {
            return getNbCharactersPlayedForAwardLevel(i10, m.sharedInstance().getCurrentInstance().getBaseLogiqueId());
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getNbCharactersPlayedForAwardLevelAllLanguages(int i10) {
        int i11;
        Cursor cursorRawQuery;
        ArrayList arrayList = new ArrayList();
        s0.f72971j.sharedInstance().getInstancesForSubject(1, arrayList);
        String strL = "select count(*) from characters_already_played where award=" + i10 + " AND baselogiqueid in (";
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lb.c cVar = (lb.c) it.next();
            StringBuilder sbU = o2.u(strL);
            sbU.append(cVar.getBaseLogiqueId());
            strL = j1.o2.l(sbU.toString(), ",");
        }
        String strL2 = j1.o2.l(strL, "-1);");
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                i11 = 0;
                if (isOpen() && (cursorRawQuery = f4225b.rawQuery(strL2, null)) != null && cursorRawQuery.moveToFirst()) {
                    i11 = cursorRawQuery.getInt(0);
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public void init(Context context) throws SQLiteException {
        this.f4228a = context;
        if (f4227d == null) {
            f4227d = new C0001a(this.f4228a, "akinator.db", null, 7);
        }
        open();
    }

    public boolean isAwardAlreadyWonForCharacter(String str, int i10, String str2) {
        String[] strArr = {str, str2, Integer.toString(i10)};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                if (!isOpen()) {
                    return false;
                }
                Cursor cursorQuery = f4225b.query("characters_already_played", null, "language = ? AND id = ? AND baselogiqueid = ? ", strArr, null, null, null);
                if (cursorQuery == null || cursorQuery.getCount() < 1) {
                    return false;
                }
                cursorQuery.close();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isOpen() {
        SQLiteDatabase sQLiteDatabase = f4225b;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public void open() throws SQLiteException {
        SQLiteDatabase sQLiteDatabase = f4225b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            try {
                f4225b = f4227d.getWritableDatabase();
            } catch (SQLiteException unused) {
            }
        }
    }

    public List<Pair<String, String>> getCharactersPlayedForAwardLevel(int i10, int i11) {
        LinkedList linkedList;
        LinkedList linkedList2;
        String[] strArr = {"name", CampaignEx.JSON_KEY_DESC};
        String[] strArr2 = {String.valueOf(i10), String.valueOf(i11)};
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                linkedList = null;
                linkedList = null;
                linkedList = null;
                linkedList = null;
                Cursor cursor = null;
                Cursor cursor2 = null;
                if (isOpen()) {
                    try {
                        Cursor cursorQuery = f4225b.query("characters_already_played", strArr, "award = ? AND baselogiqueid = ? ;", strArr2, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                try {
                                    if (cursorQuery.getCount() >= 1 && cursorQuery.moveToLast()) {
                                        linkedList2 = new LinkedList();
                                        do {
                                            try {
                                                linkedList2.add(new Pair(cursorQuery.getString(0), cursorQuery.getString(1)));
                                                if (!cursorQuery.moveToPrevious()) {
                                                    break;
                                                }
                                            } catch (Exception unused) {
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                linkedList = linkedList2;
                                                return linkedList;
                                            }
                                        } while (!cursorQuery.isBeforeFirst());
                                        linkedList = linkedList2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                linkedList2 = null;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception unused3) {
                        linkedList2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } finally {
            }
        }
        return linkedList;
    }

    public int getNbCharactersPlayedForAwardLevel(int i10, int i11) {
        int i12;
        synchronized ("sqliteLock") {
            try {
                if (!isOpen()) {
                    open();
                }
                i12 = 0;
                if (isOpen()) {
                    Cursor cursorRawQuery = f4225b.rawQuery("select count(*) from characters_already_played where award=" + i10 + " AND baselogiqueid=" + i11 + ";", null);
                    if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                        i12 = cursorRawQuery.getInt(0);
                        cursorRawQuery.close();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }
}
