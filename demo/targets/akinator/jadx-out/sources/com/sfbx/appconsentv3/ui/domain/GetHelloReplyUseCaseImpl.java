package com.sfbx.appconsentv3.ui.domain;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentCoreContract;
import com.sfbx.appconsentv3.ui.model.HelloReplyCore;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetHelloReplyUseCaseImpl implements GetHelloReplyUseCase {
    private final AppConsentCore appConsentCore;
    private final CoroutineDispatcher defaultDispatcher;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2", f = "GetHelloReplyUseCaseImpl.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$2", f = "GetHelloReplyUseCaseImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C05092 extends n implements q {
            /* synthetic */ Object L$0;
            int label;

            public C05092(d<? super C05092> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                throw ((Throwable) this.L$0);
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super x0> flowCollector, Throwable th2, d<? super x0> dVar) {
                C05092 c05092 = new C05092(dVar);
                c05092.L$0 = th2;
                return c05092.invokeSuspend(x0.f87415a);
            }
        }

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = GetHelloReplyUseCaseImpl.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                final Flow helloReply$default = AppConsentCoreContract.DefaultImpls.getHelloReply$default(GetHelloReplyUseCaseImpl.this.appConsentCore, false, 1, null);
                Flow flowM5171catch = FlowKt.m5171catch(new Flow<x0>() { // from class: com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $$this$flow$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        @f(c = "com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1$2", f = "GetHelloReplyUseCaseImpl.kt", i = {}, l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends bv.d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // bv.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, FlowCollector flowCollector2) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$$this$flow$inlined = flowCollector2;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r7, zu.d r8) {
                            /*
                                r6 = this;
                                boolean r0 = r8 instanceof com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r8
                                com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r8)
                            L18:
                                java.lang.Object r8 = r0.result
                                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                tu.x0 r3 = tu.x0.f87415a
                                r4 = 2
                                r5 = 1
                                if (r2 == 0) goto L3e
                                if (r2 == r5) goto L36
                                if (r2 != r4) goto L2e
                                tu.a0.throwOnFailure(r8)
                                goto L63
                            L2e:
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                r7.<init>(r8)
                                throw r7
                            L36:
                                java.lang.Object r7 = r0.L$0
                                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                                tu.a0.throwOnFailure(r8)
                                goto L57
                            L3e:
                                tu.a0.throwOnFailure(r8)
                                kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                                com.sfbx.appconsent.core.model.api.proto.HelloReply r7 = (com.sfbx.appconsent.core.model.api.proto.HelloReply) r7
                                kotlinx.coroutines.flow.FlowCollector r2 = r6.$$this$flow$inlined
                                com.sfbx.appconsentv3.ui.model.HelloReplyCore r7 = com.sfbx.appconsentv3.ui.model.HelloReplyCoreKt.convertTo(r7)
                                r0.L$0 = r8
                                r0.label = r5
                                java.lang.Object r7 = r2.emit(r7, r0)
                                if (r7 != r1) goto L56
                                goto L62
                            L56:
                                r7 = r8
                            L57:
                                r8 = 0
                                r0.L$0 = r8
                                r0.label = r4
                                java.lang.Object r7 = r7.emit(r3, r0)
                                if (r7 != r1) goto L63
                            L62:
                                return r1
                            L63:
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsentv3.ui.domain.GetHelloReplyUseCaseImpl$invoke$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super x0> flowCollector2, d dVar) {
                        Object objCollect = helloReply$default.collect(new AnonymousClass2(flowCollector2, flowCollector), dVar);
                        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                    }
                }, new C05092(null));
                this.label = 1;
                if (FlowKt.collect(flowM5171catch, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super HelloReplyCore> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public GetHelloReplyUseCaseImpl(CoroutineDispatcher defaultDispatcher, AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.defaultDispatcher = defaultDispatcher;
        this.appConsentCore = appConsentCore;
    }

    @Override // com.sfbx.appconsentv3.ui.domain.SimpleFlowUseCase
    public Object invoke(d<? super Flow<? extends HelloReplyCore>> dVar) {
        return FlowKt.flowOn(FlowKt.flow(new AnonymousClass2(null)), this.defaultDispatcher);
    }

    public /* synthetic */ GetHelloReplyUseCaseImpl(CoroutineDispatcher coroutineDispatcher, AppConsentCore appConsentCore, int i10, u uVar) {
        this((i10 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, appConsentCore);
    }
}
