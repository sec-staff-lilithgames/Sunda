package qr;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final a f83488a = new a();

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
        return this.f83488a.toListOrNull(obj);
    }

    @Override // qr.b
    public Map<Object, Object> toMapOrNull(Object obj) {
        return this.f83488a.toMapOrNull(obj);
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
        if (obj != null) {
            a aVar = this.f83488a;
            Boolean booleanOrNull = aVar.toBooleanOrNull(obj);
            if (booleanOrNull != null) {
                return booleanOrNull;
            }
            String stringOrNull = aVar.toStringOrNull(obj);
            if (stringOrNull != null) {
                try {
                    return Boolean.valueOf(stringOrNull);
                } catch (Exception e10) {
                    nm.a.w(e10);
                    return bool;
                }
            }
        }
        return bool;
    }

    @Override // qr.b
    public Double toDoubleOrNull(Object obj, Double d10) {
        if (obj != null) {
            a aVar = this.f83488a;
            Double doubleOrNull = aVar.toDoubleOrNull(obj);
            if (doubleOrNull != null) {
                return doubleOrNull;
            }
            Integer integerOrNull = aVar.toIntegerOrNull(obj);
            if (integerOrNull != null) {
                return Double.valueOf(integerOrNull.doubleValue());
            }
            String stringOrNull = toStringOrNull(obj);
            if (stringOrNull != null) {
                try {
                    return Double.valueOf(stringOrNull);
                } catch (Exception e10) {
                    nm.a.w(e10);
                }
            }
        }
        return d10;
    }

    @Override // qr.b
    public Float toFloatOrNull(Object obj, Float f10) {
        if (obj != null) {
            a aVar = this.f83488a;
            Float floatOrNull = aVar.toFloatOrNull(obj);
            if (floatOrNull != null) {
                return floatOrNull;
            }
            Integer integerOrNull = aVar.toIntegerOrNull(obj);
            if (integerOrNull != null) {
                return Float.valueOf(integerOrNull.floatValue());
            }
            String stringOrNull = toStringOrNull(obj);
            if (stringOrNull != null) {
                try {
                    return Float.valueOf(stringOrNull);
                } catch (Exception e10) {
                    nm.a.w(e10);
                }
            }
        }
        return f10;
    }

    @Override // qr.b
    public Integer toIntegerOrNull(Object obj, Integer num) {
        if (obj != null) {
            a aVar = this.f83488a;
            Integer integerOrNull = aVar.toIntegerOrNull(obj);
            if (integerOrNull != null) {
                return integerOrNull;
            }
            Double doubleOrNull = aVar.toDoubleOrNull(obj);
            if (doubleOrNull != null) {
                return Integer.valueOf(doubleOrNull.intValue());
            }
            Float floatOrNull = aVar.toFloatOrNull(obj);
            if (floatOrNull != null) {
                return Integer.valueOf(floatOrNull.intValue());
            }
            String stringOrNull = aVar.toStringOrNull(obj);
            if (stringOrNull != null) {
                try {
                    return Integer.valueOf(stringOrNull);
                } catch (Exception e10) {
                    nm.a.w(e10);
                }
            }
        }
        return num;
    }

    @Override // qr.b
    public <T> T toOrNull(Object obj, T t10) throws Exception {
        return (T) this.f83488a.toOrNull(obj, t10);
    }

    @Override // qr.b
    public String toStringOrNull(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        String stringOrNull = this.f83488a.toStringOrNull(obj);
        if (stringOrNull != null) {
            return stringOrNull;
        }
        try {
            return String.valueOf(obj);
        } catch (Exception e10) {
            nm.a.w(e10);
            return str;
        }
    }
}
