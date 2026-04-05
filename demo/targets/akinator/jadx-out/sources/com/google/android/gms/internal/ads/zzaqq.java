package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaqq implements zzape {
    private final zzaqp zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqq(zzaqp zzaqpVar, int i10) {
        this.zzc = zzaqpVar;
    }

    public static byte[] zzg(zzaqo zzaqoVar, long j10) throws IOException {
        long jZza = zzaqoVar.zza();
        if (j10 >= 0 && j10 <= jZza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzaqoVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(jZza).length());
        e2.A(sb2, "streamToBytes length=", j10, ", maxLength=");
        sb2.append(jZza);
        throw new IOException(sb2.toString());
    }

    public static void zzh(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzaqo zzaqoVar) throws IOException {
        return new String(zzg(zzaqoVar, zzk(zzaqoVar)), C.UTF8_NAME);
    }

    private final void zzn(String str, zzaqn zzaqnVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzaqnVar.zza - ((zzaqn) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaqnVar.zza;
        }
        map.put(str, zzaqnVar);
    }

    private final void zzo(String str) {
        zzaqn zzaqnVar = (zzaqn) this.zza.remove(str);
        if (zzaqnVar != null) {
            this.zzb -= zzaqnVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized zzapd zza(String str) {
        zzaqn zzaqnVar = (zzaqn) this.zza.get(str);
        if (zzaqnVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzaqo zzaqoVar = new zzaqo(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzaqn.zza(zzaqoVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzaqg.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] bArrZzg = zzg(zzaqoVar, zzaqoVar.zza());
                zzapd zzapdVar = new zzapd();
                zzapdVar.zza = bArrZzg;
                zzapdVar.zzb = zzaqnVar.zzc;
                zzapdVar.zzc = zzaqnVar.zzd;
                zzapdVar.zzd = zzaqnVar.zze;
                zzapdVar.zze = zzaqnVar.zzf;
                zzapdVar.zzf = zzaqnVar.zzg;
                List<zzapm> list = zzaqnVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzapm zzapmVar : list) {
                    treeMap.put(zzapmVar.zza(), zzapmVar.zzb());
                }
                zzapdVar.zzg = treeMap;
                zzapdVar.zzh = Collections.unmodifiableList(list);
                return zzapdVar;
            } finally {
                zzaqoVar.close();
            }
        } catch (IOException e10) {
            zzaqg.zzb("%s: %s", fileZzf.getAbsolutePath(), e10.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void zzb(String str, zzapd zzapdVar) {
        float f10;
        try {
            long j10 = this.zzb;
            int length = zzapdVar.zza.length;
            long j11 = j10 + length;
            int i10 = this.zzd;
            float f11 = 0.9f;
            if (j11 <= i10 || length <= i10 * 0.9f) {
                File fileZzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzaqn zzaqnVar = new zzaqn(str, zzapdVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqnVar.zzb);
                        String str2 = zzaqnVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzaqnVar.zzd);
                        zzj(bufferedOutputStream, zzaqnVar.zze);
                        zzj(bufferedOutputStream, zzaqnVar.zzf);
                        zzj(bufferedOutputStream, zzaqnVar.zzg);
                        List<zzapm> list = zzaqnVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzapm zzapmVar : list) {
                                zzl(bufferedOutputStream, zzapmVar.zza());
                                zzl(bufferedOutputStream, zzapmVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzapdVar.zza);
                        bufferedOutputStream.close();
                        zzaqnVar.zza = fileZzf.length();
                        zzn(str, zzaqnVar);
                        long j12 = this.zzb;
                        int i11 = this.zzd;
                        if (j12 >= i11) {
                            boolean z10 = zzaqg.zzb;
                            if (z10) {
                                zzaqg.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i12 = 0;
                            while (it.hasNext()) {
                                zzaqn zzaqnVar2 = (zzaqn) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaqnVar2.zzb;
                                if (zzf(str3).delete()) {
                                    f10 = f11;
                                    this.zzb -= zzaqnVar2.zza;
                                } else {
                                    f10 = f11;
                                    zzaqg.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i12++;
                                if (this.zzb < i11 * f10) {
                                    break;
                                } else {
                                    f11 = f10;
                                }
                            }
                            if (z10) {
                                zzaqg.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i12), Long.valueOf(this.zzb - j13), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e10) {
                        zzaqg.zzb("%s", e10.toString());
                        bufferedOutputStream.close();
                        zzaqg.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzf.delete()) {
                        zzaqg.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaqg.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzaqo zzaqoVar = new zzaqo(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaqn zzaqnVarZza = zzaqn.zza(zzaqoVar);
                            zzaqnVarZza.zza = length;
                            zzn(zzaqnVarZza.zzb, zzaqnVarZza);
                            zzaqoVar.close();
                        } catch (Throwable th2) {
                            zzaqoVar.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzaqg.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void zzd(String str, boolean z10) {
        zzapd zzapdVarZza = zza(str);
        if (zzapdVarZza != null) {
            zzapdVarZza.zzf = 0L;
            zzapdVarZza.zze = 0L;
            zzb(str, zzapdVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzaqg.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzaqq(File file, int i10) {
        this.zzc = new zzaqm(this, file);
    }
}
