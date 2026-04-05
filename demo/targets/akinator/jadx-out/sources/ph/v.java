package ph;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import mh.k1;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v extends z {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f81357a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81359c;

    public v(byte[] bArr, int i10, int i11) {
        this.f81357a = bArr;
        this.f81358b = i10;
        this.f81359c = i11;
    }

    @Override // ph.z
    public long copyTo(OutputStream outputStream) throws IOException {
        byte[] bArr = this.f81357a;
        int i10 = this.f81358b;
        int i11 = this.f81359c;
        outputStream.write(bArr, i10, i11);
        return i11;
    }

    @Override // ph.z
    public oh.m hash(oh.n nVar) throws IOException {
        return nVar.b();
    }

    @Override // ph.z
    public boolean isEmpty() {
        return this.f81359c == 0;
    }

    @Override // ph.z
    public InputStream openBufferedStream() {
        return openStream();
    }

    @Override // ph.z
    public InputStream openStream() {
        return new ByteArrayInputStream(this.f81357a, this.f81358b, this.f81359c);
    }

    @Override // ph.z
    public byte[] read() {
        int i10 = this.f81359c;
        int i11 = this.f81358b;
        return Arrays.copyOfRange(this.f81357a, i11, i10 + i11);
    }

    @Override // ph.z
    public long size() {
        return this.f81359c;
    }

    @Override // ph.z
    public k1 sizeIfKnown() {
        return k1.of(Long.valueOf(this.f81359c));
    }

    @Override // ph.z
    public z slice(long j10, long j11) {
        p1.checkArgument(j10 >= 0, "offset (%s) may not be negative", j10);
        p1.checkArgument(j11 >= 0, "length (%s) may not be negative", j11);
        int i10 = this.f81359c;
        long jMin = Math.min(j10, i10);
        return new v(this.f81357a, this.f81358b + ((int) jMin), (int) Math.min(j11, i10 - jMin));
    }

    public String toString() {
        return "ByteSource.wrap(" + mh.c.truncate(o.base16().encode(this.f81357a, this.f81358b, this.f81359c), 30, APSSharedUtil.TRUNCATE_SEPARATOR) + ")";
    }

    @Override // ph.z
    public <T> T read(r rVar) throws IOException {
        rVar.a();
        return (T) rVar.getResult();
    }
}
