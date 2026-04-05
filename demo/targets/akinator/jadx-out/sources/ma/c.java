package ma;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f74124b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f74125c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f74126e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f74127f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f74128g;

    static {
        c cVar = new c("FULL_MUSIC", 0);
        f74124b = cVar;
        c cVar2 = new c("SHORT_MUSIC", 1);
        f74125c = cVar2;
        c cVar3 = new c("NO_CHANGE", 2);
        f74126e = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f74127f = cVarArr;
        f74128g = cv.b.enumEntries(cVarArr);
    }

    public static cv.a getEntries() {
        return f74128g;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f74127f.clone();
    }
}
