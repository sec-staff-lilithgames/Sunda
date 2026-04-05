package io.bidmachine.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import gn.c0;
import gn.p0;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import zn.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new k();

    /* renamed from: b, reason: collision with root package name */
    public final String f61502b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f61503c;

    /* renamed from: e, reason: collision with root package name */
    public final String f61504e;

    /* renamed from: f, reason: collision with root package name */
    public final List f61505f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f61506g;

    /* renamed from: h, reason: collision with root package name */
    public final String f61507h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f61508i;

    /* renamed from: j, reason: collision with root package name */
    public final ByteRange f61509j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f61510b;

        /* renamed from: c, reason: collision with root package name */
        public final long f61511c;

        public ByteRange(long j10, long j11) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
            io.bidmachine.media3.common.util.a.checkArgument(j11 >= 0 || j11 == -1);
            this.f61510b = j10;
            this.f61511c = j11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.f61510b == byteRange.f61510b && this.f61511c == byteRange.f61511c;
        }

        public int hashCode() {
            return (((int) this.f61510b) * 961) + ((int) this.f61511c);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f61510b);
            parcel.writeLong(this.f61511c);
        }
    }

    public DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, ByteRange byteRange) {
        int iInferContentTypeForUriAndMimeType = a1.inferContentTypeForUriAndMimeType(uri, str2);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 2 || iInferContentTypeForUriAndMimeType == 1) {
            io.bidmachine.media3.common.util.a.checkArgument(str3 == null, "customCacheKey must be null for type: " + iInferContentTypeForUriAndMimeType);
            this.f61509j = null;
        } else {
            this.f61509j = byteRange;
        }
        this.f61502b = str;
        this.f61503c = uri;
        this.f61504e = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f61505f = Collections.unmodifiableList(arrayList);
        this.f61506g = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f61507h = str3;
        this.f61508i = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : a1.f60681c;
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.f61503c, this.f61504e, this.f61505f, this.f61506g, this.f61507h, this.f61508i, this.f61509j);
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new DownloadRequest(this.f61502b, this.f61503c, this.f61504e, this.f61505f, bArr, this.f61507h, this.f61508i, this.f61509j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        ?? arrayList;
        String str = downloadRequest.f61502b;
        List list = downloadRequest.f61505f;
        io.bidmachine.media3.common.util.a.checkArgument(this.f61502b.equals(str));
        List list2 = this.f61505f;
        if (list2.isEmpty() || list.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(list2);
            for (int i10 = 0; i10 < list.size(); i10++) {
                StreamKey streamKey = (StreamKey) list.get(i10);
                if (!arrayList.contains(streamKey)) {
                    arrayList.add(streamKey);
                }
            }
        }
        List list3 = arrayList;
        return new DownloadRequest(this.f61502b, downloadRequest.f61503c, downloadRequest.f61504e, list3, downloadRequest.f61506g, downloadRequest.f61507h, downloadRequest.f61508i, downloadRequest.f61509j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f61502b.equals(downloadRequest.f61502b) && this.f61503c.equals(downloadRequest.f61503c) && Objects.equals(this.f61504e, downloadRequest.f61504e) && this.f61505f.equals(downloadRequest.f61505f) && Arrays.equals(this.f61506g, downloadRequest.f61506g) && Objects.equals(this.f61507h, downloadRequest.f61507h) && Arrays.equals(this.f61508i, downloadRequest.f61508i) && Objects.equals(this.f61509j, downloadRequest.f61509j);
    }

    public int hashCode() {
        int iHashCode = (this.f61503c.hashCode() + (this.f61502b.hashCode() * 961)) * 31;
        String str = this.f61504e;
        int iHashCode2 = (Arrays.hashCode(this.f61506g) + ((this.f61505f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f61507h;
        int iHashCode3 = (Arrays.hashCode(this.f61508i) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.f61509j;
        return iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public p0 toMediaItem() {
        return new c0().setMediaId(this.f61502b).setUri(this.f61503c).setCustomCacheKey(this.f61507h).setMimeType(this.f61504e).setStreamKeys(this.f61505f).build();
    }

    public String toString() {
        return this.f61504e + ":" + this.f61502b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f61502b);
        parcel.writeString(this.f61503c.toString());
        parcel.writeString(this.f61504e);
        List list = this.f61505f;
        parcel.writeInt(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
        parcel.writeByteArray(this.f61506g);
        parcel.writeString(this.f61507h);
        parcel.writeByteArray(this.f61508i);
        parcel.writeParcelable(this.f61509j, 0);
    }

    public DownloadRequest(Parcel parcel) {
        this.f61502b = (String) a1.castNonNull(parcel.readString());
        this.f61503c = Uri.parse((String) a1.castNonNull(parcel.readString()));
        this.f61504e = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f61505f = Collections.unmodifiableList(arrayList);
        this.f61506g = parcel.createByteArray();
        this.f61507h = parcel.readString();
        this.f61508i = (byte[]) a1.castNonNull(parcel.createByteArray());
        this.f61509j = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }
}
