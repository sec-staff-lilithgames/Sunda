package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzang {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzef r18, com.google.android.gms.internal.ads.zzane r19) throws com.google.android.gms.internal.ads.zzat {
        /*
            r0 = r18
            r1 = r19
            r0.zze()
            r2 = 3
            r3 = 8
            int r2 = zzf(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Ld1
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzgmd.zza(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = java.lang.Math.addExact(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            java.lang.Math.addExact(r14, r10)
            int r6 = r0.zzc()
            r10 = -1
            if (r6 >= r2) goto L46
        L44:
            r14 = r10
            goto L6f
        L46:
            long r14 = r0.zzk(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6f
            int r6 = r0.zzc()
            if (r6 >= r3) goto L55
            goto L44
        L55:
            long r14 = r0.zzk(r3)
            long r16 = r14 + r16
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r0.zzc()
            if (r3 >= r7) goto L66
            goto L44
        L66:
            long r6 = r0.zzk(r7)
            long r14 = r6 + r16
            goto L6f
        L6d:
            r14 = r16
        L6f:
            r1.zzb = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L76
            return r4
        L76:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lb1
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La3
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L9c
            if (r3 == r2) goto L95
            r2 = 17
            if (r3 == r2) goto L8e
            goto La3
        L8e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L95:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L9c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        La3:
            r2 = 11
            r3 = 24
            int r0 = zzf(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto Lb0
            return r9
        Lb0:
            return r4
        Lb1:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzc(r0)
            throw r0
        Ld1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zza(com.google.android.gms.internal.ads.zzef, com.google.android.gms.internal.ads.zzane):boolean");
    }

    public static zzanf zzb(zzef zzefVar) throws zzat {
        int iZzj;
        int i10;
        char c10;
        int i11;
        int i12;
        int iZzj2;
        char c11;
        int iZzj3 = zzefVar.zzj(8);
        int i13 = 5;
        int iZzj4 = zzefVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb2.append("Unsupported sampling rate index ");
                    sb2.append(iZzj4);
                    throw zzat.zzc(sb2.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzefVar.zzj(24);
        }
        int iZzj5 = zzefVar.zzj(3);
        int i14 = 1;
        if (iZzj5 == 0) {
            i10 = 768;
        } else if (iZzj5 == 1) {
            i10 = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i10 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(iZzj5, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            i10 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c10 = 0;
        } else if (iZzj5 == 2) {
            c10 = 2;
        } else if (iZzj5 == 3) {
            c10 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb4 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(iZzj5, 36));
                sb4.append("Unsupported coreSbrFrameLengthIndex ");
                sb4.append(iZzj5);
                throw zzat.zzc(sb4.toString());
            }
            c10 = 1;
        }
        zzefVar.zzh(2);
        zzc(zzefVar);
        int iZzj6 = zzefVar.zzj(5);
        int i15 = 0;
        int iZzf = 0;
        while (true) {
            int i16 = 16;
            if (i15 < iZzj6 + 1) {
                int iZzj7 = zzefVar.zzj(3);
                iZzf += zzf(zzefVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzefVar.zzi()) {
                    zzc(zzefVar);
                }
                i15++;
            } else {
                int iZzf2 = zzf(zzefVar, 4, 8, 16) + 1;
                zzefVar.zzg();
                int i17 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i17 >= iZzf2) {
                        int i18 = iZzj3;
                        byte[] bArr = null;
                        if (zzefVar.zzi()) {
                            int iZzf3 = zzf(zzefVar, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < iZzf3; i19++) {
                                int iZzf4 = zzf(zzefVar, 4, 8, 16);
                                int iZzf5 = zzf(zzefVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzefVar.zzj(4) + 1;
                                    zzefVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i20 = 0; i20 < iZzj8; i20++) {
                                        bArr2[i20] = (byte) zzefVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzefVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                StringBuilder sb5 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb5.append("Unsupported sampling rate ");
                                sb5.append(iZzj);
                                throw zzat.zzc(sb5.toString());
                        }
                        return new zzanf(i18, (int) (iZzj * d10), (int) (i10 * d10), bArr3, null);
                    }
                    int iZzj9 = zzefVar.zzj(2);
                    if (iZzj9 == 0) {
                        i11 = iZzj3;
                        i12 = i14;
                        zzd(zzefVar);
                        if (c10 > 0) {
                            zze(zzefVar);
                        }
                    } else if (iZzj9 == i14) {
                        i12 = i14;
                        if (zzd(zzefVar)) {
                            zzefVar.zzg();
                        }
                        if (c10 > 0) {
                            zze(zzefVar);
                            iZzj2 = zzefVar.zzj(2);
                            c11 = c10;
                        } else {
                            iZzj2 = 0;
                            c11 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzefVar.zzh(6);
                            int iZzj10 = zzefVar.zzj(2);
                            zzefVar.zzh(4);
                            if (zzefVar.zzi()) {
                                zzefVar.zzh(i13);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzefVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzefVar.zzg();
                            }
                        }
                        i11 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzefVar.zzj(2);
                        if (iZzj11 > 0 && zzefVar.zzi()) {
                            zzefVar.zzh(iFloor);
                        }
                        if (zzefVar.zzi()) {
                            zzefVar.zzh(iFloor);
                        }
                        if (c11 == 0 && iZzj11 == 0) {
                            zzefVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i11 = iZzj3;
                        i12 = i14;
                    } else {
                        zzf(zzefVar, 4, 8, i16);
                        int iZzf6 = zzf(zzefVar, 4, 8, i16);
                        i12 = i14;
                        if (zzefVar.zzi()) {
                            zzf(zzefVar, 8, i16, 0);
                        }
                        zzefVar.zzg();
                        if (iZzf6 > 0) {
                            zzefVar.zzh(iZzf6 * 8);
                        }
                        i11 = iZzj3;
                    }
                    i17++;
                    iZzj3 = i11;
                    i14 = i12;
                    i13 = 5;
                    i16 = 16;
                }
            }
        }
    }

    private static void zzc(zzef zzefVar) {
        int iZzj;
        int iZzj2 = zzefVar.zzj(2);
        if (iZzj2 == 0) {
            zzefVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzefVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzefVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzefVar.zzi();
            int i10 = true != zZzi ? 5 : 1;
            int i11 = true == zZzi ? 7 : 5;
            int i12 = true == zZzi ? 8 : 6;
            int i13 = 0;
            while (i13 < iZzf) {
                if (zzefVar.zzi()) {
                    zzefVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzefVar.zzj(2) == 3 && zzefVar.zzj(i11) * i10 != 0) {
                        zzefVar.zzg();
                    }
                    iZzj = zzefVar.zzj(i12) * i10;
                    if (iZzj != 0 && iZzj != 180) {
                        zzefVar.zzg();
                    }
                    zzefVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzefVar.zzi()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean zzd(zzef zzefVar) {
        zzefVar.zzh(3);
        boolean zZzi = zzefVar.zzi();
        if (zZzi) {
            zzefVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzef zzefVar) {
        zzefVar.zzh(3);
        zzefVar.zzh(8);
        boolean zZzi = zzefVar.zzi();
        boolean zZzi2 = zzefVar.zzi();
        if (zZzi) {
            zzefVar.zzh(5);
        }
        if (zZzi2) {
            zzefVar.zzh(6);
        }
    }

    private static int zzf(zzef zzefVar, int i10, int i11, int i12) {
        zzgmd.zza(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        Math.addExact(Math.addExact(i13, i14), 1 << i12);
        if (zzefVar.zzc() < i10) {
            return -1;
        }
        int iZzj = zzefVar.zzj(i10);
        if (iZzj == i13) {
            if (zzefVar.zzc() < i11) {
                return -1;
            }
            int iZzj2 = zzefVar.zzj(i11);
            iZzj += iZzj2;
            if (iZzj2 == i14) {
                if (zzefVar.zzc() < i12) {
                    return -1;
                }
                return zzefVar.zzj(i12) + iZzj;
            }
        }
        return iZzj;
    }
}
