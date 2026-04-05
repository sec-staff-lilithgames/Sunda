package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f6860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, x xVar) {
        super(str);
        this.f6860f = xVar;
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        x xVar = this.f6860f;
        if (mediaItem == null) {
            xVar.sendResult(null);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        mediaItem.writeToParcel(parcelObtain, 0);
        xVar.sendResult(parcelObtain);
    }

    @Override // androidx.media.w
    public void detach() {
        this.f6860f.detach();
    }
}
