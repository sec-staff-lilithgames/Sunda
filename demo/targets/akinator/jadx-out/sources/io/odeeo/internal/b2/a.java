package io.odeeo.internal.b2;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c[] f63265a;

    /* renamed from: c, reason: collision with root package name */
    public static volatile c[] f63267c;

    /* renamed from: b, reason: collision with root package name */
    public static final List<c> f63266b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final c f63268d = new C0594a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal<String> f63270a = new ThreadLocal<>();

        public abstract void a(int i10, String str, String str2, Throwable th2);

        @Deprecated
        public boolean a(int i10) {
            return true;
        }

        public void d(String str, Object... objArr) {
            a(3, (Throwable) null, str, objArr);
        }

        public void e(String str, Object... objArr) {
            a(6, (Throwable) null, str, objArr);
        }

        public void i(String str, Object... objArr) {
            a(4, (Throwable) null, str, objArr);
        }

        public void log(int i10, String str, Object... objArr) {
            a(i10, (Throwable) null, str, objArr);
        }

        public void v(String str, Object... objArr) {
            a(2, (Throwable) null, str, objArr);
        }

        public void w(String str, Object... objArr) {
            a(5, (Throwable) null, str, objArr);
        }

        public void wtf(String str, Object... objArr) {
            a(7, (Throwable) null, str, objArr);
        }

        public String a() {
            String str = this.f63270a.get();
            if (str != null) {
                this.f63270a.remove();
            }
            return str;
        }

        public void d(Throwable th2, String str, Object... objArr) {
            a(3, th2, str, objArr);
        }

        public void e(Throwable th2, String str, Object... objArr) {
            a(6, th2, str, objArr);
        }

        public void i(Throwable th2, String str, Object... objArr) {
            a(4, th2, str, objArr);
        }

        public void log(int i10, Throwable th2, String str, Object... objArr) {
            a(i10, th2, str, objArr);
        }

        public void v(Throwable th2, String str, Object... objArr) {
            a(2, th2, str, objArr);
        }

        public void w(Throwable th2, String str, Object... objArr) {
            a(5, th2, str, objArr);
        }

        public void wtf(Throwable th2, String str, Object... objArr) {
            a(7, th2, str, objArr);
        }

        public void d(Throwable th2) {
            a(3, th2, (String) null, new Object[0]);
        }

        public void e(Throwable th2) {
            a(6, th2, (String) null, new Object[0]);
        }

        public void i(Throwable th2) {
            a(4, th2, (String) null, new Object[0]);
        }

        public void log(int i10, Throwable th2) {
            a(i10, th2, (String) null, new Object[0]);
        }

        public void v(Throwable th2) {
            a(2, th2, (String) null, new Object[0]);
        }

        public void w(Throwable th2) {
            a(5, th2, (String) null, new Object[0]);
        }

        public void wtf(Throwable th2) {
            a(7, th2, (String) null, new Object[0]);
        }

        public boolean a(String str, int i10) {
            return a(i10);
        }

        public final void a(int i10, Throwable th2, String str, Object... objArr) {
            String strA = a();
            if (a(strA, i10)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = a(str, objArr);
                    }
                    if (th2 != null) {
                        StringBuilder sbT = a.b.t(str, "\n");
                        sbT.append(a(th2));
                        str = sbT.toString();
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str = a(th2);
                }
                a(i10, strA, str, th2);
            }
        }

        public String a(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        public final String a(Throwable th2) {
            StringWriter stringWriter = new StringWriter(NotificationCompat.FLAG_LOCAL_ONLY);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }
    }

    static {
        c[] cVarArr = new c[0];
        f63265a = cVarArr;
        f63267c = cVarArr;
    }

    public static c asTree() {
        return f63268d;
    }

    public static void d(String str, Object... objArr) {
        f63268d.d(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        f63268d.e(str, objArr);
    }

    public static List<c> forest() {
        List<c> listUnmodifiableList;
        List<c> list = f63266b;
        synchronized (list) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        }
        return listUnmodifiableList;
    }

    public static void i(String str, Object... objArr) {
        f63268d.i(str, objArr);
    }

    public static void log(int i10, String str, Object... objArr) {
        f63268d.log(i10, str, objArr);
    }

    public static void plant(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("tree == null");
        }
        if (cVar == f63268d) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<c> list = f63266b;
        synchronized (list) {
            list.add(cVar);
            f63267c = (c[]) list.toArray(new c[list.size()]);
        }
    }

    public static c tag(String str) {
        for (c cVar : f63267c) {
            cVar.f63270a.set(str);
        }
        return f63268d;
    }

    public static int treeCount() {
        int size;
        List<c> list = f63266b;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    public static void uproot(c cVar) {
        List<c> list = f63266b;
        synchronized (list) {
            try {
                if (!list.remove(cVar)) {
                    throw new IllegalArgumentException("Cannot uproot tree which is not planted: " + cVar);
                }
                f63267c = (c[]) list.toArray(new c[list.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void uprootAll() {
        List<c> list = f63266b;
        synchronized (list) {
            list.clear();
            f63267c = f63265a;
        }
    }

    public static void v(String str, Object... objArr) {
        f63268d.v(str, objArr);
    }

    public static void w(String str, Object... objArr) {
        f63268d.w(str, objArr);
    }

    public static void wtf(String str, Object... objArr) {
        f63268d.wtf(str, objArr);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        f63268d.d(th2, str, objArr);
    }

    public static void e(Throwable th2, String str, Object... objArr) {
        f63268d.e(th2, str, objArr);
    }

    public static void i(Throwable th2, String str, Object... objArr) {
        f63268d.i(th2, str, objArr);
    }

    public static void log(int i10, Throwable th2, String str, Object... objArr) {
        f63268d.log(i10, th2, str, objArr);
    }

    public static void v(Throwable th2, String str, Object... objArr) {
        f63268d.v(th2, str, objArr);
    }

    public static void w(Throwable th2, String str, Object... objArr) {
        f63268d.w(th2, str, objArr);
    }

    public static void wtf(Throwable th2, String str, Object... objArr) {
        f63268d.wtf(th2, str, objArr);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.b2.a$a, reason: collision with other inner class name */
    public static class C0594a extends c {
        @Override // io.odeeo.internal.b2.a.c
        public void a(int i10, String str, String str2, Throwable th2) {
            throw new AssertionError("Missing override for log method.");
        }

        @Override // io.odeeo.internal.b2.a.c
        public void d(String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.d(str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void e(String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.e(str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void i(String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.i(str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void log(int i10, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.log(i10, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void v(String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.v(str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void w(String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.w(str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void wtf(String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.wtf(str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void d(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.d(th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void e(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.e(th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void i(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.i(th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void log(int i10, Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.log(i10, th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void v(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.v(th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void w(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.w(th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void wtf(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f63267c) {
                cVar.wtf(th2, str, objArr);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void d(Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.d(th2);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void e(Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.e(th2);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void i(Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.i(th2);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void log(int i10, Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.log(i10, th2);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void v(Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.v(th2);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void w(Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.w(th2);
            }
        }

        @Override // io.odeeo.internal.b2.a.c
        public void wtf(Throwable th2) {
            for (c cVar : a.f63267c) {
                cVar.wtf(th2);
            }
        }
    }

    public static void d(Throwable th2) {
        f63268d.d(th2);
    }

    public static void e(Throwable th2) {
        f63268d.e(th2);
    }

    public static void i(Throwable th2) {
        f63268d.i(th2);
    }

    public static void log(int i10, Throwable th2) {
        f63268d.log(i10, th2);
    }

    public static void v(Throwable th2) {
        f63268d.v(th2);
    }

    public static void w(Throwable th2) {
        f63268d.w(th2);
    }

    public static void wtf(Throwable th2) {
        f63268d.wtf(th2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final Pattern f63269b = Pattern.compile("(\\$\\d+)+$");

        public String a(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f63269b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String strSubstring = className.substring(className.lastIndexOf(46) + 1);
            strSubstring.length();
            return strSubstring;
        }

        @Override // io.odeeo.internal.b2.a.c
        public final String a() {
            String strA = super.a();
            if (strA != null) {
                return strA;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return a(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        @Override // io.odeeo.internal.b2.a.c
        public void a(int i10, String str, String str2, Throwable th2) {
            int iMin;
            if (str2.length() < 4000) {
                if (i10 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i10, str, str2);
                    return;
                }
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int iIndexOf = str2.indexOf(10, i11);
                if (iIndexOf == -1) {
                    iIndexOf = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    if (i10 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i10, str, strSubstring);
                    }
                    if (iMin >= iIndexOf) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public static void plant(c... cVarArr) {
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    if (cVar == f63268d) {
                        throw new IllegalArgumentException("Cannot plant Timber into itself.");
                    }
                } else {
                    throw new NullPointerException("trees contains null");
                }
            }
            List<c> list = f63266b;
            synchronized (list) {
                Collections.addAll(list, cVarArr);
                f63267c = (c[]) list.toArray(new c[list.size()]);
            }
            return;
        }
        throw new NullPointerException("trees == null");
    }
}
