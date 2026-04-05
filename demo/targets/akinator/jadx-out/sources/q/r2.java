package q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public int f82220a;

    /* renamed from: b, reason: collision with root package name */
    public int f82221b;

    /* renamed from: c, reason: collision with root package name */
    public int f82222c;

    /* renamed from: d, reason: collision with root package name */
    public int f82223d;

    /* renamed from: e, reason: collision with root package name */
    public int f82224e;

    /* renamed from: f, reason: collision with root package name */
    public int f82225f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82226g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f82227h;

    public int getEnd() {
        return this.f82226g ? this.f82220a : this.f82221b;
    }

    public int getLeft() {
        return this.f82220a;
    }

    public int getRight() {
        return this.f82221b;
    }

    public int getStart() {
        return this.f82226g ? this.f82221b : this.f82220a;
    }

    public void setAbsolute(int i10, int i11) {
        this.f82227h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f82224e = i10;
            this.f82220a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f82225f = i11;
            this.f82221b = i11;
        }
    }

    public void setDirection(boolean z10) {
        if (z10 == this.f82226g) {
            return;
        }
        this.f82226g = z10;
        if (!this.f82227h) {
            this.f82220a = this.f82224e;
            this.f82221b = this.f82225f;
            return;
        }
        if (z10) {
            int i10 = this.f82223d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f82224e;
            }
            this.f82220a = i10;
            int i11 = this.f82222c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f82225f;
            }
            this.f82221b = i11;
            return;
        }
        int i12 = this.f82222c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f82224e;
        }
        this.f82220a = i12;
        int i13 = this.f82223d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f82225f;
        }
        this.f82221b = i13;
    }

    public void setRelative(int i10, int i11) {
        this.f82222c = i10;
        this.f82223d = i11;
        this.f82227h = true;
        if (this.f82226g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f82220a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f82221b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f82220a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f82221b = i11;
        }
    }
}
