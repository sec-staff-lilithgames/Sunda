package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f55318b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f55319c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f55320e;

    static {
        a aVar = new a("On", 0);
        f55318b = aVar;
        a aVar2 = new a("Off", 1);
        f55319c = aVar2;
        f55320e = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f55320e.clone();
    }
}
