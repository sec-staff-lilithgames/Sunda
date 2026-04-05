package io.bidmachine.media3.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static int f60695b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f60696c = true;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f60694a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static a0 f60697d = a0.f60678a;

    @Pure
    public static String appendThrowableString(String str, Throwable th2) {
        String throwableString = getThrowableString(th2);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder sbT = a.b.t(str, "\n  ");
        sbT.append(throwableString.replace("\n", "\n  "));
        sbT.append('\n');
        return sbT.toString();
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (f60694a) {
            try {
                if (f60695b == 0) {
                    ((z) f60697d).d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void e(String str, String str2) {
        synchronized (f60694a) {
            try {
                if (f60695b <= 3) {
                    ((z) f60697d).e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static int getLogLevel() {
        int i10;
        synchronized (f60694a) {
            i10 = f60695b;
        }
        return i10;
    }

    @Pure
    public static String getThrowableString(Throwable th2) {
        boolean z10;
        if (th2 == null) {
            return null;
        }
        synchronized (f60694a) {
            Throwable cause = th2;
            while (true) {
                if (cause == null) {
                    z10 = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z10) {
                return "UnknownHostException (no network)";
            }
            if (f60696c) {
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            }
            return th2.getMessage();
        }
    }

    @Pure
    public static void i(String str, String str2) {
        synchronized (f60694a) {
            try {
                if (f60695b <= 1) {
                    ((z) f60697d).i(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setLogLevel(int i10) {
        synchronized (f60694a) {
            f60695b = i10;
        }
    }

    public static void setLogStackTraces(boolean z10) {
        synchronized (f60694a) {
            f60696c = z10;
        }
    }

    public static void setLogger(a0 a0Var) {
        synchronized (f60694a) {
            f60697d = a0Var;
        }
    }

    @Pure
    public static void w(String str, String str2) {
        synchronized (f60694a) {
            try {
                if (f60695b <= 2) {
                    ((z) f60697d).w(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th2) {
        synchronized (f60694a) {
            try {
                if (f60695b == 0) {
                    ((z) f60697d).d(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void e(String str, String str2, Throwable th2) {
        synchronized (f60694a) {
            try {
                if (f60695b <= 3) {
                    ((z) f60697d).e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void i(String str, String str2, Throwable th2) {
        synchronized (f60694a) {
            try {
                if (f60695b <= 1) {
                    ((z) f60697d).i(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void w(String str, String str2, Throwable th2) {
        synchronized (f60694a) {
            try {
                if (f60695b <= 2) {
                    ((z) f60697d).w(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
