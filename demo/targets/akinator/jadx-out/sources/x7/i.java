package x7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f91786a;

    /* renamed from: b, reason: collision with root package name */
    public final float f91787b;

    /* renamed from: c, reason: collision with root package name */
    public final float f91788c;

    public i(String str, float f10, float f11) {
        this.f91786a = str;
        this.f91788c = f11;
        this.f91787b = f10;
    }

    public float getDurationFrames() {
        return this.f91788c;
    }

    public String getName() {
        return this.f91786a;
    }

    public float getStartFrame() {
        return this.f91787b;
    }

    public boolean matchesName(String str) {
        String str2 = this.f91786a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str);
    }
}
