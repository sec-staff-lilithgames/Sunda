package com.digidust.elokence.akinator.views;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class DarkAutoButton extends AppCompatButton {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends LayerDrawable {

        /* renamed from: b, reason: collision with root package name */
        public final LightingColorFilter f21816b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21817c;

        /* renamed from: e, reason: collision with root package name */
        public final int f21818e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DarkAutoButton darkAutoButton, Drawable d10) {
            super(new Drawable[]{d10});
            e0.checkNotNullParameter(d10, "d");
            this.f21816b = new LightingColorFilter(-7829368, 1);
            this.f21817c = 100;
            this.f21818e = 255;
        }

        public final int get_disabledAlpha() {
            return this.f21817c;
        }

        public final int get_fullAlpha() {
            return this.f21818e;
        }

        public final ColorFilter get_pressedFilter() {
            return this.f21816b;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final boolean onStateChange(int[] states) {
            e0.checkNotNullParameter(states, "states");
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 : states) {
                if (i10 == 16842910) {
                    z10 = true;
                } else if (i10 == 16842919) {
                    z11 = true;
                }
            }
            mutate();
            if (z10 && z11) {
                setColorFilter(this.f21816b);
            } else if (z10) {
                setColorFilter(null);
                setAlpha(this.f21818e);
            } else {
                setColorFilter(null);
                setAlpha(this.f21817c);
            }
            invalidateSelf();
            return super.onStateChange(states);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkAutoButton(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == null) {
            setBackgroundColor(0);
        } else {
            super.setBackground(new a(this, drawable));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkAutoButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkAutoButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
    }
}
