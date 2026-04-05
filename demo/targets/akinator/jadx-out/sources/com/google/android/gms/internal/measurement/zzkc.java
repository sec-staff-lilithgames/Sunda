package com.google.android.gms.internal.measurement;

import android.util.Log;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkc extends zzkm {
    public zzkc(zzkg zzkgVar, String str, Long l9, boolean z10) {
        super(zzkgVar, str, l9, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", o2.r(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
        return null;
    }
}
