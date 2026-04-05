package fx;

import java.lang.reflect.Type;
import mt.m0;
import retrofit2.CallAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements CallAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Type f56309a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f56310b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56311c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f56312d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56313e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56314f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56315g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56316h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56317i;

    public i(Type type, m0 m0Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f56309a = type;
        this.f56310b = m0Var;
        this.f56311c = z10;
        this.f56312d = z11;
        this.f56313e = z12;
        this.f56314f = z13;
        this.f56315g = z14;
        this.f56316h = z15;
        this.f56317i = z16;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adapt(retrofit2.Call<java.lang.Object> r3) {
        /*
            r2 = this;
            boolean r0 = r2.f56311c
            if (r0 == 0) goto Lb
            fx.d r0 = new fx.d
            r1 = 0
            r0.<init>(r3, r1)
            goto L11
        Lb:
            fx.d r0 = new fx.d
            r1 = 1
            r0.<init>(r3, r1)
        L11:
            boolean r3 = r2.f56312d
            if (r3 == 0) goto L1d
            fx.b r3 = new fx.b
            r1 = 1
            r3.<init>(r0, r1)
        L1b:
            r0 = r3
            goto L28
        L1d:
            boolean r3 = r2.f56313e
            if (r3 == 0) goto L28
            fx.b r3 = new fx.b
            r1 = 0
            r3.<init>(r0, r1)
            goto L1b
        L28:
            mt.m0 r3 = r2.f56310b
            if (r3 == 0) goto L30
            mt.b0 r0 = r0.subscribeOn(r3)
        L30:
            boolean r3 = r2.f56314f
            if (r3 == 0) goto L3b
            mt.b r3 = mt.b.f74911b
            mt.l r3 = r0.toFlowable(r3)
            return r3
        L3b:
            boolean r3 = r2.f56315g
            if (r3 == 0) goto L44
            mt.n0 r3 = r0.singleOrError()
            return r3
        L44:
            boolean r3 = r2.f56316h
            if (r3 == 0) goto L4d
            mt.s r3 = r0.singleElement()
            return r3
        L4d:
            boolean r3 = r2.f56317i
            if (r3 == 0) goto L56
            mt.c r3 = r0.ignoreElements()
            return r3
        L56:
            mt.b0 r3 = mu.a.onAssembly(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.i.adapt(retrofit2.Call):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.f56309a;
    }
}
