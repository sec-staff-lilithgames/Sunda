package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzgb extends zzj {
    long zzb(zzgf zzgfVar) throws IOException;

    Uri zzc();

    void zzd() throws IOException;

    void zze(zzgz zzgzVar);

    default Map zzj() {
        return Collections.EMPTY_MAP;
    }
}
