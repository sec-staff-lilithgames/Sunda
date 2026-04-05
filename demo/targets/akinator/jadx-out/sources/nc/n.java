package nc;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import mc.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final a f75944c = new a();

        public a() {
            super(ArrayList.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new ArrayList();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends f {
        public b() {
            super(ConcurrentHashMap.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends f {

        /* renamed from: c, reason: collision with root package name */
        public final Object f75945c;

        public c(Object obj) {
            super(obj.getClass());
            this.f75945c = obj;
        }

        @Override // nc.n.f, mc.c0
        public final Object createUsingDefault(jc.k kVar) throws IOException {
            return this.f75945c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final d f75946c = new d();

        public d() {
            super(HashMap.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new HashMap();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final e f75947c = new e();

        public e() {
            super(HashSet.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new HashSet();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class f extends c0.a implements Serializable {
        public f(Class<?> cls) {
            super(cls);
        }

        @Override // mc.c0
        public final boolean canCreateUsingDefault() {
            return true;
        }

        @Override // mc.c0
        public final boolean canInstantiate() {
            return true;
        }

        @Override // mc.c0
        public abstract Object createUsingDefault(jc.k kVar) throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final g f75948c = new g();

        public g() {
            super(LinkedHashMap.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new LinkedHashMap();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h extends f {
        public h() {
            super(LinkedList.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new LinkedList();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i extends f {
        public i() {
            super(TreeMap.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new TreeMap();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j extends f {
        public j() {
            super(TreeSet.class);
        }

        @Override // nc.n.f, mc.c0
        public Object createUsingDefault(jc.k kVar) throws IOException {
            return new TreeSet();
        }
    }

    public static mc.c0 findStdValueInstantiator(jc.j jVar, Class<?> cls) {
        if (cls == ub.p.class) {
            return new oc.v();
        }
        if (!Collection.class.isAssignableFrom(cls)) {
            if (!Map.class.isAssignableFrom(cls)) {
                return null;
            }
            if (cls == LinkedHashMap.class) {
                return g.f75948c;
            }
            if (cls == HashMap.class) {
                return d.f75946c;
            }
            if (cls == ConcurrentHashMap.class) {
                return new b();
            }
            if (cls == TreeMap.class) {
                return new i();
            }
            Map map = Collections.EMPTY_MAP;
            if (cls == map.getClass()) {
                return new c(map);
            }
            return null;
        }
        if (cls == ArrayList.class) {
            return a.f75944c;
        }
        if (cls == HashSet.class) {
            return e.f75947c;
        }
        if (cls == LinkedList.class) {
            return new h();
        }
        if (cls == TreeSet.class) {
            return new j();
        }
        Set set = Collections.EMPTY_SET;
        if (cls == set.getClass()) {
            return new c(set);
        }
        List list = Collections.EMPTY_LIST;
        if (cls == list.getClass()) {
            return new c(list);
        }
        return null;
    }
}
