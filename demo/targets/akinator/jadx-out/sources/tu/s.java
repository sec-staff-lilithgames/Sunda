package tu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f87403b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f87404c;

    /* renamed from: e, reason: collision with root package name */
    public static final s f87405e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s[] f87406f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f87407g;

    static {
        s sVar = new s("SYNCHRONIZED", 0);
        f87403b = sVar;
        s sVar2 = new s("PUBLICATION", 1);
        f87404c = sVar2;
        s sVar3 = new s("NONE", 2);
        f87405e = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        f87406f = sVarArr;
        f87407g = cv.b.enumEntries(sVarArr);
    }

    public static cv.a getEntries() {
        return f87407g;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f87406f.clone();
    }
}
