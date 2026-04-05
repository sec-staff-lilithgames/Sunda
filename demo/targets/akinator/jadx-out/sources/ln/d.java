package ln;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import io.bidmachine.media3.common.util.a1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f73427e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f73428f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f73429g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f73430h;

    /* renamed from: i, reason: collision with root package name */
    public long f73431i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f73432j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j {
        @Deprecated
        public a(IOException iOException) {
            this(iOException, 2000);
        }

        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f73427e = context.getContentResolver();
    }

    @Override // ln.b, ln.i
    public void close() throws a {
        this.f73428f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f73430h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f73430h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f73429g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f73429g = null;
                    if (this.f73432j) {
                        this.f73432j = false;
                        b();
                    }
                }
            } catch (IOException e11) {
                throw new a(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f73430h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f73429g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f73429g = null;
                    if (this.f73432j) {
                        this.f73432j = false;
                        b();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(e12, 2000);
                }
            } finally {
                this.f73429g = null;
                if (this.f73432j) {
                    this.f73432j = false;
                    b();
                }
            }
        }
    }

    @Override // ln.b, ln.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // ln.b, ln.i
    public Uri getUri() {
        return this.f73428f;
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws IOException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = mVar.f73467a;
                long j10 = mVar.f73473g;
                long j11 = mVar.f73472f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f73428f = uriNormalizeScheme;
                c(mVar);
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f73427e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f73429g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e10) {
                        e = e10;
                        if (e instanceof FileNotFoundException) {
                            i10 = 2005;
                        }
                        throw new a(e, i10);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f73430h = fileInputStream;
                if (length != -1 && j11 > length) {
                    throw new a(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new a(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f73431i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f73431i = jPosition;
                        if (jPosition < 0) {
                            throw new a(null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f73431i = j12;
                    if (j12 < 0) {
                        throw new a(null, 2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f73431i;
                    this.f73431i = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f73432j = true;
                d(mVar);
                return j10 != -1 ? j10 : this.f73431i;
            } catch (IOException e11) {
                e = e11;
                i10 = 2000;
            }
        } catch (a e12) {
            throw e12;
        }
    }

    @Override // ln.b, ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f73431i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) a1.castNonNull(this.f73430h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f73431i;
        if (j11 != -1) {
            this.f73431i = j11 - i12;
        }
        a(i12);
        return i12;
    }
}
