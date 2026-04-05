package vf;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final t1 f89252a = new t1();

    /* renamed from: b, reason: collision with root package name */
    public final t1 f89253b = new t1();

    public static h a(ArrayList arrayList) {
        h hVar = new h();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            i iVar = new i(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            iVar.f89257d = objectAnimator.getRepeatCount();
            iVar.f89258e = objectAnimator.getRepeatMode();
            hVar.setTiming(propertyName, iVar);
        }
        return hVar;
    }

    public static h createFromAttribute(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    public static h createFromResource(Context context, int i10) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return a(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f89252a.equals(((h) obj).f89252a);
        }
        return false;
    }

    public <T> ObjectAnimator getAnimator(String str, T t10, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (!hasPropertyValues(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f89253b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    public i getTiming(String str) {
        if (hasTiming(str)) {
            return (i) this.f89252a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        t1 t1Var = this.f89252a;
        int size = t1Var.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) t1Var.valueAt(i10);
            jMax = Math.max(jMax, iVar.getDuration() + iVar.getDelay());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.f89253b.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.f89252a.get(str) != null;
    }

    public int hashCode() {
        return this.f89252a.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f89253b.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, i iVar) {
        this.f89252a.put(str, iVar);
    }

    public String toString() {
        return "\n" + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f89252a + "}\n";
    }
}
