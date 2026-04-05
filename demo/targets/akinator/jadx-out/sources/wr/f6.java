package wr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f90930a;

    /* renamed from: b, reason: collision with root package name */
    public final List f90931b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f90932c;

    public f6(String str, k4... k4VarArr) {
        this(str, Arrays.asList(k4VarArr));
    }

    public static e6 newBuilder(String str) {
        e6 e6Var = new e6();
        e6Var.f90910b = new ArrayList();
        e6Var.setName(str);
        return e6Var;
    }

    public Collection<k4> getMethods() {
        return this.f90931b;
    }

    public String getName() {
        return this.f90930a;
    }

    public Object getSchemaDescriptor() {
        return this.f90932c;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("name", this.f90930a).add("schemaDescriptor", this.f90932c).add("methods", this.f90931b).omitNullValues().toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f6(String str, Collection<k4> collection) {
        e6 e6VarNewBuilder = newBuilder(str);
        e6VarNewBuilder.f90910b.addAll((Collection) mh.p1.checkNotNull(collection, "methods"));
        this(e6VarNewBuilder);
    }

    public f6(e6 e6Var) {
        String str = e6Var.f90909a;
        this.f90930a = str;
        ArrayList<k4> arrayList = e6Var.f90910b;
        HashSet hashSet = new HashSet(arrayList.size());
        for (k4 k4Var : arrayList) {
            mh.p1.checkNotNull(k4Var, "method");
            String serviceName = k4Var.getServiceName();
            mh.p1.checkArgument(str.equals(serviceName), "service names %s != %s", serviceName, str);
            mh.p1.checkArgument(hashSet.add(k4Var.getFullMethodName()), "duplicate name %s", k4Var.getFullMethodName());
        }
        this.f90931b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f90932c = e6Var.f90911c;
    }
}
