package x3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o3 extends n3 {

    /* renamed from: o, reason: collision with root package name */
    public o3.c f91649o;

    /* renamed from: p, reason: collision with root package name */
    public o3.c f91650p;

    /* renamed from: q, reason: collision with root package name */
    public o3.c f91651q;

    public o3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var, windowInsets);
        this.f91649o = null;
        this.f91650p = null;
        this.f91651q = null;
    }

    @Override // x3.s3
    public o3.c g() {
        if (this.f91650p == null) {
            this.f91650p = o3.c.toCompatInsets(this.f91632c.getMandatorySystemGestureInsets());
        }
        return this.f91650p;
    }

    @Override // x3.s3
    public o3.c k() {
        if (this.f91649o == null) {
            this.f91649o = o3.c.toCompatInsets(this.f91632c.getSystemGestureInsets());
        }
        return this.f91649o;
    }

    @Override // x3.s3
    public o3.c m() {
        if (this.f91651q == null) {
            this.f91651q = o3.c.toCompatInsets(this.f91632c.getTappableElementInsets());
        }
        return this.f91651q;
    }

    @Override // x3.l3, x3.s3
    public e3 n(int i10, int i11, int i12, int i13) {
        return e3.toWindowInsetsCompat(this.f91632c.inset(i10, i11, i12, i13));
    }

    public o3(e3 e3Var, o3 o3Var) {
        super(e3Var, o3Var);
        this.f91649o = null;
        this.f91650p = null;
        this.f91651q = null;
    }

    @Override // x3.m3, x3.s3
    public void setStableInsets(o3.c cVar) {
    }
}
