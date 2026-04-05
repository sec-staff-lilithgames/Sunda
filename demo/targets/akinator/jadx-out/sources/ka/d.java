package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f70710b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f70711c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f70712e;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("LANCEMENT", 0);
        d dVar2 = new d("EXPLOSION", 1);
        f70710b = dVar2;
        d dVar3 = new d("FIN", 2);
        f70711c = dVar3;
        f70712e = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f70712e.clone();
    }
}
