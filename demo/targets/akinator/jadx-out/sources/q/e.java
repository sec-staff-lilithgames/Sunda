package q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f82061a;

    public e(ActionBarContainer actionBarContainer) {
        this.f82061a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f82061a;
        if (actionBarContainer.f4939j) {
            Drawable drawable = actionBarContainer.f4938i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4936g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4937h;
        if (drawable3 == null || !actionBarContainer.f4940k) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f82061a;
        if (actionBarContainer.f4939j) {
            if (actionBarContainer.f4938i != null) {
                d.getOutline(actionBarContainer.f4936g, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4936g;
            if (drawable != null) {
                d.getOutline(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
