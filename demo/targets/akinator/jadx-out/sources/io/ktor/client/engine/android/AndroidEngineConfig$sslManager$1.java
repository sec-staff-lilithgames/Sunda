package io.ktor.client.engine.android;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidEngineConfig$sslManager$1 extends f0 implements l {
    public static final AndroidEngineConfig$sslManager$1 INSTANCE = new AndroidEngineConfig$sslManager$1();

    public AndroidEngineConfig$sslManager$1() {
        super(1);
    }

    public final void invoke(HttpsURLConnection it) {
        e0.checkNotNullParameter(it, "it");
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpsURLConnection) obj);
        return x0.f87415a;
    }
}
