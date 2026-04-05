package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzglw extends zzglt implements Serializable {
    private final Pattern zza;

    public zzglw(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzglt
    public final zzgls zza(CharSequence charSequence) {
        return new zzglv(this.zza.matcher(charSequence));
    }
}
