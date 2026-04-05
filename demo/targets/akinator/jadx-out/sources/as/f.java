package as;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7949b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f7950c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f7951e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f7952f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f7953g;

    static {
        f fVar = new f("SPDY_SYN_STREAM", 0);
        f7949b = fVar;
        f fVar2 = new f("SPDY_REPLY", 1);
        f7950c = fVar2;
        f fVar3 = new f("SPDY_HEADERS", 2);
        f7951e = fVar3;
        f fVar4 = new f("HTTP_20_HEADERS", 3);
        f7952f = fVar4;
        f7953g = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f7953g.clone();
    }

    public boolean failIfHeadersAbsent() {
        return this == f7951e;
    }

    public boolean failIfHeadersPresent() {
        return this == f7950c;
    }

    public boolean failIfStreamAbsent() {
        return this == f7950c || this == f7951e;
    }

    public boolean failIfStreamPresent() {
        return this == f7949b;
    }
}
