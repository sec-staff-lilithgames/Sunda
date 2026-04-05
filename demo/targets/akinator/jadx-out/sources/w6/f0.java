package w6;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorsKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90408a;

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("WorkForegroundRunnable");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f90408a = strTagWithPrefix;
    }

    public static final Object workForeground(Context context, v6.b0 b0Var, n6.b0 b0Var2, n6.p pVar, x6.b bVar, zu.d<? super x0> dVar) {
        boolean z10 = b0Var.f89069q;
        x0 x0Var = x0.f87415a;
        if (z10 && Build.VERSION.SDK_INT < 31) {
            Executor mainThreadExecutor = bVar.getMainThreadExecutor();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor(...)");
            Object objWithContext = BuildersKt.withContext(ExecutorsKt.from(mainThreadExecutor), new e0(b0Var2, b0Var, pVar, context, null), dVar);
            if (objWithContext == av.e.getCOROUTINE_SUSPENDED()) {
                return objWithContext;
            }
        }
        return x0Var;
    }
}
