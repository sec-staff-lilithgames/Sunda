package wr;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public List f91196a;

    /* renamed from: b, reason: collision with root package name */
    public c f91197b;

    /* renamed from: c, reason: collision with root package name */
    public Object[][] f91198c;

    public <T> y2 addOption(z2 z2Var, T t10) {
        mh.p1.checkNotNull(z2Var, C3191e4.h.W);
        mh.p1.checkNotNull(t10, "value");
        int length = 0;
        while (true) {
            Object[][] objArr = this.f91198c;
            if (length >= objArr.length) {
                length = -1;
                break;
            }
            if (z2Var.equals(objArr[length][0])) {
                break;
            }
            length++;
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f91198c.length + 1, 2);
            Object[][] objArr3 = this.f91198c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f91198c = objArr2;
            length = objArr2.length - 1;
        }
        this.f91198c[length] = new Object[]{z2Var, t10};
        return this;
    }

    public a3 build() {
        return new a3(this.f91196a, this.f91197b, this.f91198c);
    }

    public y2 setAddresses(f1 f1Var) {
        this.f91196a = Collections.singletonList(f1Var);
        return this;
    }

    public y2 setAttributes(c cVar) {
        this.f91197b = (c) mh.p1.checkNotNull(cVar, "attrs");
        return this;
    }

    public y2 setAddresses(List<f1> list) {
        mh.p1.checkArgument(!list.isEmpty(), "addrs is empty");
        this.f91196a = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }
}
