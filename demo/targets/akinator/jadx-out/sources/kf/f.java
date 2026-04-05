package kf;

import com.google.android.exoplayer2.util.n1;
import ef.j;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: b, reason: collision with root package name */
    public final List f70936b;

    /* renamed from: c, reason: collision with root package name */
    public final List f70937c;

    public f(List<List<ef.b>> list, List<Long> list2) {
        this.f70936b = list;
        this.f70937c = list2;
    }

    @Override // ef.j
    public List<ef.b> getCues(long j10) {
        int iBinarySearchFloor = n1.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f70937c, Long.valueOf(j10), true, false);
        return iBinarySearchFloor == -1 ? Collections.EMPTY_LIST : (List) this.f70936b.get(iBinarySearchFloor);
    }

    @Override // ef.j
    public long getEventTime(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0);
        List list = this.f70937c;
        com.google.android.exoplayer2.util.a.checkArgument(i10 < list.size());
        return ((Long) list.get(i10)).longValue();
    }

    @Override // ef.j
    public int getEventTimeCount() {
        return this.f70937c.size();
    }

    @Override // ef.j
    public int getNextEventTimeIndex(long j10) {
        Long lValueOf = Long.valueOf(j10);
        List list = this.f70937c;
        int iBinarySearchCeil = n1.binarySearchCeil((List<? extends Comparable<? super Long>>) list, lValueOf, false, false);
        if (iBinarySearchCeil < list.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
