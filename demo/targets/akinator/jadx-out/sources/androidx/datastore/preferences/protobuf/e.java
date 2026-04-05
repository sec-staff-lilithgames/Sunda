package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5854a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f5855b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5854a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5855b = cls2 != null;
    }

    public static boolean a() {
        return (f5854a == null || f5855b) ? false : true;
    }
}
