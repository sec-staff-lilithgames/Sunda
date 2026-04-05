package of;

import com.google.android.exoplayer2.util.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements ef.j {

    /* renamed from: b, reason: collision with root package name */
    public final List f79378b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f79379c;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f79380e;

    public k(List<e> list) {
        this.f79378b = Collections.unmodifiableList(new ArrayList(list));
        this.f79379c = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f79379c;
            jArr[i11] = eVar.f79349b;
            jArr[i11 + 1] = eVar.f79350c;
        }
        long[] jArr2 = this.f79379c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f79380e = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // ef.j
    public List<ef.b> getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f79378b;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f79379c;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = (e) list.get(i10);
                ef.b bVar = eVar.f79348a;
                if (bVar.f54295g == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new ni.a(4));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f79348a.buildUpon().setLine((-1) - i12, 1).build());
        }
        return arrayList;
    }

    @Override // ef.j
    public long getEventTime(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0);
        long[] jArr = this.f79380e;
        com.google.android.exoplayer2.util.a.checkArgument(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // ef.j
    public int getEventTimeCount() {
        return this.f79380e.length;
    }

    @Override // ef.j
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = this.f79380e;
        int iBinarySearchCeil = n1.binarySearchCeil(jArr, j10, false, false);
        if (iBinarySearchCeil < jArr.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
