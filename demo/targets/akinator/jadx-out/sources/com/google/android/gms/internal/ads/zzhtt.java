package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhtt extends zzhtv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhtt(zzhtu zzhtuVar) {
        super(zzhtuVar.zza);
        Objects.requireNonNull(zzhtuVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
