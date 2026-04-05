package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k3 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public j3 f5939b;

    /* renamed from: c, reason: collision with root package name */
    public r f5940c;

    /* renamed from: e, reason: collision with root package name */
    public int f5941e;

    /* renamed from: f, reason: collision with root package name */
    public int f5942f;

    /* renamed from: g, reason: collision with root package name */
    public int f5943g;

    /* renamed from: h, reason: collision with root package name */
    public int f5944h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l3 f5945i;

    public k3(l3 l3Var) {
        this.f5945i = l3Var;
        j3 j3Var = new j3(l3Var);
        this.f5939b = j3Var;
        r next = j3Var.next();
        this.f5940c = next;
        this.f5941e = next.size();
        this.f5942f = 0;
        this.f5943g = 0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f5945i.size() - (this.f5943g + this.f5942f);
    }

    public final void d() {
        if (this.f5940c != null) {
            int i10 = this.f5942f;
            int i11 = this.f5941e;
            if (i10 == i11) {
                this.f5943g += i11;
                this.f5942f = 0;
                if (!this.f5939b.hasNext()) {
                    this.f5940c = null;
                    this.f5941e = 0;
                } else {
                    r next = this.f5939b.next();
                    this.f5940c = next;
                    this.f5941e = next.size();
                }
            }
        }
    }

    public final int e(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            d();
            if (this.f5940c == null) {
                break;
            }
            int iMin = Math.min(this.f5941e - this.f5942f, i12);
            if (bArr != null) {
                this.f5940c.copyTo(bArr, this.f5942f, i10, iMin);
                i10 += iMin;
            }
            this.f5942f += iMin;
            i12 -= iMin;
        }
        return i11 - i12;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f5944h = this.f5943g + this.f5942f;
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
            if (this.f5945i.size() - (this.f5943g + this.f5942f) != 0) {
                return iE;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        j3 j3Var = new j3(this.f5945i);
        this.f5939b = j3Var;
        r next = j3Var.next();
        this.f5940c = next;
        this.f5941e = next.size();
        this.f5942f = 0;
        this.f5943g = 0;
        e(null, 0, this.f5944h);
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
        r rVar = this.f5940c;
        if (rVar == null) {
            return -1;
        }
        int i10 = this.f5942f;
        this.f5942f = i10 + 1;
        return rVar.byteAt(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
