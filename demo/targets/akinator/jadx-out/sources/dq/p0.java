package dq;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p0 implements k0, f0, h0, g0, m0, l0, l {

    /* renamed from: b, reason: collision with root package name */
    public final tq.b f52509b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f52510c = new CopyOnWriteArrayList();

    public p0(tq.b bVar) {
        this.f52509b = bVar;
    }

    @Override // dq.g0
    public void a(long j10, long j11, float f10) {
    }

    @Override // dq.l
    public void b() {
    }

    @Override // dq.k0
    public void l() {
        Iterator it = this.f52510c.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).b();
        }
    }

    public tq.b o() {
        return this.f52509b;
    }

    public abstract String p();

    @Override // dq.k0
    public void pause() {
        Iterator it = this.f52510c.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a();
        }
    }

    @Override // dq.m0
    public void a(String str) {
    }

    @Override // dq.f0
    public void b(Integer num) {
    }

    @Override // dq.f0
    public void a(Integer num) {
    }

    @Override // dq.k0
    public void a(long j10) {
        n0 n0Var = new n0(this);
        this.f52510c.add(n0Var);
        n0Var.a(j10);
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f52510c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a();
        }
        copyOnWriteArrayList.clear();
    }

    @Override // dq.l0
    public void e() {
    }

    @Override // dq.h0
    public void k() {
    }
}
