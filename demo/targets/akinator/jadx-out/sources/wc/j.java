package wc;

import ic.m0;
import java.io.IOException;
import tb.v0;
import ub.o;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public final void a(o oVar, hc.c cVar) throws IOException {
        cVar.f58733g = !oVar.canWriteTypeId();
        writeTypeSuffix(oVar, cVar);
    }

    public abstract j forProperty(jc.g gVar);

    public abstract String getPropertyName();

    public abstract h getTypeIdResolver();

    public abstract v0 getTypeInclusion();

    public hc.c typeId(Object obj, z zVar) {
        hc.c cVar = new hc.c(obj, zVar);
        int iOrdinal = getTypeInclusion().ordinal();
        if (iOrdinal == 0) {
            cVar.f58731e = 3;
            cVar.f58730d = getPropertyName();
            return cVar;
        }
        if (iOrdinal == 1) {
            cVar.f58731e = 2;
            return cVar;
        }
        if (iOrdinal == 2) {
            cVar.f58731e = 1;
            return cVar;
        }
        if (iOrdinal == 3) {
            cVar.f58731e = 5;
            cVar.f58730d = getPropertyName();
            return cVar;
        }
        if (iOrdinal != 4) {
            m0.throwInternal();
            return cVar;
        }
        cVar.f58731e = 4;
        cVar.f58730d = getPropertyName();
        return cVar;
    }

    @Deprecated
    public void writeCustomTypePrefixForArray(Object obj, o oVar, String str) throws IOException {
        writeTypePrefix(oVar, typeId(obj, z.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForObject(Object obj, o oVar, String str) throws IOException {
        writeTypePrefix(oVar, typeId(obj, z.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForScalar(Object obj, o oVar, String str) throws IOException {
        writeTypePrefix(oVar, typeId(obj, z.VALUE_STRING, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForArray(Object obj, o oVar, String str) throws IOException {
        a(oVar, typeId(obj, z.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForObject(Object obj, o oVar, String str) throws IOException {
        a(oVar, typeId(obj, z.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForScalar(Object obj, o oVar, String str) throws IOException {
        a(oVar, typeId(obj, z.VALUE_STRING, str));
    }

    public abstract hc.c writeTypePrefix(o oVar, hc.c cVar) throws IOException;

    @Deprecated
    public void writeTypePrefixForArray(Object obj, o oVar) throws IOException {
        writeTypePrefix(oVar, typeId(obj, z.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, o oVar) throws IOException {
        writeTypePrefix(oVar, typeId(obj, z.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, o oVar) throws IOException {
        writeTypePrefix(oVar, typeId(obj, z.VALUE_STRING));
    }

    public abstract hc.c writeTypeSuffix(o oVar, hc.c cVar) throws IOException;

    @Deprecated
    public void writeTypeSuffixForArray(Object obj, o oVar) throws IOException {
        a(oVar, typeId(obj, z.START_ARRAY));
    }

    @Deprecated
    public void writeTypeSuffixForObject(Object obj, o oVar) throws IOException {
        a(oVar, typeId(obj, z.START_OBJECT));
    }

    @Deprecated
    public void writeTypeSuffixForScalar(Object obj, o oVar) throws IOException {
        a(oVar, typeId(obj, z.VALUE_STRING));
    }

    @Deprecated
    public void writeTypePrefixForArray(Object obj, o oVar, Class<?> cls) throws IOException {
        writeTypePrefix(oVar, typeId(obj, cls, z.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, o oVar, Class<?> cls) throws IOException {
        writeTypePrefix(oVar, typeId(obj, cls, z.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, o oVar, Class<?> cls) throws IOException {
        writeTypePrefix(oVar, typeId(obj, cls, z.VALUE_STRING));
    }

    public hc.c typeId(Object obj, z zVar, Object obj2) {
        hc.c cVarTypeId = typeId(obj, zVar);
        cVarTypeId.f58729c = obj2;
        return cVarTypeId;
    }

    public hc.c typeId(Object obj, Class<?> cls, z zVar) {
        hc.c cVarTypeId = typeId(obj, zVar);
        cVarTypeId.f58728b = cls;
        return cVarTypeId;
    }
}
