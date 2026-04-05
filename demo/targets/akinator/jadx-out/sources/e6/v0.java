package e6;

import android.view.View;
import j1.o2;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: b, reason: collision with root package name */
    public final View f53875b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f53874a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f53876c = new ArrayList();

    @Deprecated
    public v0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f53875b == v0Var.f53875b && this.f53874a.equals(v0Var.f53874a);
    }

    public int hashCode() {
        return this.f53874a.hashCode() + (this.f53875b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbT = a.b.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbT.append(this.f53875b);
        sbT.append("\n");
        String strL = o2.l(sbT.toString(), "    values:");
        HashMap map = this.f53874a;
        for (String str : map.keySet()) {
            strL = strL + "    " + str + ": " + map.get(str) + "\n";
        }
        return strL;
    }

    public v0(View view) {
        this.f53875b = view;
    }
}
