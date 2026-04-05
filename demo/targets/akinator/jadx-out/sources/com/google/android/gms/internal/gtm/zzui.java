package com.google.android.gms.internal.gtm;

import a.b;
import com.ironsource.C3191e4;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzui {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzui(String str, Class cls, boolean z10) {
        this(str, cls, z10, true);
    }

    public static zzui zza(String str, Class cls) {
        return new zzui(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return o2.r(b.t(name, "/"), this.zza, C3191e4.i.f36529d, cls.getName(), C3191e4.i.f36531e);
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzui(String str, Class cls, boolean z10, boolean z11) {
        zzwe.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z10;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
