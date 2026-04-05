package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f6863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f6864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, String str, x xVar, Bundle bundle) {
        super(str);
        this.f6863f = xVar;
        this.f6864g = bundle;
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        List<MediaBrowserCompat.MediaItem> listA = (List) obj;
        x xVar = this.f6863f;
        if (listA == null) {
            xVar.sendResult(null);
            return;
        }
        if ((this.f6877e & 1) != 0) {
            listA = MediaBrowserServiceCompat.a(listA, this.f6864g);
        }
        ArrayList arrayList = new ArrayList(listA.size());
        for (MediaBrowserCompat.MediaItem mediaItem : listA) {
            Parcel parcelObtain = Parcel.obtain();
            mediaItem.writeToParcel(parcelObtain, 0);
            arrayList.add(parcelObtain);
        }
        xVar.sendResult(arrayList);
    }

    @Override // androidx.media.w
    public void detach() {
        this.f6863f.detach();
    }
}
