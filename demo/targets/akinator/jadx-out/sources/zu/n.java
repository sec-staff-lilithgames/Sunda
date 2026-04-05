package zu;

import java.io.Serializable;
import kotlin.jvm.internal.e0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements m, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f98854b = new n();

    @Override // zu.m
    public <R> R fold(R r10, p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return r10;
    }

    @Override // zu.m
    public <E extends k> E get(l key) {
        e0.checkNotNullParameter(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // zu.m
    public m minusKey(l key) {
        e0.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // zu.m
    public m plus(m context) {
        e0.checkNotNullParameter(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
