package xc;

import java.io.IOException;
import tb.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t implements wc.h {

    /* renamed from: b, reason: collision with root package name */
    public final cd.s f91933b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.o f91934c;

    public t() {
        this(null, null);
    }

    public static Class a(Class cls) {
        return (!dd.i.isEnumType(cls) || cls.isEnum()) ? cls : cls.getSuperclass();
    }

    @Override // wc.h
    public String getDescForKnownTypeIds() {
        return null;
    }

    @Override // wc.h
    public abstract /* synthetic */ w0 getMechanism();

    @Override // wc.h
    public String idFromBaseType() {
        return idFromValueAndType(null, this.f91934c.getRawClass());
    }

    @Override // wc.h
    public abstract /* synthetic */ String idFromValue(Object obj);

    @Override // wc.h
    public abstract /* synthetic */ String idFromValueAndType(Object obj, Class cls);

    @Override // wc.h
    public jc.o typeFromId(jc.h hVar, String str) throws IOException {
        throw new IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }

    public t(jc.o oVar, cd.s sVar) {
        this.f91934c = oVar;
        this.f91933b = sVar;
    }

    @Override // wc.h
    public void init(jc.o oVar) {
    }
}
