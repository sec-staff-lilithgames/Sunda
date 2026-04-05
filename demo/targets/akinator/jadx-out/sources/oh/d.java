package oh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f79388b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f79389c;

    static {
        d dVar = new d("INSTANCE", 0);
        f79388b = dVar;
        f79389c = new d[]{dVar};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f79389c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Funnels.longFunnel()";
    }

    @Override // oh.a
    public void funnel(Long l9, p pVar) {
        l9.getClass();
        pVar.b();
    }
}
