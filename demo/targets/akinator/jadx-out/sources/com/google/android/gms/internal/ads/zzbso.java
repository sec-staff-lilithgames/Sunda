package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbso extends zzbrx {
    private final NativeAdMapper zza;

    public zzbso(NativeAdMapper nativeAdMapper) {
        this.zza = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final float zzA() {
        return this.zza.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final float zzB() {
        return this.zza.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzC() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final String zze() {
        return this.zza.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final List zzf() {
        List<NativeAd.Image> images = this.zza.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbht(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final String zzg() {
        return this.zza.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final zzbii zzh() {
        NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new zzbht(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final String zzi() {
        return this.zza.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final String zzj() {
        return this.zza.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final double zzk() {
        NativeAdMapper nativeAdMapper = this.zza;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final String zzl() {
        return this.zza.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final String zzm() {
        return this.zza.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final com.google.android.gms.ads.internal.client.zzed zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final zzbib zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final IObjectWrapper zzp() {
        View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final IObjectWrapper zzq() {
        View viewZza = this.zza.zza();
        if (viewZza == null) {
            return null;
        }
        return ObjectWrapper.wrap(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final IObjectWrapper zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final Bundle zzs() {
        return this.zza.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final boolean zzt() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final boolean zzu() {
        return this.zza.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzv() {
        this.zza.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zza.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        HashMap map = (HashMap) ObjectWrapper.unwrap(iObjectWrapper2);
        HashMap map2 = (HashMap) ObjectWrapper.unwrap(iObjectWrapper3);
        this.zza.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzy(IObjectWrapper iObjectWrapper) {
        this.zza.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final float zzz() {
        return this.zza.getMediaContentAspectRatio();
    }
}
