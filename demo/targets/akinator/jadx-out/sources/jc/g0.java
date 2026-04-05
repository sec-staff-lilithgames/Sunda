package jc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f69294b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g0[] f69295c;

    /* JADX INFO: Fake field, exist only in values array */
    g0 EF0;

    static {
        g0 g0Var = new g0("JAVA_LANG_OBJECT", 0);
        g0 g0Var2 = new g0("OBJECT_AND_NON_CONCRETE", 1);
        f69294b = g0Var2;
        f69295c = new g0[]{g0Var, g0Var2, new g0("NON_CONCRETE_AND_ARRAYS", 2), new g0("NON_FINAL", 3), new g0("NON_FINAL_AND_ENUMS", 4), new g0("EVERYTHING", 5)};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f69295c.clone();
    }
}
