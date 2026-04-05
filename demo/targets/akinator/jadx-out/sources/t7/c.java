package t7;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f86426a = new ArrayList();

    public void apply(Path path) {
        ArrayList arrayList = this.f86426a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e8.n.applyTrimPathIfNeeded(path, (v) arrayList.get(size));
        }
    }
}
