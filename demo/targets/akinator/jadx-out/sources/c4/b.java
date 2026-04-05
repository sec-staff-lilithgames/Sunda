package c4;

import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static boolean a(EditorInfo editorInfo) {
        return editorInfo.isStylusHandwritingEnabled();
    }

    public static void b(EditorInfo editorInfo, boolean z10) {
        editorInfo.setStylusHandwritingEnabled(z10);
    }
}
