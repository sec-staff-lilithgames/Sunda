package io.ktor.util.converters;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;
import jv.a;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConversionServiceJvmKt {
    private static final Object convertSimpleTypes(String str, KClass<?> kClass) {
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Integer.class))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Float.class))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Double.class))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Long.class))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Short.class))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Boolean.class))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(String.class))) {
            return str;
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(Character.class))) {
            return Character.valueOf(str.charAt(0));
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(BigDecimal.class))) {
            return new BigDecimal(str);
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(BigInteger.class))) {
            return new BigInteger(str);
        }
        if (e0.areEqual(kClass, c1.getOrCreateKotlinClass(UUID.class))) {
            return UUID.fromString(str);
        }
        return null;
    }

    public static final Object platformDefaultFromValues(String value, KClass<?> klass) throws DataConversionException {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(klass, "klass");
        Object objConvertSimpleTypes = convertSimpleTypes(value, klass);
        if (objConvertSimpleTypes != null) {
            return objConvertSimpleTypes;
        }
        Object obj = null;
        if (!a.getJavaClass((KClass) klass).isEnum()) {
            return null;
        }
        Object[] enumConstants = a.getJavaClass((KClass) klass).getEnumConstants();
        if (enumConstants != null) {
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Object obj2 = enumConstants[i10];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (e0.areEqual(((Enum) obj2).name(), value)) {
                    obj = obj2;
                    break;
                }
                i10++;
            }
            if (obj != null) {
                return obj;
            }
        }
        throw new DataConversionException("Value " + value + " is not a enum member name of " + klass);
    }

    public static final List<String> platformDefaultToValues(Object value) {
        e0.checkNotNullParameter(value, "value");
        if (value instanceof Enum) {
            return o0.listOf(((Enum) value).name());
        }
        if (value instanceof Integer) {
            return o0.listOf(value.toString());
        }
        if (value instanceof Float) {
            return o0.listOf(value.toString());
        }
        if (value instanceof Double) {
            return o0.listOf(value.toString());
        }
        if (value instanceof Long) {
            return o0.listOf(value.toString());
        }
        if (value instanceof Boolean) {
            return o0.listOf(value.toString());
        }
        if (value instanceof Short) {
            return o0.listOf(value.toString());
        }
        if (value instanceof String) {
            return o0.listOf(value.toString());
        }
        if (value instanceof Character) {
            return o0.listOf(value.toString());
        }
        if (value instanceof BigDecimal) {
            return o0.listOf(value.toString());
        }
        if (value instanceof BigInteger) {
            return o0.listOf(value.toString());
        }
        if (value instanceof UUID) {
            return o0.listOf(value.toString());
        }
        return null;
    }
}
