package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0819SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.e0;
import kv.q;
import p0.o2;
import uu.f0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        e0.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(C0819SegmentedByteString c0819SegmentedByteString, int i10, byte[] target, int i11, int i12) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        e0.checkNotNullParameter(target, "target");
        long j10 = i12;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0819SegmentedByteString.size(), i10, j10);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c0819SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0819SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c0819SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = (i10 - i14) + i16;
            f0.copyInto(c0819SegmentedByteString.getSegments$okio()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C0819SegmentedByteString c0819SegmentedByteString, Object obj) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        if (obj == c0819SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0819SegmentedByteString.size() && c0819SegmentedByteString.rangeEquals(0, byteString, 0, c0819SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C0819SegmentedByteString c0819SegmentedByteString) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        return c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C0819SegmentedByteString c0819SegmentedByteString) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        int hashCode$okio = c0819SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c0819SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0819SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c0819SegmentedByteString.getDirectory$okio()[i10];
            byte[] bArr = c0819SegmentedByteString.getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c0819SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(C0819SegmentedByteString c0819SegmentedByteString, int i10) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length - 1], i10, 1L);
        int iSegment = segment(c0819SegmentedByteString, i10);
        return c0819SegmentedByteString.getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : c0819SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C0819SegmentedByteString c0819SegmentedByteString, int i10, ByteString other, int i11, int i12) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c0819SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0819SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0819SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c0819SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c0819SegmentedByteString.getSegments$okio()[iSegment], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C0819SegmentedByteString c0819SegmentedByteString, int i10, int i11) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c0819SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c0819SegmentedByteString.size()) {
            StringBuilder sbT = o2.t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbT.append(c0819SegmentedByteString.size());
            sbT.append(')');
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(i.a(iResolveDefaultParameter, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c0819SegmentedByteString.size()) {
            return c0819SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0819SegmentedByteString, i10);
        int iSegment2 = segment(c0819SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) f0.copyOfRange(c0819SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c0819SegmentedByteString.getDirectory$okio()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c0819SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new C0819SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C0819SegmentedByteString c0819SegmentedByteString) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0819SegmentedByteString.size()];
        int length = c0819SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0819SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c0819SegmentedByteString.getDirectory$okio()[i10];
            int i15 = i14 - i11;
            f0.copyInto(c0819SegmentedByteString.getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(C0819SegmentedByteString c0819SegmentedByteString, Buffer buffer, int i10, int i11) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c0819SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c0819SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c0819SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            Segment segment = new Segment(c0819SegmentedByteString.getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                e0.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                e0.checkNotNull(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    public static final void forEachSegment(C0819SegmentedByteString c0819SegmentedByteString, q action) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        e0.checkNotNullParameter(action, "action");
        int length = c0819SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c0819SegmentedByteString.getDirectory$okio()[length + i10];
            int i13 = c0819SegmentedByteString.getDirectory$okio()[i10];
            action.invoke(c0819SegmentedByteString.getSegments$okio()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(C0819SegmentedByteString c0819SegmentedByteString, int i10) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c0819SegmentedByteString.getDirectory$okio(), i10 + 1, 0, c0819SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C0819SegmentedByteString c0819SegmentedByteString, int i10, int i11, q qVar) {
        int iSegment = segment(c0819SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c0819SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c0819SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            qVar.invoke(c0819SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf((i10 - i12) + i14), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C0819SegmentedByteString c0819SegmentedByteString, int i10, byte[] other, int i11, int i12) {
        e0.checkNotNullParameter(c0819SegmentedByteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c0819SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0819SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0819SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c0819SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c0819SegmentedByteString.getDirectory$okio()[c0819SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c0819SegmentedByteString.getSegments$okio()[iSegment], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
