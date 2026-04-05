package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbbz {
    private final int zza;
    private final zzbbw zzb = new zzbcb();

    public zzbbz(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbby zzbbyVar = new zzbby();
        int i11 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new zzbbx(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbca.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbcd.zza(strArrZzb, i11, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbyVar.zzb.write(this.zzb.zza(((zzbcc) it.next()).zzb));
            } catch (IOException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        return zzbbyVar.toString();
    }
}
