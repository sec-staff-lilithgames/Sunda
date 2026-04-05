package wr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f91227a;

    /* renamed from: b, reason: collision with root package name */
    public final f6 f91228b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f91229c;

    public z5(String str) {
        this.f91229c = new HashMap();
        this.f91227a = (String) mh.p1.checkNotNull(str, "serviceName");
        this.f91228b = null;
    }

    public <ReqT, RespT> z5 addMethod(k4 k4Var, m5 m5Var) {
        return addMethod(t5.create((k4) mh.p1.checkNotNull(k4Var, "method must not be null"), (m5) mh.p1.checkNotNull(m5Var, "handler must not be null")));
    }

    public a6 build() {
        HashMap map = this.f91229c;
        f6 f6Var = this.f91228b;
        if (f6Var == null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((t5) it.next()).getMethodDescriptor());
            }
            f6Var = new f6(this.f91227a, arrayList);
        }
        HashMap map2 = new HashMap(map);
        for (k4 k4Var : f6Var.getMethods()) {
            t5 t5Var = (t5) map2.remove(k4Var.getFullMethodName());
            if (t5Var == null) {
                throw new IllegalStateException("No method bound for descriptor entry " + k4Var.getFullMethodName());
            }
            if (t5Var.getMethodDescriptor() != k4Var) {
                throw new IllegalStateException("Bound method for " + k4Var.getFullMethodName() + " not same instance as method in service descriptor");
            }
        }
        if (map2.size() <= 0) {
            return new a6(f6Var, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method " + ((t5) map2.values().iterator().next()).getMethodDescriptor().getFullMethodName());
    }

    public z5(f6 f6Var) {
        this.f91229c = new HashMap();
        this.f91228b = (f6) mh.p1.checkNotNull(f6Var, "serviceDescriptor");
        this.f91227a = f6Var.getName();
    }

    public <ReqT, RespT> z5 addMethod(t5 t5Var) {
        k4 methodDescriptor = t5Var.getMethodDescriptor();
        String serviceName = methodDescriptor.getServiceName();
        String str = this.f91227a;
        mh.p1.checkArgument(str.equals(serviceName), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, methodDescriptor.getFullMethodName());
        String fullMethodName = methodDescriptor.getFullMethodName();
        HashMap map = this.f91229c;
        mh.p1.checkState(!map.containsKey(fullMethodName), "Method by same name already registered: %s", fullMethodName);
        map.put(fullMethodName, t5Var);
        return this;
    }
}
