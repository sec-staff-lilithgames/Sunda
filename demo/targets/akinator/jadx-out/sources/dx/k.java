package dx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static j f52948a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f52949b = false;

    public static Class<?> getCallingClass() {
        int i10;
        j jVar = f52948a;
        if (jVar == null) {
            if (f52949b) {
                jVar = null;
            } else {
                try {
                    jVar = new j();
                } catch (SecurityException unused) {
                    jVar = null;
                }
                f52948a = jVar;
                f52949b = true;
            }
        }
        if (jVar == null) {
            return null;
        }
        Class<?>[] classContext = jVar.getClassContext();
        String name = k.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i10];
    }

    public static final void report(String str, Throwable th2) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th2.printStackTrace();
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String strSafeGetSystemProperty = safeGetSystemProperty(str);
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.equalsIgnoreCase("true");
    }

    public static String safeGetSystemProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final void report(String str) {
        System.err.println("SLF4J: " + str);
    }
}
