package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import j1.o2;
import java.util.concurrent.ExecutionException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgta extends zzgtz implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    n1 zza;
    Class zzb;
    Object zzc;

    public zzgta(n1 n1Var, Class cls, Object obj) {
        n1Var.getClass();
        this.zza = n1Var;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((n1Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = n1Var instanceof zzgvk ? ((zzgvk) n1Var).zzl() : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(n1Var.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                com.google.android.gms.internal.play_billing.a.B(sb2, "Future type ", strValueOf, " threw ", strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objZzs = th == null ? zzgui.zzs(n1Var) : null;
        if (th == null) {
            zza(objZzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(n1Var);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th3) {
            try {
                zzgva.zza(th3);
                zzb(th3);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final String zzd() {
        String strO;
        n1 n1Var = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZzd = super.zzd();
        if (n1Var != null) {
            String string = n1Var.toString();
            strO = a.b.o(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strO = "";
        }
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return strO.concat(strZzd);
            }
            return null;
        }
        int length = strO.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, strO, "exceptionType=[", string2, "], fallback=[");
        return o2.o(sb2, string3, C3191e4.i.f36531e);
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th2) throws Exception;
}
