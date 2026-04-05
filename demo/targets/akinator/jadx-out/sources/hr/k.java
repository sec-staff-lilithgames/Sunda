package hr;

import io.bidmachine.Function;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface k extends qr.c {
    @Override // qr.c
    /* synthetic */ boolean contains(Object obj);

    /* bridge */ /* synthetic */ default boolean getBoolean(Object obj) {
        return super.getBoolean(obj);
    }

    @Override // qr.c
    /* synthetic */ boolean getBoolean(Object obj, boolean z10);

    /* bridge */ /* synthetic */ default Boolean getBooleanOrNull(Object obj) {
        return super.getBooleanOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ Boolean getBooleanOrNull(Object obj, Boolean bool);

    /* bridge */ /* synthetic */ default double getDouble(Object obj) {
        return super.getDouble(obj);
    }

    @Override // qr.c
    /* synthetic */ double getDouble(Object obj, double d10);

    /* bridge */ /* synthetic */ default Double getDoubleOrNull(Object obj) {
        return super.getDoubleOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ Double getDoubleOrNull(Object obj, Double d10);

    /* bridge */ /* synthetic */ default float getFloat(Object obj) {
        return super.getFloat(obj);
    }

    @Override // qr.c
    /* synthetic */ float getFloat(Object obj, float f10);

    /* bridge */ /* synthetic */ default Float getFloatOrNull(Object obj) {
        return super.getFloatOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ Float getFloatOrNull(Object obj, Float f10);

    /* bridge */ /* synthetic */ default int getInteger(Object obj) {
        return super.getInteger(obj);
    }

    @Override // qr.c
    /* synthetic */ int getInteger(Object obj, int i10);

    /* bridge */ /* synthetic */ default Integer getIntegerOrNull(Object obj) {
        return super.getIntegerOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ Integer getIntegerOrNull(Object obj, Integer num);

    @Override // qr.c
    /* synthetic */ List getListOrNull(Object obj);

    @Override // qr.c
    /* synthetic */ Map getMapOrNull(Object obj);

    /* bridge */ /* synthetic */ default Object getObjectOrNull(Object obj) {
        return super.getObjectOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ Object getObjectOrNull(Object obj, Object obj2);

    /* bridge */ /* synthetic */ default Object getOrNull(Object obj) throws Exception {
        return super.getOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ Object getOrNull(Object obj, Object obj2) throws Exception;

    /* bridge */ /* synthetic */ default Object getOrNullSafely(Object obj, Function function) {
        return super.getOrNullSafely(obj, function);
    }

    /* bridge */ /* synthetic */ default String getStringOrNull(Object obj) {
        return super.getStringOrNull(obj);
    }

    @Override // qr.c
    /* synthetic */ String getStringOrNull(Object obj, String str);

    /* bridge */ /* synthetic */ default Object getOrNullSafely(Object obj, Object obj2, Function function) {
        return super.getOrNullSafely(obj, obj2, function);
    }
}
