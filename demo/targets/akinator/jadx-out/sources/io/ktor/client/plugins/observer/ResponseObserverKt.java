package io.ktor.client.plugins.observer;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.observer.ResponseObserver;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ResponseObserverKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ p $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(1);
            this.$block = pVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ResponseObserver.Config) obj);
            return x0.f87415a;
        }

        public final void invoke(ResponseObserver.Config install) {
            e0.checkNotNullParameter(install, "$this$install");
            install.setResponseHandler$ktor_client_core(this.$block);
        }
    }

    public static final void ResponseObserver(HttpClientConfig<?> httpClientConfig, p block) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        e0.checkNotNullParameter(block, "block");
        httpClientConfig.install(ResponseObserver.Plugin, new AnonymousClass1(block));
    }
}
