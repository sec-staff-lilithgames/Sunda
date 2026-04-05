package i5;

import ao.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Deferred;
import sh.n1;
import w2.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final <T> n1 asListenableFuture(Deferred<? extends T> deferred, Object obj) {
        e0.checkNotNullParameter(deferred, "<this>");
        n1 future = o.getFuture(new n(15, deferred, obj));
        e0.checkNotNullExpressionValue(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ n1 asListenableFuture$default(Deferred deferred, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(deferred, obj);
    }
}
