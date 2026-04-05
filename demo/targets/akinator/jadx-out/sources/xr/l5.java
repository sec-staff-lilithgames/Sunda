package xr;

import com.ironsource.C3191e4;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f92757a = new ArrayList();

    public l5 append(Object obj) {
        this.f92757a.add(String.valueOf(obj));
        return this;
    }

    public l5 appendKeyValue(String str, Object obj) {
        this.f92757a.add(str + C3191e4.i.f36525b + obj);
        return this;
    }

    public String toString() {
        return this.f92757a.toString();
    }
}
