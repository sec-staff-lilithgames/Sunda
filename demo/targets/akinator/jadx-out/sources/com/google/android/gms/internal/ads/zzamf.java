package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamf implements zzada {
    private final zzamg zza = new zzamg(null, 0, MimeTypes.AUDIO_AC3);
    private final zzeg zzb = new zzeg(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = new zzeg(10);
        int i10 = 0;
        while (true) {
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzacrVar2.zzh(zzegVar.zzi(), 0, 6, false);
            zzegVar.zzh(0);
            if (zzegVar.zzt() != 2935) {
                zzadbVar.zzl();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzacrVar2.zzj(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iZzd = zzacb.zzd(zzegVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzacrVar2.zzj(iZzd - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zza.zzb(zzaddVar, new zzaoe(Integer.MIN_VALUE, 0, 1));
        zzaddVar.zzv();
        zzaddVar.zzw(new zzaec(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        zzeg zzegVar = this.zzb;
        int iZza = zzadbVar.zza(zzegVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzegVar.zzh(0);
        zzegVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzegVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzc = false;
        this.zza.zza();
    }
}
