package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6826f = resultReceiver;
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        List list = (List) obj;
        int i10 = this.f6877e & 4;
        ResultReceiver resultReceiver = this.f6826f;
        if (i10 != 0 || list == null) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
        resultReceiver.send(0, bundle);
    }
}
