package io.ktor.client.engine;

import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface HttpClientEngineFactory<T extends HttpClientEngineConfig> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ HttpClientEngine create$default(HttpClientEngineFactory httpClientEngineFactory, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i10 & 1) != 0) {
                lVar = AnonymousClass1.INSTANCE;
            }
            return httpClientEngineFactory.create(lVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.engine.HttpClientEngineFactory$create$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(T t10) {
            e0.checkNotNullParameter(t10, "$this$null");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnonymousClass1) obj);
            return x0.f87415a;
        }
    }

    HttpClientEngine create(l lVar);
}
