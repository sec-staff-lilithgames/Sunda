package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzasy implements Comparator {
    private final boolean zza;

    public zzasy(boolean z10) {
        this.zza = z10;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iY = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.y((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 496612959;
        zzatc zzatcVar = (zzatc) obj;
        zzatc zzatcVar2 = (zzatc) obj2;
        int i19 = zzatcVar.zza;
        if (i19 != zzatcVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i20 = i18 ^ iY;
        try {
            if (i19 == 0) {
                throw null;
            }
            switch (i19 + i20) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzatcVar.zzl() != zzatcVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzatcVar.zzm(), zzatcVar2.zzm());
                case 3:
                    comparatorZza = zzasg.zzc;
                    objZzn = zzatcVar.zzn();
                    objZzn2 = zzatcVar2.zzn();
                    break;
                case 4:
                    objZzn = zzatcVar.zzo();
                    objZzn2 = zzatcVar2.zzo();
                    comparatorZza = zzgoq.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzatcVar.zzp() != zzatcVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzatcVar.zzq(), zzatcVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzasz e10) {
            throw new AssertionError(zzase.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }
}
