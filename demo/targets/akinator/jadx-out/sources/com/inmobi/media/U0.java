package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.U0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class U0 extends Ac implements InterfaceC2728d2, De, InterfaceC2994sf, InterfaceC2692b0 {
    public static final /* synthetic */ int O = 0;
    public boolean A;
    public String B;
    public final A C;
    public O D;
    public C2884m6 E;
    public E7 F;
    public final Handler G;
    public final LinkedHashMap H;
    public final W0 I;
    public WatermarkData J;
    public final tu.o K;
    public boolean L;
    public final M0 M;
    public final AtomicBoolean N;

    /* renamed from: a, reason: collision with root package name */
    public byte f32312a;

    /* renamed from: b, reason: collision with root package name */
    public AdConfig f32313b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f32314c;

    /* renamed from: d, reason: collision with root package name */
    public Me f32315d;

    /* renamed from: e, reason: collision with root package name */
    public D0 f32316e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f32317f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f32318g;

    /* renamed from: h, reason: collision with root package name */
    public C2734d8 f32319h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f32320i;

    /* renamed from: j, reason: collision with root package name */
    public F5 f32321j;

    /* renamed from: k, reason: collision with root package name */
    public byte f32322k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f32323l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32324m;

    /* renamed from: n, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3093yc f32325n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32326o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32327p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32328q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32329r;

    /* renamed from: s, reason: collision with root package name */
    public C2888ma f32330s;

    /* renamed from: t, reason: collision with root package name */
    public C2675a0 f32331t;

    /* renamed from: u, reason: collision with root package name */
    public A0 f32332u;

    /* renamed from: v, reason: collision with root package name */
    public Fe f32333v;

    /* renamed from: w, reason: collision with root package name */
    public int f32334w;

    /* renamed from: x, reason: collision with root package name */
    public int f32335x;

    /* renamed from: y, reason: collision with root package name */
    public long f32336y;

    /* renamed from: z, reason: collision with root package name */
    public TreeSet f32337z;

    public U0(Context context, C2675a0 adPlacement, H0 h02) {
        Boolean boolO;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adPlacement, "adPlacement");
        this.f32318g = new ArrayList();
        this.f32336y = -1L;
        this.f32337z = new TreeSet();
        this.C = A.f31609a;
        this.G = new Handler(Looper.getMainLooper());
        this.H = new LinkedHashMap();
        this.I = new W0(this);
        this.K = tu.q.lazy(new T0(this));
        this.M = new M0(this);
        boolean zBooleanValue = false;
        this.N = new AtomicBoolean(false);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
        toString();
        this.f32314c = new WeakReference(context);
        this.f32331t = adPlacement;
        WeakReference weakReference = new WeakReference(h02);
        this.f32317f = weakReference;
        String strQ = q();
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            zBooleanValue = boolO.booleanValue();
        }
        this.D = new O(weakReference, strQ, zBooleanValue);
        o0();
    }

    public static /* synthetic */ void S() {
    }

    public static /* synthetic */ void V() {
    }

    public static final Sf c(U0 u02) {
        return (Sf) u02.K.getValue();
    }

    public static final /* synthetic */ String e() {
        return "U0";
    }

    public final int A() {
        return this.f32334w;
    }

    public final void A0() {
        String strS;
        Boolean boolO;
        String strP;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "submitRenderSuccessEvent ADunit markuptype : ");
            sbA.append(F());
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).c("U0", sbA.toString());
        }
        HashMap map = new HashMap();
        long j10 = this.I.f32421g;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", F());
        C2793h c2793hV = v();
        if (c2793hV == null || (strS = c2793hV.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        C2793h c2793hV2 = v();
        if (c2793hV2 != null && (strP = c2793hV2.p()) != null) {
            map.put("creativeType", strP);
        }
        C2884m6 c2884m6 = this.E;
        if (c2884m6 != null) {
            map.put("retryCount", Integer.valueOf(c2884m6.f33089b));
        }
        map.put("plType", Byte.valueOf(K()));
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (T().length() > 0) {
            map.put("metadataBlob", T());
        }
        c(map);
        a(v(), map);
        c("RenderSuccess", map);
    }

    public final int B() {
        return this.f32335x;
    }

    public long B0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "timeSincePodShow ", this));
        }
        if (this.A) {
            return System.currentTimeMillis() - this.f32336y;
        }
        return -1L;
    }

    public final TreeSet<Integer> C() {
        return this.f32337z;
    }

    public final C3011tf C0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "trySetTheLocalVideoDescriptor ", this));
        }
        C2793h c2793hM = m();
        if (c2793hM == null) {
            throw new IllegalStateException("No ad");
        }
        if (!(c2793hM instanceof C2786g9)) {
            return null;
        }
        C2786g9 c2786g9 = (C2786g9) c2793hM;
        C2826j c2826jB = AbstractC2807hd.a().b(c2786g9.f32875a);
        if (c2826jB == null || !c2826jB.a()) {
            throw new IllegalStateException("Asset not available in cache");
        }
        String str = c2826jB.f32941c;
        String str2 = c2786g9.f32876b;
        String str3 = c2786g9.f32877c;
        ArrayList arrayList = c2786g9.f32878d;
        ArrayList arrayList2 = c2786g9.f32879e;
        AdConfig adConfig = this.f32313b;
        kotlin.jvm.internal.e0.checkNotNull(adConfig);
        return new C3011tf(str, str2, str3, arrayList, arrayList2, adConfig.getVastVideo());
    }

    public final long D() {
        return this.f32336y;
    }

    public final void D0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).b("U0", "ad unloaded");
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).d("U0", "AdUnit " + this + " state - UNLOADED");
        }
        d((byte) 8);
    }

    public final Handler E() {
        return this.f32323l;
    }

    public final String F() {
        String strU;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "markupType getter ", this));
        }
        C2793h c2793hM = m();
        return (c2793hM == null || (strU = c2793hM.u()) == null) ? "unknown" : strU;
    }

    public Integer G() {
        return null;
    }

    public final C2734d8 H() {
        return this.f32319h;
    }

    public final C2888ma I() {
        return this.f32330s;
    }

    public final C2675a0 J() {
        return this.f32331t;
    }

    public abstract byte K();

    public String L() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getPodAdContext ", this));
        }
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final String M() {
        return d(0);
    }

    public final Map<String, String> N() {
        return this.f32331t.f();
    }

    public JSONArray O() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getRenderableAdIndexes ", this));
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f32337z.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            kotlin.jvm.internal.e0.checkNotNull(num);
            jSONArray.put(num.intValue());
        }
        return jSONArray;
    }

    public long P() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getShowTimeStamp ", this));
        }
        if (this.A) {
            return this.f32336y;
        }
        return -1L;
    }

    public final tu.x0 Q() {
        H0 h0R = r();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA = a(h0R, jCurrentTimeMillis);
        tu.x0 x0Var = tu.x0.f87415a;
        if (zA) {
            return x0Var;
        }
        this.f32329r = true;
        if (this.f32330s == null) {
            this.f32330s = new C2888ma(this);
        }
        A a10 = this.C;
        int iHashCode = hashCode();
        N4 n42 = new N4(this, jCurrentTimeMillis, this.f32321j);
        a10.getClass();
        A.a(iHashCode, n42);
        return x0Var;
    }

    public final byte R() {
        return this.f32312a;
    }

    public final String T() {
        LinkedList<C2793h> linkedListF;
        C2793h c2793h;
        String strW;
        A0 a02 = this.f32332u;
        return (a02 == null || (linkedListF = a02.f()) == null || (c2793h = (C2793h) uu.y0.firstOrNull((List) linkedListF)) == null || (strW = c2793h.w()) == null) ? "" : strW;
    }

    public final byte U() {
        return this.f32322k;
    }

    public final void W() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "handleInterActive ", this));
        }
        A a10 = this.C;
        int iHashCode = hashCode();
        L0 l02 = new L0(this);
        a10.getClass();
        A.a(iHashCode, l02);
    }

    public final boolean X() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "hasAdExpired ", this));
        }
        C2793h c2793hM = m();
        if (c2793hM == null) {
            return false;
        }
        AdConfig adConfig = this.f32313b;
        kotlin.jvm.internal.e0.checkNotNull(adConfig);
        return c2793hM.a(adConfig.getCacheConfig(q()).getTimeToLive());
    }

    public final boolean Y() {
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.f32313b;
        return adConfig != null && (rendering = adConfig.getRendering()) != null && rendering.getEnablePubMuteControl() && C2925od.o();
    }

    public final boolean Z() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f32312a));
        }
        if (!M4.f32021a.a()) {
            g();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (g0()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                StringBuilder sbA = N6.a("U0", "TAG", "Some of the dependency libraries for ");
                sbA.append(q());
                sbA.append(" not found");
                ((G5) f53).b("U0", sbA.toString());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b10 = this.f32312a;
        if (b10 == 1) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).b("U0", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b10 != 7) {
            return false;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f55).b("U0", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public abstract /* synthetic */ void a(int i10, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc);

    @Override // com.inmobi.media.Ac
    public void a(GestureDetectorOnGestureListenerC3093yc renderView, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "onRenderProcessGone didCrash=" + z10 + " state=" + ((int) this.f32312a));
        }
        byte b10 = this.f32312a;
        if (b10 == 0) {
            short s10 = z10 ? (short) 2214 : (short) 2213;
            n0();
            renderView.a(z10, s10);
            return;
        }
        if (b10 == 1) {
            short s11 = z10 ? (short) 2216 : (short) 2215;
            n0();
            b(s11);
            H0 h0R = r();
            if (h0R != null) {
                h0R.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 3) {
            renderView.a(z10, z10 ? (short) 2226 : (short) 2225);
            return;
        }
        if (b10 == 2) {
            n0();
            b(z10 ? (short) 2218 : (short) 2217);
            H0 h0R2 = r();
            if (h0R2 != null) {
                h0R2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 4 || b10 == 6 || b10 == 7 || b10 != 8) {
            return;
        }
        renderView.a(z10, z10 ? (short) 2240 : (short) 2241);
    }

    public final boolean a0() {
        return this.f32326o;
    }

    public abstract /* synthetic */ void b();

    public final boolean b0() {
        return this.f32324m;
    }

    public final boolean c0() {
        return this.A;
    }

    public final void d(byte b10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "from ");
            sbA.append((int) this.f32312a);
            sbA.append(" to ");
            sbA.append((int) b10);
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).d("U0", sbA.toString());
        }
        this.f32312a = b10;
    }

    public void d0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "load  ", this));
        }
        W0 w02 = this.I;
        w02.getClass();
        w02.f32417c = SystemClock.elapsedRealtime();
        a(new N0(this), new O0(this));
    }

    public final void e0() throws IllegalStateException {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "loadAd_ ", this));
        }
        C2793h c2793hM = m();
        if (c2793hM == null || X()) {
            c2793hM = null;
        }
        if (c2793hM == null) {
            throw new IllegalStateException("Unable to get topAd");
        }
        String strU = c2793hM.u();
        int iHashCode = strU.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && strU.equals("htmlUrl")) {
                    return;
                }
            } else if (strU.equals("html")) {
                return;
            }
        } else if (strU.equals("inmobiJson")) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                StringBuilder sbA = N6.a("U0", "TAG", "Loading ad with impressionId : ");
                sbA.append(c2793hM.s());
                ((G5) f53).a("U0", sbA.toString());
            }
            A0 a02 = this.f32332u;
            if (a02 != null) {
                AdConfig adConfig = this.f32313b;
                kotlin.jvm.internal.e0.checkNotNull(adConfig);
                a02.a(adConfig, this, this.f32321j);
                return;
            }
            return;
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            StringBuilder sbA2 = N6.a("U0", "TAG", "Can not handle fallback for");
            sbA2.append(c2793hM.u());
            ((G5) f54).b("U0", sbA2.toString());
        }
        throw new IllegalStateException("Can not handle fallback for markup type: " + c2793hM.u());
    }

    public final void f(int i10) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "initializeHtmlAdContainer ", this));
        }
        Context contextT = t();
        if (contextT == null) {
            return;
        }
        try {
            if (this.f32318g.get(i10) != null && ((gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(i10)) == null || !gestureDetectorOnGestureListenerC3093yc.K.get())) {
                return;
            }
            C2793h c2793hB = b(i10);
            S sA = a(i10);
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = ((Sf) this.K.getValue()).a(new Wc("adUnit-" + i10, BuildConfig.FLAVOR), contextT, (short) 0, sA);
            this.f32318g.set(i10, gestureDetectorOnGestureListenerC3093ycA);
            AdConfig adConfig = this.f32313b;
            kotlin.jvm.internal.e0.checkNotNull(adConfig);
            gestureDetectorOnGestureListenerC3093ycA.a(this, adConfig);
            F5 f53 = gestureDetectorOnGestureListenerC3093ycA.f33628i;
            if (f53 != null) {
                String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                ((G5) f53).c(str, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093ycA, str, "TAG", "initContextualData "));
            }
            gestureDetectorOnGestureListenerC3093ycA.U0 = new C2780g3(c2793hB, gestureDetectorOnGestureListenerC3093ycA.U);
        } catch (Exception e10) {
            a((GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(this.f32334w), (short) 2136);
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).a("U0", "Exception while initializing WebView", e10);
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void g(H0 h02) {
        Boolean boolO;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "adUnitEventListener setter ", this));
        }
        WeakReference weakReference = new WeakReference(h02);
        this.f32317f = weakReference;
        String strQ = q();
        A0 a02 = this.f32332u;
        O o10 = new O(weakReference, strQ, (a02 == null || (boolO = a02.o()) == null) ? false : boolO.booleanValue());
        this.D = o10;
        F5 logger = this.f32321j;
        if (logger != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(logger, "logger");
            o10.f32086f = logger;
        }
    }

    public boolean g0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "missingPrerequisitesForAd ", this));
        }
        try {
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(RecyclerView.class).getSimpleName();
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(androidx.browser.customtabs.v.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void h(int i10) {
        this.f32334w = i10;
    }

    public void h0() {
        W0 w02 = this.I;
        w02.getClass();
        w02.f32422h = SystemClock.elapsedRealtime();
    }

    public final void i(int i10) {
        this.f32335x = i10;
    }

    public final AdConfig j() {
        return this.f32313b;
    }

    public Me j0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "provideTimeoutConfigurations ", this));
        }
        Me me2 = this.f32315d;
        kotlin.jvm.internal.e0.checkNotNull(me2);
        return me2;
    }

    public final InterfaceC3063x k() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "adMarkupContainer getter ", this));
        }
        byte b10 = this.f32312a;
        String strF = F();
        int iHashCode = strF.hashCode();
        if (iHashCode == -1084172778) {
            if (!strF.equals("inmobiJson") || b10 == 0 || 1 == b10 || 3 == b10 || 2 == b10) {
                return null;
            }
            return this.f32319h;
        }
        if (iHashCode == 3213227) {
            if (!strF.equals("html") || b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
                return null;
            }
            return x();
        }
        if (iHashCode != 1236050372 || !strF.equals("htmlUrl") || b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
            return null;
        }
        return x();
    }

    public abstract void k0();

    public final AdMetaInfo l() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "adMetaInfo getter ", this));
        }
        C2793h c2793hM = m();
        if (c2793hM != null) {
            return c2793hM.d();
        }
        return null;
    }

    public void l0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "resetContainersForNextAd ", this));
        }
        C2734d8 c2734d8 = this.f32319h;
        if (c2734d8 != null) {
            c2734d8.b();
        }
        this.f32319h = null;
        int size = this.f32318g.size();
        int i10 = this.f32335x;
        if (size <= i10 || this.f32318g.get(i10) == null) {
            return;
        }
        a(this.f32335x, false);
    }

    public final C2793h m() {
        return b(0);
    }

    public final Y6 m0() {
        String strS;
        String strP;
        String strW;
        String str;
        String str2;
        String str3;
        boolean z10;
        String strT;
        Boolean boolO;
        long jL = this.f32331t.l();
        C2793h c2793hU = u();
        if (c2793hU == null || (strS = c2793hU.s()) == null) {
            strS = "";
        }
        String strValueOf = String.valueOf(this.f32331t.m());
        String strQ = q();
        String strF = F();
        C2793h c2793hU2 = u();
        if (c2793hU2 == null || (strP = c2793hU2.p()) == null) {
            strP = "";
        }
        C2793h c2793hU3 = u();
        if (c2793hU3 == null || (strW = c2793hU3.w()) == null) {
            strW = "";
        }
        A0 a02 = this.f32332u;
        boolean zBooleanValue = (a02 == null || (boolO = a02.o()) == null) ? false : boolO.booleanValue();
        C2793h c2793hU4 = u();
        if (c2793hU4 == null || (strT = c2793hU4.t()) == null) {
            boolean z11 = zBooleanValue;
            str = "";
            str2 = strP;
            str3 = strW;
            z10 = z11;
        } else {
            str2 = strP;
            str3 = strW;
            z10 = zBooleanValue;
            str = strT;
        }
        return new Y6(jL, strS, strValueOf, strQ, strF, str2, str3, z10, str);
    }

    public final String n() {
        A0 a02 = this.f32332u;
        if (a02 != null) {
            return a02.c();
        }
        return null;
    }

    public final void n0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).d("U0", "AdUnit " + this + " state - FAILED");
        }
        d((byte) 3);
        b((byte) 1);
    }

    public HashMap o() {
        return new HashMap();
    }

    public final void o0() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
        toString();
        String strB = C2925od.b();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, strB, null);
        this.f32313b = configA instanceof AdConfig ? (AdConfig) configA : null;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "timeOutConfiguration getter ", this));
        }
        AdConfig adConfig = this.f32313b;
        kotlin.jvm.internal.e0.checkNotNull(adConfig);
        this.f32315d = adConfig.getTimeouts();
        d((byte) 0);
        this.f32316e = new D0(this, this, this.f32331t);
        this.f32320i = new HashMap();
        this.f32322k = (byte) -1;
        this.f32323l = new Handler(Looper.getMainLooper());
        this.f32324m = false;
        this.f32333v = new Fe(this);
    }

    public final D0 p() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "adStore getter ", this));
        }
        if (this.f32316e == null) {
            this.f32316e = new D0(this, this, this.f32331t);
        }
        D0 d02 = this.f32316e;
        kotlin.jvm.internal.e0.checkNotNull(d02);
        return d02;
    }

    public final boolean p0() {
        tu.x0 x0Var;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "shouldBlockLoadAd ", this));
        }
        C2793h c2793hM = m();
        if (c2793hM != null && 4 == this.f32312a && !X()) {
            H0 h0R = r();
            if (h0R != null) {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f53).a("U0", "ad is ready - load success");
                }
                f(h0R);
                x0Var = tu.x0.f87415a;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                b((short) 2188);
            }
            return true;
        }
        if (c2793hM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).b("U0", "ad no longer available");
            }
            return true;
        }
        if (2 != this.f32312a) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
            F5 f55 = this.f32321j;
            if (f55 != null) {
                StringBuilder sbA = N6.a("U0", "TAG", "ad no longer available. state - ");
                sbA.append((int) this.f32312a);
                ((G5) f55).b("U0", sbA.toString());
            }
            return true;
        }
        if (!X()) {
            return false;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
        F5 f56 = this.f32321j;
        if (f56 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f56).b("U0", "ad is expired");
        }
        return true;
    }

    public abstract String q();

    public final boolean q0() {
        AdConfig adConfig;
        return kotlin.jvm.internal.e0.areEqual(this.f32331t.m(), "AB") && (adConfig = this.f32313b) != null && adConfig.getSkipNetCheckHB();
    }

    public final H0 r() {
        F5 f52;
        F5 f53 = this.f32321j;
        if (f53 != null) {
            ((G5) f53).c("U0", F0.a("U0", "TAG", "adUnitEventListener getter ", this));
        }
        H0 h02 = (H0) this.f32317f.get();
        if (h02 == null && (f52 = this.f32321j) != null) {
            ((G5) f52).b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return h02;
    }

    public void r0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "signalAvailabilityChange ", this));
        }
    }

    public final W0 s() {
        return this.I;
    }

    public void s0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "signalSuccess ", this));
        }
    }

    public final Context t() {
        WeakReference weakReference = this.f32314c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final void t0() {
        LinkedList<C2793h> linkedListF;
        C2793h c2793h;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "startLoadingHTMLAd ", this));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = null;
        try {
            f(this.f32334w);
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                StringBuilder sb2 = new StringBuilder("Loading ad with impressionId : ");
                A0 a02 = this.f32332u;
                sb2.append((a02 == null || (linkedListF = a02.f()) == null || (c2793h = linkedListF.get(this.f32334w)) == null) ? null : c2793h.s());
                ((G5) f53).a("U0", sb2.toString());
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(this.f32334w);
            String strF = F();
            if (kotlin.jvm.internal.e0.areEqual(strF, "html")) {
                F5 f54 = this.f32321j;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f54).a("U0", "loading into weview for " + F());
                }
                if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                    gestureDetectorOnGestureListenerC3093yc2.d(d(this.f32334w));
                }
            } else if (kotlin.jvm.internal.e0.areEqual(strF, "htmlUrl")) {
                F5 f55 = this.f32321j;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f55).a("U0", "loading into weview for " + F());
                }
                if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                    gestureDetectorOnGestureListenerC3093yc2.e(d(this.f32334w));
                }
            }
            a(true, gestureDetectorOnGestureListenerC3093yc2);
            if (gestureDetectorOnGestureListenerC3093yc2 == null || !kotlin.jvm.internal.e0.areEqual(F(), "htmlUrl")) {
                return;
            }
            l(gestureDetectorOnGestureListenerC3093yc2);
        } catch (Exception e10) {
            F5 f56 = this.f32321j;
            if (f56 != null) {
                ((G5) f56).a("U0", Qf.a(e10, N6.a("U0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            int i10 = this.f32334w;
            if (i10 >= 0 && i10 < this.f32318g.size()) {
                gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(this.f32334w);
            }
            a(gestureDetectorOnGestureListenerC3093yc, (short) 2135);
        }
    }

    public final C2793h u() {
        return this.A ? b(this.f32334w) : m();
    }

    public final void u0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdLoadCalled ", this));
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final C2793h v() {
        return this.A ? b(this.f32335x) : m();
    }

    public final void v0() {
        String strS;
        Boolean boolO;
        String strP;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "submitAdLoadSuccessfulEvent ADunit markuptype : ");
            sbA.append(F());
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).c("U0", sbA.toString());
        }
        HashMap map = new HashMap();
        long j10 = this.I.f32417c;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", F());
        C2793h c2793hU = u();
        if (c2793hU == null || (strS = c2793hU.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        C2793h c2793hU2 = u();
        if (c2793hU2 != null && (strP = c2793hU2.p()) != null) {
            map.put("creativeType", strP);
        }
        C2884m6 c2884m6 = this.E;
        if (c2884m6 != null) {
            map.put("retryCount", Integer.valueOf(c2884m6.f33089b));
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (T().length() > 0) {
            map.put("metadataBlob", T());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final A w() {
        return this.C;
    }

    public final void w0() {
        String strS;
        String strP;
        Boolean boolO;
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", F());
        C2793h c2793hU = u();
        if (c2793hU == null || (strS = c2793hU.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        long j10 = this.I.f32422h;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("metadataBlob", T());
        C2884m6 c2884m6 = this.E;
        if (c2884m6 != null) {
            map.put("retryCount", Integer.valueOf(c2884m6.f33089b));
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        C2793h c2793hU2 = u();
        if (c2793hU2 != null && (strP = c2793hU2.p()) != null) {
            map.put("creativeType", strP);
        }
        c("ParseSuccess", map);
    }

    public GestureDetectorOnGestureListenerC3093yc x() {
        if (this.f32318g.size() <= 0 || this.f32335x >= this.f32318g.size()) {
            return null;
        }
        return (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(this.f32335x);
    }

    public final void x0() {
        String strS;
        Boolean boolO;
        String strP;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdShowCalled ", this));
        }
        W0 w02 = this.I;
        w02.getClass();
        w02.f32419e = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", F());
        C2793h c2793hV = v();
        if (c2793hV == null || (strS = c2793hV.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        long j10 = this.I.f32423i;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        C2793h c2793hV2 = v();
        if (c2793hV2 != null && (strP = c2793hV2.p()) != null) {
            map.put("creativeType", strP);
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (T().length() > 0) {
            map.put("metadataBlob", T());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final GestureDetectorOnGestureListenerC3093yc y() {
        return this.f32325n;
    }

    public final void y0() {
        String strS;
        Boolean boolO;
        String strP;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdShowSuccess ", this));
        }
        HashMap map = new HashMap();
        long j10 = this.I.f32419e;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", F());
        C2793h c2793hV = v();
        if (c2793hV == null || (strS = c2793hV.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        C2793h c2793hV2 = v();
        if (c2793hV2 != null && (strP = c2793hV2.p()) != null) {
            map.put("creativeType", strP);
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (T().length() > 0) {
            map.put("metadataBlob", T());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final A0 z() {
        return this.f32332u;
    }

    public final void z0() {
        HashMap map = new HashMap();
        c(map);
        c("AdGetSignalsCalled", map);
    }

    public final void e(A0 a02) {
        this.f32332u = a02;
    }

    public final void f0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", KGUkpTlXZlJLy.FuLIMRPGhlnNr, "makeUnitActive ", this));
        }
        this.f32326o = false;
    }

    @Override // com.inmobi.media.Ac
    public void h(GestureDetectorOnGestureListenerC3093yc renderView) {
        Handler handler;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onRenderViewSignaledAdFailed ", this));
        }
        if (this.f32326o || t() == null || (handler = this.f32323l) == null) {
            return;
        }
        handler.post(new zk.z(this, renderView, 1));
    }

    public final void i() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "fireAdServedBeacon ", this));
        }
        InterfaceC3063x interfaceC3063xK = k();
        if (interfaceC3063xK == null) {
            return;
        }
        interfaceC3063xK.a((byte) 2, null);
    }

    public final U i0() {
        String string;
        Integer num;
        Integer num2;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "prepareAdRequest ", this));
        }
        Context contextT = t();
        C2804ha c2804ha = null;
        C2837ja c2837ja = contextT != null ? new C2837ja(contextT, this.f32321j) : null;
        AdConfig adConfig = this.f32313b;
        String url = adConfig != null ? adConfig.getUrl() : null;
        AdConfig adConfig2 = this.f32313b;
        kotlin.jvm.internal.e0.checkNotNull(adConfig2);
        Te te2 = new Te(adConfig2.getIncludeIdParams());
        ArrayList arrayListA = AbstractC2807hd.a().a();
        if (arrayListA.isEmpty()) {
            string = null;
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(URLEncoder.encode(((C2826j) it.next()).f32940b, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            string = jSONArray.toString();
        }
        C2675a0 c2675a0 = this.f32331t;
        if (c2837ja != null) {
            if (c2837ja.f32977d) {
                c2804ha = new C2804ha(uu.p1.hashMapOf(tu.e0.to(NyKZx.WcIWAy, c2837ja.f32976c)));
            } else {
                F5 f53 = c2837ja.f32975b;
                if (f53 != null) {
                    ((G5) f53).a("NovatiqDataHandler", "Novatiq disabled. skip");
                }
                c2804ha = new C2804ha(uu.p1.emptyMap());
            }
        }
        C2804ha c2804ha2 = c2804ha;
        F5 f54 = this.f32321j;
        AdConfig adConfig3 = this.f32313b;
        U u10 = new U(url, te2, string, c2675a0, c2804ha2, f54, adConfig3 != null ? adConfig3.getApplyGzipReq() : false);
        u10.C = this.f32331t.i();
        u10.B = q();
        kotlin.jvm.internal.e0.checkNotNullParameter("unifiedSdkJson", "<set-?>");
        u10.A = "unifiedSdkJson";
        u10.D = o();
        E7 e72 = this.F;
        int iIntValue = 15000;
        u10.f32507p = (e72 == null || (num2 = e72.f31748d) == null) ? 15000 : num2.intValue();
        E7 e73 = this.F;
        if (e73 != null && (num = e73.f31748d) != null) {
            iIntValue = num.intValue();
        }
        u10.f32508q = iIntValue;
        u10.f32506o = Y();
        return u10;
    }

    @Override // com.inmobi.media.Ac
    public void j(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "RenderView visible, for index ");
            sbA.append(this.f32318g.indexOf(renderView));
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).a("U0", sbA.toString());
        }
    }

    public int m(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getCurrentRenderingPodAdIndex ", this));
        }
        if (!this.A) {
            return -1;
        }
        int iIndexOf = this.f32318g.indexOf(renderView);
        F5 f53 = this.f32321j;
        if (f53 != null) {
            ((G5) f53).c("U0", AbstractC2803h9.a("U0", "TAG", "getCurrentRenderingPodAdIndex ", iIndexOf));
        }
        return iIndexOf;
    }

    public void n(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "Render view signaled ad ready, for index ");
            sbA.append(this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc));
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).a("U0", sbA.toString());
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).a("U0", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            ((G5) f54).b();
        }
    }

    public void o(GestureDetectorOnGestureListenerC3093yc renderView) {
        int iM;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "onAdUnloadedAfterLoadSuccess");
        }
        if (!this.A || (iM = m(renderView)) <= this.f32335x) {
            D0();
        } else {
            this.f32337z.remove(Integer.valueOf(iM));
        }
    }

    public final void b(boolean z10) {
        this.f32324m = z10;
    }

    public final void c(boolean z10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "setIsAssetReady ", this));
        }
        this.f32327p = z10;
    }

    public final Set e(int i10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getViewabilityTrackers ", this));
        }
        HashMap map = this.f32320i;
        if (map != null) {
            return (Set) map.get(Integer.valueOf(i10));
        }
        return null;
    }

    public final boolean b(C2793h c2793h) {
        C2996t0 c2996t0Q;
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.f32313b;
        boolean z10 = false;
        boolean enableImmersive = (adConfig == null || (rendering = adConfig.getRendering()) == null) ? false : rendering.getEnableImmersive();
        boolean z11 = AbstractC2679a4.f32641i;
        boolean zA = (c2793h == null || (c2996t0Q = c2793h.q()) == null) ? false : c2996t0Q.a(false);
        if (enableImmersive && z11 && zA) {
            z10 = true;
        }
        if (!z10) {
            b(enableImmersive, z11, zA);
        }
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).a("U0", "Immersive support - config, device, adResponse - (" + enableImmersive + ' ' + z11 + ' ' + zA + ')');
        }
        return z10;
    }

    public final String d(int i10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getPubContent ", this));
        }
        if (i10 > 0 && !this.A) {
            return "";
        }
        C2793h c2793hB = b(i10);
        if (c2793hB != null) {
            return c2793hB.x();
        }
        return null;
    }

    public final void l(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        List<String> listC;
        int iIndexOf = this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc);
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).a("U0", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + ' ' + this);
        }
        C2793h c2793hB = b(iIndexOf);
        if (c2793hB == null || (listC = c2793hB.c(C2793h.LOAD_AD_TOKEN_URL)) == null) {
            return;
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            C3100z2.f33672a.a(it.next(), true, this.f32321j);
        }
    }

    public final boolean c(int i10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "getAllowAutoRedirectionForIndex " + this + " index - " + i10);
        }
        C2793h c2793hB = b(i10);
        return c2793hB != null && c2793hB.i();
    }

    public final void e(H0 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onFetchSuccess ", this));
        }
        w0();
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).b("U0", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f54).a("U0", "callback - onAdFetchSuccess");
        }
        listener.b(adMetaInfoL);
    }

    public final void h() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "destroyAllContainer ", this));
        }
        int size = this.f32318g.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(this, i10, false, 2, null);
        }
    }

    @Override // com.inmobi.media.Ac
    public void i(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onRenderViewSignaledAdReady ", this));
        }
        if (!this.f32326o && t() != null) {
            Handler handler = this.f32323l;
            if (handler != null) {
                handler.post(new zk.z(this, renderView, 0));
                return;
            } else {
                b((short) 2187);
                return;
            }
        }
        b((short) 2186);
    }

    public void p(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "onAdUnloadedAfterShowSuccess");
        }
        renderView.i();
        b((byte) 4);
    }

    public final void c(A0 adSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSet, "adSet");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onAdFetchSuccessful ", this));
        }
        if (this.f32312a == 1) {
            this.f32332u = adSet;
        }
        if (!this.f32326o && t() != null) {
            a(adSet);
            return;
        }
        b((short) 2185);
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).b("U0", "adUnit is destroyed");
        }
    }

    public void g() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "clear ", this));
        }
        if (this.f32326o) {
            return;
        }
        this.f32326o = true;
        Handler handler = this.f32323l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            ((G5) f53).a("U0", F0.a("U0", "TAG", LJjmO.wWE, this));
        }
        if (this.A) {
            h();
            this.f32318g.clear();
            this.f32334w = 0;
            this.f32335x = 0;
            this.f32337z.clear();
        }
        C2884m6 c2884m6 = this.E;
        if (c2884m6 != null) {
            c2884m6.f33089b = 0;
        }
        HashMap map = this.f32320i;
        if (map != null) {
            map.clear();
        }
        l0();
        d((byte) 0);
        F5 f54 = this.f32321j;
        if (f54 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f54).d("U0", "AdUnit " + this + " state - CREATED");
        }
        A a10 = this.C;
        int iHashCode = hashCode();
        a10.getClass();
        SparseArray sparseArray = A.f31610b;
        sparseArray.remove(iHashCode);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("A", "TAG");
        sparseArray.size();
        this.f32328q = false;
        this.f32325n = null;
        this.f32324m = false;
        this.f32327p = false;
        this.f32329r = false;
        this.f32332u = null;
        this.A = false;
    }

    public final void d(H0 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onAdDisplayed ", this));
        }
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).b("U0", "callback onAdDisplayed failed. ad meta info is null");
            }
            a(listener, (short) 85);
            return;
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f54).a("U0", "callback - onAdDisplayed");
        }
        listener.a(adMetaInfoL);
    }

    @Override // com.inmobi.media.Ac
    public void k(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        byte b10 = this.f32312a;
        if (b10 == 2) {
            D0();
            b((byte) 1);
            H0 h0R = r();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (h0R != null) {
                h0R.a(this, inMobiAdRequestStatus);
            } else {
                F5 f52 = this.f32321j;
                if (f52 != null) {
                    ((G5) f52).a();
                }
            }
            b((short) 2238);
            renderView.b();
            return;
        }
        if (b10 == 4) {
            o(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b10 == 6 || b10 == 7) {
                p(renderView);
                return;
            }
            F5 f53 = this.f32321j;
            if (f53 != null) {
                StringBuilder sbA = N6.a("U0", "TAG", "onUnloadCalled - invalid state - ");
                sbA.append((int) this.f32312a);
                ((G5) f53).b("U0", sbA.toString());
            }
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        tu.v vVarA = a(z10, z11, z12);
        String str = (String) vVarA.component1();
        short sShortValue = ((Number) vVarA.component2()).shortValue();
        HashMap mapS = b0.e2.s("reason", str);
        mapS.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue));
        c("ImmersiveNotSupported", mapS);
    }

    public static final void e(U0 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (6 == this$0.f32312a) {
            this$0.a(true, (short) 2158);
        }
    }

    public static final void a(Context context, U0 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        C3091ya c3091ya = AbstractC3074xa.f33574a;
        AdConfig adConfig = this$0.f32313b;
        c3091ya.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            } else {
                c3091ya.a(adConfig);
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public void c(String monetizationContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(monetizationContext, "monetizationContext");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "setMonetizationContext ", this));
        }
        this.f32331t.b(monetizationContext);
    }

    public final void d(A0 adSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSet, "adSet");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", gjnZrsdA.RuPge, this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            ((G5) f53).c("U0", F0.a("U0", "TAG", "handleAuctionNotClosed ", this));
        }
        if (this.f32312a == 1) {
            this.f32332u = adSet;
            this.A = adSet != null ? adSet.n() : false;
            H0 h0R = r();
            if (h0R != null) {
                h0R.a(this.f32331t, adSet);
            }
        }
    }

    public final boolean e(byte b10) {
        int iY;
        Integer num;
        long j10;
        Integer num2;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "startTimer ", this));
        }
        if (b10 == 0) {
            E7 e72 = this.F;
            if (e72 != null && (num2 = e72.f31748d) != null) {
                iY = num2.intValue();
                j10 = iY;
            }
            j10 = MBInterstitialActivity.WEB_LOAD_TIME;
        } else if (b10 == 1) {
            E7 e73 = this.F;
            if (e73 != null) {
                iY = e73.f31747c;
                j10 = iY;
            }
            j10 = MBInterstitialActivity.WEB_LOAD_TIME;
        } else {
            if (b10 == 2) {
                E7 e74 = this.F;
                if (e74 != null && (num = e74.f31749e) != null) {
                    iY = num.intValue();
                }
                j10 = MBInterstitialActivity.WEB_LOAD_TIME;
            } else if (b10 == 4) {
                Me me2 = this.f32315d;
                kotlin.jvm.internal.e0.checkNotNull(me2);
                iY = me2.Y();
            } else {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f53).b("U0", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j10 = iY;
        }
        Fe fe2 = this.f32333v;
        if (fe2 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Fe", "TAG");
            if (fe2.f31801b.containsKey(Byte.valueOf(b10))) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("Fe", "TAG");
                Timer timer = (Timer) fe2.f31801b.get(Byte.valueOf(b10));
                if (timer != null) {
                    timer.cancel();
                    fe2.f31801b.remove(Byte.valueOf(b10));
                }
            }
            try {
                Timer timer2 = new Timer("Fe");
                fe2.f31801b.put(Byte.valueOf(b10), timer2);
                timer2.schedule(new Ee(fe2, b10), j10);
                return true;
            } catch (InternalError e10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("Fe", "TAG");
                e10.toString();
            } catch (OutOfMemoryError unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("Fe", "TAG");
                AbstractC2902n7.a((byte) 1, "Fe", "Could not execute timer due to OutOfMemory.");
                fe2.f31800a.c(b10);
            }
        }
        return false;
    }

    public final C2793h b(int i10) {
        Iterable iterableEmptyList;
        LinkedList<C2793h> linkedListF;
        LinkedList<C2793h> linkedListF2;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
        toString();
        A0 a02 = this.f32332u;
        if (a02 == null || (linkedListF2 = a02.f()) == null || (iterableEmptyList = uu.p0.getIndices(linkedListF2)) == null) {
            iterableEmptyList = uu.p0.emptyList();
        }
        if (uu.y0.contains(iterableEmptyList, Integer.valueOf(i10))) {
            A0 a03 = this.f32332u;
            if (a03 == null || (linkedListF = a03.f()) == null) {
                return null;
            }
            return linkedListF.get(i10);
        }
        A0 a04 = this.f32332u;
        if (a04 != null) {
            return a04.p();
        }
        return null;
    }

    public final short c(H0 adUnitEventListener) {
        HashMap mapA;
        short s10;
        C2734d8 c2734d8;
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "loadMarkupInContainerNative ", this));
        }
        WeakReference weakReference = new WeakReference(adUnitEventListener);
        try {
            byte bK = K();
            JSONObject jSONObject = new JSONObject(M());
            AdConfig adConfig = this.f32313b;
            kotlin.jvm.internal.e0.checkNotNull(adConfig);
            A0 a02 = this.f32332u;
            if (a02 == null) {
                mapA = null;
            } else {
                boolean z10 = C2736da.f32781a;
                mapA = C2736da.a(a02.h());
            }
            C3106z8 dataModel = new C3106z8(bK, jSONObject, adConfig, mapA, C0(), this.f32321j);
            C2793h c2793hM = m();
            if (!dataModel.f() || t() == null || c2793hM == null) {
                return (short) 20;
            }
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).a("U0", "creating native ad container");
            }
            Context context = t();
            kotlin.jvm.internal.e0.checkNotNull(context);
            byte bK2 = K();
            String adImpressionId = c2793hM.s();
            Set setE = e(0);
            AdConfig adConfig2 = this.f32313b;
            kotlin.jvm.internal.e0.checkNotNull(adConfig2);
            long jL = this.f32331t.l();
            boolean zC = c(0);
            String creativeId = c2793hM.o();
            C2780g3 c2780g3 = new C2780g3(c2793hM, this.f32331t.l());
            Y6 y6M0 = m0();
            F5 f54 = this.f32321j;
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "dataModel");
            kotlin.jvm.internal.e0.checkNotNullParameter(adImpressionId, "adImpressionId");
            kotlin.jvm.internal.e0.checkNotNullParameter(adConfig2, "adConfig");
            kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
            if (dataModel.c().contains("VIDEO")) {
                s10 = 0;
                c2734d8 = new C2853k9(context, bK2, dataModel, adImpressionId, setE, adConfig2, jL, zC, creativeId, c2780g3, y6M0, f54);
            } else {
                s10 = 0;
                c2734d8 = new C2734d8(context, bK2, dataModel, adImpressionId, setE, adConfig2, jL, zC, creativeId, c2780g3, y6M0, f54);
            }
            c2734d8.f32762w = new R0(this, weakReference);
            this.f32319h = c2734d8;
            c2734d8.R = this.H;
            return s10;
        } catch (IllegalStateException e10) {
            F5 f55 = this.f32321j;
            if (f55 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f55).a("U0", "Error while setting video descriptor", e10);
            }
            return (short) 83;
        } catch (JSONException e11) {
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e11);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return (short) 13;
        } catch (Exception e12) {
            F5 f56 = this.f32321j;
            if (f56 != null) {
                ((G5) f56).b("U0", Qf.a(e12, N6.a("U0", "TAG", "Encountered unexpected error in loading ad markup into container: ")));
            }
            Y5 y53 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e12, NotificationCompat.CATEGORY_EVENT));
            return (short) 88;
        }
    }

    public final int b(String str) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "parseViewabilityResponseValue ", this));
        }
        if (sv.k0.startsWith$default(str, "track_", false, 2, null)) {
            str = str.substring(6);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final void f(H0 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onLoadSuccess ", this));
        }
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).b("U0", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        F5 f54 = this.f32321j;
        if (f54 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f54).a("U0", "callback - onAdLoadSucceeded");
        }
        listener.c(adMetaInfoL);
    }

    public static final void d(U0 u02) {
        int i10;
        String strK;
        F5 f52 = u02.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "startAdFetchWorker ", u02));
        }
        W0 w02 = u02.I;
        w02.getClass();
        w02.f32418d = SystemClock.elapsedRealtime();
        F5 f53 = u02.f32321j;
        if (f53 != null) {
            ((G5) f53).a("U0", F0.a("U0", "TAG", "doAdLoadWork ", u02));
        }
        try {
            u02.d((byte) 1);
            F5 f54 = u02.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).d("U0", "AdUnit " + u02 + " state - LOADING");
            }
            F5 f55 = u02.f32321j;
            if (f55 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f55).c("U0", "printPublisherTestId " + u02);
            }
            Se.f32278a.d();
            i10 = 0;
        } catch (Exception e10) {
            F5 f56 = u02.f32321j;
            if (f56 != null) {
                ((G5) f56).b("U0", Qf.a(e10, N6.a("U0", "TAG", "Load failed with unexpected error: ")));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            u02.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
        if (u02.e((byte) 0)) {
            A a10 = u02.C;
            int iHashCode = u02.hashCode();
            M m9 = new M(u02, u02.f32321j);
            a10.getClass();
            A.a(iHashCode, m9);
        } else {
            i10 = -2;
        }
        if (i10 == -2) {
            strK = "Loading an ad resulted in an unexpected error";
        } else if (i10 == -1) {
            strK = "Ad request skipped as monetization is disabled";
        } else if (i10 != 0) {
            strK = p0.o2.k(i10, "Unknown return value (", ") from #doAdLoadWork()");
        } else {
            strK = "Fresh ad requested";
        }
        F5 f57 = u02.f32321j;
        if (f57 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f57).c("U0", strK);
        }
    }

    public final void a(AdConfig adConfig) {
        this.f32313b = adConfig;
    }

    public final void a(Handler handler) {
        this.f32323l = handler;
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z10, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestStatus, "requestStatus");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).b("U0", "handleAdLoadFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f32312a == 1 && z10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).b("U0", AbstractC2803h9.a("U0", "TAG", "load failed - ", s10));
            }
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).d("U0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        H0 h0R = r();
        if (h0R != null) {
            h0R.a(this, requestStatus);
        } else {
            F5 f55 = this.f32321j;
            if (f55 != null) {
                ((G5) f55).a();
            }
        }
        if (s10 != 0) {
            b(s10);
        }
    }

    public final void a(C2888ma c2888ma) {
        this.f32330s = c2888ma;
    }

    public final void a(long j10) {
        this.f32336y = j10;
    }

    public final void a(TreeSet<Integer> treeSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(treeSet, "<set-?>");
        this.f32337z = treeSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r13, com.inmobi.media.C2675a0 r14, com.inmobi.media.H0 r15) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U0.a(android.content.Context, com.inmobi.media.a0, com.inmobi.media.H0):void");
    }

    public final void f() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "checkInteractiveAndSignal ", this));
        }
        if (this.f32324m && this.f32327p && this.f32328q) {
            s0();
        }
    }

    @Override // com.inmobi.media.Ac
    public void g(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "RenderView completed loading ad content, for index ");
            sbA.append(this.f32318g.indexOf(renderView));
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).a("U0", sbA.toString());
        }
    }

    public final void b(A0 adSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSet, "adSet");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "loadResponse ", this));
        }
        c(adSet);
    }

    public final void g(int i10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "resetCurrentRenderingIndex ", this));
        }
        this.f32335x = i10;
    }

    public void b(H0 h02) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "handleAdScreenDisplayed ", this));
        }
    }

    public static final void b(U0 this$0, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        this$0.a(renderView, (short) 2137);
    }

    public void b(final GestureDetectorOnGestureListenerC3093yc renderView, final short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onRenderViewError ", this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        try {
            Handler handler = this.f32323l;
            if (handler != null) {
                handler.post(new Runnable() { // from class: zk.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        U0.a(this.f98052b, renderView, s10);
                    }
                });
            }
        } catch (Exception e10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).b("U0", Qf.a(e10, N6.a("U0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.Ac
    public void b(HashMap<Object, Object> rewards) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rewards, "rewards");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onAdRewardActionCompleted ", this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).a("U0", "Ad reward action completed. Params:" + rewards);
        }
        H0 h0R = r();
        if (h0R != null) {
            h0R.b(rewards);
        }
    }

    public void d(String podAdContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(podAdContext, "podAdContext");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "setPodAdContext ", this));
        }
        if (this.A) {
            this.B = podAdContext;
        }
    }

    public final void b(short s10) {
        long j10;
        long jElapsedRealtime;
        String strS;
        Boolean boolO;
        String strP;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdLoadFailedEvent ", this));
        }
        HashMap map = new HashMap();
        if (s10 == 2138 || s10 == 2109) {
            j10 = this.I.f32418d;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s10 == 2139) {
            j10 = this.I.f32421g;
            ScheduledExecutorService scheduledExecutorService2 = AbstractC2809hf.f32906a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = this.I.f32417c;
            ScheduledExecutorService scheduledExecutorService3 = AbstractC2809hf.f32906a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put(DTBMetricReport.LATENCY, Long.valueOf(jElapsedRealtime - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", F());
        C2793h c2793hU = u();
        if (c2793hU == null || (strS = c2793hU.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        C2793h c2793hU2 = u();
        if (c2793hU2 != null && (strP = c2793hU2.p()) != null) {
            map.put("creativeType", strP);
        }
        C2884m6 c2884m6 = this.E;
        if (c2884m6 != null) {
            map.put("retryCount", Integer.valueOf(c2884m6.f33089b));
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (T().length() > 0) {
            map.put("metadataBlob", T());
        }
        c(map);
        a(u(), map);
        c("AdLoadFailed", map);
    }

    public static final void c(U0 this$0, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        this$0.n(renderView);
    }

    @Override // com.inmobi.media.Ac
    public void c() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onAdScreenDisplayFailed ", this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).b("U0", "Ad failed to display");
        }
        Handler handler = this.f32323l;
        if (handler != null) {
            handler.post(new zk.r(this, 2));
        }
    }

    @Override // com.inmobi.media.Ac
    public void d(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (this.L) {
            return;
        }
        this.L = true;
        Hc hc2 = renderView.f33613a0;
        if (hc2 != null) {
            Map mapA = hc2.a();
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("AttachedToWindow", mapA, EnumC2993se.f33373a);
        }
    }

    public final void c(HashMap map) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "constructTelemetryPayload ", this));
        }
        map.put("adType", q());
        map.put("networkType", R3.x());
        map.put("plId", Long.valueOf(this.f32331t.l()));
        String strM = this.f32331t.m();
        if (strM != null) {
            map.put("plType", strM);
        }
    }

    public final void d(boolean z10) {
        this.A = z10;
    }

    public final void c(short s10) {
        String strS;
        Boolean boolO;
        String strP;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdShowFailed ", this));
        }
        HashMap map = new HashMap();
        long j10 = this.I.f32419e;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", F());
        C2793h c2793hV = v();
        if (c2793hV == null || (strS = c2793hV.s()) == null) {
            strS = "";
        }
        map.put("impressionId", strS);
        C2793h c2793hV2 = v();
        if (c2793hV2 != null && (strP = c2793hV2.p()) != null) {
            map.put("creativeType", strP);
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (T().length() > 0) {
            map.put("metadataBlob", T());
        }
        c(map);
        a(v(), map);
        c("AdShowFailed", map);
    }

    public final void b(Map<String, Object> payload) {
        Boolean boolO;
        String strP;
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitServerError ", this));
        }
        if (this.f32316e == null) {
            return;
        }
        if (payload.get("reason") == null) {
            payload.put("reason", "");
        }
        C2793h c2793hU = u();
        if (c2793hU != null && (strP = c2793hU.p()) != null) {
            payload.put("creativeType", strP);
        }
        C2884m6 c2884m6 = this.E;
        if (c2884m6 != null) {
            payload.put("retryCount", Integer.valueOf(c2884m6.f33089b));
        }
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            payload.put("isRewarded", boolO);
        }
        a(u(), payload);
        D0 d02 = this.f32316e;
        kotlin.jvm.internal.e0.checkNotNull(d02);
        d02.a(payload);
    }

    public final void c(String eventType, Map<String, Object> kv2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(kv2, "kv");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitTelemetryEvent ", this));
        }
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b(eventType, kv2, EnumC2993se.f33373a);
    }

    public void c(byte b10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).b("U0", F0.a("U0", "TAG", "onOOM ", this));
        }
        if (b10 == 0) {
            a(this.f32331t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2110);
            return;
        }
        if (b10 == 2 || b10 == 1) {
            byte b11 = this.f32312a;
            if (b11 == 0 || 1 == b11 || 2 == b11) {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f53).a("U0", "onOOM INTERNAL_LOAD_TIME_OUT or PRE_LOAD_TIME_OUT");
                }
                this.G.removeCallbacksAndMessages(null);
                n0();
                b((short) 2112);
                H0 h0R = r();
                if (h0R != null) {
                    h0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
                    return;
                }
                return;
            }
            return;
        }
        if (b10 == 4) {
            H0 h0R2 = r();
            if (h0R2 != null) {
                h0R2.g();
                return;
            }
            return;
        }
        if (b10 == 3) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                ((G5) f54).a("U0", AbstractC2803h9.a("U0", "TAG", "OOM Timeout scenario ignored for : ", b10));
                return;
            }
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            ((G5) f55).a("U0", AbstractC2803h9.a("U0", "TAG", "OOM Timeout scenario ignored for : ", b10));
        }
    }

    public final void b(long j10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdGetSignalsSucceeded ", this));
        }
        this.f32329r = false;
        HashMap map = new HashMap();
        map.put("adType", q());
        map.put(DTBMetricReport.LATENCY, Long.valueOf(System.currentTimeMillis() - j10));
        map.put("networkType", R3.x());
        c("AdGetSignalsSucceeded", map);
    }

    public void a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "setContext ", this));
        }
        this.f32314c = new WeakReference(context);
    }

    public final void a(F5 logger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(logger, "logger");
        this.f32321j = logger;
        D0 d0P = p();
        d0P.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(logger, "logger");
        d0P.f31726f = logger;
        O o10 = this.D;
        o10.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(logger, "logger");
        o10.f32086f = logger;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "kv"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            com.inmobi.media.F5 r0 = r5.f32321j
            java.lang.String r1 = "TAG"
            java.lang.String r2 = "U0"
            if (r0 == 0) goto L32
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onTelemetryEvent "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " adState="
            r3.append(r4)
            byte r4 = r5.f32312a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.G5 r0 = (com.inmobi.media.G5) r0
            r0.c(r2, r3)
        L32:
            byte r0 = r5.f32312a
            r3 = 3
            if (r0 == r3) goto Lb8
            r3 = 8
            if (r0 == r3) goto Lb8
            com.inmobi.media.F5 r0 = r5.f32321j
            if (r0 == 0) goto L4a
            java.lang.String r3 = "addRetryCountToTelemetryEvent event - "
            java.lang.String r1 = com.inmobi.media.O6.a(r2, r1, r3, r6)
            com.inmobi.media.G5 r0 = (com.inmobi.media.G5) r0
            r0.c(r2, r1)
        L4a:
            int r0 = r6.hashCode()
            java.lang.String r1 = "ServerFill"
            java.lang.String r2 = "ServerError"
            switch(r0) {
                case -1959333523: goto L7f;
                case 167123846: goto L78;
                case 885222501: goto L71;
                case 925075267: goto L68;
                case 1881615718: goto L5f;
                case 1925668903: goto L56;
                default: goto L55;
            }
        L55:
            goto L96
        L56:
            java.lang.String r0 = "ServerNoFill"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L87
            goto L96
        L5f:
            java.lang.String r0 = "AdLoadFailed"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L87
            goto L96
        L68:
            java.lang.String r0 = "AdLoadSuccessful"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L87
            goto L96
        L71:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L87
            goto L96
        L78:
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L87
            goto L96
        L7f:
            java.lang.String r0 = "RenderSuccess"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L96
        L87:
            com.inmobi.media.m6 r0 = r5.E
            if (r0 == 0) goto L96
            int r0 = r0.f33089b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "retryCount"
            r7.put(r3, r0)
        L96:
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r6, r1)
            if (r0 == 0) goto L9e
            r0 = 1
            goto La2
        L9e:
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r6, r2)
        La2:
            if (r0 == 0) goto Lb5
            com.inmobi.media.h r0 = r5.u()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = r0.p()
            if (r0 == 0) goto Lb5
            java.lang.String r1 = "creativeType"
            r7.put(r1, r0)
        Lb5:
            r5.c(r6, r7)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U0.b(java.lang.String, java.util.Map):void");
    }

    public final S a(int i10) {
        String strU;
        String strT;
        Boolean boolO;
        String strO;
        String strP;
        String strW;
        String strS;
        C2793h c2793hB = b(i10);
        if (c2793hB == null || (strU = c2793hB.u()) == null) {
            strU = "html";
        }
        String str = strU;
        String strA = (kotlin.jvm.internal.e0.areEqual(this.f32331t.b(), "banner") || kotlin.jvm.internal.e0.areEqual(this.f32331t.b(), "audio")) ? this.f32331t.a() : null;
        String strB = this.f32331t.b();
        boolean zB = b(c2793hB);
        long jL = this.f32331t.l();
        boolean zC = c(i10);
        String strE = this.f32331t.e();
        String strP2 = c2793hB != null ? c2793hB.p() : null;
        AdMetaInfo adMetaInfoL = l();
        String creativeID = adMetaInfoL != null ? adMetaInfoL.getCreativeID() : null;
        boolean zP = this.f32331t.p();
        String str2 = creativeID;
        LinkedHashMap linkedHashMap = this.H;
        WatermarkData watermarkData = this.J;
        AdQualityControl adQualityControlE = c2793hB != null ? c2793hB.e() : null;
        byte bK = K();
        HashMap map = this.f32320i;
        Set set = map != null ? (Set) map.get(Integer.valueOf(i10)) : null;
        C2793h c2793hB2 = b(i10);
        String strS2 = c2793hB2 != null ? c2793hB2.s() : null;
        if (c2793hB == null || (strT = c2793hB.t()) == null) {
            strT = "DEFAULT";
        }
        LinkedHashMap linkedHashMap2 = Q2.f32149a;
        Set set2 = set;
        String str3 = strS2;
        Gc gc2 = new Gc(((TelemetryConfig) AbstractC3035v5.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null)).getMaxTemplateEvents());
        C2675a0 c2675a0 = this.f32331t;
        String strF = F();
        String str4 = (c2793hB == null || (strS = c2793hB.s()) == null) ? "" : strS;
        String str5 = (c2793hB == null || (strW = c2793hB.w()) == null) ? "" : strW;
        C2884m6 c2884m6 = this.E;
        boolean zBooleanValue = false;
        int i11 = c2884m6 != null ? c2884m6.f33089b : 0;
        C2793h c2793hU = u();
        String str6 = (c2793hU == null || (strP = c2793hU.p()) == null) ? "" : strP;
        C2793h c2793hU2 = u();
        String str7 = (c2793hU2 == null || (strO = c2793hU2.o()) == null) ? "" : strO;
        A0 a02 = this.f32332u;
        if (a02 != null && (boolO = a02.o()) != null) {
            zBooleanValue = boolO.booleanValue();
        }
        return new S(strB, zB, jL, zC, str2, strP2, str, strA, this, strE, linkedHashMap, Boolean.valueOf(zP), watermarkData, adQualityControlE, bK, set2, str3, strT, new Bc(c2675a0, strF, str4, str5, i11, str6, str7, zBooleanValue, i10, this.I.f32424j, gc2, BuildConfig.FLAVOR), this.f32321j, 2228224);
    }

    @Override // com.inmobi.media.Ac
    public void c(GestureDetectorOnGestureListenerC3093yc renderView) {
        List<String> listC;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "fireImpressionTracker ", this));
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        C2793h c2793hB = b(this.f32318g.indexOf(renderView));
        if (((c2793hB != null ? c2793hB.p() : null) != null && kotlin.jvm.internal.e0.areEqual(c2793hB.p(), "video")) || c2793hB == null || (listC = c2793hB.c("impression")) == null) {
            return;
        }
        for (String str : listC) {
            C3078xe telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f33587f = "adResponseTracker";
            C3100z2.f33672a.b(str, true, (AbstractC2694b2) new N(this.D, telemetryOnAdImpression), this.f32321j);
        }
    }

    public final void b(byte b10) {
        Fe fe2;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "cancelTimer ", this));
        }
        if (b10 == 1 && (fe2 = this.f32333v) != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Fe", "TAG");
            Timer timer = (Timer) fe2.f31801b.get((byte) 2);
            if (timer != null) {
                timer.cancel();
                fe2.f31801b.remove((byte) 2);
            }
        }
        Fe fe3 = this.f32333v;
        if (fe3 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Fe", "TAG");
            Timer timer2 = (Timer) fe3.f31801b.get(Byte.valueOf(b10));
            if (timer2 != null) {
                timer2.cancel();
                fe3.f31801b.remove(Byte.valueOf(b10));
            }
        }
    }

    public final void b(int i10, boolean z10) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "fireAdPodShowResult ", this));
        }
        ArrayList list = this.f32318g;
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        if (i10 < 0 || i10 >= list.size() || (gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(i10)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3093yc.b(z10);
    }

    @Override // com.inmobi.media.Ac
    public void b(GestureDetectorOnGestureListenerC3093yc renderView) {
        List<String> listC;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "fireClickTracker ", this));
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        C2793h c2793hB = b(this.f32318g.indexOf(renderView));
        if (((c2793hB != null ? c2793hB.p() : null) != null && kotlin.jvm.internal.e0.areEqual(c2793hB.p(), "video")) || c2793hB == null || (listC = c2793hB.c("click")) == null) {
            return;
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            C3100z2.f33672a.a(it.next(), true, this.f32321j);
        }
    }

    public final tu.v a(boolean z10, boolean z11, boolean z12) {
        Short sh2;
        StringBuilder sb2 = new StringBuilder("Immersive not supported on");
        BitSet bitSet = new BitSet(3);
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.add(" config");
            bitSet.set(0);
        }
        if (!z11) {
            arrayList.add(" device");
            bitSet.set(1);
        }
        if (!z12) {
            arrayList.add(" ad");
            bitSet.set(2);
        }
        sb2.append(uu.y0.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        kotlin.jvm.internal.e0.checkNotNullParameter(bitSet, "bitSet");
        if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
            sh2 = (short) 2202;
        } else if (bitSet.get(0) && bitSet.get(1)) {
            sh2 = (short) 2200;
        } else if (bitSet.get(0) && bitSet.get(2)) {
            sh2 = (short) 2199;
        } else if (bitSet.get(1) && bitSet.get(2)) {
            sh2 = (short) 2201;
        } else if (bitSet.get(0)) {
            sh2 = (short) 2196;
        } else if (bitSet.get(1)) {
            sh2 = (short) 2197;
        } else {
            sh2 = bitSet.get(2) ? (short) 2198 : null;
        }
        short sShortValue = sh2 != null ? sh2.shortValue() : (short) -1;
        if (sShortValue == -1) {
            return new tu.v("Invalid Reason", (short) -1);
        }
        return new tu.v(sb2.toString(), Short.valueOf(sShortValue));
    }

    public final void a(H0 listener, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onAdShowFailed ", this));
        }
        c(s10);
        listener.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.inmobi.media.C2793h r29, int r30, boolean r31) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U0.a(com.inmobi.media.h, int, boolean):boolean");
    }

    public final HashMap a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "parseInMobiViewabilityParams ", this));
        }
        try {
            int length = jSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i10++;
            }
            if (jSONObject != null) {
                HashMap map = new HashMap();
                String strOptString = jSONObject.optString(DTBMetricReport.TIME);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "optString(...)");
                int iB = b(strOptString);
                if (iB != -1) {
                    map.put(DTBMetricReport.TIME, Integer.valueOf(iB));
                }
                String strOptString2 = jSONObject.optString("view");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString2, "optString(...)");
                int iB2 = b(strOptString2);
                if (iB2 != -1) {
                    map.put("view", Integer.valueOf(iB2));
                }
                String strOptString3 = jSONObject.optString("pixel");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString3, "optString(...)");
                int iB3 = b(strOptString3);
                if (iB3 != -1) {
                    map.put("pixel", Integer.valueOf(iB3));
                }
                int iOptInt = jSONObject.optInt("type");
                if (iOptInt != -1) {
                    map.put("type", Integer.valueOf(iOptInt));
                    if (iOptInt == 2) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("frame");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("frame");
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONArrayOptJSONArray2, "optJSONArray(...)");
                            map.put("frame", jSONArrayOptJSONArray2);
                            return map;
                        }
                        map.put("frame", new JSONArray("[0,0,0,0]"));
                    }
                }
                return map;
            }
        } catch (JSONException e10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).b("U0", G0.a(e10, N6.a("U0", "TAG", "Exception while parsing MoatParams from response : ")));
            }
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        return null;
    }

    public void a(C2675a0 placement, boolean z10, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onAssetAvailabilityChanged ", this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        if (s10 != 0) {
            b(s10);
        }
        a(placement, z10);
    }

    public void a(C2675a0 placement, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        F5 f52 = this.f32321j;
        String str = TJzY.uMxA;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", str, "handleAssetAvailabilityChanged ", this));
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", str);
            ((G5) f53).a("U0", "Asset availability changed (" + z10 + ") for placement ID (" + placement + ')');
        }
    }

    public void a(A0 adSet) {
        LinkedList<C2793h> linkedListF;
        LinkedList<C2793h> linkedListF2;
        kotlin.jvm.internal.e0.checkNotNullParameter(adSet, "adSet");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "handleAdFetchSuccessful ", this));
        }
        if (this.f32312a == 1) {
            this.f32332u = adSet;
            int size = 0;
            this.A = adSet != null ? adSet.n() : false;
            A0 a02 = this.f32332u;
            if (a02 != null && (linkedListF2 = a02.f()) != null) {
                size = linkedListF2.size();
            }
            this.f32318g = new ArrayList(size);
            A0 a03 = this.f32332u;
            if (a03 != null && (linkedListF = a03.f()) != null) {
                for (C2793h c2793h : linkedListF) {
                    this.f32318g.add(null);
                }
            }
            C2793h c2793hP = adSet.p();
            if (c2793hP == null) {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f53).b("U0", "top ad is null. failed.");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2119);
                return;
            }
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).a("U0", "starting executor. parsing ad response");
            }
            A a10 = this.C;
            int iHashCode = hashCode();
            Ea ea2 = new Ea(this, c2793hP, adSet, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f32321j);
            a10.getClass();
            A.a(iHashCode, ea2);
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "incorrect state - ");
            sbA.append((int) this.f32312a);
            ((G5) f55).b("U0", sbA.toString());
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
    }

    public void a(int i10, GestureDetectorOnGestureListenerC3093yc renderView, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "Show pod ad with index : " + i10 + " from creative: " + this.f32318g.indexOf(renderView) + ' ' + this);
        }
        if (i10 >= 0) {
            this.f32335x = i10;
        } else {
            this.f32335x++;
        }
    }

    @Override // com.inmobi.media.InterfaceC2692b0
    public void a(GestureDetectorOnGestureListenerC3093yc renderView, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "closeCurrentPodAd ", this));
        }
    }

    @Override // com.inmobi.media.InterfaceC2692b0
    public boolean a(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 == null) {
            return false;
        }
        ((G5) f52).c("U0", F0.a("U0", "TAG", "hasNextAdInAdPod ", this));
        return false;
    }

    public void a(boolean z10, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onDidParseAfterFetch ", this));
        }
        if (z10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).a("U0", "Ad fetch successful");
            }
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).d("U0", "AdUnit " + this + QGjYBESwAiCc.teMzhpPvKWbAgqh);
            }
            d((byte) 2);
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f55).b("U0", "onComplete parse success");
        }
        b(status, true, (short) 0);
    }

    public final void a(C2675a0 placement, InMobiAdRequestStatus requestStatus, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.e0.checkNotNullParameter(requestStatus, "requestStatus");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onAdFetchFailed ", this));
        }
        if (!this.f32326o && t() != null && this.f32312a != 3) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).c("U0", F0.a("U0", "TAG", "handleMarkupFetchFailure ", this));
            }
            try {
                if (kotlin.jvm.internal.e0.areEqual(this.f32331t, placement) && this.f32312a == 1) {
                    F5 f54 = this.f32321j;
                    if (f54 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                        ((G5) f54).b("U0", "Failed to fetch ad for placement id: " + placement + ", reason - " + requestStatus.getMessage());
                    }
                    String str = "MarkupFetch failed reason is: " + requestStatus.getMessage();
                    F5 f55 = this.f32321j;
                    if (f55 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                        ((G5) f55).b("U0", str);
                    }
                    F5 f56 = this.f32321j;
                    if (f56 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                        ((G5) f56).d("U0", "AdUnit " + this + " state - FAILED");
                    }
                    d((byte) 3);
                    b((byte) 1);
                    if (s10 != 0) {
                        a(s10);
                    }
                    H0 h0R = r();
                    if (h0R != null) {
                        h0R.a(requestStatus);
                        return;
                    }
                    F5 f57 = this.f32321j;
                    if (f57 != null) {
                        ((G5) f57).a();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e10) {
                F5 f58 = this.f32321j;
                if (f58 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f58).a("U0", "onAdFetchFailed with error: ", e10);
                }
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                return;
            }
        }
        F5 f59 = this.f32321j;
        if (f59 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "callback ignored - isDestroyed - ");
            sbA.append(this.f32326o);
            sbA.append(" context - ");
            sbA.append(t());
            sbA.append(" state- ");
            sbA.append((int) this.f32312a);
            ((G5) f59).b("U0", sbA.toString());
        }
    }

    @Override // com.inmobi.media.De
    public void a(byte b10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onTimeOut ", this));
        }
        if (b10 == 0) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                StringBuilder sbA = N6.a("U0", "TAG", "AdRequestTimeOut by timer, Adstate=");
                sbA.append((int) this.f32312a);
                ((G5) f53).a("U0", sbA.toString());
            }
            if (this.f32312a != 3) {
                a(this.f32331t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b10 != 2 && b10 != 1) {
            if (b10 == 4) {
                F5 f54 = this.f32321j;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f54).a("U0", "Show RequestTimeOut by show timer");
                }
                H0 h0R = r();
                if (h0R != null) {
                    h0R.g();
                    return;
                }
                return;
            }
            if (b10 == 3) {
                F5 f55 = this.f32321j;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f55).a("U0", "Bitmap TimeOut not handled here");
                    return;
                }
                return;
            }
            F5 f56 = this.f32321j;
            if (f56 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f56).a("U0", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        F5 f57 = this.f32321j;
        if (f57 != null) {
            StringBuilder sbA2 = N6.a("U0", "TAG", "Internal LoadTimeOut by timer, Adstate=");
            sbA2.append((int) this.f32312a);
            ((G5) f57).a("U0", sbA2.toString());
        }
        if (this.f32312a != 3) {
            this.G.removeCallbacksAndMessages(null);
            F5 f58 = this.f32321j;
            if (f58 != null) {
                StringBuilder sbA3 = N6.a("U0", "TAG", "adUnitEventListener=");
                sbA3.append(r());
                sbA3.append(", Adstate=");
                sbA3.append((int) this.f32312a);
                ((G5) f58).a("U0", sbA3.toString());
            }
            byte b11 = this.f32312a;
            if (2 == b11) {
                n0();
                b(C2736da.a(false) == null ? (short) 2139 : (short) 2203);
                H0 h0R2 = r();
                if (h0R2 != null) {
                    h0R2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b11) {
                n0();
                b((short) 2138);
                H0 h0R3 = r();
                if (h0R3 != null) {
                    h0R3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(boolean z10, short s10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).b("U0", "handleAdShowFailure " + this + " errorCode - " + ((int) s10));
        }
        if (z10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).d("U0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 4);
        }
        H0 h0R = r();
        if (h0R != null) {
            h0R.d();
        }
        if (s10 != 0) {
            c(s10);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z10, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestStatus, "requestStatus");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).b("U0", "handleAdFetchFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f32312a == 3 && z10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).d("U0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        H0 h0R = r();
        if (h0R != null) {
            h0R.a(this, requestStatus);
        }
        if (s10 != 0) {
            a(s10);
        }
    }

    public final void a(Map<String, String> map) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).c("U0", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.f32331t.a(map);
    }

    public final void a(JSONObject responseJson) {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseJson, "responseJson");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onAuctionClosed ", this));
        }
        new Handler(Looper.getMainLooper()).post(new zk.n(12, this, responseJson));
    }

    public static final void a(U0 this$0, JSONObject responseJson) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(responseJson, "$responseJson");
        A a10 = this$0.C;
        int iHashCode = this$0.hashCode();
        A1 a12 = new A1(this$0, responseJson, this$0.f32321j);
        a10.getClass();
        A.a(iHashCode, a12);
    }

    public final void a(kv.a onSuccess, kv.l onMaxRetryReached) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.e0.checkNotNullParameter(onMaxRetryReached, "onMaxRetryReached");
        F5 f52 = this.f32321j;
        Object c3003t7 = null;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "loadWithRetry ");
            C2884m6 c2884m6 = this.E;
            sbA.append(c2884m6 != null ? Integer.valueOf(c2884m6.f33089b) : null);
            ((G5) f52).c("U0", sbA.toString());
        }
        C2884m6 c2884m62 = this.E;
        if (c2884m62 != null) {
            EnumC3017u4 enumC3017u4A = C2736da.a(false);
            if (enumC3017u4A == null) {
                c3003t7 = Da.f31737a;
            } else {
                int i10 = c2884m62.f33089b + 1;
                c2884m62.f33089b = i10;
                if (i10 >= c2884m62.f33088a.f31746b) {
                    c3003t7 = new C3003t7(enumC3017u4A);
                } else {
                    c3003t7 = Qb.f32172a;
                }
            }
        }
        if (c3003t7 instanceof C3003t7) {
            onMaxRetryReached.invoke(((C3003t7) c3003t7).f33388a);
            return;
        }
        if (c3003t7 instanceof Da) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).c("U0", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(c3003t7 instanceof Qb)) {
            if (c3003t7 == null) {
                F5 f54 = this.f32321j;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f54).c("U0", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f55).c("U0", "load failed, retrying");
        }
        this.G.postDelayed(new io.bidmachine.media3.exoplayer.b1(this, 22, onSuccess, onMaxRetryReached), this.F != null ? r7.f31745a : 1000L);
    }

    public static final void a(U0 this$0, kv.a onSuccess, kv.l onMaxRetryReached) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(onSuccess, "$onSuccess");
        kotlin.jvm.internal.e0.checkNotNullParameter(onMaxRetryReached, "$onMaxRetryReached");
        F5 f52 = this$0.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "Loading from retry Handler ");
            C2884m6 c2884m6 = this$0.E;
            sbA.append(c2884m6 != null ? Integer.valueOf(c2884m6.f33089b) : null);
            ((G5) f52).c("U0", sbA.toString());
        }
        this$0.a(onSuccess, onMaxRetryReached);
    }

    public void a(byte[] bArr) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "load response ", this));
        }
        W0 w02 = this.I;
        w02.getClass();
        w02.f32417c = SystemClock.elapsedRealtime();
        W0 w03 = this.I;
        w03.getClass();
        w03.f32422h = SystemClock.elapsedRealtime();
        if (Z()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).a("U0", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            if (this.f32330s == null) {
                this.f32330s = new C2888ma(this);
            }
            Q0 q02 = new Q0(this, bArr);
            if (q0()) {
                F5 f54 = this.f32321j;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f54).a("U0", "skipping internet check on load(byte[])");
                }
                q02.invoke();
                return;
            }
            F5 f55 = this.f32321j;
            if (f55 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f55).a("U0", "starting load with retry");
            }
            a(q02, new P0(this));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        F5 f56 = this.f32321j;
        if (f56 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f56).a("U0", "null response. failing");
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestStatus, "requestStatus");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).b("U0", "loadResponseFailed " + this + " errorCode - " + ((int) s10));
        }
        b(requestStatus, true, s10);
    }

    public final boolean a(H0 h02, long j10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "isBlockingStateForGetSignals ", this));
        }
        if (this.f32329r) {
            AbstractC2902n7.a((byte) 2, "InMobi", "getSignals() call is already in progress. Please wait for its execution to get complete");
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).b("U0", "getSignals() call is already in progress. Please wait for its execution to get complete");
            }
            return true;
        }
        if (!g0()) {
            return false;
        }
        if (h02 != null) {
            h02.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
        }
        a(2007, j10);
        return true;
    }

    public final void a(WeakReference<H0> listenerWeakReference, short s10, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listenerWeakReference, "listenerWeakReference");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "onLoadAdMarkupFailed ", this));
        }
        d((byte) 3);
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).d("U0", "AdUnit " + this + " state - FAILED");
        }
        b((byte) 1);
        if (this.f32326o) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).b("U0", "AdUnit destroyed while onLoadAdMarkupFailed");
                return;
            }
            return;
        }
        H0 h02 = listenerWeakReference.get();
        if (h02 != null) {
            if (kotlin.jvm.internal.e0.areEqual("int", q())) {
                a(h02, s10);
                return;
            } else {
                b(s10);
                h02.a(this, status);
                return;
            }
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f55).b("U0", "Listener was garbage collected.Unable to give callback");
        }
    }

    public void a(H0 h02) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "handleAdScreenDismissed ", this));
        }
    }

    public void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, short s10) {
        List<String> listC;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "Render view signaled ad failed, for index ");
            sbA.append(this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc));
            sbA.append(' ');
            sbA.append(this);
            ((G5) f52).b("U0", sbA.toString());
        }
        if (gestureDetectorOnGestureListenerC3093yc == null || !kotlin.jvm.internal.e0.areEqual(gestureDetectorOnGestureListenerC3093yc.getMarkupType(), "htmlUrl")) {
            return;
        }
        int iIndexOf = this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc);
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).b("U0", "fireLoadAdTokenUrlFailed : " + iIndexOf + ' ' + this);
        }
        C2793h c2793hB = b(iIndexOf);
        if (c2793hB == null || (listC = c2793hB.c(C2793h.LOAD_AD_TOKEN_URL_FAILURE)) == null) {
            return;
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            C3100z2.f33672a.a(it.next(), true, this.f32321j);
        }
    }

    public final void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkData, "watermarkData");
        this.J = watermarkData;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycX = x();
        if (gestureDetectorOnGestureListenerC3093ycX != null) {
            gestureDetectorOnGestureListenerC3093ycX.setWatermark(watermarkData);
        }
    }

    public static /* synthetic */ void a(U0 u02, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroyContainer");
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        u02.a(i10, z10);
    }

    public final void a(int i10, boolean z10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).a("U0", "Destroying container for index " + i10 + ' ' + this);
        }
        ArrayList list = this.f32318g;
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        if (i10 < 0 || i10 >= list.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(i10);
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.F0.set(z10);
            gestureDetectorOnGestureListenerC3093yc.stopLoading();
            gestureDetectorOnGestureListenerC3093yc.b();
        }
        this.f32318g.set(i10, null);
    }

    @Override // com.inmobi.media.Ac
    public void a(GestureDetectorOnGestureListenerC3093yc renderView, String trackerName, Map<String, String> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(map, KGUkpTlXZlJLy.ugBhplcaQyPZjup);
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).a("U0", "fireLandingPageTracker " + trackerName + ' ' + this);
        }
        C2793h c2793hB = b(this.f32318g.indexOf(renderView));
        if (c2793hB != null) {
            List<String> listC = c2793hB.c(trackerName);
            if (listC == null) {
                return;
            }
            for (String str : listC) {
                String strReplace$default = str;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    strReplace$default = sv.k0.replace$default(strReplace$default, entry.getKey(), entry.getValue(), false, 4, (Object) null);
                }
                C3100z2.f33672a.a(strReplace$default, true, this.f32321j);
            }
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).a("U0", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.Ac
    public void a(String log) {
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        H0 h0R = r();
        if (h0R != null) {
            h0R.a(log);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3093yc renderView, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        this.f32318g.add(i10, renderView);
        this.f32337z.add(Integer.valueOf(i10));
    }

    public final String a(double d10) {
        if (this.N.compareAndSet(false, true)) {
            try {
                C2793h c2793hM = m();
                if (c2793hM == null || X()) {
                    c2793hM = null;
                }
                List<String> listC = c2793hM != null ? c2793hM.c(C2793h.WIN_BEACON) : null;
                if (listC != null && !listC.isEmpty()) {
                    for (String url : listC) {
                        Map macros = uu.p1.mapOf(tu.e0.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), tu.e0.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10)));
                        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
                        String strReplace$default = url;
                        for (Map.Entry entry : macros.entrySet()) {
                            strReplace$default = sv.k0.replace$default(strReplace$default, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                        }
                        C3100z2.f33672a.a(strReplace$default, true, this.f32321j);
                    }
                    if (d10 <= 0.0d) {
                        return "notification triggering with invalid params";
                    }
                    return null;
                }
                return "no win/loss notification url";
            } catch (Exception e10) {
                F5 f52 = this.f32321j;
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f52).a("U0", "Exception in notifyWin", e10);
                    return "win notification failed internally";
                }
                return "win notification failed internally";
            }
        }
        return "win/loss notification already triggered";
    }

    public final String a(int i10, double d10) {
        if (this.N.compareAndSet(false, true)) {
            try {
                C2793h c2793hM = m();
                if (c2793hM == null || X()) {
                    c2793hM = null;
                }
                List<String> listC = c2793hM != null ? c2793hM.c(C2793h.LOSS_BEACON) : null;
                if (listC != null && !listC.isEmpty()) {
                    for (String url : listC) {
                        Map macros = uu.p1.mapOf(tu.e0.to(com.ironsource.mediationsdk.d.f37325l, String.valueOf(i10)), tu.e0.to(com.ironsource.mediationsdk.d.f37327n, String.valueOf(d10)));
                        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
                        String strReplace$default = url;
                        for (Map.Entry entry : macros.entrySet()) {
                            strReplace$default = sv.k0.replace$default(strReplace$default, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                        }
                        C3100z2.f33672a.a(strReplace$default, true, this.f32321j);
                    }
                    if (i10 <= 0 || d10 <= 0.0d) {
                        return "notification triggering with invalid params";
                    }
                    return null;
                }
                return "no win/loss notification url";
            } catch (Exception e10) {
                F5 f52 = this.f32321j;
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                    ((G5) f52).a("U0", "Exception in notifyLoss", e10);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        return "win/loss notification already triggered";
    }

    public static final void a(U0 this$0, GestureDetectorOnGestureListenerC3093yc renderView, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        this$0.a(renderView, s10);
    }

    @Override // com.inmobi.media.Ac
    public void a(HashMap<Object, Object> params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onAdInteraction ", this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).a("U0", "Ad interaction. Params: " + params);
        }
        H0 h0R = r();
        if (h0R != null) {
            h0R.a(params);
        }
    }

    @Override // com.inmobi.media.Ac
    public void a(C3078xe telemetryOnAdImpression) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onImpressionFiredFromTemplate ", this));
        }
        telemetryOnAdImpression.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f33587f = "imraid_impressionFired";
        if (!this.f32326o && t() != null) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f53).a("U0", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f32323l;
            if (handler != null) {
                handler.post(new zk.n(13, this, telemetryOnAdImpression));
                return;
            }
            return;
        }
        telemetryOnAdImpression.b();
    }

    public static final void a(U0 this$0, C3078xe telemetryOnAdImpression) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryOnAdImpression, "$telemetryOnAdImpression");
        this$0.D.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.Ac, com.inmobi.media.InterfaceC2758ef
    public void a() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onUserLeaveApplication ", this));
        }
        if (this.f32326o || t() == null) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f53).a("U0", "User left application");
        }
        H0 h0R = r();
        if (h0R != null) {
            h0R.h();
        }
    }

    public final void a(short s10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdLoadDroppedAtSDK ", this));
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void a(int i10, long j10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "submitAdGetSignalsFailed ", this));
        }
        this.f32329r = false;
        HashMap map = new HashMap();
        map.put("adType", q());
        map.put(DTBMetricReport.LATENCY, Long.valueOf(System.currentTimeMillis() - j10));
        map.put("networkType", R3.x());
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        c("AdGetSignalsFailed", map);
    }

    public final void a(C2793h c2793h, Map map) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "updateIdsInTelemetryPayload ", this));
        }
        if (c2793h != null) {
            map.put("creativeId", c2793h.o());
        }
    }

    @Override // com.inmobi.media.Ac
    public void a(String eventType, Map<String, Object> kv2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(kv2, "kv");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onRenderViewRequestedAction ", this));
        }
        c(eventType, kv2);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x040a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0268 A[Catch: Exception -> 0x00c8, TRY_LEAVE, TryCatch #3 {Exception -> 0x00c8, blocks: (B:32:0x00b9, B:34:0x00bd, B:37:0x00cb, B:41:0x011b, B:43:0x0146, B:44:0x0151, B:46:0x0157, B:48:0x0167, B:50:0x016b, B:52:0x018f, B:54:0x0195, B:56:0x01ae, B:55:0x01a2, B:58:0x01bb, B:62:0x01cc, B:65:0x01d6, B:67:0x01fb, B:69:0x0230, B:75:0x0241, B:77:0x0268, B:66:0x01e9, B:40:0x010f), top: B:152:0x00b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.inmobi.media.C2793h r39) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U0.a(com.inmobi.media.h):void");
    }

    public final C2903n8 a(C3106z8 c3106z8) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "isSkippableVideo ", this));
        }
        Iterator it = c3106z8.c().iterator();
        while (it.hasNext()) {
            C2903n8 c2903n8 = (C2903n8) c3106z8.n((String) it.next()).get(0);
            if (2 == c2903n8.f33146k) {
                return c2903n8;
            }
        }
        return null;
    }

    public final void a(boolean z10, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        Set<Pe> setE;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2;
        C2956qa c2956qaA;
        AdConfig.ViewabilityConfig viewability;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("U0", F0.a("U0", "TAG", "omidSessionForHtmlMarkup ", this));
        }
        AdConfig adConfig = this.f32313b;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            AbstractC3074xa.f33574a.getClass();
            if (Omid.isActive() && (setE = e(this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc))) != null) {
                for (Pe pe2 : setE) {
                    if (3 == pe2.f32140a) {
                        try {
                            String str = (String) pe2.a("creativeType", String.class);
                            String str2 = (String) pe2.a("customReferenceData", String.class);
                            Boolean bool = (Boolean) pe2.a("isolateVerificationScripts", Boolean.class);
                            Byte b10 = (Byte) pe2.a("impressionType", Byte.class);
                            if (str == null || bool == null || b10 == null) {
                                gestureDetectorOnGestureListenerC3093yc2 = gestureDetectorOnGestureListenerC3093yc;
                                c2956qaA = null;
                            } else {
                                boolean zBooleanValue = bool.booleanValue();
                                String strE = this.f32331t.e();
                                byte bByteValue = b10.byteValue();
                                gestureDetectorOnGestureListenerC3093yc2 = gestureDetectorOnGestureListenerC3093yc;
                                try {
                                    c2956qaA = AbstractC3006ta.a(str, gestureDetectorOnGestureListenerC3093yc2, zBooleanValue, strE, bByteValue, str2);
                                } catch (Exception e10) {
                                    e = e10;
                                    Exception exc = e;
                                    F5 f53 = this.f32321j;
                                    if (f53 != null) {
                                        ((G5) f53).b("U0", Qf.a(exc, N6.a("U0", "TAG", "Setting up impression tracking for IAB encountered an unexpected error: ")));
                                    }
                                    Y5 y52 = Y5.f32563a;
                                    Y5.f32566d.a(C5.a(exc, NotificationCompat.CATEGORY_EVENT));
                                    gestureDetectorOnGestureListenerC3093yc = gestureDetectorOnGestureListenerC3093yc2;
                                }
                            }
                            if (c2956qaA != null) {
                                pe2.f32141b.put("omidAdSession", c2956qaA);
                                pe2.f32141b.put("deferred", Boolean.valueOf(z10));
                                F5 f54 = this.f32321j;
                                if (f54 != null) {
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                                    ((G5) f54).a("U0", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                F5 f55 = this.f32321j;
                                if (f55 != null) {
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                                    ((G5) f55).a("U0", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            gestureDetectorOnGestureListenerC3093yc2 = gestureDetectorOnGestureListenerC3093yc;
                        }
                        gestureDetectorOnGestureListenerC3093yc = gestureDetectorOnGestureListenerC3093yc2;
                    }
                }
            }
        }
    }

    public static final void a(U0 u02, C2793h c2793h, String str) {
        F5 f52 = u02.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "updateAdForBlob ", u02));
        }
        c2793h.e(str);
        F5 f53 = u02.f32321j;
        if (f53 != null) {
            ((G5) f53).c("U0", F0.a("U0", "TAG", "updateAd ", u02));
        }
        A0 a02 = u02.f32332u;
        if (a02 != null) {
            a02.a(c2793h);
        }
    }

    public void a(String blob, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(blob, "blob");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "saveBlob ", this));
        }
        A a10 = this.C;
        int iHashCode = hashCode();
        S0 s02 = new S0(this, str, blob);
        a10.getClass();
        A.a(iHashCode, s02);
    }

    public void a(String jsCallbackNamespace, String callback, InterfaceC2745e2 receiver, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.e0.checkNotNullParameter(receiver, "receiver");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "getBlob ", this));
        }
        A a10 = this.C;
        int iHashCode = hashCode();
        K0 k02 = new K0(this, str, receiver, jsCallbackNamespace, callback);
        a10.getClass();
        A.a(iHashCode, k02);
    }

    @Override // com.inmobi.media.InterfaceC2994sf
    public void a(C2793h primaryAd, boolean z10, short s10) {
        A0 a02;
        kotlin.jvm.internal.e0.checkNotNullParameter(primaryAd, "ad");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).c("U0", F0.a("U0", "TAG", "onVastProcessCompleted ", this));
        }
        C2793h c2793hM = m();
        if (c2793hM == null || X()) {
            c2793hM = null;
        }
        if (c2793hM == null) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            StringBuilder sbA = N6.a("U0", "TAG", "Vast processing completed for ad with impressionId : ");
            sbA.append(c2793hM.s());
            ((G5) f53).c("U0", sbA.toString());
        }
        String strU = c2793hM.u();
        int iHashCode = strU.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && strU.equals("htmlUrl")) {
                    return;
                }
            } else if (strU.equals("html")) {
                return;
            }
        } else if (strU.equals("inmobiJson")) {
            if (this.f32312a == 2 && (a02 = this.f32332u) != null) {
                a02.a(primaryAd);
                D0 d0P = p();
                String clientReqId = a02.k();
                d0P.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(primaryAd, "primaryAd");
                kotlin.jvm.internal.e0.checkNotNullParameter(clientReqId, "clientReqId");
                Set<Rb> setY = primaryAd.y();
                if (setY.isEmpty()) {
                    d0P.f31721a.a(d0P.f31723c, true, (short) 0);
                    return;
                }
                C2843k c2843k = new C2843k(w0.i.c("toString(...)"), setY, d0P.f31727g, null, 16);
                String strF = primaryAd.f();
                if (strF != null) {
                    C3031v1.a(c2843k, strF);
                    return;
                }
                return;
            }
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
                ((G5) f54).b("U0", "Found inconsistent state after vast processing");
                return;
            }
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            StringBuilder sbA2 = N6.a("U0", "TAG", "Can not handle fallback for");
            sbA2.append(c2793hM.u());
            ((G5) f55).b("U0", sbA2.toString());
        }
        throw new IllegalStateException("Can not handle fallback for markup type: " + c2793hM.u());
    }
}
