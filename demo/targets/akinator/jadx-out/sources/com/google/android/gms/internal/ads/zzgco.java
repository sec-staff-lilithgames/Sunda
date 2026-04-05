package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgco extends zzgdh {
    private final Map zza;
    private final Context zzb;
    private final zzfyq zzc;
    private final long zzd;
    private final long zze;

    public zzgco(zzauc zzaucVar, zzgcd zzgcdVar, Map map, Context context, zzfyq zzfyqVar, zzfxt zzfxtVar, zzgjd zzgjdVar) {
        super("zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1", "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4=", zzaucVar, zzgcdVar, zzgjdVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzfyqVar;
        this.zzd = zzfxtVar.zzj();
        this.zze = zzfxtVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        zzauz zzauzVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        int i10 = 1;
        try {
            n1 n1Var = (n1) this.zza.get("gs");
            if (n1Var != null && ((Build.VERSION.SDK_INT < 31 || n1Var.isDone()) && (zzauzVar = (zzauz) n1Var.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzauzVar.zzb().length() > 1)) {
                strZzb = zzauzVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                n1 n1Var2 = (n1) this.zza.get("ai");
                if (n1Var2 != null) {
                    String str = (String) n1Var2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgmu.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzaucVar) {
            try {
                zzaucVar.zzu(((Long) objArr[0]).longValue());
                zzaucVar.zzt((String) objArr[1]);
                zzaucVar.zzD((String) objArr[2]);
                zzaucVar.zzE((String) objArr[3]);
                zzgrz zzgrzVarZzi = zzgrz.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzaucVar.zzp(zzgrzVarZzi.zzj(bArr, 0, bArr.length));
                zzaucVar.zzo(strZzb);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i10 = 2;
                    }
                    zzaucVar.zzai(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
