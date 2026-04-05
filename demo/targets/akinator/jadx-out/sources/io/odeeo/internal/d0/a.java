package io.odeeo.internal.d0;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import io.odeeo.internal.b.g;
import io.odeeo.internal.t0.p;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements io.odeeo.internal.b.g {

    /* renamed from: r, reason: collision with root package name */
    public static final a f63544r = new b().setText("").build();

    /* renamed from: s, reason: collision with root package name */
    public static final g.a<a> f63545s = new li.a(26);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f63546a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f63547b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f63548c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f63549d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63550e;

    /* renamed from: f, reason: collision with root package name */
    public final int f63551f;

    /* renamed from: g, reason: collision with root package name */
    public final int f63552g;

    /* renamed from: h, reason: collision with root package name */
    public final float f63553h;

    /* renamed from: i, reason: collision with root package name */
    public final int f63554i;

    /* renamed from: j, reason: collision with root package name */
    public final float f63555j;

    /* renamed from: k, reason: collision with root package name */
    public final float f63556k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f63557l;

    /* renamed from: m, reason: collision with root package name */
    public final int f63558m;

    /* renamed from: n, reason: collision with root package name */
    public final int f63559n;

    /* renamed from: o, reason: collision with root package name */
    public final float f63560o;

    /* renamed from: p, reason: collision with root package name */
    public final int f63561p;

    /* renamed from: q, reason: collision with root package name */
    public final float f63562q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f63563a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f63564b;

        /* renamed from: c, reason: collision with root package name */
        public Layout.Alignment f63565c;

        /* renamed from: d, reason: collision with root package name */
        public Layout.Alignment f63566d;

        /* renamed from: e, reason: collision with root package name */
        public float f63567e;

        /* renamed from: f, reason: collision with root package name */
        public int f63568f;

        /* renamed from: g, reason: collision with root package name */
        public int f63569g;

        /* renamed from: h, reason: collision with root package name */
        public float f63570h;

        /* renamed from: i, reason: collision with root package name */
        public int f63571i;

        /* renamed from: j, reason: collision with root package name */
        public int f63572j;

        /* renamed from: k, reason: collision with root package name */
        public float f63573k;

        /* renamed from: l, reason: collision with root package name */
        public float f63574l;

        /* renamed from: m, reason: collision with root package name */
        public float f63575m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f63576n;

        /* renamed from: o, reason: collision with root package name */
        public int f63577o;

        /* renamed from: p, reason: collision with root package name */
        public int f63578p;

        /* renamed from: q, reason: collision with root package name */
        public float f63579q;

        public a build() {
            return new a(this.f63563a, this.f63565c, this.f63566d, this.f63564b, this.f63567e, this.f63568f, this.f63569g, this.f63570h, this.f63571i, this.f63572j, this.f63573k, this.f63574l, this.f63575m, this.f63576n, this.f63577o, this.f63578p, this.f63579q);
        }

        public b clearWindowColor() {
            this.f63576n = false;
            return this;
        }

        @Pure
        public Bitmap getBitmap() {
            return this.f63564b;
        }

        @Pure
        public float getBitmapHeight() {
            return this.f63575m;
        }

        @Pure
        public float getLine() {
            return this.f63567e;
        }

        @Pure
        public int getLineAnchor() {
            return this.f63569g;
        }

        @Pure
        public int getLineType() {
            return this.f63568f;
        }

        @Pure
        public float getPosition() {
            return this.f63570h;
        }

        @Pure
        public int getPositionAnchor() {
            return this.f63571i;
        }

        @Pure
        public float getSize() {
            return this.f63574l;
        }

        @Pure
        public CharSequence getText() {
            return this.f63563a;
        }

        @Pure
        public Layout.Alignment getTextAlignment() {
            return this.f63565c;
        }

        @Pure
        public float getTextSize() {
            return this.f63573k;
        }

        @Pure
        public int getTextSizeType() {
            return this.f63572j;
        }

        @Pure
        public int getVerticalType() {
            return this.f63578p;
        }

        @Pure
        public int getWindowColor() {
            return this.f63577o;
        }

        public boolean isWindowColorSet() {
            return this.f63576n;
        }

        public b setBitmap(Bitmap bitmap) {
            this.f63564b = bitmap;
            return this;
        }

        public b setBitmapHeight(float f10) {
            this.f63575m = f10;
            return this;
        }

        public b setLine(float f10, int i10) {
            this.f63567e = f10;
            this.f63568f = i10;
            return this;
        }

        public b setLineAnchor(int i10) {
            this.f63569g = i10;
            return this;
        }

        public b setMultiRowAlignment(Layout.Alignment alignment) {
            this.f63566d = alignment;
            return this;
        }

        public b setPosition(float f10) {
            this.f63570h = f10;
            return this;
        }

        public b setPositionAnchor(int i10) {
            this.f63571i = i10;
            return this;
        }

        public b setShearDegrees(float f10) {
            this.f63579q = f10;
            return this;
        }

        public b setSize(float f10) {
            this.f63574l = f10;
            return this;
        }

        public b setText(CharSequence charSequence) {
            this.f63563a = charSequence;
            return this;
        }

        public b setTextAlignment(Layout.Alignment alignment) {
            this.f63565c = alignment;
            return this;
        }

        public b setTextSize(float f10, int i10) {
            this.f63573k = f10;
            this.f63572j = i10;
            return this;
        }

        public b setVerticalType(int i10) {
            this.f63578p = i10;
            return this;
        }

        public b setWindowColor(int i10) {
            this.f63577o = i10;
            this.f63576n = true;
            return this;
        }

        public b() {
            this.f63563a = null;
            this.f63564b = null;
            this.f63565c = null;
            this.f63566d = null;
            this.f63567e = -3.4028235E38f;
            this.f63568f = Integer.MIN_VALUE;
            this.f63569g = Integer.MIN_VALUE;
            this.f63570h = -3.4028235E38f;
            this.f63571i = Integer.MIN_VALUE;
            this.f63572j = Integer.MIN_VALUE;
            this.f63573k = -3.4028235E38f;
            this.f63574l = -3.4028235E38f;
            this.f63575m = -3.4028235E38f;
            this.f63576n = false;
            this.f63577o = -16777216;
            this.f63578p = Integer.MIN_VALUE;
        }

        public b(a aVar) {
            this.f63563a = aVar.f63546a;
            this.f63564b = aVar.f63549d;
            this.f63565c = aVar.f63547b;
            this.f63566d = aVar.f63548c;
            this.f63567e = aVar.f63550e;
            this.f63568f = aVar.f63551f;
            this.f63569g = aVar.f63552g;
            this.f63570h = aVar.f63553h;
            this.f63571i = aVar.f63554i;
            this.f63572j = aVar.f63559n;
            this.f63573k = aVar.f63560o;
            this.f63574l = aVar.f63555j;
            this.f63575m = aVar.f63556k;
            this.f63576n = aVar.f63557l;
            this.f63577o = aVar.f63558m;
            this.f63578p = aVar.f63561p;
            this.f63579q = aVar.f63562q;
        }
    }

    public static final a a(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            bVar.setText(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            bVar.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            bVar.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            bVar.setBitmap(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            bVar.setLine(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            bVar.setLineAnchor(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            bVar.setPosition(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            bVar.setPositionAnchor(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            bVar.setTextSize(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            bVar.setSize(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            bVar.setBitmapHeight(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            bVar.setWindowColor(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            bVar.clearWindowColor();
        }
        if (bundle.containsKey(a(15))) {
            bVar.setVerticalType(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            bVar.setShearDegrees(bundle.getFloat(a(16)));
        }
        return bVar.build();
    }

    public b buildUpon() {
        return new b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f63546a, aVar.f63546a) && this.f63547b == aVar.f63547b && this.f63548c == aVar.f63548c && ((bitmap = this.f63549d) != null ? !((bitmap2 = aVar.f63549d) == null || !bitmap.sameAs(bitmap2)) : aVar.f63549d == null) && this.f63550e == aVar.f63550e && this.f63551f == aVar.f63551f && this.f63552g == aVar.f63552g && this.f63553h == aVar.f63553h && this.f63554i == aVar.f63554i && this.f63555j == aVar.f63555j && this.f63556k == aVar.f63556k && this.f63557l == aVar.f63557l && this.f63558m == aVar.f63558m && this.f63559n == aVar.f63559n && this.f63560o == aVar.f63560o && this.f63561p == aVar.f63561p && this.f63562q == aVar.f63562q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return p.hashCode(this.f63546a, this.f63547b, this.f63548c, this.f63549d, Float.valueOf(this.f63550e), Integer.valueOf(this.f63551f), Integer.valueOf(this.f63552g), Float.valueOf(this.f63553h), Integer.valueOf(this.f63554i), Float.valueOf(this.f63555j), Float.valueOf(this.f63556k), Boolean.valueOf(this.f63557l), Integer.valueOf(this.f63558m), Integer.valueOf(this.f63559n), Float.valueOf(this.f63560o), Integer.valueOf(this.f63561p), Float.valueOf(this.f63562q));
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(a(0), this.f63546a);
        bundle.putSerializable(a(1), this.f63547b);
        bundle.putSerializable(a(2), this.f63548c);
        bundle.putParcelable(a(3), this.f63549d);
        bundle.putFloat(a(4), this.f63550e);
        bundle.putInt(a(5), this.f63551f);
        bundle.putInt(a(6), this.f63552g);
        bundle.putFloat(a(7), this.f63553h);
        bundle.putInt(a(8), this.f63554i);
        bundle.putInt(a(9), this.f63559n);
        bundle.putFloat(a(10), this.f63560o);
        bundle.putFloat(a(11), this.f63555j);
        bundle.putFloat(a(12), this.f63556k);
        bundle.putBoolean(a(14), this.f63557l);
        bundle.putInt(a(13), this.f63558m);
        bundle.putInt(a(15), this.f63561p);
        bundle.putFloat(a(16), this.f63562q);
        return bundle;
    }

    @Deprecated
    public a(CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    @Deprecated
    public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, -16777216);
    }

    @Deprecated
    public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, null, null, f10, i10, i11, f11, i12, i13, f13, f12, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    @Deprecated
    public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, null, null, f10, i10, i11, f11, i12, Integer.MIN_VALUE, -3.4028235E38f, f12, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            io.odeeo.internal.q0.a.checkNotNull(bitmap);
        } else {
            io.odeeo.internal.q0.a.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f63546a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f63546a = charSequence.toString();
        } else {
            this.f63546a = null;
        }
        this.f63547b = alignment;
        this.f63548c = alignment2;
        this.f63549d = bitmap;
        this.f63550e = f10;
        this.f63551f = i10;
        this.f63552g = i11;
        this.f63553h = f11;
        this.f63554i = i12;
        this.f63555j = f13;
        this.f63556k = f14;
        this.f63557l = z10;
        this.f63558m = i14;
        this.f63559n = i13;
        this.f63560o = f12;
        this.f63561p = i15;
        this.f63562q = f15;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
