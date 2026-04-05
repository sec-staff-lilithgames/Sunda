package kotlinx.coroutines.channels;

import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kv.l;
import kv.p;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ActorKt {
    public static final <E> SendChannel<E> actor(CoroutineScope coroutineScope, m mVar, int i10, CoroutineStart coroutineStart, l lVar, p pVar) {
        m mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, mVar);
        Channel channelChannel$default = ChannelKt.Channel$default(i10, null, null, 6, null);
        ActorCoroutine lazyActorCoroutine = coroutineStart.isLazy() ? new LazyActorCoroutine(mVarNewCoroutineContext, channelChannel$default, pVar) : new ActorCoroutine(mVarNewCoroutineContext, channelChannel$default, true);
        if (lVar != null) {
            ((JobSupport) lazyActorCoroutine).invokeOnCompletion(lVar);
        }
        ((AbstractCoroutine) lazyActorCoroutine).start(coroutineStart, lazyActorCoroutine, pVar);
        return (SendChannel<E>) lazyActorCoroutine;
    }

    public static /* synthetic */ SendChannel actor$default(CoroutineScope coroutineScope, m mVar, int i10, CoroutineStart coroutineStart, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return actor(coroutineScope, mVar, i10, coroutineStart2, lVar, pVar);
    }
}
