package androidx.recyclerview.widget;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7117a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7118b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f7119c;

    public f(Executor executor, Executor executor2, j0 j0Var) {
        this.f7117a = executor;
        this.f7118b = executor2;
        this.f7119c = j0Var;
    }

    public Executor getBackgroundThreadExecutor() {
        return this.f7118b;
    }

    public j0 getDiffCallback() {
        return this.f7119c;
    }

    public Executor getMainThreadExecutor() {
        return this.f7117a;
    }
}
