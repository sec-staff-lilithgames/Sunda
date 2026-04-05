package dd;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f52091b = new n0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n0 implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public final Class[] f52092c;

        public a(Class<?>[] clsArr) {
            this.f52092c = clsArr;
        }

        @Override // dd.n0
        public boolean isVisibleForView(Class<?> cls) {
            for (Class<?> cls2 : this.f52092c) {
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public final Class f52093c;

        public b(Class<?> cls) {
            this.f52093c = cls;
        }

        @Override // dd.n0
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this.f52093c;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static n0 construct(Class<?>[] clsArr) {
        int length;
        n0 n0Var = f52091b;
        return (clsArr == null || (length = clsArr.length) == 0) ? n0Var : length != 1 ? new a(clsArr) : new b(clsArr[0]);
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}
