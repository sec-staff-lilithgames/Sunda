package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f90912b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f90913c;

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f90914e;

    /* renamed from: f, reason: collision with root package name */
    public static final f0 f90915f;

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f90916g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f0[] f90917h;

    static {
        f0 f0Var = new f0("CONNECTING", 0);
        f90912b = f0Var;
        f0 f0Var2 = new f0("READY", 1);
        f90913c = f0Var2;
        f0 f0Var3 = new f0("TRANSIENT_FAILURE", 2);
        f90914e = f0Var3;
        f0 f0Var4 = new f0("IDLE", 3);
        f90915f = f0Var4;
        f0 f0Var5 = new f0("SHUTDOWN", 4);
        f90916g = f0Var5;
        f90917h = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f90917h.clone();
    }
}
