package com.explorestack.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y9 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f22924b;

    public y9(z9 z9Var) {
        this.f22924b = z9Var.f22977b.slice();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f22924b.remaining();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f22924b.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ByteBuffer byteBuffer = this.f22924b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f22924b.reset();
        } catch (InvalidMarkException e10) {
            throw new IOException(e10);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        ByteBuffer byteBuffer = this.f22924b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}
