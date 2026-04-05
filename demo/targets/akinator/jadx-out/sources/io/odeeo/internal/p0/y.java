package io.odeeo.internal.p0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import io.odeeo.internal.q0.g0;
import j1.o2;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends e {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f65766e;

    /* renamed from: f, reason: collision with root package name */
    public final String f65767f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f65768g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f65769h;

    /* renamed from: i, reason: collision with root package name */
    public InputStream f65770i;

    /* renamed from: j, reason: collision with root package name */
    public long f65771j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f65772k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j {
        @Deprecated
        public a(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public a(Throwable th2) {
            super(th2, 2000);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public y(Context context) {
        super(false);
        this.f65766e = context.getResources();
        this.f65767f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() throws a {
        this.f65768g = null;
        try {
            try {
                InputStream inputStream = this.f65770i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f65770i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f65769h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f65769h = null;
                    if (this.f65772k) {
                        this.f65772k = false;
                        a();
                    }
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f65770i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f65769h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f65769h = null;
                    if (this.f65772k) {
                        this.f65772k = false;
                        a();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f65769h = null;
                if (this.f65772k) {
                    this.f65772k = false;
                    a();
                }
            }
        }
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f65768g;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws Resources.NotFoundException, j, NumberFormatException {
        int identifier;
        Uri uri = mVar.f65626a;
        this.f65768g = uri;
        if (TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) io.odeeo.internal.q0.a.checkNotNull(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) io.odeeo.internal.q0.a.checkNotNull(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) io.odeeo.internal.q0.a.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            identifier = this.f65766e.getIdentifier(o2.o(new StringBuilder(), TextUtils.isEmpty(host) ? "" : o2.l(host, ":"), strSubstring), "raw", this.f65767f);
            if (identifier == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        a(mVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f65766e.openRawResourceFd(identifier);
            this.f65769h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a(p0.o2.p("Resource is compressed: ", uri), null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f65770i = fileInputStream;
            if (length != -1) {
                try {
                    if (mVar.f65632g > length) {
                        throw new a(null, null, 2008);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(mVar.f65632g + startOffset) - startOffset;
            if (jSkip != mVar.f65632g) {
                throw new a(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f65771j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f65771j = size;
                    if (size < 0) {
                        throw new a(null, null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f65771j = j10;
                if (j10 < 0) {
                    throw new j(2008);
                }
            }
            long jMin = mVar.f65633h;
            if (jMin != -1) {
                long j11 = this.f65771j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f65771j = jMin;
            }
            this.f65772k = true;
            b(mVar);
            long j12 = mVar.f65633h;
            return j12 != -1 ? j12 : this.f65771j;
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f65771j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) g0.castNonNull(this.f65770i)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f65771j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f65771j;
        if (j11 != -1) {
            this.f65771j = j11 - i12;
        }
        a(i12);
        return i12;
    }
}
