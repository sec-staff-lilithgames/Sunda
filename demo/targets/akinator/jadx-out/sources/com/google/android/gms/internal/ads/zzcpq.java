package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcpq implements zzcyo, zzdac, zzczi, com.google.android.gms.ads.internal.client.zza, zzcze, zzdgm, zzdbj {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfgf zze;
    private final zzffu zzf;
    private final zzfnc zzg;
    private final zzfha zzh;
    private final zzaxa zzi;
    private final zzbgb zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcxp zzm;
    private final zzdbd zzn;
    private final zzcxi zzo;
    private boolean zzp;
    private final AtomicBoolean zzq = new AtomicBoolean();

    public zzcpq(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfgf zzfgfVar, zzffu zzffuVar, zzfnc zzfncVar, zzfha zzfhaVar, View view, zzcgy zzcgyVar, zzaxa zzaxaVar, zzbgb zzbgbVar, zzbgd zzbgdVar, zzflm zzflmVar, zzcxp zzcxpVar, zzdbd zzdbdVar, zzcxi zzcxiVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfgfVar;
        this.zzf = zzffuVar;
        this.zzg = zzfncVar;
        this.zzh = zzfhaVar;
        this.zzi = zzaxaVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcgyVar);
        this.zzj = zzbgbVar;
        this.zzm = zzcxpVar;
        this.zzn = zzdbdVar;
        this.zzo = zzcxiVar;
    }

    private final void zzx(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i10;
        zzffu zzffuVar = this.zzf;
        List list = zzffuVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeb)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaK)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbgt.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzffuVar, false, strZzj, null, zzp(), this.zzo), this.zzn);
            return;
        }
        if (((Boolean) zzbgt.zzg.zze()).booleanValue() && ((i10 = zzffuVar.zzb) == 1 || i10 == 2 || i10 == 5)) {
        }
        zzgui.zzr((zzgua) zzgui.zzi(zzgua.zzw(zzgui.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbn)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcpk(this, strZzj), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmt)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzF(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer numZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
                if (numZzw != null) {
                    int iMin = Math.min(numZzw.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaK)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbgt.zzd.zze()).booleanValue()) {
            zzgui.zzr((zzgua) zzgui.zzg(zzgua.zzw(this.zzj.zzb()), Throwable.class, zzcpp.zza, zzcbv.zzg), new zzcpj(this), this.zzb);
            return;
        }
        zzfha zzfhaVar = this.zzh;
        zzfnc zzfncVar = this.zzg;
        zzfgf zzfgfVar = this.zze;
        zzffu zzffuVar = this.zzf;
        zzfhaVar.zzb(zzfncVar.zza(zzfgfVar, zzffuVar, zzffuVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(zzbxv zzbxvVar, String str, String str2) {
        zzfnc zzfncVar = this.zzg;
        zzfha zzfhaVar = this.zzh;
        zzffu zzffuVar = this.zzf;
        zzfhaVar.zza(zzfncVar.zzc(zzffuVar, zzffuVar.zzh, zzbxvVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        if (this.zzq.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzek)).intValue();
            if (iIntValue > 0) {
                zzx(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzel)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzej)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() {
        zzfnc zzfncVar = this.zzg;
        zzfgf zzfgfVar = this.zze;
        zzfha zzfhaVar = this.zzh;
        zzffu zzffuVar = this.zzf;
        zzfhaVar.zza(zzfncVar.zza(zzfgfVar, zzffuVar, zzffuVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() {
        zzfnc zzfncVar = this.zzg;
        zzfgf zzfgfVar = this.zze;
        zzfha zzfhaVar = this.zzh;
        zzffu zzffuVar = this.zzf;
        zzfhaVar.zza(zzfncVar.zza(zzfgfVar, zzffuVar, zzffuVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final synchronized void zzg() {
        zzcxp zzcxpVar;
        try {
            if (this.zzp) {
                ArrayList arrayList = new ArrayList(zzp());
                zzffu zzffuVar = this.zzf;
                arrayList.addAll(zzffuVar.zzf);
                this.zzh.zza(this.zzg.zzb(this.zze, zzffuVar, true, null, null, arrayList, null), null);
            } else {
                zzfha zzfhaVar = this.zzh;
                zzfnc zzfncVar = this.zzg;
                zzfgf zzfgfVar = this.zze;
                zzffu zzffuVar2 = this.zzf;
                zzfhaVar.zza(zzfncVar.zza(zzfgfVar, zzffuVar2, zzffuVar2.zzm), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeg)).booleanValue() && (zzcxpVar = this.zzm) != null) {
                    List list = zzcxpVar.zzb().zzm;
                    String strZzg = zzcxpVar.zzc().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfnc.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZzh = zzcxpVar.zzc().zzh();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfnc.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                    }
                    zzfhaVar.zza(zzfncVar.zza(zzcxpVar.zza(), zzcxpVar.zzb(), arrayList3), null);
                }
                zzfhaVar.zza(zzfncVar.zza(zzfgfVar, zzffuVar2, zzffuVar2.zzf), null);
            }
            this.zzp = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zzi() {
        zzfnc zzfncVar = this.zzg;
        zzfgf zzfgfVar = this.zze;
        zzfha zzfhaVar = this.zzh;
        zzffu zzffuVar = this.zzf;
        zzfhaVar.zza(zzfncVar.zza(zzfgfVar, zzffuVar, zzffuVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbM)).booleanValue()) {
            int i10 = zzeVar.zza;
            zzffu zzffuVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzffuVar.zzo) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2);
                sb2.append("2.");
                sb2.append(i10);
                arrayList.add(zzfnc.zzd(str, "@gw_mpe@", sb2.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzffuVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk() {
        zzffu zzffuVar = this.zzf;
        if (zzffuVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzffuVar, zzffuVar.zzaA), null);
        }
    }

    public final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    public final /* synthetic */ void zzm(final int i10, final int i11) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i10, i11);
            }
        });
    }

    public final /* synthetic */ void zzn(int i10, int i11) {
        zzx(i10 - 1, i11);
    }

    public final /* synthetic */ Context zzq() {
        return this.zza;
    }

    public final /* synthetic */ zzfgf zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzffu zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzfnc zzt() {
        return this.zzg;
    }

    public final /* synthetic */ zzfha zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzdbd zzv() {
        return this.zzn;
    }

    public final /* synthetic */ zzcxi zzw() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() {
    }
}
