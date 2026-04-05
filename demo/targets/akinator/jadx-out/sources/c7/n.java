package c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f11845b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f11846c;

    /* JADX INFO: Fake field, exist only in values array */
    n EF0;

    static {
        n nVar = new n("IGNORE", 0);
        n nVar2 = new n("RESPECT_PERFORMANCE", 1);
        f11845b = nVar2;
        f11846c = new n[]{nVar, nVar2, new n("RESPECT_ALL", 2)};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f11846c.clone();
    }
}
