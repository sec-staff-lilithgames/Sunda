package z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f97560b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f97561c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f97562e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f97563f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f97564g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f[] f97565h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cv.a f97566i;

    static {
        f fVar = new f("ON_CONFIGURE", 0);
        f97560b = fVar;
        f fVar2 = new f("ON_CREATE", 1);
        f97561c = fVar2;
        f fVar3 = new f("ON_UPGRADE", 2);
        f97562e = fVar3;
        f fVar4 = new f("ON_DOWNGRADE", 3);
        f97563f = fVar4;
        f fVar5 = new f("ON_OPEN", 4);
        f97564g = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f97565h = fVarArr;
        f97566i = cv.b.enumEntries(fVarArr);
    }

    public static cv.a getEntries() {
        return f97566i;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f97565h.clone();
    }
}
