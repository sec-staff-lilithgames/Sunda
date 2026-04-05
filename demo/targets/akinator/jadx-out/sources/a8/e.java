package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f4187b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f4188c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f4189e;

    static {
        e eVar = new e("NONE", 0);
        f4187b = eVar;
        e eVar2 = new e("ADD", 1);
        e eVar3 = new e("INVERT", 2);
        f4188c = eVar3;
        f4189e = new e[]{eVar, eVar2, eVar3, new e("LUMA", 3), new e("LUMA_INVERTED", 4), new e("UNKNOWN", 5)};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4189e.clone();
    }
}
