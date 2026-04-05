package yb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f94288b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f94289c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f94290e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f94291f;

    static {
        c cVar = new c("ONLY_INCLUDE_ALL", 0);
        f94288b = cVar;
        c cVar2 = new c("INCLUDE_ALL_AND_PATH", 1);
        f94289c = cVar2;
        c cVar3 = new c("INCLUDE_NON_NULL", 2);
        f94290e = cVar3;
        f94291f = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f94291f.clone();
    }
}
