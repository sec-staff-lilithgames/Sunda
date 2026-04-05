package wr;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f90805a;

    /* renamed from: b, reason: collision with root package name */
    public final c f90806b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[][] f90807c;

    public a3(List list, c cVar, Object[][] objArr) {
        this.f90805a = (List) mh.p1.checkNotNull(list, "addresses are not set");
        this.f90806b = (c) mh.p1.checkNotNull(cVar, "attrs");
        this.f90807c = (Object[][]) mh.p1.checkNotNull(objArr, "customOptions");
    }

    public static y2 newBuilder() {
        y2 y2Var = new y2();
        y2Var.f91197b = c.f90841b;
        y2Var.f91198c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return y2Var;
    }

    public List<f1> getAddresses() {
        return this.f90805a;
    }

    public c getAttributes() {
        return this.f90806b;
    }

    public <T> T getOption(z2 z2Var) {
        mh.p1.checkNotNull(z2Var, C3191e4.h.W);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f90807c;
            if (i10 >= objArr.length) {
                return (T) z2Var.f91221b;
            }
            if (z2Var.equals(objArr[i10][0])) {
                return (T) objArr[i10][1];
            }
            i10++;
        }
    }

    public y2 toBuilder() {
        y2 attributes = newBuilder().setAddresses(this.f90805a).setAttributes(this.f90806b);
        attributes.getClass();
        Object[][] objArr = this.f90807c;
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
        attributes.f91198c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return attributes;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("addrs", this.f90805a).add("attrs", this.f90806b).add("customOptions", Arrays.deepToString(this.f90807c)).toString();
    }
}
