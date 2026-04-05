package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import b3.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgo extends zzft {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgo() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzep.zza;
            int i12 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.zzc -= i12;
                zzh(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new zzgn(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException {
        Uri uri = zzgfVar.zza;
        this.zzb = uri;
        zzf(zzgfVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j10 = zzgfVar.zze;
                randomAccessFile.seek(j10);
                long length = zzgfVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j10;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgn(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzgfVar);
                return this.zzc;
            } catch (IOException e10) {
                throw new zzgn(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgn(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbB = h.b("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbB.append(fragment);
            throw new zzgn(sbB.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new zzgn(e12, 2006);
        } catch (RuntimeException e13) {
            throw new zzgn(e13, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws zzgn {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e10) {
                throw new zzgn(e10, 2000);
            }
        } catch (Throwable th2) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th2;
        }
    }
}
