package ic;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f59511b;

    public l(int i10) {
        this.f59511b = i10;
    }

    public static <F extends k> l fromBitmask(int i10) {
        return new l(i10);
    }

    public static <F extends k> l fromDefaults(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f10 : fArr) {
            if (f10.enabledByDefault()) {
                mask |= f10.getMask();
            }
        }
        return new l(mask);
    }

    public int asBitmask() {
        return this.f59511b;
    }

    public boolean isEnabled(k kVar) {
        return (kVar.getMask() & this.f59511b) != 0;
    }

    public l with(k kVar) {
        int mask = kVar.getMask();
        int i10 = this.f59511b;
        int i11 = mask | i10;
        return i11 == i10 ? this : new l(i11);
    }

    public l without(k kVar) {
        int i10 = ~kVar.getMask();
        int i11 = this.f59511b;
        int i12 = i10 & i11;
        return i12 == i11 ? this : new l(i12);
    }
}
