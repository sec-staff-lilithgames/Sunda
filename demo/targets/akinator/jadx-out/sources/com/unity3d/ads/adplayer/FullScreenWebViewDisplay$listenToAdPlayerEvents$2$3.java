package com.unity3d.ads.adplayer;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.adplayer.DisplayMessage;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends n implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, dVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // kv.p
    public final Object invoke(DisplayMessage displayMessage, d<? super x0> dVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        DisplayMessage displayMessage = (DisplayMessage) this.L$0;
        if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
            this.this$0.finish();
        } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
            this.this$0.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
        } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
            this.this$0.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
        }
        return x0.f87415a;
    }
}
