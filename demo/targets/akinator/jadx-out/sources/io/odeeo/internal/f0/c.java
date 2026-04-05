package io.odeeo.internal.f0;

import io.odeeo.internal.d0.f;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final List<io.odeeo.internal.d0.a> f64009a;

    public c(List<io.odeeo.internal.d0.a> list) {
        this.f64009a = list;
    }

    @Override // io.odeeo.internal.d0.f
    public List<io.odeeo.internal.d0.a> getCues(long j10) {
        return this.f64009a;
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return 1;
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }
}
