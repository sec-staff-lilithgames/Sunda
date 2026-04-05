package x8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f91872b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f91873c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f91874e;

    static {
        w wVar = new w("MEMORY", 0);
        f91872b = wVar;
        w wVar2 = new w("QUALITY", 1);
        f91873c = wVar2;
        f91874e = new w[]{wVar, wVar2};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f91874e.clone();
    }
}
