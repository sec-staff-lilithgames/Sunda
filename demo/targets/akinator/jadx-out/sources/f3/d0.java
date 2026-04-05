package f3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public float f55326a;

    /* renamed from: b, reason: collision with root package name */
    public int f55327b;

    /* renamed from: c, reason: collision with root package name */
    public int f55328c;

    /* renamed from: d, reason: collision with root package name */
    public int f55329d;

    /* renamed from: e, reason: collision with root package name */
    public int f55330e;

    public void getState(View view) {
        this.f55327b = view.getLeft();
        this.f55328c = view.getTop();
        this.f55329d = view.getRight();
        this.f55330e = view.getBottom();
        this.f55326a = view.getRotation();
    }

    public int height() {
        return this.f55330e - this.f55328c;
    }

    public int width() {
        return this.f55329d - this.f55327b;
    }
}
