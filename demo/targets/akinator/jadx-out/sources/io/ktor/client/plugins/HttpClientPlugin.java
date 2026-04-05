package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface HttpClientPlugin<TConfig, TPlugin> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object prepare$default(HttpClientPlugin httpClientPlugin, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i10 & 1) != 0) {
                lVar = AnonymousClass1.INSTANCE;
            }
            return httpClientPlugin.prepare(lVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.HttpClientPlugin$prepare$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4275invoke(TConfig tconfig) {
            e0.checkNotNullParameter(tconfig, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4275invoke((AnonymousClass1) obj);
            return x0.f87415a;
        }
    }

    AttributeKey<TPlugin> getKey();

    void install(TPlugin tplugin, HttpClient httpClient);

    TPlugin prepare(l lVar);
}
