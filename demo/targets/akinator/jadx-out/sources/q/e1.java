package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f82066l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f82067m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f82068a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f82069b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f82070c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f82071d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f82072e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f82073f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f82074g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f82075h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f82076i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f82077j;

    /* renamed from: k, reason: collision with root package name */
    public final b1 f82078k;

    public e1(TextView textView) {
        this.f82076i = textView;
        this.f82077j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f82078k = new c1();
        } else {
            this.f82078k = new b1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f82067m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f82069b) {
                if (this.f82076i.getMeasuredHeight() <= 0 || this.f82076i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f82078k.b(this.f82076i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : (this.f82076i.getMeasuredWidth() - this.f82076i.getTotalPaddingLeft()) - this.f82076i.getTotalPaddingRight();
                int height = (this.f82076i.getHeight() - this.f82076i.getCompoundPaddingBottom()) - this.f82076i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f82066l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f82076i.getTextSize()) {
                            g(fC, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f82069b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f82073f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f82073f[i13];
            TextView textView = this.f82076i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f82075h;
            if (textPaint == null) {
                this.f82075h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f82075h.set(textView.getPaint());
            this.f82075h.setTextSize(i14);
            StaticLayout staticLayoutA = a1.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f82075h, this.f82078k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f82073f[i11];
    }

    public final boolean f() {
        return j() && this.f82068a != 0;
    }

    public final void g(float f10, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f82077j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f82076i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f82069b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f82068a == 1) {
            if (!this.f82074g || this.f82073f.length == 0) {
                int iFloor = ((int) Math.floor((this.f82072e - this.f82071d) / this.f82070c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f82070c) + this.f82071d);
                }
                this.f82073f = b(iArr);
            }
            this.f82069b = true;
        } else {
            this.f82069b = false;
        }
        return this.f82069b;
    }

    public final boolean i() {
        boolean z10 = this.f82073f.length > 0;
        this.f82074g = z10;
        if (z10) {
            this.f82068a = 1;
            this.f82071d = r0[0];
            this.f82072e = r0[r1 - 1];
            this.f82070c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f82076i instanceof y);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f82068a = 1;
        this.f82071d = f10;
        this.f82072e = f11;
        this.f82070c = f12;
        this.f82074g = false;
    }
}
