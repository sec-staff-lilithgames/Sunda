package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcuj implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzczv zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcuj(zzczv zzczvVar) {
        this.zza = zzczvVar;
    }

    private final void zzm() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
        zzm();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(int i10) {
        this.zzb.set(true);
        zzm();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        this.zza.zzc();
    }

    public final boolean zzl() {
        return this.zzb.get();
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
