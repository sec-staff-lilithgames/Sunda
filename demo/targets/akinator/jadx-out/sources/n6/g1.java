package n6;

import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g1 {
    public static final n1 access$future(Executor executor, kv.a aVar) {
        n1 future = w2.o.getFuture(new ks.s(2, executor, aVar));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }
}
