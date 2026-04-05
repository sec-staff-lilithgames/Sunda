package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgx extends zzft {
    private final Context zza;
    private zzgf zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgx(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("rawresource:///");
        sb2.append(i10);
        return Uri.parse(sb2.toString());
    }

    private static AssetFileDescriptor zzk(Context context, zzgf zzgfVar) throws zzgw, Resources.NotFoundException, PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = zzgfVar.zza.normalizeScheme();
        if (TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                throw new zzgw(o2.l(size, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size).length() + 61)));
            }
            identifier = zzl(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                throw new zzgw(a.b.o(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new zzgw("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(a.b.o(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzgw("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzgw("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new zzgw(null, e11, 2005);
        }
    }

    private static int zzl(String str) throws zzgw {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgw("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzgw(null, e10, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzep.zza;
        int i12 = inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgw("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - i12;
        }
        zzh(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws zzgc, Resources.NotFoundException, PackageManager.NameNotFoundException {
        long size;
        this.zzb = zzgfVar;
        zzf(zzgfVar);
        AssetFileDescriptor assetFileDescriptorZzk = zzk(this.zza, zzgfVar);
        this.zzc = assetFileDescriptorZzk;
        long length = assetFileDescriptorZzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzgfVar.zze > length) {
                    throw new zzgw(null, null, 2008);
                }
            } catch (zzgw e10) {
                throw e10;
            } catch (IOException e11) {
                throw new zzgw(null, e11, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j10 = zzgfVar.zze;
        long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
        if (jSkip != j10) {
            throw new zzgw(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new zzgw(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.zze = size;
            if (size < 0) {
                throw new zzgc(2008);
            }
        }
        long j11 = zzgfVar.zzf;
        if (j11 != -1) {
            this.zze = size == -1 ? j11 : Math.min(size, j11);
        }
        this.zzf = true;
        zzg(zzgfVar);
        return j11 != -1 ? j11 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        zzgf zzgfVar = this.zzb;
        if (zzgfVar != null) {
            return zzgfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws zzgw {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e10) {
                        throw new zzgw(null, e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new zzgw(null, e11, 2000);
                }
            } catch (Throwable th2) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzi();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new zzgw(null, e12, 2000);
                }
            }
        } catch (Throwable th3) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzi();
            }
            throw th3;
        }
    }
}
