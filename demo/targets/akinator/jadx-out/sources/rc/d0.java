package rc;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jc.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d0 implements dd.b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final tb.d0 f84151b = tb.d0.empty();

    public boolean couldDeserialize() {
        return getMutator() != null;
    }

    public boolean couldSerialize() {
        return getAccessor() != null;
    }

    public List<jc.n0> findAliases() {
        return Collections.EMPTY_LIST;
    }

    public abstract tb.d0 findInclusion();

    public t0 findObjectIdInfo() {
        return null;
    }

    public String findReferenceName() {
        c.a aVarFindReferenceType = findReferenceType();
        if (aVarFindReferenceType == null) {
            return null;
        }
        return aVarFindReferenceType.getName();
    }

    public c.a findReferenceType() {
        return null;
    }

    public Class<?>[] findViews() {
        return null;
    }

    public l getAccessor() {
        m getter = getGetter();
        return getter == null ? getField() : getter;
    }

    public abstract q getConstructorParameter();

    public Iterator<q> getConstructorParameters() {
        return dd.i.emptyIterator();
    }

    public abstract i getField();

    public abstract jc.n0 getFullName();

    public abstract m getGetter();

    public abstract String getInternalName();

    public abstract jc.m0 getMetadata();

    public l getMutator() {
        q constructorParameter = getConstructorParameter();
        if (constructorParameter != null) {
            return constructorParameter;
        }
        m setter = getSetter();
        return setter == null ? getField() : setter;
    }

    @Override // dd.b0
    public abstract String getName();

    public l getNonConstructorMutator() {
        m setter = getSetter();
        return setter == null ? getField() : setter;
    }

    public abstract l getPrimaryMember();

    public abstract jc.o getPrimaryType();

    public abstract Class<?> getRawPrimaryType();

    public abstract m getSetter();

    public abstract jc.n0 getWrapperName();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasGetter();

    public boolean hasName(jc.n0 n0Var) {
        return getFullName().equals(n0Var);
    }

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public boolean isExplicitlyNamed() {
        return isExplicitlyIncluded();
    }

    public boolean isRequired() {
        return getMetadata().isRequired();
    }

    public boolean isTypeId() {
        return false;
    }

    public abstract d0 withName(jc.n0 n0Var);

    public abstract d0 withSimpleName(String str);
}
