package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfsp {
    public static boolean zza(zzbaa zzbaaVar) {
        int iOrdinal = zzbaaVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbaa zzb(Context context, zzfrs zzfrsVar) {
        zzbaa zzbaaVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgsh(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfrsVar != null) {
                    zzfrsVar.zze(5017, "No .so");
                } else {
                    zzfrsVar = null;
                }
                zzbaaVar = zzbaa.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e10) {
                    zzc(null, e10.toString(), context, zzfrsVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfrsVar);
                        zzbaaVar = zzbaa.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s10 = ByteBuffer.wrap(bArr2).getShort();
                        if (s10 == 3) {
                            zzbaaVar = zzbaa.X86;
                        } else if (s10 == 40) {
                            zzbaaVar = zzbaa.ARM7;
                        } else if (s10 == 62) {
                            zzbaaVar = zzbaa.X86_64;
                        } else if (s10 == 183) {
                            zzbaaVar = zzbaa.ARM64;
                        } else if (s10 != 243) {
                            zzc(bArr, null, context, zzfrsVar);
                            zzbaaVar = zzbaa.UNSUPPORTED;
                        } else {
                            zzbaaVar = zzbaa.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbaaVar = zzbaa.UNSUPPORTED;
                }
            }
        } else {
            if (zzfrsVar != null) {
                zzfrsVar.zze(5017, "No lib/");
            } else {
                zzfrsVar = null;
            }
            zzbaaVar = zzbaa.UNKNOWN;
        }
        if (zzbaaVar == zzbaa.UNKNOWN) {
            String strZzd = zzd(context, zzfrsVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfrsVar);
                zzbaaVar = zzbaa.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzbaaVar = zzbaa.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzbaaVar = zzbaa.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbaaVar = zzbaa.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbaaVar = zzbaa.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbaaVar = zzbaa.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfrsVar);
                zzbaaVar = zzbaa.UNSUPPORTED;
            }
        }
        if (zzfrsVar != null) {
            zzfrsVar.zze(5018, zzbaaVar.name());
        }
        return zzbaaVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfrs zzfrsVar) {
        if (zzfrsVar == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(zzgmt.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            i.h(sb2, "dbg:", str, ";");
        }
        zzfrsVar.zze(4007, sb2.toString());
    }

    private static final String zzd(Context context, zzfrs zzfrsVar) {
        HashSet hashSet = new HashSet(Arrays.asList(KGUkpTlXZlJLy.GvyB, "armv71"));
        String strZza = zzgmt.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            if (zzfrsVar != null) {
                zzfrsVar.zzc(2024, 0L, e10);
            }
        } catch (NoSuchFieldException e11) {
            if (zzfrsVar != null) {
                zzfrsVar.zzc(2024, 0L, e11);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
