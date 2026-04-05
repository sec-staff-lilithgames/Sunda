package pj;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f81461a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f81462b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f81463c;

    public q(Executor executor, Executor executor2, Executor executor3) {
        this.f81463c = executor;
        this.f81461a = executor2;
        this.f81462b = executor3;
    }

    public Executor providesBackgroundExecutor() {
        return this.f81461a;
    }

    public Executor providesBlockingExecutor() {
        return this.f81462b;
    }

    public Executor providesLightWeightExecutor() {
        return this.f81463c;
    }
}
