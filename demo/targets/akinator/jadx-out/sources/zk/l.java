package zk;

import com.inmobi.media.Ec;
import com.inmobi.media.Fc;
import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;
import com.inmobi.media.Sf;
import com.inmobi.media.Wc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Sf f98138c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Wc f98139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Fc f98140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f98141g;

    public /* synthetic */ l(Sf sf2, Wc wc2, Fc fc2, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, int i10) {
        this.f98137b = i10;
        this.f98138c = sf2;
        this.f98139e = wc2;
        this.f98140f = fc2;
        this.f98141g = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98137b) {
            case 0:
                Ec.b(this.f98138c, this.f98139e, this.f98140f, this.f98141g);
                break;
            default:
                Ec.a(this.f98138c, this.f98139e, this.f98140f, this.f98141g);
                break;
        }
    }
}
