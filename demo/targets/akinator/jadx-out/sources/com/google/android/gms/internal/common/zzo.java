package com.google.android.gms.internal.common;

import a.b;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzo extends zzn {
    private final char zza;

    public zzo(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = AbstractJsonLexerKt.STRING_ESC;
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return b.l("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
