package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6093a;

    /* renamed from: b, reason: collision with root package name */
    public c3 f6094b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6095c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6096d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f6097e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6098f;

    public w3() {
        this.f6097e = null;
        this.f6093a = new ArrayList();
    }

    public x3 build() {
        if (this.f6095c) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.f6094b == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.f6095c = true;
        ArrayList arrayList = this.f6093a;
        Collections.sort(arrayList);
        return new x3(this.f6094b, this.f6096d, this.f6097e, (x0[]) arrayList.toArray(new x0[0]), this.f6098f);
    }

    public void withCheckInitialized(int[] iArr) {
        this.f6097e = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.f6098f = obj;
    }

    public void withField(x0 x0Var) {
        if (this.f6095c) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.f6093a.add(x0Var);
    }

    public void withMessageSetWireFormat(boolean z10) {
        this.f6096d = z10;
    }

    public void withSyntax(c3 c3Var) {
        t1.a(c3Var, "syntax");
        this.f6094b = c3Var;
    }

    public w3(int i10) {
        this.f6097e = null;
        this.f6093a = new ArrayList(i10);
    }
}
