package a2;

import android.os.Bundle;
import android.view.contentcapture.ContentCaptureSession;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements a7.f, io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h, com.google.android.exoplayer2.h, bi.j, sj.a, OnSuccessListener, b1.h, c3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3740b;

    public /* synthetic */ o(int i10) {
        this.f3740b = i10;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession e(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher f(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        switch (this.f3740b) {
            case 7:
                ((ao.l1) obj).f7727b.release();
                break;
            case 10:
                ((bf.y0) obj).f9494b.release();
                break;
        }
    }

    @Override // a7.f
    public a7.g create(l7.i iVar) {
        return a7.g.f4100a;
    }

    @Override // b1.h
    public void dispose() {
        synchronized (b1.y.getLock()) {
            try {
                s0.j jVar = c1.c.f11733a;
                s0.j jVar2 = null;
                s0.j jVarRemove = jVar != null ? jVar.remove((Object) null) : null;
                if (jVarRemove != null && !jVarRemove.isEmpty()) {
                    jVar2 = jVarRemove;
                }
                c1.c.f11733a = jVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.h
    public com.google.android.exoplayer2.i fromBundle(Bundle bundle) {
        switch (this.f3740b) {
            case 12:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(bf.m1.f9329h);
                return new bf.m1(bundle.getString(bf.m1.f9330i, ""), (com.google.android.exoplayer2.z0[]) (parcelableArrayList == null ? nh.b5.of() : com.google.android.exoplayer2.util.c.fromBundleList(com.google.android.exoplayer2.z0.f28790r0, parcelableArrayList)).toArray(new com.google.android.exoplayer2.z0[0]));
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(bf.n1.f9355g);
                return parcelableArrayList2 == null ? new bf.n1(new bf.m1[0]) : new bf.n1((bf.m1[]) com.google.android.exoplayer2.util.c.fromBundleList(bf.m1.f9331j, parcelableArrayList2).toArray(new bf.m1[0]));
        }
    }

    @Override // c3.b
    public float getInterpolation(float f10) {
        double d10;
        switch (this.f3740b) {
            case 18:
                d10 = a3.g.getInterpolator("standard").get(f10);
                break;
            case 19:
                d10 = a3.g.getInterpolator("accelerate").get(f10);
                break;
            case 20:
                d10 = a3.g.getInterpolator("decelerate").get(f10);
                break;
            case 21:
                d10 = a3.g.getInterpolator("linear").get(f10);
                break;
            case 22:
                d10 = a3.g.getInterpolator("anticipate").get(f10);
                break;
            case 23:
                d10 = a3.g.getInterpolator("overshoot").get(f10);
                break;
            default:
                d10 = a3.g.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f10);
                break;
        }
        return (float) d10;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        nj.j0.logi("Starting InAppMessaging runtime with Installation ID " + ((String) obj));
    }

    @Override // bi.j
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    private final void a(Object obj) {
    }

    private final void b(Object obj) {
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
    }
}
