package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzue implements zzwm {
    private final zzgpe zza;
    private long zzb;

    public zzue(List list, List list2) {
        int i10 = zzgpe.zzd;
        zzgpb zzgpbVar = new zzgpb();
        zzgmd.zza(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgpbVar.zzf(new zzud((zzwm) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzgpbVar.zzi();
        this.zzb = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzg(long j10) {
        int i10 = 0;
        while (true) {
            zzgpe zzgpeVar = this.zza;
            if (i10 >= zzgpeVar.size()) {
                return;
            }
            ((zzud) zzgpeVar.get(i10)).zzg(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzi() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgpe zzgpeVar = this.zza;
            if (i10 >= zzgpeVar.size()) {
                break;
            }
            zzud zzudVar = (zzud) zzgpeVar.get(i10);
            long jZzi = zzudVar.zzi();
            if ((zzudVar.zza().contains(1) || zzudVar.zza().contains(2) || zzudVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.zzb;
        return j10 != C.TIME_UNSET ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzl() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgpe zzgpeVar = this.zza;
            if (i10 >= zzgpeVar.size()) {
                break;
            }
            long jZzl = ((zzud) zzgpeVar.get(i10)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzm(zzkn zzknVar) {
        boolean zZzm;
        boolean z10 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zZzm = false;
            while (true) {
                zzgpe zzgpeVar = this.zza;
                if (i10 >= zzgpeVar.size()) {
                    break;
                }
                long jZzl2 = ((zzud) zzgpeVar.get(i10)).zzl();
                boolean z11 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzknVar.zza;
                if (jZzl2 == jZzl || z11) {
                    zZzm |= ((zzud) zzgpeVar.get(i10)).zzm(zzknVar);
                }
                i10++;
            }
            z10 |= zZzm;
        } while (zZzm);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzn() {
        int i10 = 0;
        while (true) {
            zzgpe zzgpeVar = this.zza;
            if (i10 >= zzgpeVar.size()) {
                return false;
            }
            if (((zzud) zzgpeVar.get(i10)).zzn()) {
                return true;
            }
            i10++;
        }
    }
}
