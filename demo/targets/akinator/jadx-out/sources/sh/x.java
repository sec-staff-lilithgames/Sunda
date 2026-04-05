package sh;

import com.ironsource.C3191e4;
import j1.o2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class x extends o0 implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f85874l = 0;

    /* renamed from: j, reason: collision with root package name */
    public n1 f85875j;

    /* renamed from: k, reason: collision with root package name */
    public Object f85876k;

    public x(n1 n1Var, Object obj) {
        this.f85875j = (n1) mh.p1.checkNotNull(n1Var);
        this.f85876k = mh.p1.checkNotNull(obj);
    }

    @Override // sh.k
    public final void d() {
        k(this.f85875j);
        this.f85875j = null;
        this.f85876k = null;
    }

    @Override // sh.k
    public final String l() {
        String str;
        n1 n1Var = this.f85875j;
        Object obj = this.f85876k;
        String strL = super.l();
        if (n1Var != null) {
            str = "inputFuture=[" + n1Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strL != null) {
                return o2.l(str, strL);
            }
            return null;
        }
        return str + "function=[" + obj + C3191e4.i.f36531e;
    }

    public abstract Object n(Object obj, Object obj2);

    public abstract void o(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var = this.f85875j;
        Object obj = this.f85876k;
        if ((isCancelled() | (n1Var == null)) || (obj == null)) {
            return;
        }
        this.f85875j = null;
        if (n1Var.isCancelled()) {
            setFuture(n1Var);
            return;
        }
        try {
            try {
                Object objN = n(obj, b1.getDone(n1Var));
                this.f85876k = null;
                o(objN);
            } catch (Throwable th2) {
                try {
                    mh.p1.checkNotNull(th2);
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    setException(th2);
                } finally {
                    this.f85876k = null;
                }
            }
        } catch (Error e10) {
            setException(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            setException(e11.getCause());
        } catch (Exception e12) {
            setException(e12);
        }
    }
}
