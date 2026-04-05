package com.ironsource;

import com.ironsource.InterfaceC3301k7;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r implements InterfaceC3301k7, InterfaceC3301k7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, AtomicBoolean> f38246a = uu.p1.mapOf(tu.e0.to(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), tu.e0.to(IronSource.a.f37252c, new AtomicBoolean(false)), tu.e0.to(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC3301k7.a
    public void a(IronSource.a adFormat, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f38246a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z10);
        }
    }

    @Override // com.ironsource.InterfaceC3301k7
    public boolean a(IronSource.a adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f38246a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
