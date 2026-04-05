package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f8736b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f8737c;

    /* renamed from: e, reason: collision with root package name */
    public static final k f8738e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f8739f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k[] f8740g;

    static {
        k kVar = new k("UNKNOWN", 0);
        f8736b = kVar;
        k kVar2 = new k("TRUE", 1);
        f8737c = kVar2;
        k kVar3 = new k("FALSE", 2);
        f8738e = kVar3;
        k kVar4 = new k("NULL", 3);
        f8739f = kVar4;
        f8740g = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f8740g.clone();
    }
}
