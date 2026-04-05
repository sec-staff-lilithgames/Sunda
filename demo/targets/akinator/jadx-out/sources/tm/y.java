package tm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f87150b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f87151c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f87152e;

    static {
        y yVar = new y("INLINE", 0);
        f87150b = yVar;
        y yVar2 = new y("INTERSTITIAL", 1);
        f87151c = yVar2;
        f87152e = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f87152e.clone();
    }
}
