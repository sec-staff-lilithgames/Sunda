package ds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f52633b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f52634c;

    /* renamed from: e, reason: collision with root package name */
    public static final n f52635e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n[] f52636f;

    static {
        n nVar = new n("BLOCKING", 0);
        f52633b = nVar;
        n nVar2 = new n("FUTURE", 1);
        f52634c = nVar2;
        n nVar3 = new n("ASYNC", 2);
        f52635e = nVar3;
        f52636f = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f52636f.clone();
    }
}
