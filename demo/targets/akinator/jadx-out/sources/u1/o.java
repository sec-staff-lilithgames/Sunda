package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f87646b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f87647c;

    /* renamed from: e, reason: collision with root package name */
    public static final o f87648e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f87649f;

    static {
        o oVar = new o("Initial", 0);
        f87646b = oVar;
        o oVar2 = new o("Main", 1);
        f87647c = oVar2;
        o oVar3 = new o("Final", 2);
        f87648e = oVar3;
        f87649f = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f87649f.clone();
    }
}
