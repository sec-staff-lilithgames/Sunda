package qc;

import java.beans.ConstructorProperties;
import java.beans.Transient;
import jc.n0;
import rc.q;
import rc.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d extends c {
    @Override // qc.c
    public n0 findConstructorName(q qVar) {
        ConstructorProperties annotation;
        r owner = qVar.getOwner();
        if (owner == null || (annotation = owner.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = annotation.value();
        int index = qVar.getIndex();
        if (index < strArrValue.length) {
            return n0.construct(strArrValue[index]);
        }
        return null;
    }

    @Override // qc.c
    public Boolean findTransient(rc.b bVar) {
        Transient annotation = bVar.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // qc.c
    public Boolean hasCreatorAnnotation(rc.b bVar) {
        if (bVar.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
