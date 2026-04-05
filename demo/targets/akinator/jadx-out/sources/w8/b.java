package w8;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import n8.u;
import n8.v;
import n8.w;
import x8.a0;
import x8.g0;
import x8.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f90453a = g0.getInstance();

    /* renamed from: b, reason: collision with root package name */
    public final int f90454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90455c;

    /* renamed from: d, reason: collision with root package name */
    public final n8.b f90456d;

    /* renamed from: e, reason: collision with root package name */
    public final x f90457e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90458f;

    /* renamed from: g, reason: collision with root package name */
    public final w f90459g;

    public b(int i10, int i11, v vVar) {
        this.f90454b = i10;
        this.f90455c = i11;
        this.f90456d = (n8.b) vVar.get(a0.f91793f);
        this.f90457e = (x) vVar.get(x.f91884f);
        u uVar = a0.f91796i;
        this.f90458f = vVar.get(uVar) != null && ((Boolean) vVar.get(uVar)).booleanValue();
        this.f90459g = (w) vVar.get(a0.f91794g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f90453a.isHardwareConfigAllowed(this.f90454b, this.f90455c, this.f90458f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f90456d == n8.b.f75830c) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f90454b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f90455c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float scaleFactor = this.f90457e.getScaleFactor(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * scaleFactor);
        int iRound2 = Math.round(size.getHeight() * scaleFactor);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + scaleFactor);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        w wVar = this.f90459g;
        if (wVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((wVar == w.f75857b && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
