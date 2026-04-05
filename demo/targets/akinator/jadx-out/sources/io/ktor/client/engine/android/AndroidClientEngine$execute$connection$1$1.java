package io.ktor.client.engine.android;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidClientEngine$execute$connection$1$1 extends f0 implements p {
    final /* synthetic */ HttpURLConnection $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine$execute$connection$1$1(HttpURLConnection httpURLConnection) {
        super(2);
        this.$this_apply = httpURLConnection;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return x0.f87415a;
    }

    public final void invoke(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        this.$this_apply.addRequestProperty(key, value);
    }
}
