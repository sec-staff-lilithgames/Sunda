package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwb implements zzut {
    private final zzga zza;
    private final zzvm zzb;
    private int zzc;
    private final zzze zzd;

    public zzwb(zzga zzgaVar, final zzadg zzadgVar) {
        zzvm zzvmVar = new zzvm() { // from class: com.google.android.gms.internal.ads.zzwa
            @Override // com.google.android.gms.internal.ads.zzvm
            public final /* synthetic */ zzvn zza(zzpc zzpcVar) {
                return new zztw(zzadgVar);
            }
        };
        zzze zzzeVar = new zzze(-1);
        this.zza = zzgaVar;
        this.zzb = zzvmVar;
        this.zzd = zzzeVar;
        this.zzc = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    public final zzwb zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzwc zzb(zzak zzakVar) {
        zzakVar.zzb.getClass();
        return new zzwc(zzakVar, this.zza, this.zzb, zzrz.zza, this.zzd, this.zzc, 0, null, null, null);
    }
}
