package x3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f91586a;

    public h(ClipData clipData, int i10) {
        this.f91586a = o3.g.b(clipData, i10);
    }

    @Override // x3.i
    public n build() {
        return new n(new k(this.f91586a.build()));
    }

    @Override // x3.i
    public void setClip(ClipData clipData) {
        this.f91586a.setClip(clipData);
    }

    @Override // x3.i
    public void setExtras(Bundle bundle) {
        this.f91586a.setExtras(bundle);
    }

    @Override // x3.i
    public void setFlags(int i10) {
        this.f91586a.setFlags(i10);
    }

    @Override // x3.i
    public void setLinkUri(Uri uri) {
        this.f91586a.setLinkUri(uri);
    }

    @Override // x3.i
    public void setSource(int i10) {
        this.f91586a.setSource(i10);
    }

    public h(n nVar) {
        o3.g.d();
        this.f91586a = o3.g.c(nVar.toContentInfo());
    }
}
