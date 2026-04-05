package hg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public float f58776a;

    /* renamed from: b, reason: collision with root package name */
    public float f58777b;

    /* renamed from: c, reason: collision with root package name */
    public float f58778c;

    public i(float f10, float f11, float f12) {
        this.f58776a = f10;
        this.f58777b = f11;
        this.f58778c = f12;
    }

    public boolean isInvalid() {
        return this.f58778c == Float.MAX_VALUE;
    }

    public void set(float f10, float f11, float f12) {
        this.f58776a = f10;
        this.f58777b = f11;
        this.f58778c = f12;
    }

    public void set(i iVar) {
        set(iVar.f58776a, iVar.f58777b, iVar.f58778c);
    }

    public i(i iVar) {
        this(iVar.f58776a, iVar.f58777b, iVar.f58778c);
    }
}
