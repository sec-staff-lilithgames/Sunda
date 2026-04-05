package com.bytedance.sdk.component.jj.jpo.jpo.jpo;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jd {

    /* renamed from: jd, reason: collision with root package name */
    private Context f18718jd;
    private C0085jd jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo extends AbstractCursor {
        private jpo() {
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

    public jd(Context context) {
        try {
            this.f18718jd = context.getApplicationContext();
            if (this.jpo == null) {
                this.jpo = new C0085jd();
            }
        } catch (Throwable unused) {
        }
    }

    public C0085jd jpo() {
        return this.jpo;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.jj.jpo.jpo.jpo.jd$jd, reason: collision with other inner class name */
    public class C0085jd {

        /* renamed from: jd, reason: collision with root package name */
        private volatile SQLiteDatabase f18719jd = null;

        public C0085jd() {
        }

        private boolean jd() {
            SQLiteDatabase sQLiteDatabase = this.f18719jd;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private void jpo() {
            boolean zJd;
            try {
                if (this.f18719jd != null && this.f18719jd.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f18719jd == null || !this.f18719jd.isOpen()) {
                            this.f18719jd = xyk.qk().cm().jpo(xyk.qk().jj());
                            this.f18719jd.setLockingEnabled(false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } finally {
                if (!zJd) {
                }
            }
        }

        public void jpo(String str) throws SQLException {
            try {
                jpo();
                this.f18719jd.execSQL(str);
            } catch (Throwable th2) {
                if (jd()) {
                    throw th2;
                }
            }
        }

        public Cursor jpo(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                jpo();
                return this.f18719jd.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                jpo jpoVar = new jpo();
                if (jd()) {
                    throw th2;
                }
                return jpoVar;
            }
        }

        public int jpo(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                jpo();
                return this.f18719jd.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (jd()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long jpo(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                jpo();
                return this.f18719jd.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (jd()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void jpo(String str, String str2, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
            JSONObject jSONObjectQk;
            try {
                try {
                    jpo();
                    this.f18719jd.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar = list.get(i10);
                        if (jpoVar != null && (jSONObjectQk = jpoVar.qk()) != null) {
                            contentValues.put("id", jpoVar.wqx());
                            String strJd = xyk.qk().hna().jd(jSONObjectQk.toString());
                            if (!TextUtils.isEmpty(strJd)) {
                                contentValues.put("value", strJd);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.jj.jpo.wqx.jpo.cm() && jpoVar.yd() > 0 && (jpoVar.cm() == 0 || jpoVar.cm() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(jpoVar.yd()));
                                }
                                this.f18719jd.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.f18719jd.setTransactionSuccessful();
                    list.size();
                    if (this.f18719jd != null) {
                        this.f18719jd.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!jd()) {
                        if (this.f18719jd != null) {
                            this.f18719jd.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                if (this.f18719jd != null) {
                    this.f18719jd.endTransaction();
                }
                throw th2;
            }
        }

        public int jpo(String str, String str2, String[] strArr) throws Exception {
            try {
                jpo();
                return this.f18719jd.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (jd()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
