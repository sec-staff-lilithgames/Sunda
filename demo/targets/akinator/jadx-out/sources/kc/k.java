package kc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f70791b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f70792c;

    /* renamed from: e, reason: collision with root package name */
    public static final k f70793e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f70794f;

    static {
        k kVar = new k("DYNAMIC", 0);
        f70791b = kVar;
        k kVar2 = new k("STATIC", 1);
        f70792c = kVar2;
        k kVar3 = new k("DEFAULT_TYPING", 2);
        f70793e = kVar3;
        f70794f = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f70794f.clone();
    }
}
