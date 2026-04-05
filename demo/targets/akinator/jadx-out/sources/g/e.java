package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f.i0;
import f.m0;
import p0.d0;
import p0.g3;
import p0.h3;
import p0.o0;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f56326a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final g3 f56327b = o0.compositionLocalOf$default(null, new com.moloco.sdk.service_locator.b(29), 1, null);

    public final i0 getCurrent(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-2068013981, i10, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        i0 i0Var = (i0) wVar.consume(f56327b);
        if (i0Var == null) {
            wVar.startReplaceGroup(1208426157);
            i0Var = m0.get((View) wVar.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            wVar.endReplaceGroup();
        } else {
            wVar.startReplaceGroup(1208423708);
            wVar.endReplaceGroup();
        }
        if (i0Var == null) {
            wVar.startReplaceGroup(1208428160);
            Object baseContext = (Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof i0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            i0Var = (i0) baseContext;
            wVar.endReplaceGroup();
        } else {
            wVar.startReplaceGroup(1208423789);
            wVar.endReplaceGroup();
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return i0Var;
    }

    public final h3 provides(i0 i0Var) {
        return f56327b.provides(i0Var);
    }
}
