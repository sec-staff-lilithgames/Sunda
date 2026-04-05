package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f97616b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f97617c;

    /* renamed from: e, reason: collision with root package name */
    public static final k f97618e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f97619f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f97620g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k[] f97621h;

    static {
        k kVar = new k("MERGE", 0);
        f97616b = kVar;
        k kVar2 = new k("ADD", 1);
        f97617c = kVar2;
        k kVar3 = new k("SUBTRACT", 2);
        f97618e = kVar3;
        k kVar4 = new k("INTERSECT", 3);
        f97619f = kVar4;
        k kVar5 = new k("EXCLUDE_INTERSECTIONS", 4);
        f97620g = kVar5;
        f97621h = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    public static k forId(int i10) {
        k kVar = f97616b;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? kVar : f97620g : f97619f : f97618e : f97617c : kVar;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f97621h.clone();
    }
}
