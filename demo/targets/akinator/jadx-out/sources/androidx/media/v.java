package androidx.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f6872g = mediaBrowserServiceCompat;
    }

    @Override // androidx.media.q, androidx.media.l
    public l0 getCurrentBrowserInfo() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6872g;
        k kVar = mediaBrowserServiceCompat.f6776g;
        if (kVar != null) {
            return kVar == mediaBrowserServiceCompat.f6773c ? new l0(this.f6856b.getCurrentBrowserInfo()) : kVar.f6834d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
}
