package n8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f75857b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w[] f75858c;

    /* JADX INFO: Fake field, exist only in values array */
    w EF0;

    static {
        w wVar = new w("SRGB", 0);
        w wVar2 = new w("DISPLAY_P3", 1);
        f75857b = wVar2;
        f75858c = new w[]{wVar, wVar2};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f75858c.clone();
    }
}
