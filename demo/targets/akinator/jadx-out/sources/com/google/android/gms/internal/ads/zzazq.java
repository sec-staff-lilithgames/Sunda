package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazq {
    private final zzayd zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzazq(zzayd zzaydVar, String str, String str2, Class... clsArr) {
        this.zza = zzaydVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzaydVar.zzd().submit(new zzazp(this));
    }

    private final String zzc(byte[] bArr, String str) throws zzaxh, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), C.UTF8_NAME);
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final /* synthetic */ void zzb() {
        try {
            zzayd zzaydVar = this.zza;
            Class<?> clsLoadClass = zzaydVar.zze().loadClass(zzc(zzaydVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzaydVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzaxh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            this.zzf.countDown();
            throw th2;
        }
        this.zzf.countDown();
    }
}
