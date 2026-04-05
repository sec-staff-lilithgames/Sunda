package d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f51766b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f51767c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f51768e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f51769f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f51770g;

    static {
        f fVar = new f("FIXED", 0);
        f51766b = fVar;
        f fVar2 = new f("WRAP_CONTENT", 1);
        f51767c = fVar2;
        f fVar3 = new f("MATCH_CONSTRAINT", 2);
        f51768e = fVar3;
        f fVar4 = new f("MATCH_PARENT", 3);
        f51769f = fVar4;
        f51770g = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f51770g.clone();
    }
}
