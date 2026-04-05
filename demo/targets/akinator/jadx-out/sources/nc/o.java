package nc;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.u0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements dd.m {

    /* renamed from: a, reason: collision with root package name */
    public final jc.o f75950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75951b;

    public o(int i10, jc.o oVar) {
        this.f75950a = oVar;
        this.f75951b = i10;
    }

    public static void a(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException(o2.k(i10, "Can not deserialize Singleton container from ", " entries"));
        }
    }

    @Override // dd.m
    public /* bridge */ /* synthetic */ Object convert(jc.k kVar, Object obj) {
        return super.convert(kVar, obj);
    }

    @Override // dd.m
    public jc.o getInputType(cd.s sVar) {
        return this.f75950a;
    }

    @Override // dd.m
    public jc.o getOutputType(cd.s sVar) {
        return this.f75950a;
    }

    @Override // dd.m
    public /* bridge */ /* synthetic */ Object convert(u0 u0Var, Object obj) {
        return super.convert(u0Var, obj);
    }

    @Override // dd.m
    public Object convert(Object obj) {
        if (obj == null) {
            return null;
        }
        switch (this.f75951b) {
            case 1:
                Set set = (Set) obj;
                a(set.size());
                return Collections.singleton(set.iterator().next());
            case 2:
                List list = (List) obj;
                a(list.size());
                return Collections.singletonList(list.get(0));
            case 3:
                Map map = (Map) obj;
                a(map.size());
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                return Collections.singletonMap(entry.getKey(), entry.getValue());
            case 4:
                return Collections.unmodifiableSet((Set) obj);
            case 5:
                return Collections.unmodifiableList((List) obj);
            case 6:
                return Collections.unmodifiableMap((Map) obj);
            case 7:
                return Collections.synchronizedSet((Set) obj);
            case 8:
                return Collections.synchronizedCollection((Collection) obj);
            case 9:
                return Collections.synchronizedList((List) obj);
            case 10:
                return Collections.synchronizedMap((Map) obj);
            default:
                return obj;
        }
    }
}
