package dd;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import b0.e2;
import com.applovin.shadow.okhttp3.HttpUrl;
import j1.o2;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Annotation[] f52014a = new Annotation[0];

    /* renamed from: b, reason: collision with root package name */
    public static final a[] f52015b = new a[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Iterator f52016c = Collections.emptyIterator();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Constructor f52017a;

        /* renamed from: b, reason: collision with root package name */
        public transient Annotation[] f52018b;

        /* renamed from: c, reason: collision with root package name */
        public transient Annotation[][] f52019c;

        /* renamed from: d, reason: collision with root package name */
        public int f52020d = -1;

        public a(Constructor<?> constructor) {
            this.f52017a = constructor;
        }

        public Constructor<?> getConstructor() {
            return this.f52017a;
        }

        public Annotation[] getDeclaredAnnotations() {
            Annotation[] annotationArr = this.f52018b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.f52017a.getDeclaredAnnotations();
            this.f52018b = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class<?> getDeclaringClass() {
            return this.f52017a.getDeclaringClass();
        }

        public int getParamCount() {
            int i10 = this.f52020d;
            if (i10 >= 0) {
                return i10;
            }
            int parameterCount = this.f52017a.getParameterCount();
            this.f52020d = parameterCount;
            return parameterCount;
        }

        public Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this.f52019c;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f52017a.getParameterAnnotations();
            this.f52019c = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    public static void a(Class cls, Class cls2, Collection collection, boolean z10) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z10) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, cls2, collection, true);
        }
        a(cls.getSuperclass(), cls2, collection, true);
    }

    public static String apostrophed(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\'');
        sb2.append(str);
        sb2.append('\'');
        return sb2.toString();
    }

    public static void b(jc.o oVar, Class cls, ArrayList arrayList, boolean z10) {
        Class<?> rawClass;
        if (oVar == null || (rawClass = oVar.getRawClass()) == cls || rawClass == Object.class) {
            return;
        }
        if (z10) {
            if (arrayList.contains(oVar)) {
                return;
            } else {
                arrayList.add(oVar);
            }
        }
        Iterator<jc.o> it = oVar.getInterfaces().iterator();
        while (it.hasNext()) {
            b(it.next(), cls, arrayList, true);
        }
        b(oVar.getSuperClass(), cls, arrayList, true);
    }

    public static String backticked(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    public static void c(Class cls, Throwable th2) {
        String name = cls.getName();
        String name2 = th2.getClass().getName();
        String message = th2.getMessage();
        StringBuilder sbB = b3.h.b("Failed on call to `getDeclaredMethods()` on class `", name, "`, problem: (", name2, ") ");
        sbB.append(message);
        throw new IllegalArgumentException(sbB.toString(), th2);
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return TreeJsonEncoderKt.PRIMITIVE_TAG;
        }
        return null;
    }

    @Deprecated
    public static void checkAndFixAccess(Member member) {
        checkAndFixAccess(member, false);
    }

    public static String classNameOf(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Class<?> classOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static void closeOnFailAndThrowAsIOE(ub.o oVar, Exception exc) throws IOException {
        oVar.disable(ub.n.AUTO_CLOSE_JSON_CONTENT);
        try {
            oVar.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T createInstance(Class<T> cls, boolean z10) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        Constructor constructorFindConstructor = findConstructor(cls, z10);
        if (constructorFindConstructor == null) {
            throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Class "), " has no default (no arg) constructor"));
        }
        try {
            return (T) constructorFindConstructor.newInstance(null);
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Class "), " is not a primitive type"));
    }

    public static <T> Iterator<T> emptyIterator() {
        return f52016c;
    }

    public static <T> Stream<T> emptyStream() {
        return Stream.empty();
    }

    public static String exceptionMessage(Throwable th2) {
        return th2 instanceof ub.h ? ((ub.h) th2).getOriginalMessage() : (!(th2 instanceof InvocationTargetException) || th2.getCause() == null) ? th2.getMessage() : th2.getCause().getMessage();
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        return isObjectOrPrimitive(cls) ? f52014a : cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z10) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (z10) {
                checkAndFixAccess(declaredConstructor, z10);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        return !enumSet.isEmpty() ? findEnumType((Enum<?>) enumSet.iterator().next()) : j.f52026e.enumTypeFor(enumSet);
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r82 : cls.getEnumConstants()) {
                    if (name.equals(r82.name())) {
                        return r82;
                    }
                }
            }
        }
        return null;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z10) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        a(cls, cls2, arrayList, z10);
        return arrayList;
    }

    public static List<Class<?>> findSuperClasses(Class<?> cls, Class<?> cls2, boolean z10) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z10) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static List<jc.o> findSuperTypes(jc.o oVar, Class<?> cls, boolean z10) {
        if (oVar == null || oVar.hasRawClass(cls) || oVar.hasRawClass(Object.class)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        b(oVar, cls, arrayList, z10);
        return arrayList;
    }

    public static String getClassDescription(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] getClassMethods(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Exception e10) {
            c(cls, e10);
            throw null;
        } catch (NoClassDefFoundError e11) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                c(cls, e11);
                throw null;
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Exception e12) {
                    c(cls, e12);
                    throw null;
                }
            } catch (ClassNotFoundException e13) {
                e11.addSuppressed(e13);
                c(cls, e11);
                throw null;
            }
        }
    }

    public static a[] getConstructors(Class<?> cls) throws SecurityException {
        if (cls.isInterface() || isObjectOrPrimitive(cls)) {
            return f52015b;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(declaredConstructors[i10]);
        }
        return aVarArr;
    }

    @Deprecated
    public static Field[] getDeclaredFields(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    @Deprecated
    public static Method[] getDeclaredMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> getDeclaringClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static int getJDKMajorVersion() {
        try {
            String property = System.getProperty("java.version");
            if (property.startsWith("1.")) {
                return 8;
            }
            int iIndexOf = property.indexOf(".");
            try {
                return Integer.parseInt(iIndexOf < 0 ? property : property.substring(0, iIndexOf));
            } catch (NumberFormatException unused) {
                throw new IllegalStateException(a.b.l("Invalid JDK version String '", property, "' cannot determine JDK major version"));
            }
        } catch (SecurityException unused2) {
            throw new IllegalStateException("Could not access 'java.version': cannot determine JDK major version");
        }
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (hasEnclosingMethod(cls)) {
                    return null;
                }
                return getEnclosingClass(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    @Deprecated
    public static String getPackageName(Class<?> cls) {
        Package r02 = cls.getPackage();
        if (r02 == null) {
            return null;
        }
        return r02.getName();
    }

    public static Throwable getRootCause(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static String getTypeDescription(jc.o oVar) {
        if (oVar == null) {
            return "[null]";
        }
        int i10 = 0;
        while (oVar.isArrayType()) {
            i10++;
            oVar = oVar.getContentType();
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(oVar.toCanonical());
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                sb2.append('`');
                return sb2.toString();
            }
            sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            i10 = i11;
        }
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        return (isObjectOrPrimitive(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    @Deprecated
    public static boolean hasGetterSignature(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length != 0 || Void.TYPE == method.getReturnType()) ? false : true;
    }

    public static boolean isBogusClass(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == kc.p.class;
    }

    public static boolean isCollectionMapOrArray(Class<?> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isEnumType(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean isJDK17OrAbove() throws Error, RuntimeException {
        try {
            return getJDKMajorVersion() >= 17;
        } catch (Throwable th2) {
            p.rethrowIfFatal(th2);
            System.err.println("Failed to determine JDK major version, assuming pre-JDK-17; problem: " + th2);
            return false;
        }
    }

    public static boolean isJDKClass(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("sun.");
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj == null || isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class<?> cls, boolean z10) {
        try {
            boolean zIsStatic = Modifier.isStatic(cls.getModifiers());
            if (!zIsStatic && hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (z10 || zIsStatic) {
                return null;
            }
            if (getEnclosingClass(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || getEnclosingClass(cls) == null) ? false : true;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String name(String str) {
        return str == null ? "[null]" : apostrophed(str);
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i10--;
            } while (i10 > 0);
            simpleName = sb2.toString();
        }
        return backticked(simpleName);
    }

    public static <T> T nonNull(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static String nonNullString(String str) {
        return str == null ? "" : str;
    }

    public static String nullOrToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static String quotedOr(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    public static Class<?> rawClass(jc.o oVar) {
        if (oVar == null) {
            return null;
        }
        return oVar.getRawClass();
    }

    public static void throwAsIAE(Throwable th2) {
        throwAsIAE(th2, th2.getMessage());
    }

    public static <T> T throwAsMappingException(jc.k kVar, IOException iOException) throws jc.r {
        if (iOException instanceof jc.r) {
            throw ((jc.r) iOException);
        }
        throw jc.r.from(kVar, iOException.getMessage()).withCause(iOException);
    }

    public static Throwable throwIfError(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2;
    }

    public static Throwable throwIfIOE(Throwable th2) throws IOException {
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        return th2;
    }

    public static Throwable throwIfRTE(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        return th2;
    }

    public static Throwable throwRootCauseIfIOE(Throwable th2) throws IOException {
        return throwIfIOE(getRootCause(th2));
    }

    public static void unwrapAndThrowAsIAE(Throwable th2) {
        throwAsIAE(getRootCause(th2));
    }

    public static void verifyMustOverride(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(o2.o(b3.h.b("Sub-class ", obj.getClass().getName(), " (of class ", cls.getName(), ") must override method '"), str, "'"));
        }
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Class "), " is not a primitive type"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkAndFixAccess(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z10 || isJDKClass(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e10.getMessage());
        } catch (RuntimeException e11) {
            if (!"InaccessibleObjectException".equals(e11.getClass().getSimpleName())) {
                throw e11;
            }
            String simpleName = member.getClass().getSimpleName();
            String name = member.getName();
            String strNameOf = nameOf(member.getDeclaringClass());
            String name2 = e11.getClass().getName();
            String message = e11.getMessage();
            StringBuilder sbB = b3.h.b("Failed to call `setAccess()` on ", simpleName, " '", name, "' (of class ");
            com.google.android.gms.internal.play_billing.a.B(sbB, strNameOf, ") due to `", name2, "`, problem: ");
            sbB.append(message);
            throw new IllegalArgumentException(sbB.toString(), e11);
        }
    }

    public static boolean isConcrete(Member member) {
        return (member.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(kc.b.class) != null;
    }

    public static void throwAsIAE(Throwable th2, String str) {
        throwIfRTE(th2);
        throwIfError(th2);
        throw new IllegalArgumentException(str, th2);
    }

    public static void unwrapAndThrowAsIAE(Throwable th2, String str) {
        throwAsIAE(getRootCause(th2), str);
    }

    public static boolean isRecordType(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && OIPXcgrVyyxoLF.SWsgJtsJGuiEX.equals(superclass.getName())) {
            return true;
        }
        return false;
    }

    public static String name(jc.n0 n0Var) {
        if (n0Var == null) {
            return "[null]";
        }
        return apostrophed(n0Var.getSimpleName());
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum<?>) enumMap.keySet().iterator().next());
        }
        return j.f52026e.enumTypeFor(enumMap);
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2) {
        return findSuperTypes(cls, cls2, new ArrayList(8));
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        a(cls, cls2, list, false);
        return list;
    }

    public static void closeOnFailAndThrowAsIOE(ub.o oVar, Closeable closeable, Exception exc) throws IOException {
        if (oVar != null) {
            oVar.disable(ub.n.AUTO_CLOSE_JSON_CONTENT);
            try {
                oVar.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> r02) {
        return r02.getDeclaringClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static String nameOf(b0 b0Var) {
        if (b0Var == null) {
            return "[null]";
        }
        return apostrophed(b0Var.getName());
    }
}
