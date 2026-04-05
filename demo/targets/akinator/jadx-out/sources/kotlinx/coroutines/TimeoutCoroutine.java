package kotlinx.coroutines;

import e3.g;
import kotlinx.coroutines.internal.ScopeCoroutine;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {
    public final long time;

    public TimeoutCoroutine(long j10, d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.time = j10;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.nameString$kotlinx_coroutines_core());
        sb2.append("(timeMillis=");
        return g.n(sb2, this.time, ')');
    }

    @Override // java.lang.Runnable
    public void run() {
        cancelCoroutine(TimeoutKt.TimeoutCancellationException(this.time, DelayKt.getDelay(getContext()), this));
    }
}
