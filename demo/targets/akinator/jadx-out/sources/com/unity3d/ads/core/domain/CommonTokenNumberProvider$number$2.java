package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonTokenNumberProvider$number$2 extends f0 implements kv.a {
    final /* synthetic */ SessionRepository $sessionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTokenNumberProvider$number$2(SessionRepository sessionRepository) {
        super(0);
        this.$sessionRepository = sessionRepository;
    }

    @Override // kv.a
    public final Integer invoke() {
        return Integer.valueOf(this.$sessionRepository.getHeaderBiddingTokenCounter());
    }
}
