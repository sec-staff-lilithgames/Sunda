package xv;

import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class w {
    public static final String basic(String username, String password) {
        kotlin.jvm.internal.e0.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.e0.checkNotNullParameter(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = sv.g.f86137e;
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String username, String password, Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.e0.checkNotNullParameter(password, "password");
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        return a.b.k("Basic ", pw.l.f81911f.encodeString(username + AbstractJsonLexerKt.COLON + password, charset).base64());
    }
}
