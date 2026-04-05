package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaw {
    public static void zzb(zzgu zzguVar, SQLiteDatabase sQLiteDatabase) {
        if (zzguVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.zzbv.zza();
        String path = sQLiteDatabase.getPath();
        int i10 = com.google.android.gms.internal.measurement.zzca.zzb;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            zzguVar.zze().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzguVar.zze().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzguVar.zze().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzguVar.zze().zza("Failed to turn on database write permission for owner");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: SQLiteException -> 0x00ba, TryCatch #0 {SQLiteException -> 0x00ba, blocks: (B:26:0x0047, B:28:0x0077, B:30:0x0085, B:32:0x008d, B:33:0x0090, B:34:0x00b9, B:38:0x00bf, B:40:0x00c2, B:42:0x00ca, B:43:0x00d1, B:44:0x00d4, B:46:0x00da, B:49:0x00eb, B:50:0x00ef, B:27:0x0070), top: B:58:0x0047, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[Catch: SQLiteException -> 0x00ba, LOOP:1: B:38:0x00bf->B:43:0x00d1, LOOP_START, PHI: r1
      0x00bf: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00bd, B:43:0x00d1] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {SQLiteException -> 0x00ba, blocks: (B:26:0x0047, B:28:0x0077, B:30:0x0085, B:32:0x008d, B:33:0x0090, B:34:0x00b9, B:38:0x00bf, B:40:0x00c2, B:42:0x00ca, B:43:0x00d1, B:44:0x00d4, B:46:0x00da, B:49:0x00eb, B:50:0x00ef, B:27:0x0070), top: B:58:0x0047, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: SQLiteException -> 0x00ba, TryCatch #0 {SQLiteException -> 0x00ba, blocks: (B:26:0x0047, B:28:0x0077, B:30:0x0085, B:32:0x008d, B:33:0x0090, B:34:0x00b9, B:38:0x00bf, B:40:0x00c2, B:42:0x00ca, B:43:0x00d1, B:44:0x00d4, B:46:0x00da, B:49:0x00eb, B:50:0x00ef, B:27:0x0070), top: B:58:0x0047, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zza(com.google.android.gms.measurement.internal.zzgu r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaw.zza(com.google.android.gms.measurement.internal.zzgu, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
