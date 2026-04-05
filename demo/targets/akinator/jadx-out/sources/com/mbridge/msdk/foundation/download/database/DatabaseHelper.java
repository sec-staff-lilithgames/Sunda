package com.mbridge.msdk.foundation.download.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class DatabaseHelper implements IDatabaseHelper {
    private volatile SQLiteDatabase database;
    private final IDatabaseOpenHelper databaseOpenHelper;
    private final Handler handler;
    private final String tableName = GlobalComponent.getInstance().getDatabaseTableName();

    public DatabaseHelper(Context context, Handler handler, IDatabaseOpenHelper iDatabaseOpenHelper) {
        this.handler = handler;
        this.databaseOpenHelper = iDatabaseOpenHelper;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void clear() {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.9
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    return;
                }
                try {
                    if (DatabaseHelper.this.database.isOpen()) {
                        try {
                            DatabaseHelper.this.database.beginTransaction();
                            DatabaseHelper.this.database.delete(DatabaseHelper.this.tableName, null, null);
                            DatabaseHelper.this.database.setTransactionSuccessful();
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                e10.printStackTrace();
                            }
                            try {
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th2) {
                                p0.b(IDatabaseHelper.TAG, th2.getMessage());
                            }
                        }
                    }
                } finally {
                    try {
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    } catch (Throwable th3) {
                        p0.b(IDatabaseHelper.TAG, th3.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.String r0 = " WHERE download_id = ? AND director_path = ?"
                    java.lang.String r1 = "SELECT * FROM "
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    if (r2 == 0) goto L1d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r2)
                    android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r2, r3)
                L1d:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    r3 = 0
                    if (r2 != 0) goto La0
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L38
                    goto La0
                L38:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    java.lang.String r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r1)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    r2.append(r1)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    r2.append(r0)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    java.lang.String r2 = r3     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    java.lang.String[] r2 = new java.lang.String[]{r2, r4}     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
                    if (r0 == 0) goto L70
                    boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
                    if (r1 == 0) goto L70
                    com.mbridge.msdk.foundation.download.database.DownloadModel r3 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
                    goto L70
                L6c:
                    r1 = move-exception
                    goto L93
                L6e:
                    r1 = move-exception
                    goto L7f
                L70:
                    if (r0 == 0) goto L75
                    r0.close()
                L75:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lad
                    goto L8f
                L7a:
                    r1 = move-exception
                    r0 = r3
                    goto L93
                L7d:
                    r1 = move-exception
                    r0 = r3
                L7f:
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6c
                    if (r2 == 0) goto L86
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L6c
                L86:
                    if (r0 == 0) goto L8b
                    r0.close()
                L8b:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lad
                L8f:
                    r0.onDatabase(r3)
                    goto Lad
                L93:
                    if (r0 == 0) goto L98
                    r0.close()
                L98:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L9f
                    r0.onDatabase(r3)
                L9f:
                    throw r1
                La0:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lad
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r3)
                Lad:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass1.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> findAll() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    cursorRawQuery = rawQuery("SELECT * FROM " + this.tableName, null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            arrayList.add(DownloadModel.create(cursorRawQuery));
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                        return arrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        } catch (Throwable unused) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void findByDownloadUrl(final String str, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.2
            /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.String r0 = " WHERE download_url = ?"
                    java.lang.String r1 = "SELECT * FROM "
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    if (r2 == 0) goto L1d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r2)
                    android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r2, r3)
                L1d:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    r3 = 0
                    if (r2 != 0) goto L9e
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L38
                    goto L9e
                L38:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    java.lang.String r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    r2.append(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    r2.append(r0)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    java.lang.String r2 = r3     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
                    if (r0 == 0) goto L6e
                    boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
                    if (r1 == 0) goto L6e
                    com.mbridge.msdk.foundation.download.database.DownloadModel r3 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
                    goto L6e
                L6a:
                    r1 = move-exception
                    goto L91
                L6c:
                    r1 = move-exception
                    goto L7d
                L6e:
                    if (r0 == 0) goto L73
                    r0.close()
                L73:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lab
                    goto L8d
                L78:
                    r1 = move-exception
                    r0 = r3
                    goto L91
                L7b:
                    r1 = move-exception
                    r0 = r3
                L7d:
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6a
                    if (r2 == 0) goto L84
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L6a
                L84:
                    if (r0 == 0) goto L89
                    r0.close()
                L89:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lab
                L8d:
                    r0.onDatabase(r3)
                    goto Lab
                L91:
                    if (r0 == 0) goto L96
                    r0.close()
                L96:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L9d
                    r0.onDatabase(r3)
                L9d:
                    throw r1
                L9e:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lab
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r3)
                Lab:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass2.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> getUnwantedModels(long j10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                if (cursorRawQuery != null) {
                }
            }
            if (!Objects.isNull(this.database) && this.database.isOpen()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                cursorRawQuery = this.database.rawQuery("SELECT * FROM " + this.tableName + " WHERE last_modified_time <= ?", new String[]{String.valueOf(jCurrentTimeMillis)});
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(DownloadModel.create(cursorRawQuery));
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void insert(final DownloadModel downloadModel) {
        this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    try {
                        DatabaseHelper.this.database.beginTransaction();
                        DatabaseHelper.this.database.insert(DatabaseHelper.this.tableName, null, DownloadModel.create(downloadModel));
                        DatabaseHelper.this.database.setTransactionSuccessful();
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            e10.printStackTrace();
                        }
                        try {
                            if (DatabaseHelper.this.database.inTransaction()) {
                                DatabaseHelper.this.database.endTransaction();
                            }
                        } catch (Throwable th2) {
                            p0.b(IDatabaseHelper.TAG, th2.getMessage());
                        }
                    }
                } finally {
                    try {
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    } catch (Throwable th3) {
                        p0.b(IDatabaseHelper.TAG, th3.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public Cursor rawQuery(String str, String[] strArr) {
        boolean zInTransaction;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    this.database.beginTransaction();
                    Cursor cursorRawQuery = this.database.rawQuery(str, strArr);
                    this.database.setTransactionSuccessful();
                    try {
                        if (this.database.inTransaction()) {
                            this.database.endTransaction();
                            return cursorRawQuery;
                        }
                    } catch (Throwable th2) {
                        if (MBridgeConstans.DEBUG) {
                            th2.printStackTrace();
                        }
                    }
                    return cursorRawQuery;
                }
                try {
                    if (zInTransaction) {
                        return null;
                    }
                } catch (Throwable th3) {
                }
                return null;
            } finally {
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th32) {
                    if (MBridgeConstans.DEBUG) {
                        th32.printStackTrace();
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    th4.printStackTrace();
                }
            }
            return null;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.6
            @Override // java.lang.Runnable
            public void run() throws SQLException {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ? AND director_path = ?", new Object[]{str, str2});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void update(final DownloadModel downloadModel, final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{downloadModel.getDownloadId(), str});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateProgress(final String str, final String str2, final DownloadModel downloadModel) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{str, str2});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j10) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.8
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DownloadModel.DOWNLOAD_ID, str);
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, contentValues, "download_id = ?", new String[]{str});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.7
            @Override // java.lang.Runnable
            public void run() throws SQLException {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ?", new Object[]{str});
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }
}
