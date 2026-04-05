package io.odeeo.internal.p0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import io.odeeo.internal.q0.g0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends e {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f65609e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f65610f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f65611g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f65612h;

    /* renamed from: i, reason: collision with root package name */
    public long f65613i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65614j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public static void disableTranscoding(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends j {
        @Deprecated
        public b(IOException iOException) {
            this(iOException, 2000);
        }

        public b(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public f(Context context) {
        super(false);
        this.f65609e = context.getContentResolver();
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() throws b {
        this.f65610f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f65612h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f65612h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f65611g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new b(e10, 2000);
                    }
                } finally {
                    this.f65611g = null;
                    if (this.f65614j) {
                        this.f65614j = false;
                        a();
                    }
                }
            } catch (IOException e11) {
                throw new b(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f65612h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f65611g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f65611g = null;
                    if (this.f65614j) {
                        this.f65614j = false;
                        a();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new b(e12, 2000);
                }
            } finally {
                this.f65611g = null;
                if (this.f65614j) {
                    this.f65614j = false;
                    a();
                }
            }
        }
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f65610f;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = mVar.f65626a;
            this.f65610f = uri;
            a(mVar);
            if ("content".equals(mVar.f65626a.getScheme())) {
                Bundle bundle = new Bundle();
                if (g0.f65861a >= 31) {
                    a.disableTranscoding(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.f65609e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f65609e.openAssetFileDescriptor(uri, "r");
            }
            this.f65611g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f65612h = fileInputStream;
            if (length != -1 && mVar.f65632g > length) {
                throw new b(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(mVar.f65632g + startOffset) - startOffset;
            if (jSkip != mVar.f65632g) {
                throw new b(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f65613i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f65613i = jPosition;
                    if (jPosition < 0) {
                        throw new b(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f65613i = j10;
                if (j10 < 0) {
                    throw new b(null, 2008);
                }
            }
            long jMin = mVar.f65633h;
            if (jMin != -1) {
                long j11 = this.f65613i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f65613i = jMin;
            }
            this.f65614j = true;
            b(mVar);
            long j12 = mVar.f65633h;
            return j12 != -1 ? j12 : this.f65613i;
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            throw new b(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f65613i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) g0.castNonNull(this.f65612h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f65613i;
        if (j11 != -1) {
            this.f65613i = j11 - i12;
        }
        a(i12);
        return i12;
    }
}
