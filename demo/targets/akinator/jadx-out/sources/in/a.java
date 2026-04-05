package in;

import android.graphics.Bitmap;
import android.text.Layout;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f59752a = null;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f59753b = null;

    /* renamed from: c, reason: collision with root package name */
    public Layout.Alignment f59754c = null;

    /* renamed from: d, reason: collision with root package name */
    public Layout.Alignment f59755d = null;

    /* renamed from: e, reason: collision with root package name */
    public float f59756e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f59757f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f59758g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f59759h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public int f59760i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f59761j = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public float f59762k = -3.4028235E38f;

    /* renamed from: l, reason: collision with root package name */
    public float f59763l = -3.4028235E38f;

    /* renamed from: m, reason: collision with root package name */
    public float f59764m = -3.4028235E38f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59765n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f59766o = -16777216;

    /* renamed from: p, reason: collision with root package name */
    public int f59767p = Integer.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public float f59768q;

    public b build() {
        return new b(this.f59752a, this.f59754c, this.f59755d, this.f59753b, this.f59756e, this.f59757f, this.f59758g, this.f59759h, this.f59760i, this.f59761j, this.f59762k, this.f59763l, this.f59764m, this.f59765n, this.f59766o, this.f59767p, this.f59768q);
    }

    public a clearWindowColor() {
        this.f59765n = false;
        return this;
    }

    @Pure
    public Bitmap getBitmap() {
        return this.f59753b;
    }

    @Pure
    public float getBitmapHeight() {
        return this.f59764m;
    }

    @Pure
    public float getLine() {
        return this.f59756e;
    }

    @Pure
    public int getLineAnchor() {
        return this.f59758g;
    }

    @Pure
    public int getLineType() {
        return this.f59757f;
    }

    @Pure
    public float getPosition() {
        return this.f59759h;
    }

    @Pure
    public int getPositionAnchor() {
        return this.f59760i;
    }

    @Pure
    public float getSize() {
        return this.f59763l;
    }

    @Pure
    public CharSequence getText() {
        return this.f59752a;
    }

    @Pure
    public Layout.Alignment getTextAlignment() {
        return this.f59754c;
    }

    @Pure
    public float getTextSize() {
        return this.f59762k;
    }

    @Pure
    public int getTextSizeType() {
        return this.f59761j;
    }

    @Pure
    public int getVerticalType() {
        return this.f59767p;
    }

    @Pure
    public int getWindowColor() {
        return this.f59766o;
    }

    public boolean isWindowColorSet() {
        return this.f59765n;
    }

    public a setBitmap(Bitmap bitmap) {
        this.f59753b = bitmap;
        return this;
    }

    public a setBitmapHeight(float f10) {
        this.f59764m = f10;
        return this;
    }

    public a setLine(float f10, int i10) {
        this.f59756e = f10;
        this.f59757f = i10;
        return this;
    }

    public a setLineAnchor(int i10) {
        this.f59758g = i10;
        return this;
    }

    public a setMultiRowAlignment(Layout.Alignment alignment) {
        this.f59755d = alignment;
        return this;
    }

    public a setPosition(float f10) {
        this.f59759h = f10;
        return this;
    }

    public a setPositionAnchor(int i10) {
        this.f59760i = i10;
        return this;
    }

    public a setShearDegrees(float f10) {
        this.f59768q = f10;
        return this;
    }

    public a setSize(float f10) {
        this.f59763l = f10;
        return this;
    }

    public a setText(CharSequence charSequence) {
        this.f59752a = charSequence;
        return this;
    }

    public a setTextAlignment(Layout.Alignment alignment) {
        this.f59754c = alignment;
        return this;
    }

    public a setTextSize(float f10, int i10) {
        this.f59762k = f10;
        this.f59761j = i10;
        return this;
    }

    public a setVerticalType(int i10) {
        this.f59767p = i10;
        return this;
    }

    public a setWindowColor(int i10) {
        this.f59766o = i10;
        this.f59765n = true;
        return this;
    }
}
