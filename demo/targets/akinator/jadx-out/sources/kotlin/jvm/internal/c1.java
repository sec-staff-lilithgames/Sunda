package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
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
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f71820a;

    /* renamed from: b, reason: collision with root package name */
    public static final KClass[] f71821b;

    static {
        d1 d1Var = null;
        try {
            d1Var = (d1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (d1Var == null) {
            d1Var = new d1();
        }
        f71820a = d1Var;
        f71821b = new KClass[0];
    }

    public static KClass createKotlinClass(Class cls) {
        return f71820a.createKotlinClass(cls);
    }

    public static KFunction function(z zVar) {
        return f71820a.function(zVar);
    }

    public static KClass getOrCreateKotlinClass(Class cls) {
        return f71820a.getOrCreateKotlinClass(cls);
    }

    public static KClass[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f71821b;
        }
        KClass[] kClassArr = new KClass[length];
        for (int i10 = 0; i10 < length; i10++) {
            kClassArr[i10] = getOrCreateKotlinClass(clsArr[i10]);
        }
        return kClassArr;
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class cls) {
        return f71820a.getOrCreateKotlinPackage(cls, "");
    }

    public static KType mutableCollectionType(KType kType) {
        return f71820a.mutableCollectionType(kType);
    }

    public static KMutableProperty0 mutableProperty0(i0 i0Var) {
        return f71820a.mutableProperty0(i0Var);
    }

    public static KMutableProperty1 mutableProperty1(k0 k0Var) {
        return f71820a.mutableProperty1(k0Var);
    }

    public static KMutableProperty2 mutableProperty2(m0 m0Var) {
        return f71820a.mutableProperty2(m0Var);
    }

    public static KType nothingType(KType kType) {
        return f71820a.nothingType(kType);
    }

    public static KType nullableTypeOf(KClassifier kClassifier) {
        return f71820a.typeOf(kClassifier, Collections.EMPTY_LIST, true);
    }

    public static KType platformType(KType kType, KType kType2) {
        return f71820a.platformType(kType, kType2);
    }

    public static KProperty0 property0(p0 p0Var) {
        return f71820a.property0(p0Var);
    }

    public static KProperty1 property1(r0 r0Var) {
        return f71820a.property1(r0Var);
    }

    public static KProperty2 property2(t0 t0Var) {
        return f71820a.property2(t0Var);
    }

    public static String renderLambdaToString(f0 f0Var) {
        return f71820a.renderLambdaToString(f0Var);
    }

    public static void setUpperBounds(KTypeParameter kTypeParameter, KType kType) {
        f71820a.setUpperBounds(kTypeParameter, Collections.singletonList(kType));
    }

    public static KType typeOf(KClassifier kClassifier) {
        return f71820a.typeOf(kClassifier, Collections.EMPTY_LIST, false);
    }

    public static KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z10) {
        return f71820a.typeParameter(obj, str, kVariance, z10);
    }

    public static KClass createKotlinClass(Class cls, String str) {
        return f71820a.createKotlinClass(cls, str);
    }

    public static KClass getOrCreateKotlinClass(Class cls, String str) {
        return f71820a.getOrCreateKotlinClass(cls, str);
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return f71820a.getOrCreateKotlinPackage(cls, str);
    }

    public static KType nullableTypeOf(Class cls) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, true);
    }

    public static String renderLambdaToString(y yVar) {
        return f71820a.renderLambdaToString(yVar);
    }

    public static void setUpperBounds(KTypeParameter kTypeParameter, KType... kTypeArr) {
        f71820a.setUpperBounds(kTypeParameter, uu.k0.toList(kTypeArr));
    }

    public static KType typeOf(Class cls) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    public static KType nullableTypeOf(Class cls, KTypeProjection kTypeProjection) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), true);
    }

    public static KType typeOf(Class cls, KTypeProjection kTypeProjection) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType nullableTypeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static KType typeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static KType nullableTypeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), uu.k0.toList(kTypeProjectionArr), true);
    }

    public static KType typeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f71820a.typeOf(getOrCreateKotlinClass(cls), uu.k0.toList(kTypeProjectionArr), false);
    }
}
