package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzafo implements zzada {
    private zzadd zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafm zzo;
    private zzafs zzp;
    private final zzeg zza = new zzeg(4);
    private final zzeg zzb = new zzeg(9);
    private final zzeg zzc = new zzeg(11);
    private final zzeg zzd = new zzeg();
    private final zzafp zze = new zzafp();
    private int zzg = 1;

    private final zzeg zzg(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = this.zzd;
        if (this.zzl > zzegVar.zzj()) {
            int iZzj = zzegVar.zzj();
            zzegVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzegVar.zzh(0);
        }
        zzegVar.zzf(this.zzl);
        zzadbVar.zzc(zzegVar.zzi(), 0, this.zzl);
        return zzegVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzh() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzaec(C.TIME_UNSET, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = this.zza;
        zzacr zzacrVar = (zzacr) zzadbVar;
        zzacrVar.zzh(zzegVar.zzi(), 0, 3, false);
        zzegVar.zzh(0);
        if (zzegVar.zzx() != 4607062) {
            return false;
        }
        zzacrVar.zzh(zzegVar.zzi(), 0, 2, false);
        zzegVar.zzh(0);
        if ((zzegVar.zzt() & 250) != 0) {
            return false;
        }
        zzacrVar.zzh(zzegVar.zzi(), 0, 4, false);
        zzegVar.zzh(0);
        int iZzB = zzegVar.zzB();
        zzadbVar.zzl();
        zzacr zzacrVar2 = (zzacr) zzadbVar;
        zzacrVar2.zzj(iZzB, false);
        zzacrVar2.zzh(zzegVar.zzi(), 0, 4, false);
        zzegVar.zzh(0);
        return zzegVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzf = zzaddVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzadb r15, com.google.android.gms.internal.ads.zzaea r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafo.zzd(com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea):int");
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }
}
