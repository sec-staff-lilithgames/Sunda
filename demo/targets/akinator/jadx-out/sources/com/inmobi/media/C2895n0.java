package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.adquality.models.AdQualityControl;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2895n0 implements InterfaceC2771fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2929p0 f33106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X1 f33107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2738dc f33109d;

    public C2895n0(C2929p0 c2929p0, X1 x12, boolean z10, C2738dc c2738dc) {
        this.f33106a = c2929p0;
        this.f33107b = x12;
        this.f33108c = z10;
        this.f33109d = c2738dc;
    }

    @Override // com.inmobi.media.InterfaceC2771fb
    public final void a(Object obj) {
        String beacon;
        Bitmap bitmap = (Bitmap) obj;
        C2929p0 c2929p0 = this.f33106a;
        X1 process = this.f33107b;
        boolean z10 = this.f33108c;
        C2738dc c2738dc = this.f33109d;
        c2929p0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        c2929p0.a("Screen shot result received - isReporting - " + z10);
        c2929p0.f33238f.remove(process);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (bitmap != null && c2738dc != null) {
            c2738dc.f32786a.c("window.mraidview.broadcastEvent('ScreenshotSuccess')");
        }
        if (z10) {
            String str = c2929p0.f33242j;
            kotlin.jvm.internal.e0.checkNotNull(byteArray);
            c2929p0.a(str, byteArray, true);
        } else {
            AdQualityControl adQualityControl = c2929p0.f33239g;
            if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                c2929p0.a("saving to file - beacon - ".concat(beacon));
                kotlin.jvm.internal.e0.checkNotNull(byteArray);
                c2929p0.a(beacon, byteArray, false);
            }
        }
        c2929p0.f33244l.set(false);
    }

    @Override // com.inmobi.media.InterfaceC2771fb
    public final void onError(Exception exc) {
        C2929p0 c2929p0 = this.f33106a;
        X1 process = this.f33107b;
        c2929p0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        c2929p0.a(exc, "error in running process - ".concat(process.getClass().getSimpleName()));
        c2929p0.f33238f.remove(process);
        c2929p0.a(true);
    }
}
