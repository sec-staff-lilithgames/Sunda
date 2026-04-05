package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import be.nVUQ.UupKET;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaws implements zzawv {
    private static zzaws zzb;
    private final Context zzc;
    private final zzftc zzd;
    private final zzftj zze;
    private final zzftl zzf;
    private final zzaxx zzg;
    private final zzfrs zzh;
    private final Executor zzi;
    private final zzbaa zzj;
    private final zzfti zzk;
    private final zzaym zzm;
    private final zzaye zzn;
    private final zzaxv zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    public zzaws(Context context, zzfrs zzfrsVar, zzftc zzftcVar, zzftj zzftjVar, zzftl zzftlVar, zzaxx zzaxxVar, Executor executor, zzfrn zzfrnVar, zzbaa zzbaaVar, zzaym zzaymVar, zzaye zzayeVar, zzaxv zzaxvVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfrsVar;
        this.zzd = zzftcVar;
        this.zze = zzftjVar;
        this.zzf = zzftlVar;
        this.zzg = zzaxxVar;
        this.zzi = executor;
        this.zzj = zzbaaVar;
        this.zzm = zzaymVar;
        this.zzn = zzayeVar;
        this.zzo = zzaxvVar;
        this.zzr = false;
        this.zzk = new zzawq(this, zzfrnVar);
    }

    public static synchronized zzaws zza(Context context, zzate zzateVar, boolean z10) {
        zzfrt zzfrtVarZzh;
        zzfrtVarZzh = zzfru.zzh();
        zzfrtVarZzh.zza(zzateVar.zza());
        zzfrtVarZzh.zzb(zzateVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfrtVarZzh.zzh(), z10);
    }

    private static synchronized zzaws zzs(Context context, Executor executor, zzfru zzfruVar, boolean z10) {
        try {
            if (zzb == null) {
                zzfrs zzfrsVarZza = zzfrs.zza(context, executor, z10);
                zzaxg zzaxgVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdS)).booleanValue() ? zzaxg.zza(context) : null;
                zzaym zzaymVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdT)).booleanValue() ? zzaym.zza(context, executor) : null;
                zzaye zzayeVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdb)).booleanValue() ? new zzaye() : null;
                zzaxv zzaxvVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdk)).booleanValue() ? new zzaxv() : null;
                zzfsi zzfsiVarZza = zzfsi.zza(context, executor, zzfrsVarZza, zzfruVar);
                zzaxw zzaxwVar = new zzaxw(context);
                zzaxx zzaxxVar = new zzaxx(zzfruVar, zzfsiVarZza, new zzayk(context, zzaxwVar), zzaxwVar, zzaxgVarZza, zzaymVarZza, zzayeVar, zzaxvVar);
                zzbaa zzbaaVarZzb = zzfsp.zzb(context, zzfrsVarZza);
                zzfrn zzfrnVar = new zzfrn();
                zzaws zzawsVar = new zzaws(context, zzfrsVarZza, new zzftc(context, zzbaaVarZzb), new zzftj(context, zzbaaVarZzb, new zzawp(zzfrsVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcL)).booleanValue()), new zzftl(context, zzaxxVar, zzfrsVarZza, zzfrnVar, false), zzaxxVar, executor, zzfrnVar, zzbaaVarZzb, zzaymVarZza, zzayeVar, zzaxvVar);
                zzb = zzawsVar;
                zzawsVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb;
    }

    private final void zzt() {
        zzaym zzaymVar = this.zzm;
        if (zzaymVar != null) {
            zzaymVar.zzb();
        }
    }

    private final zzftb zzu(int i10) {
        if (zzfsp.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcJ)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    public final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzftb zzftbVarZzu = zzu(1);
        if (zzftbVarZzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzftbVarZzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzd(MotionEvent motionEvent) {
        zzfrv zzfrvVarZzb = this.zzf.zzb();
        if (zzfrvVarZzb != null) {
            try {
                zzfrvVarZzb.zzd(null, motionEvent);
            } catch (zzftk e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zze(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmX)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdb)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfrv zzfrvVarZzb = this.zzf.zzb();
        if (zzfrvVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfrvVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzaxv zzaxvVar = this.zzo;
        if (zzaxvVar != null) {
            zzaxvVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzj(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdb)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfrv zzfrvVarZzb = this.zzf.zzb();
        if (zzfrvVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfrvVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdb)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfrv zzfrvVarZzb = this.zzf.zzb();
        if (zzfrvVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfrvVarZzb.zza(context, null);
        this.zzh.zzd(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzftb zzftbVarZzc = this.zzf.zzc();
                    if ((zzftbVarZzc == null || zzftbVarZzc.zze(3600L)) && zzfsp.zza(this.zzj)) {
                        this.zzi.execute(new zzawr(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ zzfrs zzo() {
        return this.zzh;
    }

    public final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    public final /* synthetic */ void zzr(boolean z10) {
        this.zzq = z10;
    }

    public final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzftb zzftbVarZzu;
        zzbai zzbaiVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzftb zzftbVarZzu2 = zzu(1);
        if (zzftbVarZzu2 != null) {
            String strZza = zzftbVarZzu2.zza().zza();
            strZzb = zzftbVarZzu2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbaa zzbaaVar = this.zzj;
                String str2 = UupKET.HsOXwjPDGVsx;
                zzfrs zzfrsVar = this.zzh;
                zzftg zzftgVarZza = zzfsb.zza(context, 1, zzbaaVar, str, strZzb, str2, zzfrsVar);
                byte[] bArr = zzftgVarZza.zzb;
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        zzbac zzbacVarZzd = zzbac.zzd(zzhvi.zzr(bArr, 0, length), zzhvy.zza());
                        if (!zzbacVarZzd.zza().zza().isEmpty() && !zzbacVarZzd.zza().zzb().isEmpty() && zzbacVarZzd.zzc().zzv().length != 0 && ((zzftbVarZzu = zzu(1)) == null || (zzbaiVarZza = zzftbVarZzu.zza()) == null || !zzbacVarZzd.zza().zza().equals(zzbaiVarZza.zza()) || !zzbacVarZzd.zza().zzb().equals(zzbaiVarZza.zzb()))) {
                            zzfti zzftiVar = this.zzk;
                            int i10 = zzftgVarZza.zzc;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcJ)).booleanValue()) {
                                if (i10 == 3) {
                                    zZza = this.zze.zzb(zzbacVarZzd);
                                } else {
                                    if (i10 == 4) {
                                        zZza = this.zze.zza(zzbacVarZzd, zzftiVar);
                                    }
                                    this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            } else {
                                zZza = this.zzd.zza(zzbacVarZzd, zzftiVar);
                            }
                            if (!zZza) {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            } else {
                                zzftb zzftbVarZzu3 = zzu(1);
                                if (zzftbVarZzu3 != null) {
                                    if (this.zzf.zza(zzftbVarZzu3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            }
                        } else {
                            this.zzh.zzb(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                } else {
                    zzfrsVar.zzb(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - jCurrentTimeMillis);
                }
            } catch (Throwable th2) {
                this.zzl.countDown();
                throw th2;
            }
        } catch (zzhxd e10) {
            this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e10);
        }
        this.zzl.countDown();
    }
}
