package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrv extends zzgry {
    final char[] zza;

    private zzgrv(zzgru zzgruVar) {
        super(zzgruVar, null);
        this.zza = new char[512];
        zzgmd.zza(zzgruVar.zzf().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgruVar.zza(i10 >>> 4);
            this.zza[i10 | NotificationCompat.FLAG_LOCAL_ONLY] = zzgruVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgry, com.google.android.gms.internal.ads.zzgrz
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgmd.zzo(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgry, com.google.android.gms.internal.ads.zzgrz
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgrx {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgrx(o2.l(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            zzgru zzgruVar = this.zzb;
            bArr[i11] = (byte) (zzgruVar.zzc(charSequence.charAt(i10 + 1)) | (zzgruVar.zzc(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgry
    public final zzgrz zzc(zzgru zzgruVar, Character ch2) {
        return new zzgrv(zzgruVar);
    }

    public zzgrv(String str, String str2) {
        this(new zzgru("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
