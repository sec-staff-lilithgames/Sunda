package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdht implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.ads.internal.client.zza {
    private final zzdsq zza;
    private final zzffx zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzdht(zzdsq zzdsqVar, zzffx zzffxVar) {
        this.zza = zzdsqVar;
        this.zzb = zzffxVar;
    }

    private final void zzl() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(int i10) {
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        this.zza.zzb(this.zzb.zzb);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }
}
