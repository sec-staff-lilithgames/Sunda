package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC2679a4;
import com.inmobi.media.AbstractC2751e8;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.C2768f8;
import com.inmobi.media.C2769f9;
import com.inmobi.media.C2788gb;
import com.inmobi.media.C2886m8;
import com.inmobi.media.C2925od;
import com.inmobi.media.C2942pd;
import com.inmobi.media.C3078xe;
import com.inmobi.media.C5;
import com.inmobi.media.F5;
import com.inmobi.media.G5;
import com.inmobi.media.R8;
import com.inmobi.media.Y5;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiNative {
    public static final Companion Companion = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final String f31572j = "InMobiNative";

    /* renamed from: a, reason: collision with root package name */
    public final C2769f9 f31573a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCallbacks f31574b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC2751e8 f31575c;

    /* renamed from: d, reason: collision with root package name */
    public VideoEventListener f31576d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f31577e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31578f;

    /* renamed from: g, reason: collision with root package name */
    public final C2788gb f31579g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f31580h;

    /* renamed from: i, reason: collision with root package name */
    public LockScreenListener f31581i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public Companion(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    public InMobiNative(Context context, long j10, NativeAdEventListener listener) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(listener, "listener");
        C2788gb c2788gb = new C2788gb();
        this.f31579g = c2788gb;
        if (!C2925od.q()) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            throw new SdkNotInitializedException(TAG);
        }
        c2788gb.f32882a = j10;
        this.f31580h = new WeakReference(context);
        this.f31575c = new C2768f8(listener);
        NativeCallbacks nativeCallbacks = new NativeCallbacks(this);
        this.f31574b = nativeCallbacks;
        this.f31573a = new C2769f9(nativeCallbacks);
    }

    public final boolean a(boolean z10) {
        if (!z10 && this.f31575c == null) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Listener supplied is null, your call is ignored.");
            return false;
        }
        if (this.f31580h.get() != null) {
            return true;
        }
        String TAG2 = f31572j;
        e0.checkNotNullExpressionValue(TAG2, "TAG");
        AbstractC2902n7.a((byte) 1, TAG2, "Context supplied is null, your call is ignored.");
        return false;
    }

    public final void destroy() {
        View view;
        try {
            WeakReference weakReference = this.f31577e;
            if (weakReference == null) {
                view = null;
            } else {
                e0.checkNotNull(weakReference);
                view = (View) weakReference.get();
            }
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f31573a.x();
            this.f31575c = null;
            this.f31576d = null;
            this.f31578f = false;
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Failed to destroy ad; SDK encountered an unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final String getAdCtaText() {
        try {
            return this.f31573a.y();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get the ctaText; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final String getAdDescription() {
        try {
            return this.f31573a.z();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get the description; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final String getAdIconUrl() {
        try {
            return this.f31573a.A();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get the iconUrl; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final String getAdLandingPageUrl() {
        try {
            return this.f31573a.B();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f31573a.C();
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            AbstractC2902n7.a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            return 0.0f;
        }
    }

    public final String getAdTitle() {
        try {
            return this.f31573a.D();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get the ad title; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final JSONObject getCustomAdContent() {
        try {
            return this.f31573a.E();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get the ad customJson ; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final AbstractC2751e8 getMPubListener() {
        return this.f31575c;
    }

    public final View getPrimaryViewOfWidth(Context context, View view, ViewGroup viewGroup, int i10) {
        try {
            if (context == null) {
                String TAG = f31572j;
                e0.checkNotNullExpressionValue(TAG, "TAG");
                AbstractC2902n7.a((byte) 1, TAG, "View can not be rendered using null context");
                return null;
            }
            C2886m8 c2886m8 = this.f31573a.j() == null ? null : (C2886m8) this.f31573a.j();
            if (c2886m8 == null) {
                String TAG2 = f31572j;
                e0.checkNotNullExpressionValue(TAG2, "TAG");
                AbstractC2902n7.a((byte) 1, TAG2, "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()");
                return null;
            }
            this.f31580h = new WeakReference(context);
            c2886m8.a(context);
            e0.checkNotNull(viewGroup);
            WeakReference weakReference = new WeakReference(c2886m8.a(view, viewGroup, i10));
            this.f31577e = weakReference;
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                this.f31578f = true;
                return view2;
            }
            String TAG3 = f31572j;
            e0.checkNotNullExpressionValue(TAG3, "TAG");
            return null;
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            AbstractC2902n7.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            String TAG4 = f31572j;
            e0.checkNotNullExpressionValue(TAG4, "TAG");
            return null;
        }
    }

    @tu.f
    public final void getSignals() {
        if (a(false)) {
            this.f31574b.resetHasGivenCallbackFlag();
            Context context = (Context) this.f31580h.get();
            if (context != null) {
                this.f31573a.a(this.f31579g, context, false, "getToken");
            }
            this.f31573a.a(this.f31574b);
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f31573a.G();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get isAppDownload; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return false;
        }
    }

    public final boolean isReady() {
        return this.f31573a.F();
    }

    public final Boolean isVideo() {
        try {
            return this.f31573a.I();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not get isVideo; SDK encountered unexpected error");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        }
    }

    public final void load(byte[] bArr) {
        if (a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC2679a4.b((Context) this.f31580h.get());
            }
            this.f31579g.f32886e = "AB";
            Context context = (Context) this.f31580h.get();
            if (context != null) {
                this.f31573a.a(this.f31579g, context, true, "native");
            }
            this.f31574b.resetHasGivenCallbackFlag();
            this.f31573a.a(bArr, this.f31574b);
        }
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = this.f31573a.a(i10, d10);
        if (strA != null) {
            AbstractC2902n7.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = this.f31573a.a(d10);
        if (strA != null) {
            AbstractC2902n7.a((byte) 1, "InMobi", strA);
        }
    }

    public final void pause() {
        try {
            this.f31573a.K();
        } catch (Exception unused) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not pause ad; SDK encountered an unexpected error");
            e0.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f31573a.L();
        } catch (Exception e10) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            e0.checkNotNullExpressionValue(TAG, "TAG");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void resume() {
        try {
            this.f31573a.M();
        } catch (Exception unused) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "Could not resume ad; SDK encountered an unexpected error");
            e0.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    public final void setContentUrl(String str) {
        this.f31579g.f32887f = str;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C2942pd.a(map.get("tp"));
            C2942pd.b(map.get("tp-v"));
        }
        this.f31579g.f32884c = map;
    }

    public final void setKeywords(String str) {
        this.f31579g.f32883b = str;
    }

    public final void setListener(NativeAdEventListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f31575c = new C2768f8(listener);
    }

    public final void setMPubListener(AbstractC2751e8 abstractC2751e8) {
        this.f31575c = abstractC2751e8;
    }

    public final void setPrimaryViewReturned(boolean z10) {
        this.f31578f = z10;
    }

    public final void setVideoEventListener(VideoEventListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f31576d = listener;
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        e0.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        if (this.f31580h.get() == null) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            C2769f9 c2769f9 = this.f31573a;
            C2788gb c2788gb = this.f31579g;
            Object obj = this.f31580h.get();
            e0.checkNotNull(obj);
            c2769f9.a(c2788gb, (Context) obj);
            this.f31581i = lockScreenListener;
        } catch (Exception unused) {
            String TAG2 = f31572j;
            e0.checkNotNullExpressionValue(TAG2, "TAG");
            AbstractC2902n7.a((byte) 1, TAG2, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f31573a.N();
        } catch (Exception unused) {
            String TAG = f31572j;
            e0.checkNotNullExpressionValue(TAG, "TAG");
            AbstractC2902n7.a((byte) 1, TAG, "SDK encountered unexpected error in takeAction");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NativeCallbacks extends R8 {

        /* renamed from: b, reason: collision with root package name */
        private boolean f31582b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeCallbacks(InMobiNative inMobiNative) {
            super(inMobiNative);
            e0.checkNotNullParameter(inMobiNative, "inMobiNative");
            this.f31582b = true;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdClicked(Map<Object, ? extends Object> params) {
            e0.checkNotNullParameter(params, "params");
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = ad2.getMPubListener();
                if (mPubListener != null) {
                    e0.checkNotNullParameter(ad2, "ad");
                    ((C2768f8) mPubListener).f32839a.onAdClicked(ad2);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDismissed() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = ad2.getMPubListener();
                if (mPubListener != null) {
                    e0.checkNotNullParameter(ad2, "ad");
                    ((C2768f8) mPubListener).f32839a.onAdFullScreenDismissed(ad2);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDisplayed(AdMetaInfo info) {
            e0.checkNotNullParameter(info, "info");
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = ad2.getMPubListener();
                if (mPubListener != null) {
                    e0.checkNotNullParameter(ad2, "ad");
                    ((C2768f8) mPubListener).f32839a.onAdFullScreenDisplayed(ad2);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            e0.checkNotNullParameter(status, "status");
            onAdLoadFailed(status);
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            e0.checkNotNullParameter(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.a(inMobiNative, info);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpressed() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = ad2.getMPubListener();
                if (mPubListener != null) {
                    e0.checkNotNullParameter(ad2, "ad");
                    ((C2768f8) mPubListener).f32839a.onAdImpressed(ad2);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpression(C3078xe c3078xe) {
            InMobiNative inMobiNative = getNativeRef().get();
            AbstractC2751e8 mPubListener = inMobiNative != null ? inMobiNative.getMPubListener() : null;
            if (mPubListener != null) {
                mPubListener.a(inMobiNative);
                if (c3078xe != null) {
                    c3078xe.d();
                    return;
                }
                return;
            }
            String str = InMobiNative.f31572j;
            e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            if (c3078xe != null) {
                c3078xe.c();
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadFailed(InMobiAdRequestStatus status) {
            e0.checkNotNullParameter(status, "status");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                if (this.f31582b) {
                    return;
                }
                this.f31582b = true;
                AbstractC2751e8 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.a(inMobiNative, status);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadSucceeded(AdMetaInfo info) {
            e0.checkNotNullParameter(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                if (this.f31582b) {
                    return;
                }
                this.f31582b = true;
                AbstractC2751e8 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.b(inMobiNative, info);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdWillDisplay() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = ad2.f31581i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(ad2);
            }
            AbstractC2751e8 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                e0.checkNotNullParameter(ad2, "ad");
                ((C2768f8) mPubListener).f32839a.onAdFullScreenWillDisplay(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAudioStateChanged(boolean z10) {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                VideoEventListener videoEventListener = inMobiNative.f31576d;
                if (videoEventListener != null) {
                    videoEventListener.onAudioStateChanged(inMobiNative, z10);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreated(byte[] request) {
            e0.checkNotNullParameter(request, "request");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    ((C2768f8) mPubListener).f32839a.onRequestPayloadCreated(request);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
            e0.checkNotNullParameter(status, "reason");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                AbstractC2751e8 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    e0.checkNotNullParameter(status, "status");
                    ((C2768f8) mPubListener).f32839a.onRequestPayloadCreationFailed(status);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoCompleted() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                VideoEventListener videoEventListener = inMobiNative.f31576d;
                if (videoEventListener != null) {
                    videoEventListener.onVideoCompleted(inMobiNative);
                }
            }
        }

        public final void resetHasGivenCallbackFlag() {
            this.f31582b = false;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onUserLeftApplication() {
            InMobiNative ad2 = getNativeRef().get();
            if (ad2 == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                AbstractC2902n7.a((byte) 1, str, yFkbx.xCoYsvdUHojkz);
                return;
            }
            LockScreenListener lockScreenListener = ad2.f31581i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(ad2);
            }
            AbstractC2751e8 mPubListener = ad2.getMPubListener();
            if (mPubListener != null) {
                e0.checkNotNullParameter(ad2, "ad");
                ((C2768f8) mPubListener).f32839a.onUserWillLeaveApplication(ad2);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoSkipped() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f31572j;
                e0.checkNotNullExpressionValue(str, VPCjETNfjxu.wfCMjMhN);
                AbstractC2902n7.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else {
                VideoEventListener videoEventListener = inMobiNative.f31576d;
                if (videoEventListener != null) {
                    videoEventListener.onVideoSkipped(inMobiNative);
                }
            }
        }
    }

    public final void load() {
        try {
            if (a(true)) {
                this.f31574b.resetHasGivenCallbackFlag();
                if (this.f31578f) {
                    C2769f9 c2769f9 = this.f31573a;
                    c2769f9.a(c2769f9.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    String TAG = f31572j;
                    e0.checkNotNullExpressionValue(TAG, "TAG");
                    AbstractC2902n7.a((byte) 1, TAG, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC2679a4.b((Context) this.f31580h.get());
                }
                this.f31579g.f32886e = "NonAB";
                Context context = (Context) this.f31580h.get();
                if (context != null) {
                    this.f31573a.a(this.f31579g, context, true, "native");
                }
                this.f31573a.J();
            }
        } catch (Exception e10) {
            this.f31573a.a((short) 2192);
            AbstractC2751e8 abstractC2751e8 = this.f31575c;
            if (abstractC2751e8 != null) {
                abstractC2751e8.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            F5 f5P = this.f31573a.p();
            if (f5P != null) {
                String TAG2 = f31572j;
                e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f5P).a(TAG2, "Load failed with unexpected error: ", e10);
            }
        }
    }

    public final void load(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (a(true)) {
            this.f31580h = new WeakReference(context);
            load();
        }
    }
}
