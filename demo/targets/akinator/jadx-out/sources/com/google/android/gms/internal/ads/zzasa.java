package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzasa implements zzasu {
    public static final /* synthetic */ zzasa zza;
    public static final /* synthetic */ zzasa zzb;
    public static final /* synthetic */ zzasa zzc;
    public static final /* synthetic */ zzasa zzd;
    public static final /* synthetic */ zzasa zze;
    public static final /* synthetic */ zzasa zzf;
    public static final /* synthetic */ zzasa zzg;
    public static final /* synthetic */ zzasa zzh;
    public static final /* synthetic */ zzasa zzi;
    public static final /* synthetic */ zzasa zzj;
    public static final /* synthetic */ zzasa zzk;
    public static final /* synthetic */ zzasa zzl;
    public static final /* synthetic */ zzasa zzm;
    public static final /* synthetic */ zzasa zzn;
    public static final /* synthetic */ zzasa zzo;
    public static final /* synthetic */ zzasa zzp;
    public static final /* synthetic */ zzasa zzq;
    public static final /* synthetic */ zzasa zzr;
    public static final /* synthetic */ zzasa zzs;
    public static final /* synthetic */ zzasa zzt;
    public static final /* synthetic */ zzasa zzu;
    private final /* synthetic */ int zzv;

    static {
        int i10 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i11 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i12 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i13 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i14 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i15 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i16 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzasa((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzasa((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzasa((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzasa(i16);
        zzq = new zzasa(i13);
        zzp = new zzasa(i14);
        zzasa zzasaVar = new zzasa(i15);
        int i17 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i18 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i19 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i20 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i21 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i22 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i23 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i24 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i25 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzasaVar;
        zzn = new zzasa(i12);
        zzm = new zzasa(i17);
        zzl = new zzasa(i18);
        zzk = new zzasa(i19);
        zzj = new zzasa(i11);
        zzi = new zzasa(i20);
        zzh = new zzasa(i21);
        zzg = new zzasa(i22);
        zzf = new zzasa(i10);
        zze = new zzasa(i23);
        zzd = new zzasa(i24);
        zzc = new zzasa(i25);
        zzb = new zzasa(1);
        zza = new zzasa(0);
    }

    private /* synthetic */ zzasa(int i10) {
        this.zzv = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) throws zzata {
        zzarm zzarmVar;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzasx zzasxVar = (zzasx) obj;
                                                zzast zzastVar = zzasxVar.zzb;
                                                long jZzm = zzastVar.zzc().zzm();
                                                if (zzastVar.zzc().zzm() != 0) {
                                                    zzasxVar.zzd.zza(jZzm);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzast zzastVar2 = ((zzasx) obj).zzb;
                                                    long jZzm2 = zzastVar2.zzc().zzm();
                                                    zzatc zzatcVarZzc = zzastVar2.zzc();
                                                    zzatc zzatcVarZzc2 = zzastVar2.zzc();
                                                    List listZzo = zzatcVarZzc2.zzo();
                                                    if (jZzm2 < 0) {
                                                        jZzm2 += listZzo.size() + 1;
                                                    }
                                                    if (jZzm2 < 0 || jZzm2 >= listZzo.size() + 1) {
                                                        throw new zzata();
                                                    }
                                                    listZzo.add((int) jZzm2, zzatcVarZzc);
                                                    zzastVar2.zzb(zzatcVarZzc2);
                                                    return Optional.empty();
                                                } catch (zzata unused) {
                                                    zzarmVar = zzarm.zzI;
                                                    break;
                                                }
                                            case 2:
                                                zzasx zzasxVar2 = (zzasx) obj;
                                                zzast zzastVar3 = zzasxVar2.zzb;
                                                long jZzm3 = zzastVar3.zzc().zzm();
                                                if (zzastVar3.zzc().zzm() == 0) {
                                                    zzasxVar2.zzd.zza(jZzm3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((zzasx) obj).zzb.zzb(zzatc.zzb(r0.zzc().zzo().size()));
                                                return Optional.empty();
                                            case 4:
                                                ((zzasx) obj).zzb.zzb(zzatc.zzb(r0.zzc().zzn().zza.length));
                                                return Optional.empty();
                                            case 5:
                                                zzast zzastVar4 = ((zzasx) obj).zzb;
                                                zzastVar4.zzb(zzatc.zzc(Math.log(zzastVar4.zzc().zzq())));
                                                return Optional.empty();
                                            case 6:
                                                zzast zzastVar5 = ((zzasx) obj).zzb;
                                                long jZzm4 = zzastVar5.zzc().zzm();
                                                long jZzm5 = zzastVar5.zzc().zzm();
                                                if (jZzm4 == 0 || jZzm5 == 0) {
                                                    j10 = 0;
                                                }
                                                zzastVar5.zzb(zzatc.zzb(j10));
                                                return Optional.empty();
                                            case 7:
                                                zzast zzastVar6 = ((zzasx) obj).zzb;
                                                if (zzastVar6.zzc().zzm() != 0) {
                                                    j10 = 0;
                                                }
                                                zzastVar6.zzb(zzatc.zzb(j10));
                                                return Optional.empty();
                                            case 8:
                                                zzast zzastVar7 = ((zzasx) obj).zzb;
                                                long jZzm6 = zzastVar7.zzc().zzm();
                                                long jZzm7 = zzastVar7.zzc().zzm();
                                                if (jZzm6 == 0 && jZzm7 == 0) {
                                                    j10 = 0;
                                                }
                                                zzastVar7.zzb(zzatc.zzb(j10));
                                                return Optional.empty();
                                            case 9:
                                                zzasx zzasxVar3 = (zzasx) obj;
                                                zzast zzastVar8 = zzasxVar3.zzb;
                                                try {
                                                    int iCompare = new zzasy(false).compare(zzastVar8.zzc(), zzastVar8.zzc());
                                                    zzast zzastVar9 = zzasxVar3.zzb;
                                                    if (iCompare >= 0) {
                                                        j10 = 0;
                                                    }
                                                    zzastVar9.zzb(zzatc.zzb(j10));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzarm.zzd);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i10 = iArr[0];
                                                int i11 = iArr[1];
                                                int i12 = iArr[2];
                                                int i13 = iArr[3];
                                                int i14 = iArr[4];
                                                int i15 = iArr[5];
                                                int i16 = iArr[6];
                                                int i17 = iArr[7];
                                                int iY = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.y((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
                                                int i18 = i17 % 1677157265;
                                                zzasx zzasxVar4 = (zzasx) obj;
                                                try {
                                                    zzast zzastVar10 = zzasxVar4.zzb;
                                                    long jZzm8 = zzastVar10.zzc().zzm();
                                                    zzars zzarsVar = zzasxVar4.zza;
                                                    zzast zzastVar11 = new zzast(i18 ^ iY);
                                                    for (int i19 = 0; i19 < zzastVar10.zzb; i19++) {
                                                        try {
                                                            zzastVar11.zzb(zzatc.zzj((zzatc) zzastVar10.zza.get(i19)));
                                                        } catch (zzass e10) {
                                                            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e10);
                                                        }
                                                    }
                                                    zzasl zzaslVar = zzasxVar4.zzd;
                                                    new zzasx(zzarsVar, zzastVar11, new zzasl(zzaslVar.zzb, zzaslVar.zza, zzaslVar.zzc.zzc(), zzaslVar.zzd)).zzd.zza(jZzm8);
                                                    zzastVar10.zzb(zzatc.zza(new zzasc()));
                                                    return Optional.empty();
                                                } catch (zzasj | zzask unused3) {
                                                    zzarmVar = zzarm.zzt;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    zzast zzastVar12 = ((zzasx) obj).zzb;
                                                    zzastVar12.zzb(zzatc.zza(zzastVar12.zzc().zzi((Class) zzastVar12.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzasz unused4) {
                                                    zzarmVar = zzarm.zzp;
                                                    break;
                                                }
                                            case 12:
                                                zzast zzastVar13 = ((zzasx) obj).zzb;
                                                long jZzm9 = zzastVar13.zzc().zzm();
                                                long jZzm10 = zzastVar13.zzc().zzm();
                                                if (jZzm9 == 0) {
                                                    return Optional.of(zzarm.zzF);
                                                }
                                                zzastVar13.zzb(zzatc.zzb(jZzm10 % jZzm9));
                                                return Optional.empty();
                                            case 13:
                                                zzast zzastVar14 = ((zzasx) obj).zzb;
                                                zzastVar14.zzb(zzatc.zzc(zzastVar14.zzc().zzq() * zzastVar14.zzc().zzq()));
                                                return Optional.empty();
                                            case 14:
                                                zzast zzastVar15 = ((zzasx) obj).zzb;
                                                zzastVar15.zzb(zzatc.zzb(zzastVar15.zzc().zzm() * zzastVar15.zzc().zzm()));
                                                return Optional.empty();
                                            case 15:
                                                zzast zzastVar16 = ((zzasx) obj).zzb;
                                                long jZzm11 = zzastVar16.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j11 = 0; j11 < jZzm11; j11++) {
                                                    arrayList.add(zzastVar16.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzastVar16.zzb(zzatc.zze(arrayList));
                                                return Optional.empty();
                                            case 16:
                                                zzast zzastVar17 = ((zzasx) obj).zzb;
                                                zzastVar17.zzb(zzatc.zzc(Math.pow(zzastVar17.zzc().zzq(), zzastVar17.zzc().zzq())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzasx) obj).zzb.zzb(zzatc.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzasx zzasxVar5 = (zzasx) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzasxVar5.zzd.zzf((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).zza());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzasxVar5.zzb.zzb(zzatc.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzasx zzasxVar6 = (zzasx) obj;
                                                zzasxVar6.zzb.zzb(zzatc.zzb(zzasxVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                long j12 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j13 = 1246101662 % 372004513;
                                                long j14 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j15 = 1675644664 % 749217043;
                                                zzasx zzasxVar7 = (zzasx) obj;
                                                zzasl zzaslVar2 = zzasxVar7.zzd;
                                                long jZze = zzaslVar2.zze();
                                                if (jZze >= 0 && jZze <= (j12 ^ j13)) {
                                                    if (((j14 ^ j15) & jZze) != 0) {
                                                        return Optional.of(zzarm.zze);
                                                    }
                                                    zzasxVar7.zzb.zzb(zzatc.zzd(zzaslVar2.zzf(jZze)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(zzarm.zzz);
                                        }
                                    } catch (zzasr unused5) {
                                        zzarmVar = zzarm.zzx;
                                    }
                                } catch (zzass unused6) {
                                    zzarmVar = zzarm.zza;
                                }
                            } catch (zzask unused7) {
                                zzarmVar = zzarm.zzz;
                            }
                        } catch (zzasj e11) {
                            e = e11;
                            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzasz unused8) {
                        zzarmVar = zzarm.zzy;
                    }
                } catch (zzass e12) {
                    e = e12;
                    throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzasj | zzask unused9) {
                zzarmVar = zzarm.zzi;
            }
        } catch (zzasi unused10) {
            zzarmVar = zzarm.zzD;
        }
        return Optional.of(zzarmVar);
    }
}
