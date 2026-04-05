package zk;

import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class h1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f98114c;

    public /* synthetic */ h1(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, int i10) {
        this.f98113b = i10;
        this.f98114c = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98113b) {
            case 0:
                GestureDetectorOnGestureListenerC3093yc.a(this.f98114c);
                break;
            case 1:
                GestureDetectorOnGestureListenerC3093yc.c(this.f98114c);
                break;
            default:
                GestureDetectorOnGestureListenerC3093yc.b(this.f98114c);
                break;
        }
    }
}
