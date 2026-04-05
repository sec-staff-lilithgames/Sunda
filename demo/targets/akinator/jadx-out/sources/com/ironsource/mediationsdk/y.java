package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import b0.e2;
import com.ironsource.C3;
import com.ironsource.C3161ca;
import com.ironsource.C3262i3;
import com.ironsource.C3317l5;
import com.ironsource.C3352n2;
import com.ironsource.C3422r4;
import com.ironsource.C3471u2;
import com.ironsource.C3531xb;
import com.ironsource.C5;
import com.ironsource.CallableC3557z3;
import com.ironsource.D3;
import com.ironsource.D5;
import com.ironsource.E3;
import com.ironsource.H9;
import com.ironsource.InterfaceC3124a9;
import com.ironsource.InterfaceC3516wd;
import com.ironsource.K7;
import com.ironsource.L7;
import com.ironsource.Mb;
import com.ironsource.P7;
import com.ironsource.P8;
import com.ironsource.S1;
import com.ironsource.Wf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.moloco.sdk.BKC.KerkSviMAy;
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
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class y extends m implements InterfaceC3516wd, S1 {
    private ConcurrentHashMap<String, h.a> A;
    private long B;
    private final Object C;
    private C3317l5 D;
    private boolean E;
    private final long F;
    private final Runnable G;

    /* renamed from: e, reason: collision with root package name */
    private final P8 f37833e;

    /* renamed from: f, reason: collision with root package name */
    private final P8.a f37834f;

    /* renamed from: g, reason: collision with root package name */
    private final P7 f37835g;

    /* renamed from: h, reason: collision with root package name */
    private final P7.a f37836h;

    /* renamed from: i, reason: collision with root package name */
    private k f37837i;

    /* renamed from: j, reason: collision with root package name */
    private i f37838j;

    /* renamed from: k, reason: collision with root package name */
    private C3531xb f37839k;

    /* renamed from: l, reason: collision with root package name */
    private q f37840l;

    /* renamed from: m, reason: collision with root package name */
    private C3262i3 f37841m;

    /* renamed from: n, reason: collision with root package name */
    private int f37842n;

    /* renamed from: o, reason: collision with root package name */
    private z f37843o;

    /* renamed from: p, reason: collision with root package name */
    private int f37844p;

    /* renamed from: q, reason: collision with root package name */
    private final ConcurrentHashMap<String, z> f37845q;

    /* renamed from: r, reason: collision with root package name */
    private CopyOnWriteArrayList<z> f37846r;

    /* renamed from: s, reason: collision with root package name */
    private String f37847s;

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f37848t;

    /* renamed from: u, reason: collision with root package name */
    private String f37849u;

    /* renamed from: v, reason: collision with root package name */
    private int f37850v;

    /* renamed from: w, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f37851w;

    /* renamed from: x, reason: collision with root package name */
    private C3352n2 f37852x;

    /* renamed from: y, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f37853y;

    /* renamed from: z, reason: collision with root package name */
    private ConcurrentHashMap<String, C3352n2> f37854z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                y yVar = y.this;
                if (yVar.f37840l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    y.this.a(D5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (yVar.o()) {
                        y.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    y.this.a(D5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 613}});
                    y.this.f37839k.a(TimeUnit.SECONDS.toMillis(r0.f37837i.f()));
                }
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                y.this.a(D5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th2.getMessage()}});
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            y.this.w();
            if (y.this.y()) {
                return;
            }
            y.this.a(D5.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            y.this.b(map, arrayList, sb2, arrayList2);
            y.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements C3.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f37862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f37863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37864c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f37862a = map;
            this.f37863b = sb2;
            this.f37864c = list;
        }

        @Override // com.ironsource.C3.b
        public void a(List<D3> list, long j10, List<String> list2) throws JSONException {
            y.this.a(D5.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            for (D3 d32 : list) {
                if (d32.a() != null) {
                    this.f37862a.put(d32.c(), d32.a());
                    StringBuilder sb2 = this.f37863b;
                    sb2.append(d32.d());
                    sb2.append(d32.c());
                    sb2.append(",");
                    ((z) y.this.f37845q.get(d32.c())).a(D5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(d32.e())}});
                } else {
                    ((z) y.this.f37845q.get(d32.c())).a(D5.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(d32.e())}, new Object[]{"reason", d32.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((z) y.this.f37845q.get(it.next())).a(D5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            }
            y.this.a((Map<String, Object>) this.f37862a, (List<String>) this.f37864c, this.f37863b);
        }

        @Override // com.ironsource.C3.b
        public void onFailure(String str) throws JSONException {
            y.this.a(D5.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, str}});
            y.this.a((Map<String, Object>) this.f37862a, (List<String>) this.f37864c, this.f37863b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f37866a;

        public f(NetworkSettings networkSettings) {
            this.f37866a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.a(this.f37866a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements E3 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f37868a;

        public g(z zVar) {
            this.f37868a = zVar;
        }

        @Override // com.ironsource.E3
        public void a() {
            this.f37868a.D();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            y.this.u();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public y(List<NetworkSettings> list, k kVar, HashSet<InterfaceC3124a9> hashSet, C3161ca c3161ca) {
        this(Mb.U(), Mb.O(), list, kVar, hashSet, c3161ca);
    }

    private boolean a(i iVar, i iVar2) {
        boolean z10;
        synchronized (this.C) {
            try {
                if (this.f37838j == iVar) {
                    IronLog.INTERNAL.verbose("set state from '" + this.f37838j + "' to '" + iVar2 + "'");
                    this.f37838j = iVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f37838j);
        if (!a(i.STARTED_LOADING, this.f37837i.j() ? z10 ? i.AUCTION : i.FIRST_AUCTION : z10 ? i.RELOADING : i.LOADING)) {
            ironLog.error("wrong state - " + this.f37838j);
            return;
        }
        this.D = new C3317l5();
        this.f37847s = "";
        this.f37848t = null;
        this.f37842n = 0;
        this.f37844p = this.f37833e.a(IronSource.a.BANNER);
        if (z10) {
            a(D5.BN_RELOAD);
        } else {
            a(D5.BN_LOAD);
        }
        if (this.f37837i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    private void f(z zVar) {
        String strK;
        q qVar = this.f37840l;
        if (qVar == null || qVar.b()) {
            return;
        }
        q qVarC = null;
        if (zVar.p()) {
            strK = this.f37854z.get(zVar.c()).k();
            zVar.c(strK);
        } else {
            strK = null;
        }
        JSONObject jSONObjectA = this.f37854z.get(zVar.c()).a();
        try {
            qVarC = this.f37840l.c();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e10.getMessage());
        }
        zVar.a(qVarC, this.f37841m, strK, jSONObjectA);
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void c(z zVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3471u2.a().f(this.f37590d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_PRESENT_SCREEN, objArr, zVar.n());
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void e(z zVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3471u2.a().e(this.f37590d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_DISMISS_SCREEN, objArr, zVar.n());
    }

    private boolean g() {
        q qVar = this.f37840l;
        return (qVar == null || qVar.b()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f37843o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.f37843o.f());
            this.f37843o.t();
            this.f37843o = null;
        }
    }

    private List<C3352n2> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (z zVar : this.f37845q.values()) {
            if (!zVar.p() && !this.f37835g.c(ContextProvider.getInstance().getApplicationContext(), this.f37841m, IronSource.a.BANNER)) {
                copyOnWriteArrayList.add(new C3352n2(zVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        q qVar = this.f37840l;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        return this.f37840l.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f37245f : ISBannerSize.BANNER : this.f37840l.getSize();
    }

    private ISBannerSize k() {
        q qVar = this.f37840l;
        if (qVar != null) {
            return qVar.getSize();
        }
        return null;
    }

    private String l() {
        C3262i3 c3262i3 = this.f37841m;
        return c3262i3 != null ? c3262i3.c() : "";
    }

    private void m() throws JSONException {
        String str = this.f37846r.isEmpty() ? KerkSviMAy.rQg : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = ".concat(str));
        g((z) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(D5.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
            this.f37839k.a(TimeUnit.SECONDS.toMillis(this.f37837i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.f37838j);
        }
    }

    private void n() throws JSONException {
        String strL = l();
        P7.a aVar = this.f37836h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.a aVar2 = IronSource.a.BANNER;
        aVar.a(applicationContext, strL, aVar2);
        if (this.f37835g.c(ContextProvider.getInstance().getApplicationContext(), this.f37841m, aVar2)) {
            a(D5.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.f37838j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z10;
        synchronized (this.C) {
            z10 = this.f37838j == i.LOADED;
        }
        return z10;
    }

    private boolean r() {
        boolean z10;
        synchronized (this.C) {
            try {
                i iVar = this.f37838j;
                z10 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
            } finally {
            }
        }
        return z10;
    }

    private boolean s() {
        boolean z10;
        synchronized (this.C) {
            try {
                i iVar = this.f37838j;
                z10 = iVar == i.LOADING || iVar == i.RELOADING;
            } finally {
            }
        }
        return z10;
    }

    private void t() throws JSONException {
        try {
            for (int i10 = this.f37842n; i10 < this.f37846r.size(); i10++) {
                z zVar = this.f37846r.get(i10);
                if (zVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + zVar.f());
                    this.f37842n = i10 + 1;
                    f(zVar);
                    return;
                }
            }
            m();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            a(D5.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f37838j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.f37853y.a(this.A);
        this.A.clear();
    }

    private void x() {
        List<C3352n2> listI = i();
        this.f37847s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.B, this.f37837i.h());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new h(), jA);
        return true;
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void d(z zVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3471u2.a().b(this.f37590d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_CLICK, objArr, zVar.n());
    }

    public boolean o() {
        if (!this.f37840l.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.f37840l.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.f37840l.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void g(z zVar) {
        Iterator<z> it = this.f37846r.iterator();
        while (it.hasNext()) {
            z next = it.next();
            if (!next.equals(zVar)) {
                next.q();
            }
        }
    }

    public y(L7 l72, K7 k72, List<NetworkSettings> list, k kVar, HashSet<InterfaceC3124a9> hashSet, C3161ca c3161ca) throws JSONException, InterruptedException {
        super(hashSet, c3161ca);
        this.f37838j = i.NONE;
        this.f37849u = "";
        this.C = new Object();
        this.E = false;
        c cVar = new c();
        this.G = cVar;
        P8 p8S = l72.s();
        this.f37833e = p8S;
        this.f37834f = k72.h();
        this.f37835g = l72.w();
        this.f37836h = k72.x();
        long jC = e2.c();
        a(D5.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.f37837i = kVar;
        this.f37845q = new ConcurrentHashMap<>();
        this.f37846r = new CopyOnWriteArrayList<>();
        this.f37854z = new ConcurrentHashMap<>();
        this.A = new ConcurrentHashMap<>();
        IronSource.a aVar = IronSource.a.BANNER;
        this.f37844p = p8S.a(aVar);
        n.a().a(aVar, this.f37837i.d());
        if (this.f37837i.j()) {
            this.f37851w = new com.ironsource.mediationsdk.e(aVar, this.f37837i.b(), this);
        }
        this.f37853y = new com.ironsource.mediationsdk.h(list, this.f37837i.b().c());
        a(list, kVar);
        this.B = e2.c();
        a(i.READY_TO_LOAD);
        this.F = kVar.g();
        this.f37839k = new C3531xb(cVar, com.ironsource.lifecycle.b.d(), new Wf());
        a(D5.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - jC)}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.f37838j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.f37838j = iVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f37858a;

        public b(q qVar) {
            this.f37858a = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() throws JSONException {
            IronLog.INTERNAL.verbose("destroying banner");
            y.this.f37839k.b();
            y yVar = y.this;
            z zVar = yVar.f37843o;
            y.this.a(D5.BN_DESTROY, (Object[][]) null, zVar != null ? zVar.n() : yVar.f37844p);
            y.this.h();
            this.f37858a.a();
            y yVar2 = y.this;
            yVar2.f37840l = null;
            yVar2.f37841m = null;
            yVar2.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    public void a(q qVar, C3262i3 c3262i3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.a aVar = IronSource.a.BANNER;
        a(aVar);
        f();
        if (a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            if (!n.a().b(aVar)) {
                l.a(qVar, c3262i3, new a(c3262i3, qVar));
                return;
            } else {
                ironLog.verbose("can't load banner - already has pending invocation");
                return;
            }
        }
        IronLog.API.error("can't load banner - loadBanner already called and still in progress");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements l.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3262i3 f37855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f37856b;

        public a(C3262i3 c3262i3, q qVar) {
            this.f37855a = c3262i3;
            this.f37856b = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() throws JSONException {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f37855a.c());
            l.b(this.f37856b);
            y yVar = y.this;
            yVar.f37840l = this.f37856b;
            yVar.f37841m = this.f37855a;
            P7 p72 = yVar.f37835g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C3262i3 c3262i3 = this.f37855a;
            IronSource.a aVar = IronSource.a.BANNER;
            if (!p72.c(applicationContext, c3262i3, aVar)) {
                y.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(aVar, new IronSourceError(604, "placement " + this.f37855a.c() + " is capped"));
            y.this.a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
            y.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void b(z zVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C3471u2.a().c(this.f37590d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_LEAVE_APP, objArr, zVar.n());
    }

    public void a(q qVar) {
        IronLog.INTERNAL.verbose();
        l.a(qVar, new b(qVar));
    }

    @Override // com.ironsource.S1
    public void a(List<C3352n2> list, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) throws JSONException {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        com.google.android.gms.internal.play_billing.a.u("auctionId = ", str, ironLog);
        if (r()) {
            this.f37849u = "";
            this.f37847s = str;
            this.f37850v = i10;
            this.f37852x = c3352n2;
            this.f37848t = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}});
            }
            IronSource.a aVar = IronSource.a.BANNER;
            a(jSONObject2, aVar);
            if (this.f37588b.a(aVar)) {
                a(D5.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
                i iVar2 = this.f37838j;
                a(i.READY_TO_LOAD);
                if (iVar2 == i.FIRST_AUCTION) {
                    n.a().b(aVar, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
                    return;
                }
                return;
            }
            a(D5.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            if (this.f37838j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            a(D5.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f37838j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3557z3> list2) {
        if (this.f37835g.c(ContextProvider.getInstance().getApplicationContext(), this.f37841m, IronSource.a.BANNER)) {
            return;
        }
        for (z zVar : this.f37845q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(zVar.f37241d, IronSource.a.BANNER, null, this.f37840l);
            if (zVar.p()) {
                list2.add(new CallableC3557z3(zVar.g(), zVar.c(), adDataCreateAdDataForNetworkAdapter, zVar, null, null));
            } else if (!zVar.p()) {
                list.add(zVar.c());
                sb2.append(zVar.g() + zVar.c() + ",");
            }
        }
    }

    private void b(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f37840l != null) {
            zVar.E();
            l.a(this.f37840l, view, layoutParams, new g(zVar));
        }
    }

    private String b(C3352n2 c3352n2) {
        z zVar = this.f37845q.get(c3352n2.c());
        String str = "1";
        if (zVar == null ? !TextUtils.isEmpty(c3352n2.k()) : zVar.p()) {
            str = "2";
        }
        StringBuilder sbU = o2.u(str);
        sbU.append(c3352n2.c());
        return sbU.toString();
    }

    private boolean b(D5 d52) {
        return d52 == D5.BN_CALLBACK_RELOAD_ERROR || d52 == D5.BN_CALLBACK_LOAD_SUCCESS || d52 == D5.BN_CALLBACK_LOAD_ERROR || d52 == D5.BN_CALLBACK_RELOAD_SUCCESS || d52 == D5.BN_CALLBACK_SHOW || d52 == D5.BN_CALLBACK_CLICK || d52 == D5.BN_CALLBACK_LEAVE_APP || d52 == D5.BN_AUCTION_FAILED || d52 == D5.BN_AUCTION_SUCCESS || d52 == D5.BN_AD_UNIT_CAPPED;
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) throws JSONException {
        i iVar;
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.i("BN: " + str3);
        if (r()) {
            this.f37849u = str2;
            this.f37850v = i11;
            this.f37848t = null;
            if (this.f37837i.b().n()) {
                ironLog.verbose("Moving to fallback waterfall");
                x();
            }
            a(D5.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}});
            if (this.f37838j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f37838j);
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void a(z zVar, View view, FrameLayout.LayoutParams layoutParams) throws JSONException {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + zVar.f());
        if (zVar.x() != this.f37847s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f37847s);
            zVar.a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "Wrong auction id " + zVar.x() + " State - " + this.f37838j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (s()) {
            z zVar2 = this.f37843o;
            if (zVar2 != null) {
                zVar2.q();
            }
            g(zVar);
            this.f37843o = zVar;
            b(zVar, view, layoutParams);
            this.A.put(zVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f37837i.j()) {
                C3352n2 c3352n2 = this.f37854z.get(zVar.c());
                if (c3352n2 != null) {
                    a(c3352n2.a(l()), c3352n2.d());
                    this.f37851w.a(c3352n2, zVar.g(), this.f37852x);
                    this.f37851w.a(this.f37846r, this.f37854z, zVar.g(), this.f37852x, c3352n2);
                    if (!this.f37837i.b().r()) {
                        a(zVar, c3352n2);
                    }
                } else {
                    String strC = zVar.c();
                    StringBuilder sbO = e3.g.o("onLoadSuccess winner instance ", strC, " missing from waterfall. auctionId = ");
                    sbO.append(this.f37847s);
                    ironLog.error(sbO.toString());
                    a(D5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
                }
            }
            if (this.f37838j == i.LOADING) {
                if (g()) {
                    C3471u2.a().d(this.f37590d);
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.D))}};
                } else {
                    objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.D))}};
                }
                a(D5.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (g()) {
                    C3471u2.a().d(this.f37590d);
                }
                IronSourceUtils.i("bannerReloadSucceeded");
                a(D5.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.D))}});
            }
            n();
            this.f37834f.b(IronSource.a.BANNER);
            a(i.LOADED);
            this.f37839k.a(TimeUnit.SECONDS.toMillis(this.f37837i.f()));
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f37838j);
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void a(IronSourceError ironSourceError, z zVar, boolean z10) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (zVar.x() != this.f37847s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f37847s);
            zVar.a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{"reason", "Wrong auction " + zVar.x() + " State - " + this.f37838j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (s()) {
            this.A.put(zVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
            t();
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f37838j);
        }
    }

    @Override // com.ironsource.InterfaceC3516wd
    public void a(z zVar) throws JSONException {
        C3352n2 c3352n2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(zVar.f());
        if (q()) {
            if (this.f37837i.j() && this.f37837i.b().r() && (c3352n2 = this.f37854z.get(zVar.c())) != null) {
                a(zVar, c3352n2);
            }
            a(D5.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f37838j);
        String strC = zVar.c();
        a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f37838j}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
    }

    private void a(z zVar, C3352n2 c3352n2) {
        this.f37851w.a(c3352n2, zVar.g(), this.f37852x, l());
        a(this.f37854z.get(zVar.c()), l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3557z3> list2) throws JSONException {
        if (list2.isEmpty()) {
            a(map, list, sb2);
            return;
        }
        C3 c32 = new C3();
        e eVar = new e(map, sb2, list);
        a(D5.BN_COLLECT_TOKENS);
        c32.a(list2, eVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb2));
        if (map.size() == 0 && list.size() == 0) {
            a(D5.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            if (a(i.AUCTION, i.LOADED)) {
                this.f37839k.a(TimeUnit.SECONDS.toMillis(this.f37837i.f()));
                return;
            }
            n.a().b(IronSource.a.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            a(i.READY_TO_LOAD);
            return;
        }
        a(D5.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        com.ironsource.mediationsdk.e eVar = this.f37851w;
        if (eVar != null) {
            eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f37853y, this.f37844p, this.f37589c, j());
        } else {
            ironLog.error("mAuctionHandler is null");
        }
    }

    private void a(List<NetworkSettings> list, k kVar) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        NetworkSettings networkSettings2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            networkSettings2 = networkSettings;
            z zVar = new z(this.f37837i, this, networkSettings2, abstractAdapterA, this.f37844p, p());
            this.f37845q.put(zVar.c(), zVar);
        } else {
            networkSettings2 = networkSettings;
            ironLog.verbose(networkSettings2.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose("Done initializing provider " + networkSettings2.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
    }

    private String a(List<C3352n2> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f37846r.clear();
        this.f37854z.clear();
        this.A.clear();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3352n2 c3352n2 = list.get(i10);
            a(c3352n2);
            sb2.append(b(c3352n2));
            if (i10 != list.size() - 1) {
                sb2.append(",");
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb2.toString());
        return sb2.toString();
    }

    private void a(C3352n2 c3352n2) {
        z zVar = this.f37845q.get(c3352n2.c());
        if (zVar != null) {
            AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(zVar.f37239b.h());
            if (abstractAdapterA != null) {
                z zVar2 = new z(this.f37837i, this, zVar.f37239b.h(), abstractAdapterA, this.f37844p, this.f37847s, this.f37848t, this.f37850v, this.f37849u, p());
                zVar2.a(true);
                this.f37846r.add(zVar2);
                this.f37854z.put(zVar2.c(), c3352n2);
                this.A.put(c3352n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return;
            }
            return;
        }
        IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c3352n2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d52) throws JSONException {
        a(d52, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d52, Object[][] objArr) throws JSONException {
        a(d52, objArr, this.f37844p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d52, Object[][] objArr, int i10) throws JSONException {
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(jSONObjectA, iSBannerSizeK);
            }
            if (this.f37841m != null) {
                jSONObjectA.put("placement", l());
            }
            jSONObjectA.put("sessionDepth", i10);
            if (!TextUtils.isEmpty(this.f37847s)) {
                jSONObjectA.put("auctionId", this.f37847s);
            }
            JSONObject jSONObject = this.f37848t;
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObjectA.put("genericParams", this.f37848t);
            }
            if (b(d52)) {
                jSONObjectA.put(IronSourceConstants.AUCTION_TRIALS, this.f37850v);
                if (!TextUtils.isEmpty(this.f37849u)) {
                    jSONObjectA.put(IronSourceConstants.AUCTION_FALLBACK, this.f37849u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    jSONObjectA.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
        H9.i().a(new C5(d52, jSONObjectA));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) throws JSONException {
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f37556c)) {
                        jSONObject.put(l.f37561h, 3);
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f37555b)) {
                        jSONObject.put(l.f37561h, 2);
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f37558e)) {
                        jSONObject.put(l.f37561h, 5);
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals(l.f37554a)) {
                        jSONObject.put(l.f37561h, 1);
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals(l.f37559f)) {
                        jSONObject.put(l.f37561h, 6);
                        jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                        break;
                    }
                    break;
            }
            if (iSBannerSize.isAdaptive()) {
                String str = l.f37570q;
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }
}
