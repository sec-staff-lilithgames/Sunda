package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import p0.o2;
import tu.a0;
import tu.x0;
import uu.y0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ChannelFlow<T> implements FusibleFlow<T> {
    public final int capacity;
    public final m context;
    public final BufferOverflow onBufferOverflow;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ FlowCollector<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector, ChannelFlow<T> channelFlow, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$collector = flowCollector;
            this.this$0 = channelFlow;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector<T> flowCollector = this.$collector;
                ReceiveChannel<T> receiveChannelProduceImpl = this.this$0.produceImpl(coroutineScope);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, receiveChannelProduceImpl, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public ChannelFlow(m mVar, int i10, BufferOverflow bufferOverflow) {
        this.context = mVar;
        this.capacity = i10;
        this.onBufferOverflow = bufferOverflow;
    }

    public static /* synthetic */ <T> Object collect$suspendImpl(ChannelFlow<T> channelFlow, FlowCollector<? super T> flowCollector, d<? super x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(flowCollector, channelFlow, null), dVar);
        return objCoroutineScope == e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    public String additionalToStringProps() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, d<? super x0> dVar) {
        return collect$suspendImpl(this, flowCollector, dVar);
    }

    public abstract Object collectTo(ProducerScope<? super T> producerScope, d<? super x0> dVar);

    public abstract ChannelFlow<T> create(m mVar, int i10, BufferOverflow bufferOverflow);

    public Flow<T> dropChannelOperators() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlinx.coroutines.flow.Flow<T> fuse(zu.m r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            zu.m r0 = r1.context
            zu.m r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
        L25:
            zu.m r0 = r1.context
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.capacity
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.onBufferOverflow
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.create(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.fuse(zu.m, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.Flow");
    }

    public final p getCollectToFun$kotlinx_coroutines_core() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce$default(coroutineScope, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strAdditionalToStringProps = additionalToStringProps();
        if (strAdditionalToStringProps != null) {
            arrayList.add(strAdditionalToStringProps);
        }
        if (this.context != zu.n.f98854b) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(DebugStringsKt.getClassSimpleName(this));
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        return o2.q(sb2, y0.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null), AbstractJsonLexerKt.END_LIST);
    }
}
