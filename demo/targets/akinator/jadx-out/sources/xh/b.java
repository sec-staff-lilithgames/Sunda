package xh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f91990b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f91991c;

    /* renamed from: e, reason: collision with root package name */
    public static final b f91992e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f91993f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f91994g;

    static {
        b bVar = new b("AD_STORAGE", 0);
        f91990b = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        f91991c = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        f91992e = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        f91993f = bVar4;
        f91994g = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f91994g.clone();
    }
}
