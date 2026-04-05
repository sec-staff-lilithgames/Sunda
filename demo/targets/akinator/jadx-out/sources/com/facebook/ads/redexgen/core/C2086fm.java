package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.fm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2086fm implements InterfaceC1837bi {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C2081fh A01;
    public final /* synthetic */ C1480Qc A02;

    public C2086fm(C2081fh c2081fh, C1480Qc c1480Qc, NativeAd nativeAd) {
        this.A01 = c2081fh;
        this.A02 = c1480Qc;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void AAe() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void AD8(C5G c5g) {
        new Handler(Looper.getMainLooper()).postDelayed(new C2087fn(this, c5g), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void ADO() {
        if (this.A01.A0A != null) {
            C5G c5g = this.A01.A0A;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            c5g.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void AFS(View view, MotionEvent motionEvent) throws Throwable {
        this.A02.A1A().A06(this.A01.A07, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0J(this.A00) && this.A02.A13() != null) {
            this.A02.A13().onClick(view);
        }
    }
}
