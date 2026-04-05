package mc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f74216a = new Object();

    public Object handleInstantiationProblem(jc.k kVar, Class<?> cls, Object obj, Throwable th2) throws IOException {
        return f74216a;
    }

    public Object handleMissingInstantiator(jc.k kVar, Class<?> cls, c0 c0Var, ub.u uVar, String str) throws IOException {
        return handleMissingInstantiator(kVar, cls, uVar, str);
    }

    public jc.o handleMissingTypeId(jc.k kVar, jc.o oVar, wc.h hVar, String str) throws IOException {
        return null;
    }

    @Deprecated
    public Object handleUnexpectedToken(jc.k kVar, Class<?> cls, ub.z zVar, ub.u uVar, String str) throws IOException {
        return f74216a;
    }

    public boolean handleUnknownProperty(jc.k kVar, ub.u uVar, jc.q qVar, Object obj, String str) throws IOException {
        return false;
    }

    public jc.o handleUnknownTypeId(jc.k kVar, jc.o oVar, String str, wc.h hVar, String str2) throws IOException {
        return null;
    }

    public Object handleWeirdKey(jc.k kVar, Class<?> cls, String str, String str2) throws IOException {
        return f74216a;
    }

    public Object handleWeirdNativeValue(jc.k kVar, jc.o oVar, Object obj, ub.u uVar) throws IOException {
        return f74216a;
    }

    public Object handleWeirdNumberValue(jc.k kVar, Class<?> cls, Number number, String str) throws IOException {
        return f74216a;
    }

    public Object handleWeirdStringValue(jc.k kVar, Class<?> cls, String str, String str2) throws IOException {
        return f74216a;
    }

    @Deprecated
    public Object handleMissingInstantiator(jc.k kVar, Class<?> cls, ub.u uVar, String str) throws IOException {
        return f74216a;
    }

    public Object handleUnexpectedToken(jc.k kVar, jc.o oVar, ub.z zVar, ub.u uVar, String str) throws IOException {
        return handleUnexpectedToken(kVar, oVar.getRawClass(), zVar, uVar, str);
    }
}
