package gv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f58499b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f58500c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f58501e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f58502f;

    static {
        l lVar = new l("TOP_DOWN", 0);
        f58499b = lVar;
        l lVar2 = new l("BOTTOM_UP", 1);
        f58500c = lVar2;
        l[] lVarArr = {lVar, lVar2};
        f58501e = lVarArr;
        f58502f = cv.b.enumEntries(lVarArr);
    }

    public static cv.a getEntries() {
        return f58502f;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f58501e.clone();
    }
}
