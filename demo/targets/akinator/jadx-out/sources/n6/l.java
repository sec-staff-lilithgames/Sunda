package n6;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final l f75753b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f75754c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75755e;

    static {
        l lVar = new l("INSTANCE", 0);
        f75753b = lVar;
        l[] lVarArr = {lVar};
        f75754c = lVarArr;
        f75755e = cv.b.enumEntries(lVarArr);
    }

    public static cv.a getEntries() {
        return f75755e;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f75754c.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        kotlin.jvm.internal.e0.checkNotNullParameter(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
