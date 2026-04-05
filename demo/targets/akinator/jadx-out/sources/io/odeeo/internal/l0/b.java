package io.odeeo.internal.l0;

import io.odeeo.internal.d0.f;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final b f64592b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List<io.odeeo.internal.d0.a> f64593a;

    public b(io.odeeo.internal.d0.a aVar) {
        this.f64593a = Collections.singletonList(aVar);
    }

    @Override // io.odeeo.internal.d0.f
    public List<io.odeeo.internal.d0.a> getCues(long j10) {
        return j10 >= 0 ? this.f64593a : Collections.EMPTY_LIST;
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        io.odeeo.internal.q0.a.checkArgument(i10 == 0);
        return 0L;
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return 1;
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public b() {
        this.f64593a = Collections.EMPTY_LIST;
    }
}
