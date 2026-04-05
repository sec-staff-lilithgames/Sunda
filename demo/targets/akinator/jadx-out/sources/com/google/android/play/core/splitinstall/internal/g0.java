package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f29612a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29613b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29614c;

    public g0(FileChannel fileChannel, long j10, long j11) {
        this.f29612a = fileChannel;
        this.f29613b = j10;
        this.f29614c = j11;
    }

    @Override // com.google.android.play.core.splitinstall.internal.r
    public final long zza() {
        return this.f29614c;
    }

    @Override // com.google.android.play.core.splitinstall.internal.r
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f29612a.map(FileChannel.MapMode.READ_ONLY, this.f29613b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
