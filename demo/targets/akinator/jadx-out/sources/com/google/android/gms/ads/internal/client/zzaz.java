package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbwh;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcas;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaz {
    private final zzk zza;
    private final zzi zzb;
    private final zzff zzc;
    private final zzbke zzd;
    private final zzbvf zze;
    private final zzbkf zzf;
    private zzbwh zzg;
    private final zzl zzh;

    public zzaz(zzk zzkVar, zzi zziVar, zzff zzffVar, zzbke zzbkeVar, zzbza zzbzaVar, zzbvf zzbvfVar, zzbkf zzbkfVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzffVar;
        this.zzd = zzbkeVar;
        this.zze = zzbvfVar;
        this.zzf = zzbkfVar;
        this.zzh = zzlVar;
    }

    public static /* synthetic */ void zzm(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbb.zza().zzh(context, zzbb.zzd().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbx zza(Context context, zzr zzrVar, String str, zzbrj zzbrjVar) {
        return (zzbx) new zzam(this, context, zzrVar, str, zzbrjVar).zzd(context, false);
    }

    public final zzbx zzb(Context context, zzr zzrVar, String str, zzbrj zzbrjVar) {
        return (zzbx) new zzao(this, context, zzrVar, str, zzbrjVar).zzd(context, false);
    }

    public final zzbt zzc(Context context, String str, zzbrj zzbrjVar) {
        return (zzbt) new zzaq(this, context, str, zzbrjVar).zzd(context, false);
    }

    public final zzck zzd(Context context, zzbrj zzbrjVar) {
        return (zzck) new zzas(this, context, zzbrjVar).zzd(context, false);
    }

    public final zzbim zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbim) new zzaw(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbis zzf(View view, HashMap map, HashMap map2) {
        return (zzbis) new zzay(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzbyo zzg(Context context, String str, zzbrj zzbrjVar) {
        return (zzbyo) new zzaa(this, context, str, zzbrjVar).zzd(context, false);
    }

    public final zzbvi zzh(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzbvi) zzacVar.zzd(activity, booleanExtra);
    }

    public final zzdw zzi(Context context, zzbrj zzbrjVar) {
        return (zzdw) new zzae(this, context, zzbrjVar).zzd(context, false);
    }

    public final zzcas zzj(Context context, zzbrj zzbrjVar) {
        return (zzcas) new zzag(this, context, zzbrjVar).zzd(context, false);
    }

    public final zzbvb zzk(Context context, zzbrj zzbrjVar) {
        return (zzbvb) new zzai(this, context, zzbrjVar).zzd(context, false);
    }

    public final zzbna zzl(Context context, zzbrj zzbrjVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbna) new zzak(this, context, zzbrjVar, onH5AdsEventListener).zzd(context, false);
    }

    public final /* synthetic */ zzk zzn() {
        return this.zza;
    }

    public final /* synthetic */ zzi zzo() {
        return this.zzb;
    }

    public final /* synthetic */ zzff zzp() {
        return this.zzc;
    }

    public final /* synthetic */ zzbke zzq() {
        return this.zzd;
    }

    public final /* synthetic */ zzbvf zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzbkf zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzbwh zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(zzbwh zzbwhVar) {
        this.zzg = zzbwhVar;
    }

    public final /* synthetic */ zzl zzv() {
        return this.zzh;
    }
}
