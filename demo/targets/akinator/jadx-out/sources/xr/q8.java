package xr;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q8 extends wr.j {

    /* renamed from: b, reason: collision with root package name */
    public final String f92925b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u8 f92927d;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f92924a = new AtomicReference(u8.f93095r0);

    /* renamed from: c, reason: collision with root package name */
    public final h8 f92926c = new h8(this);

    public q8(u8 u8Var, String str) {
        this.f92927d = u8Var;
        this.f92925b = (String) mh.p1.checkNotNull(str, "authority");
    }

    public final wr.p a(wr.k4 k4Var, wr.i iVar) {
        wr.j2 j2Var = (wr.j2) this.f92924a.get();
        h8 h8Var = this.f92926c;
        if (j2Var == null) {
            return h8Var.newCall(k4Var, iVar);
        }
        if (!(j2Var instanceof e9)) {
            return new s7(j2Var, h8Var, this.f92927d.f93119l, k4Var, iVar);
        }
        f9 f9Var = ((e9) j2Var).f92469b;
        d9 d9Var = (d9) f9Var.f92508b.get(k4Var.getFullMethodName());
        if (d9Var == null) {
            d9Var = (d9) f9Var.f92509c.get(k4Var.getServiceName());
        }
        if (d9Var == null) {
            d9Var = f9Var.f92507a;
        }
        if (d9Var != null) {
            iVar = iVar.withOption(d9.f92427g, d9Var);
        }
        return h8Var.newCall(k4Var, iVar);
    }

    @Override // wr.j
    public String authority() {
        return this.f92925b;
    }

    public final void b(wr.j2 j2Var) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f92924a;
        wr.j2 j2Var2 = (wr.j2) atomicReference.get();
        atomicReference.set(j2Var);
        if (j2Var2 != u8.f93095r0 || (linkedHashSet = this.f92927d.I) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((p8) it.next()).d();
        }
    }

    @Override // wr.j
    public <ReqT, RespT> wr.p newCall(wr.k4 k4Var, wr.i iVar) {
        u8 u8Var = this.f92927d;
        wr.u6 u6Var = u8Var.f93126s;
        AtomicReference atomicReference = this.f92924a;
        Object obj = atomicReference.get();
        a7 a7Var = u8.f93095r0;
        if (obj != a7Var) {
            return a(k4Var, iVar);
        }
        u6Var.execute(new k8(this));
        if (atomicReference.get() != a7Var) {
            return a(k4Var, iVar);
        }
        if (u8Var.N.get()) {
            return new l8();
        }
        p8 p8Var = new p8(this, wr.u0.current(), k4Var, iVar);
        u6Var.execute(new m8(this, p8Var));
        return p8Var;
    }
}
