package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f83844b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f83845c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f83846e;

    static {
        a aVar = new a("AUTOMATIC", 0);
        f83844b = aVar;
        a aVar2 = new a("ENABLED", 1);
        f83845c = aVar2;
        f83846e = new a[]{aVar, aVar2, new a("DISABLED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f83846e.clone();
    }
}
