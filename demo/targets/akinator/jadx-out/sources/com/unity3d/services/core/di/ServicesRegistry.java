package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kv.a;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, o> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return servicesRegistry.resolveService(new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class));
        servicesRegistry.updateService(serviceKey, q.lazy(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String named, a instance) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) resolveService(new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        e0.checkNotNullParameter(named, "named");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) resolveServiceOrNull(new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String named, KClass<?> instance) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, o> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey key) {
        e0.checkNotNullParameter(key, "key");
        o oVar = getServices().get(key);
        if (oVar != null) {
            return (T) oVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey key) {
        e0.checkNotNullParameter(key, "key");
        o oVar = getServices().get(key);
        if (oVar == null) {
            return null;
        }
        return (T) oVar.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String named, a instance) {
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(instance, "instance");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        ServiceKey serviceKey = new ServiceKey(named, c1.getOrCreateKotlinClass(Object.class));
        updateService(serviceKey, q.lazy(instance));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey key, o instance) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
        } else {
            throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
        }
    }
}
