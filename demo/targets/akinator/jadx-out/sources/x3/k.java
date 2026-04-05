package x3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo f91615a;

    public k(ContentInfo contentInfo) {
        this.f91615a = sn.t.d(w3.i.checkNotNull(contentInfo));
    }

    @Override // x3.l
    public ClipData getClip() {
        return this.f91615a.getClip();
    }

    @Override // x3.l
    public Bundle getExtras() {
        return this.f91615a.getExtras();
    }

    @Override // x3.l
    public int getFlags() {
        return this.f91615a.getFlags();
    }

    @Override // x3.l
    public Uri getLinkUri() {
        return this.f91615a.getLinkUri();
    }

    @Override // x3.l
    public int getSource() {
        return this.f91615a.getSource();
    }

    @Override // x3.l
    public ContentInfo getWrapped() {
        return this.f91615a;
    }

    public String toString() {
        return "ContentInfoCompat{" + this.f91615a + "}";
    }
}
