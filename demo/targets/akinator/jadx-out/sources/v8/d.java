package v8;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import u8.l0;
import u8.m0;
import u8.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class d implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f89176a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f89177b;

    public d(Context context, Class cls) {
        this.f89176a = context;
        this.f89177b = cls;
    }

    @Override // u8.m0
    public final l0 build(t0 t0Var) {
        Class cls = this.f89177b;
        return new h(this.f89176a, t0Var.build(File.class, cls), t0Var.build(Uri.class, cls), cls);
    }

    @Override // u8.m0
    public final void teardown() {
    }
}
