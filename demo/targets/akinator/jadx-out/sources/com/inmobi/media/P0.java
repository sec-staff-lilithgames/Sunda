package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f32118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(U0 u02) {
        super(1);
        this.f32118a = u02;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        EnumC3017u4 it = (EnumC3017u4) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        F5 f52 = this.f32118a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).b(strE, "load with retry failed - max retry reached - No network");
        }
        this.f32118a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC3112ze.a(it));
        return tu.x0.f87415a;
    }
}
