package jv;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import kotlin.reflect.KClass;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {
    public static final <T extends Annotation> KClass<? extends T> getAnnotationClass(T t10) {
        e0.checkNotNullParameter(t10, "<this>");
        Class<? extends Annotation> clsAnnotationType = t10.annotationType();
        e0.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        KClass<? extends T> kotlinClass = getKotlinClass(clsAnnotationType);
        e0.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kotlinClass;
    }

    public static final <T> Class<T> getJavaClass(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        Class<T> cls = (Class<T>) ((r) kClass).getJClass();
        e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final <T> Class<T> getJavaObjectType(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        Class<T> cls = (Class<T>) ((r) kClass).getJClass();
        if (!cls.isPrimitive()) {
            e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    public static final <T> Class<T> getJavaPrimitiveType(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        Class<T> cls = (Class<T>) ((r) kClass).getJClass();
        if (cls.isPrimitive()) {
            e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final <T> KClass<T> getKotlinClass(Class<T> cls) {
        e0.checkNotNullParameter(cls, "<this>");
        return c1.getOrCreateKotlinClass(cls);
    }

    public static final <T> Class<KClass<T>> getRuntimeClassOfKClassInstance(KClass<T> kClass) {
        e0.checkNotNullParameter(kClass, "<this>");
        Class<KClass<T>> cls = (Class<KClass<T>>) kClass.getClass();
        e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    public static final /* synthetic */ boolean isArrayOf(Object[] objArr) {
        e0.checkNotNullParameter(objArr, "<this>");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    public static final <T> Class<T> getJavaClass(T t10) {
        e0.checkNotNullParameter(t10, "<this>");
        Class<T> cls = (Class<T>) t10.getClass();
        e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    public static /* synthetic */ void getDeclaringJavaClass$annotations(Enum r02) {
    }

    public static /* synthetic */ void getJavaClass$annotations(KClass kClass) {
    }

    @f
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(KClass kClass) {
    }
}
