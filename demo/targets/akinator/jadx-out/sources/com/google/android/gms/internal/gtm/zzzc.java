package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzzc implements zzadw {
    private final zzzb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzzc(zzzb zzzbVar) {
        byte[] bArr = zzaco.zzb;
        this.zza = zzzbVar;
        zzzbVar.zzc = this;
    }

    private final Object zzR(zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        Object objZze = zzadxVar.zze();
        zzT(objZze, zzadxVar, zzabqVar);
        zzadxVar.zzf(objZze);
        return objZze;
    }

    private final Object zzS(zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        Object objZze = zzadxVar.zze();
        zzU(objZze, zzadxVar, zzabqVar);
        zzadxVar.zzf(objZze);
        return objZze;
    }

    private final void zzT(Object obj, zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzadxVar.zzh(obj, this, zzabqVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzacq("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzU(Object obj, zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        zzzb zzzbVar = this.zza;
        int iZzn = zzzbVar.zzn();
        if (zzzbVar.zza >= zzzbVar.zzb) {
            throw new zzacq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZze = zzzbVar.zze(iZzn);
        this.zza.zza++;
        zzadxVar.zzh(obj, this, zzabqVar);
        this.zza.zzz(0);
        r5.zza--;
        this.zza.zzA(iZze);
    }

    private final void zzV(int i10) throws IOException {
        if (this.zza.zzd() != i10) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzW(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw new zzacp("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzX(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzacq("Failed to parse the message.");
        }
    }

    private static final void zzY(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzacq("Failed to parse the message.");
        }
    }

    public static zzzc zzq(zzzb zzzbVar) {
        zzzc zzzcVar = zzzbVar.zzc;
        return zzzcVar != null ? zzzcVar : new zzzc(zzzbVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzA(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzacg) {
            zzacg zzacgVar = (zzacg) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzacgVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzacgVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzB(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzacg) {
            zzacg zzacgVar = (zzacg) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzacgVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            do {
                zzacgVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i11 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzC(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzadaVar.zzf(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzadaVar.zzf(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzD(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzabx) {
            zzabx zzabxVar = (zzabx) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzabxVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            do {
                zzabxVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i11 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    @Deprecated
    public final void zzE(List list, zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        int iZzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzacp("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzR(zzadxVar, zzabqVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i10);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzF(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzacg) {
            zzacg zzacgVar = (zzacg) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzacgVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzacgVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzG(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzadaVar.zzf(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzadaVar.zzf(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzH(List list, zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        int iZzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzacp("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzadxVar, zzabqVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i10);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzI(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzacg) {
            zzacg zzacgVar = (zzacg) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzacgVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            do {
                zzacgVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i11 != 5) {
                throw new zzacp("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzJ(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzadaVar.zzf(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzadaVar.zzf(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzK(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzacg) {
            zzacg zzacgVar = (zzacg) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzacgVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzacgVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzL(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzadaVar.zzf(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzadaVar.zzf(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzM(List list, boolean z10) throws IOException {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw new zzacp("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzacx) && !z10) {
            zzacx zzacxVar = (zzacx) list;
            do {
                zzp();
                zzacxVar.zza();
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzu() : zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzN(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzacg) {
            zzacg zzacgVar = (zzacg) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzacgVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzacgVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzO(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzadaVar.zzf(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzadaVar.zzf(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final boolean zzP() throws IOException {
        zzW(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final boolean zzQ() throws IOException {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final double zza() throws IOException {
        zzW(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final float zzb() throws IOException {
        zzW(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zze() throws IOException {
        zzW(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzf() throws IOException {
        zzW(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzg() throws IOException {
        zzW(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzh() throws IOException {
        zzW(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzi() throws IOException {
        zzW(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final int zzj() throws IOException {
        zzW(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final long zzk() throws IOException {
        zzW(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final long zzl() throws IOException {
        zzW(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final long zzm() throws IOException {
        zzW(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final long zzn() throws IOException {
        zzW(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final long zzo() throws IOException {
        zzW(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final zzyx zzp() throws IOException {
        zzW(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    @Deprecated
    public final Object zzr(Class cls, zzabq zzabqVar) throws IOException {
        zzW(3);
        return zzR(zzadt.zza().zzb(cls), zzabqVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final Object zzs(Class cls, zzabq zzabqVar) throws IOException {
        zzW(2);
        return zzS(zzadt.zza().zzb(cls), zzabqVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final String zzt() throws IOException {
        zzW(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final String zzu() throws IOException {
        zzW(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzv(Object obj, zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        zzW(3);
        zzT(obj, zzadxVar, zzabqVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzw(Object obj, zzadx zzadxVar, zzabq zzabqVar) throws IOException {
        zzW(2);
        zzU(obj, zzadxVar, zzabqVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzx(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzyo) {
            zzyo zzyoVar = (zzyo) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar = this.zza;
                int iZzd = zzzbVar.zzd() + zzzbVar.zzn();
                do {
                    zzyoVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzyoVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                zzzb zzzbVar2 = this.zza;
                int iZzd2 = zzzbVar2.zzd() + zzzbVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzy(List list) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw new zzacp("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzadw
    public final void zzz(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzabn) {
            zzabn zzabnVar = (zzabn) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = iZzn + this.zza.zzd();
                do {
                    zzabnVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzabnVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzacp("Protocol message tag had invalid wire type.");
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = iZzn2 + this.zza.zzd();
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}
