package sh;

import com.ironsource.C3191e4;
import j1.o2;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class c extends o0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f85780m = 0;

    /* renamed from: j, reason: collision with root package name */
    public n1 f85781j;

    /* renamed from: k, reason: collision with root package name */
    public Class f85782k;

    /* renamed from: l, reason: collision with root package name */
    public Object f85783l;

    public c(n1 n1Var, Class cls, Object obj) {
        this.f85781j = (n1) mh.p1.checkNotNull(n1Var);
        this.f85782k = (Class) mh.p1.checkNotNull(cls);
        this.f85783l = mh.p1.checkNotNull(obj);
    }

    @Override // sh.k
    public final void d() {
        k(this.f85781j);
        this.f85781j = null;
        this.f85782k = null;
        this.f85783l = null;
    }

    @Override // sh.k
    public final String l() {
        String str;
        n1 n1Var = this.f85781j;
        Class cls = this.f85782k;
        Object obj = this.f85783l;
        String strL = super.l();
        if (n1Var != null) {
            str = "inputFuture=[" + n1Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strL != null) {
                return o2.l(str, strL);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + C3191e4.i.f36531e;
    }

    public abstract Object n(Object obj, Throwable th2);

    public abstract void o(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var = this.f85781j;
        Class cls = this.f85782k;
        Object obj = this.f85783l;
        if (((obj == null) || ((n1Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f85781j = null;
        try {
            th = n1Var instanceof th.a ? th.b.tryInternalFastPathGetFailure((th.a) n1Var) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + n1Var.getClass() + " threw " + e10.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object done = th == null ? b1.getDone(n1Var) : null;
        if (th == null) {
            set(done);
            return;
        }
        if (!cls.isInstance(th)) {
            setFuture(n1Var);
            return;
        }
        try {
            Object objN = n(obj, th);
            this.f85782k = null;
            this.f85783l = null;
            o(objN);
        } catch (Throwable th3) {
            try {
                mh.p1.checkNotNull(th3);
                if (th3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                setException(th3);
            } finally {
                this.f85782k = null;
                this.f85783l = null;
            }
        }
    }
}
