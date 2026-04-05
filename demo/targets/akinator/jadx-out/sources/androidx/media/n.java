package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f6844f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, x xVar) {
        super(str);
        this.f6844f = xVar;
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (MediaBrowserCompat.MediaItem mediaItem : list) {
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                arrayList.add(parcelObtain);
            }
        } else {
            arrayList = null;
        }
        this.f6844f.sendResult(arrayList);
    }

    @Override // androidx.media.w
    public void detach() {
        this.f6844f.detach();
    }
}
