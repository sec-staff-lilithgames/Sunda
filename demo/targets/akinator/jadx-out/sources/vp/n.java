package vp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface n {
    View getProviderView(Context context);

    boolean isViewRegistered();

    void registerView(ViewGroup viewGroup, View view, yp.n nVar, Set<View> set);

    void unregisterView();
}
