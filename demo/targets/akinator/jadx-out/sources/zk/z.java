package zk;

import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;
import com.inmobi.media.U0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U0 f98217c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f98218e;

    public /* synthetic */ z(U0 u02, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, int i10) {
        this.f98216b = i10;
        this.f98217c = u02;
        this.f98218e = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98216b) {
            case 0:
                U0.c(this.f98217c, this.f98218e);
                break;
            default:
                U0.b(this.f98217c, this.f98218e);
                break;
        }
    }
}
