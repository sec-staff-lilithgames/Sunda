package sh;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import nh.ej;
import nh.og;
import nh.u4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class z extends c0 {

    /* renamed from: q, reason: collision with root package name */
    public static final m1 f85886q = new m1(z.class);

    /* renamed from: n, reason: collision with root package name */
    public u4 f85887n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f85888o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f85889p;

    public z(u4 u4Var, boolean z10, boolean z11) {
        int size = u4Var.size();
        this.f85786j = null;
        this.f85787k = size;
        this.f85887n = (u4) mh.p1.checkNotNull(u4Var);
        this.f85888o = z10;
        this.f85889p = z11;
    }

    @Override // sh.k
    public final void d() {
        u4 u4Var = this.f85887n;
        t(y.f85880b);
        if (isCancelled() && (u4Var != null)) {
            boolean zM = m();
            ej it = u4Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM);
            }
        }
    }

    @Override // sh.k
    public final String l() {
        u4 u4Var = this.f85887n;
        if (u4Var == null) {
            return super.l();
        }
        return "futures=" + u4Var;
    }

    public abstract void n(int i10, Object obj);

    public final void o(u4 u4Var) {
        int iB = c0.f85784l.B(this);
        int i10 = 0;
        mh.p1.checkState(iB >= 0, "Less than 0 remaining futures");
        if (iB == 0) {
            if (u4Var != null) {
                ej it = u4Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            n(i10, k2.getUninterruptibly(future));
                        } catch (ExecutionException e10) {
                            q(e10.getCause());
                        } catch (Throwable th2) {
                            q(th2);
                        }
                    }
                    i10++;
                }
            }
            this.f85786j = null;
            p();
            t(y.f85881c);
        }
    }

    public abstract void p();

    public final void q(Throwable th2) {
        mh.p1.checkNotNull(th2);
        if (this.f85888o && !setException(th2)) {
            Set set = this.f85786j;
            if (set == null) {
                Set setNewConcurrentHashSet = og.newConcurrentHashSet();
                mh.p1.checkNotNull(setNewConcurrentHashSet);
                if (!isCancelled()) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewConcurrentHashSet.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                c0.f85784l.x(this, setNewConcurrentHashSet);
                Set set2 = this.f85786j;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f85886q.a().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
            return;
        }
        if (th2 instanceof Error) {
            f85886q.a().log(Level.SEVERE, "Input Future failed with Error", th2);
        }
    }

    public final void r() {
        Objects.requireNonNull(this.f85887n);
        if (this.f85887n.isEmpty()) {
            p();
            return;
        }
        if (this.f85888o) {
            ej it = this.f85887n.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                n1 n1Var = (n1) it.next();
                int i11 = i10 + 1;
                if (n1Var.isDone()) {
                    s(i10, n1Var);
                } else {
                    n1Var.addListener(new androidx.browser.customtabs.h(this, i10, n1Var, 12), w1.directExecutor());
                }
                i10 = i11;
            }
            return;
        }
        u4 u4Var = this.f85887n;
        u4 u4Var2 = this.f85889p ? u4Var : null;
        on.z zVar = new on.z(11, this, u4Var2);
        ej it2 = u4Var.iterator();
        while (it2.hasNext()) {
            n1 n1Var2 = (n1) it2.next();
            if (n1Var2.isDone()) {
                o(u4Var2);
            } else {
                n1Var2.addListener(zVar, w1.directExecutor());
            }
        }
    }

    public final void s(int i10, n1 n1Var) {
        try {
            if (n1Var.isCancelled()) {
                this.f85887n = null;
                cancel(false);
            } else {
                try {
                    n(i10, k2.getUninterruptibly(n1Var));
                } catch (ExecutionException e10) {
                    q(e10.getCause());
                } catch (Throwable th2) {
                    q(th2);
                }
            }
        } finally {
            o(null);
        }
    }

    public abstract void t(y yVar);
}
