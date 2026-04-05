package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f72161b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f72162c;

    /* renamed from: e, reason: collision with root package name */
    public static final r f72163e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r[] f72164f;

    static {
        r rVar = new r("None", 0);
        f72161b = rVar;
        r rVar2 = new r("Selection", 1);
        f72162c = rVar2;
        r rVar3 = new r("Cursor", 2);
        f72163e = rVar3;
        f72164f = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f72164f.clone();
    }
}
