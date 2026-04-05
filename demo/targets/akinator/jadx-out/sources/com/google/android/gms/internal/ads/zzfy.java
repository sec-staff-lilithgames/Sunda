package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfy extends zzft {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfy(Context context) {
        super(false);
        this.zza = context.getContentResolver();
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
                throw new zzfx(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        String str = zzep.zza;
        int i12 = fileInputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - i12;
        }
        zzh(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = zzgfVar.zza.normalizeScheme();
                this.zzb = uriNormalizeScheme;
                zzf(zzgfVar);
                if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.zzc = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    String strValueOf = String.valueOf(uriNormalizeScheme);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                    sb2.append("Could not open file descriptor for: ");
                    sb2.append(strValueOf);
                    IOException iOException = new IOException(sb2.toString());
                    i10 = 2000;
                    try {
                        throw new zzfx(iOException, 2000);
                    } catch (IOException e10) {
                        e = e10;
                        throw new zzfx(e, true != (e instanceof FileNotFoundException) ? i10 : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgfVar.zze > length) {
                    throw new zzfx(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long j10 = zzgfVar.zze;
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new zzfx(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.zze = jPosition;
                        if (jPosition < 0) {
                            throw new zzfx(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.zze = jPosition;
                    if (jPosition < 0) {
                        throw new zzfx(null, 2008);
                    }
                }
                long j11 = zzgfVar.zzf;
                if (j11 != -1) {
                    this.zze = jPosition == -1 ? j11 : Math.min(jPosition, j11);
                }
                this.zzf = true;
                zzg(zzgfVar);
                return j11 != -1 ? j11 : this.zze;
            } catch (zzfx e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws zzfx {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
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
                        throw new zzfx(e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new zzfx(e11, 2000);
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
                    throw new zzfx(e12, 2000);
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
