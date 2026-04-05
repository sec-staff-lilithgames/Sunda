package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
/* loaded from: classes10.dex */
public final class BufferedChannel$receiveCatching$1<E> extends bv.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, zu.d<? super BufferedChannel$receiveCatching$1> dVar) {
        super(dVar);
        this.this$0 = bufferedChannel;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM5143receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m5143receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM5143receiveCatchingJP2dKIU$suspendImpl == av.e.getCOROUTINE_SUSPENDED() ? objM5143receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m5153boximpl(objM5143receiveCatchingJP2dKIU$suspendImpl);
    }
}
