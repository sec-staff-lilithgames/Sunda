package x3;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f91667a;

    public s(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? e4.q.b(rect, list) : null);
    }

    public static DisplayCutout a(o3.c cVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, o3.c cVar2, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return androidx.browser.customtabs.a.a(cVar.toPlatformInsets(), rect, rect2, rect3, rect4, cVar2.toPlatformInsets(), path);
        }
        if (i10 >= 30) {
            return c4.a.c(cVar.toPlatformInsets(), rect, rect2, rect3, rect4, cVar2.toPlatformInsets());
        }
        if (i10 >= 29) {
            return com.google.firebase.messaging.b0.e(cVar.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i10 < 28) {
            return null;
        }
        Rect rect5 = new Rect(cVar.f77432a, cVar.f77433b, cVar.f77434c, cVar.f77435d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return e4.q.b(rect5, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return w3.d.equals(this.f91667a, ((s) obj).f91667a);
    }

    public List<Rect> getBoundingRects() {
        return Build.VERSION.SDK_INT >= 28 ? e4.q.d(this.f91667a) : Collections.EMPTY_LIST;
    }

    public Path getCutoutPath() {
        if (Build.VERSION.SDK_INT >= 31) {
            return k3.a.a(this.f91667a);
        }
        return null;
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.m(this.f91667a);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.n(this.f91667a);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.o(this.f91667a);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.p(this.f91667a);
        }
        return 0;
    }

    public o3.c getWaterfallInsets() {
        return Build.VERSION.SDK_INT >= 30 ? o3.c.toCompatInsets(c4.a.o(this.f91667a)) : o3.c.f77431e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f91667a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public s(o3.c cVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, o3.c cVar2) {
        this(a(cVar, rect, rect2, rect3, rect4, cVar2, null));
    }

    public String toString() {
        return duhsDlGWdBkekB.tIkzJzFNn + this.f91667a + "}";
    }

    public s(o3.c cVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, o3.c cVar2, Path path) {
        this(a(cVar, rect, rect2, rect3, rect4, cVar2, path));
    }

    public s(DisplayCutout displayCutout) {
        this.f91667a = displayCutout;
    }
}
