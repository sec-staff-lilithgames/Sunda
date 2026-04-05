package io.ktor.client.plugins.logging;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.logging.Logging;
import io.ktor.util.AttributeKey;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LoggingKt {
    private static final AttributeKey<HttpClientCallLogger> ClientCallLogger = new AttributeKey<>("CallLogger");
    private static final AttributeKey<x0> DisableLogging = new AttributeKey<>("DisableLogging");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.logging.LoggingKt$Logging$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(Logging.Config config) {
            e0.checkNotNullParameter(config, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Logging.Config) obj);
            return x0.f87415a;
        }
    }

    public static final void Logging(HttpClientConfig<?> httpClientConfig, l block) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        e0.checkNotNullParameter(block, "block");
        httpClientConfig.install(Logging.Companion, block);
    }

    public static /* synthetic */ void Logging$default(HttpClientConfig httpClientConfig, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        Logging(httpClientConfig, lVar);
    }
}
