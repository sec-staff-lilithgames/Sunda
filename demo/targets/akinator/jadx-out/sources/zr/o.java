package zr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f98504b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f98505c;

    /* renamed from: e, reason: collision with root package name */
    public static final o f98506e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f98507f;

    static {
        o oVar = new o("ALPN_AND_NPN", 0);
        f98504b = oVar;
        o oVar2 = new o("NPN", 1);
        f98505c = oVar2;
        o oVar3 = new o("NONE", 2);
        f98506e = oVar3;
        f98507f = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f98507f.clone();
    }
}
