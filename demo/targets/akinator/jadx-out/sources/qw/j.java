package qw;

import com.unity3d.ads.beta.xyn.RnJusJ;
import kotlin.jvm.internal.e0;
import p0.o2;
import pw.w0;
import pw.y0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j {
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

    public static final boolean commonEquals(y0 y0Var, Object obj) {
        e0.checkNotNullParameter(y0Var, "<this>");
        if (obj == y0Var) {
            return true;
        }
        if (obj instanceof pw.l) {
            pw.l lVar = (pw.l) obj;
            if (lVar.size() == y0Var.size() && y0Var.rangeEquals(0, lVar, 0, y0Var.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(y0 y0Var) {
        e0.checkNotNullParameter(y0Var, "<this>");
        return y0Var.getDirectory$okio()[y0Var.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(y0 y0Var) {
        e0.checkNotNullParameter(y0Var, "<this>");
        int hashCode$okio = y0Var.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = y0Var.getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = y0Var.getDirectory$okio()[length + i10];
            int i14 = y0Var.getDirectory$okio()[i10];
            byte[] bArr = y0Var.getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        y0Var.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(y0 y0Var, int i10) {
        e0.checkNotNullParameter(y0Var, "<this>");
        pw.b.checkOffsetAndCount(y0Var.getDirectory$okio()[y0Var.getSegments$okio().length - 1], i10, 1L);
        int iSegment = segment(y0Var, i10);
        return y0Var.getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : y0Var.getDirectory$okio()[iSegment - 1])) + y0Var.getDirectory$okio()[y0Var.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(y0 y0Var, int i10, pw.l other, int i11, int i12) {
        e0.checkNotNullParameter(y0Var, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > y0Var.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(y0Var, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : y0Var.getDirectory$okio()[iSegment - 1];
            int i15 = y0Var.getDirectory$okio()[iSegment] - i14;
            int i16 = y0Var.getDirectory$okio()[y0Var.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, y0Var.getSegments$okio()[iSegment], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final pw.l commonSubstring(y0 y0Var, int i10, int i11) {
        e0.checkNotNullParameter(y0Var, "<this>");
        int iResolveDefaultParameter = pw.b.resolveDefaultParameter(y0Var, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > y0Var.size()) {
            StringBuilder sbT = o2.t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbT.append(y0Var.size());
            sbT.append(')');
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(w0.i.a(iResolveDefaultParameter, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == y0Var.size()) {
            return y0Var;
        }
        if (i10 == iResolveDefaultParameter) {
            return pw.l.f81912g;
        }
        int iSegment = segment(y0Var, i10);
        int iSegment2 = segment(y0Var, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) f0.copyOfRange(y0Var.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(y0Var.getDirectory$okio()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = y0Var.getDirectory$okio()[y0Var.getSegments$okio().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? y0Var.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new y0(bArr, iArr);
    }

    public static final byte[] commonToByteArray(y0 y0Var) {
        e0.checkNotNullParameter(y0Var, "<this>");
        byte[] bArr = new byte[y0Var.size()];
        int length = y0Var.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = y0Var.getDirectory$okio()[length + i10];
            int i14 = y0Var.getDirectory$okio()[i10];
            int i15 = i14 - i11;
            f0.copyInto(y0Var.getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(y0 y0Var, pw.g buffer, int i10, int i11) {
        e0.checkNotNullParameter(y0Var, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(y0Var, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : y0Var.getDirectory$okio()[iSegment - 1];
            int i14 = y0Var.getDirectory$okio()[iSegment] - i13;
            int i15 = y0Var.getDirectory$okio()[y0Var.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            w0 w0Var = new w0(y0Var.getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            w0 w0Var2 = buffer.f81896b;
            if (w0Var2 == null) {
                w0Var.f82000g = w0Var;
                w0Var.f81999f = w0Var;
                buffer.f81896b = w0Var;
            } else {
                e0.checkNotNull(w0Var2);
                w0 w0Var3 = w0Var2.f82000g;
                e0.checkNotNull(w0Var3);
                w0Var3.push(w0Var);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    public static final void forEachSegment(y0 y0Var, kv.q action) {
        e0.checkNotNullParameter(y0Var, "<this>");
        e0.checkNotNullParameter(action, "action");
        int length = y0Var.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = y0Var.getDirectory$okio()[length + i10];
            int i13 = y0Var.getDirectory$okio()[i10];
            action.invoke(y0Var.getSegments$okio()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(y0 y0Var, int i10) {
        e0.checkNotNullParameter(y0Var, "<this>");
        int iBinarySearch = binarySearch(y0Var.getDirectory$okio(), i10 + 1, 0, y0Var.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public static final void commonCopyInto(y0 y0Var, int i10, byte[] bArr, int i11, int i12) {
        e0.checkNotNullParameter(y0Var, "<this>");
        e0.checkNotNullParameter(bArr, RnJusJ.UrHLEN);
        long j10 = i12;
        pw.b.checkOffsetAndCount(y0Var.size(), i10, j10);
        pw.b.checkOffsetAndCount(bArr.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(y0Var, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : y0Var.getDirectory$okio()[iSegment - 1];
            int i15 = y0Var.getDirectory$okio()[iSegment] - i14;
            int i16 = y0Var.getDirectory$okio()[y0Var.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = (i10 - i14) + i16;
            f0.copyInto(y0Var.getSegments$okio()[iSegment], bArr, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(y0 y0Var, int i10, byte[] other, int i11, int i12) {
        e0.checkNotNullParameter(y0Var, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > y0Var.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(y0Var, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : y0Var.getDirectory$okio()[iSegment - 1];
            int i15 = y0Var.getDirectory$okio()[iSegment] - i14;
            int i16 = y0Var.getDirectory$okio()[y0Var.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!pw.b.arrayRangeEquals(y0Var.getSegments$okio()[iSegment], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
