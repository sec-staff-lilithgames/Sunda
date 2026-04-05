package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O1 f32041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(O1 o12) {
        super(1);
        this.f32041a = o12;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        EnumC3017u4 it = (EnumC3017u4) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        O1 o12 = this.f32041a;
        F5 f52 = o12.f32321j;
        if (f52 != null) {
            String str = o12.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((G5) f52).b(str, "loadWithRetry error - " + it);
        }
        this.f32041a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC3112ze.a(it));
        return tu.x0.f87415a;
    }
}
