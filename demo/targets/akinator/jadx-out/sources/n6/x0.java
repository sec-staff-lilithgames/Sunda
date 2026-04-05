package n6;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f75806b;

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f75807c;

    /* renamed from: e, reason: collision with root package name */
    public static final x0 f75808e;

    /* renamed from: f, reason: collision with root package name */
    public static final x0 f75809f;

    /* renamed from: g, reason: collision with root package name */
    public static final x0 f75810g;

    /* renamed from: h, reason: collision with root package name */
    public static final x0 f75811h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x0[] f75812i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75813j;

    static {
        x0 x0Var = new x0("ENQUEUED", 0);
        f75806b = x0Var;
        x0 x0Var2 = new x0(DebugCoroutineInfoImplKt.RUNNING, 1);
        f75807c = x0Var2;
        x0 x0Var3 = new x0("SUCCEEDED", 2);
        f75808e = x0Var3;
        x0 x0Var4 = new x0("FAILED", 3);
        f75809f = x0Var4;
        x0 x0Var5 = new x0("BLOCKED", 4);
        f75810g = x0Var5;
        x0 x0Var6 = new x0("CANCELLED", 5);
        f75811h = x0Var6;
        x0[] x0VarArr = {x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6};
        f75812i = x0VarArr;
        f75813j = cv.b.enumEntries(x0VarArr);
    }

    public static cv.a getEntries() {
        return f75813j;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f75812i.clone();
    }

    public final boolean isFinished() {
        return this == f75808e || this == f75809f || this == f75811h;
    }
}
