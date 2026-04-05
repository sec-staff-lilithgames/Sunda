package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f29596a;

    public a(ByteBuffer byteBuffer) {
        this.f29596a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.splitinstall.internal.r
    public final long zza() {
        return this.f29596a.capacity();
    }

    @Override // com.google.android.play.core.splitinstall.internal.r
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f29596a) {
            int i11 = (int) j10;
            this.f29596a.position(i11);
            this.f29596a.limit(i11 + i10);
            byteBufferSlice = this.f29596a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
