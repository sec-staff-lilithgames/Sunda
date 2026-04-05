package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f6048b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f6049c;

    /* renamed from: e, reason: collision with root package name */
    public final int f6050e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f6051f;

    /* renamed from: g, reason: collision with root package name */
    public int f6052g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6053h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f6054i;

    /* renamed from: j, reason: collision with root package name */
    public int f6055j;

    /* renamed from: k, reason: collision with root package name */
    public long f6056k;

    public v1(Iterable iterable) {
        this.f6048b = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f6050e++;
        }
        this.f6051f = -1;
        if (d()) {
            return;
        }
        this.f6049c = t1.f6009d;
        this.f6051f = 0;
        this.f6052g = 0;
        this.f6056k = 0L;
    }

    public final boolean d() {
        this.f6051f++;
        Iterator it = this.f6048b;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f6049c = byteBuffer;
        this.f6052g = byteBuffer.position();
        if (this.f6049c.hasArray()) {
            this.f6053h = true;
            this.f6054i = this.f6049c.array();
            this.f6055j = this.f6049c.arrayOffset();
        } else {
            this.f6053h = false;
            this.f6056k = j4.b(this.f6049c);
            this.f6054i = null;
        }
        return true;
    }

    public final void e(int i10) {
        int i11 = this.f6052g + i10;
        this.f6052g = i11;
        if (i11 == this.f6049c.limit()) {
            d();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f6051f == this.f6050e) {
            return -1;
        }
        if (this.f6053h) {
            int i10 = this.f6054i[this.f6052g + this.f6055j] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            e(1);
            return i10;
        }
        int i11 = j4.f5924c.getByte(this.f6052g + this.f6056k) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        e(1);
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f6051f == this.f6050e) {
            return -1;
        }
        int iLimit = this.f6049c.limit();
        int i12 = this.f6052g;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f6053h) {
            System.arraycopy(this.f6054i, i12 + this.f6055j, bArr, i10, i11);
            e(i11);
            return i11;
        }
        int iPosition = this.f6049c.position();
        this.f6049c.position(this.f6052g);
        this.f6049c.get(bArr, i10, i11);
        this.f6049c.position(iPosition);
        e(i11);
        return i11;
    }
}
