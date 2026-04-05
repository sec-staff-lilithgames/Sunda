package c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f11833b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f11834c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f11835e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f11836f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f11837g;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        f11833b = fVar;
        f fVar2 = new f("MEMORY", 1);
        f11834c = fVar2;
        f fVar3 = new f("DISK", 2);
        f11835e = fVar3;
        f fVar4 = new f("NETWORK", 3);
        f11836f = fVar4;
        f11837g = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f11837g.clone();
    }
}
