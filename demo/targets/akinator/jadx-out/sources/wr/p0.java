package wr;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f91083b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p0[] f91084c;

    static {
        p0 p0Var = new p0("INSTANCE", 0);
        f91083b = p0Var;
        f91084c = new p0[]{p0Var};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f91084c.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Context.DirectExecutor";
    }
}
