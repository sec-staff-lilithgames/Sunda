package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbuv {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbuv(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized NativeCustomFormatAd zzc(zzbjc zzbjcVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbuw zzbuwVar = new zzbuw(zzbjcVar);
        this.zzc = zzbuwVar;
        return zzbuwVar;
    }

    public final zzbjp zza() {
        return new zzbuu(this, null);
    }

    public final zzbjm zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbut(this, null);
    }

    public final /* synthetic */ NativeCustomFormatAd.OnCustomFormatAdLoadedListener zzd() {
        return this.zza;
    }

    public final /* synthetic */ NativeCustomFormatAd.OnCustomClickListener zze() {
        return this.zzb;
    }
}
