package io.ktor.client.plugins;

import bx.a;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Set;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRedirectKt {
    private static final Set<HttpMethod> ALLOWED_FOR_REDIRECT;
    private static final a LOGGER;

    static {
        HttpMethod.Companion companion = HttpMethod.Companion;
        ALLOWED_FOR_REDIRECT = c2.setOf((Object[]) new HttpMethod[]{companion.getGet(), companion.getHead()});
        LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRedirect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRedirect(HttpStatusCode httpStatusCode) {
        int value = httpStatusCode.getValue();
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        return value == companion.getMovedPermanently().getValue() || value == companion.getFound().getValue() || value == companion.getTemporaryRedirect().getValue() || value == companion.getPermanentRedirect().getValue() || value == companion.getSeeOther().getValue();
    }
}
