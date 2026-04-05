package x3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t1 {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
    }

    public static void e(View view, b4.b bVar) {
        view.setContentCaptureSession(bVar == null ? null : bVar.toContentCaptureSession());
    }

    public static void f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
