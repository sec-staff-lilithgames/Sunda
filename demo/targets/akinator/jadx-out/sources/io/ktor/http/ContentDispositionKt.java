package io.ktor.http;

import a.b;
import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ContentDispositionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodeContentDispositionAttribute(String str, String str2) {
        if (!e0.areEqual(str, ContentDisposition.Parameters.FileNameAsterisk) || k0.startsWith(str2, "utf-8''", true)) {
            return str2;
        }
        for (int i10 = 0; i10 < str2.length(); i10++) {
            if (!CodecsKt.getATTRIBUTE_CHARACTERS().contains(Character.valueOf(str2.charAt(i10)))) {
                return b.k("utf-8''", CodecsKt.percentEncode(str2, CodecsKt.getATTRIBUTE_CHARACTERS()));
            }
        }
        return str2;
    }
}
