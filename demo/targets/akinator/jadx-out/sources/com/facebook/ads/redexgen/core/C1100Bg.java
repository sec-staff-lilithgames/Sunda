package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/common/clock/IntervalClock;", "Lcom/facebook/common/time/MonotonicClock;", "<init>", "()V", "nowNanos", "", "now", "fbandroid.java.com.facebook.common.clock.clock"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1100Bg implements InterfaceC2119gK {
    public static final C1100Bg A00 = new C1100Bg();

    @Override // com.facebook.ads.redexgen.core.InterfaceC2119gK
    public final long AC6() {
        return SystemClock.elapsedRealtime();
    }
}
