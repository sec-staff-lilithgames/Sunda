package u3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f87815a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87816b;

    @Deprecated
    public n(int i10, o[] oVarArr) {
        this.f87815a = i10;
        this.f87816b = Collections.singletonList(oVarArr);
    }

    public o[] getFonts() {
        return (o[]) this.f87816b.get(0);
    }

    public List<o[]> getFontsWithFallbacks() {
        return this.f87816b;
    }

    public int getStatusCode() {
        return this.f87815a;
    }

    public n(ArrayList arrayList) {
        this.f87815a = 0;
        this.f87816b = arrayList;
    }
}
