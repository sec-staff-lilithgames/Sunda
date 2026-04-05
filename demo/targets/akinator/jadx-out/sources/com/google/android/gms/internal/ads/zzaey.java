package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaey implements zzada {
    private final zzeg zza;
    private final zzaex zzb;
    private final boolean zzc;
    private final zzakg zzd;
    private int zze;
    private zzadd zzf;
    private zzaez zzg;
    private long zzh;
    private zzafb[] zzi;
    private long zzj;
    private zzafb zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaey() {
        this(1, zzakg.zza);
    }

    private final zzafb zzh(int i10) {
        for (zzafb zzafbVar : this.zzi) {
            if (zzafbVar.zzc(i10)) {
                return zzafbVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = this.zza;
        zzadbVar.zzi(zzegVar.zzi(), 0, 12);
        zzegVar.zzh(0);
        if (zzegVar.zzC() != 1179011410) {
            return false;
        }
        zzegVar.zzk(4);
        return zzegVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zze = 0;
        if (this.zzc) {
            zzaddVar = new zzakj(zzaddVar, this.zzd);
        }
        this.zzf = zzaddVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        boolean z10;
        ?? r20;
        long j10;
        long j11 = this.zzj;
        if (j11 != -1) {
            long jZzn = zzadbVar.zzn();
            if (j11 < jZzn || j11 > 262144 + jZzn) {
                zzaeaVar.zza = j11;
                z10 = true;
            } else {
                zzadbVar.zzf((int) (j11 - jZzn));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzj = -1L;
        if (z10) {
            return 1;
        }
        int i10 = this.zze;
        zzafb zzafbVar = null;
        if (i10 == 0) {
            if (!zza(zzadbVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzadbVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i10 == 1) {
            zzeg zzegVar = this.zza;
            zzadbVar.zzc(zzegVar.zzi(), 0, 12);
            zzegVar.zzh(0);
            zzaex zzaexVar = this.zzb;
            zzaexVar.zza(zzegVar);
            int i11 = zzaexVar.zza;
            if (i11 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i11, 22));
                sb2.append("LIST expected, found: ");
                sb2.append(i11);
                throw zzat.zzb(sb2.toString(), null);
            }
            int iZzC = zzegVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzaexVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(iZzC, 22));
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i10 == 2) {
            int i12 = this.zzl - 4;
            zzeg zzegVar2 = new zzeg(i12);
            zzadbVar.zzc(zzegVar2.zzi(), 0, i12);
            zzafc zzafcVarZzb = zzafc.zzb(1819436136, zzegVar2);
            if (zzafcVarZzb.zza() != 1819436136) {
                int iZza = zzafcVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzat.zzb(sb4.toString(), null);
            }
            zzaez zzaezVar = (zzaez) zzafcVarZzb.zzc(zzaez.class);
            if (zzaezVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzaezVar;
            this.zzh = zzaezVar.zzc * zzaezVar.zza;
            ArrayList arrayList = new ArrayList();
            zzgpe zzgpeVar = zzafcVarZzb.zza;
            int size = zzgpeVar.size();
            int i13 = 0;
            int i14 = 0;
            while (i13 < size) {
                zzaev zzaevVar = (zzaev) zzgpeVar.get(i13);
                if (zzaevVar.zza() == 1819440243) {
                    zzafc zzafcVar = (zzafc) zzaevVar;
                    int i15 = i14 + 1;
                    zzafa zzafaVar = (zzafa) zzafcVar.zzc(zzafa.class);
                    zzafd zzafdVar = (zzafd) zzafcVar.zzc(zzafd.class);
                    if (zzafaVar == null) {
                        zzdt.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzafdVar == null) {
                        zzdt.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzafaVar.zzd();
                        zzv zzvVar = zzafdVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i14);
                        int i16 = zzafaVar.zze;
                        if (i16 != 0) {
                            zztVarZza.zzn(i16);
                        }
                        zzafe zzafeVar = (zzafe) zzafcVar.zzc(zzafe.class);
                        if (zzafeVar != null) {
                            zztVarZza.zzc(zzafeVar.zza);
                        }
                        int iZzg = zzas.zzg(zzvVar.zzo);
                        if (iZzg == 1) {
                            zzaem zzaemVarZzu = this.zzf.zzu(i14, iZzg);
                            zzaemVarZzu.zzu(zztVarZza.zzM());
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzafbVar = new zzafb(i14, zzafaVar, zzaemVarZzu);
                        } else if (iZzg == 2) {
                            iZzg = 2;
                            zzaem zzaemVarZzu2 = this.zzf.zzu(i14, iZzg);
                            zzaemVarZzu2.zzu(zztVarZza.zzM());
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzafbVar = new zzafb(i14, zzafaVar, zzaemVarZzu2);
                        } else {
                            zzafbVar = null;
                        }
                    }
                    if (zzafbVar != null) {
                        arrayList.add(zzafbVar);
                    }
                    i14 = i15;
                }
                i13++;
                zzafbVar = null;
            }
            this.zzi = (zzafb[]) arrayList.toArray(new zzafb[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i10 == 3) {
            long j12 = this.zzm;
            if (j12 != -1 && zzadbVar.zzn() != j12) {
                this.zzj = j12;
                return 0;
            }
            zzeg zzegVar3 = this.zza;
            zzadbVar.zzi(zzegVar3.zzi(), 0, 12);
            zzadbVar.zzl();
            zzegVar3.zzh(0);
            zzaex zzaexVar2 = this.zzb;
            zzaexVar2.zza(zzegVar3);
            int iZzC2 = zzegVar3.zzC();
            int i17 = zzaexVar2.zza;
            if (i17 == 1179011410) {
                zzadbVar.zzf(12);
                return 0;
            }
            if (i17 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzadbVar.zzn() + zzaexVar2.zzb + 8;
                return 0;
            }
            long jZzn2 = zzadbVar.zzn();
            this.zzm = jZzn2;
            long j13 = jZzn2 + zzaexVar2.zzb + 8;
            this.zzn = j13;
            if (!this.zzp) {
                zzaez zzaezVar2 = this.zzg;
                zzaezVar2.getClass();
                if ((zzaezVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j13;
                    return 0;
                }
                this.zzf.zzw(new zzaec(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzadbVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i10 == 4) {
            zzeg zzegVar4 = this.zza;
            zzadbVar.zzc(zzegVar4.zzi(), 0, 8);
            zzegVar4.zzh(0);
            int iZzC3 = zzegVar4.zzC();
            int iZzC4 = zzegVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzadbVar.zzn() + iZzC4;
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i10 != 5) {
            if (zzadbVar.zzn() >= this.zzn) {
                return -1;
            }
            zzafb zzafbVar2 = this.zzk;
            if (zzafbVar2 != null) {
                if (!zzafbVar2.zze(zzadbVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzadbVar.zzn() & 1) == 1) {
                zzadbVar.zzf(1);
            }
            zzeg zzegVar5 = this.zza;
            zzadbVar.zzi(zzegVar5.zzi(), 0, 12);
            zzegVar5.zzh(0);
            int iZzC5 = zzegVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzegVar5.zzh(8);
                zzadbVar.zzf(zzegVar5.zzC() != 1769369453 ? 8 : 12);
                zzadbVar.zzl();
                return 0;
            }
            int iZzC6 = zzegVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzadbVar.zzn() + iZzC6 + 8;
                return 0;
            }
            zzadbVar.zzf(8);
            zzadbVar.zzl();
            zzafb zzafbVarZzh = zzh(iZzC5);
            if (zzafbVarZzh == null) {
                this.zzj = zzadbVar.zzn() + iZzC6;
                return 0;
            }
            zzafbVarZzh.zzd(iZzC6);
            this.zzk = zzafbVarZzh;
            return 0;
        }
        zzeg zzegVar6 = new zzeg(this.zzo);
        zzadbVar.zzc(zzegVar6.zzi(), 0, this.zzo);
        if (zzegVar6.zzd() < 16) {
            r20 = 0;
            j10 = 0;
        } else {
            int iZzg2 = zzegVar6.zzg();
            zzegVar6.zzk(8);
            long jZzC = zzegVar6.zzC();
            r20 = 0;
            long j14 = this.zzm;
            j10 = jZzC > j14 ? 0L : j14 + 8;
            zzegVar6.zzh(iZzg2);
        }
        while (zzegVar6.zzd() >= 16) {
            int iZzC7 = zzegVar6.zzC();
            int iZzC8 = zzegVar6.zzC();
            long jZzC2 = zzegVar6.zzC() + j10;
            zzegVar6.zzk(4);
            zzafb zzafbVarZzh2 = zzh(iZzC7);
            if (zzafbVarZzh2 != null) {
                zzafbVarZzh2.zza(jZzC2, (iZzC8 & 16) == 16 ? true : r20);
            }
        }
        zzafb[] zzafbVarArr = this.zzi;
        int length = zzafbVarArr.length;
        for (int i18 = r20; i18 < length; i18++) {
            zzafbVarArr[i18].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzaec(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzaew(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return r20;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzafb zzafbVar : this.zzi) {
            zzafbVar.zzf(j10);
        }
        if (j10 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    public final /* synthetic */ zzafb[] zzg() {
        return this.zzi;
    }

    public zzaey(int i10, zzakg zzakgVar) {
        this.zzd = zzakgVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzeg(12);
        this.zzb = new zzaex(null);
        this.zzf = new zzady();
        this.zzi = new zzafb[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = C.TIME_UNSET;
    }
}
