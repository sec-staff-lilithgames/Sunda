package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface l0 {
    Object getAttribute(Object obj);

    j getCaller(Class cls) throws Exception;

    q0 getDecorator(Class cls) throws Exception;

    a2 getInstance(Class cls);

    a2 getInstance(xw.g gVar);

    String getName(Class cls) throws Exception;

    xw.g getOverride(xw.f fVar, yw.p pVar) throws Exception;

    String getProperty(String str);

    j4 getSchema(Class cls) throws Exception;

    l4 getSession();

    yw.t0 getStyle();

    v4 getSupport();

    Class getType(xw.f fVar, Object obj);

    uw.s getVersion(Class cls) throws Exception;

    boolean isFloat(Class cls) throws Exception;

    boolean isFloat(xw.f fVar) throws Exception;

    boolean isPrimitive(Class cls) throws Exception;

    boolean isPrimitive(xw.f fVar) throws Exception;

    boolean isStrict();

    boolean setOverride(xw.f fVar, Object obj, yw.h0 h0Var) throws Exception;
}
