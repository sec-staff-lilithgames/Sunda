package bd;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends y0 {
        public a() {
            super(AtomicBoolean.class);
        }

        @Override // bd.y0, bd.z0, jc.w, uc.e
        public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
            hVar.expectBooleanFormat(oVar);
        }

        @Override // bd.y0, bd.z0, vc.c
        @Deprecated
        public jc.t getSchema(jc.u0 u0Var, Type type) {
            return z0.a("boolean");
        }

        @Override // bd.z0, jc.w
        public void serialize(AtomicBoolean atomicBoolean, ub.o oVar, jc.u0 u0Var) throws IOException {
            oVar.writeBoolean(atomicBoolean.get());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends y0 {
        public b() {
            super(AtomicInteger.class);
        }

        @Override // bd.y0, bd.z0, jc.w, uc.e
        public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
            hVar.expectIntegerFormat(oVar);
        }

        @Override // bd.y0, bd.z0, vc.c
        @Deprecated
        public jc.t getSchema(jc.u0 u0Var, Type type) {
            return z0.a("integer");
        }

        @Override // bd.z0, jc.w
        public void serialize(AtomicInteger atomicInteger, ub.o oVar, jc.u0 u0Var) throws IOException {
            oVar.writeNumber(atomicInteger.get());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends y0 {
        public c() {
            super(AtomicLong.class);
        }

        @Override // bd.y0, bd.z0, jc.w, uc.e
        public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
            hVar.expectIntegerFormat(oVar);
        }

        @Override // bd.y0, bd.z0, vc.c
        @Deprecated
        public jc.t getSchema(jc.u0 u0Var, Type type) {
            return z0.a("integer");
        }

        @Override // bd.z0, jc.w
        public void serialize(AtomicLong atomicLong, ub.o oVar, jc.u0 u0Var) throws IOException {
            oVar.writeNumber(atomicLong.get());
        }
    }

    public static Collection<Map.Entry<Class<?>, Object>> all() {
        HashMap map = new HashMap();
        map.put(URL.class, new d1(URL.class));
        map.put(URI.class, new d1(URI.class));
        map.put(Currency.class, new d1(Currency.class));
        map.put(UUID.class, new g1());
        map.put(Pattern.class, new d1(Pattern.class));
        map.put(Locale.class, new d1(Locale.class));
        map.put(AtomicBoolean.class, a.class);
        map.put(AtomicInteger.class, b.class);
        map.put(AtomicLong.class, c.class);
        map.put(File.class, o.class);
        map.put(Class.class, i.class);
        v vVar = v.f9145e;
        map.put(Void.class, vVar);
        map.put(Void.TYPE, vVar);
        return map.entrySet();
    }
}
