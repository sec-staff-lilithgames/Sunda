package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f73793b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f73794c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n[] f73795e;

    static {
        n nVar = new n("TopLeft", 0);
        f73793b = nVar;
        n nVar2 = new n("TopRight", 1);
        f73794c = nVar2;
        f73795e = new n[]{nVar, nVar2, new n("TopMiddle", 2)};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f73795e.clone();
    }
}
