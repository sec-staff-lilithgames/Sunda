package io.ktor.serialization;

import io.ktor.http.ContentType;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Configuration {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(Configuration configuration, ContentType contentType, ContentConverter contentConverter, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i10 & 4) != 0) {
                lVar = AnonymousClass1.INSTANCE;
            }
            configuration.register(contentType, contentConverter, lVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.serialization.Configuration$register$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(ContentConverter contentConverter) {
            e0.checkNotNullParameter(contentConverter, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ContentConverter) obj);
            return x0.f87415a;
        }
    }

    <T extends ContentConverter> void register(ContentType contentType, T t10, l lVar);
}
