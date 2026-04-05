package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaih implements zzaie {
    private final int zza;
    private final int zzb;
    private final zzeg zzc;

    public zzaih(zzev zzevVar, zzv zzvVar) {
        zzeg zzegVar = zzevVar.zza;
        this.zzc = zzegVar;
        zzegVar.zzh(12);
        int iZzH = zzegVar.zzH();
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.zzo)) {
            int iZzE = zzep.zzE(zzvVar.zzI) * zzvVar.zzG;
            if (iZzH == 0 || iZzH % iZzE != 0) {
                zzdt.zzc("BoxParsers", com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(iZzE, iZzH, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: ", new StringBuilder(String.valueOf(iZzE).length() + 66 + String.valueOf(iZzH).length())));
                iZzH = iZzE;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzegVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzH() : i10;
    }
}
