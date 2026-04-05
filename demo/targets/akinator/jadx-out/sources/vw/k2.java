package vw;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f89946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89947b;

    public k2(i2 i2Var) {
        this((List<i2>) Arrays.asList(i2Var));
    }

    public List<i2> getList() {
        return this.f89946a;
    }

    public i2 getPrimary() {
        if (this.f89947b > 0) {
            return (i2) this.f89946a.get(0);
        }
        return null;
    }

    public k2(List<i2> list) {
        this.f89947b = list.size();
        this.f89946a = list;
    }
}
