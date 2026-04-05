package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f90668b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f90669c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f90670e;

    static {
        g gVar = new g("OK", 0);
        f90668b = gVar;
        g gVar2 = new g("BAD_CONFIG", 1);
        f90669c = gVar2;
        f90670e = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f90670e.clone();
    }
}
