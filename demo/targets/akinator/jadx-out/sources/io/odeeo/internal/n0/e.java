package io.odeeo.internal.n0;

import io.odeeo.internal.a0.k0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    public final int f64983h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f64984i;

    public e(k0 k0Var, int i10) {
        this(k0Var, i10, 0);
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public int getSelectedIndex() {
        return 0;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public Object getSelectionData() {
        return this.f64984i;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public int getSelectionReason() {
        return this.f64983h;
    }

    public e(k0 k0Var, int i10, int i11) {
        this(k0Var, i10, i11, 0, null);
    }

    public e(k0 k0Var, int i10, int i11, int i12, Object obj) {
        super(k0Var, new int[]{i10}, i11);
        this.f64983h = i12;
        this.f64984i = obj;
    }

    @Override // io.odeeo.internal.n0.b, io.odeeo.internal.n0.d
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends io.odeeo.internal.c0.b> list, io.odeeo.internal.c0.c[] cVarArr) {
    }
}
