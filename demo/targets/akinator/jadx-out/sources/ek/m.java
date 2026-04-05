package ek;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m implements wi.g {

    /* renamed from: c, reason: collision with root package name */
    public static final m f54581c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f54582e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f54583f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m[] f54584g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f54585h;

    /* renamed from: b, reason: collision with root package name */
    public final int f54586b;

    static {
        m mVar = new m("COLLECTION_UNKNOWN", 0, 0);
        m mVar2 = new m("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f54581c = mVar2;
        m mVar3 = new m("COLLECTION_ENABLED", 2, 2);
        f54582e = mVar3;
        m mVar4 = new m("COLLECTION_DISABLED", 3, 3);
        f54583f = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, new m("COLLECTION_DISABLED_REMOTE", 4, 4), new m("COLLECTION_SAMPLED", 5, 5)};
        f54584g = mVarArr;
        f54585h = cv.b.enumEntries(mVarArr);
    }

    public m(String str, int i10, int i11) {
        this.f54586b = i11;
    }

    public static cv.a getEntries() {
        return f54585h;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f54584g.clone();
    }

    @Override // wi.g
    public int getNumber() {
        return this.f54586b;
    }
}
