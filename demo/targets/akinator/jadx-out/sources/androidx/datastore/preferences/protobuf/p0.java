package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5969a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f5969a = cls;
    }

    public static s0 create() {
        s0 s0Var = null;
        Class cls = f5969a;
        if (cls != null) {
            try {
                s0Var = (s0) cls.getDeclaredMethod("newInstance", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return s0Var != null ? s0Var : new s0();
    }

    public static s0 createEmpty() {
        s0 s0Var = null;
        Class cls = f5969a;
        if (cls != null) {
            try {
                s0Var = (s0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return s0Var != null ? s0Var : s0.f5989d;
    }
}
