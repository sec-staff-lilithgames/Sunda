package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcvo implements com.google.android.gms.ads.internal.client.zza {
    private final zzcvs zza;
    private final zzfgn zzb;

    public zzcvo(zzcvs zzcvsVar, zzfgn zzfgnVar) {
        this.zza = zzcvsVar;
        this.zzb = zzfgnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
