package x3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ClipData f91638a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91639b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91640c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f91641d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f91642e;

    public m(j jVar) {
        this.f91638a = (ClipData) w3.i.checkNotNull(jVar.f91596a);
        this.f91639b = w3.i.checkArgumentInRange(jVar.f91597b, 0, 5, "source");
        this.f91640c = w3.i.checkFlagsArgument(jVar.f91598c, 1);
        this.f91641d = jVar.f91599d;
        this.f91642e = jVar.f91600e;
    }

    @Override // x3.l
    public ClipData getClip() {
        return this.f91638a;
    }

    @Override // x3.l
    public Bundle getExtras() {
        return this.f91642e;
    }

    @Override // x3.l
    public int getFlags() {
        return this.f91640c;
    }

    @Override // x3.l
    public Uri getLinkUri() {
        return this.f91641d;
    }

    @Override // x3.l
    public int getSource() {
        return this.f91639b;
    }

    @Override // x3.l
    public ContentInfo getWrapped() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
        sb2.append(this.f91638a.getDescription());
        sb2.append(", source=");
        int i10 = this.f91639b;
        sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        sb2.append(", flags=");
        int i11 = this.f91640c;
        sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
        Uri uri = this.f91641d;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb2.append(str);
        return j1.o2.o(sb2, this.f91642e != null ? ", hasExtras" : "", "}");
    }
}
