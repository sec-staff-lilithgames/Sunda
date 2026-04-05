package dh;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g extends h {
    @Override // yg.j
    public final void g(Canvas canvas) {
        if (this.J.f52229w.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.J.f52229w);
        } else {
            canvas.clipRect(this.J.f52229w, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
