package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f91512b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f91513c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f91514e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f91515f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m[] f91516g;

    static {
        m mVar = new m("UNRESTRICTED", 0);
        f91512b = mVar;
        m mVar2 = new m("CONSTANT", 1);
        m mVar3 = new m("SLACK", 2);
        f91513c = mVar3;
        m mVar4 = new m("ERROR", 3);
        f91514e = mVar4;
        m mVar5 = new m("UNKNOWN", 4);
        f91515f = mVar5;
        f91516g = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f91516g.clone();
    }
}
