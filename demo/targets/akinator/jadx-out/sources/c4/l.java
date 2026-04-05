package c4;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f11804a;

    public l(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f11804a = new i(uri, clipDescription, uri2);
        } else {
            this.f11804a = new j(uri, clipDescription, uri2);
        }
    }

    public static l wrap(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new l(new i(obj));
        }
        return null;
    }

    public Uri getContentUri() {
        return this.f11804a.getContentUri();
    }

    public ClipDescription getDescription() {
        return this.f11804a.getDescription();
    }

    public Uri getLinkUri() {
        return this.f11804a.getLinkUri();
    }

    public void releasePermission() {
        this.f11804a.releasePermission();
    }

    public void requestPermission() {
        this.f11804a.requestPermission();
    }

    public Object unwrap() {
        return this.f11804a.getInputContentInfo();
    }

    public l(i iVar) {
        this.f11804a = iVar;
    }
}
