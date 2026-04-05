package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import ao.kwoC.zAQQWzBxnS;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class GestureDetectorOnGestureListenerC3093yc extends Z1 implements InterfaceC3063x, InterfaceC2745e2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Ca, Sb {
    public static final C2687ac Z0 = new C2687ac();

    /* renamed from: a1, reason: collision with root package name */
    public static final Yb f33610a1 = new Yb();

    /* renamed from: b1, reason: collision with root package name */
    public static final String f33611b1 = "yc";

    /* renamed from: c1, reason: collision with root package name */
    public static final C3099z1 f33612c1 = new C3099z1((Object) Boolean.FALSE, (kv.a) Zb.f32605a, false, true);
    public JSONObject A;
    public C2815i4 A0;
    public JSONObject B;
    public InterfaceC2781g4 B0;
    public boolean C;
    public String C0;
    public boolean D;
    public Ba D0;
    public boolean E;
    public C2929p0 E0;
    public boolean F;
    public final AtomicBoolean F0;
    public Cf G;
    public boolean G0;
    public boolean H;
    public J H0;
    public boolean I;
    public String I0;
    public String J;
    public boolean J0;
    public final AtomicBoolean K;
    public cg K0;
    public final Object L;
    public boolean L0;
    public final Object M;
    public Map M0;
    public boolean N;
    public final C2738dc N0;
    public final boolean O;
    public final C3076xc O0;
    public View P;
    public String P0;
    public WebChromeClient.CustomViewCallback Q;
    public final C2924oc Q0;
    public int R;
    public final C2839jc R0;
    public boolean S;
    public final C2704bc S0;
    public boolean T;
    public boolean T0;
    public long U;
    public C2780g3 U0;
    public String V;
    public final C2941pc V0;
    public final AtomicBoolean W;
    public final C2974rc W0;
    public final C2958qc X0;
    public ag Y0;

    /* renamed from: a0, reason: collision with root package name */
    public Hc f33613a0;

    /* renamed from: b, reason: collision with root package name */
    public final byte f33614b;

    /* renamed from: b0, reason: collision with root package name */
    public final tu.o f33615b0;

    /* renamed from: c, reason: collision with root package name */
    public final Set f33616c;

    /* renamed from: c0, reason: collision with root package name */
    public Sa f33617c0;

    /* renamed from: d, reason: collision with root package name */
    public String f33618d;

    /* renamed from: d0, reason: collision with root package name */
    public final tu.o f33619d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33620e;

    /* renamed from: e0, reason: collision with root package name */
    public String f33621e0;

    /* renamed from: f, reason: collision with root package name */
    public String f33622f;

    /* renamed from: f0, reason: collision with root package name */
    public Map f33623f0;

    /* renamed from: g, reason: collision with root package name */
    public long f33624g;

    /* renamed from: g0, reason: collision with root package name */
    public InterfaceC2728d2 f33625g0;

    /* renamed from: h, reason: collision with root package name */
    public final Bc f33626h;

    /* renamed from: h0, reason: collision with root package name */
    public InterfaceC3063x f33627h0;

    /* renamed from: i, reason: collision with root package name */
    public final F5 f33628i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f33629i0;

    /* renamed from: j, reason: collision with root package name */
    public final Wc f33630j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f33631j0;

    /* renamed from: k, reason: collision with root package name */
    public final Sf f33632k;

    /* renamed from: k0, reason: collision with root package name */
    public InterfaceC2692b0 f33633k0;

    /* renamed from: l, reason: collision with root package name */
    public final S f33634l;

    /* renamed from: l0, reason: collision with root package name */
    public AbstractC3062wf f33635l0;

    /* renamed from: m, reason: collision with root package name */
    public Ra f33636m;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f33637m0;

    /* renamed from: n, reason: collision with root package name */
    public byte f33638n;

    /* renamed from: n0, reason: collision with root package name */
    public int f33639n0;

    /* renamed from: o, reason: collision with root package name */
    public final C2689ae f33640o;

    /* renamed from: o0, reason: collision with root package name */
    public String f33641o0;

    /* renamed from: p, reason: collision with root package name */
    public final tu.o f33642p;

    /* renamed from: p0, reason: collision with root package name */
    public int[] f33643p0;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f33644q;

    /* renamed from: q0, reason: collision with root package name */
    public long f33645q0;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f33646r;

    /* renamed from: r0, reason: collision with root package name */
    public int f33647r0;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference f33648s;

    /* renamed from: s0, reason: collision with root package name */
    public final C2721cc f33649s0;

    /* renamed from: t, reason: collision with root package name */
    public Ac f33650t;

    /* renamed from: t0, reason: collision with root package name */
    public final C2890mc f33651t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3008tc f33652u;

    /* renamed from: u0, reason: collision with root package name */
    public int f33653u0;

    /* renamed from: v, reason: collision with root package name */
    public String f33654v;

    /* renamed from: v0, reason: collision with root package name */
    public int f33655v0;

    /* renamed from: w, reason: collision with root package name */
    public L7 f33656w;

    /* renamed from: w0, reason: collision with root package name */
    public final F7 f33657w0;

    /* renamed from: x, reason: collision with root package name */
    public AdConfig f33658x;

    /* renamed from: x0, reason: collision with root package name */
    public final GestureDetector f33659x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f33660y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f33661y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f33662z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f33663z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC3093yc(Context context, byte b10, Set set, String str, boolean z10, String str2, long j10, Bc bc2, F5 f52, Wc route, Sf webViewFactory, S s10, int i10) {
        Set set2 = (i10 & 4) != 0 ? null : set;
        String str3 = (i10 & 8) != 0 ? null : str;
        boolean z11 = (i10 & 16) != 0 ? false : z10;
        String landingScheme = (i10 & 32) != 0 ? "DEFAULT" : str2;
        long j11 = (i10 & 64) != 0 ? -1L : j10;
        Bc bc3 = (i10 & 128) != 0 ? null : bc2;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(landingScheme, "landingScheme");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewFactory, "webViewFactory");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.f33614b = b10;
        this.f33616c = set2;
        this.f33618d = str3;
        this.f33620e = z11;
        this.f33622f = landingScheme;
        this.f33624g = j11;
        this.f33626h = bc3;
        this.f33628i = f52;
        this.f33630j = route;
        this.f33632k = webViewFactory;
        this.f33634l = s10;
        this.f33636m = new C2991sc(this);
        this.f33640o = new C2689ae(f52);
        this.f33642p = tu.q.lazy(new C3042vc(this));
        this.f33644q = new WeakReference(null);
        this.f33646r = new WeakReference(null);
        this.f33652u = new C3008tc();
        this.f33654v = "Default";
        this.C = true;
        this.D = true;
        this.F = true;
        this.G = Cf.f31716a;
        this.K = new AtomicBoolean(false);
        this.L = new Object();
        this.M = new Object();
        this.O = true;
        this.R = -1;
        this.U = Long.MIN_VALUE;
        this.W = new AtomicBoolean(false);
        tu.s sVar = tu.s.f87404c;
        this.f33615b0 = tu.q.lazy(sVar, (kv.a) new C3025uc(this));
        this.f33619d0 = tu.q.lazy(sVar, (kv.a) C2907nc.f33162a);
        this.f33649s0 = new C2721cc(this);
        this.f33651t0 = new C2890mc(this);
        this.f33653u0 = Integer.MIN_VALUE;
        this.f33655v0 = Integer.MIN_VALUE;
        this.F0 = new AtomicBoolean(true);
        this.N0 = new C2738dc(this);
        this.O0 = new C3076xc(this);
        this.P0 = "html";
        this.Q0 = new C2924oc(this, context);
        this.R0 = new C2839jc(this);
        this.S0 = new C2704bc(this);
        String TAG = f33611b1;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        Z0.getClass();
        f33612c1.a();
        this.f33627h0 = this;
        this.f33637m0 = true;
        this.D0 = new Ba();
        this.f33657w0 = new F7(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b10 == 1);
        this.f33659x0 = gestureDetector;
        if (bc3 != null) {
            this.f33613a0 = new Hc(bc3);
        }
        Wb.a(this, f52);
        if (s10 != null) {
            setAdType(s10.f32224a);
            this.T0 = s10.f32225b;
            this.U = s10.f32226c;
            this.f33631j0 = s10.f32227d;
            setCreativeId(s10.f32228e);
            this.f33633k0 = s10.f32232i;
            this.f33641o0 = s10.f32233j;
            String str4 = s10.f32230g;
            if (str4 != null) {
                this.P0 = str4;
            }
            String str5 = s10.f32231h;
            if (str5 != null) {
                setAdSize(str5);
            }
            setTelemetryManagerMap(s10.f32234k);
            String str6 = s10.f32229f;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "creativeType " + this + ' ' + str6);
            }
            this.C0 = str6;
        }
        this.V0 = new C2941pc(this);
        this.W0 = new C2974rc(this);
        this.X0 = new C2958qc(this);
        this.Y0 = (this.T0 || D2.a(context)) ? new ag(0, 44, 44, 0) : new ag(0, 0, 0, 0);
    }

    public static final void a(GestureDetectorOnGestureListenerC3093yc renderView, byte[] overlayBytes, WatermarkData watermarkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(overlayBytes, "$overlayBytes");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkData, "$watermarkData");
        if (renderView.W.get()) {
            return;
        }
        F5 f52 = renderView.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "adding overlay to renderview");
        }
        Context context = renderView.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        FrameLayout overlayLayout = Mf.a(context, overlayBytes, watermarkData.getAlpha());
        kotlin.jvm.internal.e0.checkNotNullParameter(overlayLayout, "overlayLayout");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (renderView.getParent() != null) {
            ViewParent parent = renderView.getParent();
            kotlin.jvm.internal.e0.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        renderView.W.set(true);
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.f33619d0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getMAdConfig().getMraidConfig();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final Ce getScrollThrottler() {
        return (Ce) this.f33615b0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    private final void setAdSize(String str) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).a(str2, AbstractC2823ic.a(this, str2, "TAG", "setAdSize "));
        }
        C2696b4 c2696b4 = AbstractC2679a4.f32633a;
        this.f33639n0 = (int) (AbstractC2679a4.b() * Integer.parseInt(((String[]) new sv.x("x").split(str, 0).toArray(new String[0]))[0]));
        this.f33645q0 = ((int) (AbstractC2679a4.b() * Integer.parseInt(((String[]) new sv.x("x").split(str, 0).toArray(new String[0]))[1]))) * this.f33639n0;
    }

    public final void A() {
        getListener().e(this);
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "ad dismissed");
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            ((G5) f53).a();
        }
        C2929p0 c2929p0 = this.E0;
        if (c2929p0 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adQualityManager");
            c2929p0 = null;
        }
        if (c2929p0.f33236d.get()) {
            c2929p0.a("session end is already triggered");
            return;
        }
        if (!c2929p0.f33233a.getEnabled()) {
            c2929p0.a("config kill switch - false. ad quality will skip");
        } else if (c2929p0.f33239g == null) {
            c2929p0.a("setup not done. ignore trigger");
        } else {
            c2929p0.f33236d.set(true);
            c2929p0.a(false);
        }
    }

    public final void B() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "updateActivitiesOrientationProperties "));
        }
        Activity activity = (Activity) this.f33644q.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Ba orientationProperties = this.D0;
        kotlin.jvm.internal.e0.checkNotNullParameter(orientationProperties, "orientationProperties");
        C2967r5 c2967r5 = ((InMobiAdActivity) activity).f31594a;
        if (c2967r5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("orientationHandler");
            c2967r5 = null;
        }
        c2967r5.a(orientationProperties);
    }

    public final void C() {
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).execute(new zk.h1(this, 1));
    }

    public void b() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "destroyContainer "));
        }
        h();
        this.f33632k.b(C2856kc.f33021a);
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getMAdConfig().getViewability().getOmidConfig();
        if (this.f33637m0 && omidConfig.isOmidEnabled()) {
            AbstractC3074xa.f33574a.getClass();
            if (Omid.isActive()) {
                new Cc(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void c(boolean z10) {
        C2929p0 c2929p0;
        AdQualityControl adQualityControl;
        Activity activity;
        C2929p0 c2929p02;
        AdQualityControl adQualityControl2;
        Cf cf2 = z10 ? Cf.f31718c : Cf.f31717b;
        if (this.G == cf2 || this.N) {
            return;
        }
        this.G = cf2;
        if (z10) {
            getListener().j(this);
        }
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "fireViewableChange " + this + ' ' + z10);
        }
        c("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
        C2929p0 c2929p03 = this.E0;
        if (c2929p03 != null) {
            Cf adViewableStatus = this.G;
            kotlin.jvm.internal.e0.checkNotNullParameter(adViewableStatus, "adViewableStatus");
            c2929p03.f33240h = adViewableStatus;
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str = f33611b1;
            StringBuilder sbA = N6.a(str, "TAG", "fireAQSession - ");
            sbA.append(getAdType());
            sbA.append(" type - sdk - ");
            sbA.append(Build.VERSION.SDK_INT);
            ((G5) f53).a(str, sbA.toString());
        }
        if (!kotlin.jvm.internal.e0.areEqual(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.f33644q.get()) == null) {
            C2929p0 c2929p04 = this.E0;
            if (c2929p04 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adQualityManager");
                c2929p0 = null;
            } else {
                c2929p0 = c2929p04;
            }
            c2929p0.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "adView");
            if (!c2929p0.a()) {
                c2929p0.a("session state invalid");
                return;
            }
            c2929p0.a("session start trigger...");
            c2929p0.f33235c.set(true);
            AdQualityControl adQualityControl3 = c2929p0.f33239g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = c2929p0.f33239g) == null) {
                return;
            }
            c2929p0.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (C2738dc) null);
            return;
        }
        C2929p0 c2929p05 = this.E0;
        if (c2929p05 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adQualityManager");
            c2929p02 = null;
        } else {
            c2929p02 = c2929p05;
        }
        c2929p02.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        if (!c2929p02.a()) {
            c2929p02.a("session state invalid");
            return;
        }
        c2929p02.a("session start trigger...");
        c2929p02.f33235c.set(true);
        AdQualityControl adQualityControl4 = c2929p02.f33239g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = c2929p02.f33239g) == null) {
            return;
        }
        c2929p02.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (C2738dc) null);
    }

    public final void d(String str) {
        Hc hc2 = this.f33613a0;
        if (hc2 != null) {
            hc2.b();
        }
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).a(str2, AbstractC2823ic.a(this, str2, "TAG", "loadDataInWebView "));
        }
        this.N = false;
        if (this.K.get()) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNull(str);
        loadDataWithBaseURL("", str, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, null);
    }

    public final void e(String str) {
        Hc hc2 = this.f33613a0;
        if (hc2 != null) {
            hc2.b();
        }
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).a(str2, AbstractC2823ic.a(this, str2, "TAG", "loadUrlInWebView "));
        }
        this.N = false;
        if (this.K.get() || str == null) {
            return;
        }
        loadUrl(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 com.inmobi.media.S6, still in use, count: 2, list:
          (r0v2 com.inmobi.media.S6) from 0x008e: MOVE (r18v0 com.inmobi.media.S6) = (r0v2 com.inmobi.media.S6)
          (r0v2 com.inmobi.media.S6) from 0x0042: MOVE (r18v2 com.inmobi.media.S6) = (r0v2 com.inmobi.media.S6)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // com.inmobi.media.Z1
    public final com.inmobi.media.S6 f() {
        /*
            r19 = this;
            r5 = r19
            com.inmobi.media.F5 r0 = r5.f33628i
            if (r0 == 0) goto L15
            java.lang.String r1 = com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.f33611b1
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "initLandingPageHandler "
            java.lang.String r2 = com.inmobi.media.AbstractC2823ic.a(r5, r1, r2, r3)
            com.inmobi.media.G5 r0 = (com.inmobi.media.G5) r0
            r0.a(r1, r2)
        L15:
            com.inmobi.media.T6 r2 = new com.inmobi.media.T6
            boolean r0 = r5.f33620e
            java.lang.String r1 = r5.f33622f
            com.inmobi.commons.core.configs.AdConfig r3 = r5.getAdConfig()
            boolean r3 = r3.isCCTEnabled()
            com.inmobi.commons.core.configs.AdConfig r4 = r5.getAdConfig()
            boolean r4 = r4.getPartialTabsEnabled()
            r2.<init>(r0, r1, r3, r4)
            com.inmobi.media.S6 r0 = new com.inmobi.media.S6
            android.content.Context r1 = r5.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r3)
            com.inmobi.media.jc r3 = r5.R0
            com.inmobi.media.oc r4 = r5.Q0
            boolean r6 = r5.f33620e
            if (r6 == 0) goto L46
            r6 = 0
            r18 = r0
            goto Lad
        L46:
            com.inmobi.media.Y6 r7 = new com.inmobi.media.Y6
            com.inmobi.media.Bc r6 = r5.f33626h
            if (r6 == 0) goto L55
            com.inmobi.media.a0 r6 = r6.f31677a
            if (r6 == 0) goto L55
            long r8 = r6.l()
            goto L57
        L55:
            r8 = 0
        L57:
            java.lang.String r6 = r5.getImpressionId()
            java.lang.String r10 = ""
            if (r6 != 0) goto L60
            r6 = r10
        L60:
            com.inmobi.media.Bc r11 = r5.f33626h
            if (r11 == 0) goto L6e
            com.inmobi.media.a0 r11 = r11.f31677a
            if (r11 == 0) goto L6e
            java.lang.String r11 = r11.m()
            if (r11 != 0) goto L6f
        L6e:
            r11 = r10
        L6f:
            com.inmobi.media.Bc r12 = r5.f33626h
            if (r12 == 0) goto L7d
            com.inmobi.media.a0 r12 = r12.f31677a
            if (r12 == 0) goto L7d
            java.lang.String r12 = r12.b()
            if (r12 != 0) goto L7e
        L7d:
            r12 = r10
        L7e:
            com.inmobi.media.Bc r13 = r5.f33626h
            if (r13 == 0) goto L86
            java.lang.String r14 = r13.f31678b
            if (r14 != 0) goto L87
        L86:
            r14 = r10
        L87:
            if (r13 == 0) goto L8d
            java.lang.String r15 = r13.f31682f
            if (r15 != 0) goto L8e
        L8d:
            r15 = r10
        L8e:
            r18 = r0
            if (r13 == 0) goto L98
            java.lang.String r0 = r13.f31680d
            if (r0 != 0) goto L97
            goto L98
        L97:
            r10 = r0
        L98:
            if (r13 == 0) goto L9f
            boolean r0 = r13.f31684h
        L9c:
            r16 = r0
            goto La1
        L9f:
            r0 = 0
            goto L9c
        La1:
            java.lang.String r0 = r5.f33622f
            r17 = r0
            r13 = r14
            r14 = r15
            r15 = r10
            r10 = r6
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = r7
        Lad:
            com.inmobi.media.F5 r7 = r5.f33628i
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.f():com.inmobi.media.S6");
    }

    public final void g() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "deferredDestroy "));
        }
        super.destroy();
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public AdConfig getAdConfig() {
        return getMAdConfig();
    }

    public final S getAdMetaData() {
        return this.f33634l;
    }

    public final InterfaceC2692b0 getAdPodHandler() {
        return this.f33633k0;
    }

    public final C2929p0 getAdQualityManager() {
        C2929p0 c2929p0 = this.E0;
        if (c2929p0 != null) {
            return c2929p0;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adQualityManager");
        return null;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public String getAdType() {
        return this.f33621e0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f33631j0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final String getBeaconUrl() {
        return this.I0;
    }

    public final ag getCloseAssetArea() {
        return this.Y0;
    }

    public final long getConfiguredArea() {
        return this.f33645q0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.f33644q.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final String getContentURL() {
        return this.f33641o0;
    }

    public final C2780g3 getContextualDataHandler() {
        return this.U0;
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public String getCreativeId() {
        return this.V;
    }

    public final String getCurrentPosition() {
        JSONObject jSONObject = this.B;
        String string = jSONObject != null ? jSONObject.toString() : null;
        return string == null ? "" : string;
    }

    public final Object getCurrentPositionMonitor() {
        return this.M;
    }

    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC2692b0 interfaceC2692b0 = this.f33633k0;
        if (interfaceC2692b0 != null) {
            return ((U0) interfaceC2692b0).m(this);
        }
        return 0;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        JSONObject jSONObject = this.A;
        String string = jSONObject != null ? jSONObject.toString() : null;
        return string == null ? "" : string;
    }

    public final Object getDefaultPositionMonitor() {
        return this.L;
    }

    public final InterfaceC2781g4 getEmbeddedBrowserJsCallbacks() {
        return this.B0;
    }

    public final J getExposureTracker() {
        return this.H0;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.f33623f0;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.f33644q.get();
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public InterfaceC3046w getFullScreenEventsListener() {
        return this.V0;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public String getImpressionId() {
        return this.f33618d;
    }

    public final byte getImpressionType() {
        return this.f33638n;
    }

    public final String getLandingScheme() {
        return this.f33622f;
    }

    public final Ac getListener() {
        Ac ac2 = this.f33650t;
        if (ac2 != null) {
            return ac2;
        }
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "listener getter "));
        }
        Yb yb2 = f33610a1;
        this.f33650t = yb2;
        return yb2;
    }

    public final AdConfig getMAdConfig() {
        AdConfig adConfig = this.f33658x;
        if (adConfig != null) {
            return adConfig;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mAdConfig");
        return null;
    }

    public final String getMCreativeType() {
        return this.C0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.f33655v0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.f33653u0;
    }

    public final AbstractC3062wf getMViewableAd() {
        return this.f33635l0;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public String getMarkupType() {
        return this.P0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.P0;
    }

    public final L7 getMediaProcessor() {
        return this.f33656w;
    }

    public final int getMinimumPixelsPainted() {
        return this.f33647r0;
    }

    public final String getMraidJsString() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "mraidJsString getter "));
        }
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        String strA = new C2720cb(context, "mraid_js_store").a("mraid_js_string");
        if (strA == null) {
            F5 f53 = this.f33628i;
            if (f53 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f53).a(TAG, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,e=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(e){try{e.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(e){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(e){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(e);return!1};a.popupBlocked=function(e){a.firePopupBlockedBeacon(e)};a.zeroPad=function(a){var c=\"\";10>a&&(c+=\"0\");return c+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"use CustomClose: \"+c)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.setOrientationProperties=function(e){try{e?(\"undefined\"!=typeof e.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\ne.allowOrientationChange),\"undefined\"!=typeof e.forceOrientation&&(a.orientationProperties.forceOrientation=e.forceOrientation)):e=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(c){imraidview.showAlert(\"setOrientationProperties: \"+c+\", props = \"+e)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"open: \"+c)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var c=\"\";null!=a&&(c=a);try{sdkController.playVideo(\"window.mraidview\",c)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(c){if(\"undefined\"===\ntypeof JSON){var b=\"\",f;if(\"undefined\"==typeof c.length)return a.stringifyArg(c);for(f=0;f<c.length;f++)0<f&&(b+=\",\"),b+=a.stringifyArg(c[f]);return b+\"]\"}return JSON.stringify(c)};a.stringifyArg=function(a){var c,b,g;b=typeof a;c=\"\";if(\"number\"===b||\"boolean\"===b)c+=args;else if(a instanceof Array)c=c+\"[\"+a+\"]\";else if(a instanceof Object){b=!0;c+=\"{\";for(g in a)null!==a[g]&&(b||(c+=\",\"),c=c+'\"'+g+'\":',b=typeof a[g],c=\"number\"===b||\"boolean\"===b?c+a[g]:\"function\"===typeof a[g]?c+'\"\"':a[g]instanceof\nObject?c+this.stringify(args[i][g]):c+'\"'+a[g]+'\"',b=!1);c+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),c=c+'\"'+a+'\"';imraidview.showAlert(\"json:\"+c);return c};getPID=function(a){var c=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(c=a.id);return c};a.storePicture=function(c){console.log(\"bridge: storePicture\");if(\"string\"!=typeof c)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+c+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",c);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+c+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,c){};a.fireMediaErrorEvent=function(a,c){};a.fireMediaTimeUpdateEvent=function(a,c,b){};a.fireMediaCloseEvent=function(a,c,b){};a.fireMediaVolumeChangeEvent=function(a,c,b){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var c;switch(a.orientation){case 0:case 180:c=\"portrait\";break;case 90:case 270:c=\"landscape\";break;default:c=\"none\"}return{orientation:c,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"executeNativeExpand: \"+\nc+\", URL = \"+a)}};a.setExpandProperties=function(c){try{c?this.props=c:c=null;if(\"undefined\"!=typeof c.lockOrientation&&null!=c.lockOrientation&&\"undefined\"!=typeof c.orientation&&null!=c.orientation){var b={};b.allowOrientationChange=!c.lockOrientation;b.forceOrientation=c.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(c))}catch(f){imraidview.showAlert(\"executeNativesetExpandProperties: \"+f+\", props = \"+c)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(c){var b,f;try{b=parseInt(c.width);f=parseInt(c.height);if(isNaN(b)||isNaN(f)||1>b||1>f)throw\"Invalid\";c.width=b;c.height=f;a.resizeProps=c;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(c))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(c){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nc=a.length,b=\"\",g=0;g<c;g++)b+=a[g];return parseInt(b)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;inmobi.recordEvent(136,c)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\n\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\n\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\n\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),\nb.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\n\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\n\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1;a.setOrientationProperties=function(c){try{c?(\"undefined\"!=typeof c.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=c.allowOrientationChange),\"undefined\"!=typeof c.forceOrientation&&(mraidview.orientationProperties.forceOrientation=c.forceOrientation),\"undefined\"!=typeof c.direction&&(mraidview.orientationProperties.direction=c.direction)):c=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+\nb+\", props = \"+c)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var d={};d.name=a;var f=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(f=f+\"_\"+b);window.imraid.broadcastEvent(f,d)};a.fireMediaErrorEvent=function(a,b){var d={name:\"error\"};d.code=b;var f=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(f=f+\"_\"+a);window.imraid.broadcastEvent(f,\nd)};a.fireMediaTimeUpdateEvent=function(a,b,d){var f={name:\"timeupdate\",target:{}};f.target.currentTime=b;f.target.duration=d;b=\"inmobi_media_\"+f.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.saveContent=function(a,b,d){window.imraid.addEventListener(\"saveContent_\"+a,d);sdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",\na)};a.fireGalleryImageSelectedEvent=function(a,b,d){var f=new Image;f.src=\"data:image/jpeg;base64,\"+a;f.width=b;f.height=d;window.imraid.broadcastEvent(\"galleryImageSelected\",f)};a.fireCameraPictureCatpturedEvent=function(a,b,d){var f=new Image;f.src=\"data:image/jpeg;base64,\"+a;f.width=b;f.height=d;window.imraid.broadcastEvent(\"cameraPictureCaptured\",f)};a.fireMediaCloseEvent=function(a,b,d){var f={name:\"close\"};f.viaUserInteraction=b;f.target={};f.target.currentTime=d;b=\"inmobi_media_\"+f.name;\"undefined\"!=\ntypeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.fireMediaVolumeChangeEvent=function(a,b,d){var f={name:\"volumechange\",target:{}};f.target.volume=b;f.target.muted=d;b=\"inmobi_media_\"+f.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=\nfunction(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(c,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",c,b):sdkController.openExternal(\"window.imraidview\",c)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(c){try{sdkController.log(\"window.imraidview\",c)}catch(b){a.showAlert(\"log: \"+b)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(c){try{sdkController.asyncPing(\"window.imraidview\",\nc)}catch(b){a.showAlert(\"asyncPing: \"+b)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};a.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};\na.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var c=a.getSdkVersion().split(\".\"),b=c.length,d=\"\",f=0;f<b;f++)d+=c[f];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");\nif(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(c,b,d,f){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(c){a.showAlert(\"getOrientation: \"+c)}};a.acceptAction=function(c){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(c))}catch(b){a.showAlert(\"acceptAction: \"+b+\", params = \"+c)}};a.rejectAction=function(c){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(c))}catch(b){a.showAlert(\"rejectAction: \"+\nb+\", params = \"+c)}};a.updateToPassbook=function(c){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,\narguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};\na.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,b,d){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,d)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&\nsdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&\nsdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=\nfunction(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};a.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};\na.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=function(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==\ntypeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,d){try{void 0==a||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==d||\"boolean\"!=typeof d?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",\na,b,d)}catch(f){}};a.customExpand=function(b,e,d,f,g){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==e||\"number\"!=typeof e?console.log(\"inputType called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"topNavBarVisible called with invalid params\"):void 0==g||\"boolean\"!=typeof g?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,e,d,f,g)}catch(h){a.showAlert(\"executeNativeCustomExpand: \"+\nh+\", input = \"+b+\", inputType = \"+e+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+g+\", topNavBarVisible = \"+f)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=\nfunction(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",a)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,\nvoid 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,d=void 0!=a.payload?a.payload:null;a=null;null!=d&&(a=mraidview.stringify(d));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(f){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=\nfunction(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=mraidview.getCurrentPosition(),e=b.height;return 40<=b.width&&40<=e?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};\na.loadWebView=function(b,e){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof e?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",b,e)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(e){a.showAlert(\"showWebView: \"+e)}};a.sendMessage=\nfunction(b,e){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof e?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,e)}catch(d){a.showAlert(\"sendMessage: \"+d)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(e){a.showAlert(\"destroyWebView: \"+e)}};a.pingV2=function(b){if(\"object\"===\ntypeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(e){a.showAlert(\"pingV2: \"+e)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,d,f){var g=arguments.length,h,k=null;if(3>g){if(\"function\"===typeof arguments[g-1])h=arguments[g-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!h&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,d,f)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,f,g){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,f,g)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};\na.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;\na.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;\na.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=b.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;\na.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;a.destroyWebView=b.destroyWebView;try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(f){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(e))try{m=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(f)?imIsObjValid(d)?(l=f.url,q=f.fallbackUrl,p=f.urlType,g=d.url,h=d.pingWV,k=d.fr):(l=f.url,p=f.urlType):(l=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(g)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==d?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,m=null,n=null;if(imIsObjValid(e))try{m=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(d)&&(g=d.url,h=d.pingWV,k=d.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(f)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f54).a(TAG2, "Returning fetched Mraid Js string.");
        }
        return strA;
    }

    public final Ba getOrientationProperties() {
        return this.D0;
    }

    public final long getPlacementId() {
        return this.U;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public byte getPlacementType() {
        return this.f33614b;
    }

    public InterfaceC3063x getReferenceContainer() {
        return this.f33627h0;
    }

    public final Hc getRenderViewTelemetry() {
        return this.f33613a0;
    }

    public final JSONArray getRenderableAdIndexes() {
        JSONArray jSONArrayO;
        InterfaceC2692b0 interfaceC2692b0 = this.f33633k0;
        return (interfaceC2692b0 == null || (jSONArrayO = ((U0) interfaceC2692b0).O()) == null) ? new JSONArray() : jSONArrayO;
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getMAdConfig().getRendering();
    }

    public final Wc getRoute() {
        return this.f33630j;
    }

    public final JSONObject getSafeArea() {
        cg cgVar = this.K0;
        if (cgVar != null) {
            Integer numF = AbstractC2679a4.f();
            bg bgVar = (numF == null && (numF = AbstractC2679a4.f32639g) == null) ? null : (bg) cgVar.f32720d.get(numF);
            if (bgVar != null) {
                return bgVar.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.J0;
    }

    public final long getShowTimeStamp() {
        InterfaceC2692b0 interfaceC2692b0 = this.f33633k0;
        if (interfaceC2692b0 != null) {
            return ((U0) interfaceC2692b0).P();
        }
        return 0L;
    }

    public final C3043vd getSiblingWebviewManager() {
        return (C3043vd) this.f33642p.getValue();
    }

    public Map<String, W0> getTelemetryManagerMap() {
        return this.M0;
    }

    public C3078xe getTelemetryOnAdImpression() {
        Map<String, W0> telemetryManagerMap = getTelemetryManagerMap();
        return new C3078xe(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.C0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.L0;
    }

    public final Df getVISIBILITY_CHANGE_LISTENER() {
        return this.S0;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.f33654v;
    }

    @Override // com.inmobi.media.Sb
    public long getViewTouchTimestamp() {
        return this.f33624g;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.inmobi.media.AbstractC3062wf getViewableAd() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.getViewableAd():com.inmobi.media.wf");
    }

    public final int[] getViewableFrameArray() {
        return this.f33643p0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return kotlin.jvm.internal.e0.areEqual("audio", getAdType()) ? getMAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getMAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final Sf getWebViewFactory() {
        return this.f33632k;
    }

    public final Zf getWindowInsetListener() {
        return this.O0;
    }

    public final C2689ae getWvStateMachine() {
        return this.f33640o;
    }

    public final void h() {
        if (this.K.get()) {
            return;
        }
        if (!this.F) {
            this.F = true;
            return;
        }
        this.K.set(true);
        Sf sf2 = this.f33632k;
        String id2 = this.f33630j.f32467b;
        sf2.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        sf2.f32281b.remove(id2);
        F5 f52 = sf2.f32280a;
        if (f52 != null) {
            ((G5) f52).a("SiblingWebViewManager", AbstractC2811i0.a("Unregistered bridge for WebView ID: ", id2));
        }
        cg cgVar = this.K0;
        if (cgVar != null) {
            cgVar.a();
        }
        C2780g3 c2780g3 = this.U0;
        if (c2780g3 != null) {
            c2780g3.b();
        }
        this.N = true;
        this.R = -1;
        removeJavascriptInterface("sdkController");
        L7 l72 = this.f33656w;
        if (l72 != null) {
            C3088y7 c3088y7 = l72.f32004d;
            if (c3088y7 != null) {
                c3088y7.a();
            }
            l72.f32004d = null;
            C3088y7 c3088y72 = l72.f32005e;
            if (c3088y72 != null) {
                c3088y72.a();
            }
            l72.f32005e = null;
            C3088y7 c3088y73 = l72.f32006f;
            if (c3088y73 != null) {
                c3088y73.a();
            }
            l72.f32006f = null;
        }
        this.f33644q.clear();
        this.f33646r.clear();
        WeakReference weakReference = this.f33648s;
        if (weakReference != null) {
            weakReference.clear();
        }
        AbstractC3062wf abstractC3062wf = this.f33635l0;
        if (abstractC3062wf != null) {
            abstractC3062wf.e();
        }
        AbstractC3062wf abstractC3062wf2 = this.f33635l0;
        if (abstractC3062wf2 != null) {
            abstractC3062wf2.a();
        }
        Sa sa2 = this.f33617c0;
        if (sa2 != null) {
            C2799h5 c2799h5 = Ka.f31952a;
            if (c2799h5 != null) {
                String id3 = sa2.f32270c;
                kotlin.jvm.internal.e0.checkNotNullParameter(id3, "id");
                c2799h5.f32453b.remove(id3);
                Iterator it = c2799h5.f32453b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            H3 h32 = Ka.f31953b;
            if (h32 != null) {
                String id4 = sa2.f32270c;
                kotlin.jvm.internal.e0.checkNotNullParameter(id4, "id");
                h32.f32453b.remove(id4);
                Iterator it2 = h32.f32453b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            sa2.f32271d.set(true);
        }
        this.f33617c0 = null;
        y();
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str = f33611b1;
            ((G5) f53).a(str, AbstractC2823ic.a(this, str, "TAG", "stopTrackingAudioVolume "));
        }
        C2978s c2978s = C2978s.f33335a;
        C2978s.c(this.f33628i, this.f33649s0);
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.B0 = null;
        this.f33650t = null;
        this.f33627h0 = null;
        this.f33633k0 = null;
        this.f33661y0 = false;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void i() {
        InterfaceC2692b0 interfaceC2692b0;
        Activity fullScreenActivity;
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "dismissCurrentViewContainer "));
        }
        L7 l72 = this.f33656w;
        if (l72 != null) {
            B7 b72 = l72.f32003c;
            if (b72 != null) {
                b72.b();
            }
            l72.f32003c = null;
        }
        if (kotlin.jvm.internal.e0.areEqual("Default", this.f33654v)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z10 = parent instanceof ViewGroup;
            if (z10) {
                this.f33632k.b(C2873lc.f33057a);
            }
            if (1 == this.f33614b) {
                F5 f53 = this.f33628i;
                if (f53 != null) {
                    String str2 = f33611b1;
                    ((G5) f53).a(str2, AbstractC2823ic.a(this, str2, "TAG", "finishFullScreenActivity "));
                }
                SparseArray sparseArray = InMobiAdActivity.f31591k;
                kotlin.jvm.internal.e0.checkNotNullParameter(this, "container");
                InMobiAdActivity.f31591k.remove(hashCode());
                if (getFullScreenActivity() != null) {
                    InterfaceC2692b0 interfaceC2692b02 = this.f33633k0;
                    if (interfaceC2692b02 == null || !interfaceC2692b02.a(this)) {
                        Activity fullScreenActivity2 = getFullScreenActivity();
                        kotlin.jvm.internal.e0.checkNotNull(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                        ((InMobiAdActivity) fullScreenActivity2).f31598e = true;
                        Activity fullScreenActivity3 = getFullScreenActivity();
                        if (fullScreenActivity3 != null) {
                            fullScreenActivity3.finish();
                        }
                        if (this.R != -1 && (fullScreenActivity = getFullScreenActivity()) != null) {
                            fullScreenActivity.overridePendingTransition(0, this.R);
                        }
                    }
                } else {
                    if (kotlin.jvm.internal.e0.areEqual("Default", this.f33654v)) {
                        setAndUpdateViewState("Hidden");
                    }
                    A();
                }
            } else if (z10) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.G != Cf.f31718c || (interfaceC2692b0 = this.f33633k0) == null) {
            return;
        }
        interfaceC2692b0.a(this, getFullScreenActivity());
    }

    public final void j() {
        if (this.L0) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.f33663z0 = true;
        Hc hc2 = this.f33613a0;
        if (hc2 != null) {
            Map mapA = hc2.a();
            long j10 = hc2.f31849c;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = hc2.a("FireAdFailed");
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapA, EnumC2993se.f33373a);
        }
        getListener().h(this);
    }

    public final void k() {
        if (this.K.get()) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.L0) {
            F5 f53 = this.f33628i;
            if (f53 != null) {
                String TAG2 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        Hc hc2 = this.f33613a0;
        if (hc2 != null) {
            Map mapA = hc2.a();
            long j10 = hc2.f31849c;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            mapA.put(DTBMetricReport.LATENCY, Long.valueOf(jElapsedRealtime));
            hc2.f31854h = jElapsedRealtime;
            String strA = hc2.a("FireAdReady");
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapA, EnumC2993se.f33373a);
        }
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String str = f33611b1;
            ((G5) f54).a(str, AbstractC2823ic.a(this, str, "TAG", "fireAdReady "));
        }
        this.f33661y0 = true;
        if (this.f33638n == 0) {
            m();
        }
        C();
        getListener().i(this);
    }

    public final void l() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "fireClickTrackers "));
        }
        C2780g3 c2780g3 = this.U0;
        if (c2780g3 != null && !c2780g3.f32867g.get()) {
            c2780g3.f32864d.f33003g = 1;
            kotlin.jvm.internal.e0.checkNotNull(c2780g3.f32863c);
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            ((G5) f53).a(str2, AbstractC2823ic.a(this, str2, "TAG", "fireOnUserInteraction "));
        }
        c("window.imraidview.onUserInteraction();");
        getListener().b(this);
    }

    public void m() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "fireImpression "));
        }
        if (kotlin.jvm.internal.e0.areEqual("video", this.C0) || kotlin.jvm.internal.e0.areEqual("audio", this.C0)) {
            return;
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            ((G5) f53).a(str2, AbstractC2823ic.a(this, str2, "TAG", "recordContextualData "));
        }
        C2780g3 c2780g3 = this.U0;
        if (c2780g3 != null) {
            c2780g3.a();
        }
        c("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void n() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "fullScreenActivity is not null and finishing");
            }
            tu.x0 x0Var = null;
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.a();
                x0Var = tu.x0.f87415a;
            }
            if (x0Var == null) {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean o() {
        if (kotlin.jvm.internal.e0.areEqual(getAdType(), "banner") && getAdConfig().getMraid3Config().getBannerEnabled()) {
            return true;
        }
        return kotlin.jvm.internal.e0.areEqual(getAdType(), "int") && getAdConfig().getMraid3Config().getInterstitialEnabled();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        Set linkedHashSet;
        Set<View> setKeySet;
        Activity activity;
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "onAttachedToWindow "));
        }
        super.onAttachedToWindow();
        if (!this.f33620e) {
            if (kotlin.jvm.internal.e0.areEqual(this.f33630j.f32467b, BuildConfig.FLAVOR)) {
                getListener().d(this);
            }
            if (getMAdConfig().getRendering().getEnableActivityContextOnBannerAttach() && getPlacementType() == 0) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(f33611b1, "TAG");
                toString();
                if (((Activity) this.f33646r.get()) == null) {
                    int upperBoundForActivityContext = getMAdConfig().getRendering().getUpperBoundForActivityContext();
                    kotlin.jvm.internal.e0.checkNotNullParameter(this, "<this>");
                    View view = this;
                    loop0: for (int i10 = 0; view != null && i10 < upperBoundForActivityContext; i10++) {
                        Context context = view.getContext();
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        }
                        while (context instanceof ContextWrapper) {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break loop0;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                        Object parent = view.getParent();
                        view = parent instanceof View ? (View) parent : null;
                    }
                    activity = null;
                    if (activity != null) {
                        this.f33646r = new WeakReference(activity);
                    }
                }
            }
        }
        L7 l72 = this.f33656w;
        if (l72 != null) {
            C3088y7 c3088y7 = l72.f32004d;
            if (c3088y7 != null) {
                c3088y7.b();
            }
            C3088y7 c3088y72 = l72.f32005e;
            if (c3088y72 != null) {
                c3088y72.b();
            }
            C3088y7 c3088y73 = l72.f32006f;
            if (c3088y73 != null) {
                c3088y73.b();
            }
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            ((G5) f53).c(str2, AbstractC2823ic.a(this, str2, "TAG", "setIsViewHardwareAccelerated "));
        }
        this.f33660y = isHardwareAccelerated();
        if (this.f33648s == null) {
            ViewParent parent2 = getParent();
            this.f33648s = new WeakReference(parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null);
        }
        z();
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String str3 = f33611b1;
            ((G5) f54).a(str3, AbstractC2823ic.a(this, str3, "TAG", "startTrackingExposure "));
        }
        if (!o() || this.f33620e) {
            gestureDetectorOnGestureListenerC3093yc = this;
            F5 f55 = gestureDetectorOnGestureListenerC3093yc.f33628i;
            if (f55 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f55).b(TAG, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (setKeySet = friendlyViews.keySet()) == null || (linkedHashSet = uu.y0.toMutableSet(setKeySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            gestureDetectorOnGestureListenerC3093yc = this;
            gestureDetectorOnGestureListenerC3093yc.H0 = new J(gestureDetectorOnGestureListenerC3093yc, linkedHashSet, getAdConfig().getMraid3Config().getExposureChangeInterval(), this.f33651t0, this.f33628i);
        }
        J j10 = gestureDetectorOnGestureListenerC3093yc.H0;
        if (j10 != null) {
            if (j10.f31892j.compareAndSet(false, true)) {
                Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(E2.a(new G(j10)));
                if (thM7134exceptionOrNullimpl != null) {
                    F5 f56 = j10.f31887e;
                    if (f56 != null) {
                        ((G5) f56).b("AdExposureTracker", b0.e2.o(thM7134exceptionOrNullimpl, new StringBuilder("Error starting exposure tracking - ")));
                    }
                    j10.f31892j.set(false);
                    Y5 y52 = Y5.f32563a;
                    C2796h2 event = new C2796h2(thM7134exceptionOrNullimpl);
                    kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                    Y5.f32566d.a(event);
                }
            } else {
                F5 f57 = j10.f31887e;
                if (f57 != null) {
                    ((G5) f57).c("AdExposureTracker", "Exposure tracking is already started");
                }
            }
        }
        F5 f58 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f58 != null) {
            String str4 = f33611b1;
            ((G5) f58).a(str4, AbstractC2823ic.a(this, str4, "TAG", "startTrackingAudioVolume "));
        }
        if (o() && !gestureDetectorOnGestureListenerC3093yc.f33620e) {
            C2978s c2978s = C2978s.f33335a;
            C2978s.a(gestureDetectorOnGestureListenerC3093yc.f33628i, gestureDetectorOnGestureListenerC3093yc.f33649s0);
        }
        F5 f59 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f59 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f59).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        F5 f510 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f510 != null) {
            ((G5) f510).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "onDetachedFromWindow "));
        }
        C2815i4 c2815i4 = this.A0;
        C2929p0 c2929p0 = null;
        if (c2815i4 != null) {
            C2815i4.a(c2815i4, 8, true, null, 12);
        }
        L7 l72 = this.f33656w;
        if (l72 != null) {
            C3088y7 c3088y7 = l72.f32004d;
            if (c3088y7 != null) {
                c3088y7.a();
            }
            C3088y7 c3088y72 = l72.f32005e;
            if (c3088y72 != null) {
                c3088y72.a();
            }
            C3088y7 c3088y73 = l72.f32006f;
            if (c3088y73 != null) {
                c3088y73.a();
            }
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).a(TAG, "Detached from window");
        }
        C2929p0 c2929p02 = this.E0;
        if (c2929p02 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adQualityManager");
        } else {
            c2929p0 = c2929p02;
        }
        if (c2929p0.f33236d.get()) {
            c2929p0.a("session end is already triggered");
        } else if (!c2929p0.f33233a.getEnabled()) {
            c2929p0.a("config kill switch - false. ad quality will skip");
        } else if (c2929p0.f33239g == null) {
            c2929p0.a("setup not done. ignore trigger");
        } else {
            c2929p0.f33236d.set(true);
            c2929p0.a(false);
        }
        if (this.F0.get()) {
            ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).schedule(new zk.h1(this, 0), 1L, TimeUnit.SECONDS);
        }
        z();
        y();
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String str2 = f33611b1;
            ((G5) f54).a(str2, AbstractC2823ic.a(this, str2, "TAG", "stopTrackingAudioVolume "));
        }
        C2978s c2978s = C2978s.f33335a;
        C2978s.c(this.f33628i, this.f33649s0);
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e10) {
            F5 f55 = this.f33628i;
            if (f55 != null) {
                String str3 = f33611b1;
                StringBuilder sbA = N6.a(str3, "TAG", "Detaching WebView from window encountered an error ( ");
                sbA.append(e10.getMessage());
                sbA.append(" )");
                ((G5) f55).b(str3, sbA.toString());
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        if (this.f33620e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "Double tap gesture is disabled from config");
            }
            return false;
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "onDoubleTapEvent detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e10.getAction() == 1) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(D2.c(e10.getX()));
                jSONArray.put(D2.c(e10.getY()));
            } catch (JSONException e11) {
                F5 f54 = this.f33628i;
                if (f54 != null) {
                    String TAG3 = f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f54).a(TAG3, "Exception in onDoubleTap", e11);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            c("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e22, "e2");
        if (this.f33620e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(motionEvent.getX())), Integer.valueOf(D2.c(motionEvent.getY()))})));
            jSONArray.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(e22.getX())), Integer.valueOf(D2.c(e22.getY()))})));
            jSONArray.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Float[]{Float.valueOf(f10), Float.valueOf(f11)})));
        } catch (Exception e10) {
            F5 f53 = this.f33628i;
            if (f53 != null) {
                String TAG2 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "Exception in onFling", e10);
            }
        }
        c("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        if (this.f33620e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "onLongPress detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(D2.c(e10.getX()));
            jSONArray.put(D2.c(e10.getY()));
        } catch (JSONException e11) {
            F5 f54 = this.f33628i;
            if (f54 != null) {
                String TAG3 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                ((G5) f54).a(TAG3, "Exception in onLongPress", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        c("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e22, "e2");
        boolean z10 = this.f33620e;
        if (z10 && !this.T) {
            this.T = true;
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            Z0.getClass();
            JSONObject jsonObject = C2687ac.a("IN_CUSTOM_BROWSER", "onScroll");
            kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = InMobiAdActivity.f31592l;
            if (gestureDetectorOnGestureListenerC3093yc == null) {
                return false;
            }
            gestureDetectorOnGestureListenerC3093yc.a(jsonObject);
            return false;
        }
        if (z10) {
            return false;
        }
        Ce scrollThrottler = getScrollThrottler();
        scrollThrottler.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - scrollThrottler.f31715b < scrollThrottler.f31714a) {
            scrollThrottler.f31715b = jElapsedRealtime;
            return false;
        }
        scrollThrottler.f31715b = jElapsedRealtime;
        if (!getRenderingConfig().getSupportedGestures().contains(8)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(motionEvent.getX())), Integer.valueOf(D2.c(motionEvent.getY()))})));
            jSONArray.put(new JSONArray((Collection) uu.p0.listOf((Object[]) new Integer[]{Integer.valueOf(D2.c(e22.getX())), Integer.valueOf(D2.c(e22.getY()))})));
        } catch (Exception e10) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).a(TAG, "Exception in onScroll", e10);
            }
        }
        c("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        if (this.f33620e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "Click gesture is disabled from config");
            }
            return false;
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "onSingleTapConfirmed detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(D2.c(e10.getX()));
            jSONArray.put(D2.c(e10.getY()));
        } catch (JSONException e11) {
            F5 f54 = this.f33628i;
            if (f54 != null) {
                String TAG3 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                ((G5) f54).a(TAG3, "Exception in onSingleTapConfirmed", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        c("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "onSingleTapUp detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "onSizeChanged "));
        }
        super.onSizeChanged(i10, i11, i12, i13);
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            StringBuilder sb2 = new StringBuilder("onSizeChanged (");
            sb2.append(i10);
            sb2.append(", ");
            ((G5) f53).a(TAG, e3.g.m(sb2, i11, ')'));
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        int iB = D2.b(i10 / AbstractC2679a4.b());
        int iB2 = D2.b(i11 / AbstractC2679a4.b());
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f54).a(TAG2, "fireSizeChanged " + this + " w-" + iB + " h-" + iB2);
        }
        c("window.mraidview.broadcastEvent('sizeChange'," + iB + AbstractJsonLexerKt.COMMA + iB2 + ");");
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.G0) {
                F5 f52 = this.f33628i;
                if (f52 != null) {
                    String TAG = f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.G0 = true;
            }
            return super.onTouchEvent(event);
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str = f33611b1;
            ((G5) f53).a(str, AbstractC2823ic.a(this, str, "TAG", "onTouchEvent "));
        }
        if (this.f33620e && !this.S) {
            this.S = true;
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            Z0.getClass();
            JSONObject jsonObject = C2687ac.a("IN_CUSTOM_BROWSER", "onInteraction");
            kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = InMobiAdActivity.f31592l;
            if (gestureDetectorOnGestureListenerC3093yc != null) {
                gestureDetectorOnGestureListenerC3093yc.a(jsonObject);
            }
        }
        if (this.f33614b == 1) {
            this.f33657w0.a(event);
        }
        this.f33659x0.onTouchEvent(event);
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWindowFocusChanged(boolean r5) {
        /*
            r4 = this;
            com.inmobi.media.F5 r0 = r4.f33628i
            if (r0 == 0) goto L26
            java.lang.String r1 = com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.f33611b1
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onWindowFocusChanged "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " - "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.inmobi.media.G5 r0 = (com.inmobi.media.G5) r0
            r0.a(r1, r2)
        L26:
            super.onWindowFocusChanged(r5)
            r0 = 1
            if (r5 == 0) goto L48
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L47
            com.inmobi.media.V4 r5 = com.inmobi.media.Y4.f32552k
            int r1 = r4.f33655v0
            r2 = 0
            boolean r1 = r5.a(r4, r4, r1, r2)
            if (r1 == 0) goto L47
            int r1 = r4.f33655v0
            boolean r5 = r5.a(r4, r4, r1)
            if (r5 == 0) goto L47
            r5 = r0
            goto L48
        L47:
            r5 = 0
        L48:
            android.app.Activity r1 = r4.getFullScreenActivity()
            if (r1 == 0) goto L55
            boolean r1 = r1.isInMultiWindowMode()
            if (r1 != r0) goto L55
            return
        L55:
            r4.c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.onWindowFocusChanged(boolean):void");
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "onWindowVisibilityChanged " + this + ' ' + i10);
        }
        super.onWindowVisibilityChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (z11) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                V4 v42 = Y4.f32552k;
                if (v42.a(this, this, visibilityTrackingMinPercentage, null) && v42.a(this, this, visibilityTrackingMinPercentage)) {
                    z10 = true;
                }
            }
        } else {
            z10 = z11;
        }
        c(z10);
    }

    public void p() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "onImpressionFired "));
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            ((G5) f53).a(str2, AbstractC2823ic.a(this, str2, "TAG", "recordContextualData "));
        }
        C2780g3 c2780g3 = this.U0;
        if (c2780g3 != null) {
            c2780g3.a();
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void q() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "onUserLandingCompleted "));
        }
        c("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void s() throws JSONException {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setCurrentPosition "));
        }
        this.B = new JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            JSONObject jSONObject = this.B;
            if (jSONObject != null) {
                jSONObject.put("x", D2.b(r0[0] / AbstractC2679a4.b()));
            }
            JSONObject jSONObject2 = this.B;
            if (jSONObject2 != null) {
                jSONObject2.put("y", D2.b(r0[1] / AbstractC2679a4.b()));
            }
            int iB = D2.b(getWidth() / AbstractC2679a4.b());
            int iB2 = D2.b(getHeight() / AbstractC2679a4.b());
            JSONObject jSONObject3 = this.B;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.B;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.M) {
            this.D = false;
            this.M.notifyAll();
        }
    }

    public final void setAdPodHandler(InterfaceC2692b0 interfaceC2692b0) {
        this.f33633k0 = interfaceC2692b0;
    }

    public void setAdType(String str) {
        this.f33621e0 = str;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.f33631j0 = z10;
    }

    public final void setAndUpdateViewState(String state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setAndUpdateViewState "));
        }
        this.f33654v = state;
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            StringBuilder sbA = N6.a(str2, "TAG", "set state:");
            sbA.append(this.f33654v);
            ((G5) f53).a(str2, sbA.toString());
        }
        Locale locale = Locale.ENGLISH;
        String strP = b0.e2.p(locale, "ENGLISH", state, locale, "this as java.lang.String).toLowerCase(locale)");
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f54).a(TAG, "fireStateChange " + this + ' ' + strP);
        }
        c("window.mraidview.broadcastEvent('stateChange','" + strP + "');");
    }

    public final void setBackButtonDisabled(boolean z10) {
        this.I = z10;
    }

    public final void setBeaconUrl(String str) {
        this.I0 = str;
    }

    public final void setBlobProvider(InterfaceC2728d2 interfaceC2728d2) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setBlobProvider "));
        }
        this.f33625g0 = interfaceC2728d2;
    }

    public final void setCloseAssetArea(ag value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (!this.T0) {
            Context context = getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
            if (!D2.a(context)) {
                return;
            }
        }
        this.Y0 = new ag(0, value.f32660b, value.f32661c, 0);
    }

    public final void setCloseEndCardTracker(String url) {
        InterfaceC3028uf interfaceC3028ufD;
        C2859kf c2859kf;
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "setCloseEndCardTracker "));
        }
        InterfaceC3063x referenceContainer = getReferenceContainer();
        if (!(referenceContainer instanceof C2853k9) || url == null) {
            return;
        }
        C2853k9 c2853k9 = (C2853k9) referenceContainer;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f53 = c2853k9.W;
        if (f53 != null) {
            String str2 = c2853k9.X;
            ((G5) f53).c(str2, O6.a(str2, "TAG", "Setting close end tracker with URL : ", url));
        }
        View videoContainerView = c2853k9.getVideoContainerView();
        if (videoContainerView instanceof C3056w9) {
            Object tag = ((C3056w9) videoContainerView).getVideoView().getTag();
            C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
            if (c2887m9 == null || (interfaceC3028ufD = c2887m9.d()) == null || (c2859kf = ((C3011tf) interfaceC3028ufD).f33414j) == null) {
                return;
            }
            C2752e9 tracker = new C2752e9(url, 0, "closeEndCard", null);
            kotlin.jvm.internal.e0.checkNotNullParameter(tracker, "tracker");
            c2859kf.f33030f.add(tracker);
        }
    }

    public final void setConfiguredArea(long j10) {
        this.f33645q0 = getWidth() * getHeight();
    }

    public final void setContentURL(String str) {
        this.f33641o0 = str;
    }

    public final void setContextualDataHandler(C2780g3 c2780g3) {
        this.U0 = c2780g3;
    }

    public void setCreativeId(String str) {
        this.V = str;
    }

    public final void setEmbeddedBrowserJsCallbacks(InterfaceC2781g4 interfaceC2781g4) {
        this.B0 = interfaceC2781g4;
    }

    public void setExitAnimation(int i10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setExitAnimation "));
        }
        this.R = i10;
    }

    public final void setExposureTracker(J j10) {
        this.H0 = j10;
    }

    public void setFriendlyViews(Map<View, FriendlyObstructionPurpose> map) {
        this.f33623f0 = map;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public void setFullScreenActivityContext(Activity activity) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "setFullScreenActivityContext "));
        }
        this.f33644q = new WeakReference(activity);
        B();
        if (this.f33620e || activity == null) {
            return;
        }
        cg cgVar = this.K0;
        if (cgVar != null) {
            cgVar.a();
        }
        this.K0 = new cg(activity, this.O0, this.f33628i);
    }

    public final void setImmersiveMode(boolean z10) {
        this.T0 = z10;
    }

    public void setImpressionId(String str) {
        this.f33618d = str;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(X6 x62) {
        C2815i4 c2815i4 = this.A0;
        if (c2815i4 == null) {
            return;
        }
        c2815i4.f32923j = x62;
        c2815i4.f32924k = new U6(x62, c2815i4);
    }

    public final void setLandingScheme(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f33622f = str;
    }

    public final void setMAdConfig(AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "<set-?>");
        this.f33658x = adConfig;
    }

    public final void setMCreativeType(String str) {
        this.C0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i10) {
        this.f33655v0 = i10;
    }

    public final void setMImpressionMinTimeViewed(int i10) {
        this.f33653u0 = i10;
    }

    public final void setMViewableAd(AbstractC3062wf abstractC3062wf) {
        this.f33635l0 = abstractC3062wf;
    }

    public final void setMarkupTypeAdUnit(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.P0 = str;
    }

    public final void setOrientationProperties(Ba ba2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ba2, "<set-?>");
        this.D0 = ba2;
    }

    public final void setPingAckListener(Ra pingAckListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pingAckListener, "pingAckListener");
        this.f33636m = pingAckListener;
    }

    public final void setPingManager(Sa pingManager) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pingManager, "pingManager");
        this.f33617c0 = pingManager;
    }

    public final void setPlacementId(long j10) {
        this.U = j10;
    }

    public final void setPreloadView(boolean z10) {
        this.f33629i0 = z10;
    }

    public void setReferenceContainer(InterfaceC3063x interfaceC3063x) {
        this.f33627h0 = interfaceC3063x;
    }

    public final void setRenderViewEventListener(Ac ac2) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setRenderViewEventListener "));
        }
        this.f33650t = ac2;
    }

    public final void setRenderViewTelemetry(Hc hc2) {
        this.f33613a0 = hc2;
    }

    public final void setScrollable(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setScrollable "));
        }
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setShouldFireLandingPageBeacons(boolean z10) {
        this.J0 = z10;
    }

    public void setTelemetryManagerMap(Map<String, W0> map) {
        this.M0 = map;
    }

    public final void setUnloaded(boolean z10) {
        this.L0 = z10;
    }

    public final void setUseCustomClose(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "setUseCustomClose " + this + ' ' + z10);
        }
        this.E = z10;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f33624g = j10;
    }

    public final void setWatermark(WatermarkData watermarkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkData, "watermarkData");
        if (getAdConfig().getWatermarkEnabled()) {
            byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            getViewTreeObserver().addOnGlobalLayoutListener(new com.applovin.impl.x8(this, 1, bArrDecode, watermarkData));
        } else {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "Watermark disabled from config. ignoring...");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "stopLoading "));
        }
        if (this.K.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() throws JSONException {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "setDefaultPosition "));
        }
        int[] iArr = new int[2];
        this.A = new JSONObject();
        if (this.f33648s == null) {
            ViewParent parent = getParent();
            this.f33648s = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.f33648s;
        try {
            if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
                WeakReference weakReference2 = this.f33648s;
                if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                    viewGroup3.getLocationOnScreen(iArr);
                }
                JSONObject jSONObject = this.A;
                if (jSONObject != null) {
                    jSONObject.put("x", D2.b(iArr[0] / AbstractC2679a4.b()));
                }
                JSONObject jSONObject2 = this.A;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", D2.b(iArr[1] / AbstractC2679a4.b()));
                }
                WeakReference weakReference3 = this.f33648s;
                int iB = D2.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / AbstractC2679a4.b());
                WeakReference weakReference4 = this.f33648s;
                int iB2 = D2.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / AbstractC2679a4.b());
                JSONObject jSONObject3 = this.A;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.A;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } else {
                JSONObject jSONObject5 = this.A;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.A;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.A;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.A;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            }
        } catch (JSONException unused) {
        }
        synchronized (this.L) {
            this.C = false;
            this.L.notifyAll();
        }
    }

    public final void u() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "setFallbackImpressionMinPercentageViewed "));
        }
        int webImpressionMinPercentageViewed = kotlin.jvm.internal.e0.areEqual("video", this.C0) ? getMAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : (kotlin.jvm.internal.e0.areEqual("audio", this.C0) && kotlin.jvm.internal.e0.areEqual("audio", getAdType())) ? getMAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getMAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        this.f33655v0 = webImpressionMinPercentageViewed;
    }

    public final void v() {
        int webImpressionMinTimeViewed = kotlin.jvm.internal.e0.areEqual("video", this.C0) ? getMAdConfig().getViewability().getVideoImpressionMinTimeViewed() : (kotlin.jvm.internal.e0.areEqual("audio", this.C0) && kotlin.jvm.internal.e0.areEqual("audio", getAdType())) ? getMAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getMAdConfig().getViewability().getWebImpressionMinTimeViewed();
        this.f33653u0 = webImpressionMinTimeViewed;
    }

    public final void w() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "setFallbackImpressionParams "));
        }
        v();
        u();
        x();
    }

    public final void x() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "setFallbackImpressionType "));
        }
        String adType = getAdType();
        this.f33638n = kotlin.jvm.internal.e0.areEqual(adType, "banner") ? getMAdConfig().getViewability().getBannerImpressionType() : kotlin.jvm.internal.e0.areEqual(adType, "audio") ? getMAdConfig().getViewability().getAudioImpressionType() : getMAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void y() {
        F5 f52;
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str = f33611b1;
            ((G5) f53).a(str, AbstractC2823ic.a(this, str, "TAG", "stopTrackingExposure "));
        }
        J j10 = this.H0;
        if (j10 != null) {
            if (!j10.f31892j.compareAndSet(true, false)) {
                F5 f54 = j10.f31887e;
                if (f54 != null) {
                    ((G5) f54).c("AdExposureTracker", "Exposure tracking is already stopped");
                    return;
                }
                return;
            }
            Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(E2.a(new H(j10)));
            if (thM7134exceptionOrNullimpl == null || (f52 = j10.f31887e) == null) {
                return;
            }
            ((G5) f52).b("AdExposureTracker", b0.e2.o(thM7134exceptionOrNullimpl, new StringBuilder("Error stopping exposure tracking - ")));
        }
    }

    public final void z() {
        new C2(this, !this.E, !this.H, this.f33628i).a(this.Y0);
    }

    public final void r() {
        F5 f52 = this.f33628i;
        String str = OcvDtWCQ.MUUbIXvYniJUx;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).a(str2, AbstractC2823ic.a(this, str2, str, "processUnload "));
        }
        if (this.K.get()) {
            F5 f53 = this.f33628i;
            if (f53 != null) {
                String str3 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, str);
                ((G5) f53).b(str3, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!o()) {
            F5 f54 = this.f33628i;
            if (f54 != null) {
                String str4 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str4, str);
                ((G5) f54).b(str4, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.f33663z0) {
            F5 f55 = this.f33628i;
            if (f55 != null) {
                String str5 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str5, str);
                ((G5) f55).b(str5, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.L0) {
            return;
        }
        this.L0 = true;
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.h1 runnable = new zk.h1(this, 2);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    public final void setDisableBackButton(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, zAQQWzBxnS.nqKQ, "setDisableBackButton "));
        }
        this.I = z10;
    }

    public final void d(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "processDisableCloseRegionRequest " + this + ' ' + z10);
        }
        this.H = z10;
        z();
    }

    public final void e(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "processUseCustomCloseRequest " + this + ' ' + z10);
        }
        setUseCustomClose(z10);
        z();
    }

    public final void a(String url, String templateInfoStr, boolean z10) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        Exception exc;
        Activity activity;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            F5 f52 = this.f33628i;
            if (f52 != null) {
                try {
                    String TAG = f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
                } catch (Exception e10) {
                    exc = e10;
                    gestureDetectorOnGestureListenerC3093yc = this;
                }
            }
            if (kotlin.jvm.internal.e0.areEqual(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.f33644q.get()) != null) {
                ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
                try {
                    C2777g0.a(activity, this, url, z10, jSONObject, this.N0);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    gestureDetectorOnGestureListenerC3093yc = this;
                }
            } else {
                gestureDetectorOnGestureListenerC3093yc = this;
                try {
                    ScheduledExecutorService scheduledExecutorService2 = C2777g0.f32850a;
                    C2777g0.a(gestureDetectorOnGestureListenerC3093yc, this, url, z10, jSONObject, gestureDetectorOnGestureListenerC3093yc.N0);
                    return;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        } catch (Exception e13) {
            e = e13;
            gestureDetectorOnGestureListenerC3093yc = this;
        }
        exc = e;
        F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f53 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "issue wile reporting ad", exc);
        }
    }

    @Override // com.inmobi.media.Sb
    public final boolean d() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final void e() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "disableHardwareAcceleration called. "));
        }
        try {
            setLayerType(1, null);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static final void b(GestureDetectorOnGestureListenerC3093yc this$0, String js2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(js2, "$js");
        try {
            if (this$0.K.get()) {
                return;
            }
            String str = "javascript:try{" + js2 + "}catch(e){}";
            F5 f52 = this$0.f33628i;
            if (f52 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).a(TAG, "Injecting javascript");
            }
            F5 f53 = this$0.f33628i;
            if (f53 != null) {
                String TAG2 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).c(TAG2, "evaluateScript " + this$0);
            }
            this$0.evaluateJavascript(str, null);
        } catch (Exception e10) {
            F5 f54 = this$0.f33628i;
            if (f54 != null) {
                String str2 = f33611b1;
                ((G5) f54).b(str2, Qf.a(e10, N6.a(str2, "TAG", "SDK encountered an unexpected error injecting JavaScript in the Ad container; ")));
            }
        }
    }

    public static final void a(GestureDetectorOnGestureListenerC3093yc this$0) {
        F5 f52;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.isAttachedToWindow() || (f52 = this$0.f33628i) == null) {
            return;
        }
        ((G5) f52).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.inmobi.media.Ac r24, com.inmobi.commons.core.configs.AdConfig r25) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.a(com.inmobi.media.Ac, com.inmobi.commons.core.configs.AdConfig):void");
    }

    public final void b(String str, String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).a(str2, AbstractC2823ic.a(this, str2, "TAG", "processMediaPlaybackRequest "));
        }
        if (this.L0) {
            F5 f53 = this.f33628i;
            if (f53 != null) {
                String TAG = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f53).b(TAG, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.f33614b) {
            F5 f54 = this.f33628i;
            if (f54 != null) {
                String TAG2 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f54).b(TAG2, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f33644q.get();
        if (activity == null) {
            F5 f55 = this.f33628i;
            if (f55 != null) {
                String TAG3 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                ((G5) f55).b(TAG3, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        L7 l72 = this.f33656w;
        if (l72 != null) {
            l72.a(url, activity);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6.equals("html5video") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r5.f33660y == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        if (r5.O == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        r6 = r5.f33628i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r6 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.f33611b1;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, "TAG");
        ((com.inmobi.media.G5) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3093yc.f(java.lang.String):boolean");
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final boolean c() {
        return this.K.get();
    }

    public final void c(String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "js");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.g1 runnable = new zk.g1(1, this, value);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.removeCallbacks(runnable);
        executorC3020u7.f33447a.postAtFrontOfQueue(runnable);
    }

    public static final void b(GestureDetectorOnGestureListenerC3093yc this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.getListener().k(this$0);
    }

    public final void b(String str, String contentId, String url) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentId, "contentId");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).c(str2, AbstractC2823ic.a(this, str2, "TAG", "processSaveContentRequest "));
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).a(TAG, "saveContent called: content ID: " + contentId + "; URL: " + url);
        }
        if (!f("saveContent")) {
            F5 f54 = this.f33628i;
            if (f54 != null) {
                String TAG2 = f33611b1;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f54).b(TAG2, "saveContent called despite the fact that it is not supported");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", url);
                jSONObject.put("reason", 7);
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            a(str, e3.g.l("sendSaveContentResult(\"saveContent_", contentId, "\", 'failed', \"", sv.k0.replace$default(string, "\"", "\\\"", false, 4, (Object) null), "\");"));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(new Rb((byte) -1, url));
        C2843k c2843k = new C2843k(w0.i.c("toString(...)"), hashSet, this.X0, contentId, 2);
        c2843k.f32987c = str;
        C3031v1.a(c2843k);
    }

    public static final void c(GestureDetectorOnGestureListenerC3093yc this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f33652u) {
            try {
                if (kotlin.jvm.internal.e0.areEqual("Loading", this$0.f33654v)) {
                    F5 f52 = this$0.f33628i;
                    if (f52 != null) {
                        String TAG = f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                        ((G5) f52).a(TAG, "updateWebViewLoaded " + this$0);
                    }
                    this$0.getListener().g(this$0);
                    this$0.setAndUpdateViewState("Default");
                    F5 f53 = this$0.f33628i;
                    if (f53 != null) {
                        String TAG2 = f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f53).a(TAG2, "updateWebViewLoaded state changed to " + this$0.f33654v);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "fireNextAdShowComplete "));
        }
        String str2 = "window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");";
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).a(TAG, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        c(str2);
    }

    public final void b(String json) {
        kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
        if (getAdConfig().getPingsV2Config().getEnabled()) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String str = f33611b1;
                ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "handlePing "));
            }
            if (this.f33617c0 == null) {
                this.f33617c0 = new Sa(this.f33636m, this.f33613a0);
            }
            Sa sa2 = this.f33617c0;
            kotlin.jvm.internal.e0.checkNotNull(sa2);
            sa2.b(json);
            return;
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            ((G5) f53).a(str2, AbstractC2823ic.a(this, str2, "TAG", "pings v2 is disabled "));
        }
        Hc hc2 = this.f33613a0;
        if (hc2 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = hc2.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            Ya.a("PingFailed", mapA);
        }
        Ra ra2 = this.f33636m;
        EnumC3000t4[] enumC3000t4Arr = EnumC3000t4.f33385a;
        ((C2991sc) ra2).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    @Override // com.inmobi.media.InterfaceC3063x
    public final void a(byte b10, Map map) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "fireEvent " + this + " 2");
        }
    }

    @Override // com.inmobi.media.Sb
    public final void a(String mraidApi) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidApi, "mraidApi");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "sendFraudBeaconAndTelemetryEvent "));
        }
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).a(TAG, "fireDetectAutoRedirectFraud " + this + ' ' + mraidApi);
        }
        c("window.mraidview.fireRedirectFraudBeacon('" + mraidApi + "')");
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        F5 f54 = this.f33628i;
        if (f54 != null) {
            String TAG2 = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f54).c(TAG2, "sendTelemetryForAutoRedirectFraud " + this + ' ' + mraidApi + ' ' + adType);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", mraidApi);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        map.put("adType", adType);
        F5 f55 = this.f33628i;
        if (f55 != null) {
            String str2 = f33611b1;
            ((G5) f55).a(str2, AbstractC2823ic.a(this, str2, "TAG", "processTelemetryEvent "));
        }
        getListener().a("BlockAutoRedirection", map);
    }

    public final void a(boolean z10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "fireNextAdLoadComplete "));
        }
        String str2 = "window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");";
        F5 f53 = this.f33628i;
        if (f53 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).c(TAG, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        c(str2);
    }

    public final void a(String str, JSONObject message) {
        short s10;
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "fireError " + this + " - " + message);
        }
        c("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        Object objA = E2.a(new C3059wc(message.optString(IronSourceConstants.EVENTS_ERROR_CODE)));
        if (tu.z.m7137isSuccessimpl(objA)) {
            short sShortValue = ((Number) objA).shortValue();
            Hc hc2 = this.f33613a0;
            if (hc2 != null) {
                Map mapA = hc2.a();
                switch (sShortValue) {
                    case 101:
                        s10 = 2261;
                        break;
                    case 102:
                        s10 = 2262;
                        break;
                    case 103:
                        s10 = 2263;
                        break;
                    case 104:
                        s10 = 2267;
                        break;
                    case 105:
                        s10 = 2266;
                        break;
                    case 106:
                        s10 = 2265;
                        break;
                    case 107:
                        s10 = 2264;
                        break;
                    default:
                        switch (sShortValue) {
                            case MRAID_ERROR_VALUE:
                                s10 = 2268;
                                break;
                            case INVALID_IFA_STATUS_VALUE:
                                s10 = 2269;
                                break;
                            case 303:
                                s10 = 2270;
                                break;
                            case AD_EXPIRED_VALUE:
                                s10 = 2271;
                                break;
                            case MRAID_BRIDGE_ERROR_VALUE:
                                s10 = 2272;
                                break;
                            case 306:
                                s10 = 2273;
                                break;
                            case 307:
                                s10 = 2274;
                                break;
                            case 308:
                                s10 = 2275;
                                break;
                            case ASSET_FAILED_TO_DELETE_VALUE:
                                s10 = 2276;
                                break;
                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                s10 = 2277;
                                break;
                            case MRAID_JS_CALL_EMPTY_VALUE:
                                s10 = 2278;
                                break;
                            case DEEPLINK_OPEN_FAILED_VALUE:
                                s10 = 2280;
                                break;
                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                s10 = 2281;
                                break;
                            default:
                                s10 = sShortValue;
                                break;
                        }
                }
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
                long j10 = hc2.f31849c;
                ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
                mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
                C2926oe c2926oe = C2926oe.f33217a;
                C2926oe.b("CompanionWebViewLoadFailed", mapA, EnumC2993se.f33373a);
            }
        }
    }

    public final void a(String str, String message, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            StringBuilder sb2 = new StringBuilder("fireError ");
            sb2.append(this);
            sb2.append(" - ");
            ((G5) f52).a(TAG, a.b.o(sb2, message, " - ", str2));
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, e3.g.l("broadcastEvent('error',\"", message, "\", \"", str2, "\")"));
    }

    public final void a(String str, String callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str2 = f33611b1;
            ((G5) f52).a(str2, AbstractC2823ic.a(this, str2, "TAG", "fireJavaScriptCallback "));
        }
        if (str == null) {
            return;
        }
        c(str + '.' + callback);
    }

    public void a(Ba orientationProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientationProperties, "orientationProperties");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "setOrientationProperties "));
        }
        this.D0 = orientationProperties;
        B();
    }

    @Override // com.inmobi.media.Ca
    public final void a(EnumC3108za orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "onOrientationUpdate "));
        }
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, JsResult jsResult) {
        F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str, "TAG", "shouldRenderPopup "));
        }
        if (gestureDetectorOnGestureListenerC3093yc.getRenderingConfig().shouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f53 != null) {
            String str2 = f33611b1;
            ((G5) f53).a(str2, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str2, "TAG", "firePopupBlockedEvent "));
        }
        gestureDetectorOnGestureListenerC3093yc.c("window.mraidview.popupBlocked('popupBlocked')");
        return false;
    }

    @Override // com.inmobi.media.Sb
    public final boolean a() {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            StringBuilder sbA = N6.a(str, "TAG", "hasUserInteracted ");
            sbA.append(getViewTouchTimestamp());
            sbA.append(' ');
            sbA.append(getRenderingConfig().getUserTouchResetTime());
            ((G5) f52).a(str, sbA.toString());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.f33631j0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public static final void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, String str, String str2, String str3) {
        F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "onUserLandingInitialized " + gestureDetectorOnGestureListenerC3093yc + " isInAppBrowser: " + gestureDetectorOnGestureListenerC3093yc.f33620e);
        }
        gestureDetectorOnGestureListenerC3093yc.c("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3093yc.a(str2, e3.g.l("broadcastEvent('", str, "Successful','", str3, "');"));
    }

    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            F5 f52 = this.f33628i;
            if (f52 != null) {
                String str = f33611b1;
                ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "onLpLifeCycleEvent "));
            }
            c("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void a(String trackerName, Map macros) {
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(this, str, "TAG", "fireLandingPageTracker "));
        }
        getListener().a(this, trackerName, macros);
    }

    public final void a(boolean z10, short s10) {
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String TAG = f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        Hc hc2 = this.f33613a0;
        if (hc2 != null) {
            String strA = hc2.a("WebViewRenderProcessGoneEvent");
            String str = hc2.f31847a.f31688l;
            if (str == null) {
                str = "";
            }
            tu.v vVar = tu.e0.to("trigger", str);
            long j10 = hc2.f31849c;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            Map mapMutableMapOf = uu.p1.mutableMapOf(vVar, tu.e0.to(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10)), tu.e0.to("source", "render_view_" + hc2.f31847a.f31677a.b()), tu.e0.to("isCrashed", Boolean.valueOf(z10)), tu.e0.to("creativeId", hc2.f31847a.f31683g), tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)));
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapMutableMapOf, EnumC2993se.f33373a);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3093yc sourceView, String targetId) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceView, "sourceView");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetId, "targetId");
        F5 f52 = this.f33628i;
        if (f52 != null) {
            String str = f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(this, str, "TAG", "fireShowWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.c("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }
}
