package io.odeeo.internal.m0;

import io.odeeo.internal.q0.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements io.odeeo.internal.d0.f {

    /* renamed from: a, reason: collision with root package name */
    public final List<e> f64686a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f64687b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f64688c;

    public i(List<e> list) {
        this.f64686a = Collections.unmodifiableList(new ArrayList(list));
        this.f64687b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f64687b;
            jArr[i11] = eVar.f64657b;
            jArr[i11 + 1] = eVar.f64658c;
        }
        long[] jArr2 = this.f64687b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f64688c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // io.odeeo.internal.d0.f
    public List<io.odeeo.internal.d0.a> getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f64686a.size(); i10++) {
            long[] jArr = this.f64687b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f64686a.get(i10);
                io.odeeo.internal.d0.a aVar = eVar.f64656a;
                if (aVar.f63550e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new ni.a(21));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f64656a.buildUpon().setLine((-1) - i12, 1).build());
        }
        return arrayList;
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0);
        io.odeeo.internal.q0.a.checkArgument(i10 < this.f64688c.length);
        return this.f64688c[i10];
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return this.f64688c.length;
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = g0.binarySearchCeil(this.f64688c, j10, false, false);
        if (iBinarySearchCeil < this.f64688c.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
