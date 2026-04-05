package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbki;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbux;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class AdLoader {
    private final zzq zza;
    private final Context zzb;
    private final zzbq zzc;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private final Context zza;
        private final zzbt zzb;

        public Builder(Context context, String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbt zzbtVarZzc = zzbb.zzb().zzc(context, str, new zzbrf());
            this.zza = context2;
            this.zzb = zzbtVarZzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzq.zza);
            } catch (RemoteException e10) {
                zzo.zzg("Failed to build AdLoader.", e10);
                return new AdLoader(this.zza, new zzfi().zzb(), zzq.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzk(new zzbkk(onAdManagerAdViewLoadedListener), new zzr(this.zza, adSizeArr));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add Google Ad Manager banner ad listener", e10);
                return this;
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbuv zzbuvVar = new zzbuv(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzi(str, zzbuvVar.zza(), zzbuvVar.zzb());
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add custom format ad listener", e10);
                return this;
            }
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzm(new zzbux(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add google native ad listener", e10);
                return this;
            }
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzf(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to set AdListener.", e10);
                return this;
            }
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzp(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to specify Ad Manager banner ad options", e10);
                return this;
            }
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new zzbhx(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zzb(), nativeAdOptions.zzc(), nativeAdOptions.zzd() - 1));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to specify native ad options", e10);
                return this;
            }
        }

        @Deprecated
        public final Builder zza(com.google.android.gms.ads.formats.zzg zzgVar) {
            try {
                this.zzb.zzm(new zzbkl(zzgVar));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add google native ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final Builder zzb(String str, com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
            zzbki zzbkiVar = new zzbki(zzeVar, zzdVar);
            try {
                this.zzb.zzi(str, zzbkiVar.zza(), zzbkiVar.zzb());
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to add custom template ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new zzbhx(nativeAdOptions));
                return this;
            } catch (RemoteException e10) {
                zzo.zzj("Failed to specify native ad options", e10);
                return this;
            }
        }
    }

    public AdLoader(Context context, zzbq zzbqVar, zzq zzqVar) {
        this.zzb = context;
        this.zzc = zzbqVar;
        this.zza = zzqVar;
    }

    private final void zzb(final zzek zzekVar) {
        Context context = this.zzb;
        zzbeu.zza(context);
        if (((Boolean) zzbgs.zzc.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzmi)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza(zzekVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zze(this.zza.zza(context, zzekVar));
        } catch (RemoteException e10) {
            zzo.zzg("Failed to load ad.", e10);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzg();
        } catch (RemoteException e10) {
            zzo.zzj("Failed to check if ad is loading.", e10);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(AdRequest adRequest, int i10) {
        try {
            this.zzc.zzi(this.zza.zza(this.zzb, adRequest.zza), i10);
        } catch (RemoteException e10) {
            zzo.zzg("Failed to load ads.", e10);
        }
    }

    public final /* synthetic */ void zza(zzek zzekVar) {
        try {
            this.zzc.zze(this.zza.zza(this.zzb, zzekVar));
        } catch (RemoteException e10) {
            zzo.zzg("Failed to load ad.", e10);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
