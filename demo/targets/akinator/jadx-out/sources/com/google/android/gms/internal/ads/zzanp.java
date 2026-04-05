package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzanp implements zzada {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzanl zzi;
    private zzadd zzj;
    private boolean zzk;
    private final zzem zza = new zzem(0);
    private final zzeg zzc = new zzeg(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzanm zzd = new zzanm();

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        byte[] bArr = new byte[14];
        zzacr zzacrVar = (zzacr) zzadbVar;
        zzacrVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzacrVar.zzj(bArr[13] & 7, false);
        zzacrVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzj = zzaddVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzadb r14, com.google.android.gms.internal.ads.zzaea r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanp.zzd(com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzem r5 = r4.zza
            long r0 = r5.zzc()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zza()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzd(r7)
        L24:
            com.google.android.gms.internal.ads.zzanl r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzb(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzb
            int r7 = r5.size()
            if (r6 >= r7) goto L40
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzann r5 = (com.google.android.gms.internal.ads.zzann) r5
            r5.zza()
            int r6 = r6 + 1
            goto L2c
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanp.zze(long, long):void");
    }
}
