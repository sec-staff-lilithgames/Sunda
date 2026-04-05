package g4;

import a2.d5;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f57287a = new ArrayList();

    public final void addListener(b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f57287a.add(listener);
    }

    public final void onRelease() {
        ArrayList arrayList = this.f57287a;
        for (int lastIndex = p0.getLastIndex(arrayList); -1 < lastIndex; lastIndex--) {
            ((d5) ((b) arrayList.get(lastIndex))).onRelease();
        }
    }

    public final void removeListener(b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.f57287a.remove(listener);
    }
}
