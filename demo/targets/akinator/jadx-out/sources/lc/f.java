package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f73104b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f73105c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f73106e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f73107f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f73108g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f73109h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f[] f73110i;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("Array", 0);
        f fVar2 = new f("Object", 1);
        f fVar3 = new f("Integer", 2);
        f73104b = fVar3;
        f fVar4 = new f("Float", 3);
        f73105c = fVar4;
        f fVar5 = new f("Boolean", 4);
        f73106e = fVar5;
        f fVar6 = new f("String", 5);
        f73107f = fVar6;
        f fVar7 = new f("Binary", 6);
        f fVar8 = new f("EmptyArray", 7);
        f73108g = fVar8;
        f fVar9 = new f("EmptyObject", 8);
        f fVar10 = new f("EmptyString", 9);
        f73109h = fVar10;
        f73110i = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f73110i.clone();
    }
}
