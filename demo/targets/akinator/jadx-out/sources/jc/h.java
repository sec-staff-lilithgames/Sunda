package jc;

import b0.e2;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;
import tb.f1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h {
    public static String a(String str, String str2) {
        return str2 == null ? str : w0.i.d(str, ": ", str2);
    }

    public static String b(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public static String c(String str) {
        if (str == null) {
            return "[N/A]";
        }
        if (str.length() > 500) {
            str = str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
        }
        return a.b.l("\"", str, "\"");
    }

    public abstract boolean canOverrideAccessModifiers();

    public abstract o constructSpecializedType(o oVar, Class<?> cls);

    public o constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public dd.m converterInstance(rc.b bVar, Object obj) throws r {
        if (obj == null) {
            return null;
        }
        if (obj instanceof dd.m) {
            return (dd.m) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls == dd.l.class || dd.i.isBogusClass(cls)) {
            return null;
        }
        if (!dd.m.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(e2.k(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        lc.z config = getConfig();
        lc.v handlerInstantiator = config.getHandlerInstantiator();
        dd.m mVarConverterInstance = handlerInstantiator != null ? handlerInstantiator.converterInstance(config, bVar, cls) : null;
        return mVarConverterInstance == null ? (dd.m) dd.i.createInstance(cls, config.canOverrideAccessModifiers()) : mVarConverterInstance;
    }

    public abstract Class<?> getActiveView();

    public abstract c getAnnotationIntrospector();

    public abstract Object getAttribute(Object obj);

    public abstract lc.z getConfig();

    public abstract lc.q getDatatypeFeatures();

    public abstract tb.t getDefaultPropertyFormat(Class<?> cls);

    public abstract Locale getLocale();

    public abstract TimeZone getTimeZone();

    public abstract cd.s getTypeFactory();

    public abstract r invalidTypeIdException(o oVar, String str, String str2);

    public abstract boolean isEnabled(y yVar);

    public abstract boolean isEnabled(lc.o oVar);

    public f1 objectIdGeneratorInstance(rc.b bVar, rc.t0 t0Var) throws r {
        Class<? extends f1> generatorType = t0Var.getGeneratorType();
        lc.z config = getConfig();
        lc.v handlerInstantiator = config.getHandlerInstantiator();
        f1 f1VarObjectIdGeneratorInstance = handlerInstantiator == null ? null : handlerInstantiator.objectIdGeneratorInstance(config, bVar, generatorType);
        if (f1VarObjectIdGeneratorInstance == null) {
            f1VarObjectIdGeneratorInstance = (f1) dd.i.createInstance(generatorType, config.canOverrideAccessModifiers());
        }
        return f1VarObjectIdGeneratorInstance.forScope(t0Var.getScope());
    }

    public j1 objectIdResolverInstance(rc.b bVar, rc.t0 t0Var) {
        Class<? extends j1> resolverType = t0Var.getResolverType();
        lc.z config = getConfig();
        lc.v handlerInstantiator = config.getHandlerInstantiator();
        j1 j1VarResolverIdGeneratorInstance = handlerInstantiator == null ? null : handlerInstantiator.resolverIdGeneratorInstance(config, bVar, resolverType);
        return j1VarResolverIdGeneratorInstance == null ? (j1) dd.i.createInstance(resolverType, config.canOverrideAccessModifiers()) : j1VarResolverIdGeneratorInstance;
    }

    public <T> T reportBadDefinition(Class<?> cls, String str) throws r {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public abstract <T> T reportBadDefinition(o oVar, String str) throws r;

    public abstract <T> T reportBadTypeDefinition(d dVar, String str, Object... objArr) throws r;

    public o resolveAndValidateSubType(o oVar, String str, wc.d dVar) throws r, IllegalArgumentException {
        int iIndexOf = str.indexOf(60);
        wc.e eVar = wc.e.f90537b;
        wc.e eVar2 = wc.e.f90538c;
        if (iIndexOf > 0) {
            lc.z config = getConfig();
            wc.e eVarValidateSubClassName = dVar.validateSubClassName(config, oVar, str.substring(0, iIndexOf));
            if (eVarValidateSubClassName == eVar2) {
                throw invalidTypeIdException(oVar, str, "Configured `PolymorphicTypeValidator` (of type " + dd.i.classNameOf(dVar) + ") denied resolution");
            }
            o oVarConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (!oVarConstructFromCanonical.isTypeOrSubTypeOf(oVar.getRawClass())) {
                throw invalidTypeIdException(oVar, str, "Not a subtype");
            }
            if (eVarValidateSubClassName == eVar || dVar.validateSubType(config, oVar, oVarConstructFromCanonical) == eVar) {
                return oVarConstructFromCanonical;
            }
            throw invalidTypeIdException(oVar, str, "Configured `PolymorphicTypeValidator` (of type " + dd.i.classNameOf(dVar) + ") denied resolution");
        }
        lc.z config2 = getConfig();
        wc.e eVarValidateSubClassName2 = dVar.validateSubClassName(config2, oVar, str);
        if (eVarValidateSubClassName2 == eVar2) {
            throw invalidTypeIdException(oVar, str, "Configured `PolymorphicTypeValidator` (of type " + dd.i.classNameOf(dVar) + ") denied resolution");
        }
        try {
            Class<?> clsFindClass = getTypeFactory().findClass(str);
            if (!oVar.isTypeOrSuperTypeOf(clsFindClass)) {
                throw invalidTypeIdException(oVar, str, "Not a subtype");
            }
            o oVarConstructSpecializedType = config2.getTypeFactory().constructSpecializedType(oVar, clsFindClass);
            if (eVarValidateSubClassName2 != wc.e.f90539e || dVar.validateSubType(config2, oVar, oVarConstructSpecializedType) == eVar) {
                return oVarConstructSpecializedType;
            }
            throw invalidTypeIdException(oVar, str, "Configured `PolymorphicTypeValidator` (of type " + dd.i.classNameOf(dVar) + ") denied resolution");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            throw invalidTypeIdException(oVar, str, a.b.m("problem: (", e10.getClass().getName(), ") ", dd.i.exceptionMessage(e10)));
        }
    }

    public o resolveSubType(o oVar, String str) throws IllegalArgumentException, r {
        if (str.indexOf(60) > 0) {
            o oVarConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (oVarConstructFromCanonical.isTypeOrSubTypeOf(oVar.getRawClass())) {
                return oVarConstructFromCanonical;
            }
        } else {
            try {
                Class<?> clsFindClass = getTypeFactory().findClass(str);
                if (oVar.isTypeOrSuperTypeOf(clsFindClass)) {
                    return getTypeFactory().constructSpecializedType(oVar, clsFindClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e10) {
                throw invalidTypeIdException(oVar, str, a.b.m("problem: (", e10.getClass().getName(), ") ", dd.i.exceptionMessage(e10)));
            }
        }
        throw invalidTypeIdException(oVar, str, "Not a subtype");
    }

    public abstract h setAttribute(Object obj, Object obj2);
}
