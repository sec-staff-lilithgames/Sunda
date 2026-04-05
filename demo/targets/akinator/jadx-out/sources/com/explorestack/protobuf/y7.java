package com.explorestack.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y7 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f22913b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f22914c;

    /* renamed from: e, reason: collision with root package name */
    public final int f22915e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f22916f;

    /* renamed from: g, reason: collision with root package name */
    public int f22917g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22918h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f22919i;

    /* renamed from: j, reason: collision with root package name */
    public int f22920j;

    /* renamed from: k, reason: collision with root package name */
    public long f22921k;

    public y7(Iterable iterable) {
        this.f22913b = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f22915e++;
        }
        this.f22916f = -1;
        if (d()) {
            return;
        }
        this.f22914c = x7.f22884d;
        this.f22916f = 0;
        this.f22917g = 0;
        this.f22921k = 0L;
    }

    public final boolean d() {
        this.f22916f++;
        Iterator it = this.f22913b;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f22914c = byteBuffer;
        this.f22917g = byteBuffer.position();
        if (this.f22914c.hasArray()) {
            this.f22918h = true;
            this.f22919i = this.f22914c.array();
            this.f22920j = this.f22914c.arrayOffset();
        } else {
            this.f22918h = false;
            this.f22921k = sc.b(this.f22914c);
            this.f22919i = null;
        }
        return true;
    }

    public final void e(int i10) {
        int i11 = this.f22917g + i10;
        this.f22917g = i11;
        if (i11 == this.f22914c.limit()) {
            d();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f22916f == this.f22915e) {
            return -1;
        }
        if (this.f22918h) {
            int i10 = this.f22919i[this.f22917g + this.f22920j] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            e(1);
            return i10;
        }
        int i11 = sc.f22643c.getByte(this.f22917g + this.f22921k) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        e(1);
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f22916f == this.f22915e) {
            return -1;
        }
        int iLimit = this.f22914c.limit();
        int i12 = this.f22917g;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f22918h) {
            System.arraycopy(this.f22919i, i12 + this.f22920j, bArr, i10, i11);
            e(i11);
            return i11;
        }
        int iPosition = this.f22914c.position();
        this.f22914c.position(this.f22917g);
        this.f22914c.get(bArr, i10, i11);
        this.f22914c.position(iPosition);
        e(i11);
        return i11;
    }
}
