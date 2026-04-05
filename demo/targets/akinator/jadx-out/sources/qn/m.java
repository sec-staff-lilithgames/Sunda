package qn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final i f83364a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83365b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83366c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends m {

        /* renamed from: d, reason: collision with root package name */
        public final long f83367d;

        /* renamed from: e, reason: collision with root package name */
        public final long f83368e;

        /* renamed from: f, reason: collision with root package name */
        public final List f83369f;

        /* renamed from: g, reason: collision with root package name */
        public final long f83370g;

        /* renamed from: h, reason: collision with root package name */
        public final long f83371h;

        /* renamed from: i, reason: collision with root package name */
        public final long f83372i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f83367d = j12;
            this.f83368e = j13;
            this.f83369f = list;
            this.f83372i = j14;
            this.f83370g = j15;
            this.f83371h = j16;
        }

        public long getAvailableSegmentCount(long j10, long j11) {
            long segmentCount = getSegmentCount(j10);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j11 - this.f83371h) + this.f83372i, j10) - getFirstAvailableSegmentNum(j10, j11));
        }

        public long getFirstAvailableSegmentNum(long j10, long j11) {
            if (getSegmentCount(j10) == -1) {
                long j12 = this.f83370g;
                if (j12 != C.TIME_UNSET) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j11 - this.f83371h) - j12, j10));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.f83367d;
        }

        public long getNextSegmentAvailableTimeUs(long j10, long j11) {
            if (this.f83369f != null) {
                return C.TIME_UNSET;
            }
            long availableSegmentCount = getAvailableSegmentCount(j10, j11) + getFirstAvailableSegmentNum(j10, j11);
            return (getSegmentDurationUs(availableSegmentCount, j10) + getSegmentTimeUs(availableSegmentCount)) - this.f83372i;
        }

        public abstract long getSegmentCount(long j10);

        public final long getSegmentDurationUs(long j10, long j11) {
            long j12 = this.f83365b;
            List list = this.f83369f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f83367d))).f83378b * 1000000) / j12;
            }
            long segmentCount = getSegmentCount(j11);
            return (segmentCount == -1 || j10 != (getFirstSegmentNum() + segmentCount) - 1) ? (this.f83368e * 1000000) / j12 : j11 - getSegmentTimeUs(j10);
        }

        public long getSegmentNum(long j10, long j11) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j11);
            if (segmentCount != 0) {
                if (this.f83369f != null) {
                    long j12 = (segmentCount + firstSegmentNum) - 1;
                    long j13 = firstSegmentNum;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long segmentTimeUs = getSegmentTimeUs(j14);
                        if (segmentTimeUs < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (segmentTimeUs <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == firstSegmentNum ? j13 : j12;
                }
                long j15 = (j10 / ((this.f83368e * 1000000) / this.f83365b)) + this.f83367d;
                if (j15 >= firstSegmentNum) {
                    return segmentCount == -1 ? j15 : Math.min(j15, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j10) {
            long j11 = this.f83367d;
            List list = this.f83369f;
            return a1.scaleLargeTimestamp(list != null ? ((d) list.get((int) (j10 - j11))).f83377a - this.f83366c : (j10 - j11) * this.f83368e, 1000000L, this.f83365b);
        }

        public abstract i getSegmentUrl(l lVar, long j10);

        public boolean isExplicit() {
            return this.f83369f != null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        public final List f83373j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f83373j = list2;
        }

        @Override // qn.m.a
        public long getSegmentCount(long j10) {
            return this.f83373j.size();
        }

        @Override // qn.m.a
        public i getSegmentUrl(l lVar, long j10) {
            return (i) this.f83373j.get((int) (j10 - this.f83367d));
        }

        @Override // qn.m.a
        public boolean isExplicit() {
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public final p f83374j;

        /* renamed from: k, reason: collision with root package name */
        public final p f83375k;

        /* renamed from: l, reason: collision with root package name */
        public final long f83376l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, p pVar, p pVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f83374j = pVar;
            this.f83375k = pVar2;
            this.f83376l = j13;
        }

        @Override // qn.m
        public i getInitialization(l lVar) {
            p pVar = this.f83374j;
            if (pVar == null) {
                return super.getInitialization(lVar);
            }
            io.bidmachine.media3.common.b bVar = lVar.f83357a;
            return new i(pVar.buildUri(bVar.f60651a, 0L, bVar.f60660j, 0L), 0L, -1L);
        }

        @Override // qn.m.a
        public long getSegmentCount(long j10) {
            if (this.f83369f != null) {
                return r0.size();
            }
            long j11 = this.f83376l;
            if (j11 != -1) {
                return (j11 - this.f83367d) + 1;
            }
            if (j10 != C.TIME_UNSET) {
                return qh.b.divide(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f83365b)), BigInteger.valueOf(this.f83368e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // qn.m.a
        public i getSegmentUrl(l lVar, long j10) {
            long j11 = this.f83367d;
            List list = this.f83369f;
            long j12 = list != null ? ((d) list.get((int) (j10 - j11))).f83377a : (j10 - j11) * this.f83368e;
            io.bidmachine.media3.common.b bVar = lVar.f83357a;
            return new i(this.f83375k.buildUri(bVar.f60651a, j10, bVar.f60660j, j12), 0L, -1L);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f83377a;

        /* renamed from: b, reason: collision with root package name */
        public final long f83378b;

        public d(long j10, long j11) {
            this.f83377a = j10;
            this.f83378b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f83377a == dVar.f83377a && this.f83378b == dVar.f83378b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f83377a) * 31) + ((int) this.f83378b);
        }
    }

    public m(i iVar, long j10, long j11) {
        this.f83364a = iVar;
        this.f83365b = j10;
        this.f83366c = j11;
    }

    public i getInitialization(l lVar) {
        return this.f83364a;
    }

    public long getPresentationTimeOffsetUs() {
        return a1.scaleLargeTimestamp(this.f83366c, 1000000L, this.f83365b);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends m {

        /* renamed from: d, reason: collision with root package name */
        public final long f83379d;

        /* renamed from: e, reason: collision with root package name */
        public final long f83380e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f83379d = j12;
            this.f83380e = j13;
        }

        public i getIndex() {
            long j10 = this.f83380e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f83379d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
