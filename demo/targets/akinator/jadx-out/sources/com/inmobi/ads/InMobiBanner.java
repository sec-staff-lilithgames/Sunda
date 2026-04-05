package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import bp.oM.DwaEpyvxz;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.A5;
import com.inmobi.media.AbstractC2679a4;
import com.inmobi.media.AbstractC2875le;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.C2696b4;
import com.inmobi.media.C2788gb;
import com.inmobi.media.C2925od;
import com.inmobi.media.C2942pd;
import com.inmobi.media.C3086y5;
import com.inmobi.media.C3103z5;
import com.inmobi.media.D2;
import com.inmobi.media.F1;
import com.inmobi.media.F5;
import com.inmobi.media.G5;
import com.inmobi.media.J1;
import com.inmobi.media.K1;
import com.inmobi.media.Q1;
import com.inmobi.media.R1;
import com.inmobi.media.T1;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.e0;
import on.z;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiBanner extends RelativeLayout {
    public static final C3086y5 Companion = new C3086y5();

    /* renamed from: a, reason: collision with root package name */
    public J1 f31546a;

    /* renamed from: b, reason: collision with root package name */
    public AudioListener f31547b;

    /* renamed from: c, reason: collision with root package name */
    public F1 f31548c;

    /* renamed from: d, reason: collision with root package name */
    public T1 f31549d;

    /* renamed from: e, reason: collision with root package name */
    public final a f31550e;

    /* renamed from: f, reason: collision with root package name */
    public int f31551f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31552g;

    /* renamed from: h, reason: collision with root package name */
    public final R1 f31553h;

    /* renamed from: i, reason: collision with root package name */
    public int f31554i;

    /* renamed from: j, reason: collision with root package name */
    public int f31555j;

    /* renamed from: k, reason: collision with root package name */
    public AnimationType f31556k;

    /* renamed from: l, reason: collision with root package name */
    public long f31557l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f31558m;

    /* renamed from: n, reason: collision with root package name */
    public final C2788gb f31559n;

    /* renamed from: o, reason: collision with root package name */
    public final e f31560o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AnimationType {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = cv.b.enumEntries(animationTypeArr$values);
        }

        private AnimationType(String str, int i10) {
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends Q1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiBanner banner) {
            super(banner);
            e0.checkNotNullParameter(banner, "banner");
        }

        @Override // com.inmobi.media.Q1, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.Q1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            e0.checkNotNullParameter(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            J1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.Q1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            e0.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    T1 mAdManager$media_release = inMobiBanner.getMAdManager$media_release();
                    if (mAdManager$media_release != null) {
                        mAdManager$media_release.G();
                    }
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    e0.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC2902n7.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    J1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                    if (mPubListener$media_release != null) {
                        mPubListener$media_release.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InMobiBanner(android.content.Context r14, android.util.AttributeSet r15) throws java.lang.IllegalStateException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiBanner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final boolean access$checkForRefreshRate(InMobiBanner inMobiBanner) {
        T1 t12;
        long j10 = inMobiBanner.f31557l;
        if (j10 != 0 && (t12 = inMobiBanner.f31549d) != null && !t12.a(j10)) {
            return false;
        }
        inMobiBanner.f31557l = SystemClock.elapsedRealtime();
        return true;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31554i);
        sb2.append('x');
        sb2.append(this.f31555j);
        return sb2.toString();
    }

    @tu.f
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final boolean a(boolean z10) {
        F5 f5P;
        F5 f5P2;
        T1 t12 = this.f31549d;
        if (t12 != null && (f5P2 = t12.p()) != null) {
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P2).c("InMobiBanner", "checkStateAndLogError");
        }
        if (!z10 || this.f31546a != null) {
            return true;
        }
        T1 t13 = this.f31549d;
        if (t13 == null || (f5P = t13.p()) == null) {
            return false;
        }
        e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
        ((G5) f5P).b("InMobiBanner", "Listener supplied is null, Ignoring your call.");
        return false;
    }

    public final boolean b() {
        return this.f31554i > 0 && this.f31555j > 0;
    }

    public final void destroy() {
        a();
        removeAllViews();
        T1 t12 = this.f31549d;
        if (t12 != null) {
            t12.z();
        }
        this.f31546a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f31559n.f32885d = true;
    }

    public final F1 getAudioStatusInternal$media_release() {
        return this.f31548c;
    }

    public final T1 getMAdManager$media_release() {
        return this.f31549d;
    }

    public final AudioListener getMAudioListener$media_release() {
        return this.f31547b;
    }

    public final J1 getMPubListener$media_release() {
        return this.f31546a;
    }

    public final C2788gb getMPubSettings$media_release() {
        return this.f31559n;
    }

    public final long getPlacementId() {
        return this.f31559n.f32882a;
    }

    public final PreloadManager getPreloadManager() {
        return this.f31560o;
    }

    @tu.f
    public final void getSignals() throws IllegalStateException {
        F5 f5P;
        if (a(true)) {
            if (!a("getSignals()")) {
                this.f31550e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            T1 t12 = this.f31549d;
            if (t12 == null || !t12.D()) {
                Context context = getContext();
                e0.checkNotNullExpressionValue(context, "getContext(...)");
                a(context, "getToken");
            }
            T1 t13 = this.f31549d;
            if (t13 != null && (f5P = t13.p()) != null) {
                e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((G5) f5P).a("InMobiBanner", "getSignals");
            }
            setEnableAutoRefresh(false);
            T1 t14 = this.f31549d;
            if (t14 != null) {
                t14.a(this.f31550e);
            }
        }
    }

    public final boolean isAudioAd() {
        T1 t12 = this.f31549d;
        if (t12 != null) {
            return t12.C();
        }
        return false;
    }

    public final void load(byte[] bArr) throws IllegalStateException {
        T1 t12;
        T1 t13;
        if (a(false)) {
            this.f31559n.f32886e = "AB";
            if (getLayoutParams() != null) {
                this.f31554i = D2.b(getLayoutParams().width / AbstractC2679a4.b());
                this.f31555j = D2.b(getLayoutParams().height / AbstractC2679a4.b());
            }
            T1 t14 = this.f31549d;
            if (t14 == null || !t14.D() || ((t12 = this.f31549d) != null && t12.D() && (t13 = this.f31549d) != null && t13.q() == 0)) {
                Context context = getContext();
                e0.checkNotNullExpressionValue(context, "getContext(...)");
                a(context, "banner");
            }
            T1 t15 = this.f31549d;
            if (t15 != null) {
                t15.w();
            }
            a("load(byte[])", new d(this, bArr));
        }
    }

    public final void notifyLoss(int i10, double d10) {
        x0 x0Var;
        String strA;
        T1 t12 = this.f31549d;
        if (t12 == null || (strA = t12.a(i10, d10)) == null) {
            x0Var = null;
        } else {
            if (strA.length() > 0) {
                AbstractC2902n7.a((byte) 1, "InMobi", strA);
            }
            x0Var = x0.f87415a;
        }
        if (x0Var == null) {
            AbstractC2902n7.a((byte) 1, "InMobi", "loss notification failed to trigger");
        }
    }

    public final void notifyWin(double d10) {
        String strA;
        if (this.f31549d == null) {
            AbstractC2902n7.a((byte) 1, "InMobi", "win notification failed to trigger");
        }
        T1 t12 = this.f31549d;
        if (t12 == null || (strA = t12.a(d10)) == null || strA.length() <= 0) {
            return;
        }
        AbstractC2902n7.a((byte) 1, "InMobi", strA);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        F5 f5P;
        try {
            super.onAttachedToWindow();
            T1 t12 = this.f31549d;
            if (t12 != null) {
                t12.F();
            }
            if (getLayoutParams() != null) {
                this.f31554i = D2.b(getLayoutParams().width / AbstractC2679a4.b());
                this.f31555j = D2.b(getLayoutParams().height / AbstractC2679a4.b());
            }
            if (!b()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                C2696b4 c2696b4 = AbstractC2679a4.f32633a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                e0.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC2679a4.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            T1 t13 = this.f31549d;
            if (t13 == null || (f5P = t13.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        F5 f5P;
        try {
            super.onDetachedFromWindow();
            a();
            T1 t12 = this.f31549d;
            if (t12 != null) {
                t12.L();
            }
        } catch (Exception e10) {
            T1 t13 = this.f31549d;
            if (t13 == null || (f5P = t13.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        F5 f5P;
        e0.checkNotNullParameter(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, i10);
            if (i10 == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            T1 t12 = this.f31549d;
            if (t12 == null || (f5P = t12.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        F5 f5P;
        try {
            super.onWindowFocusChanged(z10);
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            T1 t12 = this.f31549d;
            if (t12 == null || (f5P = t12.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
        }
    }

    public final void pause() {
        F5 f5P;
        T1 t12;
        try {
            if (this.f31558m != null || (t12 = this.f31549d) == null) {
                return;
            }
            t12.E();
        } catch (Exception e10) {
            T1 t13 = this.f31549d;
            if (t13 == null || (f5P = t13.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
        }
    }

    public final void refreshBanner$media_release() {
        a(this.f31550e, "NonAB", true);
    }

    public final void resume() {
        F5 f5P;
        T1 t12;
        try {
            if (this.f31558m != null || (t12 = this.f31549d) == null) {
                return;
            }
            t12.H();
        } catch (Exception e10) {
            T1 t13 = this.f31549d;
            if (t13 == null || (f5P = t13.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
        }
    }

    public final void scheduleRefresh$media_release() {
        R1 r12;
        if (isShown() && hasWindowFocus()) {
            R1 r13 = this.f31553h;
            if (r13 != null) {
                r13.removeMessages(1);
            }
            T1 t12 = this.f31549d;
            if (t12 == null || !t12.y() || !this.f31552g || (r12 = this.f31553h) == null) {
                return;
            }
            r12.sendEmptyMessageDelayed(1, this.f31551f * 1000);
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        e0.checkNotNullParameter(animationType, "animationType");
        this.f31556k = animationType;
    }

    public final void setAudioListener(AudioListener audioListener) {
        e0.checkNotNullParameter(audioListener, "audioListener");
        this.f31547b = audioListener;
        F1 item = this.f31548c;
        if (item == F1.f31763d || audioListener == null) {
            return;
        }
        F1.f31761b.getClass();
        e0.checkNotNullParameter(item, "item");
        int iOrdinal = item.ordinal();
        audioListener.onAudioStatusChanged(this, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    public final void setAudioStatusInternal$media_release(F1 f12) {
        e0.checkNotNullParameter(f12, "<set-?>");
        this.f31548c = f12;
    }

    public final void setBannerSize(int i10, int i11) {
        this.f31554i = i10;
        this.f31555j = i11;
    }

    public final void setContentUrl(String contentUrl) {
        e0.checkNotNullParameter(contentUrl, "contentUrl");
        this.f31559n.f32887f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean z10) {
        F5 f5P;
        try {
            if (this.f31552g == z10) {
                return;
            }
            this.f31552g = z10;
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            T1 t12 = this.f31549d;
            if (t12 == null || (f5P = t12.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
        }
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C2942pd.a(map.get("tp"));
            C2942pd.b(map.get("tp-v"));
        }
        this.f31559n.f32884c = map;
    }

    public final void setKeywords(String str) {
        this.f31559n.f32883b = str;
    }

    public final void setListener(BannerAdEventListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f31546a = new K1(listener);
    }

    public final void setMAdManager$media_release(T1 t12) {
        this.f31549d = t12;
    }

    public final void setMAudioListener$media_release(AudioListener audioListener) {
        this.f31547b = audioListener;
    }

    public final void setMPubListener$media_release(J1 j12) {
        this.f31546a = j12;
    }

    public final void setRefreshInterval(int i10) {
        F5 f5P;
        try {
            this.f31559n.f32886e = "NonAB";
            Context context = getContext();
            e0.checkNotNullExpressionValue(context, "getContext(...)");
            a(context, "banner");
            T1 t12 = this.f31549d;
            this.f31551f = t12 != null ? t12.a(i10, this.f31551f) : 0;
        } catch (Exception e10) {
            T1 t13 = this.f31549d;
            if (t13 == null || (f5P = t13.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
        }
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        e0.checkNotNullParameter(watermarkData, "watermarkData");
        T1 t12 = this.f31549d;
        if (t12 != null) {
            t12.a(watermarkData);
        }
    }

    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new A5(this));
    }

    public final void swapAdUnitsAndDisplayAd$media_release() {
        F5 f5P;
        T1 t12 = this.f31549d;
        if (t12 != null) {
            t12.K();
        }
        try {
            Animation animationA = b.a(this.f31556k, getWidth(), getHeight());
            T1 t13 = this.f31549d;
            if (t13 != null) {
                t13.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e10) {
            T1 t14 = this.f31549d;
            if (t14 == null || (f5P = t14.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z10) {
        F5 f5P;
        F5 f5P2;
        F5 f5P3;
        F5 f5P4;
        F5 f5P5;
        try {
            this.f31559n.f32886e = str;
            T1 t12 = this.f31549d;
            if (t12 != null && t12.B()) {
                T1 t13 = this.f31549d;
                if (t13 != null) {
                    t13.w();
                }
                T1 t14 = this.f31549d;
                if (t14 != null && (f5P5 = t14.p()) != null) {
                    e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((G5) f5P5).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
                }
                T1 t15 = this.f31549d;
                if (t15 != null && (f5P4 = t15.p()) != null) {
                    e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((G5) f5P4).b("InMobiBanner", "load already in progress");
                }
                T1 t16 = this.f31549d;
                if (t16 != null) {
                    t16.b((short) 2169);
                }
                J1 j12 = this.f31546a;
                if (j12 != null) {
                    j12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                T1 t17 = this.f31549d;
                if (t17 != null && (f5P3 = t17.p()) != null) {
                    e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    ((G5) f5P3).b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                AbstractC2902n7.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            e0.checkNotNullExpressionValue(context, "getContext(...)");
            a(context, "banner");
            T1 t18 = this.f31549d;
            if (t18 != null) {
                t18.w();
            }
            T1 t19 = this.f31549d;
            if (t19 != null && (f5P2 = t19.p()) != null) {
                e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((G5) f5P2).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
            }
            a("load", new C3103z5(this, publisherCallbacks, z10));
        } catch (Exception e10) {
            T1 t110 = this.f31549d;
            if (t110 != null) {
                t110.a((short) 2172);
            }
            J1 j13 = this.f31546a;
            if (j13 != null) {
                j13.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            T1 t111 = this.f31549d;
            if (t111 == null || (f5P = t111.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    public final void load() {
        if (a(false)) {
            a(this.f31550e, "NonAB", false);
        }
    }

    public final void load(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (a(false)) {
            this.f31558m = context instanceof Activity ? new WeakReference(context) : null;
            a(this.f31550e, "NonAB", false);
        }
    }

    public final void a(String str, kv.a aVar) {
        F5 f5P;
        F5 f5P2;
        T1 t12 = this.f31549d;
        if (t12 != null && (f5P2 = t12.p()) != null) {
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P2).c("InMobiBanner", DwaEpyvxz.FDUjCQZDLbtkRo);
        }
        if (!a(str)) {
            T1 t13 = this.f31549d;
            if (t13 != null && (f5P = t13.p()) != null) {
                e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((G5) f5P).b("InMobiBanner", "invalid banner size. fail.");
            }
            T1 t14 = this.f31549d;
            if (t14 != null) {
                t14.a((short) 2170);
            }
            J1 j12 = this.f31546a;
            if (j12 != null) {
                j12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (!b()) {
            AbstractC2875le.a(new z(23, this, aVar), 200L);
        } else {
            aVar.invoke();
        }
    }

    public static final void a(InMobiBanner this$0, kv.a onSuccess) {
        F5 f5P;
        F5 f5P2;
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(onSuccess, "$onSuccess");
        try {
            if (this$0.b()) {
                onSuccess.invoke();
                return;
            }
            T1 t12 = this$0.f31549d;
            if (t12 != null && (f5P2 = t12.p()) != null) {
                e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((G5) f5P2).b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            T1 t13 = this$0.f31549d;
            if (t13 != null) {
                t13.a((short) 2171);
            }
            J1 j12 = this$0.f31546a;
            if (j12 != null) {
                j12.a(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            T1 t14 = this$0.f31549d;
            if (t14 != null) {
                t14.a((short) 2172);
            }
            J1 j13 = this$0.f31546a;
            if (j13 != null) {
                j13.a(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            T1 t15 = this$0.f31549d;
            if (t15 == null || (f5P = t15.p()) == null) {
                return;
            }
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public final boolean a(String str) {
        F5 f5P;
        F5 f5P2;
        if (b()) {
            return true;
        }
        if (getLayoutParams() == null) {
            T1 t12 = this.f31549d;
            if (t12 != null && (f5P2 = t12.p()) != null) {
                e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
                ((G5) f5P2).b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f31554i = D2.b(getLayoutParams().width / AbstractC2679a4.b());
            this.f31555j = D2.b(getLayoutParams().height / AbstractC2679a4.b());
            return true;
        }
        T1 t13 = this.f31549d;
        if (t13 != null && (f5P = t13.p()) != null) {
            e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
            ((G5) f5P).b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(str));
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, long j10) throws IllegalStateException {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f31548c = F1.f31763d;
        this.f31550e = new a(this);
        this.f31552g = true;
        this.f31556k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C2788gb c2788gb = new C2788gb();
        this.f31559n = c2788gb;
        this.f31560o = new e(this);
        if (C2925od.q()) {
            if (context instanceof Activity) {
                this.f31558m = new WeakReference(context);
            }
            this.f31549d = new T1();
            c2788gb.f32882a = j10;
            a(context, "banner");
            T1 t12 = this.f31549d;
            this.f31551f = t12 != null ? t12.A() : 0;
            this.f31553h = new R1(this);
            return;
        }
        e0.checkNotNullExpressionValue("InMobiBanner", "TAG");
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public final void a(Context context, String str) throws IllegalStateException {
        int iA;
        T1 t12 = this.f31549d;
        if (t12 != null) {
            t12.a(context, this.f31559n, getFrameSizeString(), str);
        }
        T1 t13 = this.f31549d;
        if (t13 != null) {
            int i10 = this.f31551f;
            iA = t13.a(i10, i10);
        } else {
            iA = 0;
        }
        this.f31551f = iA;
    }

    public final void a() {
        R1 r12 = this.f31553h;
        if (r12 != null) {
            r12.removeMessages(1);
        }
    }
}
