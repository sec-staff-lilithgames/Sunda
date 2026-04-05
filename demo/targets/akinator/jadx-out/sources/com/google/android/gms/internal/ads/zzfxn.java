package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfxn {
    private final zzfzl zza;
    private final zzgam zzb;
    private final zzghy zzc;
    private final zzgjd zzd;
    private final long zze;
    private final zzifb zzf;
    private final long zzg;
    private final long zzh = System.currentTimeMillis();
    private final boolean zzi;
    private final long zzj;

    public zzfxn(zzfzl zzfzlVar, zzgam zzgamVar, zzghy zzghyVar, zzgjd zzgjdVar, zzifb zzifbVar, zzfxt zzfxtVar) {
        this.zza = zzfzlVar;
        this.zzb = zzgamVar;
        this.zzc = zzghyVar;
        this.zzd = zzgjdVar;
        this.zze = zzfxtVar.zzh();
        this.zzf = zzifbVar;
        this.zzg = zzfxtVar.zzg();
        this.zzi = zzfxtVar.zzq();
        this.zzj = zzfxtVar.zzp();
    }

    public final n1 zza() {
        return this.zza.zza();
    }

    public final String zzb(Context context) {
        String string;
        boolean z10 = false;
        if (this.zzi) {
            if (System.currentTimeMillis() - this.zzh <= this.zzj) {
                z10 = true;
            }
        }
        zzgjb zzgjbVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    try {
                        zzgjbVarZza.zza();
                        string = (String) zzgui.zzj(this.zza.zzb(), new zzfxk(this, context), zzguz.zza()).get(z10 ? this.zzg : this.zze, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e10) {
                        zzgjbVarZza.zzb(e10);
                        string = z10 ? ((zzgdo) this.zzf.zzb()).zza(true, this.zzh) : Integer.toString(17);
                    }
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    zzgjbVarZza.zzb(e11);
                    string = "";
                }
            } catch (ExecutionException e12) {
                e = e12;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgjbVarZza.zzb(e);
                string = Integer.toString(3);
            } catch (Throwable th2) {
                zzgjbVarZza.zzb(th2);
                throw th2;
            }
            zzgjbVarZza.zzc();
            return string;
        } catch (Throwable th3) {
            zzgjbVarZza.zzc();
            throw th3;
        }
    }

    public final String zzc(Context context, String str, View view, Activity activity) {
        String string;
        zzgjb zzgjbVarZza = this.zzd.zza(4);
        try {
            try {
                zzgjbVarZza.zza();
                try {
                    string = (String) zzgui.zzj(this.zza.zzb(), new zzfxl(this, context, null, view, activity), zzguz.zza()).get(this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgjbVarZza.zzb(interruptedException);
                    string = "";
                    zzgjbVarZza.zzc();
                    return string;
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable th2 = e;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    zzgjbVarZza.zzb(th2);
                    string = Integer.toString(3);
                    zzgjbVarZza.zzc();
                    return string;
                } catch (TimeoutException e12) {
                    e = e12;
                    zzgjbVarZza.zzb(e);
                    string = Integer.toString(17);
                    zzgjbVarZza.zzc();
                    return string;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zzgjbVarZza.zzb(th4);
                    throw th4;
                }
            } catch (Throwable th5) {
                zzgjbVarZza.zzc();
                throw th5;
            }
        } catch (InterruptedException e13) {
            e = e13;
        } catch (ExecutionException e14) {
            e = e14;
        } catch (TimeoutException e15) {
            e = e15;
        } catch (Throwable th6) {
            th = th6;
        }
        zzgjbVarZza.zzc();
        return string;
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        String string;
        zzgjb zzgjbVarZza = this.zzd.zza(5);
        try {
            try {
                zzgjbVarZza.zza();
                try {
                    string = (String) zzgui.zzj(this.zza.zzb(), new zzfxm(this, context, str, view, null), zzguz.zza()).get(this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgjbVarZza.zzb(interruptedException);
                    string = "";
                    zzgjbVarZza.zzc();
                    return string;
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable th2 = e;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    zzgjbVarZza.zzb(th2);
                    string = Integer.toString(3);
                    zzgjbVarZza.zzc();
                    return string;
                } catch (TimeoutException e12) {
                    e = e12;
                    zzgjbVarZza.zzb(e);
                    string = Integer.toString(17);
                    zzgjbVarZza.zzc();
                    return string;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zzgjbVarZza.zzb(th4);
                    throw th4;
                }
            } catch (Throwable th5) {
                zzgjbVarZza.zzc();
                throw th5;
            }
        } catch (InterruptedException e13) {
            e = e13;
        } catch (ExecutionException e14) {
            e = e14;
        } catch (TimeoutException e15) {
            e = e15;
        } catch (Throwable th6) {
            th = th6;
        }
        zzgjbVarZza.zzc();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ zzgam zzg() {
        return this.zzb;
    }

    public final int zzh() {
        return this.zzb.zzh();
    }
}
