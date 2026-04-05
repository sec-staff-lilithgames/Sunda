package qr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements b {
    @Override // qr.b
    public /* bridge */ /* synthetic */ boolean toBoolean(Object obj, boolean z10) {
        return super.toBoolean(obj, z10);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ Boolean toBooleanOrNull(Object obj) {
        return super.toBooleanOrNull(obj);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ double toDouble(Object obj, double d10) {
        return super.toDouble(obj, d10);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ Double toDoubleOrNull(Object obj) {
        return super.toDoubleOrNull(obj);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ float toFloat(Object obj, float f10) {
        return super.toFloat(obj, f10);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ Float toFloatOrNull(Object obj) {
        return super.toFloatOrNull(obj);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ int toInteger(Object obj, int i10) {
        return super.toInteger(obj, i10);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ Integer toIntegerOrNull(Object obj) {
        return super.toIntegerOrNull(obj);
    }

    @Override // qr.b
    public List<Object> toListOrNull(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }

    @Override // qr.b
    public Map<Object, Object> toMapOrNull(Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ Object toOrNull(Object obj) throws Exception {
        return super.toOrNull(obj);
    }

    @Override // qr.b
    public /* bridge */ /* synthetic */ String toStringOrNull(Object obj) {
        return super.toStringOrNull(obj);
    }

    @Override // qr.b
    public Boolean toBooleanOrNull(Object obj, Boolean bool) {
        return obj instanceof Boolean ? (Boolean) obj : bool;
    }

    @Override // qr.b
    public Double toDoubleOrNull(Object obj, Double d10) {
        return obj instanceof Double ? (Double) obj : d10;
    }

    @Override // qr.b
    public Float toFloatOrNull(Object obj, Float f10) {
        return obj instanceof Float ? (Float) obj : f10;
    }

    @Override // qr.b
    public Integer toIntegerOrNull(Object obj, Integer num) {
        return obj instanceof Integer ? (Integer) obj : num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qr.b
    public <T> T toOrNull(Object obj, T t10) throws Exception {
        return obj != 0 ? obj : t10;
    }

    @Override // qr.b
    public String toStringOrNull(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }
}
