package eo;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import nh.b5;
import nh.i7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f54795a = new ArrayList();

    public final int a(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f54795a;
            if (i10 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j10 < ((hp.c) arrayList.get(i10)).f59100b) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // eo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean addCues(hp.c r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f59100b
            long r2 = r10.f59100b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 0
            r6 = 1
            if (r0 == 0) goto L11
            r0 = r6
            goto L12
        L11:
            r0 = r1
        L12:
            io.bidmachine.media3.common.util.a.checkArgument(r0)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r7 = r10.f59102d
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r6
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r4 = r9.f54795a
            int r5 = r4.size()
            int r5 = r5 - r6
        L2d:
            if (r5 < 0) goto L50
            java.lang.Object r7 = r4.get(r5)
            hp.c r7 = (hp.c) r7
            long r7 = r7.f59100b
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L40
            int r5 = r5 + r6
            r4.add(r5, r10)
            return r0
        L40:
            java.lang.Object r7 = r4.get(r5)
            hp.c r7 = (hp.c) r7
            long r7 = r7.f59100b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4d
            r0 = r1
        L4d:
            int r5 = r5 + (-1)
            goto L2d
        L50:
            r4.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.d.addCues(hp.c, long):boolean");
    }

    @Override // eo.a
    public void clear() {
        this.f54795a.clear();
    }

    @Override // eo.a
    public void discardCuesBeforeTimeUs(long j10) {
        int iA = a(j10);
        if (iA == 0) {
            return;
        }
        ArrayList arrayList = this.f54795a;
        long j11 = ((hp.c) arrayList.get(iA - 1)).f59102d;
        if (j11 == C.TIME_UNSET || j11 >= j10) {
            iA--;
        }
        arrayList.subList(0, iA).clear();
    }

    @Override // eo.a
    public b5 getCuesAtTimeUs(long j10) {
        int iA = a(j10);
        if (iA == 0) {
            return b5.of();
        }
        hp.c cVar = (hp.c) this.f54795a.get(iA - 1);
        long j11 = cVar.f59102d;
        return (j11 == C.TIME_UNSET || j10 < j11) ? cVar.f59099a : b5.of();
    }

    @Override // eo.a
    public long getNextCueChangeTimeUs(long j10) {
        ArrayList arrayList = this.f54795a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((hp.c) arrayList.get(0)).f59100b) {
            return ((hp.c) arrayList.get(0)).f59100b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            hp.c cVar = (hp.c) arrayList.get(i10);
            long j11 = cVar.f59100b;
            long j12 = cVar.f59100b;
            if (j10 < j11) {
                long j13 = ((hp.c) arrayList.get(i10 - 1)).f59102d;
                return (j13 == C.TIME_UNSET || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((hp.c) i7.getLast(arrayList)).f59102d;
        if (j14 == C.TIME_UNSET || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // eo.a
    public long getPreviousCueChangeTimeUs(long j10) {
        ArrayList arrayList = this.f54795a;
        if (arrayList.isEmpty() || j10 < ((hp.c) arrayList.get(0)).f59100b) {
            return C.TIME_UNSET;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((hp.c) arrayList.get(i10)).f59100b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                hp.c cVar = (hp.c) arrayList.get(i10 - 1);
                long j12 = cVar.f59102d;
                return (j12 == C.TIME_UNSET || j12 > j10) ? cVar.f59100b : j12;
            }
        }
        hp.c cVar2 = (hp.c) i7.getLast(arrayList);
        long j13 = cVar2.f59102d;
        return (j13 == C.TIME_UNSET || j10 < j13) ? cVar2.f59100b : j13;
    }
}
