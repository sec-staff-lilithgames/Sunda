package dq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f52581b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f52582c;

    /* renamed from: e, reason: collision with root package name */
    public static final y f52583e;

    /* renamed from: f, reason: collision with root package name */
    public static final y f52584f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y[] f52585g;

    static {
        y yVar = new y("TOP_BOTTOM", 0);
        f52581b = yVar;
        y yVar2 = new y("TR_BL", 1);
        y yVar3 = new y("RIGHT_LEFT", 2);
        f52582c = yVar3;
        y yVar4 = new y("BR_TL", 3);
        y yVar5 = new y("BOTTOM_TOP", 4);
        f52583e = yVar5;
        y yVar6 = new y("BL_TR", 5);
        y yVar7 = new y("LEFT_RIGHT", 6);
        f52584f = yVar7;
        f52585g = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, new y("TL_BR", 7)};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f52585g.clone();
    }
}
