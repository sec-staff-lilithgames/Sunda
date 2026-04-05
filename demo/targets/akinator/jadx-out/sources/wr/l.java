package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f91017b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f91018c;

    /* renamed from: e, reason: collision with root package name */
    public static final l f91019e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f91020f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l[] f91021g;

    static {
        l lVar = new l("DEBUG", 0);
        f91017b = lVar;
        l lVar2 = new l("INFO", 1);
        f91018c = lVar2;
        l lVar3 = new l("WARNING", 2);
        f91019e = lVar3;
        l lVar4 = new l("ERROR", 3);
        f91020f = lVar4;
        f91021g = new l[]{lVar, lVar2, lVar3, lVar4};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f91021g.clone();
    }
}
