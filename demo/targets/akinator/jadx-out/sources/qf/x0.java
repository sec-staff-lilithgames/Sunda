package qf;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import j1.o2;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 extends h {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f83051e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83052f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f83053g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f83054h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f83055i;

    /* renamed from: j, reason: collision with root package name */
    public long f83056j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f83057k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends q {
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

    public x0(Context context) {
        super(false);
        this.f83051e = context.getResources();
        this.f83052f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // qf.h, qf.p
    public void close() throws a {
        this.f83053g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f83055i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f83055i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f83054h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f83054h = null;
                    if (this.f83057k) {
                        this.f83057k = false;
                        b();
                    }
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f83055i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f83054h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f83054h = null;
                    if (this.f83057k) {
                        this.f83057k = false;
                        b();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f83054h = null;
                if (this.f83057k) {
                    this.f83057k = false;
                    b();
                }
            }
        }
    }

    @Override // qf.h, qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.h, qf.p
    public Uri getUri() {
        return this.f83053g;
    }

    @Override // qf.h, qf.p
    public long open(t tVar) throws Resources.NotFoundException, NumberFormatException, q {
        int identifier;
        Uri uri = tVar.f82992a;
        long j10 = tVar.f82998g;
        long j11 = tVar.f82997f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        this.f83053g = uriNormalizeScheme;
        boolean zEquals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme());
        Resources resources = this.f83051e;
        if (zEquals || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) com.google.android.exoplayer2.util.a.checkNotNull(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) com.google.android.exoplayer2.util.a.checkNotNull(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String strSubstring = (String) com.google.android.exoplayer2.util.a.checkNotNull(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            identifier = resources.getIdentifier(o2.o(new StringBuilder(), TextUtils.isEmpty(host) ? "" : o2.l(host, ":"), strSubstring), "raw", this.f83052f);
            if (identifier == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        c(tVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.f83054h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a(p0.o2.p("Resource is compressed: ", uriNormalizeScheme), null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f83055i = fileInputStream;
            try {
                if (length != -1 && j11 > length) {
                    throw new a(null, null, 2008);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new a(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f83056j = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f83056j = size;
                        if (size < 0) {
                            throw new a(null, null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f83056j = j12;
                    if (j12 < 0) {
                        throw new q(2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f83056j;
                    this.f83056j = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f83057k = true;
                d(tVar);
                return j10 != -1 ? j10 : this.f83056j;
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override // qf.h, qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f83056j;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new a(null, e10, 2000);
                }
            }
            int i12 = ((InputStream) n1.castNonNull(this.f83055i)).read(bArr, i10, i11);
            if (i12 != -1) {
                long j11 = this.f83056j;
                if (j11 != -1) {
                    this.f83056j = j11 - i12;
                }
                a(i12);
                return i12;
            }
            if (this.f83056j != -1) {
                throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
