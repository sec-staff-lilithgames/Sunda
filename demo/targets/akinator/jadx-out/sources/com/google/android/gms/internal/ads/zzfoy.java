package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfoy extends zzfou {
    private final zzfow zza;
    private zzfrj zzc;
    private zzfqi zzd;
    private final String zzg;
    private final zzfpw zzb = new zzfpw();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfoy(zzfov zzfovVar, zzfow zzfowVar, String str) {
        this.zza = zzfowVar;
        this.zzg = str;
        zzk(null);
        if (zzfowVar.zzi() == zzfox.HTML || zzfowVar.zzi() == zzfox.JAVASCRIPT) {
            this.zzd = new zzfqj(str, zzfowVar.zzf());
        } else {
            this.zzd = new zzfqm(str, zzfowVar.zze(), null);
        }
        this.zzd.zza();
        zzfps.zza().zzb(this);
        this.zzd.zzj(zzfovVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzfrj(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfou
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfps.zza().zzc(this);
        this.zzd.zzo(zzfqa.zza().zzg());
        this.zzd.zzn(zzfpq.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfou
    public final void zzb(View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfoy> collectionZze = zzfps.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfoy zzfoyVar : collectionZze) {
            if (zzfoyVar != this && zzfoyVar.zzi() == view) {
                zzfoyVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfou
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfps.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfou
    public final void zzd(View view, zzfpb zzfpbVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfpbVar, "Ad overlay");
    }

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzfqi zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzi() {
        return (View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
