package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbf {
    public static final zzbf zza = new zzbc();

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int iZzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbf)) {
            return false;
        }
        zzbf zzbfVar = (zzbf) obj;
        if (zzbfVar.zza() == zza() && zzbfVar.zzc() == zzc()) {
            zzbe zzbeVar = new zzbe();
            zzbd zzbdVar = new zzbd();
            zzbe zzbeVar2 = new zzbe();
            zzbd zzbdVar2 = new zzbd();
            for (int i10 = 0; i10 < zza(); i10++) {
                if (!zzb(i10, zzbeVar, 0L).equals(zzbfVar.zzb(i10, zzbeVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzc(); i11++) {
                if (!zzd(i11, zzbdVar, true).equals(zzbfVar.zzd(i11, zzbdVar2, true))) {
                    return false;
                }
            }
            int iZzk = zzk(true);
            if (iZzk == zzbfVar.zzk(true) && (iZzj = zzj(true)) == zzbfVar.zzj(true)) {
                while (iZzk != iZzj) {
                    int iZzh = zzh(iZzk, 0, true);
                    if (iZzh != zzbfVar.zzh(iZzk, 0, true)) {
                        return false;
                    }
                    iZzk = iZzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int iZza = zza() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        int i11 = 0;
        while (true) {
            i10 = iZza * 31;
            if (i11 >= zza()) {
                break;
            }
            iZza = i10 + zzb(i11, zzbeVar, 0L).hashCode();
            i11++;
        }
        int iZzc = zzc() + i10;
        for (int i12 = 0; i12 < zzc(); i12++) {
            iZzc = (iZzc * 31) + zzd(i12, zzbdVar, true).hashCode();
        }
        int iZzk = zzk(true);
        while (iZzk != -1) {
            iZzc = (iZzc * 31) + iZzk;
            iZzk = zzh(iZzk, 0, true);
        }
        return iZzc;
    }

    public abstract int zza();

    public abstract zzbe zzb(int i10, zzbe zzbeVar, long j10);

    public abstract int zzc();

    public abstract zzbd zzd(int i10, zzbd zzbdVar, boolean z10);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i10);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == zzj(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == zzj(z10) ? zzk(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i10, int i11, boolean z10) {
        if (i10 == zzk(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public int zzj(boolean z10) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z10) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i10, zzbd zzbdVar, zzbe zzbeVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzbdVar, false).zzc;
        if (zzb(i12, zzbeVar, 0L).zzo != i10) {
            return i10 + 1;
        }
        int iZzh = zzh(i12, i11, z10);
        if (iZzh == -1) {
            return -1;
        }
        return zzb(iZzh, zzbeVar, 0L).zzn;
    }

    public final Pair zzm(zzbe zzbeVar, zzbd zzbdVar, int i10, long j10) {
        Pair pairZzn = zzn(zzbeVar, zzbdVar, i10, j10, 0L);
        pairZzn.getClass();
        return pairZzn;
    }

    public final Pair zzn(zzbe zzbeVar, zzbd zzbdVar, int i10, long j10, long j11) {
        zzgmd.zzm(i10, zza(), "index");
        zzb(i10, zzbeVar, j11);
        if (j10 == C.TIME_UNSET) {
            long j12 = zzbeVar.zzl;
            j10 = 0;
        }
        int i11 = zzbeVar.zzn;
        zzd(i11, zzbdVar, false);
        while (i11 < zzbeVar.zzo) {
            long j13 = zzbdVar.zze;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = zzd(i12, zzbdVar, false).zze;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        zzd(i11, zzbdVar, true);
        long j15 = zzbdVar.zze;
        long j16 = zzbdVar.zzd;
        if (j16 != C.TIME_UNSET) {
            j10 = Math.min(j10, j16 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = zzbdVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbd zzo(Object obj, zzbd zzbdVar) {
        return zzd(zze(obj), zzbdVar, true);
    }
}
