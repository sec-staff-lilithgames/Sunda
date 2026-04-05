package zu;

import kotlin.jvm.internal.e0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j {
    public static <R> R fold(k kVar, R r10, p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) operation.invoke(r10, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends k> E get(k kVar, l key) {
        e0.checkNotNullParameter(key, "key");
        if (!e0.areEqual(kVar.getKey(), key)) {
            return null;
        }
        e0.checkNotNull(kVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
        return kVar;
    }

    public static m minusKey(k kVar, l key) {
        e0.checkNotNullParameter(key, "key");
        return e0.areEqual(kVar.getKey(), key) ? n.f98854b : kVar;
    }

    public static m plus(k kVar, m context) {
        e0.checkNotNullParameter(context, "context");
        return i.plus(kVar, context);
    }
}
