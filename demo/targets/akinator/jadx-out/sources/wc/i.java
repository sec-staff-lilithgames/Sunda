package wc;

import java.util.Collection;
import jc.o;
import jc.s0;
import tb.v0;
import tb.w0;
import tb.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface i {
    g buildTypeDeserializer(jc.j jVar, o oVar, Collection<c> collection);

    j buildTypeSerializer(s0 s0Var, o oVar, Collection<c> collection);

    i defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    i inclusion(v0 v0Var);

    i init(w0 w0Var, h hVar);

    default i init(y0 y0Var, h hVar) {
        return init(y0Var.getIdType(), hVar);
    }

    i typeIdVisibility(boolean z10);

    i typeProperty(String str);

    default i withDefaultImpl(Class<?> cls) {
        return defaultImpl(cls);
    }

    default i withSettings(y0 y0Var) {
        throw new IllegalStateException("TypeResolveBuilder implementation " + getClass().getName() + " must implement `withSettings()`");
    }
}
