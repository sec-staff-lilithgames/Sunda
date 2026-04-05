package wc;

import java.io.IOException;
import jc.k;
import jc.o;
import tb.v0;
import ub.u;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {
    public static Object deserializeIfNatural(u uVar, k kVar, o oVar) throws IOException {
        return deserializeIfNatural(uVar, kVar, oVar.getRawClass());
    }

    public abstract Object deserializeTypedFromAny(u uVar, k kVar) throws IOException;

    public abstract Object deserializeTypedFromArray(u uVar, k kVar) throws IOException;

    public abstract Object deserializeTypedFromObject(u uVar, k kVar) throws IOException;

    public abstract Object deserializeTypedFromScalar(u uVar, k kVar) throws IOException;

    public abstract g forProperty(jc.g gVar);

    public abstract Class<?> getDefaultImpl();

    public abstract String getPropertyName();

    public abstract h getTypeIdResolver();

    public abstract v0 getTypeInclusion();

    public boolean hasDefaultImpl() {
        return getDefaultImpl() != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object deserializeIfNatural(u uVar, k kVar, Class<?> cls) throws IOException {
        z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == null) {
            return null;
        }
        switch (zVarCurrentToken.ordinal()) {
            case 7:
                if (cls.isAssignableFrom(String.class)) {
                    return uVar.getText();
                }
                return null;
            case 8:
                if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(uVar.getIntValue());
                }
                return null;
            case 9:
                if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(uVar.getDoubleValue());
                }
                return null;
            case 10:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.TRUE;
                }
                return null;
            case 11:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }
}
