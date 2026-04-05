package a2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 extends CoroutineDispatcher {

    /* renamed from: o, reason: collision with root package name */
    public static final a f3753o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final tu.o f3754p = tu.q.lazy(n1.f3732e);

    /* renamed from: q, reason: collision with root package name */
    public static final o1 f3755q = new o1();

    /* renamed from: e, reason: collision with root package name */
    public final Choreographer f3756e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3757f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3762k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3763l;

    /* renamed from: n, reason: collision with root package name */
    public final v1 f3765n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3758g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final uu.u f3759h = new uu.u();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3760i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3761j = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final q1 f3764m = new q1(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final zu.m getCurrentThread() {
            if (r1.access$isMainThread()) {
                return getMain();
            }
            zu.m mVar = (zu.m) p1.f3755q.get();
            if (mVar != null) {
                return mVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final zu.m getMain() {
            return (zu.m) p1.f3754p.getValue();
        }
    }

    public p1(Choreographer choreographer, Handler handler, kotlin.jvm.internal.u uVar) {
        this.f3756e = choreographer;
        this.f3757f = handler;
        this.f3765n = new v1(choreographer);
    }

    public static final void access$performFrameDispatch(p1 p1Var, long j10) {
        synchronized (p1Var.f3758g) {
            if (p1Var.f3763l) {
                p1Var.f3763l = false;
                ArrayList arrayList = p1Var.f3760i;
                p1Var.f3760i = p1Var.f3761j;
                p1Var.f3761j = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j10);
                }
                arrayList.clear();
            }
        }
    }

    public static final void access$performTrampolineDispatch(p1 p1Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (p1Var.f3758g) {
                runnable = (Runnable) p1Var.f3759h.removeFirstOrNull();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (p1Var.f3758g) {
                    runnable = (Runnable) p1Var.f3759h.removeFirstOrNull();
                }
            }
            synchronized (p1Var.f3758g) {
                if (p1Var.f3759h.isEmpty()) {
                    z10 = false;
                    p1Var.f3762k = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(zu.m context, Runnable block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        synchronized (this.f3758g) {
            this.f3759h.addLast(block);
            if (!this.f3762k) {
                this.f3762k = true;
                this.f3757f.post(this.f3764m);
                if (!this.f3763l) {
                    this.f3763l = true;
                    this.f3756e.postFrameCallback(this.f3764m);
                }
            }
        }
    }

    public final Choreographer getChoreographer() {
        return this.f3756e;
    }

    public final p0.d2 getFrameClock() {
        return this.f3765n;
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        synchronized (this.f3758g) {
            this.f3760i.add(callback);
            if (!this.f3763l) {
                this.f3763l = true;
                this.f3756e.postFrameCallback(this.f3764m);
            }
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        synchronized (this.f3758g) {
            this.f3760i.remove(callback);
        }
    }
}
