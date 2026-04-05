package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaii implements zzaie {
    private final zzeg zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaii(zzev zzevVar) {
        zzeg zzegVar = zzevVar.zza;
        this.zza = zzegVar;
        zzegVar.zzh(12);
        this.zzc = zzegVar.zzH() & 255;
        this.zzb = zzegVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzs();
        }
        if (i10 == 16) {
            return this.zza.zzt();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
