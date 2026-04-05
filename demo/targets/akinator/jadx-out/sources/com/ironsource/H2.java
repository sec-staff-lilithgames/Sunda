package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC3388p3;
import com.ironsource.N0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class H2 extends AbstractC3388p3<L2, AdapterAdViewListener> implements InterfaceC3418r0, G2 {
    private C3136b3 K;
    private boolean L;
    private com.ironsource.mediationsdk.q M;
    private View N;
    private AbstractC3438s3<?> O;
    private FrameLayout.LayoutParams P;
    private final AtomicBoolean Q;
    private final AtomicBoolean R;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements E3 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3438s3 f34560a;

        public a(AbstractC3438s3 abstractC3438s3) {
            this.f34560a = abstractC3438s3;
        }

        @Override // com.ironsource.E3
        public void a() {
            ((L2) this.f34560a).Q();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements E3 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3438s3 f34562a;

        public b(AbstractC3438s3 abstractC3438s3) {
            this.f34562a = abstractC3438s3;
        }

        @Override // com.ironsource.E3
        public void a() {
            ((L2) this.f34562a).Q();
            H2 h22 = H2.this;
            h22.f38099s.f33940i.j(h22.n());
            H2.this.Q.set(false);
            H2.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + H2.this.f38095o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            H2.this.O().h();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34564a;

        static {
            int[] iArr = new int[N0.a.values().length];
            f34564a = iArr;
            try {
                iArr[N0.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34564a[N0.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public H2(List<NetworkSettings> list, V2 v22, String str, C3360na c3360na, C3161ca c3161ca) {
        super(new I2(str, list, v22), c3360na, c3161ca);
        this.L = false;
        this.Q = new AtomicBoolean(true);
        this.R = new AtomicBoolean(false);
        this.K = N();
    }

    private C3244h3 P() {
        return (C3244h3) this.f38097q;
    }

    private ISBannerSize Q() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        return this.M.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : this.M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i10 = c.f34564a[this.f38097q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i10 = c.f34564a[this.f38097q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    public boolean R() {
        if (!this.M.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.M.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void T() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar != null) {
            a(qVar);
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public L2 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i10, String str, C3352n2 c3352n2) {
        return new L2(this, new C3312l0(IronSource.a.BANNER, this.f38095o.o(), i10, this.f38087g, str, this.f38085e, this.f38086f, networkSettings, this.f38095o.n()), baseAdAdapter, this.M, this.f38089i, v(), c3352n2, this);
    }

    @Override // com.ironsource.G2
    public void c() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.f38099s.f33937f.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.N, this.P);
        }
    }

    @Override // com.ironsource.G2
    public void d() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.f38099s.f33941j.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.T0
    public void f(AbstractC3438s3<?> abstractC3438s3) {
        IronLog.INTERNAL.verbose(b(abstractC3438s3.k()));
        this.f38100t.f(abstractC3438s3.f());
    }

    @Override // com.ironsource.AbstractC3388p3
    public void g(AbstractC3438s3<?> abstractC3438s3) {
    }

    @Override // com.ironsource.AbstractC3388p3
    public void h(AbstractC3438s3<?> abstractC3438s3) {
    }

    @Override // com.ironsource.AbstractC3388p3
    public String l() {
        return "BN";
    }

    @Override // com.ironsource.AbstractC3388p3
    public String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean v() {
        return this.L;
    }

    private void M() {
        int i10 = c.f34564a[this.f38097q.b().a().ordinal()];
        if (i10 == 1) {
            P().a();
        } else {
            if (i10 != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private C3136b3 N() {
        return new C3136b3(this.f38095o.h(), this.f38095o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3136b3 O() {
        return this.K;
    }

    @Override // com.ironsource.AbstractC3388p3
    public void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s12) {
        if (this.f38083c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.f38083c.a(context, iVar, s12);
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    public K0 g() {
        return new C3154c3();
    }

    @Override // com.ironsource.AbstractC3388p3
    public P0 h() {
        return new C3244h3(this.f38095o.h(), this);
    }

    @Override // com.ironsource.AbstractC3388p3
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC3388p3, com.ironsource.Gb
    public void b() {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f38099s.f33937f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (R()) {
                synchronized (this.f38104x) {
                    try {
                        if (a(AbstractC3388p3.f.SHOWING, AbstractC3388p3.f.READY_TO_LOAD)) {
                            ironLog.verbose("start reload");
                            z10 = true;
                            this.L = true;
                        } else {
                            ironLog.error("wrong state = " + this.f38096p);
                            z10 = false;
                        }
                    } finally {
                    }
                }
                if (z10) {
                    a(this.M, this.f38089i);
                    return;
                }
                return;
            }
            if (this.f38095o.h().a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                ironLog.verbose("banner is not visible, reload skipped");
                this.f38099s.f33937f.b(613);
            }
            U();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            this.f38099s.f33941j.c(th2.getMessage());
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    public void a(int i10, String str, boolean z10) {
        if (v()) {
            if (!z10) {
                this.f38099s.f33937f.a(C3317l5.a(this.f38094n), i10, str);
                com.ironsource.mediationsdk.n.a().b(this.f38095o.b(), new IronSourceError(i10, str));
            }
            if (v()) {
                a(AbstractC3388p3.f.SHOWING);
                V();
                return;
            }
            return;
        }
        super.a(i10, str, z10);
    }

    private void c(AbstractC3438s3<?> abstractC3438s3, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(AbstractC3388p3.f.READY_TO_SHOW, AbstractC3388p3.f.SHOWING)) {
            this.R.set(false);
            O().e();
            ((L2) abstractC3438s3).R();
            com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new b(abstractC3438s3));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f38096p);
    }

    public void a(com.ironsource.mediationsdk.q qVar, C3325ld c3325ld) {
        String strConcat;
        IronLog.INTERNAL.verbose("placement = " + c3325ld);
        int iB = 510;
        if (!b(qVar)) {
            strConcat = "can't load banner - ".concat(qVar == null ? "banner is null" : "banner is destroyed");
        } else if (c3325ld != null && !TextUtils.isEmpty(c3325ld.c())) {
            if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c3325ld, this.f38095o.b())) {
                strConcat = a.b.l("placement ", c3325ld.c(), " is capped");
                iB = C3554z0.f(this.f38095o.b());
            } else {
                strConcat = null;
            }
        } else {
            strConcat = "can't load banner - ".concat(c3325ld == null ? "placement is null" : "placement name is empty");
            iB = C3554z0.b(this.f38095o.b());
        }
        if (!TextUtils.isEmpty(strConcat)) {
            IronLog.API.error(b(strConcat));
            a(iB, strConcat, false);
        } else {
            com.ironsource.mediationsdk.l.b(qVar);
            this.M = qVar;
            this.f38089i = c3325ld;
            A();
        }
    }

    @Override // com.ironsource.T0
    public void c(AbstractC3438s3<?> abstractC3438s3) {
        IronLog.INTERNAL.verbose(b(abstractC3438s3.k()));
        this.f38100t.b(abstractC3438s3.f());
    }

    public boolean b(com.ironsource.mediationsdk.q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    private void b(AbstractC3438s3<?> abstractC3438s3, View view, FrameLayout.LayoutParams layoutParams) {
        ((L2) abstractC3438s3).R();
        com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new a(abstractC3438s3));
    }

    @Override // com.ironsource.T0
    public void b(AbstractC3438s3<?> abstractC3438s3) {
        IronLog.INTERNAL.verbose(b(abstractC3438s3.k()));
        this.f38100t.e(abstractC3438s3.f());
    }

    @Override // com.ironsource.AbstractC3388p3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    public void a(com.ironsource.mediationsdk.q qVar) {
        int iA;
        try {
            if (!b(qVar)) {
                IronLog.API.error("destroy banner failed - errorMessage = ".concat("can't destroy banner - ".concat(qVar == null ? "banner is null" : "banner is destroyed")));
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            L2 l22 = (L2) this.f38081a.d();
            if (l22 != null) {
                if (l22.r() != null) {
                    iA = l22.r().intValue();
                } else {
                    iA = this.C.a(this.f38095o.b());
                }
                this.f38099s.f33937f.a(iA);
                l22.P();
                this.f38081a.a(null);
                this.f38081a.b(null);
            }
            com.ironsource.mediationsdk.l.a(qVar);
            this.M = null;
            this.f38089i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(AbstractC3388p3.f.READY_TO_LOAD);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f38096p;
            IronLog.INTERNAL.error(b(str));
            D0 d02 = this.f38099s;
            if (d02 != null) {
                d02.f33941j.g(str);
            }
        }
    }

    @Override // com.ironsource.AbstractC3388p3, com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        Map<String, Object> mapA = super.a(a02);
        if (b(this.M)) {
            com.ironsource.mediationsdk.l.a(mapA, this.M.getSize());
        }
        if (this.f38089i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.ironsource.InterfaceC3418r0
    public void a(AbstractC3438s3<?> abstractC3438s3, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.f38096p);
        super.d(abstractC3438s3);
        if (this.f38095o.h().a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (a(AbstractC3388p3.f.READY_TO_SHOW, AbstractC3388p3.f.SHOWING)) {
                this.f38081a.a(abstractC3438s3);
                this.f38081a.b(abstractC3438s3);
                b(abstractC3438s3, view, layoutParams);
                P().k();
                this.f38100t.c(abstractC3438s3.f());
                return;
            }
            return;
        }
        if (P().o()) {
            this.f38081a.b(abstractC3438s3);
            if (this.Q.get()) {
                c(abstractC3438s3, view, layoutParams);
            } else {
                this.O = abstractC3438s3;
                this.N = view;
                this.P = layoutParams;
            }
            this.f38100t.c(abstractC3438s3.f());
        }
    }

    @Override // com.ironsource.AbstractC3388p3, com.ironsource.Q0
    public void a(AbstractC3438s3<?> abstractC3438s3) {
        super.a(abstractC3438s3);
        if (P().o()) {
            if (this.R.compareAndSet(false, true)) {
                O().b();
                U();
            } else {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            }
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f38095o.b(), str, this.M);
    }
}
