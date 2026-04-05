package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    private static final Object wqx = new Object();

    /* renamed from: jd, reason: collision with root package name */
    private Context f20455jd;
    private wqx jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jd extends AbstractCursor {
        private jd() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public jj(Context context) {
        try {
            this.f20455jd = context == null ? sq.jpo() : context.getApplicationContext();
            if (this.jpo == null) {
                this.jpo = new wqx();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context wqx() {
        Context context = this.f20455jd;
        return context == null ? sq.jpo() : context;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class wqx {

        /* renamed from: jd, reason: collision with root package name */
        private SQLiteDatabase f20461jd = null;

        public wqx() {
        }

        private synchronized boolean jj() {
            SQLiteDatabase sQLiteDatabase = this.f20461jd;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void my() {
            try {
                synchronized (jj.wqx) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.f20461jd;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            jj jjVar = jj.this;
                            SQLiteDatabase writableDatabase = jjVar.new jpo(jjVar.wqx()).getWritableDatabase();
                            this.f20461jd = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("DBHelper", th2.getMessage());
                if (jj()) {
                    throw th2;
                }
            }
        }

        public synchronized void cm() {
            my();
            SQLiteDatabase sQLiteDatabase = this.f20461jd;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized void jd() {
            my();
            SQLiteDatabase sQLiteDatabase = this.f20461jd;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public SQLiteDatabase jpo() {
            my();
            return this.f20461jd;
        }

        public synchronized void wqx() {
            my();
            SQLiteDatabase sQLiteDatabase = this.f20461jd;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void jpo(String str) throws SQLException {
            try {
                my();
                this.f20461jd.execSQL(str);
            } catch (Throwable th2) {
                if (jj()) {
                    throw th2;
                }
            }
        }

        public synchronized Cursor jpo(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                my();
                cursorQuery = this.f20461jd.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("DBHelper", th2.getMessage());
                jd jdVar = new jd();
                if (jj()) {
                    throw th2;
                }
                cursorQuery = jdVar;
            }
            return cursorQuery;
        }

        public synchronized int jpo(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                my();
                iUpdate = this.f20461jd.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("DBHelper", e10.getMessage());
                if (jj()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long jpo(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                my();
                jReplace = this.f20461jd.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("DBHelper", e10.getMessage());
                if (jj()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int jpo(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                my();
                iDelete = this.f20461jd.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("DBHelper", e10.getMessage());
                if (jj()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public wqx jpo() {
        return this.jpo;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo extends SQLiteOpenHelper {
        final Context jpo;

        public jpo(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.jpo = context;
        }

        private ArrayList<String> cm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
            return arrayList;
        }

        private void jd(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ju.jpo.wqx.cm());
        }

        private void jpo(SQLiteDatabase sQLiteDatabase, Context context) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.cm.jpo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.yd.wqx());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.prr.jpo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.oya.jpo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hmu.jd.jpo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.sq.wqx());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.jpo.jd.jd.wqx());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ju.jpo.wqx.wqx());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.hna.jpo());
        }

        private void wqx(SQLiteDatabase sQLiteDatabase) throws SQLException {
            ArrayList<String> arrayListCm = cm(sQLiteDatabase);
            if (arrayListCm == null || arrayListCm.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListCm.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                jpo(sQLiteDatabase, this.jpo);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("DBHelper", th2.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    wqx(sQLiteDatabase);
                    jpo(sQLiteDatabase, jj.this.f20455jd);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            /*
                r0 = this;
                if (r2 <= r3) goto L5
                r0.wqx(r1)     // Catch: java.lang.Throwable -> L43
            L5:
                com.bytedance.sdk.openadsdk.core.jj r3 = com.bytedance.sdk.openadsdk.core.jj.this     // Catch: java.lang.Throwable -> L43
                android.content.Context r3 = com.bytedance.sdk.openadsdk.core.jj.jd(r3)     // Catch: java.lang.Throwable -> L43
                r0.jpo(r1, r3)     // Catch: java.lang.Throwable -> L43
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L37;
                    case 3: goto L2c;
                    case 4: goto L21;
                    case 5: goto L16;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L43
            L11:
                goto L43
            L12:
                r0.jpo(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L16:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.cm.oya.jpo()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.jpo(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L21:
                java.lang.String r3 = com.bytedance.sdk.component.adexpress.jpo.jd.jd.wqx()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.jpo(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L2c:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.cm.prr.jpo()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.jpo(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L37:
                java.lang.String r3 = "DROP TABLE IF EXISTS 'ad_video_info';"
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.jpo(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L40:
                r0.jpo(r1)     // Catch: java.lang.Throwable -> L43
            L43:
                r3 = 11
                if (r2 >= r3) goto L58
                r0.jd(r1)     // Catch: java.lang.Throwable -> L4e
                com.bytedance.sdk.openadsdk.hmu.jd.jpo(r1)     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r1 = move-exception
                java.lang.String r2 = "DBHelper"
                java.lang.String r1 = r1.getMessage()
                com.bytedance.sdk.component.utils.nmd.wqx(r2, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jj.jpo.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        private void jpo(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.cm.jd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.yd.cm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.prr.jd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cm.oya.jd());
        }
    }
}
