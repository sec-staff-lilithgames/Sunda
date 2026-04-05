package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f97681b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f97682c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f97683e;

    static {
        y yVar = new y("SIMULTANEOUSLY", 0);
        f97681b = yVar;
        y yVar2 = new y("INDIVIDUALLY", 1);
        f97682c = yVar2;
        f97683e = new y[]{yVar, yVar2};
    }

    public static y forId(int i10) {
        if (i10 == 1) {
            return f97681b;
        }
        if (i10 == 2) {
            return f97682c;
        }
        throw new IllegalArgumentException(a.b.e(i10, "Unknown trim path type "));
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f97683e.clone();
    }
}
