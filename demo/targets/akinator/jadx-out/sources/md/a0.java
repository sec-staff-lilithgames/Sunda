package md;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f74254b;

    public a0(ExecutorService executorService) {
        this.f74254b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f74254b.execute(new z(runnable));
    }
}
