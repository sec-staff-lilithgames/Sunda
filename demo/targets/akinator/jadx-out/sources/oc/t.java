package oc;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t extends c1 {
    public static t findDeserializer(Class<?> cls) {
        int i10;
        if (cls == File.class) {
            i10 = 1;
        } else if (cls == URL.class) {
            i10 = 2;
        } else if (cls == URI.class) {
            i10 = 3;
        } else if (cls == Class.class) {
            i10 = 4;
        } else if (cls == jc.o.class) {
            i10 = 5;
        } else if (cls == Currency.class) {
            i10 = 6;
        } else if (cls == Pattern.class) {
            i10 = 7;
        } else if (cls == Locale.class) {
            i10 = 8;
        } else if (cls == Charset.class) {
            i10 = 9;
        } else if (cls == TimeZone.class) {
            i10 = 10;
        } else if (cls == InetAddress.class) {
            i10 = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new s();
                }
                if (cls == StringBuffer.class) {
                    return new r();
                }
                return null;
            }
            i10 = 12;
        }
        return new q(cls, i10);
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, jc.o.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
    }

    public abstract Object V(String str, jc.k kVar);

    public Object W(jc.k kVar, Object obj) throws jc.r {
        kVar.reportInputMismatch(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.f78945b.getName());
        return null;
    }

    public final Object X(jc.k kVar) throws jc.r {
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), this.f78945b, lc.f.f73109h);
        if (cVarFindCoercionAction == lc.c.f73085b) {
            kVar.reportInputMismatch(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", m());
        }
        return cVarFindCoercionAction == lc.c.f73087e ? getNullValue(kVar) : cVarFindCoercionAction == lc.c.f73088f ? getEmptyValue(kVar) : a(kVar);
    }

    public boolean Y() {
        return true;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        String valueAsString = uVar.getValueAsString();
        Class<?> cls = this.f78945b;
        if (valueAsString == null) {
            ub.z zVarCurrentToken = uVar.currentToken();
            if (zVarCurrentToken != ub.z.START_OBJECT) {
                if (zVarCurrentToken == ub.z.START_ARRAY) {
                    return n(uVar, kVar);
                }
                if (zVarCurrentToken != ub.z.VALUE_EMBEDDED_OBJECT) {
                    return kVar.handleUnexpectedToken(cls, uVar);
                }
                Object embeddedObject = uVar.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                return cls.isAssignableFrom(embeddedObject.getClass()) ? embeddedObject : W(kVar, embeddedObject);
            }
            valueAsString = kVar.extractScalarFromObject(uVar, this, cls);
        }
        if (valueAsString.isEmpty()) {
            return X(kVar);
        }
        if (Y()) {
            String strTrim = valueAsString.trim();
            if (strTrim != valueAsString && strTrim.isEmpty()) {
                return X(kVar);
            }
            valueAsString = strTrim;
        }
        try {
            return V(valueAsString, kVar);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            String message = e10.getMessage();
            throw kVar.weirdStringException(valueAsString, cls, message != null ? "not a valid textual representation, problem: ".concat(message) : "not a valid textual representation").withCause(e10);
        }
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12151o;
    }
}
