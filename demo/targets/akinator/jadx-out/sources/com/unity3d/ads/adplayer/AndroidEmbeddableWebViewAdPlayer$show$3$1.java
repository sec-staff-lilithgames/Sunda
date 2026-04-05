package com.unity3d.ads.adplayer;

import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {97, 98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends n implements p {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, d<? super AndroidEmbeddableWebViewAdPlayer$show$3$1> dVar) {
        super(2, dVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L16
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L16:
            tu.a0.throwOnFailure(r5)
            goto L52
        L1a:
            tu.a0.throwOnFailure(r5)
            goto L38
        L1e:
            tu.a0.throwOnFailure(r5)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.ShowOptions r1 = r4.$showOptions
            com.unity3d.ads.adplayer.AndroidShowOptions r1 = (com.unity3d.ads.adplayer.AndroidShowOptions) r1
            java.util.Map r1 = r1.getUnityAdsShowOptions()
            r4.label = r3
            java.lang.Object r5 = r5.requestShow(r1, r4)
            if (r5 != r0) goto L38
            goto L51
        L38:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.core.data.datasource.LifecycleDataSource r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getLifecycleDataSource$p(r5)
            kotlinx.coroutines.flow.StateFlow r5 = r5.getAppActive()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r3 = r4.this$0
            r1.<init>()
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            tu.k r5 = new tu.k
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
