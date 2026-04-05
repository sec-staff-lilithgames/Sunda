package zu;

import kotlin.jvm.internal.e0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e {
    public static <R> R fold(g gVar, R r10, p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) j.fold(gVar, r10, operation);
    }

    public static <E extends k> E get(g gVar, l key) {
        E e10;
        e0.checkNotNullParameter(key, "key");
        if (!(key instanceof b)) {
            if (f.f98853b != key) {
                return null;
            }
            e0.checkNotNull(gVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return gVar;
        }
        b bVar = (b) key;
        if (!bVar.isSubKey$kotlin_stdlib(gVar.getKey()) || (e10 = (E) bVar.tryCast$kotlin_stdlib(gVar)) == null) {
            return null;
        }
        return e10;
    }

    public static m minusKey(g gVar, l key) {
        e0.checkNotNullParameter(key, "key");
        if (key instanceof b) {
            b bVar = (b) key;
            if (!bVar.isSubKey$kotlin_stdlib(gVar.getKey()) || bVar.tryCast$kotlin_stdlib(gVar) == null) {
                return gVar;
            }
        } else if (f.f98853b != key) {
            return gVar;
        }
        return n.f98854b;
    }

    public static m plus(g gVar, m context) {
        e0.checkNotNullParameter(context, "context");
        return j.plus(gVar, context);
    }

    public static void releaseInterceptedContinuation(g gVar, d<?> continuation) {
        e0.checkNotNullParameter(continuation, "continuation");
    }
}
