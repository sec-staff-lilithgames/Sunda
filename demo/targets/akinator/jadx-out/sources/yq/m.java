package yq;

import br.p1;
import br.z;
import cr.q;
import dq.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements pq.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f94826a;

    public m(o oVar) {
        this.f94826a = oVar;
    }

    @Override // pq.k
    public void a(p1 p1Var) {
    }

    @Override // pq.k
    public void b() {
        o oVar = this.f94826a;
        d0.b(oVar.f94827b, "notifyPlaceholderClosed", new Object[0]);
        q.onUiThread(new k(oVar, 0));
    }

    @Override // pq.k
    public void c() {
        this.f94826a.f94828c.a();
    }

    @Override // pq.k
    public void e() {
        o oVar = this.f94826a;
        d0.b(oVar.f94827b, "notifyPlaceholderClosed", new Object[0]);
        q.onUiThread(new k(oVar, 0));
    }

    @Override // pq.k
    public void a() {
        this.f94826a.f94828c.c();
    }

    @Override // pq.k
    public void a(z zVar) {
        o oVar = this.f94826a;
        d0.b(oVar.f94827b, "notifyBrokenCreativeEvent", new Object[0]);
        q.onUiThread(new on.z(24, oVar, zVar));
    }

    @Override // pq.k
    public void d() {
    }
}
