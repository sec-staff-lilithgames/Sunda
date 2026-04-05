package tb;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final c f86690f = new c(null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f86691b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f86692c;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f86693e;

    public c(Object obj, Boolean bool, Boolean bool2) {
        this.f86691b = obj;
        this.f86692c = bool;
        this.f86693e = bool2;
    }

    @Deprecated
    public static c construct(Object obj, Boolean bool) {
        return construct(obj, bool, null);
    }

    public static c empty() {
        return f86690f;
    }

    public static c forId(Object obj) {
        return construct(obj, null, null);
    }

    public static c from(d dVar) {
        return dVar == null ? f86690f : construct(dVar.value(), dVar.useInput().asBoolean(), dVar.optional().asBoolean());
    }

    public boolean equals(Object obj) {
        Boolean bool;
        Boolean bool2;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == c.class) {
            c cVar = (c) obj;
            Boolean bool3 = cVar.f86693e;
            Boolean bool4 = cVar.f86692c;
            Object obj2 = cVar.f86691b;
            Object obj3 = this.f86691b;
            if (((obj3 == null && obj2 == null) || (obj3 != null && obj3.equals(obj2))) && ((((bool = this.f86692c) == null && bool4 == null) || (bool != null && bool.equals(bool4))) && (((bool2 = this.f86693e) == null && bool3 == null) || (bool2 != null && bool2.equals(bool3))))) {
                return true;
            }
        }
        return false;
    }

    public Object getId() {
        return this.f86691b;
    }

    public Boolean getOptional() {
        return this.f86693e;
    }

    public Boolean getUseInput() {
        return this.f86692c;
    }

    public boolean hasId() {
        return this.f86691b != null;
    }

    public int hashCode() {
        Object obj = this.f86691b;
        int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
        Boolean bool = this.f86692c;
        if (bool != null) {
            iHashCode += bool.hashCode();
        }
        Boolean bool2 = this.f86693e;
        return bool2 != null ? bool2.hashCode() + iHashCode : iHashCode;
    }

    public String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s,optional=%s)", this.f86691b, this.f86692c, this.f86693e);
    }

    @Override // tb.a
    public Class<d> valueFor() {
        return d.class;
    }

    public boolean willUseInput(boolean z10) {
        Boolean bool = this.f86692c;
        return bool == null ? z10 : bool.booleanValue();
    }

    public c withId(Object obj) {
        Object obj2 = this.f86691b;
        return (obj != null ? !obj.equals(obj2) : obj2 != null) ? new c(obj, this.f86692c, this.f86693e) : this;
    }

    public c withOptional(Boolean bool) {
        Boolean bool2 = this.f86693e;
        return (bool != null ? !bool.equals(bool2) : bool2 != null) ? new c(this.f86691b, this.f86692c, bool) : this;
    }

    public c withUseInput(Boolean bool) {
        Boolean bool2 = this.f86692c;
        return (bool != null ? !bool.equals(bool2) : bool2 != null) ? new c(this.f86691b, bool, this.f86693e) : this;
    }

    public static c construct(Object obj, Boolean bool, Boolean bool2) {
        if ("".equals(obj)) {
            obj = null;
        }
        return (obj == null && bool == null && bool2 == null) ? f86690f : new c(obj, bool, bool2);
    }
}
