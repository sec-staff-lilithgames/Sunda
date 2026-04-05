package f;

import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends r {
    @Override // f.q, f.t, f.u
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        kotlin.jvm.internal.e0.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
