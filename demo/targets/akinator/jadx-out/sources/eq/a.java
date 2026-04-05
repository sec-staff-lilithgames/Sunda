package eq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import br.l1;
import br.m1;
import br.o;
import br.p;
import br.t;
import cr.q;
import cr.u;
import dq.h;
import dq.j;
import dq.p0;
import dq.q0;
import ir.x;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a extends p0 implements h, View.OnClickListener, u {

    /* renamed from: r, reason: collision with root package name */
    public static final br.c[] f54988r;

    /* renamed from: e, reason: collision with root package name */
    public final vq.b f54989e;

    /* renamed from: f, reason: collision with root package name */
    public final br.a f54990f;

    /* renamed from: g, reason: collision with root package name */
    public final c f54991g;

    /* renamed from: h, reason: collision with root package name */
    public final rq.a f54992h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f54993i;

    /* renamed from: j, reason: collision with root package name */
    public final o f54994j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f54995k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f54996l;

    /* renamed from: m, reason: collision with root package name */
    public FrameLayout f54997m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f54998n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f54999o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f55000p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f55001q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: eq.a$a, reason: collision with other inner class name */
    public static final class C0557a {
        public C0557a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new C0557a(null);
        f54988r = new br.c[]{br.c.Image, br.c.Label};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, vq.b repository, br.a adElementParams, c adFormListener, tq.b eventCallback, rq.a aVar) {
        super(eventCallback);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f54989e = repository;
        this.f54990f = adElementParams;
        this.f54991g = adFormListener;
        this.f54992h = aVar;
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f54993i = applicationContext;
        o appearanceParams = adElementParams.getAppearanceParams();
        this.f54994j = appearanceParams;
        p background = appearanceParams.getBackground();
        this.f54995k = background != null ? dq.a.a(background, applicationContext, repository) : null;
        this.f54996l = new AtomicBoolean(false);
        this.f54999o = true;
        this.f55001q = this.f54999o;
    }

    public final void A() {
        rq.a aVar = this.f54992h;
        if (aVar != null) {
            aVar.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        View viewV = v();
        if (viewV == 0) {
            return false;
        }
        o oVar = this.f54994j;
        l1 padding = oVar.getPadding();
        if (padding != null && !padding.isZero()) {
            FrameLayout frameLayout = new FrameLayout(this.f54993i);
            frameLayout.setId(q.generateViewId());
            m1.setPadding(frameLayout, padding);
            frameLayout.addView(viewV, new FrameLayout.LayoutParams(-1, -1));
            this.f54997m = frameLayout;
        }
        View viewJ = j();
        if (viewJ == null) {
            return false;
        }
        viewJ.setId(q.generateViewId());
        viewJ.setTag(this.f54990f.getName());
        Boolean clickable = oVar.getClickable();
        if (clickable != null && clickable.booleanValue()) {
            viewJ.setOnClickListener(this);
        }
        Boolean visible = oVar.getVisible();
        if (visible != null) {
            setVisibility(visible.booleanValue());
        }
        if (viewV instanceof j) {
            ((j) viewV).a(oVar);
            return true;
        }
        c(viewV, this.f54995k);
        return true;
    }

    @Override // dq.h
    public /* bridge */ /* synthetic */ void a(ViewGroup viewGroup) {
        super.a(viewGroup);
    }

    @Override // dq.h
    public abstract /* synthetic */ void c();

    public void c(View view, q0 q0Var) {
        e0.checkNotNullParameter(view, "view");
        if (q0Var != null) {
            q0.a(q0Var, view, (Integer) null, (t) null, 6, (Object) null);
            return;
        }
        Integer backgroundColor = this.f54994j.getBackgroundColor();
        if (backgroundColor != null) {
            if (k0.contains(f54988r, this.f54990f.getAdElementType())) {
                return;
            }
            x.setBackgroundColorSafely(view, backgroundColor);
        }
    }

    @Override // dq.h
    public void d() {
        z();
    }

    @Override // dq.h
    public void f() {
        y();
    }

    @Override // dq.h
    public final br.a h() {
        return this.f54990f;
    }

    @Override // dq.h
    public boolean i() {
        return this.f55001q;
    }

    @Override // dq.h
    public View j() {
        FrameLayout frameLayout = this.f54997m;
        return frameLayout != null ? frameLayout : v();
    }

    @Override // cr.u
    public void lockVisibility(boolean z10) {
        setVisibility(z10);
        this.f55000p = true;
    }

    @Override // dq.h
    public void m() {
        w();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        w();
    }

    @Override // dq.p0
    public String p() {
        return this.f54990f.getName();
    }

    public final void q() {
        View viewV = v();
        if (viewV == null) {
            return;
        }
        if (this.f55001q && this.f54998n) {
            if (this.f54996l.compareAndSet(false, true)) {
                a(viewV);
            }
        } else if (this.f54996l.compareAndSet(true, false)) {
            A();
        }
    }

    public final o s() {
        return this.f54994j;
    }

    @Override // cr.u
    public void setVisibility(boolean z10) {
        this.f54999o = z10;
        if (this.f55000p) {
            return;
        }
        if (z10) {
            x.showViewSafely(j());
        } else {
            x.hideViewSafely(j());
        }
        this.f55001q = z10;
        q();
    }

    public final Context t() {
        return this.f54993i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("type - ");
        br.a aVar = this.f54990f;
        sb2.append(aVar.getAdElementType());
        sb2.append(", name - ");
        sb2.append(aVar.getName());
        return sb2.toString();
    }

    @Override // cr.u
    public void unlockVisibility() {
        this.f55000p = false;
        setVisibility(this.f54999o);
    }

    public abstract View v();

    public void w() {
        tq.b bVarO = o();
        View viewV = v();
        bVarO.a(viewV != null ? viewV.getId() : -1);
    }

    public final void y() {
        this.f54998n = false;
        q();
    }

    public void z() {
        this.f54998n = true;
        q();
    }

    public final void a(View view) {
        e0.checkNotNullParameter(view, "view");
        rq.a aVar = this.f54992h;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f54991g.a(this);
    }

    @Override // dq.p0, dq.h
    public void a() {
        super.a();
        rq.a aVar = this.f54992h;
        if (aVar != null) {
            aVar.c();
        }
        r();
    }

    public void r() {
    }
}
