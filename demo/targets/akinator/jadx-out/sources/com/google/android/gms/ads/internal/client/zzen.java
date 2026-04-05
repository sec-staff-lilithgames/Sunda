package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzen {
    final zzbc zza;
    private final zzbrf zzb;
    private final zzq zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbx zzj;
    private VideoOptions zzk;
    private String zzl;

    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;
    private final AtomicLong zzq;

    public zzen(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, zzq.zza, null, i10);
    }

    private static zzr zzF(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.zzj = zzG(i10);
        return zzrVar;
    }

    private static boolean zzG(int i10) {
        return i10 == 1;
    }

    public final void zzA(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzG(videoOptions == null ? null : new zzga(videoOptions));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final VideoOptions zzB() {
        return this.zzk;
    }

    public final boolean zzC(zzbx zzbxVar) {
        try {
            IObjectWrapper iObjectWrapperZzb = zzbxVar.zzb();
            if (iObjectWrapperZzb == null || ((View) ObjectWrapper.unwrap(iObjectWrapperZzb)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapperZzb));
            this.zzj = zzbxVar;
            return true;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final /* synthetic */ void zzD(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final /* synthetic */ VideoController zzE() {
        return this.zze;
    }

    public final void zza() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzc();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final AdListener zzb() {
        return this.zzg;
    }

    public final AdSize zzc() {
        zzr zzrVarZzn;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null && (zzrVarZzn = zzbxVar.zzn()) != null) {
                return com.google.android.gms.ads.zzc.zza(zzrVarZzn.zze, zzrVarZzn.zzb, zzrVarZzn.zza);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zzd() {
        return this.zzh;
    }

    public final String zze() {
        zzbx zzbxVar;
        if (this.zzl == null && (zzbxVar = this.zzj) != null) {
            try {
                this.zzl = zzbxVar.zzu();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.zzl;
    }

    public final AppEventListener zzf() {
        return this.zzi;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[Catch: RemoteException -> 0x00d5, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d5, blocks: (B:27:0x00a4, B:29:0x00aa, B:31:0x00b8, B:33:0x00ca, B:36:0x00d7), top: B:57:0x00a4, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(com.google.android.gms.ads.internal.client.zzek r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzen.zzg(com.google.android.gms.ads.internal.client.zzek):void");
    }

    public final void zzh() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzf();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzi() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzm();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzj() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzg();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzk(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzl(zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzy(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzm(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzn(adSizeArr);
    }

    public final void zzn(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzo(zzF(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        this.zzm.requestLayout();
    }

    public final void zzo(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzp(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzi(appEventListener != null ? new zzbbj(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzq(boolean z10) {
        this.zzo = z10;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzz(z10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean zzr() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                return zzbxVar.zzA();
            }
            return false;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final boolean zzs() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                return zzbxVar.zzB();
            }
            return false;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final ResponseInfo zzt() {
        zzea zzeaVarZzt = null;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzeaVarZzt = zzbxVar.zzt();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzeaVarZzt);
    }

    public final void zzu(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final long zzv() {
        AtomicLong atomicLong = this.zzq;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                atomicLong.set(zzbxVar.zzU());
                return atomicLong.get();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        return 0L;
    }

    public final void zzw(long j10) {
        this.zzq.set(j10);
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzT(j10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final OnPaidEventListener zzx() {
        return this.zzp;
    }

    public final VideoController zzy() {
        return this.zze;
    }

    public final zzed zzz() {
        zzbx zzbxVar = this.zzj;
        if (zzbxVar != null) {
            try {
                return zzbxVar.zzF();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzq.zza, null, 0);
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzq.zza, null, i10);
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, zzq zzqVar, zzbx zzbxVar, int i10) {
        zzr zzrVar;
        this.zzb = new zzbrf();
        this.zze = new VideoController();
        this.zza = new zzel(this);
        this.zzq = new AtomicLong();
        this.zzm = viewGroup;
        this.zzc = zzqVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.zzh = zzzVar.zza(z10);
                this.zzl = zzzVar.zzb();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZza = zzbb.zza();
                    AdSize adSize = this.zzh[0];
                    int i11 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzrVar = new zzr(context, adSize);
                        zzrVar.zzj = zzG(i11);
                    }
                    zzfVarZza.zzc(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                zzbb.zza().zzb(viewGroup, new zzr(context, AdSize.BANNER), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
