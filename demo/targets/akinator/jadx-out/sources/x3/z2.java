package x3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import x3.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final s2.b f91721a;

    /* renamed from: b, reason: collision with root package name */
    public List f91722b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f91723c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f91724d;

    public z2(s2.b bVar) {
        super(bVar.getDispatchMode());
        this.f91724d = new HashMap();
        this.f91721a = bVar;
    }

    public final s2 a(WindowInsetsAnimation windowInsetsAnimation) {
        s2 s2Var = (s2) this.f91724d.get(windowInsetsAnimation);
        if (s2Var == null) {
            s2Var = new s2(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                s2Var.f91668a = new a3(windowInsetsAnimation);
            }
            this.f91724d.put(windowInsetsAnimation, s2Var);
        }
        return s2Var;
    }

    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f91721a.onEnd(a(windowInsetsAnimation));
        this.f91724d.remove(windowInsetsAnimation);
    }

    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f91721a.onPrepare(a(windowInsetsAnimation));
    }

    public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
        ArrayList arrayList = this.f91723c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f91723c = arrayList2;
            this.f91722b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = list.get(size);
            s2 s2VarA = a(windowInsetsAnimation);
            s2VarA.setFraction(windowInsetsAnimation.getFraction());
            this.f91723c.add(s2VarA);
        }
        return this.f91721a.onProgress(e3.toWindowInsetsCompat(windowInsets), this.f91722b).toWindowInsets();
    }

    public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        return this.f91721a.onStart(a(windowInsetsAnimation), s2.a.toBoundsCompat(bounds)).toBounds();
    }
}
