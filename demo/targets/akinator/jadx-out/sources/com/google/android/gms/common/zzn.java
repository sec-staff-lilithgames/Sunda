package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import i2.hQ.aTNDubNmpwAqdU;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzn {
    private static volatile zzag zze;
    private static Context zzg;
    static final zzl zza = new zzf(zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzl zzb = new zzg(zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzl zzc = new zzh(zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzl zzd = new zzi(zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzf = new Object();

    public static zzw zza(String str, zzj zzjVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static zzw zzb(String str, boolean z10, boolean z11, boolean z12) {
        return zzi(str, z10, false, false, true);
    }

    public static zzw zzc(String str, boolean z10, boolean z11, boolean z12) {
        return zzi(str, z10, false, false, false);
    }

    public static /* synthetic */ String zzd(boolean z10, String str, zzj zzjVar) throws Exception {
        String str2 = (z10 || !zzh(str, zzjVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigestZza);
        return str2 + ": pkg=" + str + ", sha256=" + Hex.bytesToStringLowercase(messageDigestZza.digest(zzjVar.zzf())) + ", atk=" + z10 + ", ver=12451000.false";
    }

    public static synchronized void zze(Context context) {
        if (zzg != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            zzg = context.getApplicationContext();
        }
    }

    public static boolean zzf() {
        boolean zZzg;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzj();
                zZzg = zze.zzg();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            zZzg = false;
        }
        return zZzg;
    }

    public static boolean zzg() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzj();
                zZzi = zze.zzi();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            zZzi = false;
        }
        return zZzi;
    }

    private static zzw zzh(final String str, final zzj zzjVar, final boolean z10, boolean z11) {
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            try {
                return zze.zzh(new zzs(str, zzjVar, z10, z11), ObjectWrapper.wrap(zzg.getPackageManager())) ? zzw.zzb() : new zzu(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzn.zzd(z10, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return zzw.zzd("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return zzw.zzd("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    private static void zzj() throws DynamiteModule.LoadingException {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            try {
                if (zze == null) {
                    zze = zzaf.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    private static zzw zzi(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        zzw zzwVarZzd;
        String str2 = aTNDubNmpwAqdU.SPspIpvepnXTLw;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzoVar = new zzo(str, z10, false, ObjectWrapper.wrap(zzg), false, true);
                try {
                    zzq zzqVarZze = z13 ? zze.zze(zzoVar) : zze.zzf(zzoVar);
                    if (zzqVarZze.zzb()) {
                        zzwVarZzd = zzw.zzf(zzqVarZze.zzc());
                    } else {
                        String strZza = zzqVarZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        zzwVarZzd = zzw.zzg(zzqVarZze.zzc(), zzqVarZze.zzd(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", str2, e10);
                    zzwVarZzd = zzw.zzd("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", str2, e11);
                zzwVarZzd = zzw.zzd("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zzwVarZzd;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
