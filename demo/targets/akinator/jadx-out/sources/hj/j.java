package hj;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.u f58961a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f58962b = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends g9.c {

        /* renamed from: f, reason: collision with root package name */
        public ImageView f58963f;

        public abstract void onError(Exception exc);

        @Override // g9.c, g9.n
        public void onLoadCleared(Drawable drawable) {
            t.logd("Downloading Image Cleared");
            ImageView imageView = this.f58963f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            onSuccess();
        }

        @Override // g9.c, g9.n
        public void onLoadFailed(Drawable drawable) {
            t.logd("Downloading Image Failed");
            ImageView imageView = this.f58963f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            onError(new Exception("Image loading failed!"));
        }

        public abstract void onSuccess();

        @Override // g9.c, g9.n
        public void onResourceReady(Drawable drawable, h9.c cVar) {
            t.logd("Downloading Image Success!!!");
            ImageView imageView = this.f58963f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            onSuccess();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.q f58964a;

        /* renamed from: b, reason: collision with root package name */
        public a f58965b;

        /* renamed from: c, reason: collision with root package name */
        public String f58966c;

        public b(com.bumptech.glide.q qVar) {
            this.f58964a = qVar;
        }

        public final void a() {
            Set hashSet;
            if (this.f58965b == null || TextUtils.isEmpty(this.f58966c)) {
                return;
            }
            synchronized (j.this.f58962b) {
                try {
                    if (j.this.f58962b.containsKey(this.f58966c)) {
                        hashSet = (Set) j.this.f58962b.get(this.f58966c);
                    } else {
                        hashSet = new HashSet();
                        j.this.f58962b.put(this.f58966c, hashSet);
                    }
                    if (!hashSet.contains(this.f58965b)) {
                        hashSet.add(this.f58965b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public b addErrorListener(r rVar) {
            this.f58964a.addListener(rVar);
            return this;
        }

        public void into(ImageView imageView, a aVar) {
            t.logd("Downloading Image Callback : " + aVar);
            aVar.f58963f = imageView;
            this.f58964a.into((com.bumptech.glide.q) aVar);
            this.f58965b = aVar;
            a();
        }

        public b placeholder(int i10) {
            this.f58964a.placeholder(i10);
            t.logd("Downloading Image Placeholder : " + i10);
            return this;
        }

        public b tag(Class cls) {
            this.f58966c = cls.getSimpleName();
            a();
            return this;
        }
    }

    public j(com.bumptech.glide.u uVar) {
        this.f58961a = uVar;
    }

    public void cancelTag(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            try {
                if (this.f58962b.containsKey(simpleName)) {
                    for (g9.c cVar : (Set) this.f58962b.get(simpleName)) {
                        if (cVar != null) {
                            this.f58961a.clear(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b load(String str) {
        t.logd("Starting Downloading Image : " + str);
        return new b((com.bumptech.glide.q) this.f58961a.load((Object) new u8.z(str, new u8.c0().addHeader("Accept", "image/*").build())).format(n8.b.f75829b));
    }
}
