package kotlinx.coroutines;

import kv.p;
import tu.f;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class GuidanceKt {
    @f
    public static final <T> Deferred<T> async(m mVar, CoroutineStart coroutineStart, p pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Deferred async$default(m mVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return async(mVar, coroutineStart, pVar);
    }

    @f
    public static final Job launch(m mVar, CoroutineStart coroutineStart, p pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Job launch$default(m mVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launch(mVar, coroutineStart, pVar);
    }
}
