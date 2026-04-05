package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class Z4 extends ImageView {
    public Z6 A00;
    public final Bitmap A01;
    public final Bitmap A02;

    public Z4(C1937dL c1937dL, final Handler handler, Z6 z62, final int i10, final View.OnClickListener onClickListener) {
        super(c1937dL);
        this.A01 = XY.A01(XX.CREDIT_LINE_COLLAPSED_PILL);
        this.A02 = XY.A01(XX.CREDIT_LINE_PILL);
        this.A00 = Z6.A03;
        if (z62 == Z6.A03) {
            setImageBitmap(this.A02);
            A00(handler, Integer.valueOf(i10));
        } else {
            this.A00 = z62;
            setImageBitmap(this.A01);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A03.A02(onClickListener, handler, i10, view);
            }
        });
    }

    private void A00(Handler handler, Integer num) {
        handler.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.Z3
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A01();
            }
        }, num.intValue());
    }

    public final /* synthetic */ void A01() {
        this.A00 = Z6.A02;
        setImageBitmap(this.A01);
    }

    public final /* synthetic */ void A02(View.OnClickListener onClickListener, Handler handler, int i10, View view) {
        if (this.A00 == Z6.A03) {
            onClickListener.onClick(view);
            return;
        }
        this.A00 = Z6.A03;
        setImageBitmap(this.A02);
        A00(handler, Integer.valueOf(i10));
    }
}
