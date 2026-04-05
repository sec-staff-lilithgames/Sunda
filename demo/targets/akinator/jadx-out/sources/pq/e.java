package pq;

import android.content.Context;
import bp.oM.DwaEpyvxz;
import br.h0;
import br.k1;
import br.p1;
import br.z;
import dq.d0;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e implements pq.a {

    /* renamed from: a, reason: collision with root package name */
    public final cr.p f81628a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f81629b;

    /* renamed from: c, reason: collision with root package name */
    public final br.d f81630c;

    /* renamed from: d, reason: collision with root package name */
    public final g f81631d;

    /* renamed from: e, reason: collision with root package name */
    public final oq.b f81632e;

    /* renamed from: f, reason: collision with root package name */
    public final xq.h f81633f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f81634g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f81635h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f81636i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f81637j;

    /* renamed from: k, reason: collision with root package name */
    public yq.o f81638k;

    /* renamed from: l, reason: collision with root package name */
    public volatile i f81639l;

    /* renamed from: m, reason: collision with root package name */
    public volatile i f81640m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public final g f81641a;

        public a(g gVar) {
            this.f81641a = gVar;
        }

        @Override // pq.k
        public void a() {
            this.f81641a.a();
        }

        @Override // pq.k
        public void b() {
            e.this.e();
        }

        @Override // pq.k
        public void c() {
            this.f81641a.c();
        }

        @Override // pq.k
        public void d() {
            this.f81641a.onAdClicked();
        }

        @Override // pq.k
        public void e() {
            e eVar = e.this;
            if (((i) eVar.f81634g.peek()) == null) {
                b();
            } else {
                eVar.h();
                ir.q.ifNotNull(eVar.f81639l, new b(eVar, 2));
            }
        }

        @Override // pq.k
        public void a(p1 p1Var) {
            this.f81641a.a(p1Var);
        }

        @Override // pq.k
        public void a(z zVar) {
            e eVar = e.this;
            if (eVar.f81633f.h()) {
                return;
            }
            eVar.f81631d.a(zVar);
        }
    }

    public e(Context context, br.d dVar, g gVar, oq.b bVar) {
        cr.p pVar = new cr.p("AdController");
        this.f81628a = pVar;
        this.f81633f = new xq.h(pVar.toString());
        this.f81629b = context.getApplicationContext();
        this.f81630c = dVar;
        this.f81631d = gVar;
        this.f81632e = bVar;
        this.f81634g = new ConcurrentLinkedQueue();
        this.f81635h = new AtomicBoolean(false);
        this.f81636i = new AtomicBoolean(false);
        this.f81637j = new AtomicBoolean(false);
    }

    @Override // pq.a
    public void a() {
        d0.b(this.f81628a, "destroy", new Object[0]);
        this.f81632e.a();
        c(this.f81639l);
        Iterator it = this.f81634g.iterator();
        while (it.hasNext()) {
            c((i) it.next());
        }
        this.f81634g.clear();
        ir.q.ifNotNull(this.f81638k, new pe.a(6));
        this.f81638k = null;
        this.f81633f.a();
    }

    @Override // pq.a
    public k1 b() {
        return this.f81630c.getOrientation();
    }

    @Override // pq.a
    public void c() {
        br.d dVar = this.f81630c;
        d0.b(this.f81628a, "load (cacheType - %s)", dVar.getCacheType());
        dq.k.b(this.f81629b);
        Queue<br.e> adPhaseParamsQueue = dVar.getAdPhaseParamsQueue();
        boolean zIsEmpty = adPhaseParamsQueue.isEmpty();
        g gVar = this.f81631d;
        if (zIsEmpty) {
            gVar.a(this, new h0("Ad phase queue is empty"));
            return;
        }
        if (l()) {
            gVar.b(this);
            return;
        }
        if (this.f81633f.c()) {
            for (br.e eVar : adPhaseParamsQueue) {
                cr.p pVar = new cr.p("AdPhaseController");
                this.f81634g.add(new m(this.f81629b, eVar, pVar, new xq.f(pVar.toString(), dq.q.f()), new d(this), this.f81632e));
            }
            int i10 = c.f81626a[dVar.getCacheType().ordinal()];
            if (i10 == 1) {
                g();
                return;
            }
            if (i10 == 2) {
                cr.q.onUiThread(new bq.c(7, this, dVar.getPlaceholderParams()));
                g();
            } else {
                if (i10 != 3) {
                    return;
                }
                cr.q.onUiThread(new bq.c(7, this, dVar.getPlaceholderParams()));
            }
        }
    }

    public final void e() {
        g gVar = this.f81631d;
        Objects.requireNonNull(gVar);
        cq.b bVar = new cq.b(gVar, 1);
        i iVar = this.f81639l;
        if (iVar == null) {
            bVar.run();
        } else {
            iVar.a(true);
            this.f81632e.a(iVar.e(), br.i.Disappear, false, (Runnable) null, (Runnable) bVar);
        }
    }

    @Override // pq.a
    public void f() {
        d0.b(this.f81628a, "performHide", new Object[0]);
        ir.q.ifNotNull(this.f81639l, new pe.a(7));
        yq.o oVar = this.f81638k;
        if (oVar != null && this.f81637j.compareAndSet(true, false)) {
            oVar.i();
            this.f81631d.b(oVar);
        }
    }

    public final void g() {
        if (this.f81635h.compareAndSet(false, true)) {
            Iterator it = this.f81634g.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                d0.b(this.f81628a, "loadAdPhase (%s)", iVar);
                iVar.c();
            }
        }
    }

    public final void h() {
        if (this.f81636i.compareAndSet(false, true)) {
            this.f81631d.d();
            this.f81640m = this.f81639l;
            i iVar = (i) this.f81634g.peek();
            if (iVar == null) {
                ir.q.ifNotNull(this.f81640m == null ? new h0("No ad phase to show") : null, new ks.s(18, this, this.f81640m));
                e();
            } else {
                if (this.f81640m != iVar) {
                    this.f81634g.remove(iVar);
                    iVar.a(new a(this.f81631d));
                    this.f81639l = iVar;
                    this.f81632e.a(iVar.e(), br.i.Appear);
                }
                this.f81631d.a(iVar);
                yq.o oVar = this.f81638k;
                if (oVar != null && this.f81637j.compareAndSet(true, false)) {
                    oVar.i();
                    this.f81631d.b(oVar);
                }
            }
            this.f81636i.set(false);
        }
    }

    public boolean l() {
        return this.f81633f.b();
    }

    @Override // pq.a
    public void onShown() {
        d0.b(this.f81628a, "onShown", new Object[0]);
        ir.q.ifNotNull(this.f81639l, new b(this, 1));
    }

    public String toString() {
        return this.f81628a.toString();
    }

    @Override // pq.a
    public boolean d() {
        d0.b(this.f81628a, DwaEpyvxz.EyCAEKOoeDlF, new Object[0]);
        this.f81633f.l();
        i iVar = this.f81639l;
        if (iVar != null) {
            if (this.f81633f.m()) {
                iVar.d();
            }
            return true;
        }
        yq.o oVar = this.f81638k;
        if (oVar != null && this.f81637j.compareAndSet(false, true)) {
            this.f81631d.a(oVar);
            oVar.j();
        }
        g();
        return false;
    }

    public final void c(i iVar) {
        d0.b(this.f81628a, "destroyAdPhaseController (%s)", iVar);
        ir.q.ifNotNull(iVar, new pe.a(5));
        if (this.f81639l == iVar) {
            this.f81639l = null;
        }
        if (this.f81640m == iVar) {
            this.f81640m = null;
        }
    }
}
