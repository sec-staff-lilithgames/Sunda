package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f72148b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f72149c;

    /* renamed from: e, reason: collision with root package name */
    public static final q f72150e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q[] f72151f;

    static {
        q qVar = new q("Cursor", 0);
        f72148b = qVar;
        q qVar2 = new q("SelectionStart", 1);
        f72149c = qVar2;
        q qVar3 = new q("SelectionEnd", 2);
        f72150e = qVar3;
        f72151f = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f72151f.clone();
    }
}
