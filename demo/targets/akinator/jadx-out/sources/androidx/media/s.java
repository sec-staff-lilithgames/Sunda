package androidx.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f6862e = mediaBrowserServiceCompat;
    }

    @Override // androidx.media.q, androidx.media.l
    public void onCreate() {
        MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(this, this.f6862e);
        this.f6856b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23;
        mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23.onCreate();
    }

    public void onLoadItem(String str, x xVar) {
        r rVar = new r(str, xVar);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6862e;
        mediaBrowserServiceCompat.f6776g = mediaBrowserServiceCompat.f6773c;
        mediaBrowserServiceCompat.onLoadItem(str, rVar);
        mediaBrowserServiceCompat.f6776g = null;
    }
}
