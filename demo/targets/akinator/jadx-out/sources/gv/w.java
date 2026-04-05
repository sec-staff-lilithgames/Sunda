package gv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f58512b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w[] f58513c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cv.a f58514e;

    static {
        w wVar = new w("SKIP", 0);
        w wVar2 = new w("TERMINATE", 1);
        f58512b = wVar2;
        w[] wVarArr = {wVar, wVar2};
        f58513c = wVarArr;
        f58514e = cv.b.enumEntries(wVarArr);
    }

    public static cv.a getEntries() {
        return f58514e;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f58513c.clone();
    }
}
