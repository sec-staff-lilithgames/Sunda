package io.odeeo.internal.i0;

import io.odeeo.internal.d0.f;
import io.odeeo.internal.q0.g0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final List<List<io.odeeo.internal.d0.a>> f64335a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Long> f64336b;

    public d(List<List<io.odeeo.internal.d0.a>> list, List<Long> list2) {
        this.f64335a = list;
        this.f64336b = list2;
    }

    @Override // io.odeeo.internal.d0.f
    public List<io.odeeo.internal.d0.a> getCues(long j10) {
        int iBinarySearchFloor = g0.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f64336b, Long.valueOf(j10), true, false);
        return iBinarySearchFloor == -1 ? Collections.EMPTY_LIST : this.f64335a.get(iBinarySearchFloor);
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0);
        io.odeeo.internal.q0.a.checkArgument(i10 < this.f64336b.size());
        return this.f64336b.get(i10).longValue();
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return this.f64336b.size();
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = g0.binarySearchCeil((List<? extends Comparable<? super Long>>) this.f64336b, Long.valueOf(j10), false, false);
        if (iBinarySearchCeil < this.f64336b.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
