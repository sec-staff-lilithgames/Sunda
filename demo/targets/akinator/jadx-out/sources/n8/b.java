package n8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f75829b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f75830c;

    /* renamed from: e, reason: collision with root package name */
    public static final b f75831e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f75832f;

    static {
        b bVar = new b("PREFER_ARGB_8888", 0);
        f75829b = bVar;
        b bVar2 = new b("PREFER_RGB_565", 1);
        f75830c = bVar2;
        f75832f = new b[]{bVar, bVar2};
        f75831e = bVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f75832f.clone();
    }
}
