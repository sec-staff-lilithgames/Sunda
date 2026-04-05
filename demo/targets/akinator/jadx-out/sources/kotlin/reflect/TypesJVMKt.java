package kotlin.reflect;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jv.a;
import kotlin.jvm.internal.e0;
import rv.f0;
import rv.y;
import sv.k0;
import tu.t;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TypesJVMKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeJavaType(KType kType, boolean z10) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) classifier);
        }
        if (!(classifier instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) classifier;
        Class javaObjectType = z10 ? a.getJavaObjectType(kClass) : a.getJavaClass(kClass);
        List<KTypeProjection> arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return javaObjectType;
        }
        if (!javaObjectType.isArray()) {
            return createPossiblyInnerType(javaObjectType, arguments);
        }
        if (javaObjectType.getComponentType().isPrimitive()) {
            return javaObjectType;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) y0.singleOrNull((List) arguments);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance kVarianceComponent1 = kTypeProjection.component1();
        KType kTypeComponent2 = kTypeProjection.component2();
        int i10 = kVarianceComponent1 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVarianceComponent1.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return javaObjectType;
        }
        if (i10 != 2 && i10 != 3) {
            throw new t();
        }
        e0.checkNotNull(kTypeComponent2);
        Type typeComputeJavaType$default = computeJavaType$default(kTypeComponent2, false, 1, null);
        return typeComputeJavaType$default instanceof Class ? javaObjectType : new GenericArrayTypeImpl(typeComputeJavaType$default);
    }

    public static /* synthetic */ Type computeJavaType$default(KType kType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return computeJavaType(kType, z10);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeCreatePossiblyInnerType, arrayList3);
    }

    public static final Type getJavaType(KType kType) {
        e0.checkNotNullParameter(kType, "<this>");
        return computeJavaType$default(kType, false, 1, null);
    }

    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            e0.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        rv.t tVarGenerateSequence = y.generateSequence(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) f0.last(tVarGenerateSequence)).getName() + k0.repeat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, f0.count(tVarGenerateSequence));
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        e0.checkNotNull(type);
        int i10 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i10 == 1) {
            return new WildcardTypeImpl(null, computeJavaType(type, true));
        }
        if (i10 == 2) {
            return computeJavaType(type, true);
        }
        if (i10 == 3) {
            return new WildcardTypeImpl(computeJavaType(type, true), null);
        }
        throw new t();
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }
}
