package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: b, reason: collision with root package name */
    public static final c3 f5833b;

    /* renamed from: c, reason: collision with root package name */
    public static final c3 f5834c;

    /* renamed from: e, reason: collision with root package name */
    public static final c3 f5835e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c3[] f5836f;

    static {
        c3 c3Var = new c3("PROTO2", 0);
        f5833b = c3Var;
        c3 c3Var2 = new c3("PROTO3", 1);
        f5834c = c3Var2;
        c3 c3Var3 = new c3("EDITIONS", 2);
        f5835e = c3Var3;
        f5836f = new c3[]{c3Var, c3Var2, c3Var3};
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) f5836f.clone();
    }
}
