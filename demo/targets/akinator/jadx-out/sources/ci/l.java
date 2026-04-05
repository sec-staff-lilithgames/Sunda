package ci;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final l f12350b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f12351c;

    static {
        l lVar = new l("INSTANCE", 0);
        f12350b = lVar;
        f12351c = new l[]{lVar};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f12351c.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
