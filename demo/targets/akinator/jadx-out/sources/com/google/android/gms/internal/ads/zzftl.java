package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzftl {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzftm zzc;
    private final zzfrs zzd;
    private final zzfrn zze;
    private final boolean zzf;
    private zzfta zzg;
    private final Object zzh = new Object();

    public zzftl(Context context, zzftm zzftmVar, zzfrs zzfrsVar, zzfrn zzfrnVar, boolean z10) {
        this.zzb = context;
        this.zzc = zzftmVar;
        this.zzd = zzfrsVar;
        this.zze = zzfrnVar;
        this.zzf = z10;
    }

    private final synchronized Class zzd(zzftb zzftbVar) throws zzftk {
        try {
            if (zzftbVar.zza() == null) {
                throw new zzftk(4010, "mc");
            }
            String strZza = zzftbVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzftbVar.zzb())) {
                    throw new zzftk(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzftbVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzftbVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new zzftk(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new zzftk(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new zzftk(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new zzftk(2026, e13);
            }
        } finally {
        }
    }

    public final boolean zza(zzftb zzftbVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, zzftk, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfta zzftaVar = new zzfta(zzd(zzftbVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzftbVar.zzd(), null, new Bundle(), 2), zzftbVar, this.zzc, this.zzd, this.zzf);
                if (!zzftaVar.zzf()) {
                    throw new zzftk(4000, "init failed");
                }
                int iZzh = zzftaVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iZzh);
                    throw new zzftk(4001, sb2.toString());
                }
                synchronized (this.zzh) {
                    zzfta zzftaVar2 = this.zzg;
                    if (zzftaVar2 != null) {
                        try {
                            zzftaVar2.zzg();
                        } catch (zzftk e10) {
                            this.zzd.zzc(e10.zza(), -1L, e10);
                        }
                        this.zzg = zzftaVar;
                    } else {
                        this.zzg = zzftaVar;
                    }
                }
                this.zzd.zzb(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzftk(2004, e11);
            }
        } catch (zzftk e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    public final zzfrv zzb() {
        zzfta zzftaVar;
        synchronized (this.zzh) {
            zzftaVar = this.zzg;
        }
        return zzftaVar;
    }

    public final zzftb zzc() {
        synchronized (this.zzh) {
            try {
                zzfta zzftaVar = this.zzg;
                if (zzftaVar == null) {
                    return null;
                }
                return zzftaVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
