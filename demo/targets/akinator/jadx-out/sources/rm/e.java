package rm;

import android.text.TextUtils;
import b3.h;
import tm.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final um.c f84519a = new um.c();

    public static void a(s0 s0Var, String str, String str2, String str3) {
        StringBuilder sbB = h.b("nativeStorage.", str, "(\"", str2, "\", \"");
        sbB.append(str3);
        sbB.append("\");");
        s0Var.injectJs(sbB.toString());
    }

    public static boolean b(s0 s0Var, String... strArr) {
        if (s0Var == null || s0Var.isDestroyed() || s0Var.getContext() == null) {
            if (s0Var != null) {
                s0Var.injectJs("nativeStorage.fireErrorEvent('internal error');");
            }
            return true;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                s0Var.injectJs("nativeStorage.fireErrorEvent('internal error');");
                return true;
            }
        }
        return false;
    }
}
