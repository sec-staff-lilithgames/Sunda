package com.google.android.gms.internal.gtm;

import a.b;
import com.google.android.gms.internal.gtm.zzyg;
import com.google.android.gms.internal.gtm.zzyh;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzyh<MessageType extends zzyh<MessageType, BuilderType>, BuilderType extends zzyg<MessageType, BuilderType>> implements zzadl {
    protected int zzb = 0;

    public static void zzS(Iterable iterable, List list) {
        byte[] bArr = zzaco.zzb;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzadu) {
            ((zzadu) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String strK = o2.k(list.size() - size2, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(strK);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public int zzQ(zzadx zzadxVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzadl
    public final zzyx zzR() {
        try {
            int iZzY = zzY();
            zzyx zzyxVar = zzyx.zzb;
            byte[] bArr = new byte[iZzY];
            zzze zzzeVar = new zzze(bArr, 0, iZzY);
            zzax(zzzeVar);
            if (zzzeVar.zzb() == 0) {
                return new zzyv(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(b.l("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final void zzT(OutputStream outputStream) throws IOException {
        int iZzY = zzY();
        int i10 = zzzi.zzf;
        if (iZzY > 4096) {
            iZzY = 4096;
        }
        zzzg zzzgVar = new zzzg(outputStream, iZzY);
        zzax(zzzgVar);
        zzzgVar.zzI();
    }
}
