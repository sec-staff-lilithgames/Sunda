package kotlinx.coroutines.channels;

import com.ironsource.B1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", B1.f33868i, "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes10.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends bv.d {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, zu.d<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> dVar) {
        super(dVar);
        this.this$0 = bufferedChannel;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM5144receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m5144receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM5144receiveCatchingOnNoWaiterSuspendGKJJFZk == av.e.getCOROUTINE_SUSPENDED() ? objM5144receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m5153boximpl(objM5144receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
