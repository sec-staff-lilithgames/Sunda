package kotlinx.coroutines.internal;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ThreadContextElement;
import kv.p;
import zu.k;
import zu.l;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    private final l key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t10, ThreadLocal<T> threadLocal) {
        this.value = t10;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    public <R> R fold(R r10, p pVar) {
        return (R) ThreadContextElement.DefaultImpls.fold(this, r10, pVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    public <E extends k> E get(l lVar) {
        if (!e0.areEqual(getKey(), lVar)) {
            return null;
        }
        e0.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k
    public l getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    public m minusKey(l lVar) {
        return e0.areEqual(getKey(), lVar) ? n.f98854b : this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    public m plus(m mVar) {
        return ThreadContextElement.DefaultImpls.plus(this, mVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(m mVar, T t10) {
        this.threadLocal.set(t10);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(m mVar) {
        T t10 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t10;
    }

    public String toString() {
        return OIPXcgrVyyxoLF.sWhcrxaVoLOPN + this.value + ", threadLocal = " + this.threadLocal + ')';
    }
}
