package zm;

import android.content.Context;
import android.util.Log;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c extends TextureView {

    /* renamed from: b, reason: collision with root package name */
    public int f98307b;

    /* renamed from: c, reason: collision with root package name */
    public int f98308c;

    public c(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int defaultSize = View.getDefaultSize(this.f98307b, i10);
        int defaultSize2 = View.getDefaultSize(this.f98308c, i11);
        if (this.f98307b > 0 && this.f98308c > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i13 = this.f98307b;
                int i14 = i13 * size2;
                int i15 = this.f98308c;
                int i16 = size * i15;
                if (i14 < i16) {
                    defaultSize = i14 / i15;
                    defaultSize2 = size2;
                } else {
                    if (i14 > i16) {
                        defaultSize2 = i16 / i13;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i17 = (this.f98308c * size) / this.f98307b;
                if (mode2 != Integer.MIN_VALUE || i17 <= size2) {
                    defaultSize2 = i17;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i12 = (this.f98307b * size2) / this.f98308c;
                    if (mode == Integer.MIN_VALUE && i12 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i18 = this.f98307b;
                    int i19 = this.f98308c;
                    if (mode2 != Integer.MIN_VALUE || i19 <= size2) {
                        i12 = i18;
                        size2 = i19;
                    } else {
                        i12 = (size2 * i18) / i19;
                    }
                    if (mode == Integer.MIN_VALUE && i12 > size) {
                        defaultSize2 = (i19 * size) / i18;
                        defaultSize = size;
                    }
                }
                defaultSize = i12;
                defaultSize2 = size2;
            }
        }
        Log.e("Size", defaultSize + "/" + defaultSize2);
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void setVideoSize(int i10, int i11) {
        this.f98307b = i10;
        this.f98308c = i11;
        requestLayout();
    }
}
