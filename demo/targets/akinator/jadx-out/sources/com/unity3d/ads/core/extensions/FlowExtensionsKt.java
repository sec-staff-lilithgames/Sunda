package com.unity3d.ads.core.extensions;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FlowExtensionsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", i = {0}, l = {15, 17}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ boolean $active;
        final /* synthetic */ p $block;
        final /* synthetic */ Flow<T> $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", i = {}, l = {10}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05461 extends n implements p {
            final /* synthetic */ ProducerScope<T> $$this$channelFlow;
            final /* synthetic */ Flow<T> $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05461(Flow<? extends T> flow, ProducerScope<? super T> producerScope, d<? super C05461> dVar) {
                super(2, dVar);
                this.$this_timeoutAfter = flow;
                this.$$this$channelFlow = producerScope;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C05461(this.$this_timeoutAfter, this.$$this$channelFlow, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Flow<T> flow = this.$this_timeoutAfter;
                    final ProducerScope<T> producerScope = this.$$this$channelFlow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(T t10, d<? super x0> dVar) {
                            Object objSend = producerScope.send(t10, dVar);
                            return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                SendChannel.DefaultImpls.close$default(this.$$this$channelFlow, null, 1, null);
                return x0.f87415a;
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C05461) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        public /* synthetic */ class AnonymousClass2 extends a implements kv.a {
            public AnonymousClass2(Object obj) {
                super(0, obj, ProducerScope.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3508invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m3508invoke() {
                SendChannel.DefaultImpls.close$default((ProducerScope) this.receiver, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(long j10, boolean z10, p pVar, Flow<? extends T> flow, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$timeoutMillis = j10;
            this.$active = z10;
            this.$block = pVar;
            this.$this_timeoutAfter = flow;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            if (r12.invoke(r4, r11) == r0) goto L18;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                tu.a0.throwOnFailure(r12)
                goto L5d
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                tu.a0.throwOnFailure(r12)
                goto L47
            L23:
                tu.a0.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                r5 = r12
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
                kotlinx.coroutines.flow.Flow<T> r12 = r11.$this_timeoutAfter
                r8.<init>(r12, r5, r2)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                long r6 = r11.$timeoutMillis
                r11.L$0 = r5
                r11.label = r4
                java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r6, r11)
                if (r12 != r0) goto L46
                goto L5c
            L46:
                r1 = r5
            L47:
                boolean r12 = r11.$active
                if (r12 == 0) goto L5d
                kv.p r12 = r11.$block
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r4 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
                r4.<init>(r1)
                r11.L$0 = r2
                r11.label = r3
                java.lang.Object r12 = r12.invoke(r4, r11)
                if (r12 != r0) goto L5d
            L5c:
                return r0
            L5d:
                tu.x0 r12 = tu.x0.f87415a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super T> producerScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final <T> Flow<T> timeoutAfter(Flow<? extends T> flow, long j10, boolean z10, p block) {
        e0.checkNotNullParameter(flow, "<this>");
        e0.checkNotNullParameter(block, "block");
        return FlowKt.channelFlow(new AnonymousClass1(j10, z10, block, flow, null));
    }

    public static /* synthetic */ Flow timeoutAfter$default(Flow flow, long j10, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(flow, j10, z10, pVar);
    }
}
