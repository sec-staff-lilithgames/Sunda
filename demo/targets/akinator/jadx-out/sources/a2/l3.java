package a2;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public ReceiveChannel f3705i;

    /* renamed from: j, reason: collision with root package name */
    public ChannelIterator f3706j;

    /* renamed from: k, reason: collision with root package name */
    public int f3707k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Channel f3708l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Channel channel, zu.d dVar) {
        super(2, dVar);
        this.f3708l = channel;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l3(this.f3708l, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x000f, B:17:0x0034, B:19:0x003c, B:14:0x0027, B:13:0x0022), top: B:29:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:17:0x0034). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.f3707k
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            kotlinx.coroutines.channels.ChannelIterator r1 = r4.f3706j
            kotlinx.coroutines.channels.ReceiveChannel r3 = r4.f3705i
            tu.a0.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L13
            goto L34
        L13:
            r5 = move-exception
            goto L4f
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            tu.a0.throwOnFailure(r5)
            kotlinx.coroutines.channels.Channel r3 = r4.f3708l
            kotlinx.coroutines.channels.ChannelIterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L13
            r1 = r5
        L27:
            r4.f3705i = r3     // Catch: java.lang.Throwable -> L13
            r4.f3706j = r1     // Catch: java.lang.Throwable -> L13
            r4.f3707k = r2     // Catch: java.lang.Throwable -> L13
            java.lang.Object r5 = r1.hasNext(r4)     // Catch: java.lang.Throwable -> L13
            if (r5 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L13
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L48
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L13
            tu.x0 r5 = (tu.x0) r5     // Catch: java.lang.Throwable -> L13
            b1.m$a r5 = b1.m.f8651e     // Catch: java.lang.Throwable -> L13
            r5.sendApplyNotifications()     // Catch: java.lang.Throwable -> L13
            goto L27
        L48:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r5)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L4f:
            throw r5     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.l3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((l3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
