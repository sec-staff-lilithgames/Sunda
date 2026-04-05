package androidx.lifecycle;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f6614b;

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f6615c;

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f6616e;

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f6617f;

    /* renamed from: g, reason: collision with root package name */
    public static final j0 f6618g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j0[] f6619h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cv.a f6620i;

    static {
        j0 j0Var = new j0("DESTROYED", 0);
        f6614b = j0Var;
        j0 j0Var2 = new j0("INITIALIZED", 1);
        f6615c = j0Var2;
        j0 j0Var3 = new j0(DebugCoroutineInfoImplKt.CREATED, 2);
        f6616e = j0Var3;
        j0 j0Var4 = new j0("STARTED", 3);
        f6617f = j0Var4;
        j0 j0Var5 = new j0("RESUMED", 4);
        f6618g = j0Var5;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
        f6619h = j0VarArr;
        f6620i = cv.b.enumEntries(j0VarArr);
    }

    public static cv.a getEntries() {
        return f6620i;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f6619h.clone();
    }

    public final boolean isAtLeast(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
