package ph;

import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final Reader f81366b;

    /* renamed from: c, reason: collision with root package name */
    public final CharsetEncoder f81367c;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f81368e;

    /* renamed from: f, reason: collision with root package name */
    public CharBuffer f81369f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f81370g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81371h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f81372i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f81373j;

    public x0(Reader reader, Charset charset) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.f81368e = new byte[1];
        this.f81366b = (Reader) p1.checkNotNull(reader);
        this.f81367c = (CharsetEncoder) p1.checkNotNull(charsetEncoderOnUnmappableCharacter);
        p1.checkArgument(true, "bufferSize must be positive: %s", Segment.SIZE);
        charsetEncoderOnUnmappableCharacter.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(Segment.SIZE);
        this.f81369f = charBufferAllocate;
        charBufferAllocate.flip();
        this.f81370g = ByteBuffer.allocate(Segment.SIZE);
    }

    public final void a(boolean z10) {
        this.f81370g.flip();
        if (z10 && this.f81370g.remaining() == 0) {
            this.f81370g = ByteBuffer.allocate(this.f81370g.capacity() * 2);
        } else {
            this.f81372i = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81366b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f81368e;
        if (read(bArr) == 1) {
            return bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.x0.read(byte[], int, int):int");
    }
}
