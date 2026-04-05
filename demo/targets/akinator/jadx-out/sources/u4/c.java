package u4;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import s4.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {
    public boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return s.handleDeleteSurroundingText(inputConnection, editable, i10, i11, z10);
    }

    public void updateEditorInfoAttrs(EditorInfo editorInfo) {
        if (s.isConfigured()) {
            s.get().updateEditorInfo(editorInfo);
        }
    }
}
