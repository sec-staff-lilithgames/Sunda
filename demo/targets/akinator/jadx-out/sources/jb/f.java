package jb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import ao.kwoC.zAQQWzBxnS;
import jb.h;
import kotlin.jvm.internal.e0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f69250c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f69251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f69252f;

    public /* synthetic */ f(h hVar, String str, int i10, int i11) {
        this.f69249b = i11;
        this.f69250c = hVar;
        this.f69251e = str;
        this.f69252f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cursor cursorQuery;
        Cursor cursorQuery2;
        Cursor cursorQuery3;
        Cursor cursor = null;
        switch (this.f69249b) {
            case 0:
                h hVar = this.f69250c;
                String str = this.f69251e;
                int i10 = this.f69252f;
                h.a aVar = h.f69257d;
                hVar.getClass();
                String str2 = zAQQWzBxnS.wpxmOgurM;
                if (i10 <= 0) {
                    return;
                }
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
                                    cursorQuery = sQLiteDatabase.query("compteurs", null, "cle = ?;", new String[]{str}, null, null, null);
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("valeur", Integer.valueOf(cursorQuery.getInt(1) + i10));
                                    SQLiteDatabase sQLiteDatabase2 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase2);
                                    if (sQLiteDatabase2.update("compteurs", contentValues, "cle = ?", new String[]{str}) != 1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e(str2 + str, new Object[0]);
                                    }
                                } else {
                                    ContentValues contentValues2 = new ContentValues();
                                    contentValues2.put("cle", str);
                                    contentValues2.put("valeur", Integer.valueOf(i10));
                                    SQLiteDatabase sQLiteDatabase3 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase3);
                                    if (sQLiteDatabase3.insert("compteurs", null, contentValues2) == -1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e("problem insert COMPTEURS_TABLE_KEY " + str, new Object[0]);
                                    }
                                }
                                cursorQuery.close();
                            } catch (Exception e11) {
                                e = e11;
                                cursor = cursorQuery;
                                Timber.Forest.tag("MetricsSetAdapter").e(e, "problem createOrUpdateMetricCompteur", new Object[0]);
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
            case 1:
                h hVar2 = this.f69250c;
                String str3 = this.f69251e;
                int i11 = this.f69252f;
                h.a aVar2 = h.f69257d;
                hVar2.getClass();
                synchronized ("sqliteLock") {
                    try {
                        if (!hVar2.isOpen()) {
                            hVar2.open();
                        }
                        try {
                            if (hVar2.isOpen()) {
                                try {
                                    SQLiteDatabase sQLiteDatabase4 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase4);
                                    cursorQuery2 = sQLiteDatabase4.query("compteurs", null, "cle = ?;", new String[]{str3}, null, null, null);
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                try {
                                    if (cursorQuery2.getCount() != 1 || !cursorQuery2.moveToFirst()) {
                                        ContentValues contentValues3 = new ContentValues();
                                        contentValues3.put("cle", str3);
                                        contentValues3.put("valeur", Integer.valueOf(i11));
                                        SQLiteDatabase sQLiteDatabase5 = h.f69258e;
                                        e0.checkNotNull(sQLiteDatabase5);
                                        if (sQLiteDatabase5.insert("compteurs", null, contentValues3) == -1) {
                                            Timber.Forest.tag("MetricsSetAdapter").e("problem init COMPTEURS_TABLE_KEY " + str3, new Object[0]);
                                        }
                                    }
                                    cursorQuery2.close();
                                } catch (Exception e13) {
                                    e = e13;
                                    cursor = cursorQuery2;
                                    Timber.Forest.tag("MetricsSetAdapter").e(e, "problem initCompteurIfNotExist", new Object[0]);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursorQuery2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return;
            default:
                h hVar3 = this.f69250c;
                String str4 = this.f69251e;
                int i12 = this.f69252f;
                h.a aVar3 = h.f69257d;
                hVar3.getClass();
                synchronized ("sqliteLock") {
                    try {
                        if (!hVar3.isOpen()) {
                            hVar3.open();
                        }
                        if (hVar3.isOpen()) {
                            try {
                                try {
                                    SQLiteDatabase sQLiteDatabase6 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase6);
                                    cursorQuery3 = sQLiteDatabase6.query("compteurs", null, "cle = ?;", new String[]{str4}, null, null, null);
                                } catch (Exception e14) {
                                    e = e14;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                            try {
                                if (cursorQuery3.getCount() == 1 && cursorQuery3.moveToFirst()) {
                                    ContentValues contentValues4 = new ContentValues();
                                    contentValues4.put("valeur", Integer.valueOf(i12));
                                    SQLiteDatabase sQLiteDatabase7 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase7);
                                    if (sQLiteDatabase7.update("compteurs", contentValues4, "cle =?", new String[]{str4}) == -1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e("problem init COMPTEURS_TABLE_KEY " + str4, new Object[0]);
                                    }
                                } else {
                                    ContentValues contentValues5 = new ContentValues();
                                    contentValues5.put("cle", str4);
                                    contentValues5.put("valeur", Integer.valueOf(i12));
                                    SQLiteDatabase sQLiteDatabase8 = h.f69258e;
                                    e0.checkNotNull(sQLiteDatabase8);
                                    if (sQLiteDatabase8.insert("compteurs", null, contentValues5) == -1) {
                                        Timber.Forest.tag("MetricsSetAdapter").e("problem init COMPTEURS_TABLE_KEY " + str4, new Object[0]);
                                    }
                                }
                                cursorQuery3.close();
                            } catch (Exception e15) {
                                e = e15;
                                cursor = cursorQuery3;
                                Timber.Forest.tag("MetricsSetAdapter").e(e, "problem reinitCompteur", new Object[0]);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return;
                            } catch (Throwable th9) {
                                th = th9;
                                cursor = cursorQuery3;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return;
        }
    }
}
