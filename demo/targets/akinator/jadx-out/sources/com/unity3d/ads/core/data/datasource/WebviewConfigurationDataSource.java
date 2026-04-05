package com.unity3d.ads.core.data.datasource;

import av.e;
import bv.f;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
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
public final class WebviewConfigurationDataSource {
    private final n webviewConfigurationStore;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
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
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
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
        public final Object invoke(FlowCollector<? super WebviewConfigurationStore.WebViewConfigurationStore> flowCollector, Throwable th2, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37682 extends bv.n implements p {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37682(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, d<? super C37682> dVar) {
            super(2, dVar);
            this.$data = webViewConfigurationStore;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C37682(this.$data, dVar);
        }

        @Override // kv.p
        public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, d<? super WebviewConfigurationStore.WebViewConfigurationStore> dVar) {
            return ((C37682) create(webViewConfigurationStore, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(n webviewConfigurationStore) {
        e0.checkNotNullParameter(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    public final Object get(d<? super WebviewConfigurationStore.WebViewConfigurationStore> dVar) {
        return FlowKt.first(FlowKt.m5171catch(this.webviewConfigurationStore.getData(), new AnonymousClass2(null)), dVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, d<? super x0> dVar) {
        Object objUpdateData = this.webviewConfigurationStore.updateData(new C37682(webViewConfigurationStore, null), dVar);
        return objUpdateData == e.getCOROUTINE_SUSPENDED() ? objUpdateData : x0.f87415a;
    }
}
