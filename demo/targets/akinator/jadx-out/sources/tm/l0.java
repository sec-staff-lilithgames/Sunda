package tm;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import tm.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 extends an.e implements an.a, um.k {
    public final AtomicBoolean A;
    public final g0 B;
    public final um.p C;
    public final um.p D;
    public final um.p E;
    public boolean F;
    public final um.a0 G;
    public final um.v H;
    public Integer I;

    /* renamed from: j, reason: collision with root package name */
    public final MutableContextWrapper f87076j;

    /* renamed from: k, reason: collision with root package name */
    public final g f87077k;

    /* renamed from: l, reason: collision with root package name */
    public an.e f87078l;

    /* renamed from: m, reason: collision with root package name */
    public an.e f87079m;

    /* renamed from: n, reason: collision with root package name */
    public um.t f87080n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f87081o;

    /* renamed from: p, reason: collision with root package name */
    public String f87082p;

    /* renamed from: q, reason: collision with root package name */
    public m0 f87083q;

    /* renamed from: r, reason: collision with root package name */
    public final sm.b f87084r;

    /* renamed from: s, reason: collision with root package name */
    public final qm.a f87085s;

    /* renamed from: t, reason: collision with root package name */
    public final float f87086t;

    /* renamed from: u, reason: collision with root package name */
    public final float f87087u;

    /* renamed from: v, reason: collision with root package name */
    public final float f87088v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f87089w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f87090x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f87091y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f87092z;

    public l0(Context context, e0 e0Var) {
        super(context);
        this.A = new AtomicBoolean(false);
        this.F = false;
        this.f87076j = new MutableContextWrapper(context);
        this.f87083q = e0Var.f87022g;
        this.f87085s = e0Var.f87017b;
        this.f87086t = e0Var.f87028m;
        this.f87087u = e0Var.f87029n;
        float f10 = e0Var.f87030o;
        this.f87088v = f10;
        this.f87089w = e0Var.f87031p;
        this.f87090x = e0Var.f87032q;
        this.f87091y = e0Var.f87033r;
        this.f87092z = e0Var.f87034s;
        sm.b bVar = e0Var.f87023h;
        this.f87084r = bVar;
        this.C = e0Var.f87024i;
        this.D = e0Var.f87025j;
        this.E = e0Var.f87026k;
        um.p pVar = e0Var.f87027l;
        g gVarBuild = new g.a(context.getApplicationContext(), e0Var.f87016a, new k0(this)).setBaseUrl(e0Var.f87018c).setProductLink(e0Var.f87019d).setAllowedNativeFeatures(e0Var.f87021f).setPageFinishedScript(e0Var.f87020e).build();
        this.f87077k = gVarBuild;
        addView(gVarBuild, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f10 > 0.0f) {
            um.v vVar = new um.v(null);
            this.H = vVar;
            vVar.attach(context, this, pVar);
            um.a0 a0Var = new um.a0(this, new f0(this));
            this.G = a0Var;
            a0Var.setTime(f10);
        }
        this.B = new g0(this);
        setCloseClickListener(this);
        if (bVar != null) {
            bVar.registerAdContainer(this);
            bVar.registerAdView(gVarBuild.getWebView());
        }
    }

    public static void b(an.e eVar) {
        if (eVar == null) {
            return;
        }
        eVar.removeAllViews();
        um.h0.removeFromParent(eVar);
    }

    public final void c(an.e eVar, boolean z10) {
        setCloseClickListener(this);
        eVar.setCloseStyle(this.C);
        eVar.setCountDownStyle(this.D);
        e(z10);
    }

    @Override // an.e
    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > d0.f87005a) {
            return true;
        }
        g gVar = this.f87077k;
        if (gVar.isReceivedJsError()) {
            return true;
        }
        if (this.f87090x || !gVar.isUseCustomClose()) {
            return super.canBeClosed();
        }
        return false;
    }

    @Override // um.k
    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    @Override // um.k
    public void clickHandleError() {
        setLoadingVisible(false);
    }

    @Override // um.k
    public void clickHandled() {
        setLoadingVisible(false);
    }

    public final void d(x xVar) {
        if (xVar == null) {
            return;
        }
        Activity activityPeekActivity = peekActivity();
        t.d("MraidView", "applyOrientation: %s", xVar);
        if (activityPeekActivity == null) {
            t.d("MraidView", "no any interacted activities", new Object[0]);
        } else {
            this.I = Integer.valueOf(activityPeekActivity.getRequestedOrientation());
            activityPeekActivity.setRequestedOrientation(xVar.obtainTargetActivityOrientation(activityPeekActivity));
        }
    }

    public void destroy() {
        Integer num;
        this.f87083q = null;
        this.f87081o = null;
        Activity activityPeekActivity = peekActivity();
        if (activityPeekActivity != null && (num = this.I) != null) {
            activityPeekActivity.setRequestedOrientation(num.intValue());
            this.I = null;
        }
        b(this.f87078l);
        b(this.f87079m);
        this.f87077k.destroy();
        um.a0 a0Var = this.G;
        if (a0Var != null) {
            a0Var.detach();
        }
    }

    public final void e(boolean z10) {
        boolean z11 = !z10 || this.f87090x;
        an.e eVar = this.f87078l;
        float f10 = this.f87087u;
        if (eVar != null) {
            eVar.setCloseVisibility(z11, f10);
            return;
        }
        an.e eVar2 = this.f87079m;
        if (eVar2 != null) {
            eVar2.setCloseVisibility(z11, f10);
        } else if (this.f87077k.isInterstitial()) {
            if (this.F) {
                f10 = 0.0f;
            }
            setCloseVisibility(z11, f10);
        }
    }

    public final void f() {
        if (this.f87077k.isOpenNotified() || !this.f87091y) {
            um.h0.onUiThread(new h0(this));
        } else {
            g();
        }
    }

    public final void g() {
        um.p pVarResolveDefCloseStyle = um.a.resolveDefCloseStyle(getContext(), this.C);
        this.f87077k.handleRedirectScreen(pVarResolveDefCloseStyle.getHorizontalPosition().intValue(), pVarResolveDefCloseStyle.getVerticalPosition().intValue());
    }

    public final void h() {
        m0 m0Var;
        if (this.A.getAndSet(true) || (m0Var = this.f87083q) == null) {
            return;
        }
        m0Var.onLoaded(this);
    }

    public void load(String str) {
        sm.b bVar = this.f87084r;
        if (bVar != null && str != null) {
            str = bVar.prepareCreativeForMeasure(str);
        }
        int i10 = j0.f87072a[this.f87085s.ordinal()];
        g gVar = this.f87077k;
        if (i10 == 1) {
            gVar.load(str);
            return;
        }
        if (i10 == 2) {
            this.f87082p = str;
            h();
        } else {
            if (i10 != 3) {
                return;
            }
            h();
            gVar.load(str);
        }
    }

    @Override // an.a
    public void onCloseClick() {
        f();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t.d("MraidView", "onConfigurationChanged: %s", um.h0.orientationToString(configuration.orientation));
        um.h0.onUiThread(new i0(this));
    }

    @Override // an.a
    public void onCountDownFinish() {
        if (!this.f87077k.isOpenNotified() && this.f87092z && this.f87088v == 0.0f) {
            g();
        }
    }

    public Activity peekActivity() {
        WeakReference weakReference = this.f87081o;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public Context peekContext() {
        Activity activityPeekActivity = peekActivity();
        return activityPeekActivity == null ? getContext() : activityPeekActivity;
    }

    public void setLastInteractedActivity(Activity activity) {
        if (activity != null) {
            this.f87081o = new WeakReference(activity);
            this.f87076j.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z10) {
        if (!z10) {
            um.t tVar = this.f87080n;
            if (tVar != null) {
                tVar.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f87080n == null) {
            um.t tVar2 = new um.t(null);
            this.f87080n = tVar2;
            tVar2.attach(getContext(), this, this.E);
        }
        this.f87080n.setVisibility(0);
        this.f87080n.bringToFront();
    }

    public void show(Activity activity) {
        int i10 = j0.f87072a[this.f87085s.ordinal()];
        g gVar = this.f87077k;
        if (i10 != 1) {
            float f10 = this.f87086t;
            g0 g0Var = this.B;
            if (i10 == 2) {
                if (gVar.isInterstitial()) {
                    setCloseClickListener(g0Var);
                    setCloseVisibility(true, f10);
                }
                gVar.load(this.f87082p);
                this.f87082p = null;
            } else if (i10 == 3) {
                if (gVar.isLoaded()) {
                    if (gVar.isInterstitial()) {
                        c(this, gVar.isUseCustomClose());
                    }
                } else if (gVar.isInterstitial()) {
                    setCloseClickListener(g0Var);
                    setCloseVisibility(true, f10);
                }
            }
        } else if (gVar.isInterstitial()) {
            c(this, gVar.isUseCustomClose());
        }
        gVar.show();
        setLastInteractedActivity(activity);
        d(gVar.getLastOrientationProperties());
    }
}
