package x6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f91749b;

    public c(d dVar) {
        this.f91749b = dVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f91749b.f91752c.post(runnable);
    }
}
