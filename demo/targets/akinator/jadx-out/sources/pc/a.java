package pc;

import java.util.Collection;
import ub.p;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends g {
    public a(u uVar, String str, p pVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(uVar, str, pVar, cls, str2, collection);
    }

    public static a from(u uVar, Object obj, String str, Collection<Object> collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        a aVar = new a(uVar, e3.g.l("Ignored field \"", str, "\" (class ", cls.getName(), ") encountered; mapper configured not to allow this"), uVar.currentLocation(), cls, str, collection);
        aVar.prependPath(obj, str);
        return aVar;
    }

    @Deprecated
    public a(String str, p pVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(null, str, pVar, cls, str2, collection);
    }
}
