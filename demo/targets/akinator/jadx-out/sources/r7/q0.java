package r7;

import zb.VW.VPCjETNfjxu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f83984b;

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f83985c;

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f83986e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q0[] f83987f;

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f83987f.clone();
    }

    public boolean useSoftwareRendering(int i10, boolean z10, int i11) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }

    static {
        q0 q0Var = new q0(VPCjETNfjxu.lPH, 0);
        f83984b = q0Var;
        q0 q0Var2 = new q0("HARDWARE", 1);
        f83985c = q0Var2;
        q0 q0Var3 = new q0("SOFTWARE", 2);
        f83986e = q0Var3;
        f83987f = new q0[]{q0Var, q0Var2, q0Var3};
    }
}
