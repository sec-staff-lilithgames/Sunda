package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafv implements zzada {
    private zzadd zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzafz zzg;
    private zzadb zzh;
    private zzaei zzi;
    private zzaiz zzj;
    private final zzeg zza = new zzeg(2);
    private long zzf = -1;

    private final int zzg(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = this.zza;
        zzegVar.zza(2);
        ((zzacr) zzadbVar).zzh(zzegVar.zzi(), 0, 2, false);
        return zzegVar.zzt();
    }

    private final int zzh(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = this.zza;
        zzegVar.zza(2);
        zzadbVar.zzi(zzegVar.zzi(), 0, 2);
        return zzegVar.zzt() - 2;
    }

    private final void zzi() {
        zzadd zzaddVar = this.zzb;
        zzaddVar.getClass();
        zzaddVar.zzv();
        this.zzb.zzw(new zzaec(C.TIME_UNSET, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        int iZzh;
        if (zzg(zzadbVar) == 65496) {
            while (true) {
                int iZzg = zzg(zzadbVar);
                this.zzd = iZzg;
                if (iZzg == 65498 || (iZzh = zzh(zzadbVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzacr) zzadbVar).zzj(iZzh, false);
                } else {
                    zzeg zzegVar = this.zza;
                    zzegVar.zza(iZzh);
                    ((zzacr) zzadbVar).zzh(zzegVar.zzi(), 0, iZzh, false);
                    if (Objects.equals(zzegVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && zzafy.zzb(zzegVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzb = zzaddVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzadb r26, com.google.android.gms.internal.ads.zzaea r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.zzd(com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea):int");
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaiz zzaizVar = this.zzj;
            zzaizVar.getClass();
            zzaizVar.zze(j10, j11);
        }
    }
}
