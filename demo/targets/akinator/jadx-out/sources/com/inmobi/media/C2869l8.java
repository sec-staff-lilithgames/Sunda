package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2869l8 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2886m8 f33054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2869l8(C2886m8 c2886m8) {
        super(1);
        this.f33054a = c2886m8;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        EnumC3017u4 it = (EnumC3017u4) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f33054a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC3112ze.a(it));
        return tu.x0.f87415a;
    }
}
