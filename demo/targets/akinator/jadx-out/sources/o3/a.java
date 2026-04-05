package o3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f77422b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f77423c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f77424e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f77425f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f77426g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f77427h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f77428i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f77429j;

    /* JADX INFO: Fake field, exist only in values array */
    a EF1;

    static {
        a aVar = new a("CLEAR", 0);
        a aVar2 = new a("SRC", 1);
        a aVar3 = new a("DST", 2);
        a aVar4 = new a("SRC_OVER", 3);
        a aVar5 = new a("DST_OVER", 4);
        a aVar6 = new a("SRC_IN", 5);
        a aVar7 = new a("DST_IN", 6);
        a aVar8 = new a("SRC_OUT", 7);
        a aVar9 = new a("DST_OUT", 8);
        a aVar10 = new a("SRC_ATOP", 9);
        a aVar11 = new a("DST_ATOP", 10);
        a aVar12 = new a("XOR", 11);
        a aVar13 = new a("PLUS", 12);
        f77422b = aVar13;
        a aVar14 = new a("MODULATE", 13);
        f77423c = aVar14;
        a aVar15 = new a("SCREEN", 14);
        f77424e = aVar15;
        a aVar16 = new a("OVERLAY", 15);
        f77425f = aVar16;
        a aVar17 = new a("DARKEN", 16);
        f77426g = aVar17;
        a aVar18 = new a("LIGHTEN", 17);
        f77427h = aVar18;
        a aVar19 = new a("COLOR_DODGE", 18);
        a aVar20 = new a("COLOR_BURN", 19);
        a aVar21 = new a("HARD_LIGHT", 20);
        a aVar22 = new a("SOFT_LIGHT", 21);
        a aVar23 = new a("DIFFERENCE", 22);
        a aVar24 = new a("EXCLUSION", 23);
        a aVar25 = new a("MULTIPLY", 24);
        f77428i = aVar25;
        f77429j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, new a("HUE", 25), new a("SATURATION", 26), new a("COLOR", 27), new a("LUMINOSITY", 28)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f77429j.clone();
    }
}
