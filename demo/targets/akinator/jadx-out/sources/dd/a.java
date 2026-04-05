package dd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f51981b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f51982c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f51983e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f51984f;

    static {
        a aVar = new a("ALWAYS_NULL", 0);
        f51981b = aVar;
        a aVar2 = new a("CONSTANT", 1);
        f51982c = aVar2;
        a aVar3 = new a("DYNAMIC", 2);
        f51983e = aVar3;
        f51984f = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f51984f.clone();
    }
}
