package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhdt extends zzhtn {
    public static final zzhtg zzb(zzhul zzhulVar) throws IOException {
        String strZzh;
        int iZzm = zzhulVar.zzm();
        zzhtg zzhtgVarZze = zze(zzhulVar, iZzm);
        if (zzhtgVarZze == null) {
            return zzd(zzhulVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzhulVar.zzf()) {
                if (zzhtgVarZze instanceof zzhti) {
                    strZzh = zzhulVar.zzh();
                    if (!zzhdv.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzhulVar.zzm();
                zzhtg zzhtgVarZze2 = zze(zzhulVar, iZzm2);
                zzhtg zzhtgVarZzd = zzhtgVarZze2 == null ? zzd(zzhulVar, iZzm2) : zzhtgVarZze2;
                if (zzhtgVarZze instanceof zzhtf) {
                    ((zzhtf) zzhtgVarZze).zza(zzhtgVarZzd);
                } else {
                    zzhti zzhtiVar = (zzhti) zzhtgVarZze;
                    if (zzhtiVar.zzc(strZzh)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                    zzhtiVar.zza(strZzh, zzhtgVarZzd);
                }
                if (zzhtgVarZze2 != null) {
                    arrayDeque.addLast(zzhtgVarZze);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzhtgVarZze = zzhtgVarZzd;
                } else {
                    continue;
                }
            } else {
                if (zzhtgVarZze instanceof zzhtf) {
                    zzhulVar.zzc();
                } else {
                    zzhulVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzhtgVarZze;
                }
                zzhtgVarZze = (zzhtg) arrayDeque.removeLast();
            }
        }
    }

    private static final zzhtg zzd(zzhul zzhulVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            String strZzi = zzhulVar.zzi();
            if (zzhdv.zza(strZzi)) {
                return new zzhtk(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i11 == 6) {
            return new zzhtk(new zzhdu(zzhulVar.zzi()));
        }
        if (i11 == 7) {
            return new zzhtk(Boolean.valueOf(zzhulVar.zzj()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzhum.zza(i10)));
        }
        zzhulVar.zzk();
        return zzhth.zza;
    }

    private static final zzhtg zze(zzhul zzhulVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzhulVar.zzb();
            return new zzhtf();
        }
        if (i11 != 2) {
            return null;
        }
        zzhulVar.zzd();
        return new zzhti();
    }

    @Override // com.google.android.gms.internal.ads.zzhtn
    public final /* bridge */ /* synthetic */ void zza(zzhun zzhunVar, Object obj) throws IOException {
        throw null;
    }
}
