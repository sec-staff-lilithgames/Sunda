package com.unity3d.services.ads.offerwall;

import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", i = {}, l = {77, 83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends n implements p {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z10, OfferwallAdapterBridge offerwallAdapterBridge, String str, d<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$1> dVar) {
        super(2, dVar);
        this.$placementAvailable = z10;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r12.emit(r4, r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r12.emit(r3, r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        return r0;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L17:
            tu.a0.throwOnFailure(r12)
            goto L74
        L1b:
            tu.a0.throwOnFailure(r12)
            boolean r12 = r11.$placementAvailable
            java.lang.String r1 = ""
            if (r12 == 0) goto L46
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            kotlinx.coroutines.flow.MutableSharedFlow r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            java.lang.String r2 = r11.$placementName
            if (r2 != 0) goto L34
            r6 = r1
            goto L35
        L34:
            r6 = r2
        L35:
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r3
            java.lang.Object r12 = r12.emit(r4, r11)
            if (r12 != r0) goto L74
            goto L73
        L46:
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            java.util.HashMap r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$getPlacementsMap$p(r12)
            java.lang.String r3 = r11.$placementName
            if (r3 != 0) goto L51
            r3 = r1
        L51:
            r12.remove(r3)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            kotlinx.coroutines.flow.MutableSharedFlow r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r3 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r4 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED
            java.lang.String r5 = r11.$placementName
            if (r5 != 0) goto L63
            r5 = r1
        L63:
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.label = r2
            java.lang.Object r12 = r12.emit(r3, r11)
            if (r12 != r0) goto L74
        L73:
            return r0
        L74:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
