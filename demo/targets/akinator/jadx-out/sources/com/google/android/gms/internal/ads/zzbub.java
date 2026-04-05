package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.y;
import androidx.browser.customtabs.z;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbub implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbfv.zza(context)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        z zVarBuild = new y().build();
        zVarBuild.f5302a.setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbua(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(zVarBuild.f5302a, null), null, new zzbtz(this), null, new VersionInfoParcel(0, 0, false), null, null, "")));
        com.google.android.gms.ads.internal.zzt.zzh().zzd();
    }

    public final /* synthetic */ Activity zza() {
        return this.zza;
    }

    public final /* synthetic */ MediationInterstitialListener zzb() {
        return this.zzb;
    }
}
