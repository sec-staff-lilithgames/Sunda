package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzami implements zzada {
    private final zzamj zza = new zzamj(null, 0, "audio/ac4");
    private final zzeg zzb = new zzeg(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        int i10;
        zzeg zzegVar = new zzeg(10);
        int i11 = 0;
        while (true) {
            zzacr zzacrVar = (zzacr) zzadbVar;
            zzacrVar.zzh(zzegVar.zzi(), 0, 10, false);
            zzegVar.zzh(0);
            if (zzegVar.zzx() != 4801587) {
                break;
            }
            zzegVar.zzk(3);
            int iZzG = zzegVar.zzG();
            i11 += iZzG + 10;
            zzacrVar.zzj(iZzG, false);
        }
        zzadbVar.zzl();
        zzacr zzacrVar2 = (zzacr) zzadbVar;
        zzacrVar2.zzj(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzacrVar2.zzh(zzegVar.zzi(), 0, 7, false);
            zzegVar.zzh(0);
            int iZzt = zzegVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzegVar.zzi();
                if (bArrZzi.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArrZzi[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i15 == 65535) {
                        i15 = ((bArrZzi[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrZzi[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i14 = 4;
                    }
                    if (iZzt == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzacrVar2.zzj(i10 - 7, false);
            } else {
                zzadbVar.zzl();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzacrVar2.zzj(i13, false);
                i12 = 0;
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
        int iZza = zzadbVar.zza(zzegVar.zzi(), 0, 16384);
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
