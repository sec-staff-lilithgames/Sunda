package m1;

import j1.r0;
import j1.y0;
import kotlin.jvm.internal.e0;
import s2.q;
import s2.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final a m5578BitmapPainterQZhYCtY(y0 image, long j10, long j11, int i10) {
        e0.checkNotNullParameter(image, "image");
        a aVar = new a(image, j10, j11, null);
        aVar.m5577setFilterQualityvDHp3xo$ui_graphics_release(i10);
        return aVar;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ a m5579BitmapPainterQZhYCtY$default(y0 y0Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = q.f85352b.m6920getZeronOccac();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = w.IntSize(y0Var.getWidth(), y0Var.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = r0.f68948b.m4907getLowfv9h1I();
        }
        return m5578BitmapPainterQZhYCtY(y0Var, j12, j13, i10);
    }
}
