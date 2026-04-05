package qr;

import io.bidmachine.Function;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f83486a;

    /* renamed from: b, reason: collision with root package name */
    public final b f83487b;

    public d() {
        this(new ConcurrentHashMap(), new e());
    }

    public void clear() {
        getParams().clear();
    }

    @Override // qr.c
    public boolean contains(Object obj) {
        return getParams().containsKey(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ boolean getBoolean(Object obj) {
        return super.getBoolean(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Boolean getBooleanOrNull(Object obj) {
        return super.getBooleanOrNull(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ double getDouble(Object obj) {
        return super.getDouble(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Double getDoubleOrNull(Object obj) {
        return super.getDoubleOrNull(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ float getFloat(Object obj) {
        return super.getFloat(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Float getFloatOrNull(Object obj) {
        return super.getFloatOrNull(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ int getInteger(Object obj) {
        return super.getInteger(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Integer getIntegerOrNull(Object obj) {
        return super.getIntegerOrNull(obj);
    }

    @Override // qr.c
    public List<Object> getListOrNull(Object obj) {
        return this.f83487b.toListOrNull(getObjectOrNull(obj, null));
    }

    @Override // qr.c
    public Map<Object, Object> getMapOrNull(Object obj) {
        return this.f83487b.toMapOrNull(getObjectOrNull(obj, null));
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Object getObjectOrNull(Object obj) {
        return super.getObjectOrNull(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Object getOrNull(Object obj) throws Exception {
        return super.getOrNull(obj);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Object getOrNullSafely(Object obj, Function function) {
        return super.getOrNullSafely(obj, function);
    }

    public Map<Object, Object> getParams() {
        return this.f83486a;
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ String getStringOrNull(Object obj) {
        return super.getStringOrNull(obj);
    }

    public void put(Object obj, Object obj2) {
        getParams().put(obj, obj2);
    }

    public void setParams(Map<Object, Object> map) {
        clear();
        if (map != null) {
            getParams().putAll(map);
        }
    }

    public d(Map<Object, Object> map, b bVar) {
        this.f83486a = map;
        this.f83487b = bVar;
    }

    @Override // qr.c
    public boolean getBoolean(Object obj, boolean z10) {
        return this.f83487b.toBoolean(getObjectOrNull(obj, Boolean.valueOf(z10)), z10);
    }

    @Override // qr.c
    public Boolean getBooleanOrNull(Object obj, Boolean bool) {
        return this.f83487b.toBooleanOrNull(getObjectOrNull(obj, bool), bool);
    }

    @Override // qr.c
    public double getDouble(Object obj, double d10) {
        return this.f83487b.toDouble(getObjectOrNull(obj, Double.valueOf(d10)), d10);
    }

    @Override // qr.c
    public Double getDoubleOrNull(Object obj, Double d10) {
        return this.f83487b.toDoubleOrNull(getObjectOrNull(obj, d10), d10);
    }

    @Override // qr.c
    public float getFloat(Object obj, float f10) {
        return this.f83487b.toFloat(getObjectOrNull(obj, Float.valueOf(f10)), f10);
    }

    @Override // qr.c
    public Float getFloatOrNull(Object obj, Float f10) {
        return this.f83487b.toFloatOrNull(getObjectOrNull(obj, f10), f10);
    }

    @Override // qr.c
    public int getInteger(Object obj, int i10) {
        return this.f83487b.toInteger(getObjectOrNull(obj, Integer.valueOf(i10)), i10);
    }

    @Override // qr.c
    public Integer getIntegerOrNull(Object obj, Integer num) {
        return this.f83487b.toIntegerOrNull(getObjectOrNull(obj, num), num);
    }

    @Override // qr.c
    public Object getObjectOrNull(Object obj, Object obj2) {
        return contains(obj) ? getParams().get(obj) : obj2;
    }

    @Override // qr.c
    public <T> T getOrNull(Object obj, T t10) throws Exception {
        return (T) this.f83487b.toOrNull(getObjectOrNull(obj, t10), t10);
    }

    @Override // qr.c, hr.k
    public /* bridge */ /* synthetic */ Object getOrNullSafely(Object obj, Object obj2, Function function) {
        return super.getOrNullSafely(obj, obj2, function);
    }

    @Override // qr.c
    public String getStringOrNull(Object obj, String str) {
        return this.f83487b.toStringOrNull(getObjectOrNull(obj, str), str);
    }
}
