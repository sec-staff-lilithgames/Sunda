package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {
    private final o number$delegate;

    public CommonTokenNumberProvider(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.number$delegate = q.lazy(new CommonTokenNumberProvider$number$2(sessionRepository));
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
