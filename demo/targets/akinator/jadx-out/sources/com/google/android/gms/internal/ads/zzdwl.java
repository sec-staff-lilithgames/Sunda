package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwl {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:6:0x0015, B:15:0x0036, B:21:0x006d, B:23:0x0077, B:24:0x007f, B:25:0x0086, B:27:0x008c, B:28:0x0090, B:30:0x00a5, B:31:0x00ae, B:33:0x00b4, B:35:0x00c2, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00f2, B:44:0x00fa, B:48:0x010b, B:50:0x0113, B:52:0x0119, B:54:0x0122, B:55:0x012b, B:18:0x004a, B:19:0x005b), top: B:62:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zza(long r8, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwl.zza(long, int, long):void");
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziu)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzdwo) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() {
        /*
            r9 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzk()
            long r0 = r0.currentTimeMillis()
            java.util.Map r2 = r9.zza
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.zzdwo r4 = (com.google.android.gms.internal.ads.zzdwo) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.zzb()
            r5 = 0
            if (r4 == 0) goto L3b
            r7 = 1
            if (r4 == r7) goto L5f
            r7 = 2
            if (r4 == r7) goto L4e
            r7 = 3
            if (r4 == r7) goto L3d
        L3b:
            r7 = r5
            goto L6f
        L3d:
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zziz
            com.google.android.gms.internal.ads.zzbes r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L6f
        L4e:
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zziy
            com.google.android.gms.internal.ads.zzbes r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L6f
        L5f:
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zzix
            com.google.android.gms.internal.ads.zzbes r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L6f:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L77
            r2.remove()
            r7 = r5
        L77:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L12
            java.util.Iterator r4 = r3.iterator()
        L7f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L99
            r4.remove()
            goto L7f
        L99:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L12
            r2.remove()
            goto L12
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwl.zzc():void");
    }
}
