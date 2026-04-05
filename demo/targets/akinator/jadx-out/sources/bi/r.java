package bi;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public final List f9591b;

    public r(List<c> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f9591b = list;
    }

    public List<c> getComponentsInCycle() {
        return this.f9591b;
    }
}
