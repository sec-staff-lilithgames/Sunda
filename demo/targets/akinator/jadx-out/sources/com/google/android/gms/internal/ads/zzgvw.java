package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgvw {
    public static final zzhla zza(zzgwj zzgwjVar) {
        try {
            return ((zzhfx) zzhfb.zza().zzk(null, zzhfx.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzhgh("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(AbstractJsonLexerKt.NULL), e10);
        }
    }

    public static final zzgwj zzb(zzgwj zzgwjVar) throws GeneralSecurityException {
        return zzgwjVar != null ? zzgwjVar : zzgwp.zzb(zza(null).zzaN());
    }
}
