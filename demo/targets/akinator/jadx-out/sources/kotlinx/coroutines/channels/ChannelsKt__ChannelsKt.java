package kotlinx.coroutines.channels;

import bv.n;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Object $element;
        final /* synthetic */ SendChannel $this_sendBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendChannel sendChannel, Object obj, zu.d dVar) {
            super(2, dVar);
            this.$this_sendBlocking = sendChannel;
            this.$element = obj;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass1(this.$this_sendBlocking, this.$element, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                SendChannel sendChannel = this.$this_sendBlocking;
                Object obj2 = this.$element;
                this.label = 1;
                if (sendChannel.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ E $element;
        final /* synthetic */ SendChannel<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SendChannel<? super E> sendChannel, E e10, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_trySendBlocking = sendChannel;
            this.$element = e10;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_trySendBlocking, this.$element, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objM7131constructorimpl;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    SendChannel<E> sendChannel = this.$this_trySendBlocking;
                    E e10 = this.$element;
                    int i11 = z.f87419c;
                    this.label = 1;
                    if (sendChannel.send(e10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                objM7131constructorimpl = z.m7131constructorimpl(x0Var);
            } catch (Throwable th2) {
                int i12 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            return ChannelResult.m5153boximpl(z.m7137isSuccessimpl(objM7131constructorimpl) ? ChannelResult.Companion.m5168successJP2dKIU(x0Var) : ChannelResult.Companion.m5166closedJP2dKIU(z.m7134exceptionOrNullimpl(objM7131constructorimpl)));
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super ChannelResult<x0>> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    @tu.f
    public static final /* synthetic */ void sendBlocking(SendChannel sendChannel, Object obj) throws InterruptedException {
        if (ChannelResult.m5163isSuccessimpl(sendChannel.mo5139trySendJP2dKIU(obj))) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(sendChannel, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e10) {
        Object objMo5139trySendJP2dKIU = sendChannel.mo5139trySendJP2dKIU(e10);
        if (objMo5139trySendJP2dKIU instanceof ChannelResult.Failed) {
            return ((ChannelResult) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass2(sendChannel, e10, null), 1, null)).m5165unboximpl();
        }
        return ChannelResult.Companion.m5168successJP2dKIU(x0.f87415a);
    }
}
