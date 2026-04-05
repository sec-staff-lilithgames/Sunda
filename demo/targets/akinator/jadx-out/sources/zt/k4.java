package zt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k4 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f98676b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k4[] f98677c;

    static {
        k4 k4Var = new k4("INSTANCE", 0);
        f98676b = k4Var;
        f98677c = new k4[]{k4Var};
    }

    public static <T> st.o instance() {
        return f98676b;
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) f98677c.clone();
    }

    @Override // st.o
    public tw.b apply(mt.y yVar) throws Exception {
        return new h4(yVar);
    }
}
