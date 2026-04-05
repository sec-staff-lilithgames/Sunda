package zw;

import java.lang.reflect.Constructor;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f98868a;

    public m(Class<Date> cls) throws Exception {
        this(cls, Long.TYPE);
    }

    public Date getInstance(Object... objArr) throws Exception {
        return (Date) this.f98868a.newInstance(objArr);
    }

    public m(Class<Date> cls, Class... clsArr) throws Exception {
        this.f98868a = cls.getDeclaredConstructor(clsArr);
    }
}
