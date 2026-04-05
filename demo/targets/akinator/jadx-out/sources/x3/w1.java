package x3;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f91699a;

    public w1(r0 r0Var) {
        this.f91699a = r0Var;
    }

    public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        n contentInfoCompat = n.toContentInfoCompat(contentInfo);
        n nVarOnReceiveContent = this.f91699a.onReceiveContent(view, contentInfoCompat);
        if (nVarOnReceiveContent == null) {
            return null;
        }
        return nVarOnReceiveContent == contentInfoCompat ? contentInfo : nVarOnReceiveContent.toContentInfo();
    }
}
