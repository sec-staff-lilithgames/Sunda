package io.odeeo.internal.g1;

import android.content.Context;
import android.net.ConnectivityManager;
import io.odeeo.internal.y1.s;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f64244a = "https://us-east-1.ingaa.xyz/";

    public final String getBaseUrl() {
        return this.f64244a;
    }

    public final io.odeeo.internal.k1.a provideAvailabilityCallback(Context context, ConnectivityManager connectivityManager) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(connectivityManager, "connectivityManager");
        return new io.odeeo.internal.k1.c(connectivityManager);
    }

    public final ConnectivityManager provideConnectivityManager(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return (ConnectivityManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final l0 provideHttpClient(io.odeeo.internal.j1.d loggingInterceptor, io.odeeo.internal.j1.a emptyListInterceptor) {
        e0.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        e0.checkNotNullParameter(emptyListInterceptor, "emptyListInterceptor");
        l0.a aVar = new l0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.readTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(15L, timeUnit).addInterceptor(io.odeeo.internal.j1.c.f64378a);
        aVar.addInterceptor(emptyListInterceptor);
        l0 l0VarBuild = aVar.build();
        e0.checkNotNullExpressionValue(l0VarBuild, "builder.build()");
        return l0VarBuild;
    }

    public final io.odeeo.internal.j1.h provideOdeeoSDKApi(s retrofit) throws SecurityException {
        e0.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(io.odeeo.internal.j1.h.class);
        e0.checkNotNullExpressionValue(objCreate, "retrofit.create(OdeeoSDKApi::class.java)");
        return (io.odeeo.internal.j1.h) objCreate;
    }

    public final s provideRetrofit(l0 client) {
        e0.checkNotNullParameter(client, "client");
        s sVarBuild = new s.b().client(client).baseUrl(this.f64244a).addConverterFactory(io.odeeo.internal.z1.a.create()).build();
        e0.checkNotNullExpressionValue(sVarBuild, "Builder()\n        .clien…reate())\n        .build()");
        return sVarBuild;
    }
}
