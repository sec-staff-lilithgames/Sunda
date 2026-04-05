package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k4.h2;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfvn implements h2 {
    public static final zzfvn zza = new zzfvn();
    private static final zzfvk zzb;

    static {
        zzfvk zzfvkVarZzd = zzfvk.zzd();
        e0.checkNotNullExpressionValue(zzfvkVarZzd, "getDefaultInstance(...)");
        zzb = zzfvkVarZzd;
    }

    private zzfvn() {
    }

    @Override // k4.h2
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // k4.h2
    public final Object readFrom(InputStream inputStream, d dVar) {
        try {
            zzfvk zzfvkVarZzc = zzfvk.zzc(inputStream);
            e0.checkNotNull(zzfvkVarZzc);
            return zzfvkVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // k4.h2
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, d dVar) throws IOException {
        ((zzfvk) obj).zzaO(outputStream);
        return x0.f87415a;
    }
}
