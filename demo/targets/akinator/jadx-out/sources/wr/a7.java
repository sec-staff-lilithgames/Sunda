package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a7 {

    /* renamed from: b, reason: collision with root package name */
    public static final a7 f90810b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a7[] f90811c;

    static {
        a7 a7Var = new a7("NONE", 0);
        f90810b = a7Var;
        f90811c = new a7[]{a7Var, new a7("OPTIONAL", 1), new a7("REQUIRE", 2)};
    }

    public static a7 valueOf(String str) {
        return (a7) Enum.valueOf(a7.class, str);
    }

    public static a7[] values() {
        return (a7[]) f90811c.clone();
    }
}
