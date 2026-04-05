package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b7 {

    /* renamed from: b, reason: collision with root package name */
    public static final b7 f90837b;

    /* renamed from: c, reason: collision with root package name */
    public static final b7 f90838c;

    /* renamed from: e, reason: collision with root package name */
    public static final b7 f90839e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b7[] f90840f;

    static {
        b7 b7Var = new b7("FAKE", 0);
        f90837b = b7Var;
        b7 b7Var2 = new b7("MTLS", 1);
        f90838c = b7Var2;
        b7 b7Var3 = new b7("CUSTOM_MANAGERS", 2);
        f90839e = b7Var3;
        f90840f = new b7[]{b7Var, b7Var2, b7Var3};
    }

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) f90840f.clone();
    }
}
