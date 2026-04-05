package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbsk extends zzbrl {
    private final Object zza;
    private zzbsm zzb;
    private zzbyg zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbsk(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzw();
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.zzu;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzA(boolean z10) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final com.google.android.gms.ads.internal.client.zzed zzB() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbry zzC() {
        UnifiedNativeAdMapper unifiedNativeAdMapperZzb;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbsm zzbsmVar = this.zzb;
            if (zzbsmVar == null || (unifiedNativeAdMapperZzb = zzbsmVar.zzb()) == null) {
                return null;
            }
            return new zzbsq(unifiedNativeAdMapperZzb);
        }
        if (!(obj instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new zzbso(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new zzbsq(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbrp zzbrpVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbsi(this, zzbrpVar));
                return;
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                zzbrg.zza(iObjectWrapper, e10, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e10) {
            zzbrg.zza(iObjectWrapper, e10, "adapter.rewarded.showAd");
            throw e10;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzF(IObjectWrapper iObjectWrapper, zzboa zzboaVar, List list) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbsd zzbsdVar = new zzbsd(this, zzboaVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbog zzbogVar = (zzbog) it.next();
            String str = zzbogVar.zza;
            AdFormat adFormat = null;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    }
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmQ)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbogVar.zzb));
            }
        }
        ((Adapter) obj).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbsdVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbrp zzbrpVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbsi(this, zzbrpVar));
                return;
            } catch (Exception e10) {
                zzbrg.zza(iObjectWrapper, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbtx zzH() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbtx.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbtx zzI() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbtx.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbrp zzbrpVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) obj;
            zzbsc zzbscVar = new zzbsc(this, zzbrpVar, adapter);
            zzV(str, zzmVar, str2);
            zzW(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.zzk;
            zzY(str, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            zzbscVar.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            zzbrg.zza(iObjectWrapper, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbrs zzK() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbsl(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            com.google.android.gms.internal.play_billing.a.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzh();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e10) {
            zzbrg.zza(iObjectWrapper, e10, "adapter.interstitial.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbrp zzbrpVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) obj).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbsj(this, zzbrpVar));
                return;
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                zzbrg.zza(iObjectWrapper, e10, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e10) {
            zzbrg.zza(iObjectWrapper, e10, "adapter.appOpen.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbru zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbrv zzP() {
        return null;
    }

    public final /* synthetic */ void zzQ(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzg = unifiedNativeAdMapper;
    }

    public final /* synthetic */ void zzR(NativeAdMapper nativeAdMapper) {
        this.zzh = nativeAdMapper;
    }

    public final /* synthetic */ void zzS(MediationRewardedAd mediationRewardedAd) {
        this.zzi = mediationRewardedAd;
    }

    public final /* synthetic */ void zzT(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zzj = mediationInterscrollerAd;
    }

    public final /* synthetic */ void zzU(MediationAppOpenAd mediationAppOpenAd) {
        this.zzk = mediationAppOpenAd;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    public final /* synthetic */ void zzd(MediationInterstitialAd mediationInterstitialAd) {
        this.zzf = mediationInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbrp zzbrpVar) throws RemoteException {
        zzj(iObjectWrapper, zzrVar, zzmVar, str, null, zzbrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final IObjectWrapper zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        com.google.android.gms.internal.play_billing.a.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbrp zzbrpVar) throws RemoteException {
        zzk(iObjectWrapper, zzmVar, str, null, zzbrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbrp zzbrpVar) throws RemoteException {
        String str3;
        MediationBannerAdapter mediationBannerAdapter;
        zzbsb zzbsbVar;
        Bundle bundle;
        Object obj = this.zza;
        boolean z10 = obj instanceof MediationBannerAdapter;
        if (!z10 && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            com.google.android.gms.internal.play_billing.a.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting banner ad from adapter.");
        AdSize adSizeZzb = zzrVar.zzn ? com.google.android.gms.ads.zzc.zzb(zzrVar.zze, zzrVar.zzb) : com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z10) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), adSizeZzb, this.zzl), new zzbse(this, zzbrpVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                    zzbrg.zza(iObjectWrapper, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzmVar.zzb;
            zzbsbVar = new zzbsb(j10 == -1 ? null : new Date(j10), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle2 = zzmVar.zzm;
            bundle = bundle2 != null ? bundle2.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            str3 = "";
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
        try {
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbsm(zzbrpVar), zzV(str, zzmVar, str2), adSizeZzb, zzbsbVar, bundle);
        } catch (Throwable th4) {
            th = th4;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(str3, th);
            zzbrg.zza(iObjectWrapper, th, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbrp zzbrpVar) throws RemoteException {
        Object obj = this.zza;
        boolean z10 = obj instanceof MediationInterstitialAdapter;
        if (!z10 && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            com.google.android.gms.internal.play_billing.a.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z10) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new zzbsf(this, zzbrpVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                    zzbrg.zza(iObjectWrapper, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzmVar.zzb;
            zzbsb zzbsbVar = new zzbsb(j10 == -1 ? null : new Date(j10), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbsm(zzbrpVar), zzV(str, zzmVar, str2), zzbsbVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
            zzbrg.zza(iObjectWrapper, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbyg zzbygVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbygVar;
            zzbygVar.zze(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzv(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } catch (RuntimeException e10) {
                zzbrg.zza(this.zzd, e10, "adapter.showVideo");
                throw e10;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbrp zzbrpVar, zzbhx zzbhxVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z10 = obj instanceof MediationNativeAdapter;
        if (!z10 && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            com.google.android.gms.internal.play_billing.a.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting native ad from adapter.");
        if (z10) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = zzmVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j10 = zzmVar.zzb;
                zzbsp zzbspVar = new zzbsp(j10 == -1 ? null : new Date(j10), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbhxVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbsm(zzbrpVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzmVar, str2), zzbspVar, bundle2);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                zzbrg.zza(iObjectWrapper, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbhxVar), new zzbsh(this, zzbrpVar));
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
                zzbrg.zza(iObjectWrapper, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbhxVar), new zzbsg(this, zzbrpVar));
                } catch (Throwable th4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th4);
                    zzbrg.zza(iObjectWrapper, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzD(this.zzd, zzmVar, str, new zzbsn((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzy(IObjectWrapper iObjectWrapper, zzbyg zzbygVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbjc zzz() {
        zzbjd zzbjdVarZze;
        zzbsm zzbsmVar = this.zzb;
        if (zzbsmVar == null || (zzbjdVarZze = zzbsmVar.zze()) == null) {
            return null;
        }
        return zzbjdVarZze.zza();
    }

    public zzbsk(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
