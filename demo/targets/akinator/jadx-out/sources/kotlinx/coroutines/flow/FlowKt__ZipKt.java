package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.internal.CombineKt;
import kv.p;
import kv.q;
import kv.r;
import kv.s;
import kv.t;
import kv.u;
import tu.a0;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__ZipKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6, reason: invalid class name */
    public static final class AnonymousClass6 extends n implements p {
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1, reason: invalid class name */
        public static final class AnonymousClass1 implements kv.a {
            final /* synthetic */ Flow<T>[] $flows;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr) {
                this.$flows = flowArr;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
            @Override // kv.a
            public final T[] invoke() {
                int length = this.$flows.length;
                e0.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements q {
            final /* synthetic */ q $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, zu.d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    q qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (qVar.invoke(flowCollector, objArr, this) == coroutine_suspended) {
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

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, zu.d<? super x0> dVar) {
                e0.needClassReification();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, dVar);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = tArr;
                return anonymousClass2.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Flow<? extends T>[] flowArr, q qVar, zu.d<? super AnonymousClass6> dVar) {
            super(2, dVar);
            this.$flows = flowArr;
            this.$transform = qVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$flows, this.$transform, dVar);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T>[] flowArr = this.$flows;
                e0.needClassReification();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flows);
                e0.needClassReification();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
                this.label = 1;
                if (CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flows;
            e0.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flows);
            e0.needClassReification();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
            b0.mark(0);
            CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, anonymousClass2, this);
            b0.mark(1);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
            return ((AnonymousClass6) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7, reason: invalid class name */
    public static final class AnonymousClass7 extends n implements p {
        final /* synthetic */ Flow<T>[] $flowArray;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
        public static final class AnonymousClass1 implements kv.a {
            final /* synthetic */ Flow<T>[] $flowArray;

            public AnonymousClass1(Flow<T>[] flowArr) {
                this.$flowArray = flowArr;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
            @Override // kv.a
            public final T[] invoke() {
                int length = this.$flowArray.length;
                e0.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements q {
            final /* synthetic */ q $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, zu.d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    q qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (qVar.invoke(flowCollector, objArr, this) == coroutine_suspended) {
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

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, zu.d<? super x0> dVar) {
                e0.needClassReification();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, dVar);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = tArr;
                return anonymousClass2.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Flow<T>[] flowArr, q qVar, zu.d<? super AnonymousClass7> dVar) {
            super(2, dVar);
            this.$flowArray = flowArr;
            this.$transform = qVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$flowArray, this.$transform, dVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T>[] flowArr = this.$flowArray;
                e0.needClassReification();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
                e0.needClassReification();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
                this.label = 1;
                if (CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flowArray;
            e0.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
            e0.needClassReification();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
            b0.mark(0);
            CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, anonymousClass2, this);
            b0.mark(1);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
            return ((AnonymousClass7) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt.flowCombine(flow, flow2, qVar);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r rVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, null, rVar));
    }

    private static final /* synthetic */ <T, R> Flow<R> combineTransformUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, q qVar) {
        e0.needClassReification();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransformUnsafe$1(flowArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> Flow<R> combineUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, p pVar) {
        e0.needClassReification();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(flowArr, pVar);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final q qVar) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, new Flow[]{flow, flow2}, new kv.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kv.a
                    public final Void invoke() {
                        return null;
                    }
                }, new FlowKt__ZipKt$combine$1$1(qVar, null), dVar);
                return objCombineInternal == e.getCOROUTINE_SUSPENDED() ? objCombineInternal : x0.f87415a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r rVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2}, null, rVar));
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return CombineKt.zipImpl(flow, flow2, qVar);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, final r rVar) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends n implements q {
                final /* synthetic */ r $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(zu.d dVar, r rVar) {
                    super(3, dVar);
                    this.$transform$inlined = rVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
                
                    if (r1.emit(r8, r7) == r0) goto L15;
                 */
                @Override // bv.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                        int r1 = r7.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        tu.a0.throwOnFailure(r8)
                        goto L56
                    L12:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1a:
                        java.lang.Object r1 = r7.L$0
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        tu.a0.throwOnFailure(r8)
                        goto L4a
                    L22:
                        tu.a0.throwOnFailure(r8)
                        java.lang.Object r8 = r7.L$0
                        r1 = r8
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        java.lang.Object r8 = r7.L$1
                        java.lang.Object[] r8 = (java.lang.Object[]) r8
                        kv.r r4 = r7.$transform$inlined
                        r5 = 0
                        r5 = r8[r5]
                        r6 = r8[r3]
                        r8 = r8[r2]
                        r7.L$0 = r1
                        r7.label = r3
                        r3 = 6
                        kotlin.jvm.internal.b0.mark(r3)
                        java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                        r3 = 7
                        kotlin.jvm.internal.b0.mark(r3)
                        if (r8 != r0) goto L4a
                        goto L55
                    L4a:
                        r3 = 0
                        r7.L$0 = r3
                        r7.label = r2
                        java.lang.Object r8 = r1.emit(r8, r7)
                        if (r8 != r0) goto L56
                    L55:
                        return r0
                    L56:
                        tu.x0 r8 = tu.x0.f87415a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kv.q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, zu.d<? super x0> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(x0.f87415a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, zu.d dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new kv.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kv.a
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, rVar), dVar);
                return objCombineInternal == e.getCOROUTINE_SUSPENDED() ? objCombineInternal : x0.f87415a;
            }
        };
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, s sVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, sVar));
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, final s sVar) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends n implements q {
                final /* synthetic */ s $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(zu.d dVar, s sVar) {
                    super(3, dVar);
                    this.$transform$inlined = sVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
                
                    if (r1.emit(r11, r10) == r0) goto L15;
                 */
                @Override // bv.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        tu.a0.throwOnFailure(r11)
                        r9 = r10
                        goto L5c
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        java.lang.Object r1 = r10.L$0
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        tu.a0.throwOnFailure(r11)
                        r9 = r10
                        goto L50
                    L24:
                        tu.a0.throwOnFailure(r11)
                        java.lang.Object r11 = r10.L$0
                        r1 = r11
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        java.lang.Object r11 = r10.L$1
                        java.lang.Object[] r11 = (java.lang.Object[]) r11
                        kv.s r4 = r10.$transform$inlined
                        r5 = 0
                        r5 = r11[r5]
                        r6 = r11[r3]
                        r7 = r11[r2]
                        r8 = 3
                        r8 = r11[r8]
                        r10.L$0 = r1
                        r10.label = r3
                        r11 = 6
                        kotlin.jvm.internal.b0.mark(r11)
                        r9 = r10
                        java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                        r3 = 7
                        kotlin.jvm.internal.b0.mark(r3)
                        if (r11 != r0) goto L50
                        goto L5b
                    L50:
                        r3 = 0
                        r9.L$0 = r3
                        r9.label = r2
                        java.lang.Object r11 = r1.emit(r11, r10)
                        if (r11 != r0) goto L5c
                    L5b:
                        return r0
                    L5c:
                        tu.x0 r11 = tu.x0.f87415a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kv.q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, zu.d<? super x0> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(x0.f87415a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, zu.d dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new kv.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kv.a
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, sVar), dVar);
                return objCombineInternal == e.getCOROUTINE_SUSPENDED() ? objCombineInternal : x0.f87415a;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, t tVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new Flow[]{flow, flow2, flow3, flow4}, null, tVar));
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, final t tVar) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends n implements q {
                final /* synthetic */ t $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(zu.d dVar, t tVar) {
                    super(3, dVar);
                    this.$transform$inlined = tVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
                
                    if (r1.emit(r12, r11) == r0) goto L15;
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
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        tu.a0.throwOnFailure(r12)
                        r10 = r11
                        goto L5f
                    L13:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L1b:
                        java.lang.Object r1 = r11.L$0
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        tu.a0.throwOnFailure(r12)
                        r10 = r11
                        goto L53
                    L24:
                        tu.a0.throwOnFailure(r12)
                        java.lang.Object r12 = r11.L$0
                        r1 = r12
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        java.lang.Object r12 = r11.L$1
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        kv.t r4 = r11.$transform$inlined
                        r5 = 0
                        r5 = r12[r5]
                        r6 = r12[r3]
                        r7 = r12[r2]
                        r8 = 3
                        r8 = r12[r8]
                        r9 = 4
                        r9 = r12[r9]
                        r11.L$0 = r1
                        r11.label = r3
                        r12 = 6
                        kotlin.jvm.internal.b0.mark(r12)
                        r10 = r11
                        java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
                        r3 = 7
                        kotlin.jvm.internal.b0.mark(r3)
                        if (r12 != r0) goto L53
                        goto L5e
                    L53:
                        r3 = 0
                        r10.L$0 = r3
                        r10.label = r2
                        java.lang.Object r12 = r1.emit(r12, r11)
                        if (r12 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        tu.x0 r12 = tu.x0.f87415a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kv.q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, zu.d<? super x0> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(x0.f87415a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, zu.d dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new kv.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kv.a
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, tVar), dVar);
                return objCombineInternal == e.getCOROUTINE_SUSPENDED() ? objCombineInternal : x0.f87415a;
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, u uVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, uVar));
    }

    public static final /* synthetic */ <T, R> Flow<R> combine(Iterable<? extends Flow<? extends T>> iterable, p pVar) {
        Flow[] flowArr = (Flow[]) y0.toList(iterable).toArray(new Flow[0]);
        e0.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(flowArr, pVar);
    }

    public static final /* synthetic */ <T, R> Flow<R> combineTransform(Flow<? extends T>[] flowArr, q qVar) {
        e0.needClassReification();
        return FlowKt.flow(new AnonymousClass6(flowArr, qVar, null));
    }

    public static final /* synthetic */ <T, R> Flow<R> combineTransform(Iterable<? extends Flow<? extends T>> iterable, q qVar) {
        Flow[] flowArr = (Flow[]) y0.toList(iterable).toArray(new Flow[0]);
        e0.needClassReification();
        return FlowKt.flow(new AnonymousClass7(flowArr, qVar, null));
    }

    public static final /* synthetic */ <T, R> Flow<R> combine(Flow<? extends T>[] flowArr, p pVar) {
        e0.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(flowArr, pVar);
    }
}
