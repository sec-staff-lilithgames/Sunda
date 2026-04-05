package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p0.o2;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgth extends zzgtz implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    n1 zza;
    Object zzb;

    public zzgth(n1 n1Var, Object obj) {
        n1Var.getClass();
        this.zza = n1Var;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (n1Var == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (n1Var.isCancelled()) {
            zzk(n1Var);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgui.zzs(n1Var));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th2) {
                try {
                    zzgva.zza(th2);
                    zzb(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzb(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzb(e11.getCause());
        } catch (Exception e12) {
            zzb(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final String zzd() {
        String strO;
        n1 n1Var = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (n1Var != null) {
            String string = n1Var.toString();
            strO = a.b.o(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strO = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return strO.concat(strZzd);
            }
            return null;
        }
        int length = strO.length();
        String string2 = obj.toString();
        return o2.r(new StringBuilder(string2.length() + length + 10 + 1), strO, "function=[", string2, C3191e4.i.f36531e);
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
