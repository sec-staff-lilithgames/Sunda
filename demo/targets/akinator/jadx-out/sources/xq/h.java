package xq;

import ir.m;
import j1.o2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final m f92208a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f92209b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f92210c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f92211d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f92212e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f92213f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f92214g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f92215h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f92216i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f92217j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f92218k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f92219l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f92220m;

    public h(String parent) {
        e0.checkNotNullParameter(parent, "parent");
        this.f92208a = new m(o2.f(')', "DefaultAdState(", parent));
        this.f92209b = new AtomicBoolean(false);
        this.f92210c = new AtomicBoolean(false);
        this.f92211d = new AtomicBoolean(false);
        this.f92212e = new AtomicBoolean(false);
        this.f92213f = new AtomicBoolean(false);
        this.f92214g = new AtomicBoolean(false);
        this.f92215h = new AtomicBoolean(false);
        this.f92216i = new AtomicBoolean(false);
        this.f92217j = new AtomicBoolean(false);
        this.f92218k = new AtomicBoolean(false);
        this.f92219l = new AtomicBoolean(false);
        this.f92220m = new LinkedHashSet();
        a(new g(this));
    }

    @Override // xq.c
    public boolean b() {
        return this.f92209b.get() && !h();
    }

    @Override // xq.c
    public boolean c() {
        boolean zCompareAndSet = this.f92210c.compareAndSet(false, true);
        if (zCompareAndSet) {
            b(a.f92189b);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public boolean d() {
        return this.f92211d.get();
    }

    @Override // xq.c
    public boolean e() {
        boolean zCompareAndSet = this.f92216i.compareAndSet(false, true);
        if (zCompareAndSet) {
            b(a.f92195i);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public boolean f() {
        boolean zCompareAndSet = this.f92215h.compareAndSet(false, true);
        if (zCompareAndSet) {
            b(a.f92194h);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public boolean g() {
        return this.f92217j.get();
    }

    @Override // xq.c
    public boolean h() {
        return this.f92212e.get();
    }

    @Override // xq.c
    public boolean i() {
        boolean zCompareAndSet = this.f92214g.compareAndSet(false, true);
        if (zCompareAndSet) {
            b(a.f92193g);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public boolean j() {
        boolean zCompareAndSet = this.f92217j.compareAndSet(false, true);
        if (zCompareAndSet) {
            b(a.f92198l);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public boolean k() {
        boolean zCompareAndSet = this.f92219l.compareAndSet(false, true);
        if (zCompareAndSet) {
            b(a.f92199m);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public void l() {
        this.f92211d.set(true);
        b(a.f92192f);
    }

    @Override // xq.c
    public boolean m() {
        return this.f92214g.get();
    }

    @Override // xq.c
    public final void a(b observer) {
        e0.checkNotNullParameter(observer, "observer");
        if (h()) {
            return;
        }
        synchronized (this.f92220m) {
            this.f92220m.add(observer);
        }
    }

    @Override // xq.c
    public final void b(b observer) {
        e0.checkNotNullParameter(observer, "observer");
        synchronized (this.f92220m) {
            this.f92220m.remove(observer);
        }
    }

    @Override // xq.c
    public boolean b(boolean z10) {
        boolean zCompareAndSet = this.f92218k.compareAndSet(!z10, z10);
        if (zCompareAndSet) {
            b(z10 ? a.f92196j : a.f92197k);
        }
        return zCompareAndSet;
    }

    @Override // xq.c
    public boolean a(boolean z10) {
        boolean z11 = false;
        this.f92210c.set(false);
        this.f92209b.set(z10);
        if (this.f92213f.compareAndSet(false, true) && !h()) {
            z11 = true;
        }
        if (z11) {
            b(z10 ? a.f92190c : a.f92191e);
        }
        return z11;
    }

    public final void b(a aVar) {
        synchronized (this.f92220m) {
            Iterator it = this.f92220m.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(this, aVar);
            }
        }
    }

    @Override // xq.c
    public void a() {
        this.f92212e.set(true);
        this.f92209b.set(false);
        this.f92210c.set(false);
        this.f92211d.set(false);
        this.f92213f.set(false);
        this.f92214g.set(false);
        this.f92215h.set(false);
        this.f92216i.set(false);
        this.f92217j.set(false);
        this.f92218k.set(false);
        this.f92219l.set(false);
        b(a.f92200n);
        synchronized (this.f92220m) {
            this.f92220m.clear();
        }
    }
}
