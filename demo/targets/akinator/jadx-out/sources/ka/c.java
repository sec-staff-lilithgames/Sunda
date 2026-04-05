package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f70701b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f70702c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f70703e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f70704f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f70705g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c[] f70706h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cv.a f70707i;

    static {
        c cVar = new c("CONFIANT", 0);
        f70701b = cVar;
        c cVar2 = new c("SEREIN_PLUS", 1);
        f70702c = cVar2;
        c cVar3 = new c("SEREIN_MOINS", 2);
        f70703e = cVar3;
        c cVar4 = new c("INQUIET_PLUS", 3);
        f70704f = cVar4;
        c cVar5 = new c("INQUIET_MOINS", 4);
        f70705g = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f70706h = cVarArr;
        f70707i = cv.b.enumEntries(cVarArr);
    }

    public static cv.a getEntries() {
        return f70707i;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f70706h.clone();
    }
}
