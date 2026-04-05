package ub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f88184b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f88185c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f88186e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f88187f;

    static {
        a aVar = new a("PADDING_FORBIDDEN", 0);
        f88184b = aVar;
        a aVar2 = new a("PADDING_REQUIRED", 1);
        f88185c = aVar2;
        a aVar3 = new a("PADDING_ALLOWED", 2);
        f88186e = aVar3;
        f88187f = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f88187f.clone();
    }
}
