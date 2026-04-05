package com.sfbx.appconsent.core.repository;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.dao.ReducerDao;
import kotlin.jvm.internal.e0;
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
public final class ReducerRepository {
    private final ReducerDao reducerDao;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ReducerRepository$getReducer$1", f = "ReducerRepository.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ReducerRepository$getReducer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = ReducerRepository.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String assetReducer = ReducerRepository.this.reducerDao.getAssetReducer();
                this.label = 1;
                if (flowCollector.emit(assetReducer, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super String> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.sfbx.appconsent.core.repository.ReducerRepository$getReducer$2", f = "ReducerRepository.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.ReducerRepository$getReducer$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String assetReducer = ReducerRepository.this.reducerDao.getAssetReducer();
                this.label = 1;
                if (flowCollector.emit(assetReducer, this) == coroutine_suspended) {
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

        @Override // kv.q
        public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = ReducerRepository.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = flowCollector;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    public ReducerRepository(ReducerDao reducerDao) {
        e0.checkNotNullParameter(reducerDao, "reducerDao");
        this.reducerDao = reducerDao;
    }

    public final Flow<String> getReducer() {
        return FlowKt.flowOn(FlowKt.m5171catch(FlowKt.flow(new AnonymousClass1(null)), new AnonymousClass2(null)), Dispatchers.getIO());
    }
}
