package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h5 {

    /* renamed from: b, reason: collision with root package name */
    public static final h5 f90958b;

    /* renamed from: c, reason: collision with root package name */
    public static final h5 f90959c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h5[] f90960e;

    static {
        h5 h5Var = new h5("NONE", 0);
        f90958b = h5Var;
        h5 h5Var2 = new h5("INTEGRITY", 1);
        h5 h5Var3 = new h5("PRIVACY_AND_INTEGRITY", 2);
        f90959c = h5Var3;
        f90960e = new h5[]{h5Var, h5Var2, h5Var3};
    }

    public static h5 valueOf(String str) {
        return (h5) Enum.valueOf(h5.class, str);
    }

    public static h5[] values() {
        return (h5[]) f90960e.clone();
    }
}
