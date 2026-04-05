package a2;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f3732e = new n1(0);

    @Override // kv.a
    public final zu.m invoke() {
        Choreographer choreographer = r1.access$isMainThread() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new m1(2, null));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler handlerCreateAsync = t3.n.createAsync(Looper.getMainLooper());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(handlerCreateAsync, "createAsync(Looper.getMainLooper())");
        p1 p1Var = new p1(choreographer, handlerCreateAsync, null);
        return p1Var.plus(p1Var.getFrameClock());
    }
}
