package androidx.lifecycle;

import android.app.Application;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.lang.reflect.InvocationTargetException;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class j3 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6623b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final e f6624c;

    /* renamed from: a, reason: collision with root package name */
    public final b5.g f6625a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ j3 create$default(b bVar, m3 m3Var, l3 l3Var, b5.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                l3Var = c5.d.f11806a;
            }
            if ((i10 & 4) != 0) {
                aVar = b5.b.f8750c;
            }
            return bVar.create(m3Var, l3Var, aVar);
        }

        public final j3 create(n3 owner, l3 factory, b5.a extras) {
            kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
            kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
            kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
            return new j3(owner.getViewModelStore(), factory, extras);
        }

        public final j3 create(m3 store, l3 factory, b5.a extras) {
            kotlin.jvm.internal.e0.checkNotNullParameter(store, "store");
            kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
            kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
            return new j3(store, factory, extras);
        }

        public static /* synthetic */ j3 create$default(b bVar, n3 n3Var, l3 l3Var, b5.a aVar, int i10, Object obj) {
            int i11 = i10 & 2;
            c5.h hVar = c5.h.f11812a;
            if (i11 != 0) {
                l3Var = hVar.getDefaultFactory$lifecycle_viewmodel_release(n3Var);
            }
            if ((i10 & 4) != 0) {
                aVar = hVar.getDefaultCreationExtras$lifecycle_viewmodel_release(n3Var);
            }
            return bVar.create(n3Var, l3Var, aVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class c implements l3 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6630a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public static c f6631b;

        static {
            b bVar = j3.f6623b;
        }

        public static final c getInstance() {
            return f6630a.getInstance();
        }

        @Override // androidx.lifecycle.l3
        public <T extends g3> T create(Class<T> modelClass) {
            kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
            return (T) c5.e.f11807a.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.l3
        public <T extends g3> T create(Class<T> modelClass, b5.a extras) {
            kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.l3
        public <T extends g3> T create(KClass<T> modelClass, b5.a extras) {
            kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
            return (T) create(jv.a.getJavaClass((KClass) modelClass), extras);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }

            public final c getInstance() {
                if (c.f6631b == null) {
                    c.f6631b = new c();
                }
                c cVar = c.f6631b;
                kotlin.jvm.internal.e0.checkNotNull(cVar);
                return cVar;
            }

            public static /* synthetic */ void getInstance$annotations() {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class d {
        public void onRequery(g3 viewModel) {
            kotlin.jvm.internal.e0.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class e implements b5.c {
    }

    static {
        int i10 = b5.a.f8748b;
        f6624c = new e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j3(m3 store, l3 factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(store, "store");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
    }

    public static final j3 create(m3 m3Var, l3 l3Var, b5.a aVar) {
        return f6623b.create(m3Var, l3Var, aVar);
    }

    public final <T extends g3> T get(KClass<T> modelClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        return (T) b5.g.getViewModel$lifecycle_viewmodel_release$default(this.f6625a, modelClass, null, 2, null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final C0005a f6626d = new C0005a(null);

        /* renamed from: e, reason: collision with root package name */
        public static a f6627e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f6628f;

        /* renamed from: c, reason: collision with root package name */
        public final Application f6629c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: androidx.lifecycle.j3$a$a, reason: collision with other inner class name */
        public static final class C0005a {
            public C0005a(kotlin.jvm.internal.u uVar) {
            }

            public final a getInstance(Application application) {
                kotlin.jvm.internal.e0.checkNotNullParameter(application, "application");
                if (a.f6627e == null) {
                    a.f6627e = new a(application);
                }
                a aVar = a.f6627e;
                kotlin.jvm.internal.e0.checkNotNull(aVar);
                return aVar;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b implements b5.c {
        }

        static {
            int i10 = b5.a.f8748b;
            f6628f = new b();
        }

        public a(Application application, int i10) {
            this.f6629c = application;
        }

        public static final a getInstance(Application application) {
            return f6626d.getInstance(application);
        }

        public final g3 a(Class cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                g3 g3Var = (g3) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.e0.checkNotNull(g3Var);
                return g3Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(a.b.i(cls, "Cannot create an instance of "), e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(a.b.i(cls, "Cannot create an instance of "), e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(a.b.i(cls, "Cannot create an instance of "), e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(a.b.i(cls, "Cannot create an instance of "), e13);
            }
        }

        @Override // androidx.lifecycle.j3.c, androidx.lifecycle.l3
        public <T extends g3> T create(Class<T> modelClass, b5.a extras) {
            kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
            kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
            if (this.f6629c != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(f6628f);
            if (application != null) {
                return (T) a(modelClass, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.e0.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.j3.c, androidx.lifecycle.l3
        public <T extends g3> T create(Class<T> modelClass) {
            kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f6629c;
            if (application != null) {
                return (T) a(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public /* synthetic */ j3(m3 m3Var, l3 l3Var, b5.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(m3Var, l3Var, (i10 & 4) != 0 ? b5.b.f8750c : aVar);
    }

    public static final j3 create(n3 n3Var, l3 l3Var, b5.a aVar) {
        return f6623b.create(n3Var, l3Var, aVar);
    }

    public <T extends g3> T get(Class<T> modelClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        return (T) get(jv.a.getKotlinClass(modelClass));
    }

    public final <T extends g3> T get(String key, KClass<T> modelClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f6625a.getViewModel$lifecycle_viewmodel_release(modelClass, key);
    }

    public j3(m3 store, l3 factory, b5.a defaultCreationExtras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(store, "store");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f6625a = new b5.g(store, factory, defaultCreationExtras);
    }

    public <T extends g3> T get(String str, Class<T> modelClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, TJzY.GGdsejrjgKouXP);
        kotlin.jvm.internal.e0.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f6625a.getViewModel$lifecycle_viewmodel_release(jv.a.getKotlinClass(modelClass), str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j3(n3 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        m3 viewModelStore = owner.getViewModelStore();
        c5.h hVar = c5.h.f11812a;
        this(viewModelStore, hVar.getDefaultFactory$lifecycle_viewmodel_release(owner), hVar.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j3(n3 owner, l3 factory) {
        this(owner.getViewModelStore(), factory, c5.h.f11812a.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
    }
}
