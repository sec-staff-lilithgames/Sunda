package io.ktor.client.statement;

import java.nio.charset.Charset;
import kv.p;
import tu.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CompatibilityKt {
    @f
    public static final Object readText(HttpResponse httpResponse, Charset charset, d<? super String> dVar) {
        throw new IllegalStateException("Use `bodyAsText` method instead");
    }

    public static /* synthetic */ Object readText$default(HttpResponse httpResponse, Charset charset, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return readText(httpResponse, charset, dVar);
    }

    @f
    public static final /* synthetic */ <T> Object receive(HttpStatement httpStatement, d<? super T> dVar) {
        throw new IllegalStateException("Use `body` method instead");
    }

    @f
    public static final /* synthetic */ <T, R> Object receive(HttpStatement httpStatement, p pVar, d<? super R> dVar) {
        throw new IllegalStateException("Use `body` method instead");
    }
}
