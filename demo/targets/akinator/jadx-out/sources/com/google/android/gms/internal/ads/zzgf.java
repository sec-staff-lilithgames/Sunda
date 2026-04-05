package com.google.android.gms.internal.ads;

import android.net.Uri;
import b0.e2;
import com.ironsource.C3191e4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgf {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzal.zzb("media3.datasource");
    }

    public /* synthetic */ zzgf(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j11, j12, null, i11, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j10 = this.zze;
        int length2 = String.valueOf(j10).length();
        long j11 = this.zzf;
        int length3 = String.valueOf(j11).length();
        int i10 = this.zzg;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i10).length() + 1);
        i.h(sb2, "DataSpec[GET ", string, ", ");
        sb2.append(j10);
        e2.A(sb2, ", ", j11, ", null, ");
        return a.b.f(i10, C3191e4.i.f36531e, sb2);
    }

    public final boolean zza(int i10) {
        return (this.zzg & i10) == i10;
    }

    public final zzge zzb() {
        return new zzge(this, null);
    }

    private zzgf(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        boolean z10 = false;
        boolean z11 = j11 >= 0;
        zzgmd.zza(z11);
        zzgmd.zza(z11);
        if (j12 > 0) {
            z10 = true;
        } else if (j12 == -1) {
            j12 = -1;
            z10 = true;
        }
        zzgmd.zza(z10);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j11;
        this.zzf = j12;
        this.zzg = i11;
    }

    @Deprecated
    public zzgf(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }
}
