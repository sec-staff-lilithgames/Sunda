package f3;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {
    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void setInterpolatedValue(androidx.constraintlayout.widget.b bVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + bVar.getName();
        try {
            int iOrdinal = bVar.getType().ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z10 = true;
            switch (iOrdinal) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + bVar.getName());
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z10));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder sbO = e3.g.o("Cannot access method ", str, " on View \"");
            sbO.append(g3.b.getName(view));
            sbO.append("\"");
            Log.e("CustomSupport", sbO.toString(), e10);
        } catch (NoSuchMethodException e11) {
            StringBuilder sbO2 = e3.g.o("No method ", str, " on View \"");
            sbO2.append(g3.b.getName(view));
            sbO2.append("\"");
            Log.e("CustomSupport", sbO2.toString(), e11);
        } catch (InvocationTargetException e12) {
            StringBuilder sbO3 = e3.g.o("Cannot invoke method ", str, " on View \"");
            sbO3.append(g3.b.getName(view));
            sbO3.append("\"");
            Log.e("CustomSupport", sbO3.toString(), e12);
        }
    }
}
