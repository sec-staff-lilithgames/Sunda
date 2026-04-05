package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzard extends zzies implements Closeable {
    static {
        zziez.zzb(zzard.class);
    }

    public zzard(zziet zzietVar, zzarc zzarcVar) throws IOException {
        zzd(zzietVar, zzietVar.zzb(), zzarcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzies
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzies, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
