package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f74062b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f74063c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f74064e;

    static {
        i iVar = new i("FILL", 0);
        f74062b = iVar;
        i iVar2 = new i("FIT", 1);
        f74063c = iVar2;
        f74064e = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f74064e.clone();
    }
}
