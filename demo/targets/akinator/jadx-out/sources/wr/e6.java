package wr;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public String f90909a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f90910b;

    /* renamed from: c, reason: collision with root package name */
    public Object f90911c;

    public e6 addMethod(k4 k4Var) {
        this.f90910b.add((k4) mh.p1.checkNotNull(k4Var, "method"));
        return this;
    }

    public f6 build() {
        return new f6(this);
    }

    public e6 setName(String str) {
        this.f90909a = (String) mh.p1.checkNotNull(str, "name");
        return this;
    }

    public e6 setSchemaDescriptor(Object obj) {
        this.f90911c = obj;
        return this;
    }
}
