package yq;

import android.content.Context;
import android.widget.FrameLayout;
import cr.p;
import dq.d0;
import dq.q;
import dq.v;
import ir.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final p f94827b;

    /* renamed from: c, reason: collision with root package name */
    public final i f94828c;

    /* renamed from: e, reason: collision with root package name */
    public final pq.m f94829e;

    /* renamed from: f, reason: collision with root package name */
    public n f94830f;

    public o(Context context, br.e eVar, oq.b bVar) {
        super(context);
        this.f94827b = new p("PlaceholderView");
        br.e eVarA = eVar == null ? v.a() : eVar;
        p pVar = new p("PlaceholderViewAdPhaseController");
        this.f94829e = new pq.m(context, eVarA, pVar, new xq.f(pVar.toString(), q.f()), new l(this), bVar);
        i iVar = new i(context);
        this.f94828c = iVar;
        addView(iVar, t.createMatchParentParams());
        iVar.a();
    }

    public void b() {
        this.f94830f = null;
        this.f94829e.a();
        cr.q.onUiThread(new k(this, 2));
    }

    public void e() {
        d0.b(this.f94827b, "load", new Object[0]);
        this.f94829e.c();
    }

    public void h() {
        this.f94829e.onShown();
    }

    public void i() {
        this.f94829e.a(true);
    }

    public void j() {
        this.f94829e.d();
    }

    public void setListener(n nVar) {
        this.f94830f = nVar;
    }
}
