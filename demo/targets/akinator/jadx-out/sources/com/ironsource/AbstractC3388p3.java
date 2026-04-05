package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC3438s3;
import com.ironsource.C3;
import com.ironsource.D0;
import com.ironsource.N0;
import com.ironsource.P7;
import com.ironsource.P8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import h2.rl.UeklptUrP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3388p3<Smash extends AbstractC3438s3<?>, Listener extends AdapterAdListener> implements Q0, S1, C0, Gb, Dc, InterfaceC3367o, Eg, A3, InterfaceC3482ud {
    private AdInfo A;
    private C3360na B;
    final P8 C;
    final P8.a D;
    protected final P7 E;
    private final P7.a F;
    private boolean G;
    private Hf H;
    private AtomicBoolean I;
    private T9 J;

    /* renamed from: a, reason: collision with root package name */
    protected Dg<Smash> f38081a;

    /* renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<String, h.a> f38082b;

    /* renamed from: c, reason: collision with root package name */
    protected com.ironsource.mediationsdk.e f38083c;

    /* renamed from: d, reason: collision with root package name */
    protected com.ironsource.mediationsdk.h f38084d;

    /* renamed from: e, reason: collision with root package name */
    protected int f38085e;

    /* renamed from: f, reason: collision with root package name */
    protected String f38086f;

    /* renamed from: g, reason: collision with root package name */
    protected JSONObject f38087g;

    /* renamed from: h, reason: collision with root package name */
    protected C3352n2 f38088h;

    /* renamed from: i, reason: collision with root package name */
    protected C3325ld f38089i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f38090j;

    /* renamed from: k, reason: collision with root package name */
    private NetworkStateReceiver f38091k;

    /* renamed from: l, reason: collision with root package name */
    protected Se f38092l;

    /* renamed from: m, reason: collision with root package name */
    protected C3317l5 f38093m;

    /* renamed from: n, reason: collision with root package name */
    protected C3317l5 f38094n;

    /* renamed from: o, reason: collision with root package name */
    protected U f38095o;

    /* renamed from: p, reason: collision with root package name */
    protected f f38096p;

    /* renamed from: q, reason: collision with root package name */
    protected P0 f38097q;

    /* renamed from: r, reason: collision with root package name */
    protected R5 f38098r;

    /* renamed from: s, reason: collision with root package name */
    protected D0 f38099s;

    /* renamed from: t, reason: collision with root package name */
    protected K0 f38100t;

    /* renamed from: u, reason: collision with root package name */
    protected r f38101u;

    /* renamed from: v, reason: collision with root package name */
    protected C3161ca f38102v;

    /* renamed from: w, reason: collision with root package name */
    protected UUID f38103w;

    /* renamed from: x, reason: collision with root package name */
    protected final Object f38104x;

    /* renamed from: y, reason: collision with root package name */
    private long f38105y;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f38106z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p3$a */
    public class a extends AbstractRunnableC3273ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() throws JSONException {
            AbstractC3388p3.this.B();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p3$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f38108a;

        public b(NetworkSettings networkSettings) {
            this.f38108a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            AbstractC3388p3.this.c(this.f38108a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p3$c */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3388p3.this.D();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            AbstractC3388p3.this.f38087g = new JSONObject();
            AbstractC3388p3.this.f38099s.f33939h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC3388p3.this.b(map, arrayList, sb2, arrayList2);
            AbstractC3388p3.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p3$e */
    public class e implements C3.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f38112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f38113b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f38114c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f38112a = map;
            this.f38113b = sb2;
            this.f38114c = list;
        }

        @Override // com.ironsource.C3.b
        public void a(List<D3> list, long j10, List<String> list2) throws JSONException {
            AbstractC3388p3.this.f38099s.f33938g.a(j10);
            for (D3 d32 : list) {
                NetworkSettings networkSettingsA = AbstractC3388p3.this.f38095o.a(d32.c());
                Map<String, Object> mapB = AbstractC3388p3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC3388p3.this.f38095o.b(), AbstractC3388p3.this.k()));
                if (d32.a() != null) {
                    this.f38112a.put(d32.c(), d32.a());
                    StringBuilder sb2 = this.f38113b;
                    sb2.append(d32.d());
                    sb2.append(d32.c());
                    sb2.append(",");
                    AbstractC3388p3.this.f38099s.f33938g.a(mapB, d32.e());
                } else {
                    AbstractC3388p3.this.f38099s.f33938g.a(mapB, d32.e(), d32.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC3388p3.this.f38095o.a(it.next());
                AbstractC3388p3.this.f38099s.f33938g.b(AbstractC3388p3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC3388p3.this.f38095o.b(), AbstractC3388p3.this.k())), j10);
            }
            AbstractC3388p3.this.a((Map<String, Object>) this.f38112a, (List<String>) this.f38114c, this.f38113b.toString());
        }

        @Override // com.ironsource.C3.b
        public void onFailure(String str) {
            AbstractC3388p3.this.f38099s.f33938g.a(str);
            AbstractC3388p3.this.a((Map<String, Object>) this.f38112a, (List<String>) this.f38114c, this.f38113b.toString());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p3$f */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC3388p3(U u10, C3360na c3360na, C3161ca c3161ca) {
        this(Mb.U(), Mb.O(), u10, c3360na, c3161ca);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() throws JSONException {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.f38104x) {
            try {
                if (this.f38095o.h().e() && this.f38092l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(C3554z0.a(this.f38095o.b()), "all smashes are capped", false);
                    return;
                }
                if (!t() && this.f38096p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(C3554z0.d(this.f38095o.b()), "load cannot be invoked while showing an ad"));
                    return;
                }
                if (this.f38095o.h().a() != N0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f38095o.h().a() != N0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f38096p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.n.a().b(this.f38095o.b()))) {
                    IronLog.API.error(b("load is already in progress"));
                    return;
                }
                this.f38087g = new JSONObject();
                F();
                if (v()) {
                    this.f38099s.f33937f.a();
                } else {
                    this.f38099s.f33937f.a(q());
                }
                this.f38094n = new C3317l5();
                if (this.f38095o.q()) {
                    if (!this.f38082b.isEmpty()) {
                        this.f38084d.a(this.f38082b);
                        this.f38082b.clear();
                    }
                    K();
                } else {
                    a(f.LOADING);
                }
                if (this.f38095o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                L();
                C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void C() {
        Jg<Smash> jgE = E();
        if (jgE.c()) {
            a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = jgE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private Jg<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new Ig(this.f38095o).d(this.f38081a.b());
    }

    private void F() {
        this.f38101u.a(this.f38095o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.f38104x) {
            try {
                f fVar = this.f38096p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.I.set(false);
                long jK = this.f38095o.d().k() - C3317l5.a(this.f38093m);
                if (jK > 0) {
                    new Timer().schedule(new c(), jK);
                } else {
                    D();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void L() throws JSONException {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private List<C3352n2> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f38095o.j()) {
            if (!networkSettings.isBidder(this.f38095o.b()) && d(networkSettings)) {
                Re re2 = new Re(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f38095o.b()));
                if (!this.f38092l.b(re2)) {
                    copyOnWriteArrayList.add(new C3352n2(re2.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() throws InterruptedException {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f38095o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f38095o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f38095o.k(), this.f38095o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f38095o.j()) {
            arrayList.add(new Re(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f38095o.b())));
        }
        Se se2 = new Se();
        this.f38092l = se2;
        se2.a(arrayList);
    }

    public void A() {
        if (e()) {
            a(new a());
        } else {
            B();
        }
    }

    public void G() {
        com.ironsource.mediationsdk.n.a().a(this.f38095o.b(), this.f38095o.f());
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return true;
    }

    public void J() {
        Iterator<NetworkSettings> it = this.f38095o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.f38095o.b(), k());
        }
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str, C3352n2 c3352n2);

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract K0 g();

    public P0 h() {
        return new P0(this.f38095o.h(), this);
    }

    public String i() {
        return b((String) null);
    }

    public UUID k() {
        return this.f38103w;
    }

    public abstract String l();

    public String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String n() {
        C3325ld c3325ld = this.f38089i;
        return c3325ld == null ? "" : c3325ld.c();
    }

    public abstract String o();

    public boolean q() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public abstract boolean v();

    public boolean w() {
        boolean z10;
        synchronized (this.f38104x) {
            try {
                f fVar = this.f38096p;
                z10 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } finally {
            }
        }
        return z10;
    }

    public boolean x() {
        boolean z10;
        synchronized (this.f38104x) {
            z10 = this.f38096p == f.READY_TO_SHOW;
        }
        return z10;
    }

    public boolean y() {
        boolean z10;
        synchronized (this.f38104x) {
            z10 = this.f38096p == f.AUCTION;
        }
        return z10;
    }

    public boolean z() {
        boolean z10;
        synchronized (this.f38104x) {
            z10 = this.f38096p == f.LOADING;
        }
        return z10;
    }

    private boolean c(boolean z10) {
        Boolean bool = this.f38106z;
        if (bool == null) {
            return false;
        }
        if (z10 && !bool.booleanValue() && u()) {
            return true;
        }
        return !z10 && this.f38106z.booleanValue();
    }

    private boolean d(NetworkSettings networkSettings) throws JSONException {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f38095o.b(), k());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f38081a.a(this.f38095o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.f38095o.b());
        }
        return false;
    }

    public void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose(b("track = " + z10));
        try {
            this.f38090j = z10;
            if (z10) {
                if (this.f38091k == null) {
                    this.f38091k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f38091k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f38091k != null) {
                context.getApplicationContext().unregisterReceiver(this.f38091k);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    public void b(boolean z10) {
        a(false, z10, (AbstractC3438s3<?>) null);
    }

    @Override // com.ironsource.Q0
    public void e(AbstractC3438s3<?> abstractC3438s3) {
        IronLog.INTERNAL.verbose(b(abstractC3438s3.k()));
        this.f38099s.f33940i.a(n());
        this.f38100t.a(this.f38089i, abstractC3438s3.f());
    }

    public void g(AbstractC3438s3<?> abstractC3438s3) {
        this.f38100t.d(abstractC3438s3.f());
    }

    public void h(AbstractC3438s3<?> abstractC3438s3) {
        if (this.f38095o.h().f()) {
            a(abstractC3438s3, abstractC3438s3.f());
        } else {
            a(true, false, abstractC3438s3);
        }
    }

    public void i(AbstractC3438s3<?> abstractC3438s3) {
        if (this.f38095o.q() && this.I.compareAndSet(false, true)) {
            C3352n2 c3352n2I = abstractC3438s3.i();
            this.f38083c.a(c3352n2I, abstractC3438s3.l(), this.f38088h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C3352n2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f38081a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f38083c.a(arrayList, concurrentHashMap, abstractC3438s3.l(), this.f38088h, c3352n2I);
        }
    }

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    public AbstractC3388p3(L7 l72, K7 k72, U u10, C3360na c3360na, C3161ca c3161ca) throws InterruptedException {
        this.f38086f = "";
        this.f38090j = false;
        this.f38104x = new Object();
        this.f38105y = 0L;
        this.I = new AtomicBoolean(false);
        this.f38103w = UUID.randomUUID();
        this.C = l72.s();
        this.D = k72.h();
        this.E = l72.w();
        this.F = k72.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + u10.b() + ", loading mode = " + u10.h().a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u10.b());
        sb2.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb2.toString());
        C3317l5 c3317l5 = new C3317l5();
        this.J = a(u10);
        this.f38102v = c3161ca;
        this.f38095o = u10;
        this.f38099s = new D0(u10.b(), D0.b.MEDIATION, this);
        this.f38100t = g();
        this.f38097q = h();
        a(f.NONE);
        this.B = c3360na;
        this.f38081a = new Dg<>(this.f38095o.d().f(), this.f38095o.d().i(), this);
        this.f38099s.f33936e.a(o(), this.f38095o.h().a().toString());
        this.f38082b = new ConcurrentHashMap<>();
        this.f38089i = null;
        G();
        this.f38087g = new JSONObject();
        if (this.f38095o.q()) {
            this.f38083c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f38095o.d(), IronSourceUtils.d()));
        }
        this.f38084d = new com.ironsource.mediationsdk.h(this.f38095o.j(), this.f38095o.d().c());
        s();
        r();
        this.f38093m = new C3317l5();
        a(f.READY_TO_LOAD);
        this.f38098r = new R5(u10.a(), this);
        this.f38101u = new r();
        this.f38099s.f33936e.a(C3317l5.a(c3317l5));
        if (this.f38095o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3557z3> list2) throws JSONException {
        for (NetworkSettings networkSettings : this.f38095o.j()) {
            Hf hf2 = this.H;
            if (hf2 == null || hf2.a(networkSettings, this.f38095o.b())) {
                if (!this.f38092l.b(new Re(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f38095o.b()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f38095o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f38095o.b(), k());
                        if (adapterBaseInterfaceB instanceof B3) {
                            list2.add(new CallableC3557z3(networkSettings.getInstanceType(this.f38095o.b()), networkSettings.getProviderInstanceName(), adDataA, (B3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            this.f38099s.f33941j.g(adapterBaseInterfaceB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb2.append(networkSettings.getInstanceType(this.f38095o.b()));
                        sb2.append(networkSettings.getProviderInstanceName());
                        sb2.append(",");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) throws JSONException {
        IronLog.INTERNAL.verbose(b("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
        AdData adDataA = a(networkSettings, this.f38095o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f38095o.b(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                this.f38099s.f33941j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e10);
            }
        }
        IronLog.INTERNAL.verbose(b("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
    }

    @Override // com.ironsource.InterfaceC3482ud
    public boolean e() {
        T9 t92 = this.J;
        if (t92 == null || t92 == Thread.currentThread()) {
            return false;
        }
        return this.f38095o.l();
    }

    public void a(f fVar) {
        synchronized (this.f38104x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f38096p = fVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0090, B:13:0x0096, B:19:0x00a9, B:16:0x009c, B:18:0x00a2), top: B:37:0x0090 }] */
    @Override // com.ironsource.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.ironsource.AbstractC3438s3<?> r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = r5.k()
            java.lang.String r1 = r4.b(r1)
            r0.verbose(r1)
            java.lang.String r1 = r5.h()
            com.ironsource.Dg<Smash extends com.ironsource.s3<?>> r2 = r4.f38081a
            java.lang.String r2 = r2.c()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invoked from "
            r1.<init>(r2)
            java.lang.String r2 = r5.c()
            r1.append(r2)
            java.lang.String r2 = " with state = "
            r1.append(r2)
            com.ironsource.p3$f r2 = r4.f38096p
            r1.append(r2)
            java.lang.String r2 = " auctionId: "
            r1.append(r2)
            java.lang.String r5 = r5.h()
            r1.append(r5)
            java.lang.String r5 = " and the current id is "
            r1.append(r5)
            com.ironsource.Dg<Smash extends com.ironsource.s3<?>> r5 = r4.f38081a
            java.lang.String r5 = r5.c()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r4.b(r5)
            r0.error(r5)
            com.ironsource.D0 r5 = r4.f38099s
            com.ironsource.dg r5 = r5.f33941j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onAdLoadSuccess invoked with state = "
            r0.<init>(r1)
            com.ironsource.p3$f r1 = r4.f38096p
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.p(r0)
            return
        L72:
            com.ironsource.U r0 = r4.f38095o
            boolean r0 = r0.m()
            if (r0 == 0) goto Lad
            com.ironsource.Dg<Smash extends com.ironsource.s3<?>> r0 = r4.f38081a
            java.util.List r0 = r0.b()
            com.ironsource.Ig r1 = new com.ironsource.Ig
            com.ironsource.U r2 = r4.f38095o
            r1.<init>(r2)
            boolean r2 = r1.a(r5, r0)
            java.lang.Object r3 = r4.f38104x
            monitor-enter(r3)
            if (r2 == 0) goto L9c
            boolean r2 = r4.w()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L9c
            r4.i(r5)     // Catch: java.lang.Throwable -> L9a
            goto La9
        L9a:
            r5 = move-exception
            goto Lab
        L9c:
            boolean r2 = r1.a(r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto La9
            com.ironsource.s3 r0 = r1.c(r0)     // Catch: java.lang.Throwable -> L9a
            r4.i(r0)     // Catch: java.lang.Throwable -> L9a
        La9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9a
            goto Lad
        Lab:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9a
            throw r5
        Lad:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r0 = r4.f38082b
            java.lang.String r1 = r5.c()
            com.ironsource.mediationsdk.h$a r2 = com.ironsource.mediationsdk.h.a.ISAuctionPerformanceLoadedSuccessfully
            r0.put(r1, r2)
            com.ironsource.p3$f r0 = com.ironsource.AbstractC3388p3.f.LOADING
            com.ironsource.p3$f r1 = com.ironsource.AbstractC3388p3.f.READY_TO_SHOW
            boolean r0 = r4.a(r0, r1)
            if (r0 == 0) goto L102
            com.ironsource.l5 r0 = r4.f38094n
            long r0 = com.ironsource.C3317l5.a(r0)
            boolean r2 = r4.v()
            if (r2 == 0) goto Ld6
            com.ironsource.D0 r2 = r4.f38099s
            com.ironsource.Ab r2 = r2.f33937f
            r2.a(r0)
            goto Le1
        Ld6:
            com.ironsource.D0 r2 = r4.f38099s
            com.ironsource.Ab r2 = r2.f33937f
            boolean r3 = r4.q()
            r2.a(r0, r3)
        Le1:
            com.ironsource.U r0 = r4.f38095o
            com.ironsource.N0 r0 = r0.h()
            boolean r0 = r0.e()
            if (r0 == 0) goto Lf4
            com.ironsource.R5 r0 = r4.f38098r
            r1 = 0
            r0.a(r1)
        Lf4:
            com.ironsource.U r0 = r4.f38095o
            boolean r0 = r0.m()
            if (r0 != 0) goto Lff
            r4.i(r5)
        Lff:
            r4.h(r5)
        L102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC3388p3.d(com.ironsource.s3):void");
    }

    public boolean a(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.f38104x) {
            try {
                if (this.f38096p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.f38096p = fVar2;
                    z10 = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.f38096p + ", expected state = " + fVar);
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private T9 a(U u10) {
        if (u10.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f38081a.a(adapterBaseInterface, this.f38095o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f38095o.b());
    }

    public void a(K0 k02) {
        this.f38100t = k02;
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    public void a(boolean z10, boolean z11, AbstractC3438s3<?> abstractC3438s3) {
        synchronized (this.f38104x) {
            try {
                Boolean bool = this.f38106z;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f38106z = Boolean.valueOf(z10);
                    long time = 0;
                    if (this.f38105y != 0) {
                        time = new Date().getTime() - this.f38105y;
                    }
                    this.f38105y = new Date().getTime();
                    this.f38099s.f33937f.a(z10, time, z11);
                    AdInfo adInfoF = abstractC3438s3 != null ? abstractC3438s3.f() : this.A;
                    this.A = adInfoF;
                    K0 k02 = this.f38100t;
                    if (!z10) {
                        adInfoF = null;
                    }
                    k02.a(z10, adInfoF);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(A0 a02) {
        return new ArrayList(Arrays.asList(A0.LOAD_AD_SUCCESS, A0.LOAD_AD_FAILED, A0.LOAD_AD_FAILED_WITH_REASON, A0.AUCTION_SUCCESS, A0.AUCTION_FAILED, A0.AUCTION_FAILED_NO_CANDIDATES, A0.AD_FORMAT_CAPPED, A0.AD_OPENED, A0.SHOW_AD, A0.SHOW_AD_FAILED, A0.AD_CLICKED, A0.RELOAD_AD_FAILED_WITH_REASON, A0.RELOAD_AD_SUCCESS, A0.AD_LEFT_APPLICATION)).contains(a02);
    }

    private boolean b(A0 a02) {
        return !new ArrayList(Arrays.asList(A0.INIT_STARTED, A0.LOAD_AD, A0.AUCTION_REQUEST, A0.AUCTION_REQUEST_WATERFALL, A0.AUCTION_FAILED_NO_CANDIDATES, A0.COLLECT_TOKEN, A0.COLLECT_TOKENS_COMPLETED, A0.COLLECT_TOKENS_FAILED, A0.INSTANCE_COLLECT_TOKEN, A0.INSTANCE_COLLECT_TOKEN_SUCCESS, A0.INSTANCE_COLLECT_TOKEN_FAILED, A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(a02);
    }

    public void b(C3352n2 c3352n2, String str) {
        if (c3352n2 != null) {
            Y8 y8A = c3352n2.a(str);
            if (y8A != null) {
                Iterator it = new HashSet(this.B.a()).iterator();
                while (it.hasNext()) {
                    InterfaceC3124a9 interfaceC3124a9 = (InterfaceC3124a9) it.next();
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + interfaceC3124a9.getClass().getSimpleName() + ": " + y8A));
                    interfaceC3124a9.a(y8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        D0 d02 = this.f38099s;
        if (d02 != null) {
            d02.f33941j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC3367o
    public void a() {
        if (this.f38095o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.ironsource.Dc
    public void a(boolean z10) {
        if (!this.f38090j || this.f38095o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z10);
        if (c(z10)) {
            a(z10, false, (AbstractC3438s3<?>) null);
        }
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(List<C3352n2> list, String str) throws JSONException {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f38082b.clear();
        StringBuilder sb2 = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3352n2 c3352n2 = list.get(i10);
            AbstractC3438s3 abstractC3438s3A = a(c3352n2, str);
            if (abstractC3438s3A != null) {
                copyOnWriteArrayList.add(abstractC3438s3A);
                sb2.append(a(c3352n2, abstractC3438s3A.l()));
            }
            if (i10 != list.size() - 1) {
                sb2.append(",");
            }
        }
        this.f38081a.a(this.f38095o.h().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb2)));
        return sb2.toString();
    }

    private void b(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f38095o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.f38095o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f37337x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f37337x)) > 0) {
                    this.f38095o.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f37338y)) {
                    this.f38095o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f37338y));
                }
                this.f38095o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f37339z, false));
                IronLog.INTERNAL.verbose(b(this.f38095o.r()));
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f38095o.b() + " Error: " + e10.getMessage());
                ironLog.verbose(b(this.f38095o.r()));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(b(this.f38095o.r()));
            throw th2;
        }
    }

    @Override // com.ironsource.Eg
    public void a(int i10) {
        this.f38099s.f33941j.v("waterfalls hold too many with size = " + i10);
    }

    private Smash a(C3352n2 c3352n2, String str) throws JSONException {
        NetworkSettings networkSettingsA = this.f38095o.a(c3352n2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f38095o.b(), k());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.f38095o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.f38095o.b()), str, c3352n2);
                this.f38082b.put(c3352n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c3352n2.c() + " state = " + this.f38096p;
        IronLog.INTERNAL.error(b(str2));
        this.f38099s.f33941j.i(str2);
        return null;
    }

    public String b(String str) {
        String str2 = this.f38095o.b().name() + SFPXhf.IWbYwshQaReuuJe + this.f38096p;
        return TextUtils.isEmpty(str) ? str2 : w0.i.d(str2, UeklptUrP.fYMguZSe, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f38095o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
            return map;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
            return map;
        }
    }

    public void a(int i10, String str, boolean z10) {
        int i11;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f38095o.h().f()) {
            if (z10) {
                i11 = i10;
                str2 = str;
            } else {
                i11 = i10;
                str2 = str;
                this.f38099s.f33937f.a(C3317l5.a(this.f38094n), i11, str2, q());
            }
            a(new IronSourceError(i11, str2));
        } else {
            if (!z10) {
                this.f38099s.f33941j.b(i10, str);
            }
            b(false);
        }
        this.f38097q.e();
    }

    public void a(AbstractC3438s3<?> abstractC3438s3, AdInfo adInfo) {
        this.f38100t.c(adInfo);
    }

    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.f38095o.b(), ironSourceError);
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f38095o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC3557z3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        C3 c32 = new C3();
        e eVar = new e(map, sb2, list);
        this.f38099s.f33938g.a();
        c32.a(list2, eVar, this.f38095o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z10 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f38099s.f33939h.a(1005, "No candidates available for auctioning");
            a(C3554z0.e(this.f38095o.b()), "no available ad to load", false);
            return;
        }
        this.f38099s.f33939h.b(str);
        if (this.f38083c != null) {
            int iA = this.C.a(this.f38095o.b());
            com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f38095o.b());
            iVar.b(IronSourceUtils.g());
            iVar.a(map);
            iVar.a(list);
            iVar.a(this.f38084d);
            iVar.a(iA);
            iVar.a(this.f38102v);
            iVar.d(this.G);
            Hf hf2 = this.H;
            if (hf2 != null && hf2.b()) {
                z10 = true;
            }
            iVar.e(z10);
            a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    public void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s12) {
        com.ironsource.mediationsdk.e eVar = this.f38083c;
        if (eVar != null) {
            eVar.a(context, iVar, s12);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3352n2> list, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            this.f38086f = "";
            this.f38085e = i10;
            this.f38088h = c3352n2;
            this.f38087g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f38099s.f33941j.a(i11, str2);
            }
            a(jSONObject2);
            if (this.f38101u.a(this.f38095o.b())) {
                this.f38099s.f33939h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strA = a(list, str);
            this.f38099s.f33939h.a(j10, this.f38095o.r() + ";wtf=" + list.size());
            this.f38099s.f33939h.c(strA);
            a(f.LOADING);
            C();
            return;
        }
        StringBuilder sbO = e3.g.o("unexpected auction success for auctionId - ", str, " state = ");
        sbO.append(this.f38096p);
        ironLog.error(b(sbO.toString()));
        this.f38099s.f33941j.k("unexpected auction success, state = " + this.f38096p);
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            String str3 = "Auction failed (error " + i10 + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(l() + ": " + str3);
            this.f38085e = i11;
            this.f38086f = str2;
            this.f38087g = new JSONObject();
            if (this.f38095o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                L();
            }
            this.f38099s.f33939h.a(j10, i10, str);
            a(f.LOADING);
            C();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f38096p;
        ironLog.error(b(str4));
        this.f38099s.f33941j.j(str4);
    }

    @Override // com.ironsource.Q0
    public void a(IronSourceError ironSourceError, AbstractC3438s3<?> abstractC3438s3) {
        Jg<Smash> jgE;
        AbstractC3438s3<?> abstractC3438s3C;
        synchronized (this.f38104x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(abstractC3438s3.k() + " - error = " + ironSourceError));
                if (abstractC3438s3.h().equals(this.f38081a.c()) && this.f38096p != f.AUCTION) {
                    this.f38082b.put(abstractC3438s3.c(), h.a.ISAuctionPerformanceFailedToLoad);
                    if (z() || x()) {
                        jgE = E();
                        if (jgE.c()) {
                            a(509, "Mediation No fill", false);
                            return;
                        }
                    } else {
                        jgE = null;
                    }
                    if (jgE == null) {
                        return;
                    }
                    if (this.f38095o.m()) {
                        synchronized (this.f38104x) {
                            try {
                                if (jgE.b() && w() && (abstractC3438s3C = new Ig(this.f38095o).c(this.f38081a.b())) != null) {
                                    i(abstractC3438s3C);
                                }
                            } finally {
                            }
                        }
                    }
                    Iterator<Smash> it = jgE.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + abstractC3438s3.c() + " with state =" + this.f38096p + " auctionId: " + abstractC3438s3.h() + " and the current id is " + this.f38081a.c()));
                C3185dg c3185dg = this.f38099s.f33941j;
                StringBuilder sb2 = new StringBuilder("onAdLoadFailed was invoked with state =");
                sb2.append(this.f38096p);
                c3185dg.o(sb2.toString());
            } finally {
            }
        }
    }

    @Override // com.ironsource.Q0
    public void a(AbstractC3438s3<?> abstractC3438s3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3438s3.k()));
        this.f38099s.f33940i.g(n());
        this.f38081a.a(abstractC3438s3);
        this.f38081a.b(abstractC3438s3);
        this.f38092l.a(abstractC3438s3);
        if (this.f38092l.b(abstractC3438s3)) {
            ironLog.verbose(b(abstractC3438s3.c() + " was session capped"));
            abstractC3438s3.N();
            IronSourceUtils.i(abstractC3438s3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.f38095o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.f38089i, this.f38095o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.f38099s.f33940i.b(n(), null);
        }
        this.D.b(this.f38095o.b());
        if (this.f38095o.q()) {
            C3352n2 c3352n2I = abstractC3438s3.i();
            this.f38083c.a(c3352n2I, abstractC3438s3.l(), this.f38088h, n());
            this.f38082b.put(abstractC3438s3.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(c3352n2I, n());
            }
        }
        g(abstractC3438s3);
        if (this.f38095o.h().e()) {
            b(false);
        }
        this.f38097q.h();
    }

    public Map<String, Object> a(A0 a02) {
        HashMap mapS = b0.e2.s(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapS.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f38087g;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapS.put("genericParams", this.f38087g);
        }
        mapS.put("sessionDepth", Integer.valueOf(this.C.a(this.f38095o.b())));
        if (c(a02)) {
            mapS.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f38085e));
            if (!TextUtils.isEmpty(this.f38086f)) {
                mapS.put(IronSourceConstants.AUCTION_FALLBACK, this.f38086f);
            }
        }
        if (b(a02) && !TextUtils.isEmpty(this.f38081a.c())) {
            mapS.put("auctionId", this.f38081a.c());
        }
        return mapS;
    }

    public void a(C3161ca c3161ca) {
        this.f38102v = c3161ca;
    }

    private void a(JSONObject jSONObject) {
        this.f38101u.a(this.f38095o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f37319f, false) : false);
        b(jSONObject);
    }

    public String a(C3352n2 c3352n2, int i10) {
        return p0.o2.j(i10, c3352n2.c());
    }

    public void a(Hf hf2) {
        this.H = hf2;
        if (hf2 != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.f38106z = null;
    }

    @Override // com.ironsource.A3
    public void a(NetworkSettings networkSettings) throws JSONException {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f38095o.b(), k());
        if (adapterBaseInterfaceB != null) {
            this.f38099s.f33938g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    @Override // com.ironsource.A3
    public void a(String str) {
        this.f38099s.f33941j.g(str);
    }

    @Override // com.ironsource.InterfaceC3482ud
    public void a(Runnable runnable) {
        T9 t92 = this.J;
        if (t92 != null) {
            t92.a(runnable);
        }
    }
}
