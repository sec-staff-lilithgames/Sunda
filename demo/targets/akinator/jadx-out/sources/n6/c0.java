package n6;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f75700a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c0 f75701b;

    public c0(int i10) {
    }

    public static c0 get() {
        c0 c0Var;
        synchronized (f75700a) {
            try {
                if (f75701b == null) {
                    f75701b = new a(3);
                }
                c0Var = f75701b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public static void setLogger(c0 c0Var) {
        synchronized (f75700a) {
            try {
                if (f75701b == null) {
                    f75701b = c0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String tagWithPrefix(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void debug(String str, String str2);

    public abstract void debug(String str, String str2, Throwable th2);

    public abstract void error(String str, String str2);

    public abstract void error(String str, String str2, Throwable th2);

    public abstract void info(String str, String str2);

    public abstract void info(String str, String str2, Throwable th2);

    public abstract void verbose(String str, String str2);

    public abstract void verbose(String str, String str2, Throwable th2);

    public abstract void warning(String str, String str2);

    public abstract void warning(String str, String str2, Throwable th2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends c0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f75702c;

        public a(int i10) {
            super(i10);
            this.f75702c = i10;
        }

        @Override // n6.c0
        public void debug(String str, String str2) {
            if (this.f75702c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // n6.c0
        public void error(String str, String str2) {
            if (this.f75702c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // n6.c0
        public void info(String str, String str2) {
            if (this.f75702c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // n6.c0
        public void verbose(String str, String str2) {
            if (this.f75702c <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // n6.c0
        public void warning(String str, String str2) {
            if (this.f75702c <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // n6.c0
        public void debug(String str, String str2, Throwable th2) {
            if (this.f75702c <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // n6.c0
        public void error(String str, String str2, Throwable th2) {
            if (this.f75702c <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // n6.c0
        public void info(String str, String str2, Throwable th2) {
            if (this.f75702c <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // n6.c0
        public void verbose(String str, String str2, Throwable th2) {
            if (this.f75702c <= 2) {
                Log.v(str, str2, th2);
            }
        }

        @Override // n6.c0
        public void warning(String str, String str2, Throwable th2) {
            if (this.f75702c <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }
}
