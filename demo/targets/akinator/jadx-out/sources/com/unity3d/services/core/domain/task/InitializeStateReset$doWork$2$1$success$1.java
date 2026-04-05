package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateReset$doWork$2$1$success$1 extends n implements p {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewApp webViewApp, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentApp = webViewApp;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$currentApp, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            WebView webView = this.$currentApp.getWebView();
            if (webView != null) {
                webView.destroy();
            }
            this.$currentApp.setWebView(null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, d<? super InitializeStateReset$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CoroutineDispatcher main = this.this$0.dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentApp, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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
        return ((InitializeStateReset$doWork$2$1$success$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
