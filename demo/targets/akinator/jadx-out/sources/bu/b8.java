package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b8 extends AtomicReference implements i8 {

    /* renamed from: b, reason: collision with root package name */
    public g8 f10121b;

    /* renamed from: c, reason: collision with root package name */
    public int f10122c;

    public b8() {
        g8 g8Var = new g8(null);
        this.f10121b = g8Var;
        set(g8Var);
    }

    public g8 b() {
        return (g8) get();
    }

    @Override // bu.i8
    public final void complete() {
        g8 g8Var = new g8(a(iu.u.complete()));
        this.f10121b.set(g8Var);
        this.f10121b = g8Var;
        this.f10122c++;
        e();
    }

    public abstract void d();

    public void e() {
        g8 g8Var = (g8) get();
        if (g8Var.f10355b != null) {
            g8 g8Var2 = new g8(null);
            g8Var2.lazySet(g8Var.get());
            set(g8Var2);
        }
    }

    @Override // bu.i8
    public final void error(Throwable th2) {
        g8 g8Var = new g8(a(iu.u.error(th2)));
        this.f10121b.set(g8Var);
        this.f10121b = g8Var;
        this.f10122c++;
        e();
    }

    @Override // bu.i8
    public final void next(Object obj) {
        g8 g8Var = new g8(a(iu.u.next(obj)));
        this.f10121b.set(g8Var);
        this.f10121b = g8Var;
        this.f10122c++;
        d();
    }

    @Override // bu.i8
    public final void replay(e8 e8Var) {
        if (e8Var.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            g8 g8VarB = (g8) e8Var.f10263e;
            if (g8VarB == null) {
                g8VarB = b();
                e8Var.f10263e = g8VarB;
            }
            while (!e8Var.isDisposed()) {
                g8 g8Var = (g8) g8VarB.get();
                if (g8Var == null) {
                    e8Var.f10263e = g8VarB;
                    iAddAndGet = e8Var.addAndGet(-iAddAndGet);
                } else {
                    if (iu.u.accept(c(g8Var.f10355b), e8Var.f10262c)) {
                        e8Var.f10263e = null;
                        return;
                    }
                    g8VarB = g8Var;
                }
            }
            e8Var.f10263e = null;
            return;
        } while (iAddAndGet != 0);
    }

    public Object a(Object obj) {
        return obj;
    }

    public Object c(Object obj) {
        return obj;
    }
}
