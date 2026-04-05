package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f75761b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f75762c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m[] f75763e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f75764f;

    static {
        m mVar = new m("REPLACE", 0);
        m mVar2 = new m("KEEP", 1);
        f75761b = mVar2;
        m mVar3 = new m("UPDATE", 2);
        f75762c = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3, new m("CANCEL_AND_REENQUEUE", 3)};
        f75763e = mVarArr;
        f75764f = cv.b.enumEntries(mVarArr);
    }

    public static cv.a getEntries() {
        return f75764f;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f75763e.clone();
    }
}
