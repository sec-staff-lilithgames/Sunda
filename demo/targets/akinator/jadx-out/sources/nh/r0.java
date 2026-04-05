package nh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f76591b;

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f76592c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r0[] f76593e;

    static {
        r0 r0Var = new r0("OPEN", 0);
        f76591b = r0Var;
        r0 r0Var2 = new r0("CLOSED", 1);
        f76592c = r0Var2;
        f76593e = new r0[]{r0Var, r0Var2};
    }

    public static r0 a(boolean z10) {
        return z10 ? f76592c : f76591b;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f76593e.clone();
    }
}
