package kq;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import ar.g;
import br.d2;
import br.e1;
import br.f1;
import br.h0;
import br.r1;
import br.s1;
import cr.q;
import dq.d0;
import im.k;
import j1.o2;
import kotlin.jvm.internal.e0;
import lq.d;
import rw.hIT.uQjDr;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends eq.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f71945u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final g f71946s;

    /* renamed from: t, reason: collision with root package name */
    public lq.b f71947t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements d {
        public a() {
        }

        @Override // lq.d
        public void a(lq.b player, h0 error) {
            e0.checkNotNullParameter(player, "player");
            e0.checkNotNullParameter(error, "error");
            c.b(c.this, error);
        }

        @Override // lq.d
        public void b(lq.b player, h0 h0Var) {
            e0.checkNotNullParameter(player, "player");
            e0.checkNotNullParameter(h0Var, uQjDr.HnMZAJGNQqInpuS);
            c.a(c.this, h0Var);
        }

        @Override // lq.d
        public void c(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaPaused();
            }
            cVar.o().f();
        }

        @Override // lq.d
        public void d(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaSkipped();
            }
            cVar.o().d();
        }

        @Override // lq.d
        public void e(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaThirdQuartile();
            }
            cVar.o().c();
        }

        @Override // lq.d
        public void f(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onViewReady(player.n());
            }
            c.a(cVar).b(cVar);
        }

        @Override // lq.d
        public void g(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaStarted(player.g(), player.getVolume());
            }
            cVar.o().j();
        }

        @Override // lq.d
        public void h(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaMidpoint();
            }
            cVar.o().g();
        }

        @Override // lq.d
        public void i(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaCompleted();
            }
            cVar.o().a();
        }

        @Override // lq.d
        public void a(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaFirstQuartile();
            }
            cVar.o().i();
        }

        @Override // lq.d
        public void b(lq.b player) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            cVar.z();
            g gVar = cVar.f71946s;
            if (gVar != null) {
                gVar.onMediaResumed();
            }
            cVar.o().b();
        }

        @Override // lq.d
        public void a(lq.b player, long j10) {
            e0.checkNotNullParameter(player, "player");
            c.this.o().a(player.g(), j10);
        }

        @Override // lq.d
        public void a(lq.b player, float f10) {
            e0.checkNotNullParameter(player, "player");
            g gVar = c.this.f71946s;
            if (gVar != null) {
                gVar.onMediaVolumeChanged(f10);
            }
        }

        @Override // lq.d
        public void a(lq.b player, boolean z10) {
            e0.checkNotNullParameter(player, "player");
            c cVar = c.this;
            View viewJ = cVar.j();
            Integer numValueOf = viewJ != null ? Integer.valueOf(viewJ.getId()) : null;
            if (z10) {
                cVar.o().b(numValueOf);
            } else {
                cVar.o().a(numValueOf);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements vq.a {
        public b() {
        }

        @Override // vq.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Uri uri) {
            e0.checkNotNullParameter(uri, "uri");
            q.onUiThread(new k(23, c.this, uri));
        }

        @Override // vq.a
        public void onError(h0 error) {
            e0.checkNotNullParameter(error, "error");
            c.a(c.this, error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, vq.b repository, br.a adElementParams, eq.c adFormListener, tq.b eventCallback, rq.a aVar, g gVar) {
        super(context, repository, adElementParams, adFormListener, eventCallback, aVar);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f71946s = gVar;
    }

    public static final eq.c a(c cVar) {
        return cVar.f54991g;
    }

    public final void C() {
        q.onUiThread(new kq.a(this, 2));
    }

    @Override // eq.a, dq.h
    public void d() {
        q.onUiThread(new kq.a(this, 4));
    }

    @Override // dq.p0, dq.l0
    public void e() {
        q.onUiThread(new kq.a(this, 0));
    }

    @Override // eq.a, dq.h
    public void f() {
        super.f();
        q.onUiThread(new kq.a(this, 3));
    }

    @Override // dq.p0, dq.h0
    public void k() {
        q.onUiThread(new kq.a(this, 5));
    }

    @Override // eq.a
    public final void r() {
        x0 x0Var;
        g gVar = this.f71946s;
        if (gVar != null) {
            gVar.destroy(new kq.a(this, 1));
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            C();
        }
    }

    @Override // eq.a
    public View v() {
        lq.b bVar = this.f71947t;
        if (bVar != null) {
            return bVar.n();
        }
        return null;
    }

    @Override // eq.a
    public void w() {
        super.w();
        g gVar = this.f71946s;
        if (gVar != null) {
            gVar.onClicked();
        }
    }

    @Override // eq.a
    public void z() {
        super.z();
        g gVar = this.f71946s;
        if (gVar != null) {
            gVar.onShown();
        }
    }

    @Override // eq.a, dq.h
    public void a(ViewGroup viewGroup) {
        e0.checkNotNullParameter(viewGroup, "viewGroup");
        q.onUiThread(new bq.c(6, this, viewGroup));
    }

    @Override // dq.p0, dq.f0
    public void b(Integer num) {
        q.onUiThread(new kq.b(this, num, 0));
    }

    @Override // eq.a, dq.h
    public void c() {
        r1 resource = h().getResource();
        String source = null;
        s1 source2 = resource != null ? resource.getSource() : null;
        if (source2 == null) {
            source = h().getSource();
        } else if (source2 instanceof d2) {
            source = ((d2) source2).getUrl();
        } else {
            String message = "Invalid resource type (" + source2.getClass().getSimpleName() + "), it should be UrlResourceSource";
            e0.checkNotNullParameter(message, "message");
            d0.a(p(), message, new Object[0]);
        }
        e1 e1VarFromUrl = e1.f9819b.fromUrl(source);
        if (e1VarFromUrl != null) {
            q.onUiThread(new k(22, this, e1VarFromUrl.getDeliveryType() == f1.f9828c ? "exo" : h().getCustomParam("player")));
            this.f54989e.c(e1VarFromUrl, new b());
            return;
        }
        h0 h0Var = new h0(o2.f(')', "Invalid adm url (", source));
        g gVar = this.f71946s;
        if (gVar != null) {
            gVar.onError(h0Var);
        }
        this.f54991g.c(this, h0Var);
    }

    @Override // dq.p0, dq.f0
    public void a(Integer num) {
        q.onUiThread(new kq.b(this, num, 1));
    }

    @Override // dq.p0, dq.l
    public void b() {
        e();
    }

    public static final void a(c cVar, h0 h0Var) {
        g gVar = cVar.f71946s;
        if (gVar != null) {
            gVar.onError(h0Var);
        }
        cVar.f54991g.c(cVar, h0Var);
    }

    public static final void b(c cVar, h0 h0Var) {
        g gVar = cVar.f71946s;
        if (gVar != null) {
            gVar.onError(h0Var);
        }
        cVar.f54991g.a(cVar, h0Var);
    }
}
