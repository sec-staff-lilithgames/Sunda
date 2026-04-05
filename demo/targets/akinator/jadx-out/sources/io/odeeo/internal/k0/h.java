package io.odeeo.internal.k0;

import io.odeeo.internal.q0.g0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements io.odeeo.internal.d0.f {

    /* renamed from: a, reason: collision with root package name */
    public final d f64497a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f64498b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, g> f64499c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, e> f64500d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f64501e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f64497a = dVar;
        this.f64500d = map2;
        this.f64501e = map3;
        this.f64499c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f64498b = dVar.getEventTimesUs();
    }

    @Override // io.odeeo.internal.d0.f
    public List<io.odeeo.internal.d0.a> getCues(long j10) {
        return this.f64497a.getCues(j10, this.f64499c, this.f64500d, this.f64501e);
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        return this.f64498b[i10];
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return this.f64498b.length;
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = g0.binarySearchCeil(this.f64498b, j10, false, false);
        if (iBinarySearchCeil < this.f64498b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
