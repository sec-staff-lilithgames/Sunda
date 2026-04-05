package zq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.digidust.elokence.akinator.freemium.R;
import ir.s;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends Button {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        setAllCaps(false);
        setMinHeight(s.dpToPx(context, 40.0f));
        setMinWidth(0);
        setGravity(8388627);
        setIncludeFontPadding(false);
        setElevation(0.0f);
        setStateListAnimator(null);
        int iDpToPx = s.dpToPx(context, 24.0f);
        int iDpToPx2 = s.dpToPx(context, 10.0f);
        int iDpToPx3 = s.dpToPx(context, 8.0f);
        setPadding(iDpToPx, iDpToPx2, iDpToPx, iDpToPx2);
        setCompoundDrawablePadding(iDpToPx3);
        setBackgroundResource(R.drawable.bm_bg_privacy_button);
        setTextColor(s.getColorCompat(context, R.color.bm_privacy_button_text_color));
    }

    public final void setActionIcon(Drawable drawable) {
        Drawable drawableMutate;
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        int colorCompat = s.getColorCompat(context, R.color.bm_privacy_button_icon_color);
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Context context2 = getContext();
                e0.checkNotNullExpressionValue(context2, "context");
                int iDpToPx = s.dpToPx(context2, 24.0f);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != iDpToPx || height != iDpToPx) {
                    float f10 = iDpToPx;
                    float f11 = width;
                    float f12 = height;
                    float fMin = Math.min(f10 / f11, f10 / f12);
                    drawable = new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, (int) (f11 * fMin), (int) (f12 * fMin), true));
                }
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setTint(colorCompat);
        } else {
            drawableMutate = null;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
    }
}
