package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzasd implements zzasu {
    public static final /* synthetic */ zzasd zza;
    public static final /* synthetic */ zzasd zzb;
    public static final /* synthetic */ zzasd zzc;
    public static final /* synthetic */ zzasd zzd;
    public static final /* synthetic */ zzasd zze;
    public static final /* synthetic */ zzasd zzf;
    public static final /* synthetic */ zzasd zzg;
    public static final /* synthetic */ zzasd zzh;
    public static final /* synthetic */ zzasd zzi;
    public static final /* synthetic */ zzasd zzj;
    public static final /* synthetic */ zzasd zzk;
    public static final /* synthetic */ zzasd zzl;
    public static final /* synthetic */ zzasd zzm;
    public static final /* synthetic */ zzasd zzn;
    public static final /* synthetic */ zzasd zzo;
    public static final /* synthetic */ zzasd zzp;
    private final /* synthetic */ int zzq;

    static {
        int i10 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i11 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i12 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i13 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i14 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i15 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i16 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i17 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i18 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i19 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i20 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i21 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzasd((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzasd((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzasd(i21);
        zzm = new zzasd(i12);
        zzl = new zzasd(i13);
        zzk = new zzasd(i14);
        zzj = new zzasd(i11);
        zzi = new zzasd(i15);
        zzh = new zzasd(i16);
        zzg = new zzasd(i17);
        zzf = new zzasd(i10);
        zze = new zzasd(i18);
        zzd = new zzasd(i19);
        zzc = new zzasd(i20);
        zzb = new zzasd(1);
        zza = new zzasd(0);
    }

    private /* synthetic */ zzasd(int i10) {
        this.zzq = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) throws zzata {
        zzarm zzarmVar;
        zzatc zzatcVarZzc;
        int i10 = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i11 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzasx) obj).zza();
                                case 1:
                                    try {
                                        zzast zzastVar = ((zzasx) obj).zzb;
                                        long jZzm = zzastVar.zzc().zzm();
                                        zzatc zzatcVarZzc2 = zzastVar.zzc();
                                        List listZzo = zzatcVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzata();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzastVar.zzb(zzatcVarZzc2);
                                        return Optional.empty();
                                    } catch (zzata unused) {
                                        zzarmVar = zzarm.zzI;
                                        break;
                                    }
                                    break;
                                case 2:
                                    zzasx zzasxVar = (zzasx) obj;
                                    zzast zzastVar2 = zzasxVar.zzb;
                                    zzatc zzatcVarZzc3 = zzastVar2.zzc();
                                    zzasg zzasgVarZzn = zzastVar2.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzatcVarZzc3.zzk(byteArrayOutputStream);
                                    zzasxVar.zzb.zzb(zzatc.zzd(zzasgVarZzn.zzd(zzasg.zze(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzasx zzasxVar2 = (zzasx) obj;
                                    zzast zzastVar3 = zzasxVar2.zzb;
                                    zzatc zzatcVarZzc4 = zzastVar3.zzc();
                                    zzasg zzasgVarZzn2 = zzastVar3.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzasc.zzb(zzatcVarZzc4.zzm(), new zzatb(byteArrayOutputStream2, i10 ^ i11), false);
                                    zzasxVar2.zzb.zzb(zzatc.zzd(zzasgVarZzn2.zzd(zzasg.zze(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzasx zzasxVar3 = (zzasx) obj;
                                    zzasxVar3.zzb.zze(-(zzasxVar3.zzc.zzb().zzb + zzasxVar3.zzd.zze()), zzasxVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzast zzastVar4 = ((zzasx) obj).zzb;
                                    zzastVar4.zzb(zzatc.zzb(zzastVar4.zzc().zzm() << ((int) zzastVar4.zzc().zzm())));
                                    return Optional.empty();
                                case 6:
                                    zzast zzastVar5 = ((zzasx) obj).zzb;
                                    zzastVar5.zzb(zzatc.zzb(zzastVar5.zzc().zzm() >>> ((int) zzastVar5.zzc().zzm())));
                                    return Optional.empty();
                                case 7:
                                    zzast zzastVar6 = ((zzasx) obj).zzb;
                                    zzastVar6.zzb(zzatc.zzc(zzastVar6.zzc().zzq() - zzastVar6.zzc().zzq()));
                                    return Optional.empty();
                                case 8:
                                    zzast zzastVar7 = ((zzasx) obj).zzb;
                                    zzastVar7.zzb(zzatc.zzb(zzastVar7.zzc().zzm() - zzastVar7.zzc().zzm()));
                                    return Optional.empty();
                                case 9:
                                    zzasx zzasxVar4 = (zzasx) obj;
                                    zzast zzastVar8 = zzasxVar4.zzb;
                                    long jZzm2 = zzastVar8.zzc().zzm();
                                    zzatc zzatcVarZzc5 = zzastVar8.zzc();
                                    zzast zzastVar9 = zzasxVar4.zzb;
                                    zzatc zzatcVarZzd = zzastVar9.zzd(jZzm2);
                                    zzastVar9.zze(jZzm2, zzatcVarZzc5);
                                    zzastVar9.zzb(zzatcVarZzd);
                                    return Optional.empty();
                                case 10:
                                    zzasx zzasxVar5 = (zzasx) obj;
                                    zzast zzastVar10 = zzasxVar5.zzb;
                                    long jZzm3 = zzasxVar5.zzc.zzb().zzb + zzastVar10.zzc().zzm();
                                    zzatc zzatcVarZzc6 = zzastVar10.zzc();
                                    zzast zzastVar11 = zzasxVar5.zzb;
                                    long j10 = -jZzm3;
                                    zzatc zzatcVarZzd2 = zzastVar11.zzd(j10);
                                    zzastVar11.zze(j10, zzatcVarZzc6);
                                    zzastVar11.zzb(zzatcVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzasx zzasxVar6 = (zzasx) obj;
                                    long jZze = zzasxVar6.zzc.zzb().zzb + zzasxVar6.zzd.zze();
                                    zzatc zzatcVarZzc7 = zzasxVar6.zzb.zzc();
                                    zzast zzastVar12 = zzasxVar6.zzb;
                                    long j11 = -jZze;
                                    zzatc zzatcVarZzd3 = zzastVar12.zzd(j11);
                                    zzastVar12.zze(j11, zzatcVarZzc7);
                                    zzastVar12.zzb(zzatcVarZzd3);
                                    return Optional.empty();
                                case 12:
                                    zzasx zzasxVar7 = (zzasx) obj;
                                    long jZzm4 = zzasxVar7.zzb.zzc().zzm();
                                    try {
                                        zzast zzastVar13 = zzasxVar7.zzb;
                                        int i12 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i13 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzatcVarZzc = zzastVar13.zzc();
                                        } else {
                                            int iZza = zzastVar13.zza(jZzm4);
                                            zzastVar13.zzb += i12 ^ i13;
                                            zzatcVarZzc = (zzatc) zzastVar13.zza.remove(iZza);
                                        }
                                        zzastVar13.zzb(zzatcVarZzc);
                                        return Optional.empty();
                                    } catch (zzasr unused2) {
                                        zzarmVar = zzarm.zzg;
                                        break;
                                    }
                                case 13:
                                    zzasx zzasxVar8 = (zzasx) obj;
                                    try {
                                        zzast zzastVar14 = zzasxVar8.zzb;
                                        long jZzm5 = zzastVar14.zzc().zzm();
                                        long jZzm6 = zzastVar14.zzc().zzm();
                                        zzasq zzasqVar = zzasxVar8.zzc;
                                        zzasl zzaslVar = zzasxVar8.zzd;
                                        zzasqVar.zza(zzaslVar.zzb(), jZzm6, zzasqVar.zzb().zzb);
                                        zzaslVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzasj | zzask unused3) {
                                        zzarmVar = zzarm.zzr;
                                        break;
                                    } catch (zzaso unused4) {
                                        zzarmVar = zzarm.zzB;
                                        break;
                                    } catch (zzasp unused5) {
                                        zzarmVar = zzarm.zzw;
                                        break;
                                    }
                                case 14:
                                    zzasx zzasxVar9 = (zzasx) obj;
                                    try {
                                        zzasxVar9.zzb.zzb(zzatc.zzg(zzasxVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzasz unused6) {
                                        zzarmVar = zzarm.zzp;
                                        break;
                                    }
                                default:
                                    try {
                                        zzast zzastVar15 = ((zzasx) obj).zzb;
                                        Iterator it = zzastVar15.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzastVar15.zzb((zzatc) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzass unused7) {
                                        zzarmVar = zzarm.zza;
                                        break;
                                    }
                            }
                        } catch (zzasi | zzask | zzasz unused8) {
                            zzarmVar = zzarm.zzy;
                        }
                    } catch (zzasr unused9) {
                        zzarmVar = zzarm.zzh;
                    }
                } catch (zzass e10) {
                    e = e10;
                    throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzasp | zzasr unused10) {
                zzarmVar = zzarm.zzx;
            }
        } catch (zzasz unused11) {
            zzarmVar = zzarm.zzk;
        } catch (IOException e11) {
            e = e11;
            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzarmVar);
    }
}
