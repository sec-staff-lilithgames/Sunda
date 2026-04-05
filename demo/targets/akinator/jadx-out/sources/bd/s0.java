package bd;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9117a;

    static {
        HashMap map = new HashMap();
        f9117a = map;
        map.put(boolean[].class.getName(), new k0());
        map.put(byte[].class.getName(), new f());
        map.put(char[].class.getName(), new l0());
        map.put(short[].class.getName(), new q0());
        map.put(int[].class.getName(), new o0());
        map.put(long[].class.getName(), new p0());
        map.put(float[].class.getName(), new n0());
        map.put(double[].class.getName(), new m0());
    }

    public static jc.o a(Class cls) {
        return cd.s.defaultInstance().uncheckedSimpleType(cls);
    }

    public static jc.w findStandardImpl(Class<?> cls) {
        return (jc.w) f9117a.get(cls.getName());
    }
}
