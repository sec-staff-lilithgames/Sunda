package io.ktor.util.converters;

import a.b;
import io.ktor.util.reflect.TypeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import sv.p0;
import tu.k;
import uu.o0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DefaultConversionService implements ConversionService {
    public static final DefaultConversionService INSTANCE = new DefaultConversionService();

    private DefaultConversionService() {
    }

    private final Object convertPrimitives(KClass<?> kClass, String str) {
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Integer.TYPE))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Float.TYPE))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Double.TYPE))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Long.TYPE))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Short.TYPE))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Character.TYPE))) {
            return Character.valueOf(p0.single(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Boolean.TYPE))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(String.class))) {
            return str;
        }
        return null;
    }

    private final Void throwConversionException(String str) throws DataConversionException {
        throw new DataConversionException(b.l("Type ", str, " is not supported in default data conversion service"));
    }

    public final Object fromValue(String value, KClass<?> klass) throws DataConversionException {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(klass, "klass");
        Object objConvertPrimitives = convertPrimitives(klass, value);
        if (objConvertPrimitives != null) {
            return objConvertPrimitives;
        }
        Object objPlatformDefaultFromValues = ConversionServiceJvmKt.platformDefaultFromValues(value, klass);
        if (objPlatformDefaultFromValues != null) {
            return objPlatformDefaultFromValues;
        }
        throwConversionException(klass.toString());
        throw new k();
    }

    @Override // io.ktor.util.converters.ConversionService
    public Object fromValues(List<String> values, TypeInfo type) throws DataConversionException {
        List<KTypeProjection> arguments;
        KTypeProjection kTypeProjection;
        KType type2;
        e0.checkNotNullParameter(values, "values");
        e0.checkNotNullParameter(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        if (e0.areEqual(type.getType(), c1.getOrCreateKotlinClass(List.class)) || e0.areEqual(type.getType(), c1.getOrCreateKotlinClass(List.class))) {
            KType kotlinType = type.getKotlinType();
            Object classifier = (kotlinType == null || (arguments = kotlinType.getArguments()) == null || (kTypeProjection = (KTypeProjection) y0.single((List) arguments)) == null || (type2 = kTypeProjection.getType()) == null) ? null : type2.getClassifier();
            KClass<?> kClass = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass != null) {
                List<String> list = values;
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.fromValue((String) it.next(), kClass));
                }
                return arrayList;
            }
        }
        if (values.isEmpty()) {
            throw new DataConversionException("There are no values when trying to construct single value " + type);
        }
        if (values.size() <= 1) {
            return fromValue((String) y0.single((List) values), type.getType());
        }
        throw new DataConversionException("There are multiple values when trying to construct single value " + type);
    }

    @Override // io.ktor.util.converters.ConversionService
    public List<String> toValues(Object obj) throws DataConversionException {
        if (obj == null) {
            return uu.p0.emptyList();
        }
        List<String> listPlatformDefaultToValues = ConversionServiceJvmKt.platformDefaultToValues(obj);
        if (listPlatformDefaultToValues != null) {
            return listPlatformDefaultToValues;
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                v0.addAll(arrayList, INSTANCE.toValues(it.next()));
            }
            return arrayList;
        }
        KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(obj.getClass());
        if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Integer.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Float.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Double.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Long.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Short.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Character.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Boolean.TYPE)) ? true : e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(String.class))) {
            return o0.listOf(obj.toString());
        }
        throw new DataConversionException("Class " + orCreateKotlinClass + " is not supported in default data conversion service");
    }
}
