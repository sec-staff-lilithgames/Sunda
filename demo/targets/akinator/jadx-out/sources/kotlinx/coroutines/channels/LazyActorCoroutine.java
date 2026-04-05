package kotlinx.coroutines.channels;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kv.p;
import kv.q;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class LazyActorCoroutine<E> extends ActorCoroutine<E> {
    private zu.d<? super x0> continuation;

    public LazyActorCoroutine(m mVar, Channel<E> channel, p pVar) {
        super(mVar, channel, false);
        this.continuation = av.b.createCoroutineUnintercepted(pVar, this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSendRegFunction(SelectInstance<?> selectInstance, Object obj) throws Throwable {
        onStart();
        super.getOnSend().getRegFunc().invoke(this, selectInstance, obj);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th2) {
        boolean zClose = super.close(th2);
        start();
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.INSTANCE;
        e0.checkNotNull(lazyActorCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new SelectClause2Impl(this, (q) h1.beforeCheckcastToFunctionOfArity(lazyActorCoroutine$onSend$1, 3), super.getOnSend().getProcessResFunc(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @tu.f
    public boolean offer(E e10) {
        start();
        return super.offer(e10);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, zu.d<? super x0> dVar) {
        start();
        Object objSend = super.send(e10, dVar);
        return objSend == av.e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo5139trySendJP2dKIU(E e10) {
        start();
        return super.mo5139trySendJP2dKIU(e10);
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }
}
