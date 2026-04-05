package io.odeeo.internal.y1;

import j1.o2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import xv.f0;
import xv.k0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends n<Iterable<T>> {
        public a() {
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                n.this.a(pVar, it.next());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends n<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                n.this.a(pVar, Array.get(obj, i10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67621a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67622b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, u0> f67623c;

        public c(Method method, int i10, io.odeeo.internal.y1.f<T, u0> fVar) {
            this.f67621a = method;
            this.f67622b = i10;
            this.f67623c = fVar;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) {
            if (t10 == null) {
                throw w.a(this.f67621a, this.f67622b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                pVar.a(this.f67623c.convert(t10));
            } catch (IOException e10) {
                throw w.a(this.f67621a, e10, this.f67622b, o2.k(t10, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f67624a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67625b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f67626c;

        public d(String str, io.odeeo.internal.y1.f<T, String> fVar, boolean z10) {
            this.f67624a = (String) w.a(str, "name == null");
            this.f67625b = fVar;
            this.f67626c = z10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f67625b.convert(t10)) == null) {
                return;
            }
            pVar.a(this.f67624a, strConvert, this.f67626c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e<T> extends n<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67628b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67629c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f67630d;

        public e(Method method, int i10, io.odeeo.internal.y1.f<T, String> fVar, boolean z10) {
            this.f67627a = method;
            this.f67628b = i10;
            this.f67629c = fVar;
            this.f67630d = z10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw w.a(this.f67627a, this.f67628b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw w.a(this.f67627a, this.f67628b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw w.a(this.f67627a, this.f67628b, a.b.l("Field map contained null value for key '", key, "'."), new Object[0]);
                }
                String strConvert = this.f67629c.convert(value);
                if (strConvert == null) {
                    throw w.a(this.f67627a, this.f67628b, "Field map value '" + value + "' converted to null by " + this.f67629c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                pVar.a(key, strConvert, this.f67630d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f67631a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67632b;

        public f(String str, io.odeeo.internal.y1.f<T, String> fVar) {
            this.f67631a = (String) w.a(str, "name == null");
            this.f67632b = fVar;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f67632b.convert(t10)) == null) {
                return;
            }
            pVar.a(this.f67631a, strConvert);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g<T> extends n<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67633a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67634b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67635c;

        public g(Method method, int i10, io.odeeo.internal.y1.f<T, String> fVar) {
            this.f67633a = method;
            this.f67634b = i10;
            this.f67635c = fVar;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw w.a(this.f67633a, this.f67634b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw w.a(this.f67633a, this.f67634b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw w.a(this.f67633a, this.f67634b, a.b.l("Header map contained null value for key '", key, "'."), new Object[0]);
                }
                pVar.a(key, this.f67635c.convert(value));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends n<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67636a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67637b;

        public h(Method method, int i10) {
            this.f67636a = method;
            this.f67637b = i10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, f0 f0Var) {
            if (f0Var == null) {
                throw w.a(this.f67636a, this.f67637b, "Headers parameter must not be null.", new Object[0]);
            }
            pVar.a(f0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67638a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67639b;

        /* renamed from: c, reason: collision with root package name */
        public final f0 f67640c;

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, u0> f67641d;

        public i(Method method, int i10, f0 f0Var, io.odeeo.internal.y1.f<T, u0> fVar) {
            this.f67638a = method;
            this.f67639b = i10;
            this.f67640c = f0Var;
            this.f67641d = fVar;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                pVar.a(this.f67640c, this.f67641d.convert(t10));
            } catch (IOException e10) {
                throw w.a(this.f67638a, this.f67639b, o2.k(t10, "Unable to convert ", " to RequestBody"), e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j<T> extends n<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67642a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67643b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, u0> f67644c;

        /* renamed from: d, reason: collision with root package name */
        public final String f67645d;

        public j(Method method, int i10, io.odeeo.internal.y1.f<T, u0> fVar, String str) {
            this.f67642a = method;
            this.f67643b = i10;
            this.f67644c = fVar;
            this.f67645d = str;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw w.a(this.f67642a, this.f67643b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw w.a(this.f67642a, this.f67643b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw w.a(this.f67642a, this.f67643b, a.b.l("Part map contained null value for key '", key, "'."), new Object[0]);
                }
                pVar.a(f0.of("Content-Disposition", a.b.l("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.f67645d), this.f67644c.convert(value));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67646a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67647b;

        /* renamed from: c, reason: collision with root package name */
        public final String f67648c;

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67649d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f67650e;

        public k(Method method, int i10, String str, io.odeeo.internal.y1.f<T, String> fVar, boolean z10) {
            this.f67646a = method;
            this.f67647b = i10;
            this.f67648c = (String) w.a(str, "name == null");
            this.f67649d = fVar;
            this.f67650e = z10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) throws IOException {
            if (t10 == null) {
                throw w.a(this.f67646a, this.f67647b, o2.o(new StringBuilder("Path parameter \""), this.f67648c, "\" value must not be null."), new Object[0]);
            }
            pVar.b(this.f67648c, this.f67649d.convert(t10), this.f67650e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f67651a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67652b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f67653c;

        public l(String str, io.odeeo.internal.y1.f<T, String> fVar, boolean z10) {
            this.f67651a = (String) w.a(str, "name == null");
            this.f67652b = fVar;
            this.f67653c = z10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f67652b.convert(t10)) == null) {
                return;
            }
            pVar.c(this.f67651a, strConvert, this.f67653c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m<T> extends n<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67654a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67655b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67656c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f67657d;

        public m(Method method, int i10, io.odeeo.internal.y1.f<T, String> fVar, boolean z10) {
            this.f67654a = method;
            this.f67655b = i10;
            this.f67656c = fVar;
            this.f67657d = z10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw w.a(this.f67654a, this.f67655b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw w.a(this.f67654a, this.f67655b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw w.a(this.f67654a, this.f67655b, a.b.l("Query map contained null value for key '", key, "'."), new Object[0]);
                }
                String strConvert = this.f67656c.convert(value);
                if (strConvert == null) {
                    throw w.a(this.f67654a, this.f67655b, "Query map value '" + value + "' converted to null by " + this.f67656c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                pVar.c(key, strConvert, this.f67657d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.y1.n$n, reason: collision with other inner class name */
    public static final class C0694n<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.y1.f<T, String> f67658a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67659b;

        public C0694n(io.odeeo.internal.y1.f<T, String> fVar, boolean z10) {
            this.f67658a = fVar;
            this.f67659b = z10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            pVar.c(this.f67658a.convert(t10), null, this.f67659b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o extends n<k0.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f67660a = new o();

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, k0.c cVar) {
            if (cVar != null) {
                pVar.a(cVar);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p extends n<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f67661a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67662b;

        public p(Method method, int i10) {
            this.f67661a = method;
            this.f67662b = i10;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, Object obj) {
            if (obj == null) {
                throw w.a(this.f67661a, this.f67662b, "@Url parameter is null.", new Object[0]);
            }
            pVar.a(obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class q<T> extends n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f67663a;

        public q(Class<T> cls) {
            this.f67663a = cls;
        }

        @Override // io.odeeo.internal.y1.n
        public void a(io.odeeo.internal.y1.p pVar, T t10) {
            pVar.a((Class<Class<T>>) this.f67663a, (Class<T>) t10);
        }
    }

    public final n<Object> a() {
        return new b();
    }

    public abstract void a(io.odeeo.internal.y1.p pVar, T t10) throws IOException;

    public final n<Iterable<T>> b() {
        return new a();
    }
}
