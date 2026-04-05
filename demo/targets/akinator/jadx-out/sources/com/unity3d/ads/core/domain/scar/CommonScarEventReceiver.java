package com.unity3d.ads.core.domain.scar;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kv.p;
import tu.x0;
import uu.c2;
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final MutableSharedFlow<GmaEventData> _gmaEventFlow;
    private final MutableSharedFlow<String> _versionFlow;
    private final SharedFlow<GmaEventData> gmaEventFlow;
    private final CoroutineScope scope;
    private final SharedFlow<String> versionFlow;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", i = {}, l = {35, 41, 52, TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Enum<?> r12, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$eventId = r12;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r3.emit(r2, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        
            if (r3.emit(r7, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        
            if (r3.emit(r6, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        
            if (r2.emit(r11, r21) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public CommonScarEventReceiver(CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._versionFlow = mutableSharedFlowMutableSharedFlow$default;
        this.versionFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<GmaEventData> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._gmaEventFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.gmaEventFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final SharedFlow<GmaEventData> getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final SharedFlow<String> getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
        e0.checkNotNullParameter(eventCategory, "eventCategory");
        e0.checkNotNullParameter(eventId, "eventId");
        e0.checkNotNullParameter(params, "params");
        if (!y0.contains(c2.setOf((Object[]) new WebViewEventCategory[]{WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER}), eventCategory)) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(eventId, params, this, null), 3, null);
        return true;
    }
}
