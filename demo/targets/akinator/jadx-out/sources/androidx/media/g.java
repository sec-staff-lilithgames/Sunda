package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6820f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6820f = resultReceiver;
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        int i10 = this.f6877e & 2;
        ResultReceiver resultReceiver = this.f6820f;
        if (i10 != 0) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem);
        resultReceiver.send(0, bundle);
    }
}
