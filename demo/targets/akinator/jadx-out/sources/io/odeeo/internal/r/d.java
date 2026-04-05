package io.odeeo.internal.r;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends io.odeeo.internal.e.g {

    /* renamed from: i, reason: collision with root package name */
    public long f66032i;

    /* renamed from: j, reason: collision with root package name */
    public int f66033j;

    /* renamed from: k, reason: collision with root package name */
    public int f66034k;

    public d() {
        super(2);
        this.f66034k = 32;
    }

    public final boolean a(io.odeeo.internal.e.g gVar) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.f66033j >= this.f66034k || gVar.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f63705c;
        if (byteBuffer2 != null && (byteBuffer = this.f63705c) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                return false;
            }
        }
        return true;
    }

    public boolean append(io.odeeo.internal.e.g gVar) {
        io.odeeo.internal.q0.a.checkArgument(!gVar.isEncrypted());
        io.odeeo.internal.q0.a.checkArgument(!gVar.hasSupplementalData());
        io.odeeo.internal.q0.a.checkArgument(!gVar.isEndOfStream());
        if (!a(gVar)) {
            return false;
        }
        int i10 = this.f66033j;
        this.f66033j = i10 + 1;
        if (i10 == 0) {
            this.f63707e = gVar.f63707e;
            if (gVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (gVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f63705c;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.f63705c.put(byteBuffer);
        }
        this.f66032i = gVar.f63707e;
        return true;
    }

    @Override // io.odeeo.internal.e.g, io.odeeo.internal.e.a
    public void clear() {
        super.clear();
        this.f66033j = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.f63707e;
    }

    public long getLastSampleTimeUs() {
        return this.f66032i;
    }

    public int getSampleCount() {
        return this.f66033j;
    }

    public boolean hasSamples() {
        return this.f66033j > 0;
    }

    public void setMaxSampleCount(int i10) {
        io.odeeo.internal.q0.a.checkArgument(i10 > 0);
        this.f66034k = i10;
    }
}
