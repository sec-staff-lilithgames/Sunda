package tb;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f1 implements Serializable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Class f86713b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f86714c;

        /* renamed from: e, reason: collision with root package name */
        public final Object f86715e;

        /* renamed from: f, reason: collision with root package name */
        public final int f86716f;

        public a(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.f86713b = cls;
            this.f86714c = cls2;
            this.f86715e = obj;
            int iHashCode = cls.getName().hashCode() + obj.hashCode();
            this.f86716f = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f86715e.equals(this.f86715e) && aVar.f86713b == this.f86713b && aVar.f86714c == this.f86714c;
        }

        public int hashCode() {
            return this.f86716f;
        }

        public String toString() {
            Class cls = this.f86713b;
            String name = cls == null ? "NONE" : cls.getName();
            Class cls2 = this.f86714c;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", this.f86715e, name, cls2 != null ? cls2.getName() : "NONE");
        }
    }

    public abstract boolean canUseFor(f1 f1Var);

    public abstract f1 forScope(Class<?> cls);

    public abstract Object generateId(Object obj);

    public abstract Class<?> getScope();

    public boolean isValidReferencePropertyName(String str, Object obj) {
        return false;
    }

    public abstract a key(Object obj);

    public boolean maySerializeAsObject() {
        return false;
    }

    public abstract f1 newForSerialization(Object obj);
}
