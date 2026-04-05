package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbim;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class NativeAdView extends FrameLayout {

    @NotOnlyInitialized
    private final FrameLayout zza;

    @NotOnlyInitialized
    private final zzbim zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(String str, View view) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null) {
            return;
        }
        try {
            zzbimVar.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setAssetView on delegate", e10);
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    private final zzbim zzf() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzbb.zzb().zze(frameLayout.getContext(), this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null) {
            return;
        }
        try {
            zzbimVar.zze();
        } catch (RemoteException e10) {
            zzo.zzg("Unable to destroy native ad view", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzmA)).booleanValue()) {
                try {
                    zzbimVar.zzdH(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null) {
            return;
        }
        try {
            zzbimVar.zzf(ObjectWrapper.wrap(view), i10);
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzd("3005", view);
    }

    public final void setBodyView(View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null) {
            return;
        }
        try {
            zzbimVar.zzg(ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        zzd("3001", view);
    }

    public final void setIconView(View view) {
        zzd("3003", view);
    }

    public final void setImageView(View view) {
        zzd("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzbhu() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zzbhu
            public final /* synthetic */ void zza(MediaContent mediaContent) {
                this.zza.zzb(mediaContent);
            }
        });
        mediaView.zzb(new zzbhw() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzbhw
            public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
                this.zza.zzc(scaleType);
            }
        });
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null) {
            return;
        }
        try {
            zzbimVar.zzd((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzd("3009", view);
    }

    public final void setStoreView(View view) {
        zzd("3006", view);
    }

    public final View zza(String str) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzc = zzbimVar.zzc(str);
                if (iObjectWrapperZzc != null) {
                    return (View) ObjectWrapper.unwrap(iObjectWrapperZzc);
                }
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfe) {
                zzbimVar.zzdI(((zzfe) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbimVar.zzdI(null);
            } else {
                zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setMediaContent on delegate", e10);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbim zzbimVar = this.zzb;
        if (zzbimVar == null || scaleType == null) {
            return;
        }
        try {
            zzbimVar.zzdG(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e10) {
            zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}
