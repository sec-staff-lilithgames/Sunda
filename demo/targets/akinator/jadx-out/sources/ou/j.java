package ou;

import fu.f0;
import fu.l;
import fu.v0;
import java.util.concurrent.Executor;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f79848a = mu.a.initSingleScheduler(new i());

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f79849b = mu.a.initComputationScheduler(new c());

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f79850c = mu.a.initIoScheduler(new d());

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f79851d = v0.instance();

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f79852e = mu.a.initNewThreadScheduler(new g());

    public static m0 computation() {
        return mu.a.onComputationScheduler(f79849b);
    }

    public static m0 from(Executor executor) {
        return new l(executor, false);
    }

    public static m0 io() {
        return mu.a.onIoScheduler(f79850c);
    }

    public static m0 newThread() {
        return mu.a.onNewThreadScheduler(f79852e);
    }

    public static void shutdown() {
        computation().shutdown();
        io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        f0.shutdown();
    }

    public static m0 single() {
        return mu.a.onSingleScheduler(f79848a);
    }

    public static void start() {
        computation().start();
        io().start();
        newThread().start();
        single().start();
        trampoline().start();
        f0.start();
    }

    public static m0 trampoline() {
        return f79851d;
    }

    public static m0 from(Executor executor, boolean z10) {
        return new l(executor, z10);
    }
}
