package xc;

import java.util.Collection;
import lc.z;
import tb.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends l {

    /* renamed from: g, reason: collision with root package name */
    public final String f91909g;

    /* renamed from: h, reason: collision with root package name */
    public final String f91910h;

    public n(jc.o oVar, cd.s sVar, Collection collection, wc.d dVar) {
        super(oVar, sVar, collection, dVar);
        String name = oVar.getRawClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.f91909g = "";
            this.f91910h = ".";
        } else {
            this.f91910h = name.substring(0, iLastIndexOf + 1);
            this.f91909g = name.substring(0, iLastIndexOf);
        }
    }

    @Deprecated
    public static n construct(jc.o oVar, z zVar, wc.d dVar) {
        return new n(oVar, zVar.getTypeFactory(), null, dVar);
    }

    @Override // xc.l
    public final jc.o c(jc.h hVar, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.f91909g;
            StringBuilder sb2 = new StringBuilder(str2.length() + length);
            if (str2.isEmpty()) {
                sb2.append(str.substring(1));
            } else {
                sb2.append(str2);
                sb2.append(str);
            }
            str = sb2.toString();
        }
        return super.c(hVar, str);
    }

    @Override // xc.l, xc.t, wc.h
    public w0 getMechanism() {
        return w0.f86795f;
    }

    @Override // xc.l, xc.t, wc.h
    public String idFromValue(Object obj) {
        return idFromValueAndType(obj, obj.getClass());
    }

    @Override // xc.l, xc.t, wc.h
    public String idFromValueAndType(Object obj, Class<?> cls) {
        String name = t.a(cls).getName();
        return name.startsWith(this.f91910h) ? name.substring(r3.length() - 1) : name;
    }

    public static n construct(jc.o oVar, z zVar, Collection<wc.c> collection, wc.d dVar) {
        return new n(oVar, zVar.getTypeFactory(), collection, dVar);
    }
}
