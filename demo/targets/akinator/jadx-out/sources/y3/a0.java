package y3;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.appcompat.app.j0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f94032a;

    public a0() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f94032a = c4.a.p();
        } else {
            this.f94032a = null;
        }
    }

    public static a0 obtain(a0 a0Var) {
        AccessibilityWindowInfo accessibilityWindowInfoObtain;
        if (a0Var == null || (accessibilityWindowInfoObtain = AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) a0Var.f94032a)) == null) {
            return null;
        }
        return new a0(accessibilityWindowInfoObtain);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        Object obj2 = ((a0) obj).f94032a;
        Object obj3 = this.f94032a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public c getAnchor() {
        return c.e(((AccessibilityWindowInfo) this.f94032a).getAnchor());
    }

    public void getBoundsInScreen(Rect rect) {
        ((AccessibilityWindowInfo) this.f94032a).getBoundsInScreen(rect);
    }

    public a0 getChild(int i10) {
        AccessibilityWindowInfo child = ((AccessibilityWindowInfo) this.f94032a).getChild(i10);
        if (child != null) {
            return new a0(child);
        }
        return null;
    }

    public int getChildCount() {
        return ((AccessibilityWindowInfo) this.f94032a).getChildCount();
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return y.a((AccessibilityWindowInfo) this.f94032a);
        }
        return 0;
    }

    public int getId() {
        return ((AccessibilityWindowInfo) this.f94032a).getId();
    }

    public int getLayer() {
        return ((AccessibilityWindowInfo) this.f94032a).getLayer();
    }

    public t3.p getLocales() {
        return Build.VERSION.SDK_INT >= 34 ? t3.p.wrap(z.a((AccessibilityWindowInfo) this.f94032a)) : t3.p.getEmptyLocaleList();
    }

    public a0 getParent() {
        AccessibilityWindowInfo parent = ((AccessibilityWindowInfo) this.f94032a).getParent();
        if (parent != null) {
            return new a0(parent);
        }
        return null;
    }

    public void getRegionInScreen(Region region) {
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f94032a;
        if (i10 >= 33) {
            y.b((AccessibilityWindowInfo) obj, region);
            return;
        }
        Rect rect = new Rect();
        ((AccessibilityWindowInfo) obj).getBoundsInScreen(rect);
        region.set(rect);
    }

    public c getRoot() {
        return c.e(((AccessibilityWindowInfo) this.f94032a).getRoot());
    }

    public CharSequence getTitle() {
        return ((AccessibilityWindowInfo) this.f94032a).getTitle();
    }

    public long getTransitionTimeMillis() {
        if (Build.VERSION.SDK_INT >= 34) {
            return z.getTransitionTimeMillis((AccessibilityWindowInfo) this.f94032a);
        }
        return 0L;
    }

    public int getType() {
        return ((AccessibilityWindowInfo) this.f94032a).getType();
    }

    public int hashCode() {
        Object obj = this.f94032a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return ((AccessibilityWindowInfo) this.f94032a).isAccessibilityFocused();
    }

    public boolean isActive() {
        return ((AccessibilityWindowInfo) this.f94032a).isActive();
    }

    public boolean isFocused() {
        return ((AccessibilityWindowInfo) this.f94032a).isFocused();
    }

    public boolean isInPictureInPictureMode() {
        if (Build.VERSION.SDK_INT >= 26) {
            return j0.k0((AccessibilityWindowInfo) this.f94032a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb2.append(getId());
        sb2.append(", type=");
        int type = getType();
        sb2.append(type != 1 ? type != 2 ? type != 3 ? type != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION");
        sb2.append(", layer=");
        sb2.append(getLayer());
        sb2.append(", bounds=");
        sb2.append(rect);
        sb2.append(", focused=");
        sb2.append(isFocused());
        sb2.append(", active=");
        sb2.append(isActive());
        sb2.append(", hasParent=");
        sb2.append(getParent() != null);
        sb2.append(", hasChildren=");
        sb2.append(getChildCount() > 0);
        sb2.append(", transitionTime=");
        sb2.append(getTransitionTimeMillis());
        sb2.append(", locales=");
        sb2.append(getLocales());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public AccessibilityWindowInfo unwrap() {
        return (AccessibilityWindowInfo) this.f94032a;
    }

    public static a0 obtain() {
        AccessibilityWindowInfo accessibilityWindowInfoObtain = AccessibilityWindowInfo.obtain();
        if (accessibilityWindowInfoObtain != null) {
            return new a0(accessibilityWindowInfoObtain);
        }
        return null;
    }

    public c getRoot(int i10) {
        if (Build.VERSION.SDK_INT >= 33) {
            return y.getRoot(this.f94032a, i10);
        }
        return getRoot();
    }

    public a0(Object obj) {
        this.f94032a = obj;
    }

    @Deprecated
    public void recycle() {
    }
}
