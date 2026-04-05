package kotlinx.coroutines;

import kv.p;
import zu.d;
import zu.m;

/* loaded from: classes10.dex */
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, mVar, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, pVar, dVar);
    }

    public static final Job launch(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, mVar, coroutineStart, pVar);
    }

    public static final <T> T runBlocking(m mVar, p pVar) throws InterruptedException {
        return (T) BuildersKt__BuildersKt.runBlocking(mVar, pVar);
    }

    public static final <T> Object withContext(m mVar, p pVar, d<? super T> dVar) {
        return BuildersKt__Builders_commonKt.withContext(mVar, pVar, dVar);
    }
}
