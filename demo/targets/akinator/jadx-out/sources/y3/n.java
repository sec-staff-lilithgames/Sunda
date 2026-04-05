package y3;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f94063a;

    public n() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f94063a = new m(this);
        } else {
            this.f94063a = new l(this);
        }
    }

    public c createAccessibilityNodeInfo(int i10) {
        return null;
    }

    public List<c> findAccessibilityNodeInfosByText(String str, int i10) {
        return null;
    }

    public c findFocus(int i10) {
        return null;
    }

    public Object getProvider() {
        return this.f94063a;
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        return false;
    }

    public n(Object obj) {
        this.f94063a = obj;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i10, c cVar, String str, Bundle bundle) {
    }
}
