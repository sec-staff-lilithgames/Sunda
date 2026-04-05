package com.unity3d.services.ads.offerwall;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$4", f = "OfferwallAdapterBridge.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$4 extends n implements p {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$4(OfferwallAdapterBridge offerwallAdapterBridge, String str, d<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$4> dVar) {
        super(2, dVar);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this.this$0, this.$placementName, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0._offerwallEventFlow;
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_SHOW;
            String str = this.$placementName;
            if (str == null) {
                str = "";
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            if (mutableSharedFlow.emit(offerwallEventData, this) == coroutine_suspended) {
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
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$4) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
