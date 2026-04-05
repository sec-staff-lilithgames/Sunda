package sh;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f85835b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l0[] f85836c;

    static {
        l0 l0Var = new l0("INSTANCE", 0);
        f85835b = l0Var;
        f85836c = new l0[]{l0Var};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f85836c.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
