package jc;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o extends hc.a implements Serializable, Type {

    /* renamed from: b, reason: collision with root package name */
    public final Class f69386b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69387c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f69388e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f69389f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69390g;

    public o(Class cls, int i10, Object obj, Object obj2, boolean z10) {
        this.f69386b = cls;
        this.f69387c = cls.hashCode() + (i10 * 31);
        this.f69388e = obj;
        this.f69389f = obj2;
        this.f69390g = z10;
    }

    @Override // hc.a
    public abstract o containedType(int i10);

    @Override // hc.a
    public abstract int containedTypeCount();

    @Override // hc.a
    @Deprecated
    public abstract String containedTypeName(int i10);

    public o containedTypeOrUnknown(int i10) {
        o oVarContainedType = containedType(i10);
        return oVarContainedType == null ? cd.s.unknownType() : oVarContainedType;
    }

    public abstract boolean equals(Object obj);

    public abstract o findSuperType(Class<?> cls);

    public abstract o[] findTypeParameters(Class<?> cls);

    public abstract cd.r getBindings();

    public Object getContentTypeHandler() {
        return null;
    }

    public Object getContentValueHandler() {
        return null;
    }

    public String getErasedSignature() {
        StringBuilder sb2 = new StringBuilder(40);
        getErasedSignature(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb2);

    public String getGenericSignature() {
        StringBuilder sb2 = new StringBuilder(40);
        getGenericSignature(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb2);

    public abstract List<o> getInterfaces();

    @Override // hc.a
    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    @Override // hc.a
    public final Class<?> getRawClass() {
        return this.f69386b;
    }

    public abstract o getSuperClass();

    public <T> T getTypeHandler() {
        return (T) this.f69389f;
    }

    public <T> T getValueHandler() {
        return (T) this.f69388e;
    }

    public boolean hasContentType() {
        return true;
    }

    @Override // hc.a
    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    public boolean hasHandlers() {
        return (this.f69389f == null && this.f69388e == null) ? false : true;
    }

    @Override // hc.a
    public final boolean hasRawClass(Class<?> cls) {
        return this.f69386b == cls;
    }

    public boolean hasValueHandler() {
        return this.f69388e != null;
    }

    public int hashCode() {
        return this.f69387c;
    }

    @Override // hc.a
    public boolean isAbstract() {
        return Modifier.isAbstract(this.f69386b.getModifiers());
    }

    @Override // hc.a
    public boolean isArrayType() {
        return false;
    }

    @Override // hc.a
    public boolean isCollectionLikeType() {
        return false;
    }

    @Override // hc.a
    public boolean isConcrete() {
        Class cls = this.f69386b;
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return cls.isPrimitive();
    }

    @Override // hc.a
    public abstract boolean isContainerType();

    public final boolean isEnumImplType() {
        Class cls = this.f69386b;
        return dd.i.isEnumType(cls) && cls != Enum.class;
    }

    @Override // hc.a
    public final boolean isEnumType() {
        return dd.i.isEnumType(this.f69386b);
    }

    @Override // hc.a
    public final boolean isFinal() {
        return Modifier.isFinal(this.f69386b.getModifiers());
    }

    @Override // hc.a
    public final boolean isInterface() {
        return this.f69386b.isInterface();
    }

    public boolean isIterationType() {
        return false;
    }

    public final boolean isJavaLangObject() {
        return this.f69386b == Object.class;
    }

    @Override // hc.a
    public boolean isMapLikeType() {
        return false;
    }

    @Override // hc.a
    public final boolean isPrimitive() {
        return this.f69386b.isPrimitive();
    }

    public final boolean isRecordType() {
        return dd.i.isRecordType(this.f69386b);
    }

    @Override // hc.a
    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this.f69386b);
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        Class<?> cls2 = this.f69386b;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean isTypeOrSuperTypeOf(Class<?> cls) {
        Class<?> cls2 = this.f69386b;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract o refine(Class<?> cls, cd.r rVar, o oVar, o[] oVarArr);

    public abstract String toString();

    public final boolean useStaticType() {
        return this.f69390g;
    }

    public abstract o withContentType(o oVar);

    public abstract o withContentTypeHandler(Object obj);

    public abstract o withContentValueHandler(Object obj);

    public o withHandlersFrom(o oVar) {
        Object typeHandler = oVar.getTypeHandler();
        o oVarWithTypeHandler = typeHandler != this.f69389f ? withTypeHandler(typeHandler) : this;
        Object valueHandler = oVar.getValueHandler();
        return valueHandler != this.f69388e ? oVarWithTypeHandler.withValueHandler(valueHandler) : oVarWithTypeHandler;
    }

    public abstract o withStaticTyping();

    public abstract o withTypeHandler(Object obj);

    public abstract o withValueHandler(Object obj);

    @Override // hc.a
    public o getContentType() {
        return null;
    }

    @Override // hc.a
    public o getKeyType() {
        return null;
    }

    @Override // hc.a
    public o getReferencedType() {
        return null;
    }

    public o(cd.o oVar) {
        this.f69386b = oVar.f69386b;
        this.f69387c = oVar.f69387c;
        this.f69388e = oVar.f69388e;
        this.f69389f = oVar.f69389f;
        this.f69390g = oVar.f69390g;
    }

    @Deprecated
    public o forcedNarrowBy(Class<?> cls) {
        return this;
    }
}
