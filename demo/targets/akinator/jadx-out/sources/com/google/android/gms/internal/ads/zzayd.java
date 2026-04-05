package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.moloco.sdk.BKC.JzVV;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzayd {
    private static final String zzc = "zzayd";
    protected final Context zza;
    private ExecutorService zzd;
    private DexClassLoader zze;
    private zzaxi zzf;
    private byte[] zzg;
    private final boolean zzj;
    private zzaxd zzm;
    private zzawu zzn;
    private final Map zzo;
    private zzaxw zzq;
    private volatile AdvertisingIdClient zzh = null;
    private volatile boolean zzi = false;
    private volatile zzauz zzk = null;
    private Future zzl = null;
    protected boolean zzb = false;
    private boolean zzp = false;

    private zzayd(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzj = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzo = new HashMap();
        if (this.zzq != null) {
            return;
        }
        this.zzq = new zzaxw(context);
    }

    private final void zzt(File file, String str) throws Throwable {
        Throwable th2;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1754603592408"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1754603592408"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        zzw(file3);
                        return;
                    }
                    System.out.print("test");
                    System.out.print("test");
                    System.out.print("test");
                    zzavc zzavcVarZzg = zzavd.zzg();
                    byte[] bytes = Build.VERSION.SDK.getBytes();
                    zzhvi zzhviVar = zzhvi.zzb;
                    zzavcVarZzg.zzd(zzhvi.zzr(bytes, 0, bytes.length));
                    byte[] bytes2 = "1754603592408".getBytes();
                    zzavcVarZzg.zzc(zzhvi.zzr(bytes2, 0, bytes2.length));
                    byte[] bytes3 = this.zzf.zza(this.zzg, bArr).getBytes();
                    zzavcVarZzg.zza(zzhvi.zzr(bytes3, 0, bytes3.length));
                    byte[] bArrZze = zzavz.zze(bytes3);
                    zzavcVarZzg.zzb(zzhvi.zzr(bArrZze, 0, bArrZze.length));
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArrZzaN = ((zzavd) zzavcVarZzg.zzbu()).zzaN();
                        fileOutputStream.write(bArrZzaN, 0, bArrZzaN.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        zzw(file3);
                    } catch (zzaxh | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        zzw(file3);
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        zzw(file3);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    fileOutputStream = null;
                }
            } catch (zzaxh | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            }
        } catch (zzaxh | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th5) {
            th2 = th5;
            fileOutputStream = null;
        }
    }

    private final boolean zzu(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1754603592408"));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1754603592408"));
        if (!file3.exists()) {
            FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    zzw(file2);
                    return false;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            Log.d(zzc, "Cannot read the cache data.");
                            zzw(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            return false;
                        }
                        try {
                            try {
                                zzavd zzavdVarZze = zzavd.zze(bArr, zzhvy.zza());
                                if ("1754603592408".equals(new String(zzavdVarZze.zzc().zzv())) && Arrays.equals(zzavdVarZze.zzb().zzv(), zzavz.zze(zzavdVarZze.zza().zzv())) && Arrays.equals(zzavdVarZze.zzd().zzv(), Build.VERSION.SDK.getBytes())) {
                                    byte[] bArrZzb = this.zzf.zzb(this.zzg, new String(zzavdVarZze.zza().zzv()));
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(bArrZzb, 0, bArrZzb.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return true;
                                        } catch (IOException unused3) {
                                            return true;
                                        }
                                    } catch (zzaxh | IOException | NoSuchAlgorithmException unused4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused6) {
                                            }
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused7) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (IOException unused8) {
                                            throw th;
                                        }
                                    }
                                }
                                zzw(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused9) {
                                }
                                return false;
                            } catch (NullPointerException unused10) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (IOException unused11) {
                            return false;
                        }
                    } catch (zzaxh | IOException | NoSuchAlgorithmException unused12) {
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (zzaxh | IOException | NoSuchAlgorithmException unused13) {
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzr() {
        try {
            if (this.zzh == null && this.zzj) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzh = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzh = null;
        }
    }

    private static final void zzw(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(zzc, "File " + file.getAbsolutePath() + " not found. No need for deletion");
    }

    private static final void zzx(String str) {
        zzw(new File(str));
    }

    public final Context zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzp;
    }

    public final ExecutorService zzd() {
        return this.zzd;
    }

    public final DexClassLoader zze() {
        return this.zze;
    }

    public final zzaxi zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        return this.zzg;
    }

    public final zzawu zzh() {
        return this.zzn;
    }

    public final boolean zzi() {
        return this.zzb;
    }

    public final boolean zzj() {
        return this.zzq.zza();
    }

    public final zzaxw zzk() {
        return this.zzq;
    }

    public final zzauz zzl() {
        zzaxd zzaxdVar = this.zzm;
        if (zzaxdVar == null) {
            return this.zzk;
        }
        if (zzaxdVar.zza() == null || !zzaxdVar.zza().isDone()) {
            return zzauz.zzk();
        }
        try {
            return (zzauz) this.zzm.zza().get();
        } catch (InterruptedException | ExecutionException unused) {
            return zzauz.zzk();
        }
    }

    public final Future zzm() {
        zzaxd zzaxdVar = this.zzm;
        return zzaxdVar != null ? zzaxdVar.zza() : this.zzl;
    }

    public final boolean zzn(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        Map map = this.zzo;
        if (map.containsKey(pair)) {
            return false;
        }
        map.put(pair, new zzazq(this, str, str2, clsArr));
        return true;
    }

    public final Method zzo(String str, String str2) {
        zzazq zzazqVar = (zzazq) this.zzo.get(new Pair(str, str2));
        if (zzazqVar == null) {
            return null;
        }
        return zzazqVar.zza();
    }

    public final void zzp(int i10, boolean z10) {
        if (this.zzb) {
            Future<?> futureSubmit = this.zzd.submit(new zzayb(this, i10, true));
            if (i10 == 0) {
                this.zzl = futureSubmit;
            }
        }
    }

    public final int zzq() {
        if (this.zzn != null) {
            return zzawu.zzd();
        }
        return Integer.MIN_VALUE;
    }

    public final /* synthetic */ void zzs(zzauz zzauzVar) {
        this.zzk = zzauzVar;
    }

    public static zzayd zza(Context context, String str, String str2, boolean z10, zzaxd zzaxdVar) throws Throwable {
        zzaxi zzaxiVar;
        byte[] bArrZzb;
        zzayd zzaydVar = new zzayd(context);
        try {
            zzaydVar.zzd = Executors.newCachedThreadPool(new zzaxz());
            zzaydVar.zzi = z10;
            if (z10) {
                zzaydVar.zzd.submit(new zzaya(zzaydVar));
            }
            zzaydVar.zzd.execute(new zzayc(zzaydVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                Context context2 = zzaydVar.zza;
                googleApiAvailabilityLight.getApkVersion(context2);
                zzaydVar.zzb = googleApiAvailabilityLight.isGooglePlayServicesAvailable(context2) == 0;
            } catch (Throwable unused) {
            }
            if (zzaxdVar != null) {
                zzaydVar.zzm = zzaxdVar;
            } else {
                zzaydVar.zzp(0, true);
            }
            if (zzayg.zzd()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdP)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            zzaxiVar = new zzaxi(null);
            zzaydVar.zzf = zzaxiVar;
            try {
                try {
                    bArrZzb = zzavt.zzb(JzVV.BwOktkrCwt, false);
                } catch (IllegalArgumentException e10) {
                    throw new zzaxh(zzaxiVar, e10);
                }
            } catch (zzaxh e11) {
                throw new zzaxt(e11);
            }
        } catch (zzaxt unused2) {
        }
        if (bArrZzb.length != 32) {
            throw new zzaxh(zzaxiVar);
        }
        byte[] bArr = new byte[16];
        ByteBuffer.wrap(bArrZzb, 4, 16).get(bArr);
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ 68);
        }
        zzaydVar.zzg = bArr;
        try {
            try {
                Context context3 = zzaydVar.zza;
                File cacheDir = context3.getCacheDir();
                if (cacheDir == null && (cacheDir = context3.getDir("dex", 0)) == null) {
                    throw new zzaxt();
                }
                File file = new File(String.format("%s/%s.jar", cacheDir, "1754603592408"));
                if (!file.exists()) {
                    byte[] bArrZzb2 = zzaydVar.zzf.zzb(zzaydVar.zzg, "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");
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    if (Build.VERSION.SDK_INT >= 33) {
                        file.setReadOnly();
                    }
                    fileOutputStream.write(bArrZzb2, 0, bArrZzb2.length);
                    fileOutputStream.close();
                }
                zzaydVar.zzu(cacheDir, "1754603592408");
                try {
                    try {
                        zzaydVar.zze = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context3.getClassLoader());
                        zzaydVar.zzn = new zzawu(zzaydVar);
                        zzaydVar.zzp = true;
                        return zzaydVar;
                    } catch (SecurityException e12) {
                        throw new zzaxt(e12);
                    }
                } finally {
                    zzw(file);
                    zzaydVar.zzt(cacheDir, "1754603592408");
                    zzx(String.format("%s/%s.dex", cacheDir, "1754603592408"));
                }
            } catch (zzaxh e13) {
                throw new zzaxt(e13);
            } catch (FileNotFoundException e14) {
                throw new zzaxt(e14);
            }
        } catch (IOException e15) {
            throw new zzaxt(e15);
        } catch (NullPointerException e16) {
            throw new zzaxt(e16);
        }
    }
}
