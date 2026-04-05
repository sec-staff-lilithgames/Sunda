package qp;

import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements hp.i {

    /* renamed from: b, reason: collision with root package name */
    public final List f83474b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f83475c;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f83476e;

    public j(List<d> list) {
        this.f83474b = Collections.unmodifiableList(new ArrayList(list));
        this.f83475c = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f83475c;
            jArr[i11] = dVar.f83445b;
            jArr[i11 + 1] = dVar.f83446c;
        }
        long[] jArr2 = this.f83475c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f83476e = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // hp.i
    public List<in.b> getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f83474b;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f83475c;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) list.get(i10);
                in.b bVar = dVar.f83444a;
                if (bVar.f59782e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new ni.a(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f83444a.buildUpon().setLine((-1) - i12, 1).build());
        }
        return arrayList;
    }

    @Override // hp.i
    public long getEventTime(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0);
        long[] jArr = this.f83476e;
        io.bidmachine.media3.common.util.a.checkArgument(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // hp.i
    public int getEventTimeCount() {
        return this.f83476e.length;
    }

    @Override // hp.i
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = this.f83476e;
        int iBinarySearchCeil = a1.binarySearchCeil(jArr, j10, false, false);
        if (iBinarySearchCeil < jArr.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
