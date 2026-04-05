package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.explorestack.protobuf.openrtb.LossReason;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", i = {0, 0}, l = {206, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
public final class LegacyShowUseCase$invoke$4$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase.AnonymousClass4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase.AnonymousClass4<? super T> anonymousClass4, zu.d<? super LegacyShowUseCase$invoke$4$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass4;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (zu.d<? super x0>) this);
    }
}
