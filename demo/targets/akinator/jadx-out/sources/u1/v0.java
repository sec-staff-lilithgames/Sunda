package u1;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u2.o f87684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u2.o oVar) {
        super(1);
        this.f87684e = oVar;
    }

    @Override // kv.l
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        kotlin.jvm.internal.e0.checkNotNullParameter(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        u2.o oVar = this.f87684e;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = oVar.dispatchTouchEvent(motionEvent);
                break;
            default:
                zDispatchTouchEvent = oVar.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
