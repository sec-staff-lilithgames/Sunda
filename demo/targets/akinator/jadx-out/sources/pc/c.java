package pc;

import java.io.Closeable;
import jc.o;
import ub.p;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c extends f {

    /* renamed from: g, reason: collision with root package name */
    public final Object f80938g;

    @Deprecated
    public c(String str, Object obj, Class<?> cls) {
        super((u) null, str, (o) null);
        this.f80938g = obj;
        this.f80942f = cls;
    }

    public static c from(u uVar, String str, Object obj, Class<?> cls) {
        return new c(uVar, str, obj, cls);
    }

    public Object getValue() {
        return this.f80938g;
    }

    @Deprecated
    public c(String str, p pVar, Object obj, Class<?> cls) {
        super((Closeable) null, str, pVar);
        this.f80938g = obj;
        this.f80942f = cls;
    }

    public c(u uVar, String str, Object obj, Class<?> cls) {
        super(uVar, cls, str);
        this.f80938g = obj;
    }
}
