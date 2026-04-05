package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzoo implements zzmi {
    private final zzdc zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzon zzd;
    private final SparseArray zze;
    private zzds zzf;
    private zzbb zzg;
    private zzdm zzh;
    private boolean zzi;

    public zzoo(zzdc zzdcVar) {
        zzdcVar.getClass();
        this.zza = zzdcVar;
        this.zzf = new zzds(zzep.zze(), zzdcVar, zzom.zza);
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzon(zzbdVar);
        this.zze = new SparseArray();
    }

    private final zzmj zzad(zzuu zzuuVar) {
        this.zzg.getClass();
        zzbf zzbfVarZze = zzuuVar == null ? null : this.zzd.zze(zzuuVar);
        if (zzuuVar != null && zzbfVarZze != null) {
            return zzaa(zzbfVarZze, zzbfVarZze.zzo(zzuuVar.zza, this.zzb).zzc, zzuuVar);
        }
        int iZzs = this.zzg.zzs();
        zzbf zzbfVarZzq = this.zzg.zzq();
        if (iZzs >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, iZzs, null);
    }

    private final zzmj zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzmj zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzmj zzag(int i10, zzuu zzuuVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzuuVar != null) {
            return this.zzd.zze(zzuuVar) != null ? zzad(zzuuVar) : zzaa(zzbf.zza, i10, zzuuVar);
        }
        zzbf zzbfVarZzq = zzbbVar.zzq();
        if (i10 >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, i10, null);
    }

    private final zzmj zzah(zzau zzauVar) {
        zzuu zzuuVar;
        return (!(zzauVar instanceof zzib) || (zzuuVar = ((zzib) zzauVar).zzh) == null) ? zzZ() : zzad(zzuuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zzmj zzmjVarZzZ = zzZ();
        this.zzi = true;
        zzY(zzmjVarZzZ, -1, new zzdn(zzmjVarZzZ) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzB(final int i10, final int i11, final boolean z10) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new zzdn(zzmjVarZzaf, i10, i11, z10) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzC(final zzhs zzhsVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1007, new zzdn(zzmjVarZzaf, zzhsVar) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzD(final String str, final long j10, final long j11) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1008, new zzdn(zzmjVarZzaf, str, j11, j10) { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzE(final zzv zzvVar, final zzht zzhtVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1009, new zzdn() { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzk(zzmjVarZzaf, zzvVar, zzhtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzF(final long j10) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1010, new zzdn(zzmjVarZzaf, j10) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzG(final int i10, final long j10, final long j11) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1011, new zzdn(zzmjVarZzaf, i10, j10, j11) { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzH(final String str) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, TTAdConstant.IMAGE_MODE_1012, new zzdn(zzmjVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzI(final zzhs zzhsVar) {
        final zzmj zzmjVarZzae = zzae();
        zzY(zzmjVarZzae, C3227g4.f36755i, new zzdn(zzmjVarZzae, zzhsVar) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzJ(final Exception exc) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, C3227g4.f36756j, new zzdn(zzmjVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzK(final Exception exc) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new zzdn(zzmjVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzL(final zzqb zzqbVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new zzdn(zzmjVarZzaf, zzqbVar) { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzM(final zzqb zzqbVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new zzdn(zzmjVarZzaf, zzqbVar) { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzN(final zzhs zzhsVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1015, new zzdn(zzmjVarZzaf, zzhsVar) { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzO(final String str, final long j10, final long j11) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, C3227g4.f36758l, new zzdn(zzmjVarZzaf, str, j11, j10) { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzP(final zzv zzvVar, final zzht zzhtVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1017, new zzdn() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzl(zzmjVarZzaf, zzvVar, zzhtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzQ(final int i10, final long j10) {
        final zzmj zzmjVarZzae = zzae();
        zzY(zzmjVarZzae, 1018, new zzdn() { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzm(zzmjVarZzae, i10, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzR(final String str) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 1019, new zzdn(zzmjVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzS(final zzhs zzhsVar) {
        final zzmj zzmjVarZzae = zzae();
        zzY(zzmjVarZzae, 1020, new zzdn() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzdm(zzmjVarZzae, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzT(final Object obj, final long j10) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 26, new zzdn() { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj2) {
                ((zzml) obj2).zzo(zzmjVarZzaf, obj, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzU(final long j10, final int i10) {
        final zzmj zzmjVarZzae = zzae();
        zzY(zzmjVarZzae, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new zzdn(zzmjVarZzae, j10, i10) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzV(final Exception exc) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new zzdn(zzmjVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzW(final int i10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new zzdn(zzmjVarZzZ, i10) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void zzX(final int i10, final long j10, final long j11) {
        final zzmj zzmjVarZzad = zzad(this.zzd.zzd());
        zzY(zzmjVarZzad, 1006, new zzdn() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzdl(zzmjVarZzad, i10, j10, j11);
            }
        });
    }

    public final void zzY(zzmj zzmjVar, int i10, zzdn zzdnVar) {
        this.zze.put(i10, zzmjVar);
        zzds zzdsVar = this.zzf;
        zzdsVar.zzd(i10, zzdnVar);
        zzdsVar.zze();
    }

    public final zzmj zzZ() {
        return zzad(this.zzd.zza());
    }

    @RequiresNonNull({"player"})
    public final zzmj zzaa(zzbf zzbfVar, int i10, zzuu zzuuVar) {
        zzuu zzuuVar2 = true == zzbfVar.zzg() ? null : zzuuVar;
        long jZzb = this.zza.zzb();
        boolean z10 = zzbfVar.equals(this.zzg.zzq()) && i10 == this.zzg.zzs();
        long jZzp = 0;
        if (zzuuVar2 == null || !zzuuVar2.zzb()) {
            if (z10) {
                jZzp = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j10 = zzbfVar.zzb(i10, this.zzc, 0L).zzl;
                jZzp = zzep.zzp(0L);
            }
        } else if (z10 && this.zzg.zzy() == zzuuVar2.zzb && this.zzg.zzz() == zzuuVar2.zzc) {
            jZzp = this.zzg.zzu();
        }
        return new zzmj(jZzb, zzbfVar, i10, zzuuVar2, jZzp, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    public final /* synthetic */ void zzab(zzbb zzbbVar, zzml zzmlVar, zzs zzsVar) {
        zzmlVar.zzdn(zzbbVar, new zzmk(zzsVar, this.zze));
    }

    public final /* synthetic */ void zzac() {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new zzdn(zzmjVarZzZ) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i10) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 0, new zzdn(zzmjVarZzZ, i10) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final zzak zzakVar, final int i10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 1, new zzdn(zzmjVarZzZ, zzakVar, i10) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcT(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar, final int i11) {
        final zzmj zzmjVarZzag = zzag(i10, zzuuVar);
        zzY(zzmjVarZzag, 1000, new zzdn(zzmjVarZzag, zzulVar, zzuqVar, i11) { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcU(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar) {
        final zzmj zzmjVarZzag = zzag(i10, zzuuVar);
        zzY(zzmjVarZzag, 1001, new zzdn(zzmjVarZzag, zzulVar, zzuqVar) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcV(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar) {
        final zzmj zzmjVarZzag = zzag(i10, zzuuVar);
        zzY(zzmjVarZzag, 1002, new zzdn(zzmjVarZzag, zzulVar, zzuqVar) { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcW(int i10, zzuu zzuuVar, final zzul zzulVar, final zzuq zzuqVar, final IOException iOException, final boolean z10) {
        final zzmj zzmjVarZzag = zzag(i10, zzuuVar);
        zzY(zzmjVarZzag, IronSourceError.AUCTION_ERROR_DECRYPTION, new zzdn() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzh(zzmjVarZzag, zzulVar, zzuqVar, iOException, z10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcX(int i10, zzuu zzuuVar, final zzuq zzuqVar) {
        final zzmj zzmjVarZzag = zzag(i10, zzuuVar);
        zzY(zzmjVarZzag, 1004, new zzdn() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzdk(zzmjVarZzag, zzuqVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 2, new zzdn(zzmjVarZzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 14, new zzdn(zzmjVarZzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 3, new zzdn(zzmjVarZzZ, z10) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 13, new zzdn(zzmjVarZzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z10, final int i10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, -1, new zzdn(zzmjVarZzZ, z10, i10) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 4, new zzdn() { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zze(zzmjVarZzZ, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z10, final int i10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 5, new zzdn(zzmjVarZzZ, z10, i10) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 6, new zzdn(zzmjVarZzZ, i10) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z10) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 7, new zzdn(zzmjVarZzZ, z10) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zzmj zzmjVarZzah = zzah(zzauVar);
        zzY(zzmjVarZzah, 10, new zzdn() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzg(zzmjVarZzah, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final zzau zzauVar) {
        final zzmj zzmjVarZzah = zzah(zzauVar);
        zzY(zzmjVarZzah, 10, new zzdn(zzmjVarZzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i10) {
        if (i10 == 1) {
            this.zzi = false;
            i10 = 1;
        }
        zzon zzonVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzonVar.zzf(zzbbVar);
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 11, new zzdn() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzml) obj).zzdj(zzmjVarZzZ, zzbaVar, zzbaVar2, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zzmj zzmjVarZzZ = zzZ();
        zzY(zzmjVarZzZ, 12, new zzdn(zzmjVarZzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i10) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 21, new zzdn(zzmjVarZzaf, i10) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f10) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 22, new zzdn(zzmjVarZzaf, f10) { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z10) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 23, new zzdn(zzmjVarZzaf, z10) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 25, new zzdn() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                zzmj zzmjVar = zzmjVarZzaf;
                zzbv zzbvVar2 = zzbvVar;
                ((zzml) obj).zzp(zzmjVar, zzbvVar2);
                int i10 = zzbvVar2.zzb;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i10, final int i11) {
        final zzmj zzmjVarZzaf = zzaf();
        zzY(zzmjVarZzaf, 24, new zzdn(zzmjVarZzaf, i10, i11) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzv(zzml zzmlVar) {
        this.zzf.zzb(zzmlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzw(zzml zzmlVar) {
        this.zzf.zzc(zzmlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z10 = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z10 = false;
        }
        zzgmd.zzh(z10);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        this.zzh = this.zza.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdo() { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdo
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                this.zza.zzab(zzbbVar, (zzml) obj, zzsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzy() {
        zzdm zzdmVar = this.zzh;
        zzdmVar.getClass();
        zzdmVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzz(List list, zzuu zzuuVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzuuVar, zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }
}
