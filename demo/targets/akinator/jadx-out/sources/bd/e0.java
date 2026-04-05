package bd;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e0 {
    public static void addAll(Map<String, jc.w> map) {
        map.put(Integer.class.getName(), new b0(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new b0(cls));
        map.put(Long.class.getName(), new c0(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new c0(cls2));
        String name = Byte.class.getName();
        a0 a0Var = a0.f9053g;
        map.put(name, a0Var);
        map.put(Byte.TYPE.getName(), a0Var);
        String name2 = Short.class.getName();
        d0 d0Var = d0.f9069g;
        map.put(name2, d0Var);
        map.put(Short.TYPE.getName(), d0Var);
        map.put(Double.class.getName(), new y(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new y(cls3));
        String name3 = Float.class.getName();
        z zVar = z.f9157g;
        map.put(name3, zVar);
        map.put(Float.TYPE.getName(), zVar);
    }
}
