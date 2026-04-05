package ga;

import com.digidust.elokence.akinator.graphic.pickerview.lib.WheelView;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public float f57475b = 2.1474836E9f;

    /* renamed from: c, reason: collision with root package name */
    public final float f57476c;

    /* renamed from: e, reason: collision with root package name */
    public final WheelView f57477e;

    public a(WheelView wheelView, float f10) {
        this.f57477e = wheelView;
        this.f57476c = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f57475b == 2.1474836E9f) {
            float f10 = this.f57476c;
            if (Math.abs(f10) <= 2000.0f) {
                this.f57475b = f10;
            } else if (f10 > 0.0f) {
                this.f57475b = 2000.0f;
            } else {
                this.f57475b = -2000.0f;
            }
        }
        float fAbs = Math.abs(this.f57475b);
        WheelView wheelView = this.f57477e;
        if (fAbs >= 0.0f && Math.abs(this.f57475b) <= 20.0f) {
            wheelView.cancelFuture();
            wheelView.f21770c.sendEmptyMessage(2000);
            return;
        }
        int i10 = (int) ((this.f57475b * 10.0f) / 1000.0f);
        wheelView.f21779m -= i10;
        if (!wheelView.f21778l) {
            float f11 = (-wheelView.f21780n) * 0.0f;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.f21780n) * 0.0f;
            int i11 = wheelView.f21779m;
            double d10 = i11;
            double d11 = 0.0f * 0.3d;
            if (d10 - d11 < f11) {
                f11 = i10 + i11;
            } else if (d10 + d11 > itemsCount) {
                itemsCount = i10 + i11;
            }
            float f12 = i11;
            if (f12 <= f11) {
                this.f57475b = 40.0f;
                wheelView.f21779m = (int) f11;
            } else if (f12 >= itemsCount) {
                wheelView.f21779m = (int) itemsCount;
                this.f57475b = -40.0f;
            }
        }
        float f13 = this.f57475b;
        if (f13 < 0.0f) {
            this.f57475b = f13 + 20.0f;
        } else {
            this.f57475b = f13 - 20.0f;
        }
        wheelView.f21770c.sendEmptyMessage(1000);
    }
}
