package com.ironsource;

import com.ironsource.C3385p0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3553z implements AdapterAdListener, NetworkInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f39302a;

    /* renamed from: b, reason: collision with root package name */
    private final A f39303b;

    /* renamed from: c, reason: collision with root package name */
    private final G f39304c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<D> f39305d;

    /* renamed from: e, reason: collision with root package name */
    private E f39306e;

    /* renamed from: f, reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f39307f;

    /* renamed from: g, reason: collision with root package name */
    private C3317l5 f39308g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractRunnableC3273ie f39309h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, Object> f39310i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f39311j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39312k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f39313l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39314m;

    /* renamed from: n, reason: collision with root package name */
    private final AdData f39315n;

    /* renamed from: o, reason: collision with root package name */
    private final C3352n2 f39316o;

    /* renamed from: p, reason: collision with root package name */
    private final C3352n2 f39317p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f39318q;

    /* renamed from: r, reason: collision with root package name */
    private final String f39319r;

    /* renamed from: s, reason: collision with root package name */
    private final int f39320s;

    /* renamed from: t, reason: collision with root package name */
    private final String f39321t;

    /* renamed from: u, reason: collision with root package name */
    private final IronSource.a f39322u;

    /* renamed from: v, reason: collision with root package name */
    private final int f39323v;

    /* renamed from: w, reason: collision with root package name */
    private final H f39324w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.z$a */
    public static final class a extends AbstractRunnableC3273ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            long jA = C3317l5.a(AbstractC3553z.this.f39308g);
            IronLog ironLog = IronLog.INTERNAL;
            AbstractC3553z abstractC3553z = AbstractC3553z.this;
            ironLog.verbose(abstractC3553z.a("Load duration = " + jA + ", isBidder = " + abstractC3553z.u()));
            AbstractC3553z.this.f39314m = true;
            AbstractC3553z.this.f().e().e().a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
            AbstractC3553z.this.f().e().e().a(jA, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
            AbstractC3553z abstractC3553z2 = AbstractC3553z.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC3553z2.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public AbstractC3553z(V0 adTools, A instanceData, G adInstancePayload, D listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f39302a = adTools;
        this.f39303b = instanceData;
        this.f39304c = adInstancePayload;
        this.f39305d = new WeakReference<>(listener);
        this.f39310i = new LinkedHashMap();
        this.f39315n = instanceData.g();
        this.f39316o = instanceData.n();
        this.f39317p = instanceData.p();
        this.f39318q = instanceData.j().j();
        this.f39319r = instanceData.r();
        this.f39320s = instanceData.s();
        this.f39321t = instanceData.w();
        this.f39322u = instanceData.h();
        this.f39323v = instanceData.v();
        this.f39324w = instanceData.t();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(instanceData);
        this.f39307f = baseAdAdapterA;
        adTools.e().a(new B(adTools, instanceData, baseAdAdapterA));
        adTools.e().a(new U1(instanceData.k()));
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            G();
            A();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("unexpected error while calling adapter.loadAd() - ", th2.getMessage());
            IronLog.INTERNAL.error(a(strK));
            this.f39302a.e().h().g(strK);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, strK);
        }
    }

    private final void C() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f39302a.e().a().a(k());
        D d10 = this.f39305d.get();
        if (d10 != null) {
            d10.a(this);
        }
    }

    private final void D() {
        IronLog ironLog = IronLog.INTERNAL;
        E e10 = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f39314m) {
            c();
            this.f39302a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.f39312k) {
            this.f39302a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.f39312k = true;
        long jA = C3317l5.a(this.f39308g);
        ironLog.verbose(a("Load duration = " + jA));
        this.f39302a.e().e().a(jA, false);
        a(C3385p0.a.LoadedSuccessfully);
        E e11 = this.f39306e;
        if (e11 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("loadListener");
        } else {
            e10 = e11;
        }
        e10.a(this);
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f39313l) {
            this.f39302a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.f39313l = true;
        this.f39302a.e().a().g(k());
        a(C3385p0.a.ShowedSuccessfully);
        D d10 = this.f39305d.get();
        if (d10 != null) {
            d10.b(this);
        }
    }

    private final void F() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f39314m) {
            return;
        }
        B();
    }

    private final void G() {
        H();
        a aVarA = a();
        this.f39309h = aVarA;
        if (aVarA != null) {
            this.f39302a.a((AbstractRunnableC3273ie) aVarA, TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void H() {
        AbstractRunnableC3273ie abstractRunnableC3273ie = this.f39309h;
        if (abstractRunnableC3273ie != null) {
            this.f39302a.b(abstractRunnableC3273ie);
            this.f39309h = null;
        }
    }

    private final int o() {
        Integer numF = this.f39303b.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.f39303b.i().h() : numF.intValue();
    }

    public abstract void A();

    public abstract void a(I i10);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        this.f39302a.e().e().a(this.f39323v);
    }

    public void c() {
    }

    public final IronSource.a d() {
        return this.f39322u;
    }

    public final Map<String, Object> l() {
        return this.f39310i;
    }

    public final C3352n2 m() {
        return this.f39317p;
    }

    public final A n() {
        return this.f39303b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new oi(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        a(new com.applovin.impl.sdk.y(this, adapterErrorType, i10, errorMessage));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        a(new pi(this, i10, errorMessage, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        a(new pi(this, i10, str, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new oi(this, 1));
    }

    public final String p() {
        return this.f39319r;
    }

    public final String q() {
        return this.f39321t;
    }

    public final int r() {
        return this.f39320s;
    }

    public final H s() {
        return this.f39324w;
    }

    public final int t() {
        return this.f39323v;
    }

    public final boolean u() {
        return this.f39318q;
    }

    public final boolean v() {
        return this.f39314m;
    }

    public final boolean w() {
        return this.f39312k;
    }

    public final boolean x() {
        return this.f39311j;
    }

    public final boolean y() {
        return this.f39313l;
    }

    public boolean z() {
        return this.f39312k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC3553z this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC3553z this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.F();
    }

    public LevelPlayAdInfo e() {
        String string = this.f39303b.i().b().b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.f39303b.i().b().c();
        String string2 = this.f39303b.h().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, this.f39303b.n().a(k()), this.f39303b.n().d(), null, this.f39303b.i().l(), uu.p1.toMap(this.f39310i));
    }

    public final V0 f() {
        return this.f39302a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.f39307f;
    }

    public final C3352n2 h() {
        return this.f39316o;
    }

    public final AdData i() {
        return this.f39315n;
    }

    public final C3325ld j() {
        return this.f39303b.i().b().f();
    }

    public final String k() {
        return this.f39303b.i().l();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(Map<String, Object> extraData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extraData, "extraData");
        a(new ni(1, this, extraData));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extraData, "extraData");
        a(new oi(this, 2));
    }

    private final void b(int i10, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i10 + ", " + str));
        H();
        this.f39314m = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C3317l5.a(this.f39308g));
        a(new IronSourceError(i10, str));
    }

    public final void a(C3385p0.a performance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(performance, "performance");
        this.f39303b.a(performance);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        this.f39302a.a(callback);
    }

    public final void a(boolean z10) {
        this.f39302a.e().a().a(z10);
    }

    private final BaseAdAdapter<?, ?> a(A a10) {
        if (a10.i().e().q()) {
            return this.f39304c.b();
        }
        return this.f39302a.a(a10);
    }

    public final void a(E listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f39306e = listener;
        this.f39311j = true;
        try {
            this.f39302a.e().e().a(false);
            this.f39308g = new C3317l5();
            G();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f39307f;
            kotlin.jvm.internal.e0.checkNotNull(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f39303b.g(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.f39321t;
            ironLog.error(a(str));
            b(C3554z0.c(this.f39303b.h()), str);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("loadAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strK));
            this.f39302a.e().h().g(strK);
            b(C3554z0.c(this.f39303b.h()), strK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC3553z this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC3553z this$0, int i10, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.b(i10, str);
    }

    public static /* synthetic */ String a(AbstractC3553z abstractC3553z, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return abstractC3553z.a(str);
    }

    public final String a(String str) {
        return this.f39302a.a(str, this.f39321t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C3385p0.a.FailedToLoad);
        E e10 = this.f39306e;
        if (e10 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("loadListener");
            e10 = null;
        }
        e10.a(ironSourceError, this);
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C3317l5.a(this.f39308g);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        H();
        if (this.f39314m) {
            c();
            a(adapterErrorType, i10, str, jA);
        } else {
            if (this.f39312k) {
                a(adapterErrorType);
                return;
            }
            this.f39314m = true;
            c();
            a(adapterErrorType, i10, str, jA);
            a(new IronSourceError(i10, str));
        }
    }

    public final void a(int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i10 + ", " + errorMessage));
        this.f39302a.e().a().a(k(), i10, errorMessage, "");
        a(C3385p0.a.FailedToShow);
        D d10 = this.f39305d.get();
        if (d10 != null) {
            d10.a(this, new IronSourceError(i10, errorMessage));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f39302a.e().h().a("");
        } else {
            this.f39302a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f39302a.e().e().a(j10, i10);
        } else if (str != null && str.length() != 0) {
            this.f39302a.e().e().a(j10, i10, str, false);
        } else {
            this.f39302a.e().e().a(j10, i10, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3553z this$0, Map extraData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(extraData, "$extraData");
        this$0.f39310i.putAll(extraData);
        this$0.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3553z this$0, AdapterErrorType adapterErrorType, int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i10, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3553z this$0, int i10, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(i10, errorMessage);
    }
}
