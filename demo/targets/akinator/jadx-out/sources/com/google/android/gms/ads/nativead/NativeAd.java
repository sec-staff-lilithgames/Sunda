package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class NativeAd {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class AdChoicesInfo {
        public abstract List<Image> getImages();

        public abstract CharSequence getText();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Image {
        protected Map zza;

        private Map<String, String> getImmersiveExtras() {
            return this.zza;
        }

        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnNativeAdLoadedListener {
        void onNativeAdLoaded(NativeAd nativeAd);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @Deprecated
    public abstract void enableCustomClickGesture();

    public abstract AdChoicesInfo getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract Image getIcon();

    public abstract List<Image> getImages();

    public abstract MediaContent getMediaContent();

    public abstract List<MuteThisAdReason> getMuteThisAdReasons();

    public abstract long getPlacementId();

    public abstract String getPrice();

    public abstract ResponseInfo getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(MuteThisAdReason muteThisAdReason);

    public abstract void performClick(Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    public abstract void recordEvent(Bundle bundle);

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setMuteThisAdListener(MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j10);

    public abstract void setUnconfirmedClickListener(UnconfirmedClickListener unconfirmedClickListener);

    public abstract Object zza();
}
