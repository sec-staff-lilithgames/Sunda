package ov;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import kotlin.jvm.internal.e0;
import qv.m;
import qv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {
    public static final g Random(int i10) {
        return new i(i10, i10 >> 31);
    }

    public static final void checkRangeBounds(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final int fastLog2(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int nextInt(g gVar, m range) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? gVar.nextInt(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? gVar.nextInt(range.getFirst() - 1, range.getLast()) + 1 : gVar.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long nextLong(g gVar, p range) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Long.MAX_VALUE ? gVar.nextLong(range.getFirst(), range.getLast() + 1) : range.getFirst() > Long.MIN_VALUE ? gVar.nextLong(range.getFirst() - 1, range.getLast()) + 1 : gVar.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int takeUpperBits(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }

    public static final g Random(long j10) {
        return new i((int) j10, (int) (j10 >> 32));
    }

    public static final String boundsErrorMessage(Object from, Object until) {
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + gjnZrsdA.hYpTjYqkbTfXwm + until + ").";
    }

    public static final void checkRangeBounds(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final void checkRangeBounds(double d10, double d11) {
        if (d11 <= d10) {
            throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }
}
