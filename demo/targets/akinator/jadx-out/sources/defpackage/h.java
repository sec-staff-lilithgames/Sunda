package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.sfbx.appconsent.core.util.Utils;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.android.AndroidEngineConfig;
import io.ktor.client.plugins.DefaultRequestKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.UserAgent;
import io.ktor.client.plugins.logging.Logging;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f58525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(1);
        this.f58525e = context;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws PackageManager.NameNotFoundException {
        invoke((HttpClientConfig<AndroidEngineConfig>) obj);
        return x0.f87415a;
    }

    public final void invoke(HttpClientConfig<AndroidEngineConfig> HttpClient) throws PackageManager.NameNotFoundException {
        e0.checkNotNullParameter(HttpClient, "$this$HttpClient");
        Utils.INSTANCE.init(this.f58525e);
        HttpClient.install(Logging.Companion, a.f3381e);
        HttpClient.install(UserAgent.Plugin, b.f8314e);
        DefaultRequestKt.defaultRequest(HttpClient, c.f11384e);
        HttpClient.install(HttpTimeout.Plugin, d.f51281e);
        HttpClient.install(HttpSend.Plugin, e.f52950e);
        HttpClient.setExpectSuccess(false);
        HttpClient.engine(g.f56320e);
    }
}
