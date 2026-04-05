package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f25930a;

    /* renamed from: b, reason: collision with root package name */
    public final m f25931b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f25932c;

    /* renamed from: d, reason: collision with root package name */
    public AssetFileDescriptor f25933d;

    /* renamed from: e, reason: collision with root package name */
    public FileInputStream f25934e;

    /* renamed from: f, reason: collision with root package name */
    public long f25935f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25936g;

    public f(Context context, m mVar) {
        this.f25930a = context.getContentResolver();
        this.f25931b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws e, EOFException, FileNotFoundException {
        try {
            Uri uri = kVar.f25944a;
            this.f25932c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f25930a.openAssetFileDescriptor(uri, "r");
            this.f25933d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f25932c);
            }
            this.f25934e = new FileInputStream(this.f25933d.getFileDescriptor());
            long startOffset = this.f25933d.getStartOffset();
            if (this.f25934e.skip(kVar.f25946c + startOffset) - startOffset != kVar.f25946c) {
                throw new EOFException();
            }
            long j10 = kVar.f25947d;
            if (j10 != -1) {
                this.f25935f = j10;
            } else {
                long length = this.f25933d.getLength();
                this.f25935f = length;
                if (length == -1) {
                    long jAvailable = this.f25934e.available();
                    this.f25935f = jAvailable;
                    if (jAvailable == 0) {
                        this.f25935f = -1L;
                    }
                }
            }
            this.f25936g = true;
            m mVar = this.f25931b;
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
            return this.f25935f;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f25932c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f25934e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f25934e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25933d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new e(e10);
                    }
                } finally {
                    this.f25933d = null;
                    if (this.f25936g) {
                        this.f25936g = false;
                        m mVar = this.f25931b;
                        if (mVar != null) {
                            mVar.a();
                        }
                    }
                }
            } catch (IOException e11) {
                throw new e(e11);
            }
        } catch (Throwable th2) {
            this.f25934e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f25933d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f25933d = null;
                    if (this.f25936g) {
                        this.f25936g = false;
                        m mVar2 = this.f25931b;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new e(e12);
                }
            } finally {
                this.f25933d = null;
                if (this.f25936g) {
                    this.f25936g = false;
                    m mVar3 = this.f25931b;
                    if (mVar3 != null) {
                        mVar3.a();
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25935f;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new e(e10);
            }
        }
        int i12 = this.f25934e.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f25935f == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j11 = this.f25935f;
        if (j11 != -1) {
            this.f25935f = j11 - i12;
        }
        m mVar = this.f25931b;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f25958d += i12;
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f25932c;
    }
}
