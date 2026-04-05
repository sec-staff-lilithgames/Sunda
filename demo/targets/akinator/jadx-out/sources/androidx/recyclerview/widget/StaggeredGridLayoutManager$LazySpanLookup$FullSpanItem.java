package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new d3();

    /* renamed from: b, reason: collision with root package name */
    public int f7026b;

    /* renamed from: c, reason: collision with root package name */
    public int f7027c;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7028e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7029f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "FullSpanItem{mPosition=" + this.f7026b + ", mGapDir=" + this.f7027c + ", mHasUnwantedGapAfter=" + this.f7029f + ", mGapPerSpan=" + Arrays.toString(this.f7028e) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7026b);
        parcel.writeInt(this.f7027c);
        parcel.writeInt(this.f7029f ? 1 : 0);
        int[] iArr = this.f7028e;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f7028e);
        }
    }
}
