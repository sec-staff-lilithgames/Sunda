package io.ktor.utils.io.core;

import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StringsJVMKt {
    public static final String String(byte[] bytes, int i10, int i11, Charset charset) {
        e0.checkNotNullParameter(bytes, "bytes");
        e0.checkNotNullParameter(charset, "charset");
        return new String(bytes, i10, i11, charset);
    }

    public static /* synthetic */ String String$default(byte[] bytes, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bytes.length;
        }
        if ((i12 & 8) != 0) {
            charset = g.f86134b;
        }
        e0.checkNotNullParameter(bytes, "bytes");
        e0.checkNotNullParameter(charset, "charset");
        return new String(bytes, i10, i11, charset);
    }

    public static final void getCharsInternal(String str, char[] dst, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        str.getChars(0, str.length(), dst, i10);
    }
}
