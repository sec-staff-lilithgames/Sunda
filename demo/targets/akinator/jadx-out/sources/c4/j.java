package c4;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11801a;

    /* renamed from: b, reason: collision with root package name */
    public final ClipDescription f11802b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f11803c;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f11801a = uri;
        this.f11802b = clipDescription;
        this.f11803c = uri2;
    }

    @Override // c4.k
    public Uri getContentUri() {
        return this.f11801a;
    }

    @Override // c4.k
    public ClipDescription getDescription() {
        return this.f11802b;
    }

    @Override // c4.k
    public Object getInputContentInfo() {
        return null;
    }

    @Override // c4.k
    public Uri getLinkUri() {
        return this.f11803c;
    }

    @Override // c4.k
    public void releasePermission() {
    }

    @Override // c4.k
    public void requestPermission() {
    }
}
