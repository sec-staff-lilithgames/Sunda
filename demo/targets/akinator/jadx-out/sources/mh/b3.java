package mh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b3 implements a3 {

    /* renamed from: b, reason: collision with root package name */
    public static final b3 f74589b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b3[] f74590c;

    static {
        b3 b3Var = new b3("INSTANCE", 0);
        f74589b = b3Var;
        f74590c = new b3[]{b3Var};
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) f74590c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Suppliers.supplierFunction()";
    }

    @Override // mh.a3, mh.v0
    public Object apply(v2 v2Var) {
        return v2Var.get();
    }
}
