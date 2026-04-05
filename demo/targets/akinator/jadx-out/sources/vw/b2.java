package vw;

import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f89704a = new ax.b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements a2 {

        /* renamed from: a, reason: collision with root package name */
        public Object f89705a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f89706b;

        public a(Class cls) {
            this.f89706b = cls;
        }

        @Override // vw.a2
        public Object getInstance() throws Exception {
            if (this.f89705a == null) {
                this.f89705a = b2.this.a(this.f89706b);
            }
            return this.f89705a;
        }

        @Override // vw.a2
        public Class getType() {
            return this.f89706b;
        }

        @Override // vw.a2
        public boolean isReference() {
            return false;
        }

        @Override // vw.a2
        public Object setInstance(Object obj) throws Exception {
            this.f89705a = obj;
            return obj;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements a2 {

        /* renamed from: a, reason: collision with root package name */
        public final xw.g f89708a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f89709b;

        public b(xw.g gVar) {
            this.f89709b = gVar.getType();
            this.f89708a = gVar;
        }

        @Override // vw.a2
        public Object getInstance() throws Exception {
            xw.g gVar = this.f89708a;
            if (gVar.isReference()) {
                return gVar.getValue();
            }
            Object objA = b2.this.a(this.f89709b);
            if (gVar != null) {
                gVar.setValue(objA);
            }
            return objA;
        }

        @Override // vw.a2
        public Class getType() {
            return this.f89709b;
        }

        @Override // vw.a2
        public boolean isReference() {
            return this.f89708a.isReference();
        }

        @Override // vw.a2
        public Object setInstance(Object obj) {
            xw.g gVar = this.f89708a;
            if (gVar != null) {
                gVar.setValue(obj);
            }
            return obj;
        }
    }

    public final Object a(Class cls) throws NoSuchMethodException, SecurityException {
        ax.b bVar = this.f89704a;
        Constructor declaredConstructor = (Constructor) bVar.fetch(cls);
        if (declaredConstructor == null) {
            declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            bVar.cache(cls, declaredConstructor);
        }
        return declaredConstructor.newInstance(null);
    }

    public a2 getInstance(xw.g gVar) {
        return new b(gVar);
    }

    public a2 getInstance(Class cls) {
        return new a(cls);
    }
}
