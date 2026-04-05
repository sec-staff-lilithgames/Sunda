package kotlinx.coroutines.internal;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ThreadContextElement;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ThreadState {
    public final m context;
    private final ThreadContextElement<Object>[] elements;

    /* renamed from: i, reason: collision with root package name */
    private int f71895i;
    private final Object[] values;

    public ThreadState(m mVar, int i10) {
        this.context = mVar;
        this.values = new Object[i10];
        this.elements = new ThreadContextElement[i10];
    }

    public final void append(ThreadContextElement<?> threadContextElement, Object obj) {
        Object[] objArr = this.values;
        int i10 = this.f71895i;
        objArr[i10] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.elements;
        this.f71895i = i10 + 1;
        e0.checkNotNull(threadContextElement, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i10] = threadContextElement;
    }

    public final void restore(m mVar) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            ThreadContextElement<Object> threadContextElement = this.elements[length];
            e0.checkNotNull(threadContextElement);
            threadContextElement.restoreThreadContext(mVar, this.values[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
