package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.internal.CombineKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends n implements p {
    final /* synthetic */ Flow<T>[] $flows;
    final /* synthetic */ q $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, zu.d<? super AnonymousClass1> dVar) {
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, dVar);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = tArr;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(Flow<? extends T>[] flowArr, q qVar, zu.d<? super FlowKt__ZipKt$combineTransformUnsafe$1> dVar) {
        super(2, dVar);
        this.$flows = flowArr;
        this.$transform = qVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, dVar);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flows;
            kv.a aVar = new kv.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                @Override // kv.a
                public final Void invoke() {
                    return null;
                }
            };
            e0.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
            this.label = 1;
            if (CombineKt.combineInternal(flowCollector, flowArr, aVar, anonymousClass1, this) == coroutine_suspended) {
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
        kv.a aVar = new kv.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kv.a
            public final Void invoke() {
                return null;
            }
        };
        e0.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
        b0.mark(0);
        CombineKt.combineInternal(flowCollector, flowArr, aVar, anonymousClass1, this);
        b0.mark(1);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
    }
}
