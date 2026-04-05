package x3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l {
    ClipData getClip();

    Bundle getExtras();

    int getFlags();

    Uri getLinkUri();

    int getSource();

    ContentInfo getWrapped();
}
