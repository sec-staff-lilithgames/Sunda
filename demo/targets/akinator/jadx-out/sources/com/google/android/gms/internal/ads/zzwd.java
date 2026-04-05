package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzwd implements zzyu {
    public long zza;
    public long zzb;
    public zzyt zzc;
    public zzwd zzd;

    public zzwd(long j10, int i10) {
        zza(j10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public final void zza(long j10, int i10) {
        zzgmd.zzh(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }

    public final int zzb(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzwd zzc() {
        this.zzc = null;
        zzwd zzwdVar = this.zzd;
        this.zzd = null;
        return zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyt zzd() {
        zzyt zzytVar = this.zzc;
        zzytVar.getClass();
        return zzytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyu zze() {
        zzwd zzwdVar = this.zzd;
        if (zzwdVar == null || zzwdVar.zzc == null) {
            return null;
        }
        return zzwdVar;
    }
}
