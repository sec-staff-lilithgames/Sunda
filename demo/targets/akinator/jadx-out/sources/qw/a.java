package qw;

import b0.e2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import pw.b1;
import pw.g;
import pw.h1;
import pw.l0;
import pw.w0;
import pw.x0;
import pw.y0;
import pw.z0;
import uu.f0;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f83553a = h1.asUtf8ToByteArray("0123456789abcdef");

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f83554b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final int access$countDigitsIn(long j10) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j10 > f83554b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final void commonClear(pw.g gVar) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        gVar.skip(gVar.size());
    }

    public static final void commonClose(g.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (aVar.f81898b == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        aVar.f81898b = null;
        aVar.setSegment$okio(null);
        aVar.f81901f = -1L;
        aVar.f81902g = null;
        aVar.f81903h = -1;
        aVar.f81904i = -1;
    }

    public static final long commonCompleteSegmentByteCount(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        long size = gVar.size();
        if (size == 0) {
            return 0L;
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        w0 w0Var2 = w0Var.f82000g;
        e0.checkNotNull(w0Var2);
        return (w0Var2.f81996c >= 8192 || !w0Var2.f81998e) ? size : size - (r2 - w0Var2.f81995b);
    }

    public static final pw.g commonCopy(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        pw.g gVar2 = new pw.g();
        if (gVar.size() == 0) {
            return gVar2;
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        w0 w0VarSharedCopy = w0Var.sharedCopy();
        gVar2.f81896b = w0VarSharedCopy;
        w0VarSharedCopy.f82000g = w0VarSharedCopy;
        w0VarSharedCopy.f81999f = w0VarSharedCopy;
        for (w0 w0Var2 = w0Var.f81999f; w0Var2 != w0Var; w0Var2 = w0Var2.f81999f) {
            w0 w0Var3 = w0VarSharedCopy.f82000g;
            e0.checkNotNull(w0Var3);
            e0.checkNotNull(w0Var2);
            w0Var3.push(w0Var2.sharedCopy());
        }
        gVar2.setSize$okio(gVar.size());
        return gVar2;
    }

    public static final boolean commonEquals(pw.g gVar, Object obj) {
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar == obj) {
            return true;
        }
        if (!(obj instanceof pw.g)) {
            return false;
        }
        pw.g gVar2 = (pw.g) obj;
        if (gVar.size() != gVar2.size()) {
            return false;
        }
        if (gVar.size() == 0) {
            return true;
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        w0 w0Var2 = gVar2.f81896b;
        e0.checkNotNull(w0Var2);
        int i10 = w0Var.f81995b;
        int i11 = w0Var2.f81995b;
        long j10 = 0;
        while (j10 < gVar.size()) {
            long jMin = Math.min(w0Var.f81996c - i10, w0Var2.f81996c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (w0Var.f81994a[i10] != w0Var2.f81994a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == w0Var.f81996c) {
                w0Var = w0Var.f81999f;
                e0.checkNotNull(w0Var);
                i10 = w0Var.f81995b;
            }
            if (i11 == w0Var2.f81996c) {
                w0Var2 = w0Var2.f81999f;
                e0.checkNotNull(w0Var2);
                i11 = w0Var2.f81995b;
            }
            j10 += jMin;
        }
        return true;
    }

    public static final byte commonGet(pw.g gVar, long j10) {
        e0.checkNotNullParameter(gVar, "<this>");
        pw.b.checkOffsetAndCount(gVar.size(), j10, 1L);
        w0 w0Var = gVar.f81896b;
        if (w0Var == null) {
            e0.checkNotNull(null);
            throw null;
        }
        if (gVar.size() - j10 < j10) {
            long size = gVar.size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                e0.checkNotNull(w0Var);
                size -= w0Var.f81996c - w0Var.f81995b;
            }
            e0.checkNotNull(w0Var);
            return w0Var.f81994a[(int) ((w0Var.f81995b + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (w0Var.f81996c - w0Var.f81995b) + j11;
            if (j12 > j10) {
                e0.checkNotNull(w0Var);
                return w0Var.f81994a[(int) ((w0Var.f81995b + j10) - j11)];
            }
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            j11 = j12;
        }
    }

    public static final int commonHashCode(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        w0 w0Var = gVar.f81896b;
        if (w0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = w0Var.f81996c;
            for (int i12 = w0Var.f81995b; i12 < i11; i12++) {
                i10 = (i10 * 31) + w0Var.f81994a[i12];
            }
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
        } while (w0Var != gVar.f81896b);
        return i10;
    }

    public static final long commonIndexOf(pw.g gVar, byte b10, long j10, long j11) {
        w0 w0Var;
        int i10;
        e0.checkNotNullParameter(gVar, "<this>");
        long size = 0;
        if (0 > j10 || j10 > j11) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(gVar.size());
            sb2.append(VPCjETNfjxu.OHzvZnnGxF);
            sb2.append(j10);
            throw new IllegalArgumentException(e2.i(j11, " toIndex=", sb2).toString());
        }
        if (j11 > gVar.size()) {
            j11 = gVar.size();
        }
        if (j10 == j11 || (w0Var = gVar.f81896b) == null) {
            return -1L;
        }
        if (gVar.size() - j10 < j10) {
            size = gVar.size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                e0.checkNotNull(w0Var);
                size -= w0Var.f81996c - w0Var.f81995b;
            }
            while (size < j11) {
                byte[] bArr = w0Var.f81994a;
                int iMin = (int) Math.min(w0Var.f81996c, (w0Var.f81995b + j11) - size);
                i10 = (int) ((w0Var.f81995b + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += w0Var.f81996c - w0Var.f81995b;
                w0Var = w0Var.f81999f;
                e0.checkNotNull(w0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = (w0Var.f81996c - w0Var.f81995b) + size;
            if (j12 > j10) {
                break;
            }
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = w0Var.f81994a;
            int iMin2 = (int) Math.min(w0Var.f81996c, (w0Var.f81995b + j11) - size);
            i10 = (int) ((w0Var.f81995b + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += w0Var.f81996c - w0Var.f81995b;
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            j10 = size;
        }
        return -1L;
        return (i10 - w0Var.f81995b) + size;
    }

    public static /* synthetic */ long commonIndexOf$default(pw.g gVar, pw.l lVar, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return commonIndexOf(gVar, lVar, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? lVar.size() : i11);
    }

    public static final long commonIndexOfElement(pw.g gVar, pw.l targetBytes, long j10) {
        int i10;
        int i11;
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "fromIndex < 0: ").toString());
        }
        w0 w0Var = gVar.f81896b;
        if (w0Var == null) {
            return -1L;
        }
        if (gVar.size() - j10 < j10) {
            size = gVar.size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                e0.checkNotNull(w0Var);
                size -= w0Var.f81996c - w0Var.f81995b;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < gVar.size()) {
                    byte[] bArr = w0Var.f81994a;
                    i10 = (int) ((w0Var.f81995b + j10) - size);
                    int i12 = w0Var.f81996c;
                    while (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (b12 == b10 || b12 == b11) {
                            i11 = w0Var.f81995b;
                        } else {
                            i10++;
                        }
                    }
                    size += w0Var.f81996c - w0Var.f81995b;
                    w0Var = w0Var.f81999f;
                    e0.checkNotNull(w0Var);
                    j10 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < gVar.size()) {
                    byte[] bArr2 = w0Var.f81994a;
                    i10 = (int) ((w0Var.f81995b + j10) - size);
                    int i13 = w0Var.f81996c;
                    while (i10 < i13) {
                        byte b13 = bArr2[i10];
                        for (byte b14 : bArrInternalArray$okio) {
                            if (b13 == b14) {
                                i11 = w0Var.f81995b;
                            }
                        }
                        i10++;
                    }
                    size += w0Var.f81996c - w0Var.f81995b;
                    w0Var = w0Var.f81999f;
                    e0.checkNotNull(w0Var);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = (w0Var.f81996c - w0Var.f81995b) + size;
            if (j11 > j10) {
                break;
            }
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (size < gVar.size()) {
                byte[] bArr3 = w0Var.f81994a;
                i10 = (int) ((w0Var.f81995b + j10) - size);
                int i14 = w0Var.f81996c;
                while (i10 < i14) {
                    byte b17 = bArr3[i10];
                    if (b17 == b15 || b17 == b16) {
                        i11 = w0Var.f81995b;
                    } else {
                        i10++;
                    }
                }
                size += w0Var.f81996c - w0Var.f81995b;
                w0Var = w0Var.f81999f;
                e0.checkNotNull(w0Var);
                j10 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < gVar.size()) {
                byte[] bArr4 = w0Var.f81994a;
                i10 = (int) ((w0Var.f81995b + j10) - size);
                int i15 = w0Var.f81996c;
                while (i10 < i15) {
                    byte b18 = bArr4[i10];
                    for (byte b19 : bArrInternalArray$okio2) {
                        if (b18 == b19) {
                            i11 = w0Var.f81995b;
                        }
                    }
                    i10++;
                }
                size += w0Var.f81996c - w0Var.f81995b;
                w0Var = w0Var.f81999f;
                e0.checkNotNull(w0Var);
                j10 = size;
            }
        }
        return -1L;
        return (i10 - i11) + size;
    }

    public static final int commonNext(g.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        long j10 = aVar.f81901f;
        pw.g gVar = aVar.f81898b;
        e0.checkNotNull(gVar);
        if (j10 == gVar.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j11 = aVar.f81901f;
        return aVar.seek(j11 == -1 ? 0L : j11 + (aVar.f81904i - aVar.f81903h));
    }

    public static final boolean commonRangeEquals(pw.g gVar, long j10, pw.l bytes, int i10, int i11) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(bytes, "bytes");
        return i11 >= 0 && j10 >= 0 && ((long) i11) + j10 <= gVar.size() && i10 >= 0 && i10 + i11 <= bytes.size() && (i11 == 0 || commonIndexOf(gVar, bytes, j10, j10 + 1, i10, i11) != -1);
    }

    public static final int commonRead(pw.g gVar, byte[] sink) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        return gVar.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(pw.g gVar, z0 sink) throws IOException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        long size = gVar.size();
        if (size > 0) {
            sink.write(gVar, size);
        }
        return size;
    }

    public static final g.a commonReadAndWriteUnsafe(pw.g gVar, g.a unsafeCursor) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        g.a aVarResolveDefaultParameter = pw.b.resolveDefaultParameter(unsafeCursor);
        if (aVarResolveDefaultParameter.f81898b != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarResolveDefaultParameter.f81898b = gVar;
        aVarResolveDefaultParameter.f81899c = true;
        return aVarResolveDefaultParameter;
    }

    public static final byte commonReadByte(pw.g gVar) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.size() == 0) {
            throw new EOFException();
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        int i12 = i10 + 1;
        byte b10 = w0Var.f81994a[i10];
        gVar.setSize$okio(gVar.size() - 1);
        if (i12 != i11) {
            w0Var.f81995b = i12;
            return b10;
        }
        gVar.f81896b = w0Var.pop();
        x0.recycle(w0Var);
        return b10;
    }

    public static final byte[] commonReadByteArray(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        return gVar.readByteArray(gVar.size());
    }

    public static final pw.l commonReadByteString(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        return gVar.readByteString(gVar.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = new pw.g().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(pw.g r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.a.commonReadDecimalLong(pw.g):long");
    }

    public static final void commonReadFully(pw.g gVar, byte[] sink) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = gVar.read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:43:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(pw.g r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            pw.w0 r6 = r14.f81896b
            kotlin.jvm.internal.e0.checkNotNull(r6)
            byte[] r7 = r6.f81994a
            int r8 = r6.f81995b
            int r9 = r6.f81996c
        L1d:
            if (r8 >= r9) goto L92
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L76
            r11 = 70
            if (r10 > r11) goto L76
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            pw.g r14 = new pw.g
            r14.<init>()
            pw.g r14 = r14.writeHexadecimalUnsignedLong(r4)
            pw.g r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L92
        L7a:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = pw.b.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L92:
            if (r8 != r9) goto L9e
            pw.w0 r7 = r6.pop()
            r14.f81896b = r7
            pw.x0.recycle(r6)
            goto La0
        L9e:
            r6.f81995b = r8
        La0:
            if (r1 != 0) goto La6
            pw.w0 r6 = r14.f81896b
            if (r6 != 0) goto L12
        La6:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb0:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.a.commonReadHexadecimalUnsignedLong(pw.g):long");
    }

    public static final int commonReadInt(pw.g gVar) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.size() < 4) {
            throw new EOFException();
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        if (i11 - i10 < 4) {
            return (gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }
        byte[] bArr = w0Var.f81994a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        gVar.setSize$okio(gVar.size() - 4);
        if (i14 != i11) {
            w0Var.f81995b = i14;
            return i15;
        }
        gVar.f81896b = w0Var.pop();
        x0.recycle(w0Var);
        return i15;
    }

    public static final long commonReadLong(pw.g gVar) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.size() < 8) {
            throw new EOFException();
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        if (i11 - i10 < 8) {
            return ((gVar.readInt() & 4294967295L) << 32) | (4294967295L & gVar.readInt());
        }
        byte[] bArr = w0Var.f81994a;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        gVar.setSize$okio(gVar.size() - 8);
        if (i13 != i11) {
            w0Var.f81995b = i13;
            return j11;
        }
        gVar.f81896b = w0Var.pop();
        x0.recycle(w0Var);
        return j11;
    }

    public static final short commonReadShort(pw.g gVar) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.size() < 2) {
            throw new EOFException();
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        if (i11 - i10 < 2) {
            return (short) ((gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
        }
        byte[] bArr = w0Var.f81994a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        gVar.setSize$okio(gVar.size() - 2);
        if (i14 == i11) {
            gVar.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        } else {
            w0Var.f81995b = i14;
        }
        return (short) i15;
    }

    public static final g.a commonReadUnsafe(pw.g gVar, g.a unsafeCursor) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        g.a aVarResolveDefaultParameter = pw.b.resolveDefaultParameter(unsafeCursor);
        if (aVarResolveDefaultParameter.f81898b != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarResolveDefaultParameter.f81898b = gVar;
        aVarResolveDefaultParameter.f81899c = false;
        return aVarResolveDefaultParameter;
    }

    public static final String commonReadUtf8(pw.g gVar, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (gVar.size() < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        w0 w0Var = gVar.f81896b;
        e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        if (i10 + j10 > w0Var.f81996c) {
            return x.commonToUtf8String$default(gVar.readByteArray(j10), 0, 0, 3, null);
        }
        int i11 = (int) j10;
        String strCommonToUtf8String = x.commonToUtf8String(w0Var.f81994a, i10, i10 + i11);
        w0Var.f81995b += i11;
        gVar.setSize$okio(gVar.size() - j10);
        if (w0Var.f81995b == w0Var.f81996c) {
            gVar.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(pw.g gVar) throws EOFException {
        int i10;
        int i11;
        int i12;
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.size() == 0) {
            throw new EOFException();
        }
        byte b10 = gVar.getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & AbstractJsonLexerKt.TC_INVALID;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & 240) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                gVar.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j10 = i11;
        if (gVar.size() < j10) {
            StringBuilder sbT = o2.t(i11, "size < ", ": ");
            sbT.append(gVar.size());
            sbT.append(" (to read code point prefixed 0x");
            sbT.append(pw.b.toHexString(b10));
            sbT.append(')');
            throw new EOFException(sbT.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = gVar.getByte(j11);
            if ((b11 & 192) != 128) {
                gVar.skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        gVar.skip(j10);
        return i10 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        long jIndexOf = gVar.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(gVar, jIndexOf);
        }
        if (gVar.size() != 0) {
            return gVar.readUtf8(gVar.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(pw.g gVar, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = gVar.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return readUtf8Line(gVar, jIndexOf);
        }
        if (j11 < gVar.size() && gVar.getByte(j11 - 1) == 13 && gVar.getByte(j11) == 10) {
            return readUtf8Line(gVar, j11);
        }
        pw.g gVar2 = new pw.g();
        gVar.copyTo(gVar2, 0L, Math.min(32, gVar.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.size(), j10) + " content=" + gVar2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(g.a aVar, long j10) {
        e0.checkNotNullParameter(aVar, "<this>");
        pw.g gVar = aVar.f81898b;
        if (gVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!aVar.f81899c) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = gVar.size();
        if (j10 <= size) {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "newSize < 0: ").toString());
            }
            long j11 = size - j10;
            while (true) {
                if (j11 <= 0) {
                    break;
                }
                w0 w0Var = gVar.f81896b;
                e0.checkNotNull(w0Var);
                w0 w0Var2 = w0Var.f82000g;
                e0.checkNotNull(w0Var2);
                int i10 = w0Var2.f81996c;
                long j12 = i10 - w0Var2.f81995b;
                if (j12 > j11) {
                    w0Var2.f81996c = i10 - ((int) j11);
                    break;
                }
                gVar.f81896b = w0Var2.pop();
                x0.recycle(w0Var2);
                j11 -= j12;
            }
            aVar.setSegment$okio(null);
            aVar.f81901f = j10;
            aVar.f81902g = null;
            aVar.f81903h = -1;
            aVar.f81904i = -1;
        } else if (j10 > size) {
            long j13 = j10 - size;
            boolean z10 = true;
            while (j13 > 0) {
                w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(1);
                int iMin = (int) Math.min(j13, 8192 - w0VarWritableSegment$okio.f81996c);
                w0VarWritableSegment$okio.f81996c += iMin;
                j13 -= iMin;
                if (z10) {
                    aVar.setSegment$okio(w0VarWritableSegment$okio);
                    aVar.f81901f = size;
                    aVar.f81902g = w0VarWritableSegment$okio.f81994a;
                    int i11 = w0VarWritableSegment$okio.f81996c;
                    aVar.f81903h = i11 - iMin;
                    aVar.f81904i = i11;
                    z10 = false;
                }
            }
        }
        gVar.setSize$okio(j10);
        return size;
    }

    public static final int commonSeek(g.a aVar, long j10) {
        w0 w0VarPush;
        e0.checkNotNullParameter(aVar, "<this>");
        pw.g gVar = aVar.f81898b;
        if (gVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j10 < -1 || j10 > gVar.size()) {
            StringBuilder sbR = e2.r(j10, "offset=", " > size=");
            sbR.append(gVar.size());
            throw new ArrayIndexOutOfBoundsException(sbR.toString());
        }
        if (j10 == -1 || j10 == gVar.size()) {
            aVar.setSegment$okio(null);
            aVar.f81901f = j10;
            aVar.f81902g = null;
            aVar.f81903h = -1;
            aVar.f81904i = -1;
            return -1;
        }
        long size = gVar.size();
        w0 segment$okio = gVar.f81896b;
        long j11 = 0;
        if (aVar.getSegment$okio() != null) {
            long j12 = aVar.f81901f;
            int i10 = aVar.f81903h;
            e0.checkNotNull(aVar.getSegment$okio());
            long j13 = j12 - (i10 - r9.f81995b);
            if (j13 > j10) {
                w0VarPush = segment$okio;
                segment$okio = aVar.getSegment$okio();
                size = j13;
            } else {
                w0VarPush = aVar.getSegment$okio();
                j11 = j13;
            }
        } else {
            w0VarPush = segment$okio;
        }
        if (size - j10 > j10 - j11) {
            while (true) {
                e0.checkNotNull(w0VarPush);
                long j14 = (w0VarPush.f81996c - w0VarPush.f81995b) + j11;
                if (j10 < j14) {
                    break;
                }
                w0VarPush = w0VarPush.f81999f;
                j11 = j14;
            }
        } else {
            while (size > j10) {
                e0.checkNotNull(segment$okio);
                segment$okio = segment$okio.f82000g;
                e0.checkNotNull(segment$okio);
                size -= segment$okio.f81996c - segment$okio.f81995b;
            }
            j11 = size;
            w0VarPush = segment$okio;
        }
        if (aVar.f81899c) {
            e0.checkNotNull(w0VarPush);
            if (w0VarPush.f81997d) {
                w0 w0VarUnsharedCopy = w0VarPush.unsharedCopy();
                if (gVar.f81896b == w0VarPush) {
                    gVar.f81896b = w0VarUnsharedCopy;
                }
                w0VarPush = w0VarPush.push(w0VarUnsharedCopy);
                w0 w0Var = w0VarPush.f82000g;
                e0.checkNotNull(w0Var);
                w0Var.pop();
            }
        }
        aVar.setSegment$okio(w0VarPush);
        aVar.f81901f = j10;
        e0.checkNotNull(w0VarPush);
        aVar.f81902g = w0VarPush.f81994a;
        int i11 = w0VarPush.f81995b + ((int) (j10 - j11));
        aVar.f81903h = i11;
        int i12 = w0VarPush.f81996c;
        aVar.f81904i = i12;
        return i12 - i11;
    }

    public static final int commonSelect(pw.g gVar, l0 options) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(gVar, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        gVar.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(pw.g gVar, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        while (j10 > 0) {
            w0 w0Var = gVar.f81896b;
            if (w0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, w0Var.f81996c - w0Var.f81995b);
            long j11 = iMin;
            gVar.setSize$okio(gVar.size() - j11);
            j10 -= j11;
            int i10 = w0Var.f81995b + iMin;
            w0Var.f81995b = i10;
            if (i10 == w0Var.f81996c) {
                gVar.f81896b = w0Var.pop();
                x0.recycle(w0Var);
            }
        }
    }

    public static final pw.l commonSnapshot(pw.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.size() <= 2147483647L) {
            return gVar.snapshot((int) gVar.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + gVar.size()).toString());
    }

    public static final w0 commonWritableSegment(pw.g gVar, int i10) {
        e0.checkNotNullParameter(gVar, "<this>");
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w0 w0Var = gVar.f81896b;
        if (w0Var != null) {
            e0.checkNotNull(w0Var);
            w0 w0Var2 = w0Var.f82000g;
            e0.checkNotNull(w0Var2);
            return (w0Var2.f81996c + i10 > 8192 || !w0Var2.f81998e) ? w0Var2.push(x0.take()) : w0Var2;
        }
        w0 w0VarTake = x0.take();
        gVar.f81896b = w0VarTake;
        w0VarTake.f82000g = w0VarTake;
        w0VarTake.f81999f = w0VarTake;
        return w0VarTake;
    }

    public static final pw.g commonWrite(pw.g gVar, pw.l byteString, int i10, int i11) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(gVar, i10, i11);
        return gVar;
    }

    public static /* synthetic */ pw.g commonWrite$default(pw.g gVar, pw.l byteString, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteString.size();
        }
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(gVar, i10, i11);
        return gVar;
    }

    public static final long commonWriteAll(pw.g gVar, b1 source) throws IOException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(gVar, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public static final pw.g commonWriteByte(pw.g gVar, int i10) {
        e0.checkNotNullParameter(gVar, "<this>");
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(1);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        w0VarWritableSegment$okio.f81996c = i11 + 1;
        bArr[i11] = (byte) i10;
        gVar.setSize$okio(gVar.size() + 1);
        return gVar;
    }

    public static final pw.g commonWriteDecimalLong(pw.g gVar, long j10) {
        boolean z10;
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 == 0) {
            return gVar.writeByte(48);
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return gVar.writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iAccess$countDigitsIn = access$countDigitsIn(j10);
        if (z10) {
            iAccess$countDigitsIn++;
        }
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(iAccess$countDigitsIn);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i10 = w0VarWritableSegment$okio.f81996c + iAccess$countDigitsIn;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        w0VarWritableSegment$okio.f81996c += iAccess$countDigitsIn;
        gVar.setSize$okio(gVar.size() + iAccess$countDigitsIn);
        return gVar;
    }

    public static final pw.g commonWriteHexadecimalUnsignedLong(pw.g gVar, long j10) {
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 == 0) {
            return gVar.writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(i10);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        w0VarWritableSegment$okio.f81996c += i10;
        gVar.setSize$okio(gVar.size() + i10);
        return gVar;
    }

    public static final pw.g commonWriteInt(pw.g gVar, int i10) {
        e0.checkNotNullParameter(gVar, "<this>");
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(4);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        w0VarWritableSegment$okio.f81996c = i11 + 4;
        gVar.setSize$okio(gVar.size() + 4);
        return gVar;
    }

    public static final pw.g commonWriteLong(pw.g gVar, long j10) {
        e0.checkNotNullParameter(gVar, "<this>");
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(8);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i10 = w0VarWritableSegment$okio.f81996c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        w0VarWritableSegment$okio.f81996c = i10 + 8;
        gVar.setSize$okio(gVar.size() + 8);
        return gVar;
    }

    public static final pw.g commonWriteShort(pw.g gVar, int i10) {
        e0.checkNotNullParameter(gVar, "<this>");
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(2);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        w0VarWritableSegment$okio.f81996c = i11 + 2;
        gVar.setSize$okio(gVar.size() + 2);
        return gVar;
    }

    public static final pw.g commonWriteUtf8(pw.g gVar, String string, int i10, int i11) {
        char cCharAt;
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
            sbT.append(string.length());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(1);
                byte[] bArr = w0VarWritableSegment$okio.f81994a;
                int i12 = w0VarWritableSegment$okio.f81996c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = w0VarWritableSegment$okio.f81996c;
                int i15 = (i12 + i10) - i14;
                w0VarWritableSegment$okio.f81996c = i14 + i15;
                gVar.setSize$okio(gVar.size() + i15);
            } else {
                if (cCharAt2 < 2048) {
                    w0 w0VarWritableSegment$okio2 = gVar.writableSegment$okio(2);
                    byte[] bArr2 = w0VarWritableSegment$okio2.f81994a;
                    int i16 = w0VarWritableSegment$okio2.f81996c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    w0VarWritableSegment$okio2.f81996c = i16 + 2;
                    gVar.setSize$okio(gVar.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    w0 w0VarWritableSegment$okio3 = gVar.writableSegment$okio(3);
                    byte[] bArr3 = w0VarWritableSegment$okio3.f81994a;
                    int i17 = w0VarWritableSegment$okio3.f81996c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    w0VarWritableSegment$okio3.f81996c = i17 + 3;
                    gVar.setSize$okio(gVar.size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        gVar.writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        w0 w0VarWritableSegment$okio4 = gVar.writableSegment$okio(4);
                        byte[] bArr4 = w0VarWritableSegment$okio4.f81994a;
                        int i20 = w0VarWritableSegment$okio4.f81996c;
                        bArr4[i20] = (byte) ((i19 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        w0VarWritableSegment$okio4.f81996c = i20 + 4;
                        gVar.setSize$okio(gVar.size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return gVar;
    }

    public static final pw.g commonWriteUtf8CodePoint(pw.g gVar, int i10) {
        e0.checkNotNullParameter(gVar, "<this>");
        if (i10 < 128) {
            gVar.writeByte(i10);
            return gVar;
        }
        if (i10 < 2048) {
            w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(2);
            byte[] bArr = w0VarWritableSegment$okio.f81994a;
            int i11 = w0VarWritableSegment$okio.f81996c;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            w0VarWritableSegment$okio.f81996c = i11 + 2;
            gVar.setSize$okio(gVar.size() + 2);
            return gVar;
        }
        if (55296 <= i10 && i10 < 57344) {
            gVar.writeByte(63);
            return gVar;
        }
        if (i10 < 65536) {
            w0 w0VarWritableSegment$okio2 = gVar.writableSegment$okio(3);
            byte[] bArr2 = w0VarWritableSegment$okio2.f81994a;
            int i12 = w0VarWritableSegment$okio2.f81996c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            w0VarWritableSegment$okio2.f81996c = i12 + 3;
            gVar.setSize$okio(gVar.size() + 3);
            return gVar;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + pw.b.toHexString(i10));
        }
        w0 w0VarWritableSegment$okio3 = gVar.writableSegment$okio(4);
        byte[] bArr3 = w0VarWritableSegment$okio3.f81994a;
        int i13 = w0VarWritableSegment$okio3.f81996c;
        bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        w0VarWritableSegment$okio3.f81996c = i13 + 4;
        gVar.setSize$okio(gVar.size() + 4);
        return gVar;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return f83553a;
    }

    public static final boolean rangeEquals(w0 segment, int i10, byte[] bytes, int i11, int i12) {
        e0.checkNotNullParameter(segment, "segment");
        e0.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f81996c;
        byte[] bArr = segment.f81994a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f81999f;
                e0.checkNotNull(segment);
                byte[] bArr2 = segment.f81994a;
                bArr = bArr2;
                i10 = segment.f81995b;
                i13 = segment.f81996c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String readUtf8Line(pw.g gVar, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (gVar.getByte(j11) == 13) {
                String utf8 = gVar.readUtf8(j11);
                gVar.skip(2L);
                return utf8;
            }
        }
        String utf82 = gVar.readUtf8(j10);
        gVar.skip(1L);
        return utf82;
    }

    public static final <T> T seek(pw.g gVar, long j10, kv.p lambda) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(lambda, "lambda");
        w0 w0Var = gVar.f81896b;
        if (w0Var == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (gVar.size() - j10 < j10) {
            long size = gVar.size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                e0.checkNotNull(w0Var);
                size -= w0Var.f81996c - w0Var.f81995b;
            }
            return (T) lambda.invoke(w0Var, Long.valueOf(size));
        }
        long j11 = 0;
        while (true) {
            long j12 = (w0Var.f81996c - w0Var.f81995b) + j11;
            if (j12 > j10) {
                return (T) lambda.invoke(w0Var, Long.valueOf(j11));
            }
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            j11 = j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(pw.g r17, pw.l0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.a.selectPrefix(pw.g, pw.l0, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(pw.g gVar, l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return selectPrefix(gVar, l0Var, z10);
    }

    public static final pw.g commonCopyTo(pw.g gVar, pw.g gVar2, long j10, long j11) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(gVar2, yFkbx.xknvDQHov);
        long j12 = j10;
        pw.b.checkOffsetAndCount(gVar.size(), j12, j11);
        if (j11 != 0) {
            gVar2.setSize$okio(gVar2.size() + j11);
            w0 w0Var = gVar.f81896b;
            while (true) {
                e0.checkNotNull(w0Var);
                int i10 = w0Var.f81996c;
                int i11 = w0Var.f81995b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= i10 - i11;
                w0Var = w0Var.f81999f;
            }
            w0 w0Var2 = w0Var;
            long j13 = j11;
            while (j13 > 0) {
                e0.checkNotNull(w0Var2);
                w0 w0VarSharedCopy = w0Var2.sharedCopy();
                int i12 = w0VarSharedCopy.f81995b + ((int) j12);
                w0VarSharedCopy.f81995b = i12;
                w0VarSharedCopy.f81996c = Math.min(i12 + ((int) j13), w0VarSharedCopy.f81996c);
                w0 w0Var3 = gVar2.f81896b;
                if (w0Var3 == null) {
                    w0VarSharedCopy.f82000g = w0VarSharedCopy;
                    w0VarSharedCopy.f81999f = w0VarSharedCopy;
                    gVar2.f81896b = w0VarSharedCopy;
                } else {
                    e0.checkNotNull(w0Var3);
                    w0 w0Var4 = w0Var3.f82000g;
                    e0.checkNotNull(w0Var4);
                    w0Var4.push(w0VarSharedCopy);
                }
                j13 -= w0VarSharedCopy.f81996c - w0VarSharedCopy.f81995b;
                w0Var2 = w0Var2.f81999f;
                j12 = 0;
            }
        }
        return gVar;
    }

    public static final long commonExpandBuffer(g.a aVar, int i10) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (i10 <= 0) {
            throw new IllegalArgumentException(a.b.e(i10, "minByteCount <= 0: ").toString());
        }
        if (i10 > 8192) {
            throw new IllegalArgumentException(a.b.e(i10, RnJusJ.zuwCmk).toString());
        }
        pw.g gVar = aVar.f81898b;
        if (gVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!aVar.f81899c) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = gVar.size();
        w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(i10);
        int i11 = 8192 - w0VarWritableSegment$okio.f81996c;
        w0VarWritableSegment$okio.f81996c = Segment.SIZE;
        long j10 = i11;
        gVar.setSize$okio(size + j10);
        aVar.setSegment$okio(w0VarWritableSegment$okio);
        aVar.f81901f = size;
        aVar.f81902g = w0VarWritableSegment$okio.f81994a;
        aVar.f81903h = 8192 - i11;
        aVar.f81904i = Segment.SIZE;
        return j10;
    }

    public static final int commonRead(pw.g gVar, byte[] sink, int i10, int i11) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        pw.b.checkOffsetAndCount(sink.length, i10, i11);
        w0 w0Var = gVar.f81896b;
        if (w0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, w0Var.f81996c - w0Var.f81995b);
        byte[] bArr = w0Var.f81994a;
        int i12 = w0Var.f81995b;
        f0.copyInto(bArr, sink, i10, i12, i12 + iMin);
        w0Var.f81995b += iMin;
        gVar.setSize$okio(gVar.size() - iMin);
        if (w0Var.f81995b == w0Var.f81996c) {
            gVar.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(pw.g gVar, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (gVar.size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        gVar.readFully(bArr);
        return bArr;
    }

    public static final pw.l commonReadByteString(pw.g gVar, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (gVar.size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new pw.l(gVar.readByteArray(j10));
        }
        pw.l lVarSnapshot = gVar.snapshot((int) j10);
        gVar.skip(j10);
        return lVarSnapshot;
    }

    public static final pw.g commonWrite(pw.g gVar, byte[] source) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(source, "source");
        return gVar.write(source, 0, source.length);
    }

    public static final pw.g commonWrite(pw.g gVar, byte[] source, int i10, int i11) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(source, "source");
        long j10 = i11;
        pw.b.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - w0VarWritableSegment$okio.f81996c);
            int i13 = i10 + iMin;
            f0.copyInto(source, w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, i10, i13);
            w0VarWritableSegment$okio.f81996c += iMin;
            i10 = i13;
        }
        gVar.setSize$okio(gVar.size() + j10);
        return gVar;
    }

    public static final void commonReadFully(pw.g gVar, pw.g sink, long j10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        if (gVar.size() >= j10) {
            sink.write(gVar, j10);
        } else {
            sink.write(gVar, gVar.size());
            throw new EOFException();
        }
    }

    public static final pw.l commonSnapshot(pw.g gVar, int i10) {
        e0.checkNotNullParameter(gVar, "<this>");
        if (i10 == 0) {
            return pw.l.f81912g;
        }
        pw.b.checkOffsetAndCount(gVar.size(), 0L, i10);
        w0 w0Var = gVar.f81896b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            e0.checkNotNull(w0Var);
            int i14 = w0Var.f81996c;
            int i15 = w0Var.f81995b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                w0Var = w0Var.f81999f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        w0 w0Var2 = gVar.f81896b;
        int i16 = 0;
        while (i11 < i10) {
            e0.checkNotNull(w0Var2);
            bArr[i16] = w0Var2.f81994a;
            i11 += w0Var2.f81996c - w0Var2.f81995b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = w0Var2.f81995b;
            w0Var2.f81997d = true;
            i16++;
            w0Var2 = w0Var2.f81999f;
        }
        return new y0(bArr, iArr);
    }

    public static final pw.g commonWrite(pw.g gVar, b1 source, long j10) throws IOException {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(gVar, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return gVar;
    }

    public static final long commonRead(pw.g gVar, pw.g sink, long j10) {
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (gVar.size() == 0) {
            return -1L;
        }
        if (j10 > gVar.size()) {
            j10 = gVar.size();
        }
        sink.write(gVar, j10);
        return j10;
    }

    public static final void commonWrite(pw.g gVar, pw.g source, long j10) {
        w0 w0Var;
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(source, "source");
        if (source != gVar) {
            pw.b.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                w0 w0Var2 = source.f81896b;
                e0.checkNotNull(w0Var2);
                int i10 = w0Var2.f81996c;
                e0.checkNotNull(source.f81896b);
                if (j10 < i10 - r1.f81995b) {
                    w0 w0Var3 = gVar.f81896b;
                    if (w0Var3 != null) {
                        e0.checkNotNull(w0Var3);
                        w0Var = w0Var3.f82000g;
                    } else {
                        w0Var = null;
                    }
                    if (w0Var != null && w0Var.f81998e) {
                        if ((w0Var.f81996c + j10) - (w0Var.f81997d ? 0 : w0Var.f81995b) <= 8192) {
                            w0 w0Var4 = source.f81896b;
                            e0.checkNotNull(w0Var4);
                            w0Var4.writeTo(w0Var, (int) j10);
                            source.setSize$okio(source.size() - j10);
                            gVar.setSize$okio(gVar.size() + j10);
                            return;
                        }
                    }
                    w0 w0Var5 = source.f81896b;
                    e0.checkNotNull(w0Var5);
                    source.f81896b = w0Var5.split((int) j10);
                }
                w0 w0Var6 = source.f81896b;
                e0.checkNotNull(w0Var6);
                long j11 = w0Var6.f81996c - w0Var6.f81995b;
                source.f81896b = w0Var6.pop();
                w0 w0Var7 = gVar.f81896b;
                if (w0Var7 == null) {
                    gVar.f81896b = w0Var6;
                    w0Var6.f82000g = w0Var6;
                    w0Var6.f81999f = w0Var6;
                } else {
                    e0.checkNotNull(w0Var7);
                    w0 w0Var8 = w0Var7.f82000g;
                    e0.checkNotNull(w0Var8);
                    w0Var8.push(w0Var6).compact();
                }
                source.setSize$okio(source.size() - j11);
                gVar.setSize$okio(gVar.size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(pw.g gVar, pw.l bytes, long j10, long j11, int i10, int i11) {
        w0 w0Var;
        int i12;
        long j12 = j10;
        long size = j11;
        e0.checkNotNullParameter(gVar, "<this>");
        e0.checkNotNullParameter(bytes, "bytes");
        long j13 = i11;
        pw.b.checkOffsetAndCount(bytes.size(), i10, j13);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(o2.m(j12, "fromIndex < 0: ").toString());
        }
        if (j12 > size) {
            StringBuilder sbR = e2.r(j12, "fromIndex > toIndex: ", " > ");
            sbR.append(size);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        if (size > gVar.size()) {
            size = gVar.size();
        }
        long j14 = -1;
        if (j12 == size || (w0Var = gVar.f81896b) == null) {
            return -1L;
        }
        if (gVar.size() - j12 < j12) {
            size2 = gVar.size();
            while (size2 > j12) {
                w0Var = w0Var.f82000g;
                e0.checkNotNull(w0Var);
                size2 -= w0Var.f81996c - w0Var.f81995b;
                j14 = j14;
            }
            long j15 = j14;
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b10 = bArrInternalArray$okio[i10];
            long jMin = Math.min(size, (gVar.size() - j13) + 1);
            while (size2 < jMin) {
                byte[] bArr = w0Var.f81994a;
                int iMin = (int) Math.min(w0Var.f81996c, (w0Var.f81995b + jMin) - size2);
                i12 = (int) ((w0Var.f81995b + j12) - size2);
                while (i12 < iMin) {
                    if (bArr[i12] != b10 || !rangeEquals(w0Var, i12 + 1, bArrInternalArray$okio, i10 + 1, i11)) {
                        i12++;
                    }
                }
                size2 += w0Var.f81996c - w0Var.f81995b;
                w0Var = w0Var.f81999f;
                e0.checkNotNull(w0Var);
                j12 = size2;
            }
            return j15;
        }
        while (true) {
            long j16 = (w0Var.f81996c - w0Var.f81995b) + size2;
            if (j16 > j12) {
                break;
            }
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            size2 = j16;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b11 = bArrInternalArray$okio2[i10];
        long jMin2 = Math.min(size, (gVar.size() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = w0Var.f81994a;
            int iMin2 = (int) Math.min(w0Var.f81996c, (w0Var.f81995b + jMin2) - size2);
            i12 = (int) ((w0Var.f81995b + j12) - size2);
            while (i12 < iMin2) {
                if (bArr2[i12] != b11 || !rangeEquals(w0Var, i12 + 1, bArrInternalArray$okio2, i10 + 1, i11)) {
                    i12++;
                }
            }
            size2 += w0Var.f81996c - w0Var.f81995b;
            w0Var = w0Var.f81999f;
            e0.checkNotNull(w0Var);
            j12 = size2;
        }
        return -1L;
        return (i12 - w0Var.f81995b) + size2;
    }
}
