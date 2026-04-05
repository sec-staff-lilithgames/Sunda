package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbtz implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ zzbub zza;

    public zzbtz(zzbub zzbubVar) {
        Objects.requireNonNull(zzbubVar);
        this.zza = zzbubVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdB() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdC() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(int i10) {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is closed.");
        zzbub zzbubVar = this.zza;
        zzbubVar.zzb().onAdClosed(zzbubVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Opening AdMobCustomTabsAdapter overlay.");
        zzbub zzbubVar = this.zza;
        zzbubVar.zzb().onAdOpened(zzbubVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }
}
