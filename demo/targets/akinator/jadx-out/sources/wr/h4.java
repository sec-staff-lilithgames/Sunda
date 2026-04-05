package wr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h4 {

    /* renamed from: b, reason: collision with root package name */
    public static final h4 f90954b;

    /* renamed from: c, reason: collision with root package name */
    public static final h4 f90955c;

    /* renamed from: e, reason: collision with root package name */
    public static final h4 f90956e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h4[] f90957f;

    static {
        h4 h4Var = new h4("UNARY", 0);
        f90954b = h4Var;
        h4 h4Var2 = new h4("CLIENT_STREAMING", 1);
        f90955c = h4Var2;
        h4 h4Var3 = new h4("SERVER_STREAMING", 2);
        f90956e = h4Var3;
        f90957f = new h4[]{h4Var, h4Var2, h4Var3, new h4("BIDI_STREAMING", 3), new h4("UNKNOWN", 4)};
    }

    public static h4 valueOf(String str) {
        return (h4) Enum.valueOf(h4.class, str);
    }

    public static h4[] values() {
        return (h4[]) f90957f.clone();
    }

    public final boolean clientSendsOneMessage() {
        return this == f90954b || this == f90956e;
    }

    public final boolean serverSendsOneMessage() {
        return this == f90954b || this == f90955c;
    }
}
