package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f91347b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f91348c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f1[] f91349e;

    static {
        f1 f1Var = new f1("Width", 0);
        f91347b = f1Var;
        f1 f1Var2 = new f1("Height", 1);
        f91348c = f1Var2;
        f91349e = new f1[]{f1Var, f1Var2};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f91349e.clone();
    }
}
