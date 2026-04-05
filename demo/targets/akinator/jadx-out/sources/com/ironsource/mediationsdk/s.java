package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import com.ironsource.C3;
import com.ironsource.C3147be;
import com.ironsource.C3161ca;
import com.ironsource.C3183de;
import com.ironsource.C3325ld;
import com.ironsource.C3340ma;
import com.ironsource.C3352n2;
import com.ironsource.C3387p2;
import com.ironsource.C3422r4;
import com.ironsource.C3530xa;
import com.ironsource.C5;
import com.ironsource.CallableC3557z3;
import com.ironsource.D3;
import com.ironsource.D5;
import com.ironsource.Dc;
import com.ironsource.Ed;
import com.ironsource.InterfaceC3124a9;
import com.ironsource.InterfaceC3201ee;
import com.ironsource.InterfaceC3367o;
import com.ironsource.InterfaceC3513wa;
import com.ironsource.Mb;
import com.ironsource.P7;
import com.ironsource.R5;
import com.ironsource.R7;
import com.ironsource.S1;
import com.ironsource.Se;
import com.ironsource.Zd;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j1.o2;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class s extends m implements InterfaceC3513wa, InterfaceC3201ee, S1, R7, Dc, InterfaceC3367o {
    private e A;
    private long B;
    private Boolean C;
    private final Object D;
    private R5 E;
    private final long F;
    private final P7.a G;
    private final P7 H;

    /* renamed from: e, reason: collision with root package name */
    private C3530xa f37686e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, C3352n2> f37687f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f37688g;

    /* renamed from: h, reason: collision with root package name */
    private C3352n2 f37689h;

    /* renamed from: i, reason: collision with root package name */
    private h f37690i;

    /* renamed from: j, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f37691j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f37692k;

    /* renamed from: l, reason: collision with root package name */
    private C3183de f37693l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37694m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37695n;

    /* renamed from: o, reason: collision with root package name */
    private long f37696o;

    /* renamed from: p, reason: collision with root package name */
    private String f37697p;

    /* renamed from: q, reason: collision with root package name */
    private int f37698q;

    /* renamed from: r, reason: collision with root package name */
    private NetworkStateReceiver f37699r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37700s;

    /* renamed from: t, reason: collision with root package name */
    private final ConcurrentHashMap<String, t> f37701t;

    /* renamed from: u, reason: collision with root package name */
    private Se f37702u;

    /* renamed from: v, reason: collision with root package name */
    private int f37703v;

    /* renamed from: w, reason: collision with root package name */
    private String f37704w;

    /* renamed from: x, reason: collision with root package name */
    private int f37705x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f37706y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f37707z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f37708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Zd f37709b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37710c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37711d;

        public a(NetworkSettings networkSettings, Zd zd2, String str, String str2) {
            this.f37708a = networkSettings;
            this.f37709b = zd2;
            this.f37710c = str;
            this.f37711d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.a(this.f37708a, this.f37709b, this.f37710c, this.f37711d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            s.this.j();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.d("makeAuction()");
            s.this.f37696o = e2.c();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            s.this.b(map, arrayList, sb2, arrayList2);
            s.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements C3.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f37715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f37716b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37717c;

        public d(Map map, StringBuilder sb2, List list) {
            this.f37715a = map;
            this.f37716b = sb2;
            this.f37717c = list;
        }

        @Override // com.ironsource.C3.b
        public void a(List<D3> list, long j10, List<String> list2) {
            s.this.c(D5.RV_COLLECT_TOKENS_COMPLETED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
            for (D3 d32 : list) {
                t tVar = (t) s.this.f37701t.get(d32.c());
                if (d32.a() != null) {
                    this.f37715a.put(d32.c(), d32.a());
                    StringBuilder sb2 = this.f37716b;
                    sb2.append(d32.d());
                    sb2.append(d32.c());
                    sb2.append(",");
                    if (tVar != null) {
                        tVar.a(D5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(d32.e())}});
                    }
                } else if (tVar != null) {
                    tVar.a(D5.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(d32.e())}, new Object[]{"reason", d32.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) s.this.f37701t.get(it.next());
                if (tVar2 != null) {
                    tVar2.a(D5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
                }
            }
            s.this.a((Map<String, Object>) this.f37715a, (List<String>) this.f37717c, this.f37716b.toString());
        }

        @Override // com.ironsource.C3.b
        public void onFailure(String str) {
            s.this.c(D5.RV_COLLECT_TOKENS_FAILED, C3340ma.a(new Object[][]{new Object[]{"reason", str}}));
            s.this.a((Map<String, Object>) this.f37715a, (List<String>) this.f37717c, this.f37716b.toString());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public s(List<NetworkSettings> list, Zd zd2, String str, String str2, HashSet<InterfaceC3124a9> hashSet, C3161ca c3161ca) throws Throwable {
        super(hashSet, c3161ca);
        this.f37697p = "";
        this.f37700s = false;
        this.f37703v = 1;
        this.D = new Object();
        this.G = Mb.O().x();
        this.H = Mb.U().w();
        long jC = e2.c();
        c(D5.RV_MANAGER_INIT_STARTED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.C = null;
        this.f37705x = zd2.g();
        this.f37706y = zd2.j();
        this.f37704w = "";
        this.f37692k = null;
        C3387p2 c3387p2K = zd2.k();
        this.f37707z = false;
        this.f37686e = new C3530xa(zd2.k().f(), zd2.k().i());
        this.f37687f = new ConcurrentHashMap<>();
        this.f37688g = new ConcurrentHashMap<>();
        this.B = e2.c();
        this.f37694m = c3387p2K.g() > 0;
        this.f37695n = c3387p2K.n();
        if (this.f37694m) {
            this.f37691j = new com.ironsource.mediationsdk.e(IronSource.a.REWARDED_VIDEO, c3387p2K, this);
        }
        this.f37693l = new C3183de(c3387p2K, this);
        ConcurrentHashMap<String, t> concurrentHashMap = new ConcurrentHashMap<>();
        this.f37701t = concurrentHashMap;
        a(list, zd2, str, str2);
        this.f37690i = new h(list, c3387p2K.c());
        Se se2 = new Se();
        this.f37702u = se2;
        se2.a(new ArrayList(concurrentHashMap.values()));
        this.E = new R5(zd2.c(), this);
        this.F = zd2.l();
        c(D5.RV_MANAGER_INIT_ENDED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - jC)}}));
        a(c3387p2K.k());
    }

    private void a(List<NetworkSettings> list, Zd zd2, String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), zd2, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(zd2.f(), zd2.o(), arrayList);
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void b(t tVar) {
        a(tVar, "onRewardedVideoAdStarted");
        Ed.a().c();
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void c(t tVar) {
        a(tVar, "onRewardedVideoAdClosed, mediation state: " + this.A.name());
        Ed.a().b(this.f37686e.a(tVar.u()));
        this.f37707z = false;
        boolean z10 = this.A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            Iterator<t> it = this.f37686e.c().iterator();
            while (it.hasNext()) {
                t next = it.next();
                if (next.y()) {
                    sb2.append(next.c() + ";");
                }
            }
        }
        D5 d52 = D5.RV_INSTANCE_CLOSED;
        StringBuilder sb3 = new StringBuilder("otherRVAvailable = ");
        sb3.append(sb2.length() > 0 ? o2.m("true|", sb2) : "false");
        tVar.b(d52, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}});
        if (tVar.equals(this.f37686e.f())) {
            this.f37686e.a((t) null);
            if (this.A != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void e(t tVar) {
        a(tVar, "onRewardedVideoAdEnded");
        Ed.a().b();
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void f(t tVar) {
        this.f37686e.a(tVar);
        this.f37703v++;
        a(tVar, "onRewardedVideoAdOpened");
        if (this.f37694m) {
            C3352n2 c3352n2 = this.f37687f.get(tVar.c());
            if (c3352n2 != null) {
                C3530xa c3530xa = this.f37686e;
                c3530xa.a(c3530xa.d(), c3352n2.a(this.f37704w), c3352n2.d());
                this.f37691j.a(c3352n2, tVar.g(), this.f37689h, this.f37704w);
                this.f37688g.put(tVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(c3352n2, this.f37704w);
            } else {
                String strC = tVar.c();
                c(a.b.l("onRewardedVideoAdOpened showing instance ", strC, " missing from waterfall"));
                a(D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        Ed.a().c(this.f37686e.a(tVar.u()));
        b(false);
        this.f37693l.c();
    }

    private List<C3352n2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (t tVar : this.f37701t.values()) {
            if (!tVar.p() && !this.f37702u.b(tVar) && this.f37686e.b(tVar)) {
                copyOnWriteArrayList.add(new C3352n2(tVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f37707z) {
            b(false);
        }
        this.f37693l.a();
    }

    private void i() throws Throwable {
        if (this.f37686e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f37686e.c().size() && i10 < this.f37705x; i11++) {
            t tVar = this.f37686e.c().get(i11);
            if (tVar.h()) {
                if (this.f37706y && tVar.p()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + tVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.i(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + tVar.c() + ". No other instances will be loaded at the same time.";
                    d(str2);
                    IronSourceUtils.i(str2);
                    g(tVar);
                    return;
                }
                g(tVar);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.D) {
            try {
                e eVar = this.A;
                e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
                if (eVar != eVar2) {
                    a(eVar2);
                    AsyncTask.execute(new c());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.f37692k);
    }

    @Override // com.ironsource.R7
    public boolean d() {
        if ((!this.f37700s || IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) && this.A == e.RV_STATE_READY_TO_SHOW && !this.f37707z) {
            Iterator<t> it = this.f37686e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void b(t tVar, C3325ld c3325ld) {
        a(tVar, "onRewardedVideoAdClicked");
        Ed.a().a(c3325ld, this.f37686e.a(tVar.u()));
    }

    @Override // com.ironsource.InterfaceC3201ee
    public void b() throws Throwable {
        d("onLoadTriggered: RV load was triggered in " + this.A + " state");
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, Zd zd2, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            t tVar = new t(str, str2, networkSettings, this, zd2.h(), abstractAdapterA, this.f37703v);
            this.f37701t.put(tVar.c(), tVar);
        }
        ironLog.verbose("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3557z3> list2) {
        for (t tVar : this.f37701t.values()) {
            if (!this.f37702u.b(tVar) && this.f37686e.b(tVar)) {
                if (tVar.p()) {
                    list2.add(new CallableC3557z3(tVar.g(), tVar.c(), null, tVar, null, null));
                } else {
                    list.add(tVar.c());
                    sb2.append(tVar.g() + tVar.c() + ",");
                }
            }
        }
    }

    private void g(t tVar) throws Throwable {
        String strK = this.f37687f.get(tVar.c()).k();
        JSONObject jSONObjectA = this.f37687f.get(tVar.c()).a();
        tVar.c(strK);
        tVar.a(strK, jSONObjectA);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005a A[SYNTHETIC] */
    @Override // com.ironsource.InterfaceC3513wa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.ironsource.mediationsdk.t r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.s.d(com.ironsource.mediationsdk.t):void");
    }

    private void b(boolean z10) {
        a(z10, (Map<String, Object>) null);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    private void b(D5 d52) {
        a(d52, (Map<String, Object>) null, false, false);
    }

    private void b(D5 d52, Map<String, Object> map) {
        a(d52, map, true, true);
    }

    @Override // com.ironsource.R7
    public void a(Activity activity, C3325ld c3325ld) {
        synchronized (this.D) {
            try {
                if (c3325ld == null) {
                    a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement");
                    Ed edA = Ed.a();
                    C3530xa c3530xa = this.f37686e;
                    edA.a(ironSourceError, c3530xa.a(c3530xa.d()));
                    a(D5.RV_CALLBACK_SHOW_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT)}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                    return;
                }
                this.f37704w = c3325ld.c();
                b("showRewardedVideo(" + c3325ld + ")");
                t tVar = null;
                b(D5.RV_API_SHOW_CALLED, activity != null ? C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                if (this.f37707z) {
                    a("showRewardedVideo error: can't show ad while an ad is already showing");
                    IronSourceError ironSourceError2 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing");
                    Ed edA2 = Ed.a();
                    C3530xa c3530xa2 = this.f37686e;
                    edA2.a(ironSourceError2, c3530xa2.a(c3530xa2.d()));
                    b(D5.RV_CALLBACK_SHOW_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    return;
                }
                if (this.A != e.RV_STATE_READY_TO_SHOW) {
                    a("showRewardedVideo error: show called while no ads are available");
                    IronSourceError ironSourceError3 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available");
                    Ed edA3 = Ed.a();
                    C3530xa c3530xa3 = this.f37686e;
                    edA3.a(ironSourceError3, c3530xa3.a(c3530xa3.d()));
                    b(D5.RV_CALLBACK_SHOW_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    return;
                }
                if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c3325ld, IronSource.a.REWARDED_VIDEO)) {
                    String str = "showRewardedVideo error: placement " + this.f37704w + " is capped";
                    a(str);
                    IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                    Ed edA4 = Ed.a();
                    C3530xa c3530xa4 = this.f37686e;
                    edA4.a(ironSourceError4, c3530xa4.a(c3530xa4.d()));
                    b(D5.RV_CALLBACK_SHOW_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<t> it = this.f37686e.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t next = it.next();
                    if (next.A()) {
                        this.f37707z = true;
                        next.b(true);
                        a(e.RV_STATE_NOT_LOADED);
                        tVar = next;
                        break;
                    }
                    if (next.e() != null) {
                        stringBuffer.append(next.c() + ":" + next.e() + ",");
                    }
                    next.b(false);
                }
                if (tVar == null) {
                    d("showRewardedVideo(): No ads to show");
                    Ed edA5 = Ed.a();
                    IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    C3530xa c3530xa5 = this.f37686e;
                    edA5.a(ironSourceErrorBuildNoAdsToShowError, c3530xa5.a(c3530xa5.d()));
                    HashMap map = new HashMap();
                    map.put(IronSourceConstants.EVENTS_ERROR_CODE, 509);
                    map.put("reason", "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    b(D5.RV_CALLBACK_SHOW_FAILED, map);
                    this.f37693l.b();
                    return;
                }
                c(tVar, c3325ld);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void c(t tVar, C3325ld c3325ld) {
        d("showVideo()");
        this.f37702u.a(tVar);
        if (this.f37702u.b(tVar)) {
            tVar.B();
            IronSourceUtils.i(tVar.c() + " rewarded video is now session capped");
        }
        P7.a aVar = this.G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String strC = c3325ld.c();
        IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
        aVar.a(applicationContext, strC, aVar2);
        if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c3325ld, aVar2)) {
            a(D5.RV_CAP_PLACEMENT);
        }
        this.E.a();
        tVar.a(c3325ld);
    }

    private boolean c(D5 d52) {
        return d52 == D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || d52 == D5.RV_AUCTION_SUCCESS || d52 == D5.RV_AUCTION_FAILED || d52 == D5.RV_AD_UNIT_CAPPED;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(D5 d52, Map<String, Object> map) {
        a(d52, map, false, false);
    }

    private boolean c(boolean z10) {
        Boolean bool = this.C;
        if (bool == null) {
            return false;
        }
        if (z10 && !bool.booleanValue() && d()) {
            return true;
        }
        return !z10 && this.C.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void a(t tVar) {
        String str = GalEuEfxjome.NKcw;
        synchronized (this.D) {
            try {
                a(tVar, "onLoadSuccess mState=" + this.A);
                if (tVar.u() == this.f37686e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                    this.f37688g.put(tVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                    e eVar = this.A;
                    e eVar2 = e.RV_STATE_LOADING_SMASHES;
                    if (eVar == eVar2) {
                        a(e.RV_STATE_READY_TO_SHOW);
                        a(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f37696o)}}));
                        this.E.a(0L);
                        if (this.f37694m) {
                            C3352n2 c3352n2 = this.f37687f.get(tVar.c());
                            if (c3352n2 != null) {
                                C3530xa c3530xa = this.f37686e;
                                c3530xa.a(c3530xa.d(), c3352n2.a(""), c3352n2.d());
                                this.f37691j.a(c3352n2, tVar.g(), this.f37689h);
                                this.f37691j.a(this.f37686e.c(), this.f37687f, tVar.g(), this.f37689h, c3352n2);
                            } else {
                                String strC = tVar.c();
                                c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + tVar.u() + " and the current id is " + this.f37686e.d());
                                D5 d52 = D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR;
                                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                                StringBuilder sb2 = new StringBuilder(str);
                                sb2.append(eVar2);
                                a(d52, C3340ma.a(new Object[][]{objArr, new Object[]{"reason", sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                            }
                        }
                        b(true);
                    }
                    return;
                }
                d("onLoadSuccess was invoked with auctionId: " + tVar.u() + " and the current id is " + this.f37686e.d());
                tVar.a(D5.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "onLoadSuccess wrong auction ID " + this.A}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void a(IronSourceError ironSourceError, t tVar) {
        C3352n2 c3352n2;
        if (this.f37694m && (c3352n2 = this.f37687f.get(tVar.c())) != null) {
            C3530xa c3530xa = this.f37686e;
            c3530xa.a(c3530xa.d(), c3352n2.a(this.f37704w), c3352n2.d());
        }
        a(tVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f37707z = false;
        b(D5.RV_CALLBACK_SHOW_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        Ed.a().a(ironSourceError, this.f37686e.a(tVar.u()));
        this.f37688g.put(tVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.A != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f37693l.b();
    }

    @Override // com.ironsource.InterfaceC3513wa
    public void a(t tVar, C3325ld c3325ld) {
        a(tVar, "onRewardedVideoAdRewarded");
        Ed.a().b(c3325ld, this.f37686e.a(tVar.u()));
    }

    @Override // com.ironsource.S1
    public void a(List<C3352n2> list, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) throws Throwable {
        d("makeAuction(): success");
        this.f37689h = c3352n2;
        this.f37698q = i10;
        this.f37692k = jSONObject;
        this.f37697p = "";
        if (!TextUtils.isEmpty(str2)) {
            a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        a(jSONObject2, aVar);
        if (this.f37588b.a(aVar)) {
            a(D5.RV_AD_UNIT_CAPPED, C3340ma.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.f37692k);
            a(D5.RV_AUCTION_SUCCESS, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
            i();
        }
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) throws Throwable {
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        d(str3);
        IronSourceUtils.i("RV: " + str3);
        this.f37698q = i11;
        this.f37697p = str2;
        this.f37692k = null;
        if (this.f37695n) {
            d("Moving to fallback waterfall");
            k();
        }
        if (TextUtils.isEmpty(str)) {
            a(D5.RV_AUCTION_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
        } else {
            a(D5.RV_AUCTION_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
        }
        i();
    }

    private void a(long j10) throws Throwable {
        if (this.f37702u.a()) {
            d("all smashes are capped");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.a.REWARDED_VIDEO);
        if (this.f37694m) {
            if (!this.f37688g.isEmpty()) {
                this.f37690i.a(this.f37688g);
                this.f37688g.clear();
            }
            new Timer().schedule(new b(), j10);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (this.f37686e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        } else {
            b(D5.RV_BUSINESS_MEDIATION_LOAD);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3557z3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        C3 c32 = new C3();
        d dVar = new d(map, sb2, list);
        b(D5.RV_COLLECT_TOKENS);
        c32.a(list2, dVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(D5.RV_AUCTION_FAILED, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
        } else {
            d(a.b.k("makeAuction() - request waterfall is: ", str));
            b(D5.RV_BUSINESS_MEDIATION_LOAD);
            b(D5.RV_AUCTION_REQUEST);
            c(D5.RV_AUCTION_REQUEST_WATERFALL, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
            this.f37691j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f37690i, this.f37703v, this.f37589c);
        }
    }

    private void a(List<C3352n2> list, String str, JSONObject jSONObject) {
        this.f37687f.clear();
        this.f37688g.clear();
        CopyOnWriteArrayList<t> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        for (C3352n2 c3352n2 : list) {
            sb2.append(a(c3352n2) + ",");
            t tVar = this.f37701t.get(c3352n2.c());
            if (tVar != null) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(tVar.f37239b.h());
                if (abstractAdapterA != null) {
                    t tVar2 = new t(tVar, this, abstractAdapterA, this.f37703v, str, jSONObject, this.f37698q, this.f37697p);
                    tVar2.a(true);
                    copyOnWriteArrayList.add(tVar2);
                    this.f37687f.put(tVar2.c(), c3352n2);
                    this.f37688g.put(c3352n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + c3352n2.c());
            }
        }
        this.f37686e.a(copyOnWriteArrayList, str);
        if (this.f37686e.a()) {
            a(D5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C3340ma.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f37686e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(D5.RV_AUCTION_RESPONSE_WATERFALL, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    private String a(C3352n2 c3352n2) {
        String string;
        t tVar = this.f37701t.get(c3352n2.c());
        if (tVar != null) {
            string = Integer.toString(tVar.g());
        } else {
            string = TextUtils.isEmpty(c3352n2.k()) ? "1" : "2";
        }
        StringBuilder sbU = p0.o2.u(string);
        sbU.append(c3352n2.c());
        return sbU.toString();
    }

    private void a(e eVar) {
        d("current state=" + this.A + ", new state=" + eVar);
        this.A = eVar;
    }

    private void a(boolean z10, Map<String, Object> map) {
        D5 d52;
        synchronized (this.D) {
            try {
                Boolean bool = this.C;
                if (bool == null || bool.booleanValue() != z10) {
                    this.C = Boolean.valueOf(z10);
                    long time = new Date().getTime() - this.B;
                    this.B = new Date().getTime();
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                    if (z10) {
                        d52 = D5.f34029i0;
                    } else {
                        d52 = D5.RV_CALLBACK_AVAILABILITY_FALSE;
                    }
                    a(d52, map);
                    Ed edA = Ed.a();
                    C3530xa c3530xa = this.f37686e;
                    edA.a(z10, c3530xa.a(c3530xa.d()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(t tVar, String str) {
        String str2 = tVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(D5 d52, Map<String, Object> map) {
        a(d52, map, false, true);
    }

    private void a(D5 d52) {
        a(d52, (Map<String, Object>) null, true, true);
    }

    private void a(D5 d52, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap mapS = e2.s(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapS.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11 && !TextUtils.isEmpty(this.f37686e.d())) {
            mapS.put("auctionId", this.f37686e.d());
        }
        JSONObject jSONObject = this.f37692k;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapS.put("genericParams", this.f37692k);
        }
        if (z10 && !TextUtils.isEmpty(this.f37704w)) {
            mapS.put("placement", this.f37704w);
        }
        if (c(d52)) {
            C3147be.i().a(mapS, this.f37698q, this.f37697p);
        }
        mapS.put("sessionDepth", Integer.valueOf(this.f37703v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    mapS.putAll(map);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        C3147be.i().a(new C5(d52, new JSONObject(mapS)));
    }

    @Override // com.ironsource.InterfaceC3367o
    public void a() throws Throwable {
        a(e.RV_STATE_NOT_LOADED);
        a(false, C3340ma.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.Dc
    public void a(boolean z10) {
        if (this.f37700s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            if (c(z10)) {
                b(z10);
            }
        }
    }

    @Override // com.ironsource.R7
    public void a(Context context, boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f37700s = z10;
            if (z10) {
                if (this.f37699r == null) {
                    this.f37699r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f37699r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f37699r != null) {
                context.getApplicationContext().unregisterReceiver(this.f37699r);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }
}
