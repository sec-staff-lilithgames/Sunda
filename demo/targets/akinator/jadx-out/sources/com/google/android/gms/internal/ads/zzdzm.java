package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdzm {
    private AdRequest zza;
    private NativeAdOptions zzb;
    private VideoOptions zzc;
    private AdSize zzd = AdSize.BANNER;
    private String zze = "";
    private String zzf = "";
    private boolean zzg = false;

    public zzdzm() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.zza = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final AdRequest zzc() {
        return this.zza;
    }

    public final AdSize zzd() {
        return this.zzd;
    }

    public final NativeAdOptions zze() {
        return this.zzb;
    }

    public final VideoOptions zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final void zzh(String str) {
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zzf = str;
    }

    public final void zzj(AdRequest adRequest) {
        this.zza = adRequest;
    }

    public final void zzk(AdSize adSize) {
        this.zzd = adSize;
    }

    public final void zzl(NativeAdOptions nativeAdOptions) {
        this.zzb = nativeAdOptions;
    }

    public final void zzm(VideoOptions videoOptions) {
        this.zzc = videoOptions;
    }

    public final void zzn(boolean z10) {
        this.zzg = z10;
    }
}
