package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: b, reason: collision with root package name */
    public static final u4 f6037b;

    /* renamed from: c, reason: collision with root package name */
    public static final u4 f6038c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u4[] f6039e;

    static {
        u4 u4Var = new u4("ASCENDING", 0);
        f6037b = u4Var;
        u4 u4Var2 = new u4("DESCENDING", 1);
        f6038c = u4Var2;
        f6039e = new u4[]{u4Var, u4Var2};
    }

    public static u4 valueOf(String str) {
        return (u4) Enum.valueOf(u4.class, str);
    }

    public static u4[] values() {
        return (u4[]) f6039e.clone();
    }
}
