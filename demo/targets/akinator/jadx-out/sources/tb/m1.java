package tb;

import com.ironsource.C3191e4;
import java.util.HashMap;
import tb.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m1 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f86753a;

    @Override // tb.j1
    public void bindItem(f1.a aVar, Object obj) {
        HashMap map = this.f86753a;
        if (map == null) {
            this.f86753a = new HashMap();
        } else {
            Object obj2 = map.get(aVar);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new IllegalStateException("Already had POJO for id (" + aVar.f86715e.getClass().getName() + ") [" + aVar + C3191e4.i.f36531e);
            }
        }
        this.f86753a.put(aVar, obj);
    }

    @Override // tb.j1
    public boolean canUseFor(j1 j1Var) {
        return j1Var.getClass() == getClass();
    }

    @Override // tb.j1
    public j1 newForDeserialization(Object obj) {
        return new m1();
    }

    @Override // tb.j1
    public Object resolveId(f1.a aVar) {
        HashMap map = this.f86753a;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }
}
