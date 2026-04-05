package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d1 {
    public KClass createKotlinClass(Class cls) {
        return new s(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new s(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new o0(cls, str);
    }

    public KType mutableCollectionType(KType kType) {
        k1 k1Var = (k1) kType;
        return new k1(kType.getClassifier(), kType.getArguments(), k1Var.getPlatformTypeUpperBound$kotlin_stdlib(), k1Var.getFlags$kotlin_stdlib() | 2);
    }

    public KType nothingType(KType kType) {
        k1 k1Var = (k1) kType;
        return new k1(kType.getClassifier(), kType.getArguments(), k1Var.getPlatformTypeUpperBound$kotlin_stdlib(), k1Var.getFlags$kotlin_stdlib() | 4);
    }

    public KType platformType(KType kType, KType kType2) {
        return new k1(kType.getClassifier(), kType.getArguments(), kType2, ((k1) kType).getFlags$kotlin_stdlib());
    }

    public String renderLambdaToString(f0 f0Var) {
        return renderLambdaToString((y) f0Var);
    }

    public void setUpperBounds(KTypeParameter kTypeParameter, List<KType> list) {
        ((j1) kTypeParameter).setUpperBounds(list);
    }

    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z10) {
        return new k1(kClassifier, list, z10);
    }

    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z10) {
        return new j1(obj, str, kVariance, z10);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new s(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return new s(cls);
    }

    public String renderLambdaToString(y yVar) {
        String string = yVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public KFunction function(z zVar) {
        return zVar;
    }

    public KMutableProperty0 mutableProperty0(i0 i0Var) {
        return i0Var;
    }

    public KMutableProperty1 mutableProperty1(k0 k0Var) {
        return k0Var;
    }

    public KMutableProperty2 mutableProperty2(m0 m0Var) {
        return m0Var;
    }

    public KProperty0 property0(p0 p0Var) {
        return p0Var;
    }

    public KProperty1 property1(r0 r0Var) {
        return r0Var;
    }

    public KProperty2 property2(t0 t0Var) {
        return t0Var;
    }
}
