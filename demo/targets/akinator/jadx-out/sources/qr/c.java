package qr;

import io.bidmachine.Function;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c {
    boolean contains(Object obj);

    default boolean getBoolean(Object obj) {
        return getBoolean(obj, false);
    }

    boolean getBoolean(Object obj, boolean z10);

    default Boolean getBooleanOrNull(Object obj) {
        return getBooleanOrNull(obj, Boolean.FALSE);
    }

    Boolean getBooleanOrNull(Object obj, Boolean bool);

    default double getDouble(Object obj) {
        return getDouble(obj, 0.0d);
    }

    double getDouble(Object obj, double d10);

    default Double getDoubleOrNull(Object obj) {
        return getDoubleOrNull(obj, null);
    }

    Double getDoubleOrNull(Object obj, Double d10);

    default float getFloat(Object obj) {
        return getFloat(obj, 0.0f);
    }

    float getFloat(Object obj, float f10);

    default Float getFloatOrNull(Object obj) {
        return getFloatOrNull(obj, null);
    }

    Float getFloatOrNull(Object obj, Float f10);

    default int getInteger(Object obj) {
        return getInteger(obj, 0);
    }

    int getInteger(Object obj, int i10);

    default Integer getIntegerOrNull(Object obj) {
        return getIntegerOrNull(obj, null);
    }

    Integer getIntegerOrNull(Object obj, Integer num);

    List<Object> getListOrNull(Object obj);

    Map<Object, Object> getMapOrNull(Object obj);

    default Object getObjectOrNull(Object obj) {
        return getObjectOrNull(obj, null);
    }

    Object getObjectOrNull(Object obj, Object obj2);

    default <T> T getOrNull(Object obj) throws Exception {
        return (T) getOrNull(obj, null);
    }

    <T> T getOrNull(Object obj, T t10) throws Exception;

    default <T> T getOrNullSafely(Object obj, Function<Object, T> function) {
        return (T) getOrNullSafely(obj, null, function);
    }

    default String getStringOrNull(Object obj) {
        return getStringOrNull(obj, null);
    }

    String getStringOrNull(Object obj, String str);

    default <T> T getOrNullSafely(Object obj, T t10, Function<Object, T> function) {
        try {
            Object objectOrNull = getObjectOrNull(obj, t10);
            if (objectOrNull == null) {
                return null;
            }
            return function.apply(objectOrNull);
        } catch (Exception unused) {
            return t10;
        }
    }
}
