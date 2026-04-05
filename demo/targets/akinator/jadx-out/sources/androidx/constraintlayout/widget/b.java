package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5373b;

    /* renamed from: c, reason: collision with root package name */
    public final a f5374c;

    /* renamed from: d, reason: collision with root package name */
    public int f5375d;

    /* renamed from: e, reason: collision with root package name */
    public float f5376e;

    /* renamed from: f, reason: collision with root package name */
    public String f5377f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5378g;

    /* renamed from: h, reason: collision with root package name */
    public int f5379h;

    public b(String str, a aVar) {
        this.f5372a = false;
        this.f5373b = str;
        this.f5374c = aVar;
    }

    public static HashMap<String, b> extractAttributes(HashMap<String, b> map, View view) {
        HashMap<String, b> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbO = e3.g.o(" Custom Attribute \"", str, "\" not found on ");
                sbO.append(cls.getName());
                Log.e("TransitionLayout", sbO.toString(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
            } catch (InvocationTargetException e12) {
                StringBuilder sbO2 = e3.g.o(" Custom Attribute \"", str, "\" not found on ");
                sbO2.append(cls.getName());
                Log.e("TransitionLayout", sbO2.toString(), e12);
            }
        }
        return map2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, b> map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.f5547f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        a aVar = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar = a.f5368h;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                aVar = a.f5365e;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                aVar = a.f5366f;
            } else {
                a aVar2 = a.f5369i;
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    aVar = a.f5364c;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    aVar = a.f5363b;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    aVar = a.f5367g;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    aVar = a.f5370j;
                }
                aVar = aVar2;
            }
        }
        if (string != null && objValueOf != null) {
            map.put(string, new b(string, aVar, objValueOf, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, b> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            String strK = !bVar.f5372a ? a.b.k("set", str) : str;
            try {
                int iOrdinal = bVar.f5374c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strK, cls3).invoke(view, Integer.valueOf(bVar.f5375d));
                        break;
                    case 1:
                        cls.getMethod(strK, cls2).invoke(view, Float.valueOf(bVar.f5376e));
                        break;
                    case 2:
                        cls.getMethod(strK, cls3).invoke(view, Integer.valueOf(bVar.f5379h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strK, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f5379h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strK, CharSequence.class).invoke(view, bVar.f5377f);
                        break;
                    case 5:
                        cls.getMethod(strK, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f5378g));
                        break;
                    case 6:
                        cls.getMethod(strK, cls2).invoke(view, Float.valueOf(bVar.f5376e));
                        break;
                    case 7:
                        cls.getMethod(strK, cls3).invoke(view, Integer.valueOf(bVar.f5375d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbO = e3.g.o(" Custom Attribute \"", str, "\" not found on ");
                sbO.append(cls.getName());
                Log.e("TransitionLayout", sbO.toString(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strK, e11);
            } catch (InvocationTargetException e12) {
                StringBuilder sbO2 = e3.g.o(" Custom Attribute \"", str, "\" not found on ");
                sbO2.append(cls.getName());
                Log.e("TransitionLayout", sbO2.toString(), e12);
            }
        }
    }

    public boolean diff(b bVar) {
        if (bVar != null) {
            a aVar = bVar.f5374c;
            a aVar2 = this.f5374c;
            if (aVar2 == aVar) {
                switch (aVar2.ordinal()) {
                    case 0:
                    case 7:
                        if (this.f5375d == bVar.f5375d) {
                            return true;
                        }
                        break;
                    case 1:
                        return this.f5376e == bVar.f5376e;
                    case 2:
                    case 3:
                        return this.f5379h == bVar.f5379h;
                    case 4:
                        return this.f5375d == bVar.f5375d;
                    case 5:
                        return this.f5378g == bVar.f5378g;
                    case 6:
                        return this.f5376e == bVar.f5376e;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    public int getColorValue() {
        return this.f5379h;
    }

    public float getFloatValue() {
        return this.f5376e;
    }

    public int getIntegerValue() {
        return this.f5375d;
    }

    public String getName() {
        return this.f5373b;
    }

    public String getStringValue() {
        return this.f5377f;
    }

    public a getType() {
        return this.f5374c;
    }

    public float getValueToInterpolate() {
        switch (this.f5374c.ordinal()) {
            case 0:
                return this.f5375d;
            case 1:
            case 6:
                return this.f5376e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f5378g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f5374c.ordinal()) {
            case 0:
                fArr[0] = this.f5375d;
                return;
            case 1:
                fArr[0] = this.f5376e;
                return;
            case 2:
            case 3:
                int i10 = (this.f5379h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i10 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f5378g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f5376e;
                return;
            default:
                return;
        }
    }

    public boolean isBooleanValue() {
        return this.f5378g;
    }

    public boolean isContinuous() {
        int iOrdinal = this.f5374c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public boolean isMethod() {
        return this.f5372a;
    }

    public int numberOfInterpolatedValues() {
        int iOrdinal = this.f5374c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i10) {
        this.f5379h = i10;
    }

    public void setFloatValue(float f10) {
        this.f5376e = f10;
    }

    public void setIntValue(int i10) {
        this.f5375d = i10;
    }

    public void setStringValue(String str) {
        this.f5377f = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f5374c.ordinal()) {
            case 0:
            case 7:
                this.f5375d = (int) fArr[0];
                return;
            case 1:
                this.f5376e = fArr[0];
                return;
            case 2:
            case 3:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f5379h = iHSVToColor;
                int i10 = (int) (fArr[3] * 255.0f);
                int i11 = (i10 & (~(i10 >> 31))) - 255;
                this.f5379h = (((i11 & (i11 >> 31)) + 255) << 24) | (iHSVToColor & 16777215);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                this.f5378g = ((double) fArr[0]) > 0.5d;
                return;
            case 6:
                this.f5376e = fArr[0];
                return;
            default:
                return;
        }
    }

    public void applyCustom(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        boolean z10 = this.f5372a;
        String str = this.f5373b;
        String strK = !z10 ? a.b.k("set", str) : str;
        try {
            int iOrdinal = this.f5374c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                case 7:
                    cls.getMethod(strK, cls2).invoke(view, Integer.valueOf(this.f5375d));
                    break;
                case 1:
                    cls.getMethod(strK, cls3).invoke(view, Float.valueOf(this.f5376e));
                    break;
                case 2:
                    cls.getMethod(strK, cls2).invoke(view, Integer.valueOf(this.f5379h));
                    break;
                case 3:
                    Method method = cls.getMethod(strK, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f5379h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(strK, CharSequence.class).invoke(view, this.f5377f);
                    break;
                case 5:
                    cls.getMethod(strK, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f5378g));
                    break;
                case 6:
                    cls.getMethod(strK, cls3).invoke(view, Float.valueOf(this.f5376e));
                    break;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder sbO = e3.g.o(" Custom Attribute \"", str, "\" not found on ");
            sbO.append(cls.getName());
            Log.e("TransitionLayout", sbO.toString(), e10);
        } catch (NoSuchMethodException e11) {
            Log.e("TransitionLayout", cls.getName() + KerkSviMAy.DqqqkFwvWi + strK, e11);
        } catch (InvocationTargetException e12) {
            StringBuilder sbO2 = e3.g.o(" Custom Attribute \"", str, "\" not found on ");
            sbO2.append(cls.getName());
            Log.e("TransitionLayout", sbO2.toString(), e12);
        }
    }

    public b(String str, a aVar, Object obj, boolean z10) {
        this.f5373b = str;
        this.f5374c = aVar;
        this.f5372a = z10;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.f5374c.ordinal()) {
            case 0:
            case 7:
                this.f5375d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f5376e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f5379h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f5377f = (String) obj;
                break;
            case 5:
                this.f5378g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f5376e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.f5372a = false;
        this.f5373b = bVar.f5373b;
        this.f5374c = bVar.f5374c;
        setValue(obj);
    }
}
