package lf;

import com.google.android.exoplayer2.util.n1;
import ef.j;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final ef.b[] f73369b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f73370c;

    public b(ef.b[] bVarArr, long[] jArr) {
        this.f73369b = bVarArr;
        this.f73370c = jArr;
    }

    @Override // ef.j
    public List<ef.b> getCues(long j10) {
        ef.b bVar;
        int iBinarySearchFloor = n1.binarySearchFloor(this.f73370c, j10, true, false);
        return (iBinarySearchFloor == -1 || (bVar = this.f73369b[iBinarySearchFloor]) == ef.b.f54284t) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
    }

    @Override // ef.j
    public long getEventTime(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0);
        long[] jArr = this.f73370c;
        com.google.android.exoplayer2.util.a.checkArgument(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // ef.j
    public int getEventTimeCount() {
        return this.f73370c.length;
    }

    @Override // ef.j
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = this.f73370c;
        int iBinarySearchCeil = n1.binarySearchCeil(jArr, j10, false, false);
        if (iBinarySearchCeil < jArr.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
