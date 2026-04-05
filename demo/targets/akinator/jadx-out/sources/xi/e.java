package xi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f92003b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f92004c;

    static {
        e eVar = new e("DEFAULT", 0);
        f92003b = eVar;
        f92004c = new e[]{eVar, new e("SIGNED", 1), new e("FIXED", 2)};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f92004c.clone();
    }
}
