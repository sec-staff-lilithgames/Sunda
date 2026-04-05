package jb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import jb.h;
import kotlin.jvm.internal.e0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f69254c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f69255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f69256f;

    public /* synthetic */ g(h hVar, String str, String str2, int i10) {
        this.f69253b = i10;
        this.f69254c = hVar;
        this.f69255e = str;
        this.f69256f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cursor cursorQuery;
        Cursor cursorQuery2;
        Cursor cursor = null;
        switch (this.f69253b) {
            case 0:
                h hVar = this.f69254c;
                String str = this.f69255e;
                String str2 = this.f69256f;
                h.a aVar = h.f69257d;
                hVar.getClass();
                synchronized ("sqliteLock") {
                    try {
                        if (!hVar.isOpen()) {
                            hVar.open();
                        }
                        if (hVar.isOpen()) {
                            try {
                                try {
                                    SQLiteDatabase sQLiteDatabase = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase);
                                    cursorQuery = sQLiteDatabase.query("valsues", null, "cle = ?;", new String[]{str}, null, null, null);
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                if (cursorQuery.getCount() != 1 || !cursorQuery.moveToFirst()) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("cle", str);
                                    contentValues.put("valeur", str2);
                                    SQLiteDatabase sQLiteDatabase2 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase2);
                                    if (sQLiteDatabase2.insert("valsues", null, contentValues) == -1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e("problem init COMPTEURS_TABLE_KEY " + str, new Object[0]);
                                    }
                                }
                                cursorQuery.close();
                            } catch (Exception e11) {
                                e = e11;
                                cursor = cursorQuery;
                                Timber.Forest.tag("MetricsSetAdapter").e(e, "problem initValueIfNotExist", new Object[0]);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            default:
                h hVar2 = this.f69254c;
                String str3 = this.f69255e;
                String str4 = this.f69256f;
                h.a aVar2 = h.f69257d;
                hVar2.getClass();
                synchronized ("sqliteLock") {
                    try {
                        if (!hVar2.isOpen()) {
                            hVar2.open();
                        }
                        if (hVar2.isOpen()) {
                            try {
                                try {
                                    SQLiteDatabase sQLiteDatabase3 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase3);
                                    cursorQuery2 = sQLiteDatabase3.query("valsues", null, QCmNMSGd.EqJPxjy, new String[]{str3}, null, null, null);
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            try {
                                if (cursorQuery2.getCount() == 1 && cursorQuery2.moveToFirst()) {
                                    ContentValues contentValues2 = new ContentValues();
                                    contentValues2.put("valeur", str4);
                                    SQLiteDatabase sQLiteDatabase4 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase4);
                                    if (sQLiteDatabase4.update("valsues", contentValues2, "cle = ?", new String[]{str3}) != 1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e("problem update VALEURS_TABLE_KEY " + str3, new Object[0]);
                                    }
                                } else {
                                    ContentValues contentValues3 = new ContentValues();
                                    contentValues3.put("cle", str3);
                                    contentValues3.put("valeur", str4);
                                    SQLiteDatabase sQLiteDatabase5 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase5);
                                    if (sQLiteDatabase5.insert("valsues", null, contentValues3) == -1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e("problem insert VALEURS_TABLE_KEY " + str3, new Object[0]);
                                    }
                                }
                                cursorQuery2.close();
                            } catch (Exception e13) {
                                e = e13;
                                cursor = cursorQuery2;
                                Timber.Forest.tag("MetricsSetAdapter").e(e, "problem createOrUpdateMetricValeur", new Object[0]);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                cursor = cursorQuery2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return;
        }
    }
}
