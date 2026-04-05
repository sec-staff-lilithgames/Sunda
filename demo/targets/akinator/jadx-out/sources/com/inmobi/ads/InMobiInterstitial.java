package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC2679a4;
import com.inmobi.media.AbstractC2901n6;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.C2788gb;
import com.inmobi.media.C2918o6;
import com.inmobi.media.C2925od;
import com.inmobi.media.C2942pd;
import com.inmobi.media.C3002t6;
import com.inmobi.media.C3019u6;
import com.inmobi.media.C5;
import com.inmobi.media.D5;
import com.inmobi.media.Y5;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiInterstitial {
    public static final D5 Companion = new D5();

    /* renamed from: a, reason: collision with root package name */
    public final Context f31561a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31562b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f31563c;

    /* renamed from: d, reason: collision with root package name */
    public final C2788gb f31564d;

    /* renamed from: e, reason: collision with root package name */
    public final a f31565e;

    /* renamed from: f, reason: collision with root package name */
    public final f f31566f;
    public C3019u6 mAdManager;
    public AbstractC2901n6 mPubListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends C3002t6 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiInterstitial interstitial) {
            super(interstitial);
            e0.checkNotNullParameter(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C3002t6, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3002t6, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AbstractC2901n6 mPubListener$media_release;
            e0.checkNotNullParameter(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f33387a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3002t6, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            e0.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f33387a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().D();
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    e0.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC2902n7.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(Context context, long j10, InterstitialAdEventListener listener) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(listener, "listener");
        C2788gb c2788gb = new C2788gb();
        this.f31564d = c2788gb;
        this.f31565e = new a(this);
        this.f31566f = new f(this);
        if (!C2925od.q()) {
            e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f31561a = applicationContext;
        c2788gb.f32882a = j10;
        this.f31563c = new WeakReference(context);
        setMPubListener$media_release(new C2918o6(listener));
        setMAdManager$media_release(new C3019u6());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    @tu.f
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void disableHardwareAcceleration() {
        this.f31564d.f32885d = true;
    }

    public final C3019u6 getMAdManager$media_release() {
        C3019u6 c3019u6 = this.mAdManager;
        if (c3019u6 != null) {
            return c3019u6;
        }
        e0.throwUninitializedPropertyAccessException("mAdManager");
        return null;
    }

    public final AbstractC2901n6 getMPubListener$media_release() {
        AbstractC2901n6 abstractC2901n6 = this.mPubListener;
        if (abstractC2901n6 != null) {
            return abstractC2901n6;
        }
        e0.throwUninitializedPropertyAccessException("mPubListener");
        return null;
    }

    public final PreloadManager getPreloadManager() {
        return this.f31566f;
    }

    @tu.f
    public final void getSignals() {
        this.f31564d.f32886e = "AB";
        C3019u6 mAdManager$media_release = getMAdManager$media_release();
        C2788gb c2788gb = this.f31564d;
        Context context = this.f31561a;
        if (context == null) {
            e0.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(c2788gb, context, false, "getToken");
        getMAdManager$media_release().a(this.f31565e);
    }

    public final boolean isReady() {
        boolean zB = getMAdManager$media_release().B();
        if (!zB) {
            getMAdManager$media_release().E();
        }
        return zB;
    }

    public final void load(byte[] bArr) {
        this.f31562b = true;
        this.f31564d.f32886e = "AB";
        C3019u6 mAdManager$media_release = getMAdManager$media_release();
        C2788gb c2788gb = this.f31564d;
        Context context = this.f31561a;
        if (context == null) {
            e0.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        C3019u6.a(mAdManager$media_release, c2788gb, context, false, null, 12, null);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2679a4.b((Context) this.f31563c.get());
        }
        getMAdManager$media_release().a(bArr, this.f31565e);
    }

    public final void loadAdUnit() {
        getMAdManager$media_release().c(this.f31565e);
    }

    public final void notifyLoss(int i10, double d10) {
        if (this.mAdManager == null) {
            AbstractC2902n7.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        String strA = getMAdManager$media_release().a(i10, d10);
        if (strA != null) {
            AbstractC2902n7.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double d10) {
        if (this.mAdManager == null) {
            AbstractC2902n7.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        String strA = getMAdManager$media_release().a(d10);
        if (strA != null) {
            AbstractC2902n7.a((byte) 1, "InMobi", strA);
        }
    }

    public final void setContentUrl(String contentUrl) {
        e0.checkNotNullParameter(contentUrl, "contentUrl");
        this.f31564d.f32887f = contentUrl;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C2942pd.a(map.get("tp"));
            C2942pd.b(map.get("tp-v"));
        }
        this.f31564d.f32884c = map;
    }

    public final void setKeywords(String str) {
        this.f31564d.f32883b = str;
    }

    public final void setListener(InterstitialAdEventListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        setMPubListener$media_release(new C2918o6(listener));
    }

    public final void setMAdManager$media_release(C3019u6 c3019u6) {
        e0.checkNotNullParameter(c3019u6, "<set-?>");
        this.mAdManager = c3019u6;
    }

    public final void setMPubListener$media_release(AbstractC2901n6 abstractC2901n6) {
        e0.checkNotNullParameter(abstractC2901n6, "<set-?>");
        this.mPubListener = abstractC2901n6;
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        e0.checkNotNullParameter(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    public final void show(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            a(context);
            return;
        }
        e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
        AbstractC2902n7.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
        a(null);
    }

    public final void a(Context context) {
        try {
            if (this.f31562b) {
                getMAdManager$media_release().a(context);
            } else {
                e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
                AbstractC2902n7.a((byte) 1, "InMobiInterstitial", SFPXhf.vtmTDcZUVs);
            }
        } catch (Exception e10) {
            e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            AbstractC2902n7.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void show() {
        a(null);
    }

    public final void load() {
        try {
            this.f31562b = true;
            this.f31564d.f32886e = "NonAB";
            C3019u6 mAdManager$media_release = getMAdManager$media_release();
            C2788gb c2788gb = this.f31564d;
            Context context = this.f31561a;
            if (context == null) {
                e0.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            C3019u6.a(mAdManager$media_release, c2788gb, context, false, null, 12, null);
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC2679a4.b((Context) this.f31563c.get());
            }
            loadAdUnit();
        } catch (Exception e10) {
            e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            AbstractC2902n7.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            e0.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
