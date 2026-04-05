package yw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final t f96759b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f96760c;

    /* renamed from: e, reason: collision with root package name */
    public static final t f96761e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ t[] f96762f;

    static {
        t tVar = new t("DATA", 0);
        f96759b = tVar;
        t tVar2 = new t("ESCAPE", 1);
        f96760c = tVar2;
        t tVar3 = new t("INHERIT", 2);
        f96761e = tVar3;
        f96762f = new t[]{tVar, tVar2, tVar3};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f96762f.clone();
    }
}
