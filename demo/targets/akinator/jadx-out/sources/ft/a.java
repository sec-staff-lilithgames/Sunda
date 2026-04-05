package ft;

import android.graphics.SurfaceTexture;
import io.odeeo.internal.s0.h;
import jo.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55994c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f55993b = i10;
        this.f55994c = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f55993b) {
            case 0:
                ((h) this.f55994c).a(surfaceTexture);
                break;
            case 1:
                ((j) this.f55994c).f69854b.set(true);
                break;
            default:
                ((tf.j) this.f55994c).f86874b.set(true);
                break;
        }
    }
}
