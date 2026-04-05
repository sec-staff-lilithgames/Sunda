package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafp extends zzafr {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafp() {
        super(new zzacx());
        this.zzb = C.TIME_UNSET;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzeg zzegVar) {
        return Double.valueOf(Double.longBitsToDouble(zzegVar.zzD()));
    }

    private static String zzh(zzeg zzegVar) {
        int iZzt = zzegVar.zzt();
        int iZzg = zzegVar.zzg();
        zzegVar.zzk(iZzt);
        return new String(zzegVar.zzi(), iZzg, iZzt);
    }

    private static HashMap zzi(zzeg zzegVar) {
        int iZzH = zzegVar.zzH();
        HashMap map = new HashMap(iZzH);
        for (int i10 = 0; i10 < iZzH; i10++) {
            String strZzh = zzh(zzegVar);
            Object objZzj = zzj(zzegVar, zzegVar.zzs());
            if (objZzj != null) {
                map.put(strZzh, objZzj);
            }
        }
        return map;
    }

    private static Object zzj(zzeg zzegVar, int i10) {
        if (i10 == 0) {
            return zzg(zzegVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(zzegVar.zzs() == 1);
        }
        if (i10 == 2) {
            return zzh(zzegVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return zzi(zzegVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzegVar).doubleValue());
                zzegVar.zzk(2);
                return date;
            }
            int iZzH = zzegVar.zzH();
            ArrayList arrayList = new ArrayList(iZzH);
            for (int i11 = 0; i11 < iZzH; i11++) {
                Object objZzj = zzj(zzegVar, zzegVar.zzs());
                if (objZzj != null) {
                    arrayList.add(objZzj);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzh = zzh(zzegVar);
            int iZzs = zzegVar.zzs();
            if (iZzs == 9) {
                return map;
            }
            Object objZzj2 = zzj(zzegVar, iZzs);
            if (objZzj2 != null) {
                map.put(strZzh, objZzj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zza(zzeg zzegVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb(zzeg zzegVar, long j10) {
        if (zzegVar.zzs() == 2 && "onMetaData".equals(zzh(zzegVar)) && zzegVar.zzd() != 0 && zzegVar.zzs() == 8) {
            HashMap mapZzi = zzi(zzegVar);
            Object obj = mapZzi.get(IronSourceConstants.EVENTS_DURATION);
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }
}
