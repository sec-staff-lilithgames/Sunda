package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzalf {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzall zzf;
    public final String zzg;
    public final String zzh;
    public final zzalf zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalf(String str, String str2, long j10, long j11, zzall zzallVar, String[] strArr, String str3, String str4, zzalf zzalfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzallVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j10;
        this.zze = j11;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalfVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalf zza(String str) {
        return new zzalf(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static zzalf zzb(String str, long j10, long j11, zzall zzallVar, String[] strArr, String str2, String str3, zzalf zzalfVar) {
        return new zzalf(str, null, j10, j11, zzallVar, strArr, str2, str3, zzalfVar);
    }

    private final void zzi(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z10 || zEquals || (zEquals2 && this.zzh != null)) {
            long j10 = this.zzd;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.zze;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzalf zzalfVar = (zzalf) this.zzm.get(i10);
                boolean z11 = true;
                if (!z10 && !zEquals) {
                    z11 = false;
                }
                zzalfVar.zzi(treeSet, z11);
            }
        }
    }

    private final void zzj(long j10, String str, List list) {
        String str2;
        String str3 = this.zzg;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (zzc(j10) && TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zzf(); i10++) {
            zze(i10).zzj(j10, str, list);
        }
    }

    private final void zzk(long j10, boolean z10, String str, Map map) {
        long j11;
        boolean z11;
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z10) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z10) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcl) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < zzf(); i10++) {
                zzalf zzalfVarZze = zze(i10);
                if (z10 || zEquals) {
                    j11 = j10;
                    z11 = true;
                } else {
                    j11 = j10;
                    z11 = false;
                }
                zzalfVarZze.zzk(j11, z11, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcl) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcl zzclVar = new zzcl();
            zzclVar.zza(new SpannableStringBuilder());
            map.put(str, zzclVar);
        }
        CharSequence charSequenceZzb = ((zzcl) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    private final void zzm(long j10, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzalf zzalfVar;
        zzall zzallVarZza;
        int i10;
        boolean z10;
        int i11;
        Map map4 = map;
        if (zzc(j10)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcl zzclVar = (zzcl) map3.get(str4);
                    zzclVar.getClass();
                    zzalj zzaljVar = (zzalj) map2.get(str3);
                    zzaljVar.getClass();
                    int i12 = zzaljVar.zzj;
                    zzall zzallVarZza2 = zzalk.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzclVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzclVar.zza(spannableStringBuilder);
                    }
                    if (zzallVarZza2 != null) {
                        zzalf zzalfVar2 = this.zzi;
                        if (zzallVarZza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzallVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzl()) {
                            zzcs.zza(spannableStringBuilder, new ForegroundColorSpan(zzallVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzo()) {
                            zzcs.zza(spannableStringBuilder, new BackgroundColorSpan(zzallVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzh() != null) {
                            zzcs.zza(spannableStringBuilder, new TypefaceSpan(zzallVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzE() != null) {
                            zzale zzaleVarZzE = zzallVarZza2.zzE();
                            zzaleVarZzE.getClass();
                            int i13 = zzaleVarZzE.zza;
                            it = it2;
                            if (i13 == -1) {
                                i13 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = zzaleVarZzE.zzb;
                            }
                            int i14 = zzaleVarZzE.zzc;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            zzcs.zza(spannableStringBuilder, new zzct(i13, i11, i14), iIntValue, iIntValue2, 33);
                        } else {
                            it = it2;
                        }
                        int iZzv = zzallVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzalfVar2 == null) {
                                    zzalfVar2 = null;
                                    break;
                                }
                                zzall zzallVarZza3 = zzalk.zza(zzalfVar2.zzf, zzalfVar2.zzj, map4);
                                if (zzallVarZza3 != null && zzallVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzalfVar2 = zzalfVar2.zzi;
                                }
                            }
                            if (zzalfVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalfVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalfVar = null;
                                        break;
                                    }
                                    zzalf zzalfVar3 = (zzalf) arrayDeque.pop();
                                    zzall zzallVarZza4 = zzalk.zza(zzalfVar3.zzf, zzalfVar3.zzj, map4);
                                    if (zzallVarZza4 != null && zzallVarZza4.zzv() == 3) {
                                        zzalfVar = zzalfVar3;
                                        break;
                                    }
                                    for (int iZzf = zzalfVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzalfVar3.zze(iZzf));
                                    }
                                }
                                if (zzalfVar != null) {
                                    if (zzalfVar.zzf() != 1 || zzalfVar.zze(0).zzb == null) {
                                        zzdt.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzalfVar.zze(0).zzb;
                                        String str6 = zzep.zza;
                                        zzall zzallVarZza5 = zzalk.zza(zzalfVar.zzf, zzalfVar.zzj, map4);
                                        int iZzx = zzallVarZza5 != null ? zzallVarZza5.zzx() : -1;
                                        if (iZzx == -1 && (zzallVarZza = zzalk.zza(zzalfVar2.zzf, zzalfVar2.zzj, map4)) != null) {
                                            iZzx = zzallVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzcr(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzald(), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzC()) {
                            i10 = 33;
                            zzcs.zza(spannableStringBuilder, new zzcq(), iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        int iZzI = zzallVarZza2.zzI();
                        if (iZzI != 1) {
                            if (iZzI == 2) {
                                zzcs.zza(spannableStringBuilder, new RelativeSizeSpan(zzallVarZza2.zzJ()), iIntValue, iIntValue2, i10);
                            } else if (iZzI == 3) {
                                zzcs.zzb(spannableStringBuilder, zzallVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, i10);
                            }
                            z10 = true;
                        } else {
                            z10 = true;
                            zzcs.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzallVarZza2.zzJ(), true), iIntValue, iIntValue2, i10);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzallVarZza2.zzq() != Float.MAX_VALUE) {
                                zzclVar.zzp((zzallVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzallVarZza2.zzy() != null) {
                                zzclVar.zzd(zzallVarZza2.zzy());
                            }
                            if (zzallVarZza2.zzA() != null) {
                                zzclVar.zze(zzallVarZza2.zzA());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i15 = 0;
            while (i15 < zzf()) {
                zze(i15).zzm(j10, map4, map2, str3, map3);
                i15++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j10) {
        long j11 = this.zzd;
        if (j11 == C.TIME_UNSET) {
            if (this.zze == C.TIME_UNSET) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && this.zze == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= this.zze) {
            return j11 <= j10 && j10 < this.zze;
        }
        return true;
    }

    public final void zzd(zzalf zzalfVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalfVar);
    }

    public final zzalf zze(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzalf) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final List zzh(long j10, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j10, false, str, treeMap);
        zzm(j10, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzalj zzaljVar = (zzalj) map2.get(pair.first);
                zzaljVar.getClass();
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(bitmapDecodeByteArray);
                zzclVar.zzi(zzaljVar.zzb);
                zzclVar.zzj(0);
                zzclVar.zzf(zzaljVar.zzc, 0);
                zzclVar.zzg(zzaljVar.zze);
                zzclVar.zzm(zzaljVar.zzf);
                zzclVar.zzn(zzaljVar.zzg);
                zzclVar.zzo(zzaljVar.zzj);
                arrayList2.add(zzclVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalj zzaljVar2 = (zzalj) map2.get(entry.getKey());
            zzaljVar2.getClass();
            zzcl zzclVar2 = (zzcl) entry.getValue();
            CharSequence charSequenceZzb = zzclVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzald zzaldVar : (zzald[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzald.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaldVar), spannableStringBuilder.getSpanEnd(zzaldVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzclVar2.zzf(zzaljVar2.zzc, zzaljVar2.zzd);
            zzclVar2.zzg(zzaljVar2.zze);
            zzclVar2.zzi(zzaljVar2.zzb);
            zzclVar2.zzm(zzaljVar2.zzf);
            zzclVar2.zzl(zzaljVar2.zzi, zzaljVar2.zzh);
            zzclVar2.zzo(zzaljVar2.zzj);
            arrayList2.add(zzclVar2.zzr());
        }
        return arrayList2;
    }
}
