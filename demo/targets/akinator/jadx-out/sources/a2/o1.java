package a2;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(choreographer, "getInstance()");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        Handler handlerCreateAsync = t3.n.createAsync(looperMyLooper);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(handlerCreateAsync, "createAsync(\n           …d\")\n                    )");
        p1 p1Var = new p1(choreographer, handlerCreateAsync, null);
        return p1Var.plus(p1Var.getFrameClock());
    }
}
