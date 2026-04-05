package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class sa extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public ra f22634b;

    /* renamed from: c, reason: collision with root package name */
    public ByteString.LeafByteString f22635c;

    /* renamed from: e, reason: collision with root package name */
    public int f22636e;

    /* renamed from: f, reason: collision with root package name */
    public int f22637f;

    /* renamed from: g, reason: collision with root package name */
    public int f22638g;

    /* renamed from: h, reason: collision with root package name */
    public int f22639h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ta f22640i;

    public sa(ta taVar) {
        this.f22640i = taVar;
        ra raVar = new ra(taVar);
        this.f22634b = raVar;
        ByteString.LeafByteString next = raVar.next();
        this.f22635c = next;
        this.f22636e = next.size();
        this.f22637f = 0;
        this.f22638g = 0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f22640i.size() - (this.f22638g + this.f22637f);
    }

    public final void d() {
        if (this.f22635c != null) {
            int i10 = this.f22637f;
            int i11 = this.f22636e;
            if (i10 == i11) {
                this.f22638g += i11;
                this.f22637f = 0;
                if (!this.f22634b.hasNext()) {
                    this.f22635c = null;
                    this.f22636e = 0;
                } else {
                    ByteString.LeafByteString next = this.f22634b.next();
                    this.f22635c = next;
                    this.f22636e = next.size();
                }
            }
        }
    }

    public final int e(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            d();
            if (this.f22635c == null) {
                break;
            }
            int iMin = Math.min(this.f22636e - this.f22637f, i12);
            if (bArr != null) {
                this.f22635c.copyTo(bArr, this.f22637f, i10, iMin);
                i10 += iMin;
            }
            this.f22637f += iMin;
            i12 -= iMin;
        }
        return i11 - i12;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f22639h = this.f22638g + this.f22637f;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        int iE = e(bArr, i10, i11);
        if (iE != 0) {
            return iE;
        }
        if (i11 <= 0) {
            if (this.f22640i.size() - (this.f22638g + this.f22637f) != 0) {
                return iE;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        ra raVar = new ra(this.f22640i);
        this.f22634b = raVar;
        ByteString.LeafByteString next = raVar.next();
        this.f22635c = next;
        this.f22636e = next.size();
        this.f22637f = 0;
        this.f22638g = 0;
        e(null, 0, this.f22639h);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j10 > 2147483647L) {
            j10 = 2147483647L;
        }
        return e(null, 0, (int) j10);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        d();
        ByteString.LeafByteString leafByteString = this.f22635c;
        if (leafByteString == null) {
            return -1;
        }
        int i10 = this.f22637f;
        this.f22637f = i10 + 1;
        return leafByteString.byteAt(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
