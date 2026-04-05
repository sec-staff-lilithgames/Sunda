package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import be.nVUQ.UupKET;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, contextZzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009f, SQLiteFullException -> 0x00a3, all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzs(int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzs(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp == null || (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpm.zza(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzicVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[PHI: r4
      0x0067: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:25:0x005e, B:32:0x007b, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzo() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.zzg()
            boolean r1 = r10.zzc
            r2 = 0
            if (r1 == 0) goto Lc
            goto L8e
        Lc:
            boolean r1 = r10.zzq()
            if (r1 == 0) goto L8e
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L87
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.zzp()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            if (r5 != 0) goto L22
            r10.zzc = r6     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            goto L8e
        L22:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.close()
            return r6
        L3f:
            r0 = move-exception
            goto L81
        L41:
            r7 = move-exception
            if (r5 == 0) goto L4d
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L3f
            if (r8 == 0) goto L4d
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3f
        L4d:
            com.google.android.gms.measurement.internal.zzic r8 = r10.zzu     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzgu r8 = r8.zzaV()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzgs r8 = r8.zzb()     // Catch: java.lang.Throwable -> L3f
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L3f
            r10.zzc = r6     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7e
            goto L67
        L5f:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L3f
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L3f
            int r4 = r4 + 20
            if (r5 == 0) goto L7e
        L67:
            r5.close()
            goto L7e
        L6b:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzic r8 = r10.zzu     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzgu r8 = r8.zzaV()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzgs r8 = r8.zzb()     // Catch: java.lang.Throwable -> L3f
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L3f
            r10.zzc = r6     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7e
            goto L67
        L7e:
            int r3 = r3 + 1
            goto L15
        L81:
            if (r5 == 0) goto L86
            r5.close()
        L86:
            throw r0
        L87:
            com.google.android.gms.measurement.internal.zzic r0 = r10.zzu
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            com.google.android.gms.internal.play_billing.a.C(r0, r1)
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzo():boolean");
    }

    public final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    public final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza(UupKET.YwmXRD);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0218 A[Catch: SQLiteDatabaseLockedException -> 0x0121, SQLiteException -> 0x01f5, SQLiteFullException -> 0x01f8, all -> 0x036b, TryCatch #7 {all -> 0x036b, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x0330, B:183:0x0336, B:184:0x0339, B:191:0x035b, B:201:0x0377, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e3, B:159:0x02f2), top: B:226:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0264 A[Catch: SQLiteException -> 0x0243, SQLiteFullException -> 0x0246, SQLiteDatabaseLockedException -> 0x035a, all -> 0x036b, TryCatch #7 {all -> 0x036b, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x0330, B:183:0x0336, B:184:0x0339, B:191:0x035b, B:201:0x0377, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e3, B:159:0x02f2), top: B:226:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0367 A[PHI: r6 r11 r13 r17 r19 r21
      0x0367: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x034e, B:204:0x038c, B:195:0x0365] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:187:0x034e, B:204:0x038c, B:195:0x0365] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r13v9 android.database.sqlite.SQLiteDatabase) = 
      (r13v5 android.database.sqlite.SQLiteDatabase)
      (r13v7 android.database.sqlite.SQLiteDatabase)
      (r13v10 android.database.sqlite.SQLiteDatabase)
     binds: [B:187:0x034e, B:204:0x038c, B:195:0x0365] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x034e, B:204:0x038c, B:195:0x0365] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:187:0x034e, B:204:0x038c, B:195:0x0365] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:187:0x034e, B:204:0x038c, B:195:0x0365] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0330 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzm(int r30) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzm(int):java.util.List");
    }
}
