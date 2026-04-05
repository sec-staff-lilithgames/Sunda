package zk;

import android.view.MotionEvent;
import android.view.View;
import com.inmobi.media.C2747e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class l0 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2747e4 f98143c;

    public /* synthetic */ l0(C2747e4 c2747e4, int i10) {
        this.f98142b = i10;
        this.f98143c = c2747e4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f98142b) {
            case 0:
                return C2747e4.b(this.f98143c, view, motionEvent);
            case 1:
                return C2747e4.c(this.f98143c, view, motionEvent);
            case 2:
                return C2747e4.a(this.f98143c, view, motionEvent);
            default:
                return C2747e4.d(this.f98143c, view, motionEvent);
        }
    }
}
