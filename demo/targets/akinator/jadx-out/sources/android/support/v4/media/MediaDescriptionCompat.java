package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new u();

    /* renamed from: b, reason: collision with root package name */
    public final String f4484b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f4485c;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f4486e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f4487f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f4488g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f4489h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f4490i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f4491j;

    /* renamed from: k, reason: collision with root package name */
    public MediaDescription f4492k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f4493a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f4494b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f4495c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f4496d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap f4497e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f4498f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f4499g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f4500h;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.f4493a, this.f4494b, this.f4495c, this.f4496d, this.f4497e, this.f4498f, this.f4499g, this.f4500h);
        }

        public a setDescription(CharSequence charSequence) {
            this.f4496d = charSequence;
            return this;
        }

        public a setExtras(Bundle bundle) {
            this.f4499g = bundle;
            return this;
        }

        public a setIconBitmap(Bitmap bitmap) {
            this.f4497e = bitmap;
            return this;
        }

        public a setIconUri(Uri uri) {
            this.f4498f = uri;
            return this;
        }

        public a setMediaId(String str) {
            this.f4493a = str;
            return this;
        }

        public a setMediaUri(Uri uri) {
            this.f4500h = uri;
            return this;
        }

        public a setSubtitle(CharSequence charSequence) {
            this.f4495c = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f4494b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4484b = str;
        this.f4485c = charSequence;
        this.f4486e = charSequence2;
        this.f4487f = charSequence3;
        this.f4488g = bitmap;
        this.f4489h = uri;
        this.f4490i = bundle;
        this.f4491j = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        MediaDescription mediaDescription = (MediaDescription) obj;
        aVar.setMediaId(v.g(mediaDescription));
        aVar.setTitle(v.i(mediaDescription));
        aVar.setSubtitle(v.h(mediaDescription));
        aVar.setDescription(v.c(mediaDescription));
        aVar.setIconBitmap(v.e(mediaDescription));
        aVar.setIconUri(v.f(mediaDescription));
        Bundle bundleD = v.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.unparcelWithClassLoader(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        aVar.setExtras(bundle);
        if (uri != null) {
            aVar.setMediaUri(uri);
        } else {
            aVar.setMediaUri(w.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = aVar.build();
        mediaDescriptionCompatBuild.f4492k = mediaDescription;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.f4487f;
    }

    public Bundle getExtras() {
        return this.f4490i;
    }

    public Bitmap getIconBitmap() {
        return this.f4488g;
    }

    public Uri getIconUri() {
        return this.f4489h;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.f4492k;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = v.b();
        v.n(builderB, this.f4484b);
        v.p(builderB, this.f4485c);
        v.o(builderB, this.f4486e);
        v.j(builderB, this.f4487f);
        v.l(builderB, this.f4488g);
        v.m(builderB, this.f4489h);
        v.k(builderB, this.f4490i);
        w.b(builderB, this.f4491j);
        MediaDescription mediaDescriptionA = v.a(builderB);
        this.f4492k = mediaDescriptionA;
        return mediaDescriptionA;
    }

    public String getMediaId() {
        return this.f4484b;
    }

    public Uri getMediaUri() {
        return this.f4491j;
    }

    public CharSequence getSubtitle() {
        return this.f4486e;
    }

    public CharSequence getTitle() {
        return this.f4485c;
    }

    public String toString() {
        return ((Object) this.f4485c) + ", " + ((Object) this.f4486e) + ", " + ((Object) this.f4487f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i10);
    }
}
