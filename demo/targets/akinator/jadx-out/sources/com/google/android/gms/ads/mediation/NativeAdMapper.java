package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class NativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd.Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private View zzk;
    private View zzl;
    private Bundle zzm = new Bundle();
    private boolean zzn;
    private boolean zzo;
    private float zzp;

    public View getAdChoicesContent() {
        return this.zzk;
    }

    public final String getAdvertiser() {
        return this.zzf;
    }

    public final String getBody() {
        return this.zzc;
    }

    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.zzm;
    }

    public final String getHeadline() {
        return this.zza;
    }

    public final NativeAd.Image getIcon() {
        return this.zzd;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzp;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzo;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzn;
    }

    public final String getPrice() {
        return this.zzi;
    }

    public final Double getStarRating() {
        return this.zzg;
    }

    public final String getStore() {
        return this.zzh;
    }

    public boolean hasVideoContent() {
        return this.zzj;
    }

    public void setAdChoicesContent(View view) {
        this.zzk = view;
    }

    public final void setAdvertiser(String str) {
        this.zzf = str;
    }

    public final void setBody(String str) {
        this.zzc = str;
    }

    public final void setCallToAction(String str) {
        this.zze = str;
    }

    public final void setExtras(Bundle bundle) {
        this.zzm = bundle;
    }

    public void setHasVideoContent(boolean z10) {
        this.zzj = z10;
    }

    public final void setHeadline(String str) {
        this.zza = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.zzp = f10;
    }

    public void setMediaView(View view) {
        this.zzl = view;
    }

    public final void setOverrideClickHandling(boolean z10) {
        this.zzo = z10;
    }

    public final void setOverrideImpressionRecording(boolean z10) {
        this.zzn = z10;
    }

    public final void setPrice(String str) {
        this.zzi = str;
    }

    public final void setStarRating(Double d10) {
        this.zzg = d10;
    }

    public final void setStore(String str) {
        this.zzh = str;
    }

    public final View zza() {
        return this.zzl;
    }

    public void destroy() {
    }

    public void recordImpression() {
    }

    public void handleClick(View view) {
    }

    public void untrackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }
}
