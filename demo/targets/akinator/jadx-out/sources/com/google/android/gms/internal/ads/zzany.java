package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzany implements zzanq {
    final /* synthetic */ zzaoa zza;
    private final zzef zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzany(zzaoa zzaoaVar, int i10) {
        Objects.requireNonNull(zzaoaVar);
        this.zza = zzaoaVar;
        this.zzb = new zzef(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final void zzb(zzeg zzegVar) {
        zzaoa zzaoaVar;
        int i10;
        zzef zzefVar;
        int i11;
        int i12;
        if (zzegVar.zzs() != 2) {
            return;
        }
        zzaoa zzaoaVar2 = this.zza;
        zzem zzemVar = (zzem) zzaoaVar2.zzg().get(0);
        if ((zzegVar.zzs() & 128) != 0) {
            zzegVar.zzk(1);
            int iZzt = zzegVar.zzt();
            int i13 = 3;
            zzegVar.zzk(3);
            zzef zzefVar2 = this.zzb;
            zzegVar.zzl(zzefVar2, 2);
            zzefVar2.zzh(3);
            int i14 = 13;
            zzaoaVar2.zzp(zzefVar2.zzj(13));
            zzegVar.zzl(zzefVar2, 2);
            int i15 = 4;
            zzefVar2.zzh(4);
            int i16 = 12;
            zzegVar.zzk(zzefVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzegVar.zzd();
            while (iZzd > 0) {
                int i17 = 5;
                zzegVar.zzl(zzefVar2, 5);
                int iZzj = zzefVar2.zzj(8);
                zzefVar2.zzh(i13);
                int iZzj2 = zzefVar2.zzj(i14);
                zzefVar2.zzh(i15);
                int iZzj3 = zzefVar2.zzj(i16);
                int iZzg = zzegVar.zzg();
                int i18 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i19 = -1;
                int iZzs = 0;
                while (zzegVar.zzg() < i18) {
                    int iZzs2 = zzegVar.zzs();
                    int iZzg2 = zzegVar.zzg() + zzegVar.zzs();
                    if (iZzg2 > i18) {
                        break;
                    }
                    if (iZzs2 == i17) {
                        long jZzz = zzegVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i12 = 36;
                                        zzaoaVar = zzaoaVar2;
                                        i19 = i12;
                                        i10 = iZzg2;
                                        zzefVar = zzefVar2;
                                        i11 = iZzd;
                                    }
                                    zzaoaVar = zzaoaVar2;
                                    i10 = iZzg2;
                                    zzefVar = zzefVar2;
                                    i11 = iZzd;
                                }
                                zzaoaVar = zzaoaVar2;
                                i10 = iZzg2;
                                zzefVar = zzefVar2;
                                i11 = iZzd;
                                i19 = 172;
                            }
                            zzaoaVar = zzaoaVar2;
                            zzefVar = zzefVar2;
                            i11 = iZzd;
                            i19 = 135;
                            i10 = iZzg2;
                        }
                        zzaoaVar = zzaoaVar2;
                        i10 = iZzg2;
                        zzefVar = zzefVar2;
                        i11 = iZzd;
                        i19 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzaoaVar = zzaoaVar2;
                                zzefVar = zzefVar2;
                                i11 = iZzd;
                                i19 = 135;
                                i10 = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzegVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i12 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i12 = 139;
                                            }
                                            zzaoaVar = zzaoaVar2;
                                            i10 = iZzg2;
                                            zzefVar = zzefVar2;
                                            i11 = iZzd;
                                        }
                                    }
                                    zzaoaVar = zzaoaVar2;
                                    i10 = iZzg2;
                                    zzefVar = zzefVar2;
                                    i11 = iZzd;
                                    i19 = 172;
                                } else if (iZzs2 == 123) {
                                    i12 = 138;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzegVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzegVar.zzs();
                                    zzaoaVar = zzaoaVar2;
                                    str = strTrim;
                                    i10 = iZzg2;
                                    zzefVar = zzefVar2;
                                    i11 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzegVar.zzg() < iZzg2) {
                                        int i20 = iZzg2;
                                        String strTrim2 = zzegVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzegVar.zzs();
                                        int i21 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzegVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzaob(strTrim2, iZzs4, bArr));
                                        iZzd = i21;
                                        iZzg2 = i20;
                                        zzefVar2 = zzefVar2;
                                        zzaoaVar2 = zzaoaVar2;
                                    }
                                    zzaoaVar = zzaoaVar2;
                                    i10 = iZzg2;
                                    zzefVar = zzefVar2;
                                    i11 = iZzd;
                                    arrayList = arrayList2;
                                    i19 = 89;
                                } else {
                                    zzaoaVar = zzaoaVar2;
                                    i10 = iZzg2;
                                    zzefVar = zzefVar2;
                                    i11 = iZzd;
                                    if (iZzs2 == 111) {
                                        i19 = 257;
                                    }
                                }
                                zzaoaVar = zzaoaVar2;
                                i19 = i12;
                                i10 = iZzg2;
                                zzefVar = zzefVar2;
                                i11 = iZzd;
                            }
                        }
                        zzaoaVar = zzaoaVar2;
                        i10 = iZzg2;
                        zzefVar = zzefVar2;
                        i11 = iZzd;
                        i19 = 129;
                    }
                    zzegVar.zzk(i10 - zzegVar.zzg());
                    iZzd = i11;
                    zzefVar2 = zzefVar;
                    zzaoaVar2 = zzaoaVar;
                    i17 = 5;
                }
                zzaoa zzaoaVar3 = zzaoaVar2;
                zzef zzefVar3 = zzefVar2;
                int i22 = iZzd;
                zzegVar.zzh(i18);
                zzaoc zzaocVar = new zzaoc(i19, str, iZzs, arrayList, Arrays.copyOfRange(zzegVar.zzi(), iZzg, i18));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzaocVar.zza;
                }
                iZzd = i22 - (iZzj3 + 5);
                if (!zzaoaVar3.zzj().get(iZzj2)) {
                    zzaof zzaofVarZzb = zzaoaVar3.zzh().zzb(iZzj, zzaocVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzaofVarZzb);
                }
                i15 = 4;
                zzefVar2 = zzefVar3;
                zzaoaVar2 = zzaoaVar3;
                i13 = 3;
                i14 = 13;
                i16 = 12;
            }
            zzaoa zzaoaVar4 = zzaoaVar2;
            int size = sparseIntArray.size();
            for (int i23 = 0; i23 < size; i23++) {
                int iKeyAt = sparseIntArray.keyAt(i23);
                int iValueAt = sparseIntArray.valueAt(i23);
                zzaoaVar4.zzj().put(iKeyAt, true);
                zzaoaVar4.zzk().put(iValueAt, true);
                zzaof zzaofVar = (zzaof) sparseArray.valueAt(i23);
                if (zzaofVar != null) {
                    zzaofVar.zza(zzemVar, zzaoaVar4.zzl(), new zzaoe(iZzt, iKeyAt, Segment.SIZE));
                    zzaoaVar4.zzi().put(iValueAt, zzaofVar);
                }
            }
            zzaoaVar4.zzi().remove(this.zze);
            zzaoaVar4.zzn(0);
            if (zzaoaVar4.zzm() == 0) {
                zzaoaVar4.zzl().zzv();
                zzaoaVar4.zzo(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final void zza(zzem zzemVar, zzadd zzaddVar, zzaoe zzaoeVar) {
    }
}
