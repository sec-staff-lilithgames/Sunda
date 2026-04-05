package xf;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.badge.BadgeState$State;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import qg.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final BadgeState$State f91956a;

    /* renamed from: b, reason: collision with root package name */
    public final BadgeState$State f91957b;

    /* renamed from: c, reason: collision with root package name */
    public final float f91958c;

    /* renamed from: d, reason: collision with root package name */
    public final float f91959d;

    /* renamed from: e, reason: collision with root package name */
    public final float f91960e;

    /* renamed from: f, reason: collision with root package name */
    public final float f91961f;

    /* renamed from: g, reason: collision with root package name */
    public final float f91962g;

    /* renamed from: h, reason: collision with root package name */
    public final float f91963h;

    /* renamed from: i, reason: collision with root package name */
    public final int f91964i;

    /* renamed from: j, reason: collision with root package name */
    public final int f91965j;

    /* renamed from: k, reason: collision with root package name */
    public final int f91966k;

    /* renamed from: l, reason: collision with root package name */
    public int f91967l;

    public c(Context context, int i10, BadgeState$State badgeState$State) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet drawableXml;
        int styleAttribute;
        BadgeState$State badgeState$State2 = new BadgeState$State();
        this.f91957b = badgeState$State2;
        badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        if (i10 != 0) {
            badgeState$State.f28889b = i10;
        }
        int i11 = badgeState$State.f28889b;
        if (i11 != 0) {
            drawableXml = mg.c.parseDrawableXml(context, i11, "badge");
            styleAttribute = drawableXml.getStyleAttribute();
        } else {
            drawableXml = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context, drawableXml, uf.a.f88455c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f91958c = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        this.f91964i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f91965j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f91959d = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, -1);
        this.f91960e = typedArrayObtainStyledAttributes.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f91962g = typedArrayObtainStyledAttributes.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f91961f = typedArrayObtainStyledAttributes.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f91963h = typedArrayObtainStyledAttributes.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f91966k = typedArrayObtainStyledAttributes.getInt(25, 1);
        this.f91967l = typedArrayObtainStyledAttributes.getInt(2, 0);
        int i12 = badgeState$State.f28897k;
        badgeState$State2.f28897k = i12 == -2 ? 255 : i12;
        int i13 = badgeState$State.f28899m;
        if (i13 != -2) {
            badgeState$State2.f28899m = i13;
        } else if (typedArrayObtainStyledAttributes.hasValue(24)) {
            badgeState$State2.f28899m = typedArrayObtainStyledAttributes.getInt(24, 0);
        } else {
            badgeState$State2.f28899m = -1;
        }
        String str = badgeState$State.f28898l;
        if (str != null) {
            badgeState$State2.f28898l = str;
        } else if (typedArrayObtainStyledAttributes.hasValue(8)) {
            badgeState$State2.f28898l = typedArrayObtainStyledAttributes.getString(8);
        }
        badgeState$State2.f28903q = badgeState$State.f28903q;
        CharSequence charSequence = badgeState$State.f28904r;
        badgeState$State2.f28904r = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        int i14 = badgeState$State.f28905s;
        badgeState$State2.f28905s = i14 == 0 ? R.plurals.mtrl_badge_content_description : i14;
        int i15 = badgeState$State.f28906t;
        badgeState$State2.f28906t = i15 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i15;
        Boolean bool = badgeState$State.f28908v;
        badgeState$State2.f28908v = Boolean.valueOf(bool == null || bool.booleanValue());
        int i16 = badgeState$State.f28900n;
        badgeState$State2.f28900n = i16 == -2 ? typedArrayObtainStyledAttributes.getInt(22, -2) : i16;
        int i17 = badgeState$State.f28901o;
        badgeState$State2.f28901o = i17 == -2 ? typedArrayObtainStyledAttributes.getInt(23, -2) : i17;
        Integer num = badgeState$State.f28893g;
        badgeState$State2.f28893g = Integer.valueOf(num == null ? typedArrayObtainStyledAttributes.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        Integer num2 = badgeState$State.f28894h;
        badgeState$State2.f28894h = Integer.valueOf(num2 == null ? typedArrayObtainStyledAttributes.getResourceId(7, 0) : num2.intValue());
        Integer num3 = badgeState$State.f28895i;
        badgeState$State2.f28895i = Integer.valueOf(num3 == null ? typedArrayObtainStyledAttributes.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        Integer num4 = badgeState$State.f28896j;
        badgeState$State2.f28896j = Integer.valueOf(num4 == null ? typedArrayObtainStyledAttributes.getResourceId(17, 0) : num4.intValue());
        Integer num5 = badgeState$State.f28890c;
        badgeState$State2.f28890c = Integer.valueOf(num5 == null ? ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 1).getDefaultColor() : num5.intValue());
        Integer num6 = badgeState$State.f28892f;
        badgeState$State2.f28892f = Integer.valueOf(num6 == null ? typedArrayObtainStyledAttributes.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.f28891e;
        if (num7 != null) {
            badgeState$State2.f28891e = num7;
        } else if (typedArrayObtainStyledAttributes.hasValue(10)) {
            badgeState$State2.f28891e = Integer.valueOf(ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 10).getDefaultColor());
        } else {
            badgeState$State2.f28891e = Integer.valueOf(new ug.g(context, badgeState$State2.f28892f.intValue()).getTextColor().getDefaultColor());
        }
        Integer num8 = badgeState$State.f28907u;
        badgeState$State2.f28907u = Integer.valueOf(num8 == null ? typedArrayObtainStyledAttributes.getInt(3, 8388661) : num8.intValue());
        Integer num9 = badgeState$State.f28909w;
        badgeState$State2.f28909w = Integer.valueOf(num9 == null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        Integer num10 = badgeState$State.f28910x;
        badgeState$State2.f28910x = Integer.valueOf(num10 == null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        Integer num11 = badgeState$State.f28911y;
        badgeState$State2.f28911y = Integer.valueOf(num11 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(19, 0) : num11.intValue());
        Integer num12 = badgeState$State.f28912z;
        badgeState$State2.f28912z = Integer.valueOf(num12 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(26, 0) : num12.intValue());
        Integer num13 = badgeState$State.A;
        badgeState$State2.A = Integer.valueOf(num13 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(20, badgeState$State2.f28911y.intValue()) : num13.intValue());
        Integer num14 = badgeState$State.B;
        badgeState$State2.B = Integer.valueOf(num14 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(27, badgeState$State2.f28912z.intValue()) : num14.intValue());
        Integer num15 = badgeState$State.E;
        badgeState$State2.E = Integer.valueOf(num15 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(21, 0) : num15.intValue());
        Integer num16 = badgeState$State.C;
        badgeState$State2.C = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        Integer num17 = badgeState$State.D;
        badgeState$State2.D = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        Boolean bool2 = badgeState$State.F;
        badgeState$State2.F = Boolean.valueOf(bool2 == null ? typedArrayObtainStyledAttributes.getBoolean(0, false) : bool2.booleanValue());
        typedArrayObtainStyledAttributes.recycle();
        Locale locale = badgeState$State.f28902p;
        if (locale == null) {
            badgeState$State2.f28902p = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            badgeState$State2.f28902p = locale;
        }
        this.f91956a = badgeState$State;
    }
}
