package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import be.nVUQ.UupKET;
import com.amazon.device.ads.DTBMetricReport;
import com.amazon.device.ads.MraidUnloadCommand;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.inmobi.media.B6;
import com.ironsource.C3284j8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import io.odeeo.sdk.AdUnit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B6 {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f31651a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31652b;

    /* renamed from: c, reason: collision with root package name */
    public F5 f31653c;

    public B6(int i10, GestureDetectorOnGestureListenerC3093yc mRenderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mRenderView, "mRenderView");
        this.f31651a = mRenderView;
        this.f31652b = i10;
    }

    public static final void b(B6 this$0, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        S6.a(this$0.f31651a.getLandingPageHandler(), "open", str, str2, null, false, 24);
    }

    public static final void c(B6 this$0, String str, String str2) {
        X6 x62;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            Y6 y62 = this$0.f31651a.getLandingPageHandler().f32262f;
            if (y62 != null) {
                String strA = P6.a(str2);
                S6 landingPageHandler = this$0.f31651a.getLandingPageHandler();
                int i10 = landingPageHandler.f32264h + 1;
                landingPageHandler.f32264h = i10;
                x62 = new X6(y62, strA, i10, 8);
            } else {
                x62 = null;
            }
            if (x62 != null) {
                x62.f32490g = "IN_NATIVE";
            }
            this$0.f31651a.getLandingPageHandler().d("openEmbedded", str, str2, x62);
        } catch (Exception e10) {
            this$0.f31651a.a(str, "Unexpected error", "openEmbedded");
            AbstractC2902n7.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str3 = C6.f31708a;
                ((G5) f52).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling openEmbedded() request from creative; ")));
            }
        }
    }

    public static final void d(B6 this$0, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        S6.a(this$0.f31651a.getLandingPageHandler(), "openWithoutTracker", str, str2, null, true, 8);
    }

    public static final void e(B6 this$0, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this$0.f31651a;
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            gestureDetectorOnGestureListenerC3093yc.b(str, str2.subSequence(i10, length + 1).toString());
        } catch (Exception e10) {
            this$0.f31651a.a(str, "Unexpected error", "playVideo");
            AbstractC2902n7.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str3 = C6.f31708a;
                ((G5) f52).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling playVideo() request from creative; ")));
            }
        }
    }

    public static final void f(B6 this$0, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.getSiblingWebviewManager().b(this$0.f31651a.getRoute().f32467b, str, str2);
        } catch (Exception e10) {
            this$0.f31651a.a(C3284j8.f37009j, Jc.a(str, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str3 = C6.f31708a;
                ((G5) f52).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling sendMessage() request from creative; ")));
            }
        }
    }

    public final GestureDetectorOnGestureListenerC3093yc a() {
        if (kotlin.jvm.internal.e0.areEqual(this.f31651a.getRoute().f32467b, BuildConfig.FLAVOR)) {
            return this.f31651a;
        }
        Sf webViewFactory = this.f31651a.getWebViewFactory();
        webViewFactory.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        return (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(BuildConfig.FLAVOR);
    }

    @JavascriptInterface
    public final void asyncPing(String str, String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "asyncPing called: ", url));
        }
        if (!URLUtil.isValidUrl(url)) {
            this.f31651a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            X9 x92 = new X9(url, this.f31653c);
            x92.f32515x = false;
            x92.f32511t = false;
            x92.f32512u = false;
            x92.a(new C3065x1(new C3082y1(x92, new C3087y6(this))));
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "asyncPing");
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                ((G5) f53).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered internal error in handling asyncPing() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String mediaId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaId, "mediaId");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "cancelSaveContent called. mediaId:", mediaId));
        }
    }

    @JavascriptInterface
    public final void close(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "close called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3093ycA.L0) {
            ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
            io.bidmachine.media3.exoplayer.b1 runnable = new io.bidmachine.media3.exoplayer.b1(gestureDetectorOnGestureListenerC3093ycA, 17, this, str);
            executorC3020u7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            executorC3020u7.f33447a.post(runnable);
            return;
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of ad render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
        if (f54 != null) {
            String str4 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f54).a(str4, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093ycA, str4, "TAG", "closeAll "));
        }
        InterfaceC2692b0 interfaceC2692b0 = gestureDetectorOnGestureListenerC3093ycA.f33633k0;
        if (interfaceC2692b0 != null) {
            interfaceC2692b0.b();
        }
        gestureDetectorOnGestureListenerC3093ycA.n();
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "closeCustomExpand called.");
        }
        if (this.f31652b != 1) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                StringBuilder sbA = N6.a(str3, "access$getTAG$p(...)", "closeCustomExpand called in incorrect Ad type: ");
                sbA.append(this.f31652b);
                ((G5) f53).b(str3, sbA.toString());
                return;
            }
            return;
        }
        if (this.f31651a != null) {
            new Handler(this.f31651a.getContainerContext().getMainLooper()).post(new zk.g(this, 1));
            return;
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).b(str4, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i10, float f10, boolean z10, boolean z11) {
        X6 x62;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "customExpand called");
        }
        if (this.f31651a.L0) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f31652b != 1) {
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str5 = C6.f31708a;
                StringBuilder sbA = N6.a(str5, "access$getTAG$p(...)", "customExpand called in incorrect Ad type: ");
                sbA.append(this.f31652b);
                ((G5) f54).b(str5, sbA.toString());
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                boolean z13 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z12 ? i11 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0) {
                if (i10 < 0 || i10 >= EnumC2764f4.values().length) {
                    this.f31651a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f10 < 0.0f || f10 > 1.0f) {
                    this.f31651a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                Y6 y62 = this.f31651a.getLandingPageHandler().f32262f;
                if (y62 != null) {
                    String strA = P6.a(str2);
                    S6 landingPageHandler = this.f31651a.getLandingPageHandler();
                    int i12 = landingPageHandler.f32264h + 1;
                    landingPageHandler.f32264h = i12;
                    x62 = new X6(y62, strA, i12, 8);
                } else {
                    x62 = null;
                }
                X6 x63 = x62;
                if (x63 != null) {
                    x63.f32490g = "IN_CUSTOM";
                }
                S6 landingPageHandler2 = this.f31651a.getLandingPageHandler();
                L6 funnelState = L6.f31990d;
                Integer numValueOf = Integer.valueOf(AdUnit.ERROR_MEDIA_PLAYER_ERROR);
                landingPageHandler2.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
                P6.a(funnelState, x63, numValueOf, new R6(landingPageHandler2));
                a(str, str2, i10, f10, z11, x63);
                return;
            }
        }
        this.f31651a.a(str, "Invalid " + i10, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(String str, String url, float f10, boolean z10) {
        X6 x62;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc.L0) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f31652b != 1) {
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str4 = C6.f31708a;
                StringBuilder sbA = N6.a(str4, "access$getTAG$p(...)", "customExpandInNative called in incorrect Ad type: ");
                sbA.append(this.f31652b);
                ((G5) f54).b(str4, sbA.toString());
                return;
            }
            return;
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            gestureDetectorOnGestureListenerC3093yc.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        Y6 y62 = gestureDetectorOnGestureListenerC3093yc.getLandingPageHandler().f32262f;
        if (y62 != null) {
            String strA = P6.a(url);
            S6 landingPageHandler = this.f31651a.getLandingPageHandler();
            int i10 = landingPageHandler.f32264h + 1;
            landingPageHandler.f32264h = i10;
            x62 = new X6(y62, strA, i10, 8);
        } else {
            x62 = null;
        }
        X6 x63 = x62;
        if (x63 != null) {
            x63.f32490g = "IN_NATIVE";
        }
        S6 landingPageHandler2 = this.f31651a.getLandingPageHandler();
        L6 funnelState = L6.f31990d;
        Integer numValueOf = Integer.valueOf(AdUnit.ERROR_STOPPED_MANUALLY);
        landingPageHandler2.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
        P6.a(funnelState, x63, numValueOf, new R6(landingPageHandler2));
        int iA = this.f31651a.getLandingPageHandler().a("customExpandInNative", str, url, x63, new C2846k2(f10, z10));
        F5 f55 = this.f31653c;
        if (f55 != null) {
            String str5 = C6.f31708a;
            ((G5) f55).a(str5, AbstractC2803h9.a(str5, "access$getTAG$p(...)", "customExpandInNativeRequest: ", iA));
        }
        if (iA == 3) {
            EnumC2764f4 enumC2764f4 = EnumC2764f4.f32833a;
            a(str, url, 0, f10, !z10, x63);
        }
    }

    @JavascriptInterface
    public final void destroyWebView(String str, String str2) throws JSONException {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null && gestureDetectorOnGestureListenerC3093ycA.L0) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
            if (str2 == null) {
                str2 = "";
            }
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3093yc.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
            zk.f runnable = new zk.f(this, str2, 0);
            executorC3020u7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            executorC3020u7.f33447a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31651a;
        if (str2 == null) {
            str2 = "";
        }
        tu.o oVar2 = Jc.f31925a;
        JSONObject jSONObjectA2 = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        gestureDetectorOnGestureListenerC3093yc2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(String str, boolean z10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "disableBackButton called");
        }
        this.f31651a.getWebViewFactory().a(new C3104z6(z10));
    }

    @JavascriptInterface
    public final void disableCloseRegion(String str, boolean z10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "disableCloseRegion called");
        }
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.h runnable = new zk.h(this, z10, str, 0);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        try {
            F5 f52 = this.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f52).a(str2, "fireAdFailed called.");
            }
            this.f31651a.j();
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "fireAdFailed");
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                ((G5) f53).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdFailed() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            F5 f52 = this.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f52).a(str2, "fireAdReady called.");
            }
            this.f31651a.k();
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "fireAdReady");
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                ((G5) f53).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdReady() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f54 != null) {
            String str4 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f54).c(str4, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str4, "TAG", "completeFromInterActive "));
        }
        C2780g3 c2780g3 = gestureDetectorOnGestureListenerC3093yc.U0;
        if (c2780g3 != null && !c2780g3.f32867g.get()) {
            c2780g3.f32864d.f33005i = 1;
            kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
        }
        F5 f55 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f55 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f55).a(TAG, "completeFromInterActive");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        F5 f52;
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f53).a(str2, "fireSkip is called");
        }
        if (this.f31651a == null && (f52 = this.f31653c) != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).b(str3, "Found a null instance of render view!");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f54 != null) {
            String str4 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f54).c(str4, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str4, "TAG", "skipFromInterActive "));
        }
        C2780g3 c2780g3 = gestureDetectorOnGestureListenerC3093yc.U0;
        if (c2780g3 != null && !c2780g3.f32867g.get()) {
            c2780g3.f32864d.f33004h = 1;
            kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
        }
        F5 f55 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f55 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f55).a(TAG, "skipFromInterActive");
        }
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        InterfaceC2728d2 interfaceC2728d2;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f54 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f54).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (interfaceC2728d2 = gestureDetectorOnGestureListenerC3093yc.f33625g0) == null) {
            return;
        }
        ((U0) interfaceC2728d2).a(str, str2, gestureDetectorOnGestureListenerC3093yc, gestureDetectorOnGestureListenerC3093yc.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc2 == null) {
            F5 f53 = this.f31653c;
            if (f53 == null) {
                return "";
            }
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC3093yc2.getCurrentPositionMonitor()) {
            this.f31651a.D = true;
            new Handler(this.f31651a.getContainerContext().getMainLooper()).post(new zk.g(this, 2));
            while (true) {
                gestureDetectorOnGestureListenerC3093yc = this.f31651a;
                if (gestureDetectorOnGestureListenerC3093yc.D) {
                    try {
                        gestureDetectorOnGestureListenerC3093yc.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return gestureDetectorOnGestureListenerC3093yc.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null) {
            return gestureDetectorOnGestureListenerC3093ycA.getCurrentRenderingPodAdIndex();
        }
        F5 f53 = this.f31653c;
        if (f53 == null) {
            return 0;
        }
        String str3 = C6.f31708a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((G5) f53).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getDefaultPosition called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc2 == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
            }
            String string = new JSONObject().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        synchronized (gestureDetectorOnGestureListenerC3093yc2.getDefaultPositionMonitor()) {
            this.f31651a.C = true;
            new Handler(this.f31651a.getContainerContext().getMainLooper()).post(new zk.g(this, 0));
            while (true) {
                gestureDetectorOnGestureListenerC3093yc = this.f31651a;
                if (gestureDetectorOnGestureListenerC3093yc.C) {
                    try {
                        gestureDetectorOnGestureListenerC3093yc.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return gestureDetectorOnGestureListenerC3093yc.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            L7 mediaProcessor = gestureDetectorOnGestureListenerC3093yc.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "getDeviceVolume");
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str4 = C6.f31708a;
                ((G5) f54).b(str4, Qf.a(e10, N6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDeviceVolume() request from creative; ")));
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getMaxDeviceVolume called");
        }
        try {
            return R3.f32183a.t();
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "getMaxDeviceVolume");
            F5 f53 = this.f31653c;
            if (f53 == null) {
                return 0;
            }
            String str3 = C6.f31708a;
            ((G5) f53).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; ")));
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) throws JSONException {
        int i10;
        int i11;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f31651a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f31651a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f31651a.getContainerContext();
                kotlin.jvm.internal.e0.checkNotNull(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            int iB = D2.b(frameLayout.getWidth() / AbstractC2679a4.b());
            int iB2 = D2.b(frameLayout.getHeight() / AbstractC2679a4.b());
            if (this.f31651a.getFullScreenActivity() != null && (iB == 0 || iB2 == 0)) {
                kotlin.jvm.internal.e0.checkNotNull(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3070x6 viewTreeObserverOnGlobalLayoutListenerC3070x6 = new ViewTreeObserverOnGlobalLayoutListenerC3070x6(frameLayout, this.f31653c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3070x6);
                Boolean bool = Boolean.FALSE;
                synchronized (bool) {
                    try {
                        bool.wait();
                    } catch (InterruptedException unused) {
                    }
                    i10 = viewTreeObserverOnGlobalLayoutListenerC3070x6.f33565c;
                    i11 = viewTreeObserverOnGlobalLayoutListenerC3070x6.f33566d;
                }
                iB2 = i11;
                iB = i10;
            }
            try {
                jSONObject.put("width", iB);
                jSONObject.put("height", iB2);
            } catch (JSONException e10) {
                F5 f53 = this.f31653c;
                if (f53 != null) {
                    String str3 = C6.f31708a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((G5) f53).a(str3, "Error while creating max size Json.", e10);
                }
            }
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f54).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e11) {
            this.f31651a.a(str, "Unexpected error", "getMaxSize");
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str5 = C6.f31708a;
                ((G5) f55).b(str5, Qf.a(e11, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxSize() request from creative; ")));
            }
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            gestureDetectorOnGestureListenerC3093ycA = this.f31651a;
        }
        String str2 = gestureDetectorOnGestureListenerC3093ycA.getOrientationProperties().f31675d;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            ((G5) f52).a(str3, O6.a(str3, "access$getTAG$p(...)", "getOrientationProperties called: ", str2));
        }
        kotlin.jvm.internal.e0.checkNotNull(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getPlacementType called");
        }
        return 1 == this.f31652b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        F5 f52 = this.f31653c;
        if (f52 == null) {
            return "android";
        }
        String str2 = C6.f31708a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((G5) f52).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "getPlatformVersion. Version:", strValueOf));
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC3093ycA.getRenderableAdIndexes();
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.f31651a.getSafeArea();
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getScreenSize(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", AbstractC2679a4.h().f32674a);
            jSONObject.put("height", AbstractC2679a4.h().f32675b);
            F5 f52 = this.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f52).c(str2, "Message:Width x Height : " + AbstractC2679a4.h().f32674a + 'x' + AbstractC2679a4.h().f32675b);
            }
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "getScreenSize");
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                ((G5) f53).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error while getting screen dimensions; ")));
            }
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            ((G5) f54).a(str4, O6.a(str4, "access$getTAG$p(...)", "getScreenSize called:", string));
        }
        return string;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        F5 f52 = this.f31653c;
        if (f52 == null) {
            return "10.8.8";
        }
        String str2 = C6.f31708a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((G5) f52).a(str2, "getSdkVersion called. Version:10.8.8");
        return "10.8.8";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 == null) {
                return 0L;
            }
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC3093ycA.getShowTimeStamp();
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.f31651a.getViewState();
        Locale locale = Locale.ENGLISH;
        String strP = b0.e2.p(locale, "ENGLISH", viewState, locale, "this as java.lang.String).toLowerCase(locale)");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).c(str2, O6.a(str2, "access$getTAG$p(...)", "getState called:", strP));
        }
        return strP;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        F5 f52 = this.f31653c;
        if (f52 == null) {
            return "2.0";
        }
        String str2 = C6.f31708a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((G5) f52).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "impressionFired is called");
        }
        this.f31651a.p();
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) throws JSONException {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            ((G5) f52).a(str3, O6.a(str3, "access$getTAG$p(...)", "incentCompleted called. IncentData:", str2));
        }
        if (str2 == null) {
            try {
                this.f31651a.getListener().b(new HashMap());
                return;
            } catch (Exception e10) {
                this.f31651a.a(str, "Unexpected error", "incentCompleted");
                F5 f53 = this.f31653c;
                if (f53 != null) {
                    String str4 = C6.f31708a;
                    ((G5) f53).b(str4, Qf.a(e10, N6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                kotlin.jvm.internal.e0.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str5 = next;
                Object obj = jSONObject.get(str5);
                kotlin.jvm.internal.e0.checkNotNull(obj);
                map.put(str5, obj);
            }
            try {
                try {
                    this.f31651a.getListener().b(map);
                } catch (Exception e11) {
                    this.f31651a.a(str, "Unexpected error", "incentCompleted");
                    F5 f54 = this.f31653c;
                    if (f54 != null) {
                        String str6 = C6.f31708a;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        ((G5) f54).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                    }
                }
            } catch (Exception e12) {
                this.f31651a.a(str, "Unexpected error", "incentCompleted");
                F5 f55 = this.f31653c;
                if (f55 != null) {
                    String str7 = C6.f31708a;
                    ((G5) f55).b(str7, Qf.a(e12, N6.a(str7, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                }
            }
        } catch (JSONException unused) {
            this.f31651a.getListener().b(new HashMap());
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            gestureDetectorOnGestureListenerC3093ycA = this.f31651a;
        }
        return gestureDetectorOnGestureListenerC3093ycA.I;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "isDeviceMuted called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 == null) {
                return "false";
            }
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).b(str3, "Found a null instance of render view!");
            return "false";
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z10 = false;
        try {
            L7 mediaProcessor = this.f31651a.getMediaProcessor();
            kotlin.jvm.internal.e0.checkNotNull(mediaProcessor);
            F5 f55 = mediaProcessor.f32002b;
            if (f55 != null) {
                ((G5) f55).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context contextD = C2925od.d();
            if (contextD != null) {
                Object systemService = contextD.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z10 = true;
                    }
                }
            }
        } catch (Exception e10) {
            F5 f56 = this.f31653c;
            if (f56 != null) {
                String str5 = C6.f31708a;
                ((G5) f56).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if device is muted; ")));
            }
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        boolean zB;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "isHeadphonePlugged called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 == null) {
                return "false";
            }
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).b(str3, "Found a null instance of render view!");
            return "false";
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            L7 mediaProcessor = this.f31651a.getMediaProcessor();
            kotlin.jvm.internal.e0.checkNotNull(mediaProcessor);
            mediaProcessor.getClass();
            zB = L7.b();
        } catch (Exception e10) {
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str5 = C6.f31708a;
                ((G5) f55).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if headphones are plugged-in; ")));
            }
            zB = false;
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        String str2 = C6.f31708a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            return gestureDetectorOnGestureListenerC3093yc.G == Cf.f31718c;
        }
        F5 f52 = this.f31653c;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, AbstractC2803h9.a(str2, "access$getTAG$p(...)", "loadAd is called with index - ", i10));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of ad render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
        if (f54 != null) {
            String str4 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f54).a(str4, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093ycA, str4, "TAG", "loadPodAd "));
        }
        if (gestureDetectorOnGestureListenerC3093ycA.G == Cf.f31718c && gestureDetectorOnGestureListenerC3093ycA.f33633k0 != null && !gestureDetectorOnGestureListenerC3093ycA.K.get()) {
            InterfaceC2692b0 interfaceC2692b0 = gestureDetectorOnGestureListenerC3093ycA.f33633k0;
            if (interfaceC2692b0 != null) {
                interfaceC2692b0.a(i10, gestureDetectorOnGestureListenerC3093ycA);
                return;
            }
            return;
        }
        F5 f55 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
        if (f55 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f55).b(TAG, "Cannot load index pod ad as the current ad is not viewable");
        }
        gestureDetectorOnGestureListenerC3093ycA.a(false);
    }

    @JavascriptInterface
    public final void loadWebView(String str, String str2, String str3) throws JSONException {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str4 = C6.f31708a;
            ((G5) f52).a(str4, O6.a(str4, "access$getTAG$p(...)", "loadWebView called with html: ", str3));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null && gestureDetectorOnGestureListenerC3093ycA.L0) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str5 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((G5) f53).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
            if (str2 == null) {
                str2 = "";
            }
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3093yc.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA2 = a();
        if (gestureDetectorOnGestureListenerC3093ycA2 == null || gestureDetectorOnGestureListenerC3093ycA2.getPlacementType() != 1) {
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str6 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                ((G5) f54).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31651a;
            if (str2 == null) {
                str2 = "";
            }
            tu.o oVar2 = Jc.f31925a;
            JSONObject jSONObjectA2 = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC3093yc2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || sv.n0.isBlank(str2)) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc3 = this.f31651a;
            tu.o oVar3 = Jc.f31925a;
            JSONObject jSONObjectA3 = AbstractC3026ud.a("", "targetViewId", "id", "");
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            gestureDetectorOnGestureListenerC3093yc3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f31651a.a("loadWebView", Jc.a(str2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.e runnable = new zk.e(this, str2, str3, 3);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @JavascriptInterface
    public final void log(String str, String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).c(str2, O6.a(str2, "access$getTAG$p(...)", "Log called. Message:", message));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        gestureDetectorOnGestureListenerC3093yc.getClass();
        C2687ac c2687ac = GestureDetectorOnGestureListenerC3093yc.Z0;
        c2687ac.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC3093yc.f33612c1.getValue(c2687ac, C2687ac.f32653a[0])).booleanValue() || message == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3093yc.getListener().a(message);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String eventType, String str2) {
        if (eventType == null) {
            F5 f52 = this.f31653c;
            if (f52 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f52).b(str3, "eventType is null");
                return;
            }
            return;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f53).a(str4, "logTelemetryEvent is called: ".concat(eventType));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        gestureDetectorOnGestureListenerC3093yc.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        Hc hc2 = gestureDetectorOnGestureListenerC3093yc.f33613a0;
        if (hc2 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
            if (hc2.f31853g.get()) {
                return;
            }
            if (hc2.f31852f.decrementAndGet() <= 0) {
                hc2.f31853g.set(true);
                Map mapA = hc2.a();
                long j10 = hc2.f31849c;
                ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
                mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
                C2926oe c2926oe = C2926oe.f33217a;
                C2926oe.b("TemplateEventDropped", mapA, EnumC2993se.f33373a);
                return;
            }
            if (str2 != null) {
                try {
                } catch (JSONException e10) {
                    Log.e(C2926oe.f33218b, "Error parsing JSON: " + e10);
                }
                if (new JSONObject(str2).length() == 0) {
                    str2 = null;
                }
            }
            String str5 = hc2.f31847a.f31688l;
            if (str5 == null) {
                str5 = "";
            }
            Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("trigger", str5), tu.e0.to("plType", String.valueOf(hc2.f31847a.f31677a.m())), tu.e0.to("impressionId", hc2.f31847a.f31679c), tu.e0.to("markupType", hc2.f31847a.f31678b), tu.e0.to("networkType", R3.x()));
            if (str2 != null) {
                mapMutableMapOf.put("payload", str2);
            }
            if (hc2.f31847a.f31680d.length() > 0) {
                mapMutableMapOf.put("metadataBlob", hc2.f31847a.f31680d);
            }
            C2926oe.b(eventType, mapMutableMapOf, EnumC2993se.f33374b);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, AbstractC2803h9.a(str2, "access$getTAG$p(...)", "onAudioStateChanged is called: ", i10));
        }
        F1.f31761b.getClass();
        F1 f12 = (F1) F1.f31762c.get(i10);
        if (f12 == null) {
            f12 = F1.f31763d;
        }
        if (f12 != F1.f31763d) {
            this.f31651a.getListener().a(f12);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "onAudioMuteInteraction is called: " + z10);
        }
        this.f31651a.getListener().a(z10);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) throws JSONException {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc != null && !gestureDetectorOnGestureListenerC3093yc.a()) {
            this.f31651a.a("onUserInteraction");
            return;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str4 = C6.f31708a;
            ((G5) f53).a(str4, O6.a(str4, "access$getTAG$p(...)", "onUserInteraction called. Params:", str2));
        }
        if (str2 == null) {
            try {
                this.f31651a.getListener().a(new HashMap());
                return;
            } catch (Exception e10) {
                this.f31651a.a(str, "Unexpected error", "onUserInteraction");
                F5 f54 = this.f31653c;
                if (f54 != null) {
                    String str5 = C6.f31708a;
                    ((G5) f54).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                kotlin.jvm.internal.e0.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str6 = next;
                Object obj = jSONObject.get(str6);
                kotlin.jvm.internal.e0.checkNotNull(obj);
                map.put(str6, obj);
            }
            try {
                try {
                    this.f31651a.getListener().a(map);
                } catch (Exception e11) {
                    this.f31651a.a(str, "Unexpected error", "onUserInteraction");
                    F5 f55 = this.f31653c;
                    if (f55 != null) {
                        String str7 = C6.f31708a;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        ((G5) f55).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                    }
                }
            } catch (Exception e12) {
                this.f31651a.a(str, "Unexpected error", "onUserInteraction");
                F5 f56 = this.f31653c;
                if (f56 != null) {
                    String str8 = C6.f31708a;
                    ((G5) f56).b(str8, Qf.a(e12, N6.a(str8, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                }
            }
        } catch (JSONException unused) {
            this.f31651a.getListener().a(new HashMap());
        }
    }

    @JavascriptInterface
    public final void open(String str, String str2) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "open called");
        }
        if (!this.f31651a.a()) {
            this.f31651a.a("open");
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (!gestureDetectorOnGestureListenerC3093yc.L0) {
            gestureDetectorOnGestureListenerC3093yc.l();
            AbstractC2875le.a(new zk.e(this, str, str2, 5));
            return;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f53).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(String str, String str2) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "openEmbedded called");
        }
        if (!this.f31651a.a()) {
            this.f31651a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (!gestureDetectorOnGestureListenerC3093yc.L0) {
            gestureDetectorOnGestureListenerC3093yc.l();
            AbstractC2875le.a(new zk.e(this, str, str2, 0));
            return;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f53).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(String str, String url, String str2) {
        X6 x62;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "open External");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3093yc.a()) {
            this.f31651a.a("openExternal");
            return;
        }
        this.f31651a.l();
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str5 = C6.f31708a;
            ((G5) f54).a(str5, O6.a(str5, "access$getTAG$p(...)", "openExternal called with url: ", url));
        }
        Y6 y62 = this.f31651a.getLandingPageHandler().f32262f;
        if (y62 != null) {
            String strA = P6.a(url);
            S6 landingPageHandler = this.f31651a.getLandingPageHandler();
            int i10 = landingPageHandler.f32264h + 1;
            landingPageHandler.f32264h = i10;
            x62 = new X6(y62, strA, i10, 8);
        } else {
            x62 = null;
        }
        if (x62 != null) {
            x62.f32490g = "EX_NATIVE";
        }
        S6 landingPageHandler2 = this.f31651a.getLandingPageHandler();
        L6 funnelState = L6.f31990d;
        landingPageHandler2.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
        P6.a(funnelState, x62, (Integer) null, new R6(landingPageHandler2));
        S6 landingPageHandler3 = this.f31651a.getLandingPageHandler();
        landingPageHandler3.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter("openExternal", "api");
        if (url != null) {
            landingPageHandler3.e(str, url, str2, x62);
            return;
        }
        if (str2 != null) {
            landingPageHandler3.e(str, str2, null, x62);
            return;
        }
        L6 funnelState2 = L6.f31991e;
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState2, "funnelState");
        P6.a(funnelState2, x62, (Integer) 2, (kv.p) new R6(landingPageHandler3));
        C2924oc c2924oc = landingPageHandler3.f32260d;
        if (c2924oc != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("Empty url and fallback url", PglCryptUtils.KEY_MESSAGE);
            c2924oc.f33206a.a(str, "Empty url and fallback url", "openExternal");
        }
        F5 f55 = landingPageHandler3.f32263g;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f55).b("S6", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(String str, String str2) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "openWithoutTracker called");
        }
        if (!this.f31651a.a()) {
            this.f31651a.a("openWithoutTracker");
            return;
        }
        if (!this.f31651a.L0) {
            AbstractC2875le.a(new zk.e(this, str, str2, 2));
            return;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f53).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(String str, String str2, boolean z10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "ping called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                F5 f54 = this.f31653c;
                if (f54 != null) {
                    String str5 = C6.f31708a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((G5) f54).a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3100z2.f33672a.a(str2, z10, this.f31653c);
                    return;
                } catch (Exception e10) {
                    this.f31651a.a(str, "Unexpected error", "ping");
                    AbstractC2902n7.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    F5 f55 = this.f31653c;
                    if (f55 != null) {
                        String str6 = C6.f31708a;
                        ((G5) f55).b(str6, Qf.a(e10, N6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling ping() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.f31651a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String str2, boolean z10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "openInWebView called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                F5 f54 = this.f31653c;
                if (f54 != null) {
                    String str5 = C6.f31708a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((G5) f54).a(str5, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3100z2.f33672a.b(str2, z10, this.f31653c);
                    return;
                } catch (Exception e10) {
                    this.f31651a.a(str, "Unexpected error", "pingInWebView");
                    AbstractC2902n7.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    F5 f55 = this.f31653c;
                    if (f55 != null) {
                        String str6 = C6.f31708a;
                        ((G5) f55).b(str6, Qf.a(e10, N6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling pingInWebView() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.f31651a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(String str, String pingJson) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pingJson, "pingJson");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.f31651a.b(pingJson);
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "ping");
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
            gestureDetectorOnGestureListenerC3093yc.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
            F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
            if (f53 != null) {
                String str3 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                ((G5) f53).a(str3, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str3, "TAG", "handlePingException "), e10);
            }
            Ra ra2 = gestureDetectorOnGestureListenerC3093yc.f33636m;
            EnumC3000t4[] enumC3000t4Arr = EnumC3000t4.f33385a;
            ((C2991sc) ra2).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            AbstractC2902n7.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str4 = C6.f31708a;
                ((G5) f54).b(str4, Qf.a(e10, N6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling ping() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
            if (f54 != null) {
                String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f54).a(TAG, "registerBackButtonPressedEventListener " + gestureDetectorOnGestureListenerC3093yc);
            }
            gestureDetectorOnGestureListenerC3093yc.J = str;
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str4 = C6.f31708a;
                ((G5) f55).b(str4, Qf.a(e10, N6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String jsCallbackNamespace) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f52).a(str, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f53).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                L7 mediaProcessor = gestureDetectorOnGestureListenerC3093yc.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f32004d == null) {
                        C3088y7 c3088y7 = new C3088y7(new I7(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f32004d = c3088y7;
                        c3088y7.b();
                    }
                }
            } catch (Exception e10) {
                this.f31651a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                F5 f54 = this.f31653c;
                if (f54 != null) {
                    String str3 = C6.f31708a;
                    ((G5) f54).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String jsCallbackNamespace) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f52).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f53).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                L7 mediaProcessor = gestureDetectorOnGestureListenerC3093yc.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    Context contextD = C2925od.d();
                    if (contextD != null && mediaProcessor.f32005e == null) {
                        C3088y7 c3088y7 = new C3088y7(new J7(mediaProcessor, jsCallbackNamespace, contextD, new Handler(Looper.getMainLooper())));
                        mediaProcessor.f32005e = c3088y7;
                        c3088y7.b();
                    }
                }
            } catch (Exception e10) {
                this.f31651a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                F5 f54 = this.f31653c;
                if (f54 != null) {
                    String str3 = C6.f31708a;
                    ((G5) f54).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String jsCallbackNamespace) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f52).a(str, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((G5) f53).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                L7 mediaProcessor = gestureDetectorOnGestureListenerC3093yc.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f32006f == null) {
                        C3088y7 c3088y7 = new C3088y7(new H7(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f32006f = c3088y7;
                        c3088y7.b();
                    }
                }
            } catch (Exception e10) {
                this.f31651a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                F5 f54 = this.f31653c;
                if (f54 != null) {
                    String str3 = C6.f31708a;
                    ((G5) f54).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        InterfaceC2728d2 interfaceC2728d2;
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f54 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f54).a(TAG, "saveBlob");
        }
        if (str2 == null || (interfaceC2728d2 = gestureDetectorOnGestureListenerC3093yc.f33625g0) == null) {
            return;
        }
        ((U0) interfaceC2728d2).a(str2, gestureDetectorOnGestureListenerC3093yc.getImpressionId());
    }

    @JavascriptInterface
    public final void saveContent(String str, String str2, String str3) throws JSONException {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            try {
                this.f31651a.b(str, str2, str3);
                return;
            } catch (Exception e10) {
                this.f31651a.a(str, "Unexpected error", "saveContent");
                F5 f52 = this.f31653c;
                if (f52 != null) {
                    String str4 = C6.f31708a;
                    ((G5) f52).b(str4, Qf.a(e10, N6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling saveContent() request from creative; ")));
                    return;
                }
                return;
            }
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str5 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
            ((G5) f53).a(str5, "saveContent called with invalid parameters");
        }
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        try {
            jSONObject.put("url", str3);
            jSONObject.put("reason", 8);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        String strReplace$default = sv.k0.replace$default(string, "\"", "\\\"", false, 4, (Object) null);
        StringBuilder sb2 = new StringBuilder("sendSaveContentResult(\"saveContent_");
        if (str2 == null) {
            str2 = "";
        }
        this.f31651a.a(str, p0.o2.r(sb2, str2, "\", 'failed', \"", strReplace$default, "\");"));
    }

    @JavascriptInterface
    public final void sendMessage(String str, String str2, String str3) throws JSONException {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str4 = C6.f31708a;
            ((G5) f52).a(str4, O6.a(str4, "access$getTAG$p(...)", "sendMessage called with message: ", str3));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null && gestureDetectorOnGestureListenerC3093ycA.L0) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str5 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((G5) f53).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
            if (str2 == null) {
                str2 = "";
            }
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3093yc.a(C3284j8.f37009j, jSONObjectA);
            return;
        }
        if (str2 == null || sv.n0.isBlank(str2)) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31651a;
            if (str2 == null) {
                str2 = "";
            }
            tu.o oVar2 = Jc.f31925a;
            JSONObject jSONObjectA2 = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            gestureDetectorOnGestureListenerC3093yc2.a(C3284j8.f37009j, jSONObjectA2);
            return;
        }
        if (str3 == null || sv.n0.isBlank(str3)) {
            this.f31651a.a(C3284j8.f37009j, Jc.a(str2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.e runnable = new zk.e(this, str2, str3, 1);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(String str, String podAdContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(podAdContext, "podAdContext");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "setAdContext is called ", podAdContext));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null) {
            InterfaceC2692b0 adPodHandler = gestureDetectorOnGestureListenerC3093ycA.getAdPodHandler();
            if (adPodHandler != null) {
                ((U0) adPodHandler).d(podAdContext);
                return;
            }
            return;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setCloseEndCardTracker(String str, String str2) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "setCloseEndCardTracker is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3093yc.setCloseEndCardTracker(str2);
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "getDownloadStatus");
            F5 f54 = this.f31653c;
            if (f54 != null) {
                String str5 = C6.f31708a;
                ((G5) f54).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDownloadStatus() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, String orientationPropertiesString) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientationPropertiesString, "orientationPropertiesString");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "setOrientationProperties called: ", orientationPropertiesString));
        }
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.f runnable = new zk.f(this, orientationPropertiesString, 2);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(String str, int i10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, AbstractC2803h9.a(str2, "access$getTAG$p(...)", "showAd is called with index ", i10));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of ad render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
        if (f54 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f54).a(TAG, "showPodAdAtIndex " + gestureDetectorOnGestureListenerC3093ycA + ' ' + i10);
        }
        if (gestureDetectorOnGestureListenerC3093ycA.G == Cf.f31718c && gestureDetectorOnGestureListenerC3093ycA.f33633k0 != null && !gestureDetectorOnGestureListenerC3093ycA.K.get()) {
            InterfaceC2692b0 interfaceC2692b0 = gestureDetectorOnGestureListenerC3093ycA.f33633k0;
            if (interfaceC2692b0 != null) {
                interfaceC2692b0.a(i10, gestureDetectorOnGestureListenerC3093ycA, gestureDetectorOnGestureListenerC3093ycA.getFullScreenActivity());
                return;
            }
            return;
        }
        F5 f55 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
        if (f55 != null) {
            String TAG2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f55).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        gestureDetectorOnGestureListenerC3093ycA.b(false);
    }

    @JavascriptInterface
    public final void showAlert(String str, String alert) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alert, "alert");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "showAlert: ", alert));
        }
    }

    @JavascriptInterface
    public final void showEndCard(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "showEndCard is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f54 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f54).a(TAG, "showEndCardFromInterActive");
        }
        InterfaceC3063x referenceContainer = gestureDetectorOnGestureListenerC3093yc.getReferenceContainer();
        if (referenceContainer instanceof C2734d8) {
            ((C2734d8) referenceContainer).o();
        }
    }

    @JavascriptInterface
    public final void showWebView(String str, String str2) throws JSONException {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null && gestureDetectorOnGestureListenerC3093ycA.L0) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str4 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((G5) f53).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
            if (str2 == null) {
                str2 = "";
            }
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3093yc.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
            zk.f runnable = new zk.f(this, str2, 1);
            executorC3020u7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            executorC3020u7.f33447a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f31651a;
        if (str2 == null) {
            str2 = "";
        }
        tu.o oVar2 = Jc.f31925a;
        JSONObject jSONObjectA2 = AbstractC3026ud.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        gestureDetectorOnGestureListenerC3093yc2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f52).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String adQualityUrl, String enableUserAdReportScreenshot, String templateInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adQualityUrl, "adQualityUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        kotlin.jvm.internal.e0.checkNotNullParameter(templateInfo, "templateInfo");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "submitAdReport called");
        }
        this.f31651a.a(adQualityUrl, templateInfo, kotlin.jvm.internal.e0.areEqual(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    public final String supports(String str, String feature) {
        kotlin.jvm.internal.e0.checkNotNullParameter(feature, "feature");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            ((G5) f52).a(str2, O6.a(str2, "access$getTAG$p(...)", "Checking support for: ", feature));
        }
        String strValueOf = String.valueOf(this.f31651a.f(feature));
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).c(str3, "Message:" + feature + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of ad render view!");
            }
            return 0L;
        }
        F5 f54 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
        if (f54 != null) {
            String str4 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f54).c(str4, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093ycA, str4, "TAG", "timeSincePodShow "));
        }
        InterfaceC2692b0 interfaceC2692b0 = gestureDetectorOnGestureListenerC3093ycA.f33633k0;
        if (interfaceC2692b0 != null) {
            return ((U0) interfaceC2692b0).B0();
        }
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            gestureDetectorOnGestureListenerC3093ycA = this.f31651a;
        }
        try {
            gestureDetectorOnGestureListenerC3093ycA.r();
        } catch (Exception e10) {
            gestureDetectorOnGestureListenerC3093ycA.a(str, "Unexpected error", MraidUnloadCommand.NAME);
            AbstractC2902n7.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                ((G5) f53).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered an expected error in handling the unload() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31651a;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            F5 f54 = gestureDetectorOnGestureListenerC3093yc.f33628i;
            if (f54 != null) {
                String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f54).a(TAG, "unregisterBackButtonPressedEventListener " + gestureDetectorOnGestureListenerC3093yc);
            }
            gestureDetectorOnGestureListenerC3093yc.J = null;
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str4 = C6.f31708a;
                ((G5) f55).b(str4, Qf.a(e10, N6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "Unregister device mute event listener ...");
        }
        try {
            L7 mediaProcessor = this.f31651a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3088y7 c3088y7 = mediaProcessor.f32004d;
                if (c3088y7 != null) {
                    c3088y7.a();
                }
                mediaProcessor.f32004d = null;
            }
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str5 = C6.f31708a;
                ((G5) f55).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "Unregister device volume change listener ...");
        }
        try {
            L7 mediaProcessor = this.f31651a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3088y7 c3088y7 = mediaProcessor.f32005e;
                if (c3088y7 != null) {
                    c3088y7.a();
                }
                mediaProcessor.f32005e = null;
            }
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str5 = C6.f31708a;
                ((G5) f55).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f31651a == null) {
            F5 f53 = this.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f53).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        F5 f54 = this.f31653c;
        if (f54 != null) {
            String str4 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((G5) f54).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            L7 mediaProcessor = this.f31651a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3088y7 c3088y7 = mediaProcessor.f32006f;
                if (c3088y7 != null) {
                    c3088y7.a();
                }
                mediaProcessor.f32006f = null;
            }
        } catch (Exception e10) {
            this.f31651a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            F5 f55 = this.f31653c;
            if (f55 != null) {
                String str5 = C6.f31708a;
                ((G5) f55).b(str5, Qf.a(e10, N6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void useCustomClose(String str, boolean z10) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "useCustomClose called:" + z10);
        }
        new Handler(this.f31651a.getContainerContext().getMainLooper()).post(new zk.h(this, z10, str, 1));
    }

    @JavascriptInterface
    public final void zoom(String jsCallbackNamespace, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f52).a(str, "zoom is called " + jsCallbackNamespace + ' ' + i10);
        }
        AbstractC2875le.a(new com.applovin.impl.adview.p(this, i10, 10));
    }

    public static final void b(B6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.s();
        } catch (Exception e10) {
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str = C6.f31708a;
                ((G5) f52).b(str, Qf.a(e10, N6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting current position; ")));
            }
        }
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, QCmNMSGd.yGaNmawmSNjb);
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a();
        if (gestureDetectorOnGestureListenerC3093ycA != null) {
            InterfaceC2692b0 adPodHandler = gestureDetectorOnGestureListenerC3093ycA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((U0) adPodHandler).L();
            }
            return null;
        }
        F5 f53 = this.f31653c;
        if (f53 != null) {
            String str3 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((G5) f53).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        F5 f52 = this.f31653c;
        if (f52 != null) {
            String str2 = C6.f31708a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((G5) f52).a(str2, "getOrientation called");
        }
        byte bG = AbstractC2679a4.g();
        return bG == 1 ? "0" : bG == 3 ? "90" : bG == 2 ? "180" : bG == 4 ? UupKET.HQjRRYIKgdKLwbB : com.ironsource.Y1.f35726f;
    }

    @JavascriptInterface
    public final void playVideo(String str, String str2) {
        if (this.f31651a == null) {
            F5 f52 = this.f31653c;
            if (f52 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((G5) f52).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && sv.k0.startsWith$default(str2, PtLatqAYjEFT.fLwhYIWUSIUqaJ, false, 2, null) && (sv.k0.endsWith$default(str2, "mp4", false, 2, null) || sv.k0.endsWith$default(str2, "avi", false, 2, null) || sv.k0.endsWith$default(str2, "m4v", false, 2, null))) {
                F5 f53 = this.f31653c;
                if (f53 != null) {
                    String str4 = C6.f31708a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((G5) f53).a(str4, "JavaScript called: playVideo (" + str2 + ')');
                }
                new Handler(this.f31651a.getContainerContext().getMainLooper()).post(new zk.e(this, str, str2, 4));
                return;
            }
        }
        this.f31651a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    public static final void b(B6 this$0, String json) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(json, "$orientationPropertiesString");
        Ba op2 = this$0.f31651a.getOrientationProperties();
        kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.e0.checkNotNullParameter(op2, "op");
        Ba ba2 = new Ba();
        ba2.f31675d = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            String strOptString = jSONObject.optString("forceOrientation", op2.f31673b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "optString(...)");
            kotlin.jvm.internal.e0.checkNotNullParameter(strOptString, "<set-?>");
            ba2.f31673b = strOptString;
            ba2.f31672a = jSONObject.optBoolean("allowOrientationChange", op2.f31672a);
            String strOptString2 = jSONObject.optString("direction", op2.f31674c);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString2, "optString(...)");
            kotlin.jvm.internal.e0.checkNotNullParameter(strOptString2, "<set-?>");
            ba2.f31674c = strOptString2;
            if (!kotlin.jvm.internal.e0.areEqual(ba2.f31673b, "portrait") && !kotlin.jvm.internal.e0.areEqual(ba2.f31673b, "landscape")) {
                kotlin.jvm.internal.e0.checkNotNullParameter("none", "<set-?>");
                ba2.f31673b = "none";
            }
            if (!kotlin.jvm.internal.e0.areEqual(ba2.f31674c, TtmlNode.LEFT) && !kotlin.jvm.internal.e0.areEqual(ba2.f31674c, TtmlNode.RIGHT)) {
                kotlin.jvm.internal.e0.checkNotNullParameter(TtmlNode.RIGHT, "<set-?>");
                ba2.f31674c = TtmlNode.RIGHT;
            }
        } catch (JSONException unused) {
            ba2 = null;
        }
        if (ba2 != null) {
            this$0.f31651a.getWebViewFactory().a(new A6(this$0, ba2));
        }
    }

    public final void a(final String str, final String str2, final int i10, final float f10, final boolean z10, final X6 x62) {
        if (x62 != null) {
            x62.f32490g = "IN_CUSTOM";
        }
        new Handler(this.f31651a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: zk.i
            @Override // java.lang.Runnable
            public final void run() {
                B6.a(this.f98115b, x62, str2, i10, str, f10, z10);
            }
        });
    }

    public static final void a(B6 this$0, X6 x62, String expandInput, int i10, String str, float f10, boolean z10) {
        String str2;
        String str3;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(expandInput, "$expandInput");
        try {
            if (this$0.f31651a.getEmbeddedBrowserJsCallbacks() == null) {
                F5 f52 = this$0.f31653c;
                if (f52 != null) {
                    String str4 = C6.f31708a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((G5) f52).b(str4, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                S6 landingPageHandler = this$0.f31651a.getLandingPageHandler();
                L6 funnelState = L6.f31991e;
                landingPageHandler.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
                P6.a(funnelState, x62, (Integer) 8002, (kv.p) new R6(landingPageHandler));
                return;
            }
            F5 f53 = this$0.f31653c;
            if (f53 != null) {
                String str5 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((G5) f53).a(str5, "Custom expand called. Url: " + expandInput);
            }
            EnumC2764f4 enumC2764f4 = EnumC2764f4.values()[i10];
            try {
                if (enumC2764f4 == EnumC2764f4.f32833a) {
                    try {
                        int iA = this$0.f31651a.getLandingPageHandler().a("customExpand", str, expandInput, x62, null);
                        F5 f54 = this$0.f31653c;
                        if (f54 != null) {
                            String str6 = C6.f31708a;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                            ((G5) f54).a(str6, "processCustomExpandRequest: " + iA);
                        }
                        if (iA == 3) {
                            InterfaceC2781g4 embeddedBrowserJsCallbacks = this$0.f31651a.getEmbeddedBrowserJsCallbacks();
                            if (embeddedBrowserJsCallbacks != null) {
                                str3 = expandInput;
                                ((C2900n5) embeddedBrowserJsCallbacks).a(str3, enumC2764f4, f10, z10, this$0.f31651a.getViewTouchTimestamp(), x62);
                            } else {
                                str3 = expandInput;
                            }
                            S6 landingPageHandler2 = this$0.f31651a.getLandingPageHandler();
                            L6 funnelState2 = L6.f31992f;
                            landingPageHandler2.getClass();
                            kotlin.jvm.internal.e0.checkNotNullParameter(funnelState2, "funnelState");
                            P6.a(funnelState2, x62, (Integer) null, new R6(landingPageHandler2));
                            C2924oc c2924oc = this$0.f31651a.getLandingPageHandler().f32260d;
                            if (c2924oc != null) {
                                GestureDetectorOnGestureListenerC3093yc.a(c2924oc.f33206a, "customExpand", str, str3);
                                return;
                            }
                            return;
                        }
                        InterfaceC2781g4 embeddedBrowserJsCallbacks2 = this$0.f31651a.getEmbeddedBrowserJsCallbacks();
                        if (embeddedBrowserJsCallbacks2 != null) {
                            C2934p5.a(((C2900n5) embeddedBrowserJsCallbacks2).f33133a);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        str2 = str;
                        this$0.f31651a.a(str2, "Unexpected error", "customExpand");
                        S6 landingPageHandler3 = this$0.f31651a.getLandingPageHandler();
                        L6 funnelState3 = L6.f31991e;
                        landingPageHandler3.getClass();
                        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState3, "funnelState");
                        P6.a(funnelState3, x62, (Integer) 9, (kv.p) new R6(landingPageHandler3));
                        AbstractC2902n7.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
                        F5 f55 = this$0.f31653c;
                        if (f55 != null) {
                            String str7 = C6.f31708a;
                            ((G5) f55).b(str7, Qf.a(e, N6.a(str7, "access$getTAG$p(...)", "SDK encountered unexpected error in handling customExpand() request; ")));
                            return;
                        }
                        return;
                    }
                }
                InterfaceC2781g4 embeddedBrowserJsCallbacks3 = this$0.f31651a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks3 != null) {
                    ((C2900n5) embeddedBrowserJsCallbacks3).a(expandInput, enumC2764f4, f10, z10, this$0.f31651a.getViewTouchTimestamp(), x62);
                }
                S6 landingPageHandler4 = this$0.f31651a.getLandingPageHandler();
                L6 funnelState4 = L6.f31992f;
                landingPageHandler4.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(funnelState4, "funnelState");
                P6.a(funnelState4, x62, (Integer) null, new R6(landingPageHandler4));
                C2924oc c2924oc2 = this$0.f31651a.getLandingPageHandler().f32260d;
                if (c2924oc2 != null) {
                    GestureDetectorOnGestureListenerC3093yc.a(c2924oc2.f33206a, "customExpand", str, expandInput);
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            str2 = str;
        }
    }

    public static final void c(B6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.t();
        } catch (Exception e10) {
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str = C6.f31708a;
                ((G5) f52).b(str, Qf.a(e10, N6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting default position; ")));
            }
        }
    }

    public static final void c(B6 this$0, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.getSiblingWebviewManager().b(this$0.f31651a.getRoute().f32467b, str);
        } catch (Exception e10) {
            this$0.f31651a.a("showWebView", Jc.a(str, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                ((G5) f52).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling showEndCard() request from creative; ")));
            }
        }
    }

    public static final void b(B6 this$0, boolean z10, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.e(z10);
        } catch (Exception e10) {
            this$0.f31651a.a(str, "Unexpected error", MraidUseCustomCloseCommand.NAME);
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                ((G5) f52).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "SDK encountered internal error in handling useCustomClose() request from creative; ")));
            }
        }
    }

    public static final void a(B6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.f31651a.getEmbeddedBrowserJsCallbacks() == null) {
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f52).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        InterfaceC2781g4 embeddedBrowserJsCallbacks = this$0.f31651a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            C2934p5.a(((C2900n5) embeddedBrowserJsCallbacks).f33133a);
        }
    }

    public static final void a(GestureDetectorOnGestureListenerC3093yc it, B6 this$0, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            it.i();
        } catch (Exception e10) {
            this$0.f31651a.a(str, "Unexpected error", "close");
            AbstractC2902n7.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                ((G5) f52).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "SDK encountered an expected error in handling the close() request from creative; ")));
            }
        }
    }

    public static final void a(B6 this$0, boolean z10, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.d(z10);
        } catch (Exception e10) {
            this$0.f31651a.a(str, "Unexpected error", "disableCloseRegion");
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                ((G5) f52).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling disableCloseRegion() request from creative; ")));
            }
        }
    }

    public static final void a(B6 this$0, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f31651a.setInitialScale(i10);
    }

    public static final void a(B6 this$0, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.getSiblingWebviewManager().a(this$0.f31651a.getRoute().f32467b, str, str2);
        } catch (Exception e10) {
            this$0.f31651a.a("loadWebView", Jc.a(str, 308));
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str3 = C6.f31708a;
                ((G5) f52).b(str3, Qf.a(e10, N6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling loadWebView() request from creative; ")));
            }
        }
    }

    public static final void a(B6 this$0, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31651a.getSiblingWebviewManager().a(this$0.f31651a.getRoute().f32467b, str);
        } catch (Exception e10) {
            this$0.f31651a.a("destroyWebView", Jc.a(str, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            F5 f52 = this$0.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                ((G5) f52).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling destroyWebView() request from creative; ")));
            }
        }
    }
}
