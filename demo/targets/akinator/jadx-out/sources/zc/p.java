package zc;

import java.lang.annotation.Annotation;
import jc.n0;
import jc.u0;
import rc.h0;
import yc.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p extends h0 {
    @Override // rc.h0, jc.g
    public abstract void depositSchemaProperty(uc.m mVar, u0 u0Var) throws jc.r;

    @Deprecated
    public abstract void depositSchemaProperty(v vVar, u0 u0Var) throws jc.r;

    public <A extends Annotation> A findAnnotation(Class<A> cls) {
        A a10 = (A) getAnnotation(cls);
        return a10 == null ? (A) getContextAnnotation(cls) : a10;
    }

    @Override // rc.h0, jc.g
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // rc.h0, jc.g
    public abstract <A extends Annotation> A getContextAnnotation(Class<A> cls);

    @Override // rc.h0, jc.g
    public abstract n0 getFullName();

    @Override // rc.h0, jc.g
    public abstract /* synthetic */ rc.l getMember();

    @Override // rc.h0, jc.g, dd.b0
    public abstract String getName();

    @Override // rc.h0, jc.g
    public abstract /* synthetic */ jc.o getType();

    @Override // rc.h0, jc.g
    public abstract /* synthetic */ n0 getWrapperName();

    public abstract void serializeAsElement(Object obj, ub.o oVar, u0 u0Var) throws Exception;

    public abstract void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception;

    public abstract void serializeAsOmittedField(Object obj, ub.o oVar, u0 u0Var) throws Exception;

    public abstract void serializeAsPlaceholder(Object obj, ub.o oVar, u0 u0Var) throws Exception;
}
