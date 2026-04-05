package hv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f59213b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ cv.a f59214c;

    static {
        k[] kVarArr = {new k("SKIP_SUBTREE", 0), new k("TERMINATE", 1)};
        f59213b = kVarArr;
        f59214c = cv.b.enumEntries(kVarArr);
    }

    public static cv.a getEntries() {
        return f59214c;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f59213b.clone();
    }
}
