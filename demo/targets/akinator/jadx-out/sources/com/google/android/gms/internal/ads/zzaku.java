package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaku implements zzaki {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakn zzg;
    private final zzakm zzh;
    private final zzakt zzi;
    private Bitmap zzj;

    public zzaku(List list) {
        zzeg zzegVar = new zzeg((byte[]) list.get(0));
        int iZzt = zzegVar.zzt();
        int iZzt2 = zzegVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakn(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakm(0, zzd(), zze(), zzf());
        this.zzi = new zzakt(iZzt, iZzt2);
    }

    private static zzakm zzb(zzef zzefVar, int i10) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i11 = 8;
        int iZzj5 = zzefVar.zzj(8);
        zzefVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iZzj6 = zzefVar.zzj(i11);
            int iZzj7 = zzefVar.zzj(i11);
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzefVar.zzj(i11);
                iZzj4 = zzefVar.zzj(i11);
                iZzj = zzefVar.zzj(i11);
                iZzj2 = zzefVar.zzj(i11);
                i12 -= 6;
            } else {
                int iZzj8 = zzefVar.zzj(6) << 2;
                int iZzj9 = zzefVar.zzj(4) << 4;
                i12 -= 4;
                iZzj = zzefVar.zzj(4) << 4;
                iZzj2 = zzefVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d10 = iZzj3;
            String str = zzep.zza;
            double d11 = iZzj4 - 128;
            double d12 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            iZzj5 = iZzj5;
            i11 = 8;
        }
        return new zzakm(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzako zzc(zzef zzefVar) {
        byte[] bArr;
        int iZzj = zzefVar.zzj(16);
        zzefVar.zzh(4);
        int iZzj2 = zzefVar.zzj(2);
        boolean zZzi = zzefVar.zzi();
        zzefVar.zzh(1);
        byte[] bArr2 = zzep.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzefVar.zzj(16);
                int iZzj4 = zzefVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzefVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzefVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzako(iZzj, zZzi, bArr2, bArr);
        }
        zzefVar.zzh(zzefVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzako(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzg(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzg(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzh(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaku.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i10, int i11, zzef zzefVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzefVar.zzj(i11);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        boolean z10;
        zzaka zzakaVar;
        Canvas canvas;
        char c10;
        char c11;
        char c12;
        int i12;
        zzakt zzaktVar;
        Canvas canvas2;
        int i13;
        int i14;
        int i15;
        zzakr zzakrVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i16;
        int iZzj5;
        zzef zzefVar = new zzef(bArr, i10 + i11);
        zzefVar.zzf(i10);
        while (true) {
            z10 = true;
            if (zzefVar.zzc() >= 48 && zzefVar.zzj(8) == 15) {
                zzakt zzaktVar2 = this.zzi;
                int iZzj6 = zzefVar.zzj(8);
                int iZzj7 = zzefVar.zzj(16);
                int iZzj8 = zzefVar.zzj(16);
                int iZze = zzefVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzefVar.zzc()) {
                    zzdt.zzc("DvbParser", "Data field length exceeds limit");
                    zzefVar.zzh(zzefVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzaktVar2.zza) {
                                zzakp zzakpVar = zzaktVar2.zzi;
                                int iZzj9 = zzefVar.zzj(8);
                                int iZzj10 = zzefVar.zzj(4);
                                int iZzj11 = zzefVar.zzj(2);
                                zzefVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i17 = iZzj8 - 2; i17 > 0; i17 -= 6) {
                                    int iZzj12 = zzefVar.zzj(8);
                                    zzefVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzakq(zzefVar.zzj(16), zzefVar.zzj(16)));
                                }
                                zzakp zzakpVar2 = new zzakp(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzakpVar2.zzb != 0) {
                                    zzaktVar2.zzi = zzakpVar2;
                                    zzaktVar2.zzc.clear();
                                    zzaktVar2.zzd.clear();
                                    zzaktVar2.zze.clear();
                                    break;
                                } else if (zzakpVar != null) {
                                    if (zzakpVar.zza != zzakpVar2.zza) {
                                        zzaktVar2.zzi = zzakpVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzakp zzakpVar3 = zzaktVar2.zzi;
                            if (iZzj7 == zzaktVar2.zza && zzakpVar3 != null) {
                                int iZzj13 = zzefVar.zzj(8);
                                zzefVar.zzh(4);
                                boolean zZzi = zzefVar.zzi();
                                zzefVar.zzh(3);
                                int iZzj14 = zzefVar.zzj(16);
                                int iZzj15 = zzefVar.zzj(16);
                                int iZzj16 = zzefVar.zzj(3);
                                int iZzj17 = zzefVar.zzj(3);
                                zzefVar.zzh(2);
                                int iZzj18 = zzefVar.zzj(8);
                                int iZzj19 = zzefVar.zzj(8);
                                int iZzj20 = zzefVar.zzj(4);
                                int iZzj21 = zzefVar.zzj(2);
                                zzefVar.zzh(2);
                                int i18 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i18 > 0) {
                                    int iZzj22 = zzefVar.zzj(16);
                                    int iZzj23 = zzefVar.zzj(2);
                                    int iZzj24 = zzefVar.zzj(2);
                                    int iZzj25 = zzefVar.zzj(12);
                                    zzefVar.zzh(4);
                                    int iZzj26 = zzefVar.zzj(12);
                                    int i19 = i18 - 6;
                                    if (iZzj23 == 1) {
                                        i18 -= 8;
                                        iZzj = zzefVar.zzj(8);
                                        iZzj2 = zzefVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i18 -= 8;
                                        iZzj = zzefVar.zzj(8);
                                        iZzj2 = zzefVar.zzj(8);
                                    } else {
                                        i18 = i19;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzaks(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzakr zzakrVar2 = new zzakr(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzakpVar3.zzb == 0 && (zzakrVar = (zzakr) zzaktVar2.zzc.get(zzakrVar2.zza)) != null) {
                                    int i20 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzakrVar.zzj;
                                        if (i20 < sparseArray3.size()) {
                                            zzakrVar2.zzj.put(sparseArray3.keyAt(i20), (zzaks) sparseArray3.valueAt(i20));
                                            i20++;
                                        }
                                    }
                                }
                                zzaktVar2.zzc.put(zzakrVar2.zza, zzakrVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzaktVar2.zza) {
                                zzakm zzakmVarZzb = zzb(zzefVar, iZzj8);
                                zzaktVar2.zzd.put(zzakmVarZzb.zza, zzakmVarZzb);
                                break;
                            } else if (iZzj7 == zzaktVar2.zzb) {
                                zzakm zzakmVarZzb2 = zzb(zzefVar, iZzj8);
                                zzaktVar2.zzf.put(zzakmVarZzb2.zza, zzakmVarZzb2);
                                break;
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzaktVar2.zza) {
                                zzako zzakoVarZzc = zzc(zzefVar);
                                zzaktVar2.zze.put(zzakoVarZzc.zza, zzakoVarZzc);
                                break;
                            } else if (iZzj7 == zzaktVar2.zzb) {
                                zzako zzakoVarZzc2 = zzc(zzefVar);
                                zzaktVar2.zzg.put(zzakoVarZzc2.zza, zzakoVarZzc2);
                                break;
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzaktVar2.zza) {
                                zzefVar.zzh(4);
                                boolean zZzi2 = zzefVar.zzi();
                                zzefVar.zzh(3);
                                int iZzj27 = zzefVar.zzj(16);
                                int iZzj28 = zzefVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzefVar.zzj(16);
                                    iZzj3 = zzefVar.zzj(16);
                                    iZzj5 = zzefVar.zzj(16);
                                    iZzj4 = zzefVar.zzj(16);
                                    i16 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i16 = 0;
                                    iZzj5 = 0;
                                }
                                zzaktVar2.zzh = new zzakn(iZzj27, iZzj28, i16, iZzj3, iZzj5, iZzj4);
                                break;
                            }
                            break;
                    }
                    zzefVar.zzo(iZze - zzefVar.zze());
                }
            }
        }
        zzakt zzaktVar3 = this.zzi;
        zzakp zzakpVar4 = zzaktVar3.zzi;
        if (zzakpVar4 == null) {
            zzakaVar = new zzaka(zzgpe.zzi(), C.TIME_UNSET, C.TIME_UNSET);
        } else {
            zzakn zzaknVar = zzaktVar3.zzh;
            if (zzaknVar == null) {
                zzaknVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzaknVar.zza + 1 != bitmap.getWidth() || zzaknVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzaknVar.zza + 1, zzaknVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakpVar4.zzc;
            int i21 = 0;
            while (i21 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzakq zzakqVar = (zzakq) sparseArray4.valueAt(i21);
                zzakr zzakrVar3 = (zzakr) zzaktVar3.zzc.get(sparseArray4.keyAt(i21));
                int i22 = zzakqVar.zza + zzaknVar.zzc;
                int i23 = zzakqVar.zzb + zzaknVar.zze;
                int i24 = zzakrVar3.zzc;
                int i25 = i22 + i24;
                boolean z11 = z10;
                int iMin = Math.min(i25, zzaknVar.zzd);
                int i26 = zzakrVar3.zzd;
                int i27 = i23 + i26;
                canvas3.clipRect(i22, i23, iMin, Math.min(i27, zzaknVar.zzf));
                int i28 = zzakrVar3.zzf;
                zzakm zzakmVar = (zzakm) zzaktVar3.zzd.get(i28);
                if (zzakmVar == null && (zzakmVar = (zzakm) zzaktVar3.zzf.get(i28)) == null) {
                    zzakmVar = this.zzh;
                }
                SparseArray sparseArray5 = zzakrVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i29 = i21;
                int i30 = 0;
                while (i30 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i30);
                    int i31 = i30;
                    zzaks zzaksVar = (zzaks) sparseArray5.valueAt(i30);
                    SparseArray sparseArray7 = sparseArray5;
                    zzako zzakoVar = (zzako) zzaktVar3.zze.get(iKeyAt);
                    if (zzakoVar == null) {
                        zzakoVar = (zzako) zzaktVar3.zzg.get(iKeyAt);
                    }
                    if (zzakoVar != null) {
                        Paint paint = zzakoVar.zzb ? null : this.zzd;
                        i14 = i24;
                        int i32 = zzakrVar3.zze;
                        zzaktVar = zzaktVar3;
                        int i33 = zzaksVar.zza + i22;
                        int i34 = i23 + zzaksVar.zzb;
                        canvas2 = canvas3;
                        i13 = i22;
                        int[] iArr = i32 == 3 ? zzakmVar.zzd : i32 == 2 ? zzakmVar.zzc : zzakmVar.zzb;
                        i15 = i25;
                        zzh(zzakoVar.zzc, iArr, i32, i33, i34, paint, canvas2);
                        zzh(zzakoVar.zzd, iArr, i32, i33, i34 + 1, paint, canvas2);
                    } else {
                        zzaktVar = zzaktVar3;
                        canvas2 = canvas3;
                        i13 = i22;
                        i14 = i24;
                        i15 = i25;
                    }
                    i22 = i13;
                    i25 = i15;
                    i30 = i31 + 1;
                    i24 = i14;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzaktVar3 = zzaktVar;
                }
                zzakt zzaktVar4 = zzaktVar3;
                Canvas canvas4 = canvas3;
                int i35 = i22;
                int i36 = i24;
                int i37 = i25;
                float f10 = i23;
                float f11 = i35;
                if (zzakrVar3.zzb) {
                    int i38 = zzakrVar3.zze;
                    if (i38 == 3) {
                        i12 = zzakmVar.zzd[zzakrVar3.zzg];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i38 == 2 ? zzakmVar.zzc[zzakrVar3.zzh] : zzakmVar.zzb[zzakrVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i12);
                    float f12 = i37;
                    c11 = c12;
                    c10 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f11, f10, f12, i27, paint2);
                } else {
                    canvas = canvas4;
                    c10 = 3;
                    c11 = 2;
                }
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(Bitmap.createBitmap(this.zzj, i35, i23, i36, i26));
                float f13 = zzaknVar.zza;
                zzclVar.zzi(f11 / f13);
                zzclVar.zzj(0);
                float f14 = zzaknVar.zzb;
                zzclVar.zzf(f10 / f14, 0);
                zzclVar.zzg(0);
                zzclVar.zzm(i36 / f13);
                zzclVar.zzn(i26 / f14);
                arrayList.add(zzclVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i21 = i29 + 1;
                z10 = z11;
                zzaktVar3 = zzaktVar4;
                sparseArray4 = sparseArray6;
            }
            zzakaVar = new zzaka(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        zzdgVar.zza(zzakaVar);
    }
}
