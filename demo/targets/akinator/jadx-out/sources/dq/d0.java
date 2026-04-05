package dq;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f52463a = false;

    public static void a(boolean z10) {
        f52463a = z10;
    }

    public static boolean b() {
        return f52463a;
    }

    public static void a(Object obj, String str, Object... objArr) {
        b(obj, true, str, objArr);
    }

    public static void b(Object obj, String str, Object... objArr) {
        b(obj, false, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        b(null, true, str, objArr);
    }

    public static void b(Object obj, boolean z10, String str, Object... objArr) {
        if (a()) {
            if (objArr != null && objArr.length != 0) {
                try {
                    str = String.format(str, objArr);
                } catch (Throwable unused) {
                }
            }
            if (obj != null) {
                String string = obj.toString();
                if (!TextUtils.isEmpty(string)) {
                    str = a.b.m(C3191e4.i.f36529d, string, "] ", str);
                }
            }
            if (z10) {
                Log.e("AdaptiveRendering", str);
            } else {
                Log.d("AdaptiveRendering", str);
            }
        }
    }

    public static boolean a() {
        return b();
    }

    public static void b(Throwable th2) {
        if (a()) {
            if (th2 instanceof UnknownHostException) {
                th2.printStackTrace();
            } else {
                Log.w("AdaptiveRendering", th2);
            }
        }
    }
}
