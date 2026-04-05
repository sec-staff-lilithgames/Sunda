package x3;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final l f91648a;

    public n(l lVar) {
        this.f91648a = lVar;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            clipData.addItem((ClipData.Item) arrayList.get(i10));
        }
        return clipData;
    }

    public static Pair b(ClipData clipData, w3.k kVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            ClipData.Item itemAt = clipData.getItemAt(i10);
            if (kVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    public static n toContentInfoCompat(ContentInfo contentInfo) {
        return new n(new k(contentInfo));
    }

    public ClipData getClip() {
        return this.f91648a.getClip();
    }

    public Bundle getExtras() {
        return this.f91648a.getExtras();
    }

    public int getFlags() {
        return this.f91648a.getFlags();
    }

    public Uri getLinkUri() {
        return this.f91648a.getLinkUri();
    }

    public int getSource() {
        return this.f91648a.getSource();
    }

    public Pair<n, n> partition(w3.k kVar) {
        ClipData clip = this.f91648a.getClip();
        if (clip.getItemCount() == 1) {
            boolean zTest = kVar.test(clip.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair pairB = b(clip, kVar);
        return pairB.first == null ? Pair.create(null, this) : pairB.second == null ? Pair.create(this, null) : Pair.create(new g(this).setClip((ClipData) pairB.first).build(), new g(this).setClip((ClipData) pairB.second).build());
    }

    public ContentInfo toContentInfo() {
        ContentInfo wrapped = this.f91648a.getWrapped();
        Objects.requireNonNull(wrapped);
        sn.t.d(wrapped);
        return wrapped;
    }

    public String toString() {
        return this.f91648a.toString();
    }

    public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, Predicate<ClipData.Item> predicate) {
        return f.partition(contentInfo, predicate);
    }
}
