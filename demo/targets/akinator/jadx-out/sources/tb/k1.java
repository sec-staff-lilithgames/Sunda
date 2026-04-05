package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f86736b;

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f86737c;

    /* renamed from: e, reason: collision with root package name */
    public static final k1 f86738e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k1[] f86739f;

    static {
        k1 k1Var = new k1("TRUE", 0);
        f86736b = k1Var;
        k1 k1Var2 = new k1("FALSE", 1);
        f86737c = k1Var2;
        k1 k1Var3 = new k1("DEFAULT", 2);
        f86738e = k1Var3;
        f86739f = new k1[]{k1Var, k1Var2, k1Var3};
    }

    public static boolean equals(Boolean bool, Boolean bool2) {
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public static k1 fromBoolean(Boolean bool) {
        return bool == null ? f86738e : bool.booleanValue() ? f86736b : f86737c;
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f86739f.clone();
    }

    public Boolean asBoolean() {
        if (this == f86738e) {
            return null;
        }
        return this == f86736b ? Boolean.TRUE : Boolean.FALSE;
    }

    public boolean asPrimitive() {
        return this == f86736b;
    }
}
