package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f7096d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static ExecutorService f7097e;

    /* renamed from: a, reason: collision with root package name */
    public Executor f7098a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f7099b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f7100c;

    public e(j0 j0Var) {
        this.f7100c = j0Var;
    }

    public f build() {
        if (this.f7099b == null) {
            synchronized (f7096d) {
                try {
                    if (f7097e == null) {
                        f7097e = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f7099b = f7097e;
        }
        return new f(this.f7098a, this.f7099b, this.f7100c);
    }

    public e setBackgroundThreadExecutor(Executor executor) {
        this.f7099b = executor;
        return this;
    }

    public e setMainThreadExecutor(Executor executor) {
        this.f7098a = executor;
        return this;
    }
}
