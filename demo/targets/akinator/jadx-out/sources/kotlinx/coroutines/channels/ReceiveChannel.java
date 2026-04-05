package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ReceiveChannel<E> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        public static <E> SelectClause1<E> getOnReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
            e0.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }

        @tu.f
        public static <E> E poll(ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objMo5146tryReceivePtdJZtk = receiveChannel.mo5146tryReceivePtdJZtk();
            if (ChannelResult.m5163isSuccessimpl(objMo5146tryReceivePtdJZtk)) {
                return (E) ChannelResult.m5159getOrThrowimpl(objMo5146tryReceivePtdJZtk);
            }
            Throwable thM5157exceptionOrNullimpl = ChannelResult.m5157exceptionOrNullimpl(objMo5146tryReceivePtdJZtk);
            if (thM5157exceptionOrNullimpl == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM5157exceptionOrNullimpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @tu.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, zu.d<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveChannel.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = (kotlinx.coroutines.channels.ReceiveChannel.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                tu.a0.throwOnFailure(r5)
                kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
                java.lang.Object r4 = r5.m5165unboximpl()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                tu.a0.throwOnFailure(r5)
                r0.label = r3
                java.lang.Object r4 = r4.mo5145receiveCatchingJP2dKIU(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m5158getOrNullimpl(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel, zu.d):java.lang.Object");
        }

        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return receiveChannel.cancel(th2);
        }

        @tu.f
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {770}, m = "receiveOrNull", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1, reason: invalid class name */
    public static final class AnonymousClass1<E> extends bv.d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.receiveOrNull(null, this);
        }
    }

    @tu.f
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @tu.f
    /* synthetic */ boolean cancel(Throwable th2);

    SelectClause1<E> getOnReceive();

    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator<E> iterator();

    @tu.f
    E poll();

    Object receive(zu.d<? super E> dVar);

    /* renamed from: receiveCatching-JP2dKIU */
    Object mo5145receiveCatchingJP2dKIU(zu.d<? super ChannelResult<? extends E>> dVar);

    @tu.f
    Object receiveOrNull(zu.d<? super E> dVar);

    /* renamed from: tryReceive-PtdJZtk */
    Object mo5146tryReceivePtdJZtk();
}
