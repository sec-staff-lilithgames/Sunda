package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f82264a = {2131231017, 2131231015, 2131230941};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f82265b = {2131230965, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f82266c = {2131231014, 2131231016, 2131230958, R.drawable.abc_text_cursor_material, 2131231011, 2131231012, 2131231013};

    /* renamed from: d, reason: collision with root package name */
    public final int[] f82267d = {2131230990, R.drawable.abc_cab_background_internal_bg, 2131230989};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f82268e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f82269f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i10) {
        int themeAttrColor = i3.getThemeAttrColor(context, R.attr.colorControlHighlight);
        int disabledThemeAttrColor = i3.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal);
        int[] iArr = i3.f82118b;
        int[] iArr2 = i3.f82120d;
        int iCompositeColors = o3.b.compositeColors(themeAttrColor, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, i3.f82119c, i3.f82122f}, new int[]{disabledThemeAttrColor, iCompositeColors, o3.b.compositeColors(themeAttrColor, i10), i10});
    }

    public static LayerDrawable c(o2 o2Var, Context context, int i10) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawable = o2Var.getDrawable(context, R.drawable.abc_star_black_48dp);
        Drawable drawable2 = o2Var.getDrawable(context, R.drawable.abc_star_half_black_48dp);
        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawable;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawable2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawable2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = w.f82286b;
        }
        drawableMutate.setColorFilter(w.getPorterDuffColorFilter(i10, mode));
    }

    @Override // q.p2
    public Drawable createDrawableFor(o2 o2Var, Context context, int i10) {
        if (i10 == R.drawable.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{o2Var.getDrawable(context, R.drawable.abc_cab_background_internal_bg), o2Var.getDrawable(context, 2131230958)});
        }
        if (i10 == R.drawable.abc_ratingbar_material) {
            return c(o2Var, context, R.dimen.abc_star_big);
        }
        if (i10 == R.drawable.abc_ratingbar_indicator_material) {
            return c(o2Var, context, R.dimen.abc_star_medium);
        }
        if (i10 == R.drawable.abc_ratingbar_small_material) {
            return c(o2Var, context, R.dimen.abc_star_small);
        }
        return null;
    }

    @Override // q.p2
    public ColorStateList getTintListForDrawableRes(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return l.a.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131231007) {
            return l.a.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, i3.getThemeAttrColor(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return b(context, i3.getThemeAttrColor(context, R.attr.colorAccent));
            }
            if (i10 == 2131231002 || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return l.a.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (a(i10, this.f82265b)) {
                return i3.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
            }
            if (a(i10, this.f82268e)) {
                return l.a.getColorStateList(context, R.color.abc_tint_default);
            }
            if (a(i10, this.f82269f)) {
                return l.a.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return l.a.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList themeAttrColorStateList = i3.getThemeAttrColorStateList(context, R.attr.colorSwitchThumbNormal);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = i3.f82118b;
            iArr2[0] = i3.getDisabledThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = i3.f82121e;
            iArr2[1] = i3.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = i3.f82122f;
            iArr2[2] = i3.getThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = i3.f82118b;
            iArr[0] = iArr3;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
            iArr[1] = i3.f82121e;
            iArr2[1] = i3.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = i3.f82122f;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // q.p2
    public PorterDuff.Mode getTintModeForDrawableRes(int i10) {
        if (i10 == R.drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    @Override // q.p2
    public boolean tintDrawable(Context context, int i10, Drawable drawable) {
        if (i10 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
            int themeAttrColor = i3.getThemeAttrColor(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode = w.f82286b;
            d(drawableFindDrawableByLayerId, themeAttrColor, mode);
            d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), i3.getThemeAttrColor(context, R.attr.colorControlNormal), mode);
            d(layerDrawable.findDrawableByLayerId(android.R.id.progress), i3.getThemeAttrColor(context, R.attr.colorControlActivated), mode);
            return true;
        }
        if (i10 != R.drawable.abc_ratingbar_material && i10 != R.drawable.abc_ratingbar_indicator_material && i10 != R.drawable.abc_ratingbar_small_material) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
        int disabledThemeAttrColor = i3.getDisabledThemeAttrColor(context, R.attr.colorControlNormal);
        PorterDuff.Mode mode2 = w.f82286b;
        d(drawableFindDrawableByLayerId2, disabledThemeAttrColor, mode2);
        d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), i3.getThemeAttrColor(context, R.attr.colorControlActivated), mode2);
        d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), i3.getThemeAttrColor(context, R.attr.colorControlActivated), mode2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    @Override // q.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tintDrawableUsingColorFilter(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            android.graphics.PorterDuff$Mode r0 = q.w.f82286b
            int[] r1 = r6.f82264a
            boolean r1 = a(r8, r1)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L14
            r8 = 2130968864(0x7f040120, float:1.7546394E38)
        L10:
            r1 = r0
            r5 = r2
        L12:
            r0 = r4
            goto L50
        L14:
            int[] r1 = r6.f82266c
            boolean r1 = a(r8, r1)
            if (r1 == 0) goto L20
            r8 = 2130968862(0x7f04011e, float:1.754639E38)
            goto L10
        L20:
            int[] r1 = r6.f82267d
            boolean r1 = a(r8, r1)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            if (r1 == 0) goto L32
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
        L2d:
            r1 = r0
            r0 = r4
            r8 = r5
        L30:
            r5 = r2
            goto L50
        L32:
            r1 = 2131230978(0x7f080102, float:1.8078024E38)
            if (r8 != r1) goto L46
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r1 = 16842800(0x1010030, float:2.3693693E-38)
            r5 = r0
            r0 = r8
            r8 = r1
            r1 = r5
            goto L30
        L46:
            r1 = 2131230960(0x7f0800f0, float:1.8077988E38)
            if (r8 != r1) goto L4c
            goto L2d
        L4c:
            r1 = r0
            r8 = r3
            r5 = r8
            goto L12
        L50:
            if (r5 == 0) goto L67
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r7 = q.i3.getThemeAttrColor(r7, r8)
            android.graphics.PorterDuffColorFilter r7 = q.w.getPorterDuffColorFilter(r7, r1)
            r9.setColorFilter(r7)
            if (r0 == r4) goto L66
            r9.setAlpha(r0)
        L66:
            return r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.v.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
