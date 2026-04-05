package z4;

import androidx.lifecycle.b1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import p0.g3;
import p0.o0;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f97531a;

    static {
        Object objM7131constructorimpl;
        g3 g3Var;
        try {
            int i10 = z.f87419c;
            ClassLoader classLoader = b1.class.getClassLoader();
            e0.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof g3) {
                        g3Var = (g3) objInvoke;
                    }
                } else if (annotations[i11] instanceof tu.f) {
                    break;
                } else {
                    i11++;
                }
            }
            g3Var = null;
            objM7131constructorimpl = z.m7131constructorimpl(g3Var);
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        g3 g3VarStaticCompositionLocalOf = (g3) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        if (g3VarStaticCompositionLocalOf == null) {
            g3VarStaticCompositionLocalOf = o0.staticCompositionLocalOf(new i.f(15));
        }
        f97531a = g3VarStaticCompositionLocalOf;
    }

    public static final g3 getLocalLifecycleOwner() {
        return f97531a;
    }

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
