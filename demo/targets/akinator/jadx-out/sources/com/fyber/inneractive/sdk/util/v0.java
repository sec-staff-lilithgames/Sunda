package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 extends BufferedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f26823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.f26823a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f26823a.getAndAdd(i12);
        }
        return i12;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f26823a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        long jSkip;
        jSkip = super.skip(j10);
        this.f26823a.addAndGet((int) jSkip);
        return jSkip;
    }
}
