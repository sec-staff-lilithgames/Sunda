package yr;

import java.io.IOException;
import java.util.logging.Logger;
import xr.c5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f95030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f95031c;

    public /* synthetic */ s0(v0 v0Var, int i10) {
        this.f95030b = i10;
        this.f95031c = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i10 = this.f95030b;
        v0 v0Var = this.f95031c;
        switch (i10) {
            case 0:
                c5.closeQuietly(v0Var.f95060e);
                break;
            case 1:
                Logger logger = v0.B;
                v0Var.g();
                break;
            case 2:
                v0Var.shutdown();
                break;
            default:
                v0Var.d(Long.valueOf(v0Var.f95056a.f95096o));
                break;
        }
    }
}
