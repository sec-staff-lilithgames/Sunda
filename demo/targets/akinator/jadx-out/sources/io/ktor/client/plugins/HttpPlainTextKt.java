package io.ktor.client.plugins;

import bx.a;
import io.ktor.client.HttpClientConfig;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpPlainTextKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpPlainText");

    public static final void Charsets(HttpClientConfig<?> httpClientConfig, l block) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        e0.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpPlainText.Plugin, block);
    }
}
