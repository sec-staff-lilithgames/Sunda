package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public float f4004a;

    /* renamed from: b, reason: collision with root package name */
    public int f4005b;

    /* renamed from: c, reason: collision with root package name */
    public int f4006c;

    /* renamed from: d, reason: collision with root package name */
    public int f4007d;

    /* renamed from: e, reason: collision with root package name */
    public int f4008e;

    public void getState(y2.h hVar) {
        this.f4005b = hVar.getLeft();
        this.f4006c = hVar.getTop();
        this.f4007d = hVar.getRight();
        this.f4008e = hVar.getBottom();
        this.f4004a = (int) hVar.getRotationZ();
    }

    public int height() {
        return this.f4008e - this.f4006c;
    }

    public int width() {
        return this.f4007d - this.f4005b;
    }
}
