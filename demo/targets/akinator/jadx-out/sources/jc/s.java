package jc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f69407b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f69408c;

    /* JADX INFO: Fake field, exist only in values array */
    s EF0;

    static {
        s sVar = new s("NONE", 0);
        s sVar2 = new s("NULLS", 1);
        f69407b = sVar2;
        f69408c = new s[]{sVar, sVar2, new s("SCALARS", 2), new s("ALL", 3)};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f69408c.clone();
    }
}
