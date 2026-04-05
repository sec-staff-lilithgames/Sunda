package x3;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.animation.Interpolator;
import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class w3 extends b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Window f91702a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f91703b;

    public w3(Window window, d1 d1Var) {
        this.f91702a = window;
        this.f91703b = d1Var;
    }

    @Override // x3.b4
    public final int c() {
        Object tag = this.f91702a.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }

    @Override // x3.b4
    public final void d(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                if (i11 == 1) {
                    h(4);
                } else if (i11 == 2) {
                    h(2);
                } else if (i11 == 8) {
                    this.f91703b.hide();
                }
            }
        }
    }

    @Override // x3.b4
    public final void f(int i10) {
        this.f91702a.getDecorView().setTag(356039078, Integer.valueOf(i10));
        if (i10 == 0) {
            i(6144);
            return;
        }
        if (i10 == 1) {
            i(4096);
            h(2048);
        } else {
            if (i10 != 2) {
                return;
            }
            i(2048);
            h(4096);
        }
    }

    @Override // x3.b4
    public final void g(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                if (i11 == 1) {
                    i(4);
                    this.f91702a.clearFlags(1024);
                } else if (i11 == 2) {
                    i(2);
                } else if (i11 == 8) {
                    this.f91703b.show();
                }
            }
        }
    }

    public final void h(int i10) {
        View decorView = this.f91702a.getDecorView();
        decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
    }

    public final void i(int i10) {
        View decorView = this.f91702a.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }

    @Override // x3.b4
    public boolean isAppearanceLightStatusBars() {
        return (this.f91702a.getDecorView().getSystemUiVisibility() & Segment.SIZE) != 0;
    }

    @Override // x3.b4
    public void setAppearanceLightStatusBars(boolean z10) {
        if (!z10) {
            i(Segment.SIZE);
            return;
        }
        Window window = this.f91702a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        h(Segment.SIZE);
    }

    @Override // x3.b4
    public final void a() {
    }

    @Override // x3.b4
    public final void e() {
    }

    @Override // x3.b4
    public final void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal) {
    }
}
