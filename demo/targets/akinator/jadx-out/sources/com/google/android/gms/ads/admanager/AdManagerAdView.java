package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbwf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AdManagerAdView extends BaseAdView {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28828b = 0;

    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzd();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzf();
    }

    public VideoController getVideoController() {
        return this.zza.zzy();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzB();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbeu.zza(getContext());
        if (((Boolean) zzbgs.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzmi)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzg(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzi();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzn(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzp(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.zza.zzq(z10);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzA(videoOptions);
    }

    public final boolean zza(zzbx zzbxVar) {
        return this.zza.zzC(zzbxVar);
    }

    public final /* synthetic */ void zzb(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzg(adManagerAdRequest.zza());
        } catch (IllegalStateException e10) {
            zzbwf.zza(getContext()).zzh(e10, "AdManagerAdView.loadAd");
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
