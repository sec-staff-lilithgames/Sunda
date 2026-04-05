package ln;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import io.bidmachine.media3.common.util.a1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final Context f73433e;

    /* renamed from: f, reason: collision with root package name */
    public m f73434f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f73435g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f73436h;

    /* renamed from: i, reason: collision with root package name */
    public long f73437i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f73438j;

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

    public d0(Context context) {
        super(false);
        this.f73433e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // ln.b, ln.i
    public void close() throws a {
        this.f73434f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f73436h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f73436h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f73435g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f73435g = null;
                    if (this.f73438j) {
                        this.f73438j = false;
                        b();
                    }
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f73436h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f73435g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f73435g = null;
                    if (this.f73438j) {
                        this.f73438j = false;
                        b();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f73435g = null;
                if (this.f73438j) {
                    this.f73438j = false;
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
        m mVar = this.f73434f;
        if (mVar != null) {
            return mVar.f73467a;
        }
        return null;
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, j {
        Resources resourcesForApplication;
        int identifier;
        int i10;
        Resources resources;
        this.f73434f = mVar;
        c(mVar);
        Uri uri = mVar.f73467a;
        long j10 = mVar.f73473g;
        long j11 = mVar.f73472f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme());
        Context context = this.f73433e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) io.bidmachine.media3.common.util.a.checkNotNull(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(strSubstring);
                } catch (NumberFormatException unused2) {
                    throw new a("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(w0.i.d(packageName, ":", strSubstring), "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
            i10 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i10);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a(o2.p("Resource is compressed: ", uriNormalizeScheme), null, 2000);
            }
            this.f73435g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f73435g.getFileDescriptor());
            this.f73436h = fileInputStream;
            try {
                if (length != -1 && j11 > length) {
                    throw new a(null, null, 2008);
                }
                long startOffset = this.f73435g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new a(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f73437i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f73437i = size;
                        if (size < 0) {
                            throw new a(null, null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f73437i = j12;
                    if (j12 < 0) {
                        throw new j(2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f73437i;
                    this.f73437i = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f73438j = true;
                d(mVar);
                return j10 != -1 ? j10 : this.f73437i;
            } catch (a e11) {
                throw e11;
            } catch (IOException e12) {
                throw new a(null, e12, 2000);
            }
        } catch (Resources.NotFoundException e13) {
            throw new a(null, e13, 2005);
        }
    }

    @Override // ln.b, ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f73437i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new a(null, e10, 2000);
                }
            }
            int i12 = ((InputStream) a1.castNonNull(this.f73436h)).read(bArr, i10, i11);
            if (i12 != -1) {
                long j11 = this.f73437i;
                if (j11 != -1) {
                    this.f73437i = j11 - i12;
                }
                a(i12);
                return i12;
            }
            if (this.f73437i != -1) {
                throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
