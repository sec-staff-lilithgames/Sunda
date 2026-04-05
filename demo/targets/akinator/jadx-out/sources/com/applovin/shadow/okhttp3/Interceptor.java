package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.Interceptor;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i10, TimeUnit timeUnit);

        Chain withReadTimeout(int i10, TimeUnit timeUnit);

        Chain withWriteTimeout(int i10, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final l block) {
            e0.checkNotNullParameter(block, "block");
            return new Interceptor() { // from class: com.applovin.shadow.okhttp3.Interceptor$Companion$invoke$1
                @Override // com.applovin.shadow.okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain it) {
                    e0.checkNotNullParameter(it, "it");
                    return (Response) block.invoke(it);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
