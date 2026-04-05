package com.unity3d.ads.core.data.datasource;

import av.e;
import bv.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import k4.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UniversalRequestDataSource {
    private final n universalRequestStore;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2, reason: invalid class name */
    public static final class AnonymousClass2 extends bv.n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (!(th2 instanceof k4.e)) {
                    throw th2;
                }
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                e0.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(defaultInstance, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super UniversalRequestStoreOuterClass.UniversalRequestStore> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37662 extends bv.n implements p {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37662(String str, d<? super C37662> dVar) {
            super(2, dVar);
            this.$key = str;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37662 c37662 = new C37662(this.$key, dVar);
            c37662.L$0 = obj;
            return c37662;
        }

        @Override // kv.p
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar) {
            return ((C37662) create(universalRequestStore, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            e0.checkNotNullExpressionValue(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37672 extends bv.n implements p {
        final /* synthetic */ ByteString $data;
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37672(String str, ByteString byteString, d<? super C37672> dVar) {
            super(2, dVar);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37672 c37672 = new C37672(this.$key, this.$data, dVar);
            c37672.L$0 = obj;
            return c37672;
        }

        @Override // kv.p
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar) {
            return ((C37672) create(universalRequestStore, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            e0.checkNotNullExpressionValue(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public UniversalRequestDataSource(n universalRequestStore) {
        e0.checkNotNullParameter(universalRequestStore, "universalRequestStore");
        this.universalRequestStore = universalRequestStore;
    }

    public final Object get(d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar) {
        return FlowKt.first(FlowKt.m5171catch(this.universalRequestStore.getData(), new AnonymousClass2(null)), dVar);
    }

    public final Object remove(String str, d<? super x0> dVar) {
        Object objUpdateData = this.universalRequestStore.updateData(new C37662(str, null), dVar);
        return objUpdateData == e.getCOROUTINE_SUSPENDED() ? objUpdateData : x0.f87415a;
    }

    public final Object set(String str, ByteString byteString, d<? super x0> dVar) {
        Object objUpdateData = this.universalRequestStore.updateData(new C37672(str, byteString, null), dVar);
        return objUpdateData == e.getCOROUTINE_SUSPENDED() ? objUpdateData : x0.f87415a;
    }
}
