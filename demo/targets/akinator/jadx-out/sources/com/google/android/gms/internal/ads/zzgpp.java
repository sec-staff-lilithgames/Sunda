package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgpp extends zzgpk {
    public final zzgpp zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
            boolean z10 = true;
            while (it.hasNext()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z10 = false;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgoz zzgozVarZzs = (zzgoz) zza().get(obj);
            if (zzgozVarZzs == null) {
                zzgozVarZzs = zzgpo.zzs(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                zza().put(obj, zzgozVarZzs);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgoc.zza(obj, next);
                zzgozVarZzs.zzd(next);
            }
        }
        return this;
    }

    public final zzgpr zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgou.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgou.zza;
        }
        zzgpg zzgpgVar = new zzgpg(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgpo zzgpoVarZzo = zzgpo.zzo(((zzgpn) entry.getValue()).zzi());
            if (!zzgpoVarZzo.isEmpty()) {
                zzgpgVar.zza(key, zzgpoVarZzo);
                size += zzgpoVarZzo.size();
            }
        }
        return new zzgpr(zzgpgVar.zzc(), size, null);
    }
}
