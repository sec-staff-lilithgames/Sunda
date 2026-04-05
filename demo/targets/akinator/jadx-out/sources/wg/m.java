package wg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f90593b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f90594c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f90595e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f90596f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m[] f90597g;

    static {
        m mVar = new m("HIDING", 0);
        f90593b = mVar;
        m mVar2 = new m("HIDDEN", 1);
        f90594c = mVar2;
        m mVar3 = new m("SHOWING", 2);
        f90595e = mVar3;
        m mVar4 = new m("SHOWN", 3);
        f90596f = mVar4;
        f90597g = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f90597g.clone();
    }
}
