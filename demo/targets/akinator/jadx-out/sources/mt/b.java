package mt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f74911b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f74912c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f74913e;

    static {
        b bVar = new b("MISSING", 0);
        f74911b = bVar;
        b bVar2 = new b("ERROR", 1);
        b bVar3 = new b("BUFFER", 2);
        f74912c = bVar3;
        f74913e = new b[]{bVar, bVar2, bVar3, new b("DROP", 3), new b("LATEST", 4)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f74913e.clone();
    }
}
