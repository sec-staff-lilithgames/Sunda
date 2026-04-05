package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzc {
    public static final zzc zza = new zzc(null, new zza[0], 0, C.TIME_UNSET, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        String str = zzep.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzc(Object obj, zza[] zzaVarArr, long j10, long j11, int i10) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzc.class == obj.getClass() && Arrays.equals(this.zzf, ((zzc) obj).zzf);
    }

    public final int hashCode() {
        int i10 = (int) C.TIME_UNSET;
        return Arrays.hashCode(this.zzf) + (i10 * 961);
    }

    public final String toString() {
        return a.b.k("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zza zza(int i10) {
        return i10 < 0 ? zze : this.zzf[i10];
    }

    public final boolean zzb(int i10) {
        zza(-1);
        return false;
    }
}
