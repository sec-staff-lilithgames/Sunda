package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f91344b;

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f91345c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e1[] f91346e;

    static {
        e1 e1Var = new e1("Min", 0);
        f91344b = e1Var;
        e1 e1Var2 = new e1("Max", 1);
        f91345c = e1Var2;
        f91346e = new e1[]{e1Var, e1Var2};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f91346e.clone();
    }
}
