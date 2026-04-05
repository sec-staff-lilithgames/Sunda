package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import c6.b;
import com.google.android.gms.net.CronetProviderInstaller;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdsSdkInitializer implements b {
    @Override // c6.b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m3511create(context);
        return x0.f87415a;
    }

    @Override // c6.b
    public List<Class<? extends b>> dependencies() {
        return p0.emptyList();
    }

    /* renamed from: create, reason: collision with other method in class */
    public void m3511create(Context context) {
        e0.checkNotNullParameter(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService("", c1.getOrCreateKotlinClass(OrientationRepository.class))).invoke();
        try {
            CronetProviderInstaller.installProvider(context);
        } catch (Throwable unused) {
        }
    }
}
