package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22355a;

    /* renamed from: b, reason: collision with root package name */
    public ha f22356b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22357c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22358d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f22359e;

    /* renamed from: f, reason: collision with root package name */
    public Object f22360f;

    public lb() {
        this.f22359e = null;
        this.f22355a = new ArrayList();
    }

    public mb build() {
        if (this.f22357c) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.f22356b == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.f22357c = true;
        ArrayList arrayList = this.f22355a;
        Collections.sort(arrayList);
        return new mb(this.f22356b, this.f22358d, this.f22359e, (x5[]) arrayList.toArray(new x5[0]), this.f22360f);
    }

    public void withCheckInitialized(int[] iArr) {
        this.f22359e = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.f22360f = obj;
    }

    public void withField(x5 x5Var) {
        if (this.f22357c) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.f22355a.add(x5Var);
    }

    public void withMessageSetWireFormat(boolean z10) {
        this.f22358d = z10;
    }

    public void withSyntax(ha haVar) {
        x7.a(haVar, "syntax");
        this.f22356b = haVar;
    }

    public lb(int i10) {
        this.f22359e = null;
        this.f22355a = new ArrayList(i10);
    }
}
