package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.AbstractC2679a4;
import com.inmobi.media.AbstractC2875le;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.AbstractC3035v5;
import com.inmobi.media.B1;
import com.inmobi.media.C1;
import com.inmobi.media.C2675a0;
import com.inmobi.media.C2696b4;
import com.inmobi.media.C2788gb;
import com.inmobi.media.C2925od;
import com.inmobi.media.C2942pd;
import com.inmobi.media.D2;
import com.inmobi.media.F5;
import com.inmobi.media.G1;
import com.inmobi.media.G5;
import com.inmobi.media.H1;
import com.inmobi.media.O2;
import com.inmobi.media.Q2;
import com.inmobi.media.R3;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC3052w5;
import com.inmobi.media.Wb;
import com.inmobi.media.Y;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiAudio extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public AudioAdEventListener f31539a;

    /* renamed from: b, reason: collision with root package name */
    public G1 f31540b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f31541c;

    /* renamed from: d, reason: collision with root package name */
    public final C2788gb f31542d;

    /* renamed from: e, reason: collision with root package name */
    public long f31543e;

    /* renamed from: f, reason: collision with root package name */
    public int f31544f;

    /* renamed from: g, reason: collision with root package name */
    public int f31545g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends C1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiAudio audio) {
            super(audio);
            e0.checkNotNullParameter(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener$media_release;
            e0.checkNotNullParameter(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.C1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            e0.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                G1 mAdManager$media_release = inMobiAudio.getMAdManager$media_release();
                if (mAdManager$media_release != null) {
                    mAdManager$media_release.y();
                }
            } catch (IllegalStateException e10) {
                AbstractC2902n7.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener$media_release = inMobiAudio.getMPubListener$media_release();
                if (mPubListener$media_release != null) {
                    mPubListener$media_release.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InMobiAudio(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.IllegalStateException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiAudio.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final void a(InMobiAudio this$0) {
        G1 g12;
        e0.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.b()) {
                if (!this$0.a() || (g12 = this$0.f31540b) == null) {
                    return;
                }
                g12.b(this$0.getFrameSizeString());
                return;
            }
            AbstractC2902n7.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            G1 g13 = this$0.f31540b;
            if (g13 != null) {
                g13.a((short) 108);
            }
            G1 g14 = this$0.f31540b;
            if (g14 != null) {
                g14.a(g14.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception unused) {
            G1 g15 = this$0.f31540b;
            if (g15 != null) {
                g15.a((short) 105);
            }
            AbstractC2902n7.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
        }
    }

    private final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31544f);
        sb2.append('x');
        sb2.append(this.f31545g);
        return sb2.toString();
    }

    public final boolean b() {
        return this.f31544f > 0 && this.f31545g > 0;
    }

    public final boolean c() {
        if (!b()) {
            if (getLayoutParams() == null) {
                AbstractC2902n7.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                AbstractC2902n7.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f31544f = D2.b(getLayoutParams().width / AbstractC2679a4.b());
                this.f31545g = D2.b(getLayoutParams().height / AbstractC2679a4.b());
            }
        }
        return true;
    }

    public final void d() {
        G1 g12;
        try {
            LinkedHashMap linkedHashMap = Q2.f32149a;
            Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), null);
            e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (!((AdConfig) configA).getAudio().isAudioEnabled()) {
                G1 g13 = this.f31540b;
                if (g13 != null) {
                    g13.a((short) 107);
                }
                G1 g14 = this.f31540b;
                if (g14 != null) {
                    g14.a(g14.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                AbstractC2902n7.a((byte) 1, "InMobi", "");
                return;
            }
            this.f31542d.f32886e = "NonAB";
            Context context = getContext();
            e0.checkNotNullExpressionValue(context, "getContext(...)");
            a(context);
            G1 g15 = this.f31540b;
            if (g15 != null) {
                B1 b12 = g15.f31809q;
                if (b12 != null ? b12.F0() : false) {
                    G1 g16 = this.f31540b;
                    if (g16 != null) {
                        F5 f5P = g16.p();
                        if (f5P != null) {
                            String str = H1.f31832a;
                            e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                            ((G5) f5P).b(str, "submitAdLoadFailed " + g16);
                        }
                        B1 b13 = g16.f31810r;
                        if (b13 != null) {
                            b13.b((short) 15);
                        }
                    }
                    AudioAdEventListener audioAdEventListener = this.f31539a;
                    if (audioAdEventListener != null) {
                        audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    }
                    AbstractC2902n7.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                    return;
                }
            }
            if (!c()) {
                G1 g17 = this.f31540b;
                if (g17 != null) {
                    g17.a((short) 108);
                }
                G1 g18 = this.f31540b;
                if (g18 != null) {
                    g18.a(g18.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Config configA2 = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), null);
            e0.checkNotNull(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (((AdConfig) configA2).getAudio().getMinDeviceVolume() > R3.f32183a.a(C2925od.d(), C2925od.o())) {
                G1 g19 = this.f31540b;
                if (g19 != null) {
                    g19.a((short) 106);
                }
                G1 g110 = this.f31540b;
                if (g110 != null) {
                    g110.a(g110.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (!b()) {
                AbstractC2875le.a(new w(this, 23), 200L);
            } else {
                if (!a() || (g12 = this.f31540b) == null) {
                    return;
                }
                g12.b(getFrameSizeString());
            }
        } catch (Exception unused) {
            G1 g111 = this.f31540b;
            if (g111 != null) {
                g111.a((short) 105);
            }
            AbstractC2902n7.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    public final void destroy() {
        removeAllViews();
        G1 g12 = this.f31540b;
        if (g12 != null) {
            F5 f5P = g12.p();
            if (f5P != null) {
                String str = H1.f31832a;
                e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f5P).a(str, "clear " + g12);
            }
            F5 f5P2 = g12.p();
            if (f5P2 != null) {
                String str2 = H1.f31832a;
                e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f5P2).c(str2, "unregisterLifecycleCallbacks " + g12);
            }
            B1 b12 = g12.f31807o;
            if (b12 != null) {
                b12.K0();
            }
            B1 b13 = g12.f31808p;
            if (b13 != null) {
                b13.K0();
            }
            B1 b14 = g12.f31807o;
            if (b14 != null) {
                b14.g();
            }
            g12.f31807o = null;
            B1 b15 = g12.f31808p;
            if (b15 != null) {
                b15.g();
            }
            g12.f31808p = null;
            g12.f31809q = null;
            g12.f31810r = null;
            g12.a((Boolean) null);
        }
        this.f31539a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f31542d.f32885d = true;
    }

    public final G1 getMAdManager$media_release() {
        return this.f31540b;
    }

    public final AudioAdEventListener getMPubListener$media_release() {
        return this.f31539a;
    }

    public final void load() {
        G1 g12 = this.f31540b;
        if (g12 != null) {
            g12.w();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            G1 g12 = this.f31540b;
            if (g12 != null) {
                g12.x();
            }
            if (getLayoutParams() != null) {
                this.f31544f = D2.b(getLayoutParams().width / AbstractC2679a4.b());
                this.f31545g = D2.b(getLayoutParams().height / AbstractC2679a4.b());
            }
            if (!b()) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C2696b4 c2696b4 = AbstractC2679a4.f32633a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                e0.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC2679a4.a(rootWindowInsets, context);
            }
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            G1 g12 = this.f31540b;
            if (g12 != null) {
                F5 f5P = g12.p();
                if (f5P != null) {
                    String str = H1.f31832a;
                    e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                    ((G5) f5P).c(str, "unregisterLifecycleCallbacks " + g12);
                }
                B1 b12 = g12.f31807o;
                if (b12 != null) {
                    b12.K0();
                }
                B1 b13 = g12.f31808p;
                if (b13 != null) {
                    b13.K0();
                }
            }
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    public final void pause() {
        G1 g12;
        try {
            if (this.f31541c != null || (g12 = this.f31540b) == null) {
                return;
            }
            F5 f5P = g12.p();
            if (f5P != null) {
                String str = H1.f31832a;
                e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f5P).a(str, "pause " + g12);
            }
            B1 b12 = g12.f31809q;
            if (b12 != null) {
                b12.G0();
            }
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        G1 g12;
        try {
            if (this.f31541c != null || (g12 = this.f31540b) == null) {
                return;
            }
            F5 f5P = g12.p();
            if (f5P != null) {
                String str = H1.f31832a;
                e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f5P).a(str, "resume " + g12);
            }
            B1 b12 = g12.f31809q;
            if (b12 != null) {
                b12.H0();
            }
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setAudioSize(int i10, int i11) {
        this.f31544f = i10;
        this.f31545g = i11;
    }

    public final void setContentUrl(String contentUrl) {
        e0.checkNotNullParameter(contentUrl, "contentUrl");
        this.f31542d.f32887f = contentUrl;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (str != null) {
                C2942pd.a(str);
            }
            String str2 = map.get("tp-v");
            if (str2 != null) {
                C2942pd.b(str2);
            }
        }
        this.f31542d.f32884c = map;
    }

    public final void setKeywords(String str) {
        this.f31542d.f32883b = str;
    }

    public final void setListener(AudioAdEventListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f31539a = listener;
    }

    public final void setMAdManager$media_release(G1 g12) {
        this.f31540b = g12;
    }

    public final void setMPubListener$media_release(AudioAdEventListener audioAdEventListener) {
        this.f31539a = audioAdEventListener;
    }

    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3052w5(this));
    }

    public final void show() {
        G1 g12 = this.f31540b;
        if (g12 != null) {
            F5 f5P = g12.p();
            if (f5P != null) {
                String str = H1.f31832a;
                e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f5P).a(str, "submitAdShowCalled " + g12);
            }
            B1 b12 = g12.f31810r;
            if (b12 != null) {
                b12.x0();
            }
        }
        G1 g13 = this.f31540b;
        if (g13 != null) {
            g13.a(this);
        }
    }

    public final boolean a() {
        G1 g12;
        long j10 = this.f31543e;
        if (j10 != 0 && (g12 = this.f31540b) != null) {
            F5 f5P = g12.p();
            if (f5P != null) {
                String str = H1.f31832a;
                e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f5P).c(str, "checkForRefreshRate " + g12);
            }
            if (g12.f31810r == null) {
                return false;
            }
            LinkedHashMap linkedHashMap = Q2.f32149a;
            int minRefreshInterval = ((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getAudio().getMinRefreshInterval();
            if (SystemClock.elapsedRealtime() - j10 < minRefreshInterval * 1000) {
                g12.a((short) 2175);
                g12.b(g12.f31810r, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
                String str2 = H1.f31832a;
                e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
                sb2.append(minRefreshInterval);
                sb2.append(" seconds (AdPlacement Id = ");
                B1 b12 = g12.f31810r;
                sb2.append(b12 != null ? b12.J() : null);
                sb2.append(')');
                AbstractC2902n7.a((byte) 1, str2, sb2.toString());
                F5 f5P2 = g12.p();
                if (f5P2 == null) {
                    return false;
                }
                e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                StringBuilder sb3 = new StringBuilder("Ad cannot be refreshed before ");
                sb3.append(minRefreshInterval);
                sb3.append(" seconds (AdPlacement Id = ");
                B1 b13 = g12.f31810r;
                sb3.append(b13 != null ? b13.J() : null);
                sb3.append(')');
                ((G5) f5P2).b(str2, sb3.toString());
                return false;
            }
        }
        this.f31543e = SystemClock.elapsedRealtime();
        return true;
    }

    public final void a(Context context) throws IllegalStateException {
        String str;
        G1 g12 = this.f31540b;
        if (g12 != null) {
            C2788gb pubSettings = this.f31542d;
            String adSize = getFrameSizeString();
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(pubSettings, "pubSettings");
            e0.checkNotNullParameter(adSize, "adSize");
            String str2 = H1.f31832a;
            e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Y y10 = new Y("audio");
            e0.checkNotNullParameter(context, "context");
            if (context instanceof Activity) {
                str = "activity";
            } else {
                str = "others";
            }
            C2675a0 c2675a0A = y10.d(str).a(pubSettings.f32882a).c(pubSettings.f32883b).a(pubSettings.f32884c).a(adSize).a(pubSettings.f32885d).e(pubSettings.f32886e).b(pubSettings.f32887f).a();
            B1 b12 = g12.f31807o;
            if (b12 != null && g12.f31808p != null) {
                b12.a(context, c2675a0A, g12);
                B1 b13 = g12.f31808p;
                if (b13 != null) {
                    b13.a(context, c2675a0A, g12);
                }
            } else {
                g12.f31807o = new B1(context, c2675a0A, g12);
                g12.f31808p = new B1(context, c2675a0A, g12);
                g12.f31810r = g12.f31807o;
            }
            String str3 = pubSettings.f32886e;
            if (str3 != null) {
                F5 f5P = g12.p();
                if (f5P != null) {
                    ((G5) f5P).a();
                }
                g12.a(Wb.a("audio", str3, false));
                F5 f5P2 = g12.p();
                if (f5P2 != null) {
                    e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    ((G5) f5P2).a(str2, "adding audioAdUnit1 to reference tracker");
                }
                B1 b14 = g12.f31807o;
                e0.checkNotNull(b14);
                Wb.a(b14, g12.p());
                F5 f5P3 = g12.p();
                if (f5P3 != null) {
                    e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    ((G5) f5P3).a(str2, "adding audioAdUnit2 to reference tracker");
                }
                B1 b15 = g12.f31808p;
                e0.checkNotNull(b15);
                Wb.a(b15, g12.p());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, long j10) throws IllegalStateException {
        super(context);
        e0.checkNotNullParameter(context, "context");
        a aVar = new a(this);
        C2788gb c2788gb = new C2788gb();
        this.f31542d = c2788gb;
        if (C2925od.q()) {
            if (context instanceof Activity) {
                this.f31541c = new WeakReference(context);
            }
            this.f31540b = new G1(aVar);
            c2788gb.f32882a = j10;
            a(context);
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }
}
