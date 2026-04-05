package f6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0375, code lost:
    
        if (r30 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0377, code lost:
    
        if (r21 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0379, code lost:
    
        r1 = new android.animation.Animator[r21.size()];
        r2 = r21.iterator();
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0388, code lost:
    
        if (r2.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038a, code lost:
    
        r1[r12] = (android.animation.Animator) r2.next();
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0396, code lost:
    
        if (r31 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0398, code lost:
    
        r30.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x039c, code lost:
    
        r30.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r21 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r25, android.content.res.Resources r26, android.content.res.Resources.Theme r27, org.xmlpull.v1.XmlPullParser r28, android.util.AttributeSet r29, android.animation.AnimatorSet r30, int r31, float r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.l.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            o3.e[] eVarArrCreateNodesFromPathData = o3.f.createNodesFromPathData(string);
            o3.e[] eVarArrCreateNodesFromPathData2 = o3.f.createNodesFromPathData(string2);
            if (eVarArrCreateNodesFromPathData != null || eVarArrCreateNodesFromPathData2 != null) {
                if (eVarArrCreateNodesFromPathData != null) {
                    k kVar = new k();
                    if (eVarArrCreateNodesFromPathData2 == null) {
                        return PropertyValuesHolder.ofObject(str, kVar, eVarArrCreateNodesFromPathData);
                    }
                    if (o3.f.canMorph(eVarArrCreateNodesFromPathData, eVarArrCreateNodesFromPathData2)) {
                        return PropertyValuesHolder.ofObject(str, kVar, eVarArrCreateNodesFromPathData, eVarArrCreateNodesFromPathData2);
                    }
                    throw new InflateException(a.b.m(" Can't morph from ", string, " to ", string2));
                }
                if (eVarArrCreateNodesFromPathData2 != null) {
                    return PropertyValuesHolder.ofObject(str, new k(), eVarArrCreateNodesFromPathData2);
                }
            }
            return null;
        }
        m mVar = i10 == 3 ? m.getInstance() : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            if (z11) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z11) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
        }
        if (propertyValuesHolderOfInt != null && mVar != null) {
            propertyValuesHolderOfInt.setEvaluator(mVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, float f10, XmlPullParser xmlPullParser) {
        int i10;
        TypedArray typedArrayObtainAttributes = n3.q.obtainAttributes(resources, theme, attributeSet, a.f55365g);
        TypedArray typedArrayObtainAttributes2 = n3.q.obtainAttributes(resources, theme, attributeSet, a.f55369k);
        ValueAnimator valueAnimator = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long namedInt = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, IronSourceConstants.EVENTS_DURATION, 1, 300);
        int i11 = 0;
        long namedInt2 = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "valueType", 7, 4);
        if (n3.q.hasAttribute(xmlPullParser, "valueFrom") && n3.q.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(5);
                boolean z10 = typedValuePeekValue != null;
                int i12 = z10 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayObtainAttributes.peekValue(6);
                boolean z11 = typedValuePeekValue2 != null;
                namedInt3 = ((z10 && c(i12)) || (z11 && c(z11 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayObtainAttributes, namedInt3, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "repeatMode", 4, 1));
        if (typedArrayObtainAttributes2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String namedString = n3.q.getNamedString(typedArrayObtainAttributes2, xmlPullParser, "pathData", 1);
            if (namedString != null) {
                String namedString2 = n3.q.getNamedString(typedArrayObtainAttributes2, xmlPullParser, "propertyXName", 2);
                String namedString3 = n3.q.getNamedString(typedArrayObtainAttributes2, xmlPullParser, "propertyYName", 3);
                if (namedString2 == null && namedString3 == null) {
                    throw new InflateException(typedArrayObtainAttributes2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathCreatePathFromPathData = o3.f.createPathFromPathData(namedString);
                float f11 = 0.5f * f10;
                PathMeasure pathMeasure = new PathMeasure(pathCreatePathFromPathData, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathCreatePathFromPathData, false);
                int iMin = Math.min(100, ((int) (length / f11)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f12 = length / (iMin - 1);
                int i13 = 0;
                float f13 = 0.0f;
                while (true) {
                    if (i11 >= iMin) {
                        break;
                    }
                    int i14 = iMin;
                    pathMeasure2.getPosTan(f13 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i11] = fArr3[0];
                    fArr2[i11] = fArr3[1];
                    float f14 = f13 + f12;
                    int i15 = i13 + 1;
                    f13 = f14;
                    if (i15 < arrayList.size() && f13 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i11++;
                    iMin = i14;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = namedString2 != null ? PropertyValuesHolder.ofFloat(namedString2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = namedString3 != null ? PropertyValuesHolder.ofFloat(namedString3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                i10 = 0;
            } else {
                i10 = 0;
                objectAnimator2.setPropertyName(n3.q.getNamedString(typedArrayObtainAttributes2, xmlPullParser, "propertyName", 0));
            }
        } else {
            i10 = 0;
        }
        int namedResourceId = n3.q.getNamedResourceId(typedArrayObtainAttributes, xmlPullParser, "interpolator", i10, i10);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(j.loadInterpolator(context, namedResourceId));
        }
        typedArrayObtainAttributes.recycle();
        if (typedArrayObtainAttributes2 != null) {
            typedArrayObtainAttributes2.recycle();
        }
        return valueAnimator;
    }

    public static Animator loadAnimator(Context context, int i10) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i10);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, int i10) throws Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i10, 1.0f);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, int i10, float f10) throws Throwable {
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        Throwable th2;
        XmlResourceParser animation;
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                animation = resources.getAnimation(i10);
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (IOException e10) {
            iOException = e10;
        } catch (XmlPullParserException e11) {
            xmlPullParserException = e11;
        }
        try {
            Animator animatorA = a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, f10);
            animation.close();
            return animatorA;
        } catch (IOException e12) {
            iOException = e12;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
            notFoundException.initCause(iOException);
            throw notFoundException;
        } catch (XmlPullParserException e13) {
            xmlPullParserException = e13;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
            notFoundException2.initCause(xmlPullParserException);
            throw notFoundException2;
        } catch (Throwable th4) {
            th2 = th4;
            xmlResourceParser = animation;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
                throw th2;
            }
            throw th2;
        }
    }
}
