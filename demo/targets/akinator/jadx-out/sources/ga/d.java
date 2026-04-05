package ga;

import com.digidust.elokence.akinator.graphic.pickerview.lib.WheelView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public int f57480b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f57481c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f57482e;

    /* renamed from: f, reason: collision with root package name */
    public final WheelView f57483f;

    public d(WheelView wheelView, int i10) {
        this.f57483f = wheelView;
        this.f57482e = i10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f57480b == Integer.MAX_VALUE) {
            this.f57480b = this.f57482e;
        }
        int i10 = this.f57480b;
        int i11 = (int) (i10 * 0.1f);
        this.f57481c = i11;
        if (i11 == 0) {
            if (i10 < 0) {
                this.f57481c = -1;
            } else {
                this.f57481c = 1;
            }
        }
        int iAbs = Math.abs(i10);
        WheelView wheelView = this.f57483f;
        if (iAbs <= 1) {
            wheelView.cancelFuture();
            wheelView.f21770c.sendEmptyMessage(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
            return;
        }
        wheelView.f21779m += this.f57481c;
        if (!wheelView.f21778l) {
            float f10 = (-wheelView.f21780n) * 0.0f;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.f21780n) * 0.0f;
            int i12 = wheelView.f21779m;
            float f11 = i12;
            if (f11 <= f10 || f11 >= itemsCount) {
                wheelView.f21779m = i12 - this.f57481c;
                wheelView.cancelFuture();
                wheelView.f21770c.sendEmptyMessage(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
                return;
            }
        }
        wheelView.f21770c.sendEmptyMessage(1000);
        this.f57480b -= this.f57481c;
    }
}
