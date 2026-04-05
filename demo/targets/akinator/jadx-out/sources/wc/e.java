package wc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f90537b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f90538c;

    /* renamed from: e, reason: collision with root package name */
    public static final e f90539e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f90540f;

    static {
        e eVar = new e("ALLOWED", 0);
        f90537b = eVar;
        e eVar2 = new e("DENIED", 1);
        f90538c = eVar2;
        e eVar3 = new e("INDETERMINATE", 2);
        f90539e = eVar3;
        f90540f = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f90540f.clone();
    }
}
