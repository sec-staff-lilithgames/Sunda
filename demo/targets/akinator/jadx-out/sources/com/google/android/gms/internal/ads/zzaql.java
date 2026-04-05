package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaql {
    protected static final Comparator zza = new zzaqk();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList(64);
    private int zzd = 0;

    public zzaql(int i10) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    public final synchronized byte[] zza(int i10) {
        int i11 = 0;
        while (true) {
            List list = this.zzc;
            if (i11 >= list.size()) {
                return new byte[i10];
            }
            byte[] bArr = (byte[]) list.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.zzd -= length;
                list.remove(i11);
                this.zzb.remove(bArr);
                return bArr;
            }
            i11++;
        }
    }

    public final synchronized void zzb(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                List list = this.zzc;
                int iBinarySearch = Collections.binarySearch(list, bArr, zza);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                list.add(iBinarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }
}
