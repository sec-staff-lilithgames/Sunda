package oh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f79386b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f79387c;

    static {
        c cVar = new c("INSTANCE", 0);
        f79386b = cVar;
        f79387c = new c[]{cVar};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f79387c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Funnels.integerFunnel()";
    }

    @Override // oh.a
    public void funnel(Integer num, p pVar) {
        num.getClass();
        pVar.c();
    }
}
