package r7;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f83994a;

    /* renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f83995b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f83996c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f83997d;

    public s0(LottieAnimationView lottieAnimationView) {
        this.f83994a = new HashMap();
        this.f83997d = true;
        this.f83995b = lottieAnimationView;
        this.f83996c = null;
    }

    public String getText(String str, String str2) {
        return getText(str2);
    }

    public final String getTextInternal(String str, String str2) {
        boolean z10 = this.f83997d;
        HashMap map = this.f83994a;
        if (z10 && map.containsKey(str2)) {
            return (String) map.get(str2);
        }
        String text = getText(str, str2);
        if (this.f83997d) {
            map.put(str2, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.f83994a.clear();
        LottieAnimationView lottieAnimationView = this.f83995b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        a0 a0Var = this.f83996c;
        if (a0Var != null) {
            a0Var.invalidateSelf();
        }
    }

    public void invalidateText(String str) {
        this.f83994a.remove(str);
        LottieAnimationView lottieAnimationView = this.f83995b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        a0 a0Var = this.f83996c;
        if (a0Var != null) {
            a0Var.invalidateSelf();
        }
    }

    public void setCacheText(boolean z10) {
        this.f83997d = z10;
    }

    public void setText(String str, String str2) {
        this.f83994a.put(str, str2);
        LottieAnimationView lottieAnimationView = this.f83995b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        a0 a0Var = this.f83996c;
        if (a0Var != null) {
            a0Var.invalidateSelf();
        }
    }

    public String getText(String str) {
        return str;
    }

    public s0(a0 a0Var) {
        this.f83994a = new HashMap();
        this.f83997d = true;
        this.f83996c = a0Var;
        this.f83995b = null;
    }
}
