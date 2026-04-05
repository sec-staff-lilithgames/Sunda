package pw;

import b0.e2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements k, j, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    public w0 f81896b;

    /* renamed from: c, reason: collision with root package name */
    public long f81897c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public g f81898b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f81899c;

        /* renamed from: e, reason: collision with root package name */
        public w0 f81900e;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f81902g;

        /* renamed from: f, reason: collision with root package name */
        public long f81901f = -1;

        /* renamed from: h, reason: collision with root package name */
        public int f81903h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f81904i = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f81898b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f81898b = null;
            setSegment$okio(null);
            this.f81901f = -1L;
            this.f81902g = null;
            this.f81903h = -1;
            this.f81904i = -1;
        }

        public final long expandBuffer(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(a.b.e(i10, "minByteCount <= 0: ").toString());
            }
            if (i10 > 8192) {
                throw new IllegalArgumentException(a.b.e(i10, "minByteCount > Segment.SIZE: ").toString());
            }
            g gVar = this.f81898b;
            if (gVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f81899c) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = gVar.size();
            w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(i10);
            int i11 = 8192 - w0VarWritableSegment$okio.f81996c;
            w0VarWritableSegment$okio.f81996c = Segment.SIZE;
            long j10 = i11;
            gVar.setSize$okio(size + j10);
            setSegment$okio(w0VarWritableSegment$okio);
            this.f81901f = size;
            this.f81902g = w0VarWritableSegment$okio.f81994a;
            this.f81903h = 8192 - i11;
            this.f81904i = Segment.SIZE;
            return j10;
        }

        public final w0 getSegment$okio() {
            return this.f81900e;
        }

        public final int next() {
            long j10 = this.f81901f;
            g gVar = this.f81898b;
            kotlin.jvm.internal.e0.checkNotNull(gVar);
            if (j10 == gVar.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f81901f;
            return seek(j11 == -1 ? 0L : j11 + (this.f81904i - this.f81903h));
        }

        public final long resizeBuffer(long j10) {
            g gVar = this.f81898b;
            if (gVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f81899c) {
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
                    kotlin.jvm.internal.e0.checkNotNull(w0Var);
                    w0 w0Var2 = w0Var.f82000g;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var2);
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
                setSegment$okio(null);
                this.f81901f = j10;
                this.f81902g = null;
                this.f81903h = -1;
                this.f81904i = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(1);
                    int iMin = (int) Math.min(j13, 8192 - w0VarWritableSegment$okio.f81996c);
                    w0VarWritableSegment$okio.f81996c += iMin;
                    j13 -= iMin;
                    if (z10) {
                        setSegment$okio(w0VarWritableSegment$okio);
                        this.f81901f = size;
                        this.f81902g = w0VarWritableSegment$okio.f81994a;
                        int i11 = w0VarWritableSegment$okio.f81996c;
                        this.f81903h = i11 - iMin;
                        this.f81904i = i11;
                        z10 = false;
                    }
                }
            }
            gVar.setSize$okio(j10);
            return size;
        }

        public final int seek(long j10) {
            w0 w0VarPush;
            g gVar = this.f81898b;
            if (gVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > gVar.size()) {
                StringBuilder sbR = e2.r(j10, "offset=", " > size=");
                sbR.append(gVar.size());
                throw new ArrayIndexOutOfBoundsException(sbR.toString());
            }
            if (j10 == -1 || j10 == gVar.size()) {
                setSegment$okio(null);
                this.f81901f = j10;
                this.f81902g = null;
                this.f81903h = -1;
                this.f81904i = -1;
                return -1;
            }
            long size = gVar.size();
            w0 segment$okio = gVar.f81896b;
            long j11 = 0;
            if (getSegment$okio() != null) {
                long j12 = this.f81901f;
                int i10 = this.f81903h;
                kotlin.jvm.internal.e0.checkNotNull(getSegment$okio());
                long j13 = j12 - (i10 - r9.f81995b);
                if (j13 > j10) {
                    w0VarPush = segment$okio;
                    segment$okio = getSegment$okio();
                    size = j13;
                } else {
                    w0VarPush = getSegment$okio();
                    j11 = j13;
                }
            } else {
                w0VarPush = segment$okio;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    kotlin.jvm.internal.e0.checkNotNull(w0VarPush);
                    long j14 = (w0VarPush.f81996c - w0VarPush.f81995b) + j11;
                    if (j10 < j14) {
                        break;
                    }
                    w0VarPush = w0VarPush.f81999f;
                    j11 = j14;
                }
            } else {
                while (size > j10) {
                    kotlin.jvm.internal.e0.checkNotNull(segment$okio);
                    segment$okio = segment$okio.f82000g;
                    kotlin.jvm.internal.e0.checkNotNull(segment$okio);
                    size -= segment$okio.f81996c - segment$okio.f81995b;
                }
                j11 = size;
                w0VarPush = segment$okio;
            }
            if (this.f81899c) {
                kotlin.jvm.internal.e0.checkNotNull(w0VarPush);
                if (w0VarPush.f81997d) {
                    w0 w0VarUnsharedCopy = w0VarPush.unsharedCopy();
                    if (gVar.f81896b == w0VarPush) {
                        gVar.f81896b = w0VarUnsharedCopy;
                    }
                    w0VarPush = w0VarPush.push(w0VarUnsharedCopy);
                    w0 w0Var = w0VarPush.f82000g;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var);
                    w0Var.pop();
                }
            }
            setSegment$okio(w0VarPush);
            this.f81901f = j10;
            kotlin.jvm.internal.e0.checkNotNull(w0VarPush);
            this.f81902g = w0VarPush.f81994a;
            int i11 = w0VarPush.f81995b + ((int) (j10 - j11));
            this.f81903h = i11;
            int i12 = w0VarPush.f81996c;
            this.f81904i = i12;
            return i12 - i11;
        }

        public final void setSegment$okio(w0 w0Var) {
            this.f81900e = w0Var;
        }
    }

    public static /* synthetic */ g copyTo$default(g gVar, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = gVar.f81897c - j12;
        }
        return gVar.copyTo(outputStream, j12, j11);
    }

    public static /* synthetic */ a readAndWriteUnsafe$default(g gVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = b.getDEFAULT__new_UnsafeCursor();
        }
        return gVar.readAndWriteUnsafe(aVar);
    }

    public static /* synthetic */ a readUnsafe$default(g gVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = b.getDEFAULT__new_UnsafeCursor();
        }
        return gVar.readUnsafe(aVar);
    }

    public static /* synthetic */ g writeTo$default(g gVar, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = gVar.f81897c;
        }
        return gVar.writeTo(outputStream, j10);
    }

    @tu.f
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m5878deprecated_getByte(long j10) {
        return getByte(j10);
    }

    @tu.f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final long m5879deprecated_size() {
        return this.f81897c;
    }

    public final l b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        w0 w0Var = this.f81896b;
        if (w0Var != null) {
            byte[] bArr = w0Var.f81994a;
            int i10 = w0Var.f81995b;
            messageDigest.update(bArr, i10, w0Var.f81996c - i10);
            w0 w0Var2 = w0Var.f81999f;
            kotlin.jvm.internal.e0.checkNotNull(w0Var2);
            while (w0Var2 != w0Var) {
                byte[] bArr2 = w0Var2.f81994a;
                int i11 = w0Var2.f81995b;
                messageDigest.update(bArr2, i11, w0Var2.f81996c - i11);
                w0Var2 = w0Var2.f81999f;
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new l(bArrDigest);
    }

    public final l c(String str, l lVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(lVar.internalArray$okio(), str));
            w0 w0Var = this.f81896b;
            if (w0Var != null) {
                byte[] bArr = w0Var.f81994a;
                int i10 = w0Var.f81995b;
                mac.update(bArr, i10, w0Var.f81996c - i10);
                w0 w0Var2 = w0Var.f81999f;
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                while (w0Var2 != w0Var) {
                    byte[] bArr2 = w0Var2.f81994a;
                    int i11 = w0Var2.f81995b;
                    mac.update(bArr2, i11, w0Var2.f81996c - i11);
                    w0Var2 = w0Var2.f81999f;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new l(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        w0 w0Var2 = w0Var.f82000g;
        kotlin.jvm.internal.e0.checkNotNull(w0Var2);
        return (w0Var2.f81996c >= 8192 || !w0Var2.f81998e) ? size : size - (r3 - w0Var2.f81995b);
    }

    public final g copy() {
        g gVar = new g();
        if (size() == 0) {
            return gVar;
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        w0 w0VarSharedCopy = w0Var.sharedCopy();
        gVar.f81896b = w0VarSharedCopy;
        w0VarSharedCopy.f82000g = w0VarSharedCopy;
        w0VarSharedCopy.f81999f = w0VarSharedCopy;
        for (w0 w0Var2 = w0Var.f81999f; w0Var2 != w0Var; w0Var2 = w0Var2.f81999f) {
            w0 w0Var3 = w0VarSharedCopy.f82000g;
            kotlin.jvm.internal.e0.checkNotNull(w0Var3);
            kotlin.jvm.internal.e0.checkNotNull(w0Var2);
            w0Var3.push(w0Var2.sharedCopy());
        }
        gVar.setSize$okio(size());
        return gVar;
    }

    public final g copyTo(OutputStream out) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    public final void d(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            w0 w0VarWritableSegment$okio = writableSegment$okio(1);
            int i10 = inputStream.read(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, (int) Math.min(j10, 8192 - w0VarWritableSegment$okio.f81996c));
            if (i10 == -1) {
                if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
                    this.f81896b = w0VarWritableSegment$okio.pop();
                    x0.recycle(w0VarWritableSegment$okio);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            w0VarWritableSegment$okio.f81996c += i10;
            long j11 = i10;
            this.f81897c += j11;
            j10 -= j11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (size() != gVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        w0 w0Var2 = gVar.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var2);
        int i10 = w0Var.f81995b;
        int i11 = w0Var2.f81995b;
        long j10 = 0;
        while (j10 < size()) {
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
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                i10 = w0Var.f81995b;
            }
            if (i11 == w0Var2.f81996c) {
                w0Var2 = w0Var2.f81999f;
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                i11 = w0Var2.f81995b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // pw.k
    public boolean exhausted() {
        return this.f81897c == 0;
    }

    public final byte getByte(long j10) {
        b.checkOffsetAndCount(size(), j10, 1L);
        w0 w0Var = this.f81896b;
        if (w0Var == null) {
            kotlin.jvm.internal.e0.checkNotNull(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                size -= w0Var.f81996c - w0Var.f81995b;
            }
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            return w0Var.f81994a[(int) ((w0Var.f81995b + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (w0Var.f81996c - w0Var.f81995b) + j11;
            if (j12 > j10) {
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                return w0Var.f81994a[(int) ((w0Var.f81995b + j10) - j11)];
            }
            w0Var = w0Var.f81999f;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            j11 = j12;
        }
    }

    public int hashCode() {
        w0 w0Var = this.f81896b;
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
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
        } while (w0Var != this.f81896b);
        return i10;
    }

    public final l hmacSha1(l key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return c("HmacSHA1", key);
    }

    public final l hmacSha256(l key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return c("HmacSHA256", key);
    }

    public final l hmacSha512(l key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return c("HmacSHA512", key);
    }

    @Override // pw.k
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // pw.k
    public long indexOfElement(l targetBytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // pw.k
    public InputStream inputStream() {
        return new h(this);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final l md5() {
        return b(SameMD5.TAG);
    }

    @Override // pw.j
    public OutputStream outputStream() {
        return new i(this);
    }

    @Override // pw.k
    public k peek() {
        return h0.buffer(new o0(this));
    }

    @Override // pw.k
    public boolean rangeEquals(long j10, l bytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j10, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        w0 w0Var = this.f81896b;
        if (w0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), w0Var.f81996c - w0Var.f81995b);
        sink.put(w0Var.f81994a, w0Var.f81995b, iMin);
        int i10 = w0Var.f81995b + iMin;
        w0Var.f81995b = i10;
        this.f81897c -= iMin;
        if (i10 == w0Var.f81996c) {
            this.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        }
        return iMin;
    }

    @Override // pw.k
    public long readAll(z0 sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final a readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // pw.k
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        int i12 = i10 + 1;
        byte b10 = w0Var.f81994a[i10];
        setSize$okio(size() - 1);
        if (i12 != i11) {
            w0Var.f81995b = i12;
            return b10;
        }
        this.f81896b = w0Var.pop();
        x0.recycle(w0Var);
        return b10;
    }

    @Override // pw.k
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // pw.k
    public l readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new pw.g().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // pw.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.g.readDecimalLong():long");
    }

    public final g readFrom(InputStream input) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        d(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // pw.k
    public void readFully(g sink, long j10) throws EOFException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.write(this, j10);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // pw.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            pw.w0 r6 = r14.f81896b
            kotlin.jvm.internal.e0.checkNotNull(r6)
            byte[] r7 = r6.f81994a
            int r8 = r6.f81995b
            int r9 = r6.f81996c
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            pw.g r0 = new pw.g
            r0.<init>()
            pw.g r0 = r0.writeHexadecimalUnsignedLong(r4)
            pw.g r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = pw.b.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            pw.w0 r7 = r6.pop()
            r14.f81896b = r7
            pw.x0.recycle(r6)
            goto L9b
        L99:
            r6.f81995b = r8
        L9b:
            if (r1 != 0) goto La1
            pw.w0 r6 = r14.f81896b
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.g.readHexadecimalUnsignedLong():long");
    }

    @Override // pw.k
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        if (i11 - i10 < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = w0Var.f81994a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        setSize$okio(size() - 4);
        if (i14 != i11) {
            w0Var.f81995b = i14;
            return i15;
        }
        this.f81896b = w0Var.pop();
        x0.recycle(w0Var);
        return i15;
    }

    @Override // pw.k
    public int readIntLe() throws EOFException {
        return b.reverseBytes(readInt());
    }

    @Override // pw.k
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        if (i11 - i10 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = w0Var.f81994a;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        setSize$okio(size() - 8);
        if (i13 != i11) {
            w0Var.f81995b = i13;
            return j11;
        }
        this.f81896b = w0Var.pop();
        x0.recycle(w0Var);
        return j11;
    }

    @Override // pw.k
    public long readLongLe() throws EOFException {
        return b.reverseBytes(readLong());
    }

    @Override // pw.k
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        int i11 = w0Var.f81996c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = w0Var.f81994a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        setSize$okio(size() - 2);
        if (i14 == i11) {
            this.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        } else {
            w0Var.f81995b = i14;
        }
        return (short) i15;
    }

    @Override // pw.k
    public short readShortLe() throws EOFException {
        return b.reverseBytes(readShort());
    }

    @Override // pw.k
    public String readString(Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        return readString(this.f81897c, charset);
    }

    public final a readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // pw.k
    public String readUtf8() {
        return readString(this.f81897c, sv.g.f86134b);
    }

    @Override // pw.k
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b10 = getByte(0L);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j10 = i11;
        if (size() < j10) {
            StringBuilder sbT = o2.t(i11, "size < ", ": ");
            sbT.append(size());
            sbT.append(" (to read code point prefixed 0x");
            sbT.append(b.toHexString(b10));
            sbT.append(')');
            throw new EOFException(sbT.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = getByte(j11);
            if ((b11 & 192) != 128) {
                skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j10);
        return i10 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // pw.k
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return qw.a.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // pw.k
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // pw.k
    public boolean request(long j10) {
        return this.f81897c >= j10;
    }

    @Override // pw.k
    public void require(long j10) throws EOFException {
        if (this.f81897c < j10) {
            throw new EOFException();
        }
    }

    @Override // pw.k
    public int select(l0 options) throws EOFException {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = qw.a.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j10) {
        this.f81897c = j10;
    }

    public final l sha1() {
        return b(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final l sha256() {
        return b("SHA-256");
    }

    public final l sha512() {
        return b("SHA-512");
    }

    public final long size() {
        return this.f81897c;
    }

    @Override // pw.k
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            w0 w0Var = this.f81896b;
            if (w0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, w0Var.f81996c - w0Var.f81995b);
            long j11 = iMin;
            setSize$okio(size() - j11);
            j10 -= j11;
            int i10 = w0Var.f81995b + iMin;
            w0Var.f81995b = i10;
            if (i10 == w0Var.f81996c) {
                this.f81896b = w0Var.pop();
                x0.recycle(w0Var);
            }
        }
    }

    public final l snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // pw.k, pw.b1
    public d1 timeout() {
        return d1.f81884f;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final w0 writableSegment$okio(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w0 w0Var = this.f81896b;
        if (w0Var != null) {
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            w0 w0Var2 = w0Var.f82000g;
            kotlin.jvm.internal.e0.checkNotNull(w0Var2);
            return (w0Var2.f81996c + i10 > 8192 || !w0Var2.f81998e) ? w0Var2.push(x0.take()) : w0Var2;
        }
        w0 w0VarTake = x0.take();
        this.f81896b = w0VarTake;
        w0VarTake.f82000g = w0VarTake;
        w0VarTake.f81999f = w0VarTake;
        return w0VarTake;
    }

    @Override // pw.j
    public long writeAll(b1 source) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public final g writeTo(OutputStream out) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    public g clone() {
        return copy();
    }

    public final g copyTo(OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j10, 0L, 4, (Object) null);
    }

    @Override // pw.j
    public g emit() {
        return this;
    }

    @Override // pw.j
    public g emitCompleteSegments() {
        return this;
    }

    @Override // pw.k
    public long indexOf(byte b10, long j10) {
        return indexOf(b10, j10, Long.MAX_VALUE);
    }

    @Override // pw.k
    public long indexOfElement(l targetBytes, long j10) {
        int i10;
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "fromIndex < 0: ").toString());
        }
        w0 w0Var = this.f81896b;
        if (w0Var == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                size -= w0Var.f81996c - w0Var.f81995b;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < size()) {
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
                    kotlin.jvm.internal.e0.checkNotNull(w0Var);
                    j10 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < size()) {
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
                    kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (size < size()) {
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
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                j10 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < size()) {
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
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                j10 = size;
            }
        }
        return -1L;
        return (i10 - i11) + size;
    }

    @Override // pw.k
    public boolean rangeEquals(long j10, l bytes, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return i11 >= 0 && j10 >= 0 && ((long) i11) + j10 <= size() && i10 >= 0 && i10 + i11 <= bytes.size() && (i11 == 0 || qw.a.commonIndexOf(this, bytes, j10, j10 + 1, i10, i11) != -1);
    }

    public final a readAndWriteUnsafe(a unsafeCursor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return qw.a.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // pw.k
    public byte[] readByteArray(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // pw.k
    public l readByteString(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new l(readByteArray(j10));
        }
        l lVarSnapshot = snapshot((int) j10);
        skip(j10);
        return lVarSnapshot;
    }

    public final g readFrom(InputStream input, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        d(input, j10, false);
        return this;
    }

    @Override // pw.k
    public String readString(long j10, Charset charset) throws EOFException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (this.f81897c < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        w0 w0Var = this.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        int i10 = w0Var.f81995b;
        if (i10 + j10 > w0Var.f81996c) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(w0Var.f81994a, i10, i11, charset);
        int i12 = w0Var.f81995b + i11;
        w0Var.f81995b = i12;
        this.f81897c -= j10;
        if (i12 == w0Var.f81996c) {
            this.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        }
        return str;
    }

    public final a readUnsafe(a unsafeCursor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return qw.a.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // pw.k
    public String readUtf8(long j10) throws EOFException {
        return readString(j10, sv.g.f86134b);
    }

    @Override // pw.k
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return qw.a.readUtf8Line(this, jIndexOf);
        }
        if (j11 < size() && getByte(j11 - 1) == 13 && getByte(j11) == 10) {
            return qw.a.readUtf8Line(this, j11);
        }
        g gVar = new g();
        copyTo(gVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + gVar.readByteString().hex() + (char) 8230);
    }

    @Override // pw.j
    public g writeByte(int i10) {
        w0 w0VarWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        w0VarWritableSegment$okio.f81996c = i11 + 1;
        bArr[i11] = (byte) i10;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // pw.j
    public g writeDecimalLong(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iAccess$countDigitsIn = qw.a.access$countDigitsIn(j10);
        if (z10) {
            iAccess$countDigitsIn++;
        }
        w0 w0VarWritableSegment$okio = writableSegment$okio(iAccess$countDigitsIn);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i10 = w0VarWritableSegment$okio.f81996c + iAccess$countDigitsIn;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = qw.a.getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        w0VarWritableSegment$okio.f81996c += iAccess$countDigitsIn;
        setSize$okio(size() + iAccess$countDigitsIn);
        return this;
    }

    @Override // pw.j
    public g writeHexadecimalUnsignedLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
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
        w0 w0VarWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = qw.a.getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        w0VarWritableSegment$okio.f81996c += i10;
        setSize$okio(size() + i10);
        return this;
    }

    @Override // pw.j
    public g writeInt(int i10) {
        w0 w0VarWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        w0VarWritableSegment$okio.f81996c = i11 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // pw.j
    public g writeIntLe(int i10) {
        return writeInt(b.reverseBytes(i10));
    }

    @Override // pw.j
    public g writeLong(long j10) {
        w0 w0VarWritableSegment$okio = writableSegment$okio(8);
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
        setSize$okio(size() + 8);
        return this;
    }

    @Override // pw.j
    public g writeLongLe(long j10) {
        return writeLong(b.reverseBytes(j10));
    }

    @Override // pw.j
    public g writeShort(int i10) {
        w0 w0VarWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = w0VarWritableSegment$okio.f81994a;
        int i11 = w0VarWritableSegment$okio.f81996c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        w0VarWritableSegment$okio.f81996c = i11 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // pw.j
    public g writeShortLe(int i10) {
        return writeShort((int) b.reverseBytes((short) i10));
    }

    public final g writeTo(OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        b.checkOffsetAndCount(this.f81897c, 0L, j10);
        w0 w0Var = this.f81896b;
        long j11 = j10;
        while (j11 > 0) {
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            int iMin = (int) Math.min(j11, w0Var.f81996c - w0Var.f81995b);
            out.write(w0Var.f81994a, w0Var.f81995b, iMin);
            int i10 = w0Var.f81995b + iMin;
            w0Var.f81995b = i10;
            long j12 = iMin;
            this.f81897c -= j12;
            j11 -= j12;
            if (i10 == w0Var.f81996c) {
                w0 w0VarPop = w0Var.pop();
                this.f81896b = w0VarPop;
                x0.recycle(w0Var);
                w0Var = w0VarPop;
            }
        }
        return this;
    }

    @Override // pw.j
    public g writeUtf8CodePoint(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            w0 w0VarWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = w0VarWritableSegment$okio.f81994a;
            int i11 = w0VarWritableSegment$okio.f81996c;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            w0VarWritableSegment$okio.f81996c = i11 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            w0 w0VarWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = w0VarWritableSegment$okio2.f81994a;
            int i12 = w0VarWritableSegment$okio2.f81996c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            w0VarWritableSegment$okio2.f81996c = i12 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + b.toHexString(i10));
        }
        w0 w0VarWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = w0VarWritableSegment$okio3.f81994a;
        int i13 = w0VarWritableSegment$okio3.f81996c;
        bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        w0VarWritableSegment$okio3.f81996c = i13 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ g copyTo$default(g gVar, g gVar2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return gVar.copyTo(gVar2, j10, j11);
    }

    public final g copyTo(OutputStream out, long j10, long j11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        long j12 = j10;
        b.checkOffsetAndCount(this.f81897c, j12, j11);
        if (j11 != 0) {
            w0 w0Var = this.f81896b;
            while (true) {
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                int iMin = (int) Math.min(w0Var2.f81996c - r1, j13);
                out.write(w0Var2.f81994a, (int) (w0Var2.f81995b + j12), iMin);
                j13 -= iMin;
                w0Var2 = w0Var2.f81999f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // pw.k
    public long indexOf(l bytes) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // pw.j
    public g writeString(String string, Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // pw.j
    public g writeUtf8(String string) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ g copyTo$default(g gVar, g gVar2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return gVar.copyTo(gVar2, j10);
    }

    @Override // pw.k
    public long indexOf(l bytes, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, j10, Long.MAX_VALUE);
    }

    @Override // pw.k
    public <T> T select(e1 options) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        int iSelect = select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return (T) options.get(iSelect);
    }

    public final l snapshot(int i10) {
        if (i10 == 0) {
            return l.f81912g;
        }
        b.checkOffsetAndCount(size(), 0L, i10);
        w0 w0Var = this.f81896b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
        w0 w0Var2 = this.f81896b;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.e0.checkNotNull(w0Var2);
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

    @Override // pw.j
    public g writeUtf8(String string, int i10, int i11) {
        char cCharAt;
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 >= i10) {
            if (i11 > string.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(string.length());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
            while (i10 < i11) {
                char cCharAt2 = string.charAt(i10);
                if (cCharAt2 < 128) {
                    w0 w0VarWritableSegment$okio = writableSegment$okio(1);
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
                    setSize$okio(size() + i15);
                } else {
                    if (cCharAt2 < 2048) {
                        w0 w0VarWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = w0VarWritableSegment$okio2.f81994a;
                        int i16 = w0VarWritableSegment$okio2.f81996c;
                        bArr2[i16] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        w0VarWritableSegment$okio2.f81996c = i16 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i17 = i10 + 1;
                        char cCharAt3 = i17 < i11 ? string.charAt(i17) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            w0 w0VarWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = w0VarWritableSegment$okio3.f81994a;
                            int i19 = w0VarWritableSegment$okio3.f81996c;
                            bArr3[i19] = (byte) ((i18 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                            bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                            bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                            w0VarWritableSegment$okio3.f81996c = i19 + 4;
                            setSize$okio(size() + 4);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i17;
                        }
                    } else {
                        w0 w0VarWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = w0VarWritableSegment$okio4.f81994a;
                        int i20 = w0VarWritableSegment$okio4.f81996c;
                        bArr4[i20] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i20 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i20 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        w0VarWritableSegment$okio4.f81996c = i20 + 3;
                        setSize$okio(size() + 3);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // pw.k
    public long indexOf(l bytes, long j10, long j11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return qw.a.commonIndexOf$default(this, bytes, j10, j11, 0, 0, 24, null);
    }

    @Override // pw.k
    public void readFully(byte[] sink) throws EOFException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // pw.j
    public g writeString(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 >= i10) {
            if (i11 <= string.length()) {
                if (kotlin.jvm.internal.e0.areEqual(charset, sv.g.f86134b)) {
                    return writeUtf8(string, i10, i11);
                }
                String strSubstring = string.substring(i10, i11);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
            sbT.append(string.length());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        throw new IllegalArgumentException(w0.i.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // pw.k
    public long indexOf(byte b10, long j10, long j11) {
        w0 w0Var;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(size());
            sb2.append(" fromIndex=");
            sb2.append(j10);
            throw new IllegalArgumentException(e2.i(j11, " toIndex=", sb2).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (w0Var = this.f81896b) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                w0Var = w0Var.f82000g;
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            j10 = size;
        }
        return -1L;
        return (i10 - w0Var.f81995b) + size;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            w0 w0VarWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10, 8192 - w0VarWritableSegment$okio.f81996c);
            source.get(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, iMin);
            i10 -= iMin;
            w0VarWritableSegment$okio.f81996c += iMin;
        }
        this.f81897c += iRemaining;
        return iRemaining;
    }

    @Override // pw.k
    public int read(byte[] sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // pw.k
    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        b.checkOffsetAndCount(sink.length, i10, i11);
        w0 w0Var = this.f81896b;
        if (w0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, w0Var.f81996c - w0Var.f81995b);
        byte[] bArr = w0Var.f81994a;
        int i12 = w0Var.f81995b;
        uu.f0.copyInto(bArr, sink, i10, i12, i12 + iMin);
        w0Var.f81995b += iMin;
        setSize$okio(size() - iMin);
        if (w0Var.f81995b == w0Var.f81996c) {
            this.f81896b = w0Var.pop();
            x0.recycle(w0Var);
        }
        return iMin;
    }

    public final g copyTo(g out, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        return copyTo(out, j10, this.f81897c - j10);
    }

    @Override // pw.j
    public g write(l byteString) {
        kotlin.jvm.internal.e0.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final g copyTo(g out, long j10, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        long j12 = j10;
        b.checkOffsetAndCount(size(), j12, j11);
        if (j11 != 0) {
            out.setSize$okio(out.size() + j11);
            w0 w0Var = this.f81896b;
            while (true) {
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
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
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                w0 w0VarSharedCopy = w0Var2.sharedCopy();
                int i12 = w0VarSharedCopy.f81995b + ((int) j12);
                w0VarSharedCopy.f81995b = i12;
                w0VarSharedCopy.f81996c = Math.min(i12 + ((int) j13), w0VarSharedCopy.f81996c);
                w0 w0Var3 = out.f81896b;
                if (w0Var3 == null) {
                    w0VarSharedCopy.f82000g = w0VarSharedCopy;
                    w0VarSharedCopy.f81999f = w0VarSharedCopy;
                    out.f81896b = w0VarSharedCopy;
                } else {
                    kotlin.jvm.internal.e0.checkNotNull(w0Var3);
                    w0 w0Var4 = w0Var3.f82000g;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var4);
                    w0Var4.push(w0VarSharedCopy);
                }
                j13 -= w0VarSharedCopy.f81996c - w0VarSharedCopy.f81995b;
                w0Var2 = w0Var2.f81999f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // pw.j
    public g write(l byteString, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, i10, i11);
        return this;
    }

    @Override // pw.j
    public g write(byte[] source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // pw.j
    public g write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        long j10 = i11;
        b.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            w0 w0VarWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - w0VarWritableSegment$okio.f81996c);
            int i13 = i10 + iMin;
            uu.f0.copyInto(source, w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, i10, i13);
            w0VarWritableSegment$okio.f81996c += iMin;
            i10 = i13;
        }
        setSize$okio(size() + j10);
        return this;
    }

    @Override // pw.k, pw.j
    public g buffer() {
        return this;
    }

    @Override // pw.k, pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // pw.j, pw.z0, java.io.Flushable
    public void flush() {
    }

    @Override // pw.k, pw.j
    public g getBuffer() {
        return this;
    }

    @Override // pw.k, pw.b1
    public long read(g sink, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.write(this, j10);
        return j10;
    }

    @Override // pw.j
    public g write(b1 source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // pw.j, pw.z0
    public void write(g source, long j10) {
        w0 w0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (source != this) {
            b.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                w0 w0Var2 = source.f81896b;
                kotlin.jvm.internal.e0.checkNotNull(w0Var2);
                int i10 = w0Var2.f81996c;
                kotlin.jvm.internal.e0.checkNotNull(source.f81896b);
                if (j10 < i10 - r1.f81995b) {
                    w0 w0Var3 = this.f81896b;
                    if (w0Var3 != null) {
                        kotlin.jvm.internal.e0.checkNotNull(w0Var3);
                        w0Var = w0Var3.f82000g;
                    } else {
                        w0Var = null;
                    }
                    if (w0Var != null && w0Var.f81998e) {
                        if ((w0Var.f81996c + j10) - (w0Var.f81997d ? 0 : w0Var.f81995b) <= 8192) {
                            w0 w0Var4 = source.f81896b;
                            kotlin.jvm.internal.e0.checkNotNull(w0Var4);
                            w0Var4.writeTo(w0Var, (int) j10);
                            source.setSize$okio(source.size() - j10);
                            setSize$okio(size() + j10);
                            return;
                        }
                    }
                    w0 w0Var5 = source.f81896b;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var5);
                    source.f81896b = w0Var5.split((int) j10);
                }
                w0 w0Var6 = source.f81896b;
                kotlin.jvm.internal.e0.checkNotNull(w0Var6);
                long j11 = w0Var6.f81996c - w0Var6.f81995b;
                source.f81896b = w0Var6.pop();
                w0 w0Var7 = this.f81896b;
                if (w0Var7 == null) {
                    this.f81896b = w0Var6;
                    w0Var6.f82000g = w0Var6;
                    w0Var6.f81999f = w0Var6;
                } else {
                    kotlin.jvm.internal.e0.checkNotNull(w0Var7);
                    w0 w0Var8 = w0Var7.f82000g;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var8);
                    w0Var8.push(w0Var6).compact();
                }
                source.setSize$okio(source.size() - j11);
                setSize$okio(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
