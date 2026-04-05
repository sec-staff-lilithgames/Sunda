package ef;

import android.graphics.Bitmap;
import android.text.Layout;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f54267a = null;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f54268b = null;

    /* renamed from: c, reason: collision with root package name */
    public Layout.Alignment f54269c = null;

    /* renamed from: d, reason: collision with root package name */
    public Layout.Alignment f54270d = null;

    /* renamed from: e, reason: collision with root package name */
    public float f54271e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f54272f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f54273g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f54274h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public int f54275i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f54276j = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public float f54277k = -3.4028235E38f;

    /* renamed from: l, reason: collision with root package name */
    public float f54278l = -3.4028235E38f;

    /* renamed from: m, reason: collision with root package name */
    public float f54279m = -3.4028235E38f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f54280n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f54281o = -16777216;

    /* renamed from: p, reason: collision with root package name */
    public int f54282p = Integer.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public float f54283q;

    public b build() {
        return new b(this.f54267a, this.f54269c, this.f54270d, this.f54268b, this.f54271e, this.f54272f, this.f54273g, this.f54274h, this.f54275i, this.f54276j, this.f54277k, this.f54278l, this.f54279m, this.f54280n, this.f54281o, this.f54282p, this.f54283q);
    }

    public a clearWindowColor() {
        this.f54280n = false;
        return this;
    }

    @Pure
    public Bitmap getBitmap() {
        return this.f54268b;
    }

    @Pure
    public float getBitmapHeight() {
        return this.f54279m;
    }

    @Pure
    public float getLine() {
        return this.f54271e;
    }

    @Pure
    public int getLineAnchor() {
        return this.f54273g;
    }

    @Pure
    public int getLineType() {
        return this.f54272f;
    }

    @Pure
    public float getPosition() {
        return this.f54274h;
    }

    @Pure
    public int getPositionAnchor() {
        return this.f54275i;
    }

    @Pure
    public float getSize() {
        return this.f54278l;
    }

    @Pure
    public CharSequence getText() {
        return this.f54267a;
    }

    @Pure
    public Layout.Alignment getTextAlignment() {
        return this.f54269c;
    }

    @Pure
    public float getTextSize() {
        return this.f54277k;
    }

    @Pure
    public int getTextSizeType() {
        return this.f54276j;
    }

    @Pure
    public int getVerticalType() {
        return this.f54282p;
    }

    @Pure
    public int getWindowColor() {
        return this.f54281o;
    }

    public boolean isWindowColorSet() {
        return this.f54280n;
    }

    public a setBitmap(Bitmap bitmap) {
        this.f54268b = bitmap;
        return this;
    }

    public a setBitmapHeight(float f10) {
        this.f54279m = f10;
        return this;
    }

    public a setLine(float f10, int i10) {
        this.f54271e = f10;
        this.f54272f = i10;
        return this;
    }

    public a setLineAnchor(int i10) {
        this.f54273g = i10;
        return this;
    }

    public a setMultiRowAlignment(Layout.Alignment alignment) {
        this.f54270d = alignment;
        return this;
    }

    public a setPosition(float f10) {
        this.f54274h = f10;
        return this;
    }

    public a setPositionAnchor(int i10) {
        this.f54275i = i10;
        return this;
    }

    public a setShearDegrees(float f10) {
        this.f54283q = f10;
        return this;
    }

    public a setSize(float f10) {
        this.f54278l = f10;
        return this;
    }

    public a setText(CharSequence charSequence) {
        this.f54267a = charSequence;
        return this;
    }

    public a setTextAlignment(Layout.Alignment alignment) {
        this.f54269c = alignment;
        return this;
    }

    public a setTextSize(float f10, int i10) {
        this.f54277k = f10;
        this.f54276j = i10;
        return this;
    }

    public a setVerticalType(int i10) {
        this.f54282p = i10;
        return this;
    }

    public a setWindowColor(int i10) {
        this.f54281o = i10;
        this.f54280n = true;
        return this;
    }
}
