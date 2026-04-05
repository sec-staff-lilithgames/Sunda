package com.unity3d.ads.adplayer;

import androidx.lifecycle.c1;
import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.adplayer.DisplayMessage;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends n implements p {
    final /* synthetic */ CancellableContinuation<x0> $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ CancellableContinuation<x0> $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation<? super x0> cancellableContinuation, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = cancellableContinuation;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(this.this$0.opportunityId);
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (displayMessages.emit(webViewInstanceRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                a0.throwOnFailure(obj);
            }
            CoroutineScopeKt.ensureActive(coroutineScope);
            CancellableContinuation<x0> cancellableContinuation = this.$continuation;
            int i11 = z.f87419c;
            x0 x0Var = x0.f87415a;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(x0Var));
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation<? super x0> cancellableContinuation, d<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = cancellableContinuation;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(this.this$0), this.this$0.getDispatchers().getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2, null);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<? super DisplayMessage> flowCollector, d<? super x0> dVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
    }
}
