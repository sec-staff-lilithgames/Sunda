package pr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum e {
    Female("F", 1),
    Male("M", 2),
    Omitted("O", 0);


    /* renamed from: b, reason: collision with root package name */
    public final String f81813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81814c;

    e(String str, int i10) {
        this.f81813b = str;
        this.f81814c = i10;
    }

    public static e fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return Omitted;
        }
        if (iIntValue == 1) {
            return Female;
        }
        if (iIntValue != 2) {
            return null;
        }
        return Male;
    }

    public String getOrtbValue() {
        return this.f81813b;
    }

    public int getServerValue() {
        return this.f81814c;
    }
}
