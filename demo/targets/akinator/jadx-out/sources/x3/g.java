package x3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f91582a;

    public g(n nVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f91582a = new h(nVar);
            return;
        }
        j jVar = new j();
        jVar.f91596a = nVar.getClip();
        jVar.f91597b = nVar.getSource();
        jVar.f91598c = nVar.getFlags();
        jVar.f91599d = nVar.getLinkUri();
        jVar.f91600e = nVar.getExtras();
        this.f91582a = jVar;
    }

    public n build() {
        return this.f91582a.build();
    }

    public g setClip(ClipData clipData) {
        this.f91582a.setClip(clipData);
        return this;
    }

    public g setExtras(Bundle bundle) {
        this.f91582a.setExtras(bundle);
        return this;
    }

    public g setFlags(int i10) {
        this.f91582a.setFlags(i10);
        return this;
    }

    public g setLinkUri(Uri uri) {
        this.f91582a.setLinkUri(uri);
        return this;
    }

    public g setSource(int i10) {
        this.f91582a.setSource(i10);
        return this;
    }

    public g(ClipData clipData, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f91582a = new h(clipData, i10);
            return;
        }
        j jVar = new j();
        jVar.f91596a = clipData;
        jVar.f91597b = i10;
        this.f91582a = jVar;
    }
}
