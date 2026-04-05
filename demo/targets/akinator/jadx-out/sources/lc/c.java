package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f73085b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f73086c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f73087e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f73088f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f73089g;

    static {
        c cVar = new c("Fail", 0);
        f73085b = cVar;
        c cVar2 = new c("TryConvert", 1);
        f73086c = cVar2;
        c cVar3 = new c("AsNull", 2);
        f73087e = cVar3;
        c cVar4 = new c("AsEmpty", 3);
        f73088f = cVar4;
        f73089g = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f73089g.clone();
    }
}
