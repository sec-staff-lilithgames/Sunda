package f6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public w f55374a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f55375b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f55376c;

    /* renamed from: d, reason: collision with root package name */
    public z.f f55377d;

    public g(Context context, g gVar, Drawable.Callback callback, Resources resources) {
        if (gVar != null) {
            w wVar = gVar.f55374a;
            if (wVar != null) {
                Drawable.ConstantState constantState = wVar.getConstantState();
                if (resources != null) {
                    this.f55374a = (w) constantState.newDrawable(resources);
                } else {
                    this.f55374a = (w) constantState.newDrawable();
                }
                w wVar2 = (w) this.f55374a.mutate();
                this.f55374a = wVar2;
                wVar2.setCallback(callback);
                this.f55374a.setBounds(gVar.f55374a.getBounds());
                this.f55374a.f55446h = false;
            }
            ArrayList arrayList = gVar.f55376c;
            if (arrayList != null) {
                int size = arrayList.size();
                this.f55376c = new ArrayList(size);
                this.f55377d = new z.f(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Animator animator = (Animator) gVar.f55376c.get(i10);
                    Animator animatorClone = animator.clone();
                    String str = (String) gVar.f55377d.get(animator);
                    animatorClone.setTarget(this.f55374a.f55442c.f55429b.f55427o.get(str));
                    this.f55376c.add(animatorClone);
                    this.f55377d.put(animatorClone, str);
                }
                setupAnimatorSet();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public void setupAnimatorSet() {
        if (this.f55375b == null) {
            this.f55375b = new AnimatorSet();
        }
        this.f55375b.playTogether(this.f55376c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
