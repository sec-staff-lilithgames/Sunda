package com.fyber.inneractive.sdk.config.global.features;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends h implements o {
    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(45L);
        timeUnit.toMillis(5L);
        timeUnit.toMillis(5L);
        timeUnit.toMillis(45L);
        timeUnit.toMillis(10L);
        timeUnit.toMillis(2L);
        timeUnit.toMillis(15L);
        timeUnit.toMillis(8L);
    }

    public m() {
        super("bid_net");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        m mVar = new m();
        a(mVar);
        return mVar;
    }
}
