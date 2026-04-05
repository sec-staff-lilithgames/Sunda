package io.odeeo.internal.p0;

import android.net.Uri;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65605a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b0> f65606b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public int f65607c;

    /* renamed from: d, reason: collision with root package name */
    public m f65608d;

    public e(boolean z10) {
        this.f65605a = z10;
    }

    public final void a(m mVar) {
        for (int i10 = 0; i10 < this.f65607c; i10++) {
            this.f65606b.get(i10).onTransferInitializing(this, mVar, this.f65605a);
        }
    }

    @Override // io.odeeo.internal.p0.i
    public final void addTransferListener(b0 b0Var) {
        io.odeeo.internal.q0.a.checkNotNull(b0Var);
        if (this.f65606b.contains(b0Var)) {
            return;
        }
        this.f65606b.add(b0Var);
        this.f65607c++;
    }

    public final void b(m mVar) {
        this.f65608d = mVar;
        for (int i10 = 0; i10 < this.f65607c; i10++) {
            this.f65606b.get(i10).onTransferStart(this, mVar, this.f65605a);
        }
    }

    @Override // io.odeeo.internal.p0.i
    public abstract /* synthetic */ void close() throws IOException;

    @Override // io.odeeo.internal.p0.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // io.odeeo.internal.p0.i
    public abstract /* synthetic */ Uri getUri();

    @Override // io.odeeo.internal.p0.i
    public abstract /* synthetic */ long open(m mVar) throws IOException;

    public final void a(int i10) {
        m mVar = (m) g0.castNonNull(this.f65608d);
        for (int i11 = 0; i11 < this.f65607c; i11++) {
            this.f65606b.get(i11).onBytesTransferred(this, mVar, this.f65605a, i10);
        }
    }

    public final void a() {
        m mVar = (m) g0.castNonNull(this.f65608d);
        for (int i10 = 0; i10 < this.f65607c; i10++) {
            this.f65606b.get(i10).onTransferEnd(this, mVar, this.f65605a);
        }
        this.f65608d = null;
    }
}
