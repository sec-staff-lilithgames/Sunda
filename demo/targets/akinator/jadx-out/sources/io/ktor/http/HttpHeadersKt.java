package io.ktor.http;

import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpHeadersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDelimiter(char c10) {
        return n0.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c10, false, 2, (Object) null);
    }
}
