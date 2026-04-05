package rc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n0 {
    @Deprecated
    public static jc.m createEnumNamingStrategyInstance(Object obj, boolean z10) {
        createEnumNamingStrategyInstance(obj, z10, null);
        return null;
    }

    public static jc.m createEnumNamingStrategyInstance(Object obj, boolean z10, jc.m mVar) {
        if (obj == null) {
            return mVar;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException(a.b.l("AnnotationIntrospector returned EnumNamingStrategy definition of type ", dd.i.classNameOf(obj), "; expected type `Class<EnumNamingStrategy>` instead"));
        }
        Class cls = (Class) obj;
        if (cls == jc.m.class) {
            return null;
        }
        if (!jc.m.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(a.b.l("Problem with AnnotationIntrospector returned Class ", dd.i.classNameOf(cls), "; expected `Class<EnumNamingStrategy>`"));
        }
        if (dd.i.createInstance(cls, z10) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
