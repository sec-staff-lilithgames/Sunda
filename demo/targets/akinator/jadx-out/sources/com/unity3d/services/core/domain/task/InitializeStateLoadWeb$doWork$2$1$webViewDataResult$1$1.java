package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1", f = "InitializeStateLoadWeb.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 extends n implements p {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1", f = "InitializeStateLoadWeb.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ InitializeStateLoadWeb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = initializeStateLoadWeb;
            this.$request = httpRequest;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$request, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            HttpClient httpClient = this.this$0.httpClient;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = httpClient.execute(httpRequest, this);
            return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, d<? super InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(this.this$0, this.$request, dVar);
        initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1;
    }

    public final Object invoke(int i10, d<? super HttpResponse> dVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1) create(Integer.valueOf(i10), dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        if (this.I$0 > 0) {
            InitializeEventsMetricSender.getInstance().onRetryWebview();
        }
        CoroutineDispatcher io2 = this.this$0.dispatchers.getIo();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
        this.label = 1;
        Object objWithContext = BuildersKt.withContext(io2, anonymousClass1, this);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (d<? super HttpResponse>) obj2);
    }
}
