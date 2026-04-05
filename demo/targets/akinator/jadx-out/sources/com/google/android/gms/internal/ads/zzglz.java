package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzglz {
    private final String zza;
    private final zzgly zzb;
    private zzgly zzc;

    public /* synthetic */ zzglz(String str, byte[] bArr) {
        zzgly zzglyVar = new zzgly();
        this.zzb = zzglyVar;
        this.zzc = zzglyVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzgly zzglyVar = this.zzb.zzb;
        String str = "";
        while (zzglyVar != null) {
            Object obj = zzglyVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzglyVar = zzglyVar.zzb;
            str = ", ";
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final zzglz zza(Object obj) {
        zzgly zzglyVar = new zzgly();
        this.zzc.zzb = zzglyVar;
        this.zzc = zzglyVar;
        zzglyVar.zza = obj;
        return this;
    }
}
