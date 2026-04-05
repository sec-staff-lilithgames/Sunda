package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.ClickCoordinateTracker;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MRAIDPresenter$clickCoordinateTracker$2 extends f0 implements kv.a {
    final /* synthetic */ MRAIDPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDPresenter$clickCoordinateTracker$2(MRAIDPresenter mRAIDPresenter) {
        super(0);
        this.this$0 = mRAIDPresenter;
    }

    @Override // kv.a
    public final ClickCoordinateTracker invoke() {
        Context context = this.this$0.adWidget.getContext();
        e0.checkNotNullExpressionValue(context, "adWidget.context");
        return new ClickCoordinateTracker(context, this.this$0.advertisement);
    }
}
