package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import c6.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
    }

    @Override // c6.b
    public List<Class<? extends b>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // c6.b
    public a create(Context context) {
        Choreographer.getInstance().postFrameCallback(new kotlinx.coroutines.android.a(this, context.getApplicationContext()));
        return new a();
    }
}
