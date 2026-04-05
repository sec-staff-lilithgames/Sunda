package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C3433rf;
import com.ironsource.D0;
import com.ironsource.O8;
import com.ironsource.Q0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3438s3<Listener extends Q0> implements NetworkInitializationListener, C3433rf.a, C0, AdapterAdListener, O8.b {

    /* renamed from: a, reason: collision with root package name */
    protected C3312l0 f38330a;

    /* renamed from: b, reason: collision with root package name */
    protected Listener f38331b;

    /* renamed from: c, reason: collision with root package name */
    protected BaseAdAdapter<?, AdapterAdListener> f38332c;

    /* renamed from: d, reason: collision with root package name */
    protected D0 f38333d;

    /* renamed from: e, reason: collision with root package name */
    protected h f38334e;

    /* renamed from: g, reason: collision with root package name */
    protected C3325ld f38336g;

    /* renamed from: h, reason: collision with root package name */
    protected C3134b1 f38337h;

    /* renamed from: i, reason: collision with root package name */
    protected JSONObject f38338i;

    /* renamed from: j, reason: collision with root package name */
    protected String f38339j;

    /* renamed from: k, reason: collision with root package name */
    protected AdData f38340k;

    /* renamed from: l, reason: collision with root package name */
    protected Long f38341l;

    /* renamed from: m, reason: collision with root package name */
    protected C3317l5 f38342m;

    /* renamed from: o, reason: collision with root package name */
    private final C3352n2 f38344o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3482ud f38345p;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f38335f = new AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    private C3433rf f38343n = new C3433rf(TimeUnit.SECONDS.toMillis(s()));

    /* renamed from: q, reason: collision with root package name */
    protected final Object f38346q = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$a */
    public class a extends AbstractRunnableC3273ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.L();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$b */
    public class b extends AbstractRunnableC3273ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.K();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$c */
    public class c extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38349b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38350c;

        public c(int i10, String str) {
            this.f38349b = i10;
            this.f38350c = str;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.a(this.f38349b, this.f38350c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$d */
    public class d extends AbstractRunnableC3273ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.I();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$e */
    public class e extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f38353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38354c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38355d;

        public e(AdapterErrorType adapterErrorType, int i10, String str) {
            this.f38353b = adapterErrorType;
            this.f38354c = i10;
            this.f38355d = str;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.a(this.f38353b, this.f38354c, this.f38355d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$f */
    public class f extends AbstractRunnableC3273ie {
        public f() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.J();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$g */
    public class g extends AbstractRunnableC3273ie {
        public g() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3438s3.this.H();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s3$h */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3438s3(InterfaceC3482ud interfaceC3482ud, C3312l0 c3312l0, BaseAdAdapter<?, ?> baseAdAdapter, C3134b1 c3134b1, C3352n2 c3352n2, Listener listener) {
        this.f38330a = c3312l0;
        this.f38331b = listener;
        this.f38333d = new D0(c3312l0.a(), D0.b.PROVIDER, this);
        this.f38337h = c3134b1;
        this.f38338i = c3134b1.c();
        this.f38332c = baseAdAdapter;
        this.f38344o = c3352n2;
        this.f38345p = interfaceC3482ud;
        a(h.NONE);
    }

    private boolean D() {
        return this.f38334e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f38343n.a((C3433rf.a) this);
            G();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage() + " - state = " + this.f38334e;
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33941j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.a(j());
        }
        this.f38331b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C3433rf c3433rf = this.f38343n;
        if (c3433rf != null) {
            c3433rf.e();
        }
        synchronized (this.f38346q) {
            try {
                h hVar = this.f38334e;
                zO = false;
                if (hVar == h.LOADING) {
                    long jA = C3317l5.a(this.f38342m);
                    ironLog.verbose(a("Load duration = " + jA));
                    if (this.f38333d != null) {
                        if (v()) {
                            this.f38333d.f33937f.a(jA);
                        } else {
                            this.f38333d.f33937f.a(jA, false);
                        }
                    }
                    a(h.LOADED);
                    zO = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a("unexpected load success for " + k() + ", state - " + this.f38334e));
                    h hVar2 = this.f38334e;
                    StringBuilder sb2 = new StringBuilder("unexpected load success, state - ");
                    sb2.append(hVar2);
                    String string = sb2.toString();
                    if (this.f38333d != null) {
                        if (v()) {
                            this.f38333d.f33941j.s(string);
                        } else {
                            this.f38333d.f33941j.p(string);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zO) {
            this.f38331b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.g(j());
        }
        this.f38331b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C3433rf c3433rf = this.f38343n;
            if (c3433rf != null) {
                c3433rf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f38334e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init success for " + k() + ", state - " + this.f38334e));
        if (this.f38333d != null) {
            this.f38333d.f33941j.n("unexpected init success, state - " + this.f38334e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C3317l5.a(this.f38342m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbR = b0.e2.r(jA, "Load duration = ", ", state = ");
        sbR.append(this.f38334e);
        sbR.append(", isBidder = ");
        sbR.append(w());
        ironLog.verbose(a(sbR.toString()));
        synchronized (this.f38346q) {
            try {
                if (z()) {
                    a(h.FAILED);
                    D0 d02 = this.f38333d;
                    if (d02 != null) {
                        d02.f33937f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                        this.f38333d.f33937f.a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
                    }
                    this.f38331b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
                    return;
                }
                ironLog.error(a("unexpected timeout for " + k() + ", state - " + this.f38334e + ", error - 1025"));
                if (this.f38333d != null) {
                    this.f38333d.f33941j.u("unexpected timeout, state - " + this.f38334e + ", error - 1025");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C3352n2 c3352n2 = this.f38344o;
        if (c3352n2 == null) {
            return this.f38330a.f();
        }
        Integer numF = c3352n2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f38330a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.f38344o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f38335f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f38334e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C3352n2 c3352n2I = i();
        String strK = c3352n2I.k();
        Map<String, Object> mapA = C3286ja.a(c3352n2I.a());
        mapA.put("adUnit", this.f38330a.a());
        b(strK);
        try {
            boolean z10 = false;
            if (v()) {
                this.f38333d.f33937f.a();
            } else {
                this.f38333d.f33937f.a(false);
            }
            this.f38341l = null;
            this.f38342m = new C3317l5();
            this.f38340k = a(strK, mapA);
            synchronized (this.f38346q) {
                if (this.f38334e != h.NONE) {
                    z10 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str = "loadAd - incorrect state while loading, state = " + this.f38334e;
                ironLog.error(a(str));
                this.f38333d.f33941j.g(str);
                onInitFailed(C3554z0.c(this.f38330a.a()), str);
                return;
            }
            this.f38343n.a((C3433rf.a) this);
            AdapterBaseInterface networkAdapter = this.f38332c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f38340k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(C3554z0.c(this.f38330a.a()), str2);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String str3 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33941j.g(str3);
            }
            onInitFailed(C3554z0.c(this.f38330a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.f38332c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f38340k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0051, B:17:0x0055, B:18:0x005a, B:20:0x005e, B:21:0x0063, B:12:0x000e, B:14:0x004a), top: B:27:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:15:0x0051, B:17:0x0055, B:18:0x005a, B:20:0x005e, B:21:0x0063, B:12:0x000e, B:14:0x004a), top: B:27:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M() {
        /*
            r4 = this;
            java.lang.String r0 = "Exception while calling adapter.releaseMemory() from "
            monitor-enter(r4)
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> r1 = r4.f38332c     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            if (r1 == 0) goto L51
            r4.f38332c = r2     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            goto L51
        Lb:
            r0 = move-exception
            goto L65
        Ld:
            r1 = move-exception
            com.ironsource.r4 r3 = com.ironsource.C3422r4.d()     // Catch: java.lang.Throwable -> Lb
            r3.a(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb
            com.ironsource.b1 r0 = r4.f38337h     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r0.f()     // Catch: java.lang.Throwable -> Lb
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = " - "
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> Lb
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = " - state = "
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb
            com.ironsource.s3$h r0 = r4.f38334e     // Catch: java.lang.Throwable -> Lb
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lb
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = r4.a(r0)     // Catch: java.lang.Throwable -> Lb
            r1.error(r3)     // Catch: java.lang.Throwable -> Lb
            com.ironsource.D0 r1 = r4.f38333d     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L51
            com.ironsource.D0 r1 = r4.f38333d     // Catch: java.lang.Throwable -> Lb
            com.ironsource.dg r1 = r1.f33941j     // Catch: java.lang.Throwable -> Lb
            r1.g(r0)     // Catch: java.lang.Throwable -> Lb
        L51:
            com.ironsource.D0 r0 = r4.f38333d     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L5a
            r0.f()     // Catch: java.lang.Throwable -> Lb
            r4.f38333d = r2     // Catch: java.lang.Throwable -> Lb
        L5a:
            com.ironsource.rf r0 = r4.f38343n     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L63
            r0.d()     // Catch: java.lang.Throwable -> Lb
            r4.f38343n = r2     // Catch: java.lang.Throwable -> Lb
        L63:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            return
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC3438s3.M():void");
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.a();
        }
    }

    public boolean O() {
        return true;
    }

    public String h() {
        return this.f38330a.c();
    }

    public C3352n2 i() {
        return this.f38344o;
    }

    public String j() {
        C3325ld c3325ld = this.f38336g;
        return c3325ld == null ? "" : c3325ld.c();
    }

    public String k() {
        return j1.o2.g(hashCode(), c(), " ");
    }

    public int l() {
        return this.f38337h.d();
    }

    public String m() {
        return this.f38337h.h().isMultipleInstances() ? this.f38337h.h().getProviderTypeForReflection() : this.f38337h.f();
    }

    public String n() {
        return this.f38337h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f38345p.e()) {
            this.f38345p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str) {
        if (this.f38345p.e()) {
            this.f38345p.a(new e(adapterErrorType, i10, str));
        } else {
            a(adapterErrorType, i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f38345p.e()) {
            this.f38345p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f38345p.e()) {
            this.f38345p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        if (this.f38345p.e()) {
            this.f38345p.a(new c(i10, str));
        } else {
            a(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f38345p.e()) {
            this.f38345p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f38330a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C3286ja.a(this.f38338i));
        return map;
    }

    public Integer r() {
        C3312l0 c3312l0 = this.f38330a;
        if (c3312l0 != null) {
            return Integer.valueOf(c3312l0.h());
        }
        return null;
    }

    public h t() {
        return this.f38334e;
    }

    public InterfaceC3482ud u() {
        return this.f38345p;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.f38337h.j();
    }

    public boolean x() {
        return this.f38334e == h.FAILED;
    }

    public boolean y() {
        return this.f38334e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f38334e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    public Map<String, Object> a(A0 a02) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f38332c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f38332c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.f38337h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f38337h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f38339j)) {
            map.put("dynamicDemandSource", this.f38339j);
        }
        map.put("sessionDepth", r());
        if (this.f38330a.e() != null && this.f38330a.e().length() > 0) {
            map.put("genericParams", this.f38330a.e());
        }
        if (!TextUtils.isEmpty(this.f38330a.c())) {
            map.put("auctionId", this.f38330a.c());
        }
        if (b(a02)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f38330a.d()));
            if (!TextUtils.isEmpty(this.f38330a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f38330a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f38330a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f38330a.g().getCustomNetwork());
        }
        return map;
    }

    public void b(String str) {
        this.f38339j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.O8.b
    public String c() {
        return this.f38337h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f38341l;
    }

    public AdInfo f() {
        return new AdInfo(this.f38344o.a(j()), this.f38344o.d());
    }

    public IronSource.a g() {
        return this.f38330a.a();
    }

    @Override // com.ironsource.O8.b
    public int b() {
        return this.f38337h.e();
    }

    private boolean b(A0 a02) {
        return new ArrayList(Arrays.asList(A0.LOAD_AD, A0.LOAD_AD_SUCCESS, A0.LOAD_AD_FAILED, A0.LOAD_AD_FAILED_WITH_REASON, A0.LOAD_AD_NO_FILL, A0.RELOAD_AD, A0.RELOAD_AD_SUCCESS, A0.RELOAD_AD_FAILED_WITH_REASON, A0.RELOAD_AD_NO_FILL, A0.DESTROY_AD, A0.AD_PRESENT_SCREEN, A0.AD_DISMISS_SCREEN, A0.AD_LEFT_APPLICATION, A0.AD_OPENED, A0.AD_CLOSED, A0.SHOW_AD, A0.SHOW_AD_FAILED, A0.AD_CLICKED, A0.AD_REWARDED)).contains(a02);
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f38334e = hVar;
    }

    public void a(boolean z10) {
        this.f38335f.set(z10);
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f38330a.i());
        return map;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.f38330a.a().name() + " - " + k() + " - state = " + this.f38334e;
        return TextUtils.isEmpty(str) ? str2 : w0.i.d(str2, " - ", str);
    }

    @Override // com.ironsource.C3433rf.a
    public void a() {
        if (!this.f38345p.e()) {
            L();
        } else {
            this.f38345p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        if (D()) {
            C3433rf c3433rf = this.f38343n;
            if (c3433rf != null) {
                c3433rf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C3317l5.a(this.f38342m));
            this.f38331b.a(new IronSourceError(i10, str), this);
            return;
        }
        if (this.f38334e == h.FAILED) {
            return;
        }
        ironLog.error(a("unexpected init failed for " + k() + ", state - " + this.f38334e + ", error - " + i10 + ", " + str));
        if (this.f38333d != null) {
            this.f38333d.f33941j.m("unexpected init failed, state - " + this.f38334e + ", error - " + i10 + ", " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C3317l5.a(this.f38342m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        C3433rf c3433rf = this.f38343n;
        if (c3433rf != null) {
            c3433rf.e();
        }
        synchronized (this.f38346q) {
            h hVar = this.f38334e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i10, str, jA);
                a(h.FAILED);
                this.f38331b.a(new IronSourceError(i10, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i10, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f38341l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a("ad expired for " + this.f38337h.f() + ", state = " + this.f38334e));
                D0 d02 = this.f38333d;
                if (d02 != null) {
                    d02.f33941j.a("ad expired, state = " + this.f38334e);
                }
                return;
            }
            ironLog.error(a("unexpected load failed for " + k() + ", state - " + this.f38334e + ", error - " + i10 + ", " + str));
            h hVar2 = this.f38334e;
            StringBuilder sb2 = new StringBuilder("unexpected load failed, state - ");
            sb2.append(hVar2);
            sb2.append(", error - ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(str);
            String string = sb2.toString();
            if (this.f38333d != null) {
                if (v()) {
                    this.f38333d.f33941j.r(string);
                } else if (this.f38330a.a() != IronSource.a.REWARDED_VIDEO || this.f38334e != h.SHOWING) {
                    this.f38333d.f33941j.o(string);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f38333d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f38333d.f33937f.b(j10, i10);
                    return;
                } else {
                    this.f38333d.f33937f.a(j10, i10);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.f38333d.f33937f.a(j10, i10, str);
                    return;
                } else {
                    this.f38333d.f33937f.a(j10, i10, str, false);
                    return;
                }
            }
            this.f38333d.f33937f.a(j10, i10, false);
        }
    }
}
