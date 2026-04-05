package oh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f79384b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f79385c;

    static {
        b bVar = new b("INSTANCE", 0);
        f79384b = bVar;
        f79385c = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f79385c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Funnels.byteArrayFunnel()";
    }

    @Override // oh.a
    public void funnel(byte[] bArr, p pVar) {
        pVar.e();
    }
}
