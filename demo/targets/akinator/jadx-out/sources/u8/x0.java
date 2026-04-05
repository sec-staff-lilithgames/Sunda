package u8;

import android.content.Context;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88140a;

    public x0(Context context) {
        this.f88140a = context;
    }

    @Override // u8.m0
    public l0 build(t0 t0Var) {
        return new y0(this.f88140a, t0Var.build(Integer.class, InputStream.class));
    }

    @Override // u8.m0
    public void teardown() {
    }
}
