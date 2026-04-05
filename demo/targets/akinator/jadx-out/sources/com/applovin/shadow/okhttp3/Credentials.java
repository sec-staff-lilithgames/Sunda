package com.applovin.shadow.okhttp3;

import a.b;
import com.applovin.shadow.okio.ByteString;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password) {
        e0.checkNotNullParameter(username, "username");
        e0.checkNotNullParameter(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            e0.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    public static final String basic(String username, String password, Charset charset) {
        e0.checkNotNullParameter(username, "username");
        e0.checkNotNullParameter(password, "password");
        e0.checkNotNullParameter(charset, "charset");
        return b.k("Basic ", ByteString.Companion.encodeString(username + AbstractJsonLexerKt.COLON + password, charset).base64());
    }
}
