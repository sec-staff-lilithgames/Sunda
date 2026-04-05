package e6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.C3191e4;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends c0 {
    public static final String[] S = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b T = new b(PointF.class, "topLeft");
    public static final c U = new c(PointF.class, "bottomRight");
    public static final d V = new d(PointF.class, "bottomRight");
    public static final e W = new e(PointF.class, "topLeft");
    public static final f X = new f(PointF.class, C3191e4.h.L);
    public static final v Y = new v();
    public boolean R;

    public k() {
        this.R = false;
    }

    @Override // e6.c0
    public void captureEndValues(v0 v0Var) {
        t(v0Var);
    }

    @Override // e6.c0
    public void captureStartValues(v0 v0Var) {
        Rect rect;
        t(v0Var);
        if (!this.R || (rect = (Rect) v0Var.f53875b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        v0Var.f53874a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e6.c0
    public Animator createAnimator(ViewGroup viewGroup, v0 v0Var, v0 v0Var2) {
        int i10;
        int i11;
        int i12;
        int i13;
        Animator animatorA;
        int i14;
        Rect rect;
        Animator animator;
        if (v0Var != null) {
            HashMap map = v0Var.f53874a;
            if (v0Var2 != null) {
                HashMap map2 = v0Var2.f53874a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = v0Var2.f53875b;
                    Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
                    int i15 = rect2.left;
                    int i16 = rect3.left;
                    int i17 = rect2.top;
                    int i18 = rect3.top;
                    int i19 = rect2.right;
                    int i20 = rect3.right;
                    int i21 = rect2.bottom;
                    int i22 = rect3.bottom;
                    int i23 = i19 - i15;
                    int i24 = i21 - i17;
                    int i25 = i20 - i16;
                    int i26 = i22 - i18;
                    Rect rect4 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
                        i10 = 0;
                    } else {
                        i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
                        if (i19 != i20 || i21 != i22) {
                            i10++;
                        }
                    }
                    if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                        i10++;
                    }
                    int i27 = i10;
                    if (i27 <= 0) {
                        return null;
                    }
                    boolean z10 = this.R;
                    f fVar = X;
                    if (z10) {
                        b1.a(view, i15, i17, i15 + Math.max(i23, i25), i17 + Math.max(i24, i26));
                        if (i15 == i16 && i17 == i18) {
                            animatorA = null;
                            i11 = i21;
                            i13 = i16;
                            i12 = i20;
                        } else {
                            i11 = i21;
                            i12 = i20;
                            i13 = i16;
                            animatorA = t.a(view, fVar, getPathMotion().getPath(i15, i17, i16, i18));
                        }
                        boolean z11 = rect4 == null;
                        if (z11) {
                            i14 = 0;
                            rect = new Rect(0, 0, i23, i24);
                        } else {
                            i14 = 0;
                            rect = rect4;
                        }
                        int i28 = rect5 == null ? 1 : i14;
                        Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
                        if (rect.equals(rect6)) {
                            animator = null;
                        } else {
                            view.setClipBounds(rect);
                            Animator animatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", Y, rect, rect6);
                            h hVar = new h(view, rect, z11, rect6, i28, i15, i17, i19, i11, i13, i18, i12, i22);
                            animatorOfObject.addListener(hVar);
                            addListener(hVar);
                            animator = animatorOfObject;
                        }
                        boolean z12 = u0.f53873a;
                        if (animatorA == null) {
                            animatorA = animator;
                        } else if (animator != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(animatorA, animator);
                            animatorA = animatorSet;
                        }
                    } else {
                        b1.a(view, i15, i17, i19, i21);
                        if (i27 != 2) {
                            animatorA = (i15 == i16 && i17 == i18) ? t.a(view, V, getPathMotion().getPath(i19, i21, i20, i22)) : t.a(view, W, getPathMotion().getPath(i15, i17, i16, i18));
                        } else if (i23 == i25 && i24 == i26) {
                            animatorA = t.a(view, fVar, getPathMotion().getPath(i15, i17, i16, i18));
                        } else {
                            j jVar = new j(view);
                            Animator animatorA2 = t.a(jVar, T, getPathMotion().getPath(i15, i17, i16, i18));
                            Animator animatorA3 = t.a(jVar, U, getPathMotion().getPath(i19, i21, i20, i22));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(animatorA2, animatorA3);
                            animatorSet2.addListener(new g(jVar));
                            animatorA = animatorSet2;
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        x.c(viewGroup4, true);
                        getRootTransition().addListener(new i(viewGroup4));
                    }
                    return animatorA;
                }
            }
        }
        return null;
    }

    public boolean getResizeClip() {
        return this.R;
    }

    @Override // e6.c0
    public String[] getTransitionProperties() {
        return S;
    }

    @Override // e6.c0
    public boolean isSeekingSupported() {
        return true;
    }

    public void setResizeClip(boolean z10) {
        this.R = z10;
    }

    public final void t(v0 v0Var) {
        View view = v0Var.f53875b;
        HashMap map = v0Var.f53874a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", v0Var.f53875b.getParent());
        if (this.R) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f53888b);
        boolean namedBoolean = n3.q.getNamedBoolean(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }
}
