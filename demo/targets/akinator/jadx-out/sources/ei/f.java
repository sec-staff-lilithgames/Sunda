package ei;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f54403b = new f("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    public final String f54404a;

    public f(String str) {
        this.f54404a = str;
    }

    public static f getLogger() {
        return f54403b;
    }

    public final boolean a(int i10) {
        return 4 <= i10 || Log.isLoggable(this.f54404a, i10);
    }

    public void d(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f54404a, str, th2);
        }
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f54404a, str, th2);
        }
    }

    public void i(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f54404a, str, th2);
        }
    }

    public void log(int i10, String str) {
        log(i10, str, false);
    }

    public void v(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f54404a, str, th2);
        }
    }

    public void w(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f54404a, str, th2);
        }
    }

    public void log(int i10, String str, boolean z10) {
        if (z10 || a(i10)) {
            Log.println(i10, this.f54404a, str);
        }
    }

    public void d(String str) {
        d(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }
}
