package eo;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import nh.b5;
import nh.we;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final we f54793b = we.natural().onResultOf(new ao.c(7)).compound(we.natural().reverse().onResultOf(new ao.c(8)));

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f54794a = new ArrayList();

    @Override // eo.a
    public boolean addCues(hp.c cVar, long j10) {
        long j11 = cVar.f59100b;
        io.bidmachine.media3.common.util.a.checkArgument(j11 != C.TIME_UNSET);
        io.bidmachine.media3.common.util.a.checkArgument(cVar.f59101c != C.TIME_UNSET);
        boolean z10 = j11 <= j10 && j10 < cVar.f59102d;
        ArrayList arrayList = this.f54794a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((hp.c) arrayList.get(size)).f59100b) {
                arrayList.add(size + 1, cVar);
                return z10;
            }
        }
        arrayList.add(0, cVar);
        return z10;
    }

    @Override // eo.a
    public void clear() {
        this.f54794a.clear();
    }

    @Override // eo.a
    public void discardCuesBeforeTimeUs(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f54794a;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j11 = ((hp.c) arrayList.get(i10)).f59100b;
            if (j10 > j11 && j10 > ((hp.c) arrayList.get(i10)).f59102d) {
                arrayList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }

    @Override // eo.a
    public b5 getCuesAtTimeUs(long j10) {
        ArrayList arrayList = this.f54794a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((hp.c) arrayList.get(0)).f59100b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    hp.c cVar = (hp.c) arrayList.get(i10);
                    if (j10 >= cVar.f59100b && j10 < cVar.f59102d) {
                        arrayList2.add(cVar);
                    }
                    if (j10 < cVar.f59100b) {
                        break;
                    }
                }
                b5 b5VarSortedCopyOf = b5.sortedCopyOf(f54793b, arrayList2);
                x4 x4VarBuilder = b5.builder();
                for (int i11 = 0; i11 < b5VarSortedCopyOf.size(); i11++) {
                    x4VarBuilder.addAll((Iterable<Object>) ((hp.c) b5VarSortedCopyOf.get(i11)).f59099a);
                }
                return x4VarBuilder.build();
            }
        }
        return b5.of();
    }

    @Override // eo.a
    public long getNextCueChangeTimeUs(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f54794a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((hp.c) arrayList.get(i10)).f59100b;
            long j12 = ((hp.c) arrayList.get(i10)).f59102d;
            if (j10 < j11) {
                jMin = jMin == C.TIME_UNSET ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == C.TIME_UNSET ? j12 : Math.min(jMin, j12);
                }
                i10++;
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // eo.a
    public long getPreviousCueChangeTimeUs(long j10) {
        ArrayList arrayList = this.f54794a;
        if (arrayList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j10 < ((hp.c) arrayList.get(0)).f59100b) {
            return C.TIME_UNSET;
        }
        long jMax = ((hp.c) arrayList.get(0)).f59100b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j11 = ((hp.c) arrayList.get(i10)).f59100b;
            long j12 = ((hp.c) arrayList.get(i10)).f59102d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }
}
