package pc;

import jc.o;
import jc.r;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f extends r {

    /* renamed from: f, reason: collision with root package name */
    public Class f80942f;

    public f(u uVar, Class cls, String str) {
        super(uVar, str);
        this.f80942f = cls;
    }

    @Deprecated
    public static f from(u uVar, String str) {
        return from(uVar, (Class<?>) null, str);
    }

    public Class<?> getTargetType() {
        return this.f80942f;
    }

    public f setTargetType(o oVar) {
        this.f80942f = oVar.getRawClass();
        return this;
    }

    public static f from(u uVar, o oVar, String str) {
        return new f(uVar, str, oVar);
    }

    public f(u uVar, String str, o oVar) {
        super(uVar, str);
        this.f80942f = dd.i.rawClass(oVar);
    }

    public static f from(u uVar, Class<?> cls, String str) {
        return new f(uVar, cls, str);
    }
}
