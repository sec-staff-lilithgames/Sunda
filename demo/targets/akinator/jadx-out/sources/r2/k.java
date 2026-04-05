package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f83698b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f83699c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f83700e;

    static {
        k kVar = new k("Ltr", 0);
        f83698b = kVar;
        k kVar2 = new k("Rtl", 1);
        f83699c = kVar2;
        f83700e = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f83700e.clone();
    }
}
