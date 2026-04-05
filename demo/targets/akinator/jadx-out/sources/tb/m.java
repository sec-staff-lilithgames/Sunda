package tb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f86748b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f86749c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f86750e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f86751f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m[] f86752g;

    static {
        m mVar = new m("DEFAULT", 0);
        f86748b = mVar;
        m mVar2 = new m("DELEGATING", 1);
        f86749c = mVar2;
        m mVar3 = new m("PROPERTIES", 2);
        f86750e = mVar3;
        m mVar4 = new m("DISABLED", 3);
        f86751f = mVar4;
        f86752g = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f86752g.clone();
    }
}
