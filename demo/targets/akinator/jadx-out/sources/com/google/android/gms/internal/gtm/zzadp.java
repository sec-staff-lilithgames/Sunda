package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzadp implements zzadx {
    private final zzadl zza;
    private final zzaem zzb;
    private final boolean zzc;
    private final zzabr zzd;

    private zzadp(zzaem zzaemVar, zzabr zzabrVar, zzadl zzadlVar) {
        this.zzb = zzaemVar;
        this.zzc = zzadlVar instanceof zzacc;
        this.zzd = zzabrVar;
        this.zza = zzadlVar;
    }

    public static zzadp zzc(zzaem zzaemVar, zzabr zzabrVar, zzadl zzadlVar) {
        return new zzadp(zzaemVar, zzabrVar, zzadlVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final int zza(Object obj) {
        int iZzb = ((zzacf) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzacc) obj).zza.zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final int zzb(Object obj) {
        int iHashCode = ((zzacf) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzacc) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final Object zze() {
        zzadl zzadlVar = this.zza;
        return zzadlVar instanceof zzacf ? ((zzacf) zzadlVar).zzae() : zzadlVar.zzav().zzE();
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final void zzg(Object obj, Object obj2) {
        zzadz.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzadz.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final void zzh(Object obj, zzadw zzadwVar, zzabq zzabqVar) throws IOException {
        boolean zZzQ;
        zzaem zzaemVar = this.zzb;
        Object objZza = zzaemVar.zza(obj);
        zzabv zzabvVarZzU = ((zzacc) obj).zzU();
        while (zzadwVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzadwVar.zzd();
                zzabr zzabrVar = this.zzd;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        zzace zzaceVarZzb = zzabqVar.zzb(this.zza, iZzd >>> 3);
                        if (zzaceVarZzb != null) {
                            zzabrVar.zzb(zzadwVar, zzaceVarZzb, zzabqVar, zzabvVarZzU);
                        } else {
                            zZzQ = zzaemVar.zzk(objZza, zzadwVar, 0);
                        }
                    } else {
                        zZzQ = zzadwVar.zzQ();
                    }
                    if (!zZzQ) {
                        break;
                    }
                } else {
                    zzace zzaceVarZzb2 = null;
                    zzyx zzyxVarZzp = null;
                    int iZzj = 0;
                    while (zzadwVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzadwVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzadwVar.zzj();
                            zzaceVarZzb2 = zzabqVar.zzb(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzaceVarZzb2 != null) {
                                zzabrVar.zzb(zzadwVar, zzaceVarZzb2, zzabqVar, zzabvVarZzU);
                            } else {
                                zzyxVarZzp = zzadwVar.zzp();
                            }
                        } else if (!zzadwVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzadwVar.zzd() != 12) {
                        throw new zzacq("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzyxVarZzp != null) {
                        if (zzaceVarZzb2 != null) {
                            zzadk zzadkVarZzav = zzaceVarZzb2.zzc.zzav();
                            zzzb zzzbVarZzH = zzzb.zzH(((zzyv) zzyxVarZzp).zza, 0, ((zzyv) zzyxVarZzp).zzd(), true);
                            zzadkVarZzav.zzy(zzzbVarZzH, zzabqVar);
                            zzabvVarZzU.zzk(zzaceVarZzb2.zzd, zzadkVarZzav.zzE());
                            zzzbVarZzH.zzz(0);
                        } else {
                            zzaemVar.zzg(objZza, iZzj, zzyxVarZzp);
                        }
                    }
                }
            } finally {
                zzaemVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzadx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.gtm.zzyl r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.gtm.zzacf r0 = (com.google.android.gms.internal.gtm.zzacf) r0
            com.google.android.gms.internal.gtm.zzaen r1 = r0.zzc
            com.google.android.gms.internal.gtm.zzaen r2 = com.google.android.gms.internal.gtm.zzaen.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.gtm.zzaen r1 = com.google.android.gms.internal.gtm.zzaen.zzf()
            r0.zzc = r1
        L11:
            r6 = r1
            com.google.android.gms.internal.gtm.zzacc r11 = (com.google.android.gms.internal.gtm.zzacc) r11
            com.google.android.gms.internal.gtm.zzabv r11 = r11.zzU()
            r0 = 0
            r1 = r0
        L1a:
            if (r13 >= r14) goto Lc5
            int r4 = com.google.android.gms.internal.gtm.zzym.zzi(r12, r13, r15)
            int r2 = r15.zza
            r13 = 11
            r3 = 2
            if (r2 == r13) goto L60
            r13 = r2 & 7
            if (r13 != r3) goto L59
            com.google.android.gms.internal.gtm.zzabq r13 = r15.zzd
            com.google.android.gms.internal.gtm.zzadl r1 = r10.zza
            int r3 = r2 >>> 3
            com.google.android.gms.internal.gtm.zzace r1 = r13.zzb(r1, r3)
            if (r1 == 0) goto L51
            com.google.android.gms.internal.gtm.zzadl r13 = r1.zzc
            com.google.android.gms.internal.gtm.zzadt r2 = com.google.android.gms.internal.gtm.zzadt.zza()
            java.lang.Class r13 = r13.getClass()
            com.google.android.gms.internal.gtm.zzadx r13 = r2.zzb(r13)
            int r13 = com.google.android.gms.internal.gtm.zzym.zzd(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.zzc
            com.google.android.gms.internal.gtm.zzacd r3 = r1.zzd
            r11.zzk(r3, r2)
            goto L1a
        L51:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.gtm.zzym.zzh(r2, r3, r4, r5, r6, r7)
            goto L1a
        L59:
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.gtm.zzym.zzo(r2, r12, r4, r5, r7)
            goto L1a
        L60:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L64:
            if (r4 >= r5) goto Lb7
            int r15 = com.google.android.gms.internal.gtm.zzym.zzi(r12, r4, r7)
            int r2 = r7.zza
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L9d
            r9 = 3
            if (r4 == r9) goto L76
            goto Lae
        L76:
            if (r1 == 0) goto L92
            com.google.android.gms.internal.gtm.zzadl r2 = r1.zzc
            com.google.android.gms.internal.gtm.zzadt r4 = com.google.android.gms.internal.gtm.zzadt.zza()
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.gtm.zzadx r2 = r4.zzb(r2)
            int r4 = com.google.android.gms.internal.gtm.zzym.zzd(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.zzc
            com.google.android.gms.internal.gtm.zzacd r2 = r1.zzd
            r11.zzk(r2, r15)
            goto L64
        L92:
            if (r8 != r3) goto Lae
            int r4 = com.google.android.gms.internal.gtm.zzym.zza(r12, r15, r7)
            java.lang.Object r14 = r7.zzc
            com.google.android.gms.internal.gtm.zzyx r14 = (com.google.android.gms.internal.gtm.zzyx) r14
            goto L64
        L9d:
            if (r8 != 0) goto Lae
            int r4 = com.google.android.gms.internal.gtm.zzym.zzi(r12, r15, r7)
            int r13 = r7.zza
            com.google.android.gms.internal.gtm.zzabq r15 = r7.zzd
            com.google.android.gms.internal.gtm.zzadl r1 = r10.zza
            com.google.android.gms.internal.gtm.zzace r1 = r15.zzb(r1, r13)
            goto L64
        Lae:
            r4 = 12
            if (r2 == r4) goto Lb8
            int r4 = com.google.android.gms.internal.gtm.zzym.zzo(r2, r12, r15, r5, r7)
            goto L64
        Lb7:
            r15 = r4
        Lb8:
            if (r14 == 0) goto Lc0
            int r13 = r13 << 3
            r13 = r13 | r3
            r6.zzj(r13, r14)
        Lc0:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L1a
        Lc5:
            r5 = r14
            if (r13 != r5) goto Lc9
            return
        Lc9:
            com.google.android.gms.internal.gtm.zzacq r11 = new com.google.android.gms.internal.gtm.zzacq
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzadp.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zzyl):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final void zzj(Object obj, zzaez zzaezVar) throws IOException {
        Iterator itZzg = ((zzacc) obj).zza.zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            zzabu zzabuVar = (zzabu) entry.getKey();
            if (zzabuVar.zze() != zzaey.MESSAGE || zzabuVar.zzg()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzabuVar.zzf();
            if (entry instanceof zzacs) {
                zzaezVar.zzw(zzabuVar.zza(), ((zzacs) entry).zza().zzb());
            } else {
                zzaezVar.zzw(zzabuVar.zza(), entry.getValue());
            }
        }
        ((zzacf) obj).zzc.zzk(zzaezVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzacf) obj).zzc.equals(((zzacf) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzacc) obj).zza.equals(((zzacc) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzadx
    public final boolean zzl(Object obj) {
        return ((zzacc) obj).zza.zzm();
    }
}
