package nh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h9 {

    /* renamed from: b, reason: collision with root package name */
    public static final f9 f76324b;

    /* renamed from: c, reason: collision with root package name */
    public static final g9 f76325c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h9[] f76326e;

    static {
        f9 f9Var = new f9();
        f76324b = f9Var;
        g9 g9Var = new g9();
        f76325c = g9Var;
        f76326e = new h9[]{f9Var, g9Var};
    }

    public static h9 valueOf(String str) {
        return (h9) Enum.valueOf(h9.class, str);
    }

    public static h9[] values() {
        return (h9[]) f76326e.clone();
    }

    public abstract mh.u0 a();
}
