package c4;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f11800a;

    public i(Object obj) {
        this.f11800a = (InputContentInfo) obj;
    }

    @Override // c4.k
    public Uri getContentUri() {
        return this.f11800a.getContentUri();
    }

    @Override // c4.k
    public ClipDescription getDescription() {
        return this.f11800a.getDescription();
    }

    @Override // c4.k
    public Object getInputContentInfo() {
        return this.f11800a;
    }

    @Override // c4.k
    public Uri getLinkUri() {
        return this.f11800a.getLinkUri();
    }

    @Override // c4.k
    public void releasePermission() {
        this.f11800a.releasePermission();
    }

    @Override // c4.k
    public void requestPermission() {
        this.f11800a.requestPermission();
    }

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f11800a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
