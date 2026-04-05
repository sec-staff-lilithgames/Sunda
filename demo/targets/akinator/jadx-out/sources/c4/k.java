package c4;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k {
    Uri getContentUri();

    ClipDescription getDescription();

    Object getInputContentInfo();

    Uri getLinkUri();

    void releasePermission();

    void requestPermission();
}
