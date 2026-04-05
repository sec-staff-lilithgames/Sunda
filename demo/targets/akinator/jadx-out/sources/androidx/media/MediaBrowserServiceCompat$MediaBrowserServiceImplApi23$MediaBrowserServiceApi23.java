package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f6780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(s sVar, Context context) {
        super(sVar, context);
        this.f6780c = sVar;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        this.f6780c.onLoadItem(str, new x(result));
    }
}
