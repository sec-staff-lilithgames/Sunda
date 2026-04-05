package io.ktor.client.plugins;

import bx.a;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultRequestKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultRequest");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.DefaultRequestKt$defaultRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ l $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar) {
            super(1);
            this.$block = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DefaultRequest.DefaultRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(DefaultRequest.DefaultRequestBuilder install) {
            e0.checkNotNullParameter(install, "$this$install");
            this.$block.invoke(install);
        }
    }

    public static final void defaultRequest(HttpClientConfig<?> httpClientConfig, l block) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        e0.checkNotNullParameter(block, "block");
        httpClientConfig.install(DefaultRequest.Plugin, new AnonymousClass1(block));
    }
}
