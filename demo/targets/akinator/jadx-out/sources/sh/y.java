package sh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f85880b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f85881c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f85882e;

    static {
        y yVar = new y("OUTPUT_FUTURE_DONE", 0);
        f85880b = yVar;
        y yVar2 = new y("ALL_INPUT_FUTURES_PROCESSED", 1);
        f85881c = yVar2;
        f85882e = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f85882e.clone();
    }
}
