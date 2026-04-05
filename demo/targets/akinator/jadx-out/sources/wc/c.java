package wc;

import com.ironsource.C3191e4;
import j1.o2;
import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f90534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90535c;

    /* renamed from: e, reason: collision with root package name */
    public String f90536e;

    public c(Class<?> cls) {
        this(cls, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        return this.f90534b == cVar.f90534b && Objects.equals(this.f90536e, cVar.f90536e);
    }

    public String getName() {
        return this.f90536e;
    }

    public Class<?> getType() {
        return this.f90534b;
    }

    public boolean hasName() {
        return this.f90536e != null;
    }

    public int hashCode() {
        return this.f90535c;
    }

    public void setName(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this.f90536e = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[NamedType, class ");
        a.b.z(this.f90534b, sb2, ", name: ");
        return o2.o(sb2, this.f90536e == null ? AbstractJsonLexerKt.NULL : o2.o(new StringBuilder("'"), this.f90536e, "'"), C3191e4.i.f36531e);
    }

    public c(Class<?> cls, String str) {
        this.f90534b = cls;
        this.f90535c = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
    }
}
