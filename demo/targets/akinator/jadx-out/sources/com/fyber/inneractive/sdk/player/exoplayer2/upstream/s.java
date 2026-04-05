package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements h {

    /* renamed from: a, reason: collision with root package name */
    public final m f25991a;

    /* renamed from: b, reason: collision with root package name */
    public RandomAccessFile f25992b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f25993c;

    /* renamed from: d, reason: collision with root package name */
    public long f25994d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25995e;

    public s(m mVar) {
        this.f25991a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws IOException {
        try {
            this.f25993c = kVar.f25944a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f25944a.getPath(), "r");
            this.f25992b = randomAccessFile;
            randomAccessFile.seek(kVar.f25946c);
            long length = kVar.f25947d;
            if (length == -1) {
                length = this.f25992b.length() - kVar.f25946c;
            }
            this.f25994d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f25995e = true;
            m mVar = this.f25991a;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (mVar.f25956b == 0) {
                            mVar.f25957c = SystemClock.elapsedRealtime();
                        }
                        mVar.f25956b++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f25994d;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f25993c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f25992b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new r(e10);
            }
        } finally {
            this.f25992b = null;
            if (this.f25995e) {
                this.f25995e = false;
                m mVar = this.f25991a;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25994d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.f25992b.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                long j11 = i12;
                this.f25994d -= j11;
                m mVar = this.f25991a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.f25958d += j11;
                    }
                    return i12;
                }
            }
            return i12;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f25993c;
    }
}
