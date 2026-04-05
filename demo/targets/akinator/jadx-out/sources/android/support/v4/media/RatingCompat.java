package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new y();

    /* renamed from: b, reason: collision with root package name */
    public final int f4507b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4508c;

    /* renamed from: e, reason: collision with root package name */
    public Object f4509e;

    public RatingCompat(int i10, float f10) {
        this.f4507b = i10;
        this.f4508c = f10;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iB = z.b(rating);
            if (z.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(z.d(rating));
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(z.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(iB, z.c(rating));
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(z.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(iB);
            }
            ratingCompatNewUnratedRating.f4509e = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static RatingCompat newHeartRating(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newThumbRating(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f4507b;
    }

    public float getPercentRating() {
        if (this.f4507b == 6 && isRated()) {
            return this.f4508c;
        }
        return -1.0f;
    }

    public Object getRating() {
        if (this.f4509e == null) {
            boolean zIsRated = isRated();
            int i10 = this.f4507b;
            if (zIsRated) {
                switch (i10) {
                    case 1:
                        this.f4509e = z.g(hasHeart());
                        break;
                    case 2:
                        this.f4509e = z.j(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f4509e = z.i(i10, getStarRating());
                        break;
                    case 6:
                        this.f4509e = z.h(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f4509e = z.k(i10);
            }
        }
        return this.f4509e;
    }

    public int getRatingStyle() {
        return this.f4507b;
    }

    public float getStarRating() {
        int i10 = this.f4507b;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && isRated()) {
            return this.f4508c;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        return this.f4507b == 1 && this.f4508c == 1.0f;
    }

    public boolean isRated() {
        return this.f4508c >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.f4507b == 2 && this.f4508c == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f4507b);
        sb2.append(" rating=");
        float f10 = this.f4508c;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4507b);
        parcel.writeFloat(this.f4508c);
    }
}
