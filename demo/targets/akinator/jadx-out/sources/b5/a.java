package b5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8748b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8749a = new LinkedHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: b5.a$a, reason: collision with other inner class name */
    public static final class C0010a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: b5.a$a$a, reason: collision with other inner class name */
        public static final class C0011a implements c {
        }

        public C0010a(u uVar) {
        }

        public final /* synthetic */ <T> c Key() {
            e0.needClassReification();
            return new C0011a();
        }
    }

    static {
        new C0010a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return e0.areEqual(this.f8749a, ((a) obj).f8749a);
        }
        return false;
    }

    public abstract <T> T get(c cVar);

    public final Map<c, Object> getExtras$lifecycle_viewmodel_release() {
        return this.f8749a;
    }

    public int hashCode() {
        return this.f8749a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f8749a + ')';
    }
}
