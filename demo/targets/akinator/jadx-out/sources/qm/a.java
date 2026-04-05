package qm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f83288b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f83289c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f83290e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f83291f;

    static {
        a aVar = new a("FullLoad", 0);
        f83288b = aVar;
        a aVar2 = new a("Stream", 1);
        f83289c = aVar2;
        a aVar3 = new a("PartialLoad", 2);
        f83290e = aVar3;
        f83291f = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f83291f.clone();
    }
}
