package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Vc {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f35646a;

    public Vc(D0 eventsWrapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.f35646a = eventsWrapper;
    }

    public final void a() {
        this.f35646a.a(A0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.f35646a.a(A0.PAUSE_AD, null);
    }

    public final void c() {
        this.f35646a.a(A0.RESUME_AD, null);
    }

    public final void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f35646a.a(A0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j10, int i10, String reason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", reason);
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f35646a.a(A0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double d10) {
        this.f35646a.a(A0.OPERATIONAL_SET_CONFIGURATIONS, uu.o1.mapOf(tu.e0.to(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10)));
    }
}
