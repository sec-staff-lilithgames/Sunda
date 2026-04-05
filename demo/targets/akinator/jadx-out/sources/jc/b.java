package jc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f69264b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f69265c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f69266e;

    static {
        b bVar = new b("MANAGED_REFERENCE", 0);
        f69264b = bVar;
        b bVar2 = new b("BACK_REFERENCE", 1);
        f69265c = bVar2;
        f69266e = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f69266e.clone();
    }
}
