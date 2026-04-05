package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkm implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zza;
    final /* synthetic */ zzlj zzb;

    public zzkm(zzlj zzljVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzcuVar;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzlj r0 = r8.zzb
            com.google.android.gms.measurement.internal.zzic r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzoc r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzic r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhh r2 = r1.zzd()
            com.google.android.gms.measurement.internal.zzjl r2 = r2.zzl()
            com.google.android.gms.measurement.internal.zzjk r3 = com.google.android.gms.measurement.internal.zzjk.ANALYTICS_STORAGE
            boolean r2 = r2.zzo(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.zzgu r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.zza(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            com.google.android.gms.measurement.internal.zzhh r2 = r1.zzd()
            com.google.android.gms.common.util.Clock r4 = r1.zzaZ()
            long r4 = r4.currentTimeMillis()
            boolean r2 = r2.zzp(r4)
            if (r2 != 0) goto L28
            com.google.android.gms.measurement.internal.zzhh r2 = r1.zzd()
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzl
            long r4 = r2.zza()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            com.google.android.gms.measurement.internal.zzhh r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzl
            long r1 = r1.zza()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            com.google.android.gms.measurement.internal.zzic r0 = r0.zzu
            com.google.android.gms.internal.measurement.zzcu r2 = r8.zza
            com.google.android.gms.measurement.internal.zzpp r0 = r0.zzk()
            long r3 = r1.longValue()
            r0.zzam(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.zzcu r0 = r8.zza     // Catch: android.os.RemoteException -> L73
            r0.zzb(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzlj r1 = r8.zzb
            com.google.android.gms.measurement.internal.zzic r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzgu r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzb()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.zzb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkm.run():void");
    }
}
