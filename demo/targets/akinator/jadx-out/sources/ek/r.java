package ek;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r implements wi.g {

    /* renamed from: c, reason: collision with root package name */
    public static final r f54620c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f54621e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f54622f;

    /* renamed from: b, reason: collision with root package name */
    public final int f54623b;

    static {
        r rVar = new r("EVENT_TYPE_UNKNOWN", 0, 0);
        r rVar2 = new r("SESSION_START", 1, 1);
        f54620c = rVar2;
        r[] rVarArr = {rVar, rVar2};
        f54621e = rVarArr;
        f54622f = cv.b.enumEntries(rVarArr);
    }

    public r(String str, int i10, int i11) {
        this.f54623b = i11;
    }

    public static cv.a getEntries() {
        return f54622f;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f54621e.clone();
    }

    @Override // wi.g
    public int getNumber() {
        return this.f54623b;
    }
}
