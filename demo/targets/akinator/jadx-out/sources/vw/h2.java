package vw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h2 {

    /* renamed from: b, reason: collision with root package name */
    public static final h2 f89874b;

    /* renamed from: c, reason: collision with root package name */
    public static final h2 f89875c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h2[] f89876e;

    /* JADX INFO: Fake field, exist only in values array */
    h2 EF0;

    static {
        h2 h2Var = new h2("TEXT", 0);
        h2 h2Var2 = new h2("ATTRIBUTE", 1);
        f89874b = h2Var2;
        h2 h2Var3 = new h2("ELEMENT", 2);
        f89875c = h2Var3;
        f89876e = new h2[]{h2Var, h2Var2, h2Var3};
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) f89876e.clone();
    }
}
