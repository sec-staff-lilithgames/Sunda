package io.odeeo.internal.j0;

import io.odeeo.internal.d0.f;
import io.odeeo.internal.q0.g0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.d0.a[] f64375a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f64376b;

    public b(io.odeeo.internal.d0.a[] aVarArr, long[] jArr) {
        this.f64375a = aVarArr;
        this.f64376b = jArr;
    }

    @Override // io.odeeo.internal.d0.f
    public List<io.odeeo.internal.d0.a> getCues(long j10) {
        io.odeeo.internal.d0.a aVar;
        int iBinarySearchFloor = g0.binarySearchFloor(this.f64376b, j10, true, false);
        return (iBinarySearchFloor == -1 || (aVar = this.f64375a[iBinarySearchFloor]) == io.odeeo.internal.d0.a.f63544r) ? Collections.EMPTY_LIST : Collections.singletonList(aVar);
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0);
        io.odeeo.internal.q0.a.checkArgument(i10 < this.f64376b.length);
        return this.f64376b[i10];
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return this.f64376b.length;
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = g0.binarySearchCeil(this.f64376b, j10, false, false);
        if (iBinarySearchCeil < this.f64376b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
