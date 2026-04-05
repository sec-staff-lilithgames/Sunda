package em;

import android.app.Activity;
import com.ironsource.lh;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c0 extends u {
    public c0(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar) {
        super(j0Var, l0Var, adsFormat, adUnit, wVar);
    }

    public abstract void d(Activity activity, d0 d0Var);

    public final void show(Activity activity, d0 d0Var) {
        nm.j.onUiThread(new lh(this, 22, activity, d0Var));
    }
}
