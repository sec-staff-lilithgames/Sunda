package c4;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {
    @Deprecated
    public h() {
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, l lVar, int i10, Bundle bundle) {
        Bundle bundle2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25) {
            return inputConnection.commitContent((InputContentInfo) lVar.unwrap(), i10, bundle);
        }
        boolean z10 = false;
        if (i11 < 25 && (bundle2 = editorInfo.extras) != null) {
            boolean zContainsKey = bundle2.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            boolean zContainsKey2 = editorInfo.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            if ((!zContainsKey || !zContainsKey2) && !zContainsKey) {
                if (zContainsKey2) {
                    z10 = true;
                }
            }
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", lVar.getContentUri());
            bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", lVar.getDescription());
            bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", lVar.getLinkUri());
            bundle3.putInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i10);
            bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", bundle);
            return inputConnection.performPrivateCommand(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT" : "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle3);
        }
        return false;
    }

    @Deprecated
    public static InputConnection createWrapper(InputConnection inputConnection, EditorInfo editorInfo, g gVar) {
        w3.d.requireNonNull(inputConnection, "inputConnection must be non-null");
        w3.d.requireNonNull(editorInfo, "editorInfo must be non-null");
        w3.d.requireNonNull(gVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new e(inputConnection, gVar) : c.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new f(inputConnection, gVar);
    }

    public static InputConnection createWrapper(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        w3.i.checkNotNull(view);
        return createWrapper(inputConnection, editorInfo, new d(view, 0));
    }
}
