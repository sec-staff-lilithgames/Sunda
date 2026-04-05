package cq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import br.h0;
import br.k1;
import br.p1;
import br.z;
import cr.p;
import dq.d0;
import dq.q;
import dq.q0;
import ir.n;
import ir.t;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import oq.x;
import pq.g;
import yq.i;
import yq.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f50880m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final p f50881b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f50882c;

    /* renamed from: e, reason: collision with root package name */
    public final er.f f50883e;

    /* renamed from: f, reason: collision with root package name */
    public final xq.f f50884f;

    /* renamed from: g, reason: collision with root package name */
    public final pq.e f50885g;

    /* renamed from: h, reason: collision with root package name */
    public final i f50886h;

    /* renamed from: i, reason: collision with root package name */
    public final dq.f f50887i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f50888j;

    /* renamed from: k, reason: collision with root package name */
    public f f50889k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f50890l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f50891a;

        public a(e adView) {
            e0.checkNotNullParameter(adView, "adView");
            this.f50891a = new WeakReference(adView);
        }

        @Override // pq.g
        public void a(pq.a adController, h0 error) {
            e0.checkNotNullParameter(adController, "adController");
            e0.checkNotNullParameter(error, "error");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$onAdFailToLoad(eVar, error);
            }
        }

        @Override // pq.g
        public void b(pq.a adController) {
            e0.checkNotNullParameter(adController, "adController");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$onAdLoaded(eVar);
            }
        }

        @Override // pq.g
        public void c(pq.a adController) {
            e0.checkNotNullParameter(adController, "adController");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$notifyAdShown(eVar);
            }
        }

        @Override // pq.g
        public void d() {
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$onPreparingForShowStarted(eVar);
            }
        }

        @Override // pq.g
        public void e() {
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$notifyAdFailToShow(eVar, new h0("Ad loading timeout after display"));
                e.access$close(eVar);
            }
        }

        @Override // pq.g
        public void onAdClicked() {
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$notifyAdClicked(eVar);
            }
        }

        @Override // pq.g
        public void a(pq.a adController) {
            e0.checkNotNullParameter(adController, "adController");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$notifyAdExpired(eVar);
            }
        }

        @Override // pq.g
        public void b(o placeholderView) {
            e0.checkNotNullParameter(placeholderView, "placeholderView");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$hidePlaceholder(eVar, placeholderView);
            }
        }

        @Override // pq.g
        public void c() {
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$hideLoadingView(eVar);
            }
        }

        @Override // pq.g
        public void a(pq.i adPhaseController) {
            e0.checkNotNullParameter(adPhaseController, "adPhaseController");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$onPreparingForShowComplete(eVar, adPhaseController);
            }
        }

        @Override // pq.g
        public void b() {
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$close(eVar);
            }
        }

        @Override // pq.g
        public void a(pq.i iVar, h0 error) {
            e0.checkNotNullParameter(error, "error");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$onPreparingForShowFail(eVar, error);
            }
        }

        @Override // pq.g
        public void a(o placeholderView) {
            e0.checkNotNullParameter(placeholderView, "placeholderView");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$showPlaceholder(eVar, placeholderView);
            }
        }

        @Override // pq.g
        public void a() {
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$showLoadingView(eVar);
            }
        }

        @Override // pq.g
        public void a(p1 privacySheetParams) {
            e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$onOpenPrivacySheet(eVar, privacySheetParams);
            }
        }

        @Override // pq.g
        public void a(z brokenCreativeEvent) {
            e0.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            e eVar = (e) this.f50891a.get();
            if (eVar != null) {
                e.access$notifyBrokenCreativeEvent(eVar, brokenCreativeEvent);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements dq.b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f50892a;

        public b(e adView) {
            e0.checkNotNullParameter(adView, "adView");
            this.f50892a = new WeakReference(adView);
        }

        @Override // dq.b
        public void a() {
            e eVar = (e) this.f50892a.get();
            if (eVar != null) {
                eVar.a();
            }
        }

        @Override // dq.b
        public void b() {
            e eVar = (e) this.f50892a.get();
            if (eVar != null) {
                e.access$onViewOutOfScreen(eVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, br.d adParams) {
        q0 q0VarA;
        super(context);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adParams, "adParams");
        p pVar = new p("AdView");
        this.f50881b = pVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50882c = frameLayout;
        er.f fVar = new er.f(context);
        this.f50883e = fVar;
        addView(frameLayout, t.createMatchParentParams());
        addView(fVar, t.createMatchParentParams());
        q qVarA = q.f52511i.a();
        String string = pVar.toString();
        e0.checkNotNullExpressionValue(string, "tag.toString()");
        xq.f fVar2 = new xq.f(string, qVarA);
        this.f50884f = fVar2;
        xq.d dVarO = fVar2.o();
        this.f50885g = new pq.e(context, adParams, new a(this), new x(dVarO, qVarA));
        i iVar = new i(context);
        this.f50886h = iVar;
        addView(iVar, t.createMatchParentParams());
        iVar.a();
        this.f50887i = new dq.f(this, adParams.getVisibilityParams(), new b(this));
        br.p background = adParams.getBackground();
        if (background != null) {
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            Context applicationContext2 = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            q0VarA = dq.a.a(background, applicationContext, new vq.c(applicationContext2, dVarO, qVarA));
        } else {
            q0VarA = null;
        }
        this.f50888j = q0VarA;
        this.f50890l = false;
        setBackgroundColor(-16777216);
    }

    public static final void access$close(e eVar) {
        if (eVar.f50884f.j()) {
            d0.b(eVar.f50881b, "notifyAdFinished", new Object[0]);
            n.onUiThread(new cq.a(eVar, 1));
        }
    }

    public static final void access$hideLoadingView(e eVar) {
        eVar.f50886h.a();
    }

    public static final void access$hidePlaceholder(e eVar, o oVar) {
        d0.b(eVar.f50881b, "hidePlaceholder (%s)", oVar);
        n.onUiThread(new d(eVar, oVar));
    }

    public static final void access$notifyAdClicked(e eVar) {
        eVar.f50884f.e();
        d0.b(eVar.f50881b, "notifyAdClicked", new Object[0]);
        n.onUiThread(new cq.a(eVar, 2));
    }

    public static final void access$notifyAdExpired(e eVar) {
        if (eVar.f50884f.k()) {
            d0.b(eVar.f50881b, "notifyAdExpired", new Object[0]);
            n.onUiThread(new cq.a(eVar, 0));
        }
    }

    public static final void access$notifyAdFailToShow(e eVar, h0 h0Var) {
        if (eVar.f50884f.f()) {
            d0.a(eVar.f50881b, "notifyAdFailToShow - %s", h0Var);
            n.onUiThread(new c(eVar, h0Var, 0));
        }
    }

    public static final void access$notifyAdShown(e eVar) {
        if (eVar.f50884f.i()) {
            d0.b(eVar.f50881b, "notifyAdShown", new Object[0]);
            n.onUiThread(new cq.a(eVar, 4));
        }
    }

    public static final void access$notifyBrokenCreativeEvent(e eVar, z zVar) {
        if (eVar.f50884f.h()) {
            return;
        }
        n.onUiThread(new com.ironsource.environment.thread.a(17, eVar, zVar));
    }

    public static final void access$onAdFailToLoad(e eVar, h0 h0Var) {
        if (eVar.f50884f.a(false)) {
            d0.a(eVar.f50881b, "notifyAdFailToLoad - %s", h0Var);
            n.onUiThread(new c(eVar, h0Var, 1));
        }
    }

    public static final void access$onAdLoaded(e eVar) {
        if (eVar.f50884f.a(true)) {
            d0.b(eVar.f50881b, "notifyAdLoaded", new Object[0]);
            n.onUiThread(new cq.a(eVar, 3));
        }
    }

    public static final void access$onOpenPrivacySheet(e eVar, p1 p1Var) {
        d0.b(eVar.f50881b, "onOpenPrivacySheet", new Object[0]);
        n.onUiThread(new com.ironsource.environment.thread.a(18, eVar, p1Var));
    }

    public static final void access$onPreparingForShowComplete(e eVar, pq.i iVar) {
        d0.b(eVar.f50881b, "onPreparingForShowComplete", new Object[0]);
        n.onUiThread(new bq.c(2, iVar, eVar));
    }

    public static final void access$onPreparingForShowFail(e eVar, h0 h0Var) {
        d0.a(eVar.f50881b, "onPreparingForShowFail - %s", h0Var);
        h0 h0Var2 = new h0("No phase loaded");
        if (eVar.f50884f.f()) {
            d0.a(eVar.f50881b, "notifyAdFailToShow - %s", h0Var2);
            n.onUiThread(new c(eVar, h0Var2, 0));
        }
    }

    public static final void access$onPreparingForShowStarted(e eVar) {
        d0.b(eVar.f50881b, "onPreparingForShowStarted", new Object[0]);
    }

    public static final void access$onViewOutOfScreen(e eVar) {
        d0.b(eVar.f50881b, "onViewOutOfScreen", new Object[0]);
        eVar.b();
    }

    public static final void access$showLoadingView(e eVar) {
        eVar.f50886h.c();
    }

    public static final void access$showPlaceholder(e eVar, o oVar) {
        d0.b(eVar.f50881b, "showPlaceholder (%s)", oVar);
        n.onUiThread(new d(oVar, eVar));
    }

    public final void a() {
        p pVar = this.f50881b;
        d0.b(pVar, "onViewOnScreen", new Object[0]);
        pq.e eVar = this.f50885g;
        eVar.d();
        eVar.onShown();
        if (this.f50884f.b(true)) {
            d0.b(pVar, "notifyAdAppeared", new Object[0]);
            n.onUiThread(new cq.a(this, 6));
        }
    }

    public final void b() {
        this.f50887i.stop();
        this.f50885g.f();
        if (this.f50884f.b(false)) {
            d0.b(this.f50881b, "notifyAdDisappeared", new Object[0]);
            n.onUiThread(new cq.a(this, 5));
        }
    }

    public final void c() {
        if (this.f50890l && t.isViewVisible(this)) {
            this.f50884f.l();
            dq.f fVar = this.f50887i;
            fVar.start();
            if (fVar.b()) {
                a();
            }
        }
    }

    public final void destroy() {
        d0.b(this.f50881b, "destroy", new Object[0]);
        this.f50889k = null;
        this.f50885g.a();
        this.f50887i.a();
        n.onUiThread(new cq.b(this, 0));
        this.f50884f.a();
    }

    public final f getAdViewListener() {
        return this.f50889k;
    }

    public final k1 getRequiredOrientation() {
        return this.f50885g.b();
    }

    public final boolean isLoaded() {
        return this.f50884f.b();
    }

    public final void load() {
        e eVar;
        if (this.f50884f.c()) {
            q0 q0Var = this.f50888j;
            if (q0Var != null) {
                eVar = this;
                q0.a(q0Var, eVar, (Integer) null, (br.t) null, 6, (Object) null);
            } else {
                eVar = this;
            }
            eVar.f50885g.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d0.b(this.f50881b, "onAttachedToWindow", new Object[0]);
        this.f50890l = true;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d0.b(this.f50881b, "onDetachedFromWindow", new Object[0]);
        this.f50890l = false;
        b();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        e0.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        d0.b(this.f50881b, "onVisibilityChanged - %s", cr.q.toString(i10));
        if (cr.q.isViewVisible(i10)) {
            c();
        } else {
            b();
        }
    }

    public final void setAdViewListener(f fVar) {
        this.f50889k = fVar;
    }

    public final void setWatermark(Drawable drawable) {
        this.f50883e.setWatermark(drawable);
    }

    @Override // android.view.View
    public String toString() {
        String string = this.f50881b.toString();
        e0.checkNotNullExpressionValue(string, "tag.toString()");
        return string;
    }
}
