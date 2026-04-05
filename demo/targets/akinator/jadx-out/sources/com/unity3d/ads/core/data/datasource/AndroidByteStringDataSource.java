package com.unity3d.ads.core.data.datasource;

import av.e;
import bv.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
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
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final n dataStore;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2, reason: invalid class name */
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
                ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
                ByteString EMPTY = ByteString.EMPTY;
                e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
                dsl_create.setData(EMPTY);
                ByteStringStoreOuterClass.ByteStringStore byteStringStore_build = dsl_create._build();
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(byteStringStore_build, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super ByteStringStoreOuterClass.ByteStringStore> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37642 extends bv.n implements p {
        final /* synthetic */ ByteString $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37642(ByteString byteString, d<? super C37642> dVar) {
            super(2, dVar);
            this.$data = byteString;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C37642 c37642 = new C37642(this.$data, dVar);
            c37642.L$0 = obj;
            return c37642;
        }

        @Override // kv.p
        public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
            return ((C37642) create(byteStringStore, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
            e0.checkNotNullExpressionValue(byteStringStoreBuild, "currentData.toBuilder()\n…\n                .build()");
            return byteStringStoreBuild;
        }
    }

    public AndroidByteStringDataSource(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        return FlowKt.first(FlowKt.m5171catch(this.dataStore.getData(), new AnonymousClass2(null)), dVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, d<? super x0> dVar) {
        Object objUpdateData = this.dataStore.updateData(new C37642(byteString, null), dVar);
        return objUpdateData == e.getCOROUTINE_SUSPENDED() ? objUpdateData : x0.f87415a;
    }
}
