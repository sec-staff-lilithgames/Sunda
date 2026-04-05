package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC3255he;
import com.ironsource.Q9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes7.dex */
public class SSAFactory {
    public static InterfaceC3255he getPublisherInstance(Activity activity) throws Exception {
        return Q9.b((Context) activity);
    }

    public static InterfaceC3255he getPublisherTestInstance(Activity activity, int i10) throws Exception {
        return Q9.a(activity, i10);
    }
}
