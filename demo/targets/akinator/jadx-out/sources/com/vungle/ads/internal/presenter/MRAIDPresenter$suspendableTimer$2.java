package com.vungle.ads.internal.presenter;

import com.vungle.ads.HeartbeatMissingError;
import com.vungle.ads.internal.util.SuspendableTimer;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MRAIDPresenter$suspendableTimer$2 extends f0 implements kv.a {
    final /* synthetic */ MRAIDPresenter this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements kv.a {
        final /* synthetic */ MRAIDPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MRAIDPresenter mRAIDPresenter) {
            super(0);
            this.this$0 = mRAIDPresenter;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3634invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3634invoke() {
            this.this$0.reportErrorAndCloseAd(new HeartbeatMissingError());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDPresenter$suspendableTimer$2(MRAIDPresenter mRAIDPresenter) {
        super(0);
        this.this$0 = mRAIDPresenter;
    }

    @Override // kv.a
    public final SuspendableTimer invoke() {
        return new SuspendableTimer(6.0d, true, null, new AnonymousClass1(this.this$0), 4, null);
    }
}
