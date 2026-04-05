package vp;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f89515a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final m f89516b;

    /* renamed from: c, reason: collision with root package name */
    public final AdProcessCallback f89517c;

    /* renamed from: d, reason: collision with root package name */
    public final o f89518d;

    /* renamed from: e, reason: collision with root package name */
    public final l f89519e;

    public e(m mVar, AdProcessCallback adProcessCallback, o oVar, l lVar) {
        this.f89516b = mVar;
        this.f89517c = adProcessCallback;
        this.f89518d = oVar;
        this.f89519e = lVar;
    }

    public static void a(e eVar, Runnable runnable) {
        eVar.f89515a.remove(runnable);
        eVar.c();
    }

    public static void b(e eVar, Context context, Uri uri) {
        ImageData mainImage = eVar.f89518d.getMainImage();
        if (!TextUtils.isEmpty(mainImage != null ? mainImage.getRemoteUrl() : null) || uri == null || uri.getPath() == null || !new File(uri.getPath()).exists()) {
            return;
        }
        eVar.f89519e.setImageUri(Uri.parse(nm.j.retrieveAndSaveFrame(context, uri, "native_cache_image")));
    }

    public final void c() {
        if (this.f89515a.isEmpty()) {
            synchronized (this) {
                try {
                    if (!this.f89516b.isValidateAssets() || d()) {
                        this.f89517c.processLoadSuccess();
                    } else {
                        this.f89517c.processLoadFail(pr.a.internal("Native assets are invalid"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean d() {
        m mVar = this.f89516b;
        try {
            boolean zContainsAssetType = mVar.containsAssetType(MediaAssetType.Icon);
            l lVar = this.f89519e;
            if (!zContainsAssetType || lVar.getIconUri() != null || lVar.getIconDrawable() != null) {
                if (!mVar.containsAssetType(MediaAssetType.Image) || lVar.getImageUri() != null || lVar.getImageDrawable() != null) {
                    if (mVar.containsAssetType(MediaAssetType.Video) ? this.f89518d.hasVideo() : true) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            nm.a.w(e10);
            return false;
        }
    }
}
