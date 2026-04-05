package jc;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w implements uc.e {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends w {
    }

    @Override // uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, o oVar) throws r {
        hVar.expectAnyFormat(oVar);
    }

    public w getDelegatee() {
        return null;
    }

    public Class<Object> handledType() {
        return null;
    }

    @Deprecated
    public boolean isEmpty(Object obj) {
        return isEmpty(null, obj);
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<zc.p> properties() {
        return dd.i.emptyIterator();
    }

    public w replaceDelegatee(w wVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException;

    public void serializeWithType(Object obj, ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        Class<?> clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = obj.getClass();
        }
        u0Var.reportBadDefinition(clsHandledType, e3.g.l("Type id handling not implemented for type ", clsHandledType.getName(), " (by serializer of type ", getClass().getName(), ")"));
    }

    public boolean usesObjectId() {
        return false;
    }

    public boolean isEmpty(u0 u0Var, Object obj) {
        return obj == null;
    }

    public w unwrappingSerializer(dd.a0 a0Var) {
        return this;
    }

    public w withFilterId(Object obj) {
        return this;
    }

    public w withIgnoredProperties(Set<String> set) {
        return this;
    }
}
