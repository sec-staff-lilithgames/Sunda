package io.ktor.client.plugins;

import bx.a;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.UserAgent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UserAgentKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.UserAgent");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.UserAgentKt$BrowserUserAgent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserAgent.Config) obj);
            return x0.f87415a;
        }

        public final void invoke(UserAgent.Config install) {
            e0.checkNotNullParameter(install, "$this$install");
            install.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.UserAgentKt$CurlUserAgent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38981 extends f0 implements l {
        public static final C38981 INSTANCE = new C38981();

        public C38981() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserAgent.Config) obj);
            return x0.f87415a;
        }

        public final void invoke(UserAgent.Config install) {
            e0.checkNotNullParameter(install, "$this$install");
            install.setAgent("curl/7.61.0");
        }
    }

    public static final void BrowserUserAgent(HttpClientConfig<?> httpClientConfig) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        httpClientConfig.install(UserAgent.Plugin, AnonymousClass1.INSTANCE);
    }

    public static final void CurlUserAgent(HttpClientConfig<?> httpClientConfig) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        httpClientConfig.install(UserAgent.Plugin, C38981.INSTANCE);
    }
}
