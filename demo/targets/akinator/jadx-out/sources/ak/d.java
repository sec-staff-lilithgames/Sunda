package ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f4432b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f4433c;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("LOW_POWER", 0);
        d dVar2 = new d("HIGH_SPEED", 1);
        f4432b = dVar2;
        f4433c = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4433c.clone();
    }
}
