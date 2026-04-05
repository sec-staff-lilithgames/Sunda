package qw;

import b0.e2;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import p0.o2;
import pw.b1;
import pw.d1;
import pw.h0;
import pw.l0;
import pw.o0;
import pw.v0;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i {
    public static final void commonClose(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        if (v0Var.f81988e) {
            return;
        }
        v0Var.f81988e = true;
        v0Var.f81986b.close();
        v0Var.f81987c.clear();
    }

    public static final boolean commonExhausted(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        return gVar.exhausted() && v0Var.f81986b.read(gVar, 8192L) == -1;
    }

    public static final long commonIndexOf(v0 v0Var, byte b10, long j10, long j11) {
        e0.checkNotNullParameter(v0Var, "<this>");
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            StringBuilder sbR = e2.r(j10, "fromIndex=", " toIndex=");
            sbR.append(j11);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jIndexOf = v0Var.f81987c.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = gVar.size();
            if (size >= j12 || v0Var.f81986b.read(gVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    public static /* synthetic */ long commonIndexOf$default(v0 v0Var, pw.l lVar, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = lVar.size();
        }
        return commonIndexOf(v0Var, lVar, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    public static final long commonIndexOfElement(v0 v0Var, pw.l targetBytes, long j10) {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(targetBytes, "targetBytes");
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = gVar.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = gVar.size();
            if (v0Var.f81986b.read(gVar, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    public static final pw.k commonPeek(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        return h0.buffer(new o0(v0Var));
    }

    public static final boolean commonRangeEquals(v0 v0Var, long j10, pw.l bytes, int i10, int i11) {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(bytes, "bytes");
        if (v0Var.f81988e) {
            throw new IllegalStateException("closed");
        }
        if (i11 >= 0 && j10 >= 0 && i10 >= 0 && i10 + i11 <= bytes.size()) {
            return i11 == 0 || commonIndexOf(v0Var, bytes, i10, i11, j10, j10 + 1) != -1;
        }
        return false;
    }

    public static final long commonRead(v0 v0Var, pw.g sink, long j10) {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        if (gVar.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (v0Var.f81986b.read(gVar, 8192L) == -1) {
                return -1L;
            }
        }
        return gVar.read(sink, Math.min(j10, gVar.size()));
    }

    public static final long commonReadAll(v0 v0Var, z0 sink) throws IOException {
        pw.g gVar;
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (true) {
            b1 b1Var = v0Var.f81986b;
            gVar = v0Var.f81987c;
            if (b1Var.read(gVar, 8192L) == -1) {
                break;
            }
            long jCompleteSegmentByteCount = gVar.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(gVar, jCompleteSegmentByteCount);
            }
        }
        if (gVar.size() <= 0) {
            return j10;
        }
        long size = gVar.size() + j10;
        sink.write(gVar, gVar.size());
        return size;
    }

    public static final byte commonReadByte(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(1L);
        return v0Var.f81987c.readByte();
    }

    public static final byte[] commonReadByteArray(v0 v0Var, long j10) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(j10);
        return v0Var.f81987c.readByteArray(j10);
    }

    public static final pw.l commonReadByteString(v0 v0Var, long j10) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(j10);
        return v0Var.f81987c.readByteString(j10);
    }

    public static final long commonReadDecimalLong(v0 v0Var) throws IOException {
        byte b10;
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(1L);
        pw.g gVar = v0Var.f81987c;
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!v0Var.request(j11)) {
                break;
            }
            b10 = gVar.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder("Expected a digit or '-' but was 0x");
            String string = Integer.toString(b10, sv.e.checkRadix(16));
            e0.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return gVar.readDecimalLong();
    }

    public static final void commonReadFully(v0 v0Var, byte[] sink) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        try {
            v0Var.require(sink.length);
            v0Var.f81987c.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (v0Var.f81987c.size() > 0) {
                pw.g gVar = v0Var.f81987c;
                int i11 = gVar.read(sink, i10, (int) gVar.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(v0 v0Var) throws IOException {
        byte b10;
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(1L);
        pw.g gVar = v0Var.f81987c;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!v0Var.request(i11)) {
                break;
            }
            b10 = gVar.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b10, sv.e.checkRadix(16));
            e0.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return gVar.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(4L);
        return v0Var.f81987c.readInt();
    }

    public static final int commonReadIntLe(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(4L);
        return v0Var.f81987c.readIntLe();
    }

    public static final long commonReadLong(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(8L);
        return v0Var.f81987c.readLong();
    }

    public static final long commonReadLongLe(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(8L);
        return v0Var.f81987c.readLongLe();
    }

    public static final short commonReadShort(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(2L);
        return v0Var.f81987c.readShort();
    }

    public static final short commonReadShortLe(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(2L);
        return v0Var.f81987c.readShortLe();
    }

    public static final String commonReadUtf8(v0 v0Var, long j10) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(j10);
        return v0Var.f81987c.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.require(1L);
        pw.g gVar = v0Var.f81987c;
        byte b10 = gVar.getByte(0L);
        if ((b10 & 224) == 192) {
            v0Var.require(2L);
        } else if ((b10 & 240) == 224) {
            v0Var.require(3L);
        } else if ((b10 & 248) == 240) {
            v0Var.require(4L);
        }
        return gVar.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        long jIndexOf = v0Var.indexOf((byte) 10);
        pw.g gVar = v0Var.f81987c;
        if (jIndexOf != -1) {
            return a.readUtf8Line(gVar, jIndexOf);
        }
        if (gVar.size() != 0) {
            return v0Var.readUtf8(gVar.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(v0 v0Var, long j10) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = v0Var.indexOf((byte) 10, 0L, j11);
        pw.g gVar = v0Var.f81987c;
        if (jIndexOf != -1) {
            return a.readUtf8Line(gVar, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && v0Var.request(j11) && gVar.getByte(j11 - 1) == 13 && v0Var.request(j11 + 1) && gVar.getByte(j11) == 10) {
            return a.readUtf8Line(gVar, j11);
        }
        pw.g gVar2 = new pw.g();
        pw.g gVar3 = v0Var.f81987c;
        gVar3.copyTo(gVar2, 0L, Math.min(32, gVar3.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.size(), j10) + " content=" + gVar2.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(v0 v0Var, long j10) {
        e0.checkNotNullParameter(v0Var, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        while (gVar.size() < j10) {
            if (v0Var.f81986b.read(gVar, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(v0 v0Var, long j10) throws EOFException {
        e0.checkNotNullParameter(v0Var, "<this>");
        if (!v0Var.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(v0 v0Var, l0 options) throws EOFException {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(options, "options");
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int iSelectPrefix = a.selectPrefix(gVar, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix != -1) {
                    gVar.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                    return iSelectPrefix;
                }
            } else if (v0Var.f81986b.read(gVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public static final void commonSkip(v0 v0Var, long j10) throws EOFException {
        e0.checkNotNullParameter(v0Var, "<this>");
        boolean z10 = v0Var.f81988e;
        pw.g gVar = v0Var.f81987c;
        if (z10) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (gVar.size() == 0 && v0Var.f81986b.read(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, gVar.size());
            gVar.skip(jMin);
            j10 -= jMin;
        }
    }

    public static final d1 commonTimeout(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        return v0Var.f81986b.timeout();
    }

    public static final String commonToString(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        return "buffer(" + v0Var.f81986b + ')';
    }

    public static final byte[] commonReadByteArray(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.f81987c.writeAll(v0Var.f81986b);
        return v0Var.f81987c.readByteArray();
    }

    public static final pw.l commonReadByteString(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.f81987c.writeAll(v0Var.f81986b);
        return v0Var.f81987c.readByteString();
    }

    public static final String commonReadUtf8(v0 v0Var) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        v0Var.f81987c.writeAll(v0Var.f81986b);
        return v0Var.f81987c.readUtf8();
    }

    public static final void commonReadFully(v0 v0Var, pw.g sink, long j10) throws IOException {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        try {
            v0Var.require(j10);
            v0Var.f81987c.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(v0Var.f81987c);
            throw e10;
        }
    }

    public static final int commonRead(v0 v0Var, byte[] sink, int i10, int i11) {
        e0.checkNotNullParameter(v0Var, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        long j10 = i11;
        pw.b.checkOffsetAndCount(sink.length, i10, j10);
        pw.g gVar = v0Var.f81987c;
        pw.g gVar2 = v0Var.f81987c;
        if (gVar.size() == 0) {
            if (i11 == 0) {
                return 0;
            }
            if (v0Var.f81986b.read(gVar2, 8192L) == -1) {
                return -1;
            }
        }
        return gVar2.read(sink, i10, (int) Math.min(j10, gVar2.size()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonIndexOf(pw.v0 r16, pw.l r17, int r18, int r19, long r20, long r22) {
        /*
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "bytes"
            r3 = r17
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r1)
            int r1 = r3.size()
            long r4 = (long) r1
            r1 = r18
            long r6 = (long) r1
            r2 = r19
            long r8 = (long) r2
            pw.b.checkOffsetAndCount(r4, r6, r8)
            r10 = r8
            boolean r4 = r0.f81988e
            pw.g r12 = r0.f81987c
            if (r4 != 0) goto La6
            r4 = r20
        L25:
            pw.g r2 = r0.f81987c
            r9 = r19
            r6 = r22
            r8 = r1
            long r1 = qw.a.commonIndexOf(r2, r3, r4, r6, r8, r9)
            r8 = r4
            r13 = -1
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 == 0) goto L38
            return r1
        L38:
            long r1 = r12.size()
            long r1 = r1 - r10
            r3 = 1
            long r1 = r1 + r3
            int r5 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r5 < 0) goto L48
        L44:
            r20 = r13
            goto La5
        L48:
            long r5 = r12.size()
            int r5 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r5 >= 0) goto L55
            r20 = r13
            r13 = r1
            r2 = r12
            goto L85
        L55:
            long r5 = r12.size()
            long r5 = r5 - r22
            long r5 = r5 + r3
            long r5 = java.lang.Math.max(r3, r5)
            int r15 = (int) r5
            long r5 = r12.size()
            long r5 = r5 - r8
            long r5 = r5 + r3
            long r3 = java.lang.Math.min(r10, r5)
            int r3 = (int) r3
            int r3 = r3 + (-1)
            if (r15 > r3) goto L44
            r7 = r3
        L71:
            long r3 = r12.size()
            long r5 = (long) r7
            long r3 = r3 - r5
            r5 = r17
            r6 = r18
            r20 = r13
            r13 = r1
            r2 = r12
            boolean r1 = r2.rangeEquals(r3, r5, r6, r7)
            if (r1 == 0) goto L9c
        L85:
            pw.b1 r1 = r0.f81986b
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r1.read(r2, r3)
            int r1 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r1 != 0) goto L92
            goto La5
        L92:
            long r4 = java.lang.Math.max(r8, r13)
            r3 = r17
            r1 = r18
            r12 = r2
            goto L25
        L9c:
            if (r7 == r15) goto La5
            int r7 = r7 + (-1)
            r12 = r2
            r1 = r13
            r13 = r20
            goto L71
        La5:
            return r20
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.i.commonIndexOf(pw.v0, pw.l, int, int, long, long):long");
    }
}
