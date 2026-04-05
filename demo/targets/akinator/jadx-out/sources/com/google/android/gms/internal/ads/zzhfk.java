package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhfk {
    private final Map zza = new HashMap();

    public final zzhfk zza(zzhsz zzhszVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzhszVar.zzd() != 0 && zzhszVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzhszVar)) {
            list = (List) map.get(zzhszVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzhszVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzhfm zzb() {
        return new zzhfm(this.zza, null);
    }
}
