package aa;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4235a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4237c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4238d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4239e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4240f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4241g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4242h;

    /* renamed from: i, reason: collision with root package name */
    public int f4243i;

    public e(int i10, String str, String str2, String str3, float f10, boolean z10, int i11, String str4, int i12) {
        this.f4235a = i10;
        this.f4236b = str;
        this.f4237c = str2;
        this.f4238d = str3;
        this.f4239e = f10;
        this.f4240f = z10;
        this.f4241g = i11;
        this.f4242h = str4;
        this.f4243i = i12;
    }

    public int getBaseId() {
        return this.f4235a;
    }

    public String getDescription() {
        return this.f4237c;
    }

    public int getGz() {
        return this.f4241g;
    }

    public String getIndice() {
        return this.f4242h;
    }

    public String getName() {
        return this.f4236b;
    }

    public String getPhotoBase64() {
        return this.f4238d;
    }

    public float getPourcentage() {
        return this.f4239e;
    }

    public boolean isFound() {
        return this.f4240f;
    }

    public boolean isIndiceUnlocked() {
        return this.f4243i == 1;
    }

    public void setIsFound(boolean z10) {
        this.f4240f = z10;
    }
}
