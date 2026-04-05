package lt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f73622a;

    static {
        Object obj;
        Class<?> cls;
        a aVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th2) {
            obj = th2;
            cls = null;
        }
        if (cls != null) {
            try {
                aVar = (a) cls.asSubclass(a.class).getConstructor(e.class).newInstance(a.f73620a);
            } catch (Throwable th3) {
                obj = th3;
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            f73622a = aVar;
        } else {
            f73622a = new a();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, c.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void attachTag(e eVar) {
        f73622a.getClass();
    }

    public static e createTag() {
        return a.f73620a;
    }

    public static void event(String str, e eVar) {
        f73622a.getClass();
    }

    @Deprecated
    public static b link() {
        return a.f73621b;
    }

    public static void linkIn(b bVar) {
        f73622a.getClass();
    }

    public static b linkOut() {
        f73622a.getClass();
        return a.f73621b;
    }

    public static boolean setEnabled(boolean z10) {
        f73622a.getClass();
        return false;
    }

    public static void startTask(String str, e eVar) {
        f73622a.getClass();
    }

    public static void stopTask() {
        f73622a.getClass();
    }

    public static f traceTask(String str) {
        f73622a.getClass();
        return f.f73623b;
    }

    public static void attachTag(String str, String str2) {
        f73622a.getClass();
    }

    public static e createTag(long j10) {
        f73622a.getClass();
        return a.f73620a;
    }

    public static void event(String str) {
        f73622a.getClass();
    }

    public static void startTask(String str) {
        f73622a.getClass();
    }

    public static void stopTask(String str, e eVar) {
        f73622a.getClass();
    }

    public static void attachTag(String str, long j10) {
        f73622a.getClass();
    }

    public static e createTag(String str) {
        f73622a.getClass();
        return a.f73620a;
    }

    public static void event(String str, String str2) {
        f73622a.getClass();
    }

    public static <T> void startTask(T t10, d dVar) {
        f73622a.getClass();
    }

    public static void stopTask(String str) {
        f73622a.getClass();
    }

    public static <T> f traceTask(T t10, d dVar) {
        f73622a.getClass();
        return f.f73623b;
    }

    public static void attachTag(String str, long j10, long j11) {
        f73622a.getClass();
    }

    public static e createTag(String str, long j10) {
        f73622a.getClass();
        return a.f73620a;
    }

    public static void startTask(String str, String str2) {
        f73622a.getClass();
    }

    public static void stopTask(String str, String str2) {
        f73622a.getClass();
    }

    public static <T> void attachTag(String str, T t10, d dVar) {
        f73622a.getClass();
    }
}
