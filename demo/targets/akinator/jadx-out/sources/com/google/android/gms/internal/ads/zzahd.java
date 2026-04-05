package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahd {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahm zzc = new zzahm();
    private zzahe zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadb zzadbVar, int i10) throws IOException {
        zzadbVar.zzc(this.zza, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r0[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    public final void zza(zzahe zzaheVar) {
        this.zzd = zzaheVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadb r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahd.zzc(com.google.android.gms.internal.ads.zzadb):boolean");
    }
}
