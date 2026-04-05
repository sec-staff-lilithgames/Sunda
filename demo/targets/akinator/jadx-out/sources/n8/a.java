package n8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f75823b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f75824c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f75825e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f75826f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f75827g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a[] f75828h;

    static {
        a aVar = new a("LOCAL", 0);
        f75823b = aVar;
        a aVar2 = new a("REMOTE", 1);
        f75824c = aVar2;
        a aVar3 = new a("DATA_DISK_CACHE", 2);
        f75825e = aVar3;
        a aVar4 = new a("RESOURCE_DISK_CACHE", 3);
        f75826f = aVar4;
        a aVar5 = new a("MEMORY_CACHE", 4);
        f75827g = aVar5;
        f75828h = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f75828h.clone();
    }
}
