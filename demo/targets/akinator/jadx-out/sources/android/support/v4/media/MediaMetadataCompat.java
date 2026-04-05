package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f4501f;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f4502g;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f4503h;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f4504b;

    /* renamed from: c, reason: collision with root package name */
    public MediaMetadata f4505c;

    /* renamed from: e, reason: collision with root package name */
    public MediaDescriptionCompat f4506e;

    static {
        z.f fVar = new z.f();
        fVar.put("android.media.metadata.TITLE", 1);
        fVar.put("android.media.metadata.ARTIST", 1);
        fVar.put("android.media.metadata.DURATION", 0);
        fVar.put("android.media.metadata.ALBUM", 1);
        fVar.put("android.media.metadata.AUTHOR", 1);
        fVar.put("android.media.metadata.WRITER", 1);
        fVar.put("android.media.metadata.COMPOSER", 1);
        fVar.put("android.media.metadata.COMPILATION", 1);
        fVar.put("android.media.metadata.DATE", 1);
        fVar.put("android.media.metadata.YEAR", 0);
        fVar.put("android.media.metadata.GENRE", 1);
        fVar.put("android.media.metadata.TRACK_NUMBER", 0);
        fVar.put("android.media.metadata.NUM_TRACKS", 0);
        fVar.put("android.media.metadata.DISC_NUMBER", 0);
        fVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        fVar.put("android.media.metadata.ART", 2);
        fVar.put("android.media.metadata.ART_URI", 1);
        fVar.put("android.media.metadata.ALBUM_ART", 2);
        fVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        fVar.put("android.media.metadata.USER_RATING", 3);
        fVar.put("android.media.metadata.RATING", 3);
        fVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        fVar.put("android.media.metadata.DISPLAY_ICON", 2);
        fVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        fVar.put("android.media.metadata.MEDIA_ID", 1);
        fVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        fVar.put("android.media.metadata.MEDIA_URI", 1);
        fVar.put("android.media.metadata.ADVERTISEMENT", 0);
        fVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f4501f = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f4502g = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f4503h = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new x();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f4504b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat fromMediaMetadata(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f4505c = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public boolean containsKey(String str) {
        return this.f4504b.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap(String str) {
        try {
            return (Bitmap) this.f4504b.getParcelable(str);
        } catch (Exception e10) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e10);
            return null;
        }
    }

    public Bundle getBundle() {
        return new Bundle(this.f4504b);
    }

    public MediaDescriptionCompat getDescription() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f4506e;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String string = getString("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence text = getText("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(text)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = f4501f;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence text2 = getText(strArr[i11]);
                if (!TextUtils.isEmpty(text2)) {
                    charSequenceArr[i10] = text2;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = text;
            charSequenceArr[1] = getText("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = getText("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = f4502g;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = getBitmap(strArr2[i13]);
            if (bitmap != null) {
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = f4503h;
            if (i14 >= strArr3.length) {
                uri = null;
                break;
            }
            String string2 = getString(strArr3[i14]);
            if (!TextUtils.isEmpty(string2)) {
                uri = Uri.parse(string2);
                break;
            }
            i14++;
        }
        String string3 = getString("android.media.metadata.MEDIA_URI");
        Uri uri2 = TextUtils.isEmpty(string3) ? null : Uri.parse(string3);
        MediaDescriptionCompat.a aVar = new MediaDescriptionCompat.a();
        aVar.setMediaId(string);
        aVar.setTitle(charSequenceArr[0]);
        aVar.setSubtitle(charSequenceArr[1]);
        aVar.setDescription(charSequenceArr[2]);
        aVar.setIconBitmap(bitmap);
        aVar.setIconUri(uri);
        aVar.setMediaUri(uri2);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4504b;
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", getLong("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", getLong("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            aVar.setExtras(bundle);
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = aVar.build();
        this.f4506e = mediaDescriptionCompatBuild;
        return mediaDescriptionCompatBuild;
    }

    public long getLong(String str) {
        return this.f4504b.getLong(str, 0L);
    }

    public Object getMediaMetadata() {
        if (this.f4505c == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.f4505c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f4505c;
    }

    public RatingCompat getRating(String str) {
        try {
            return RatingCompat.fromRating(this.f4504b.getParcelable(str));
        } catch (Exception e10) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e10);
            return null;
        }
    }

    public String getString(String str) {
        CharSequence charSequence = this.f4504b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence getText(String str) {
        return this.f4504b.getCharSequence(str);
    }

    public Set<String> keySet() {
        return this.f4504b.keySet();
    }

    public int size() {
        return this.f4504b.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f4504b);
    }
}
