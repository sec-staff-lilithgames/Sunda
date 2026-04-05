package ad;

import bd.c1;
import java.io.IOException;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c0 extends c1 {
    public c0() {
        super((Class<?>) Object.class);
    }

    public final void e(u0 u0Var, Object obj) throws jc.r {
        Class<?> cls = obj.getClass();
        if (dd.c0.needsReflectionConfiguration(cls)) {
            u0Var.reportBadDefinition(handledType(), "No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized");
            return;
        }
        u0Var.reportBadDefinition(handledType(), "No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)");
    }

    @Override // bd.c1, bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        if (u0Var.isEnabled(t0.FAIL_ON_EMPTY_BEANS)) {
            e(u0Var, obj);
        }
        super.serialize(obj, oVar, u0Var);
    }

    @Override // bd.c1, jc.w
    public void serializeWithType(Object obj, ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        if (u0Var.isEnabled(t0.FAIL_ON_EMPTY_BEANS)) {
            e(u0Var, obj);
        }
        super.serializeWithType(obj, oVar, u0Var, jVar);
    }

    public c0(Class<?> cls) {
        super(cls);
    }
}
