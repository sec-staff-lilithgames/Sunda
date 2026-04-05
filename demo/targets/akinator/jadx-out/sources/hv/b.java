package hv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f59184b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f59185c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cv.a f59186e;

    static {
        b bVar = new b("CONTINUE", 0);
        f59184b = bVar;
        b[] bVarArr = {bVar, new b("SKIP_SUBTREE", 1), new b("TERMINATE", 2)};
        f59185c = bVarArr;
        f59186e = cv.b.enumEntries(bVarArr);
    }

    public static cv.a getEntries() {
        return f59186e;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f59185c.clone();
    }
}
