package sh;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class w0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f85873b;

    public w0(Runnable runnable) {
        this.f85873b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f85873b.run();
        return null;
    }
}
