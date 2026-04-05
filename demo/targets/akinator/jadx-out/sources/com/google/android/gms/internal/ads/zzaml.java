package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaml implements zzada {
    private final zzamm zza;
    private final zzeg zzb;
    private final zzeg zzc;
    private final zzef zzd;
    private zzadd zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaml() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzeg zzegVar;
        int i10 = 0;
        while (true) {
            zzegVar = this.zzc;
            zzacr zzacrVar = (zzacr) zzadbVar;
            zzacrVar.zzh(zzegVar.zzi(), 0, 10, false);
            zzegVar.zzh(0);
            if (zzegVar.zzx() != 4801587) {
                break;
            }
            zzegVar.zzk(3);
            int iZzG = zzegVar.zzG();
            i10 += iZzG + 10;
            zzacrVar.zzj(iZzG, false);
        }
        zzadbVar.zzl();
        zzacr zzacrVar2 = (zzacr) zzadbVar;
        zzacrVar2.zzj(i10, false);
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzacrVar2.zzh(zzegVar.zzi(), 0, 2, false);
            zzegVar.zzh(0);
            if (zzamm.zzf(zzegVar.zzt())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzacrVar2.zzh(zzegVar.zzi(), 0, 4, false);
                zzef zzefVar = this.zzd;
                zzefVar.zzf(14);
                int iZzj = zzefVar.zzj(13);
                if (iZzj <= 6) {
                    i13++;
                    zzadbVar.zzl();
                    zzacrVar2.zzj(i13, false);
                } else {
                    zzacrVar2.zzj(iZzj - 6, false);
                    i12 += iZzj;
                }
            } else {
                i13++;
                zzadbVar.zzl();
                zzacrVar2.zzj(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zze = zzaddVar;
        this.zza.zzb(zzaddVar, new zzaoe(Integer.MIN_VALUE, 0, 1));
        zzaddVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        this.zze.getClass();
        zzeg zzegVar = this.zzb;
        int iZza = zzadbVar.zza(zzegVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzaec(C.TIME_UNSET, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzegVar.zzh(0);
        zzegVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzegVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j11;
    }

    public zzaml(int i10) {
        this.zza = new zzamm(true, null, 0, MimeTypes.AUDIO_AAC);
        this.zzb = new zzeg(2048);
        this.zzg = -1L;
        zzeg zzegVar = new zzeg(10);
        this.zzc = zzegVar;
        byte[] bArrZzi = zzegVar.zzi();
        this.zzd = new zzef(bArrZzi, bArrZzi.length);
    }
}
