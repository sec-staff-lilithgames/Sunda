package qr;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    default boolean toBoolean(Object obj, boolean z10) {
        Boolean booleanOrNull = toBooleanOrNull(obj);
        return booleanOrNull != null ? booleanOrNull.booleanValue() : z10;
    }

    default Boolean toBooleanOrNull(Object obj) {
        return toBooleanOrNull(obj, null);
    }

    Boolean toBooleanOrNull(Object obj, Boolean bool);

    default double toDouble(Object obj, double d10) {
        Double doubleOrNull = toDoubleOrNull(obj);
        return doubleOrNull != null ? doubleOrNull.doubleValue() : d10;
    }

    default Double toDoubleOrNull(Object obj) {
        return toDoubleOrNull(obj, null);
    }

    Double toDoubleOrNull(Object obj, Double d10);

    default float toFloat(Object obj, float f10) {
        Float floatOrNull = toFloatOrNull(obj);
        return floatOrNull != null ? floatOrNull.floatValue() : f10;
    }

    default Float toFloatOrNull(Object obj) {
        return toFloatOrNull(obj, null);
    }

    Float toFloatOrNull(Object obj, Float f10);

    default int toInteger(Object obj, int i10) {
        Integer integerOrNull = toIntegerOrNull(obj);
        return integerOrNull != null ? integerOrNull.intValue() : i10;
    }

    default Integer toIntegerOrNull(Object obj) {
        return toIntegerOrNull(obj, null);
    }

    Integer toIntegerOrNull(Object obj, Integer num);

    List<Object> toListOrNull(Object obj);

    Map<Object, Object> toMapOrNull(Object obj);

    default <T> T toOrNull(Object obj) throws Exception {
        return (T) toOrNull(obj, null);
    }

    <T> T toOrNull(Object obj, T t10) throws Exception;

    default String toStringOrNull(Object obj) {
        return toStringOrNull(obj, null);
    }

    String toStringOrNull(Object obj, String str);
}
