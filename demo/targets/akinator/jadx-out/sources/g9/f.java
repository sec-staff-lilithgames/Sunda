package g9;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static Integer f57448e;

    /* renamed from: a, reason: collision with root package name */
    public final View f57449a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f57450b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f57451c;

    /* renamed from: d, reason: collision with root package name */
    public e f57452d;

    public f(View view) {
        this.f57449a = view;
    }

    public final int a(int i10, int i11, int i12) {
        int i13 = i11 - i12;
        if (i13 > 0) {
            return i13;
        }
        boolean z10 = this.f57451c;
        View view = this.f57449a;
        if (z10 && view.isLayoutRequested()) {
            return 0;
        }
        int i14 = i10 - i12;
        if (i14 > 0) {
            return i14;
        }
        if (view.isLayoutRequested() || i11 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f57448e == null) {
            Display defaultDisplay = ((WindowManager) j9.q.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f57448e = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f57448e.intValue();
    }
}
