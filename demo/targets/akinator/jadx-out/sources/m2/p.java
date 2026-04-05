package m2;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface p {
    void hideSoftInputFromWindow(IBinder iBinder);

    void restartInput(View view);

    void showSoftInput(View view);

    void updateExtractedText(View view, int i10, ExtractedText extractedText);

    void updateSelection(View view, int i10, int i11, int i12, int i13);
}
