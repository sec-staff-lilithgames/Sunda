package com.unity3d.services.core.di;

import java.util.Map;
import kotlin.reflect.KClass;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IServicesRegistry {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, KClass kClass, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i10 & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, kClass);
        }
    }

    <T> T getService(String str, KClass<?> kClass);

    Map<ServiceKey, o> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, o oVar);
}
