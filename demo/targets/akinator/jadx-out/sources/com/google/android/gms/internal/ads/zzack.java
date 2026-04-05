package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzack {
    public static final zzack zza = new zzack(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzack(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzack zza(long j10, long j11) {
        return new zzack(-1, j10, j11);
    }

    public static zzack zzb(long j10, long j11) {
        return new zzack(-2, j10, j11);
    }

    public static zzack zzc(long j10) {
        return new zzack(0, C.TIME_UNSET, j10);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
