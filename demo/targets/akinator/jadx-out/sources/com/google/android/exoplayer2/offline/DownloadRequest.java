package com.google.android.exoplayer2.offline;

import af.m;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.h1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.a;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    public final String f27873b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f27874c;

    /* renamed from: e, reason: collision with root package name */
    public final String f27875e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27876f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f27877g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27878h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f27879i;

    public DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iInferContentTypeForUriAndMimeType = n1.inferContentTypeForUriAndMimeType(uri, str2);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 2 || iInferContentTypeForUriAndMimeType == 1) {
            a.checkArgument(str3 == null, "customCacheKey must be null for type: " + iInferContentTypeForUriAndMimeType);
        }
        this.f27873b = str;
        this.f27874c = uri;
        this.f27875e = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f27876f = Collections.unmodifiableList(arrayList);
        this.f27877g = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f27878h = str3;
        this.f27879i = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : n1.f28511f;
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.f27874c, this.f27875e, this.f27876f, this.f27877g, this.f27878h, this.f27879i);
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new DownloadRequest(this.f27873b, this.f27874c, this.f27875e, this.f27876f, bArr, this.f27878h, this.f27879i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        ?? arrayList;
        String str = downloadRequest.f27873b;
        List list = downloadRequest.f27876f;
        a.checkArgument(this.f27873b.equals(str));
        List list2 = this.f27876f;
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
        return new DownloadRequest(this.f27873b, downloadRequest.f27874c, downloadRequest.f27875e, list3, downloadRequest.f27877g, downloadRequest.f27878h, downloadRequest.f27879i);
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
        return this.f27873b.equals(downloadRequest.f27873b) && this.f27874c.equals(downloadRequest.f27874c) && n1.areEqual(this.f27875e, downloadRequest.f27875e) && this.f27876f.equals(downloadRequest.f27876f) && Arrays.equals(this.f27877g, downloadRequest.f27877g) && n1.areEqual(this.f27878h, downloadRequest.f27878h) && Arrays.equals(this.f27879i, downloadRequest.f27879i);
    }

    public final int hashCode() {
        int iHashCode = (this.f27874c.hashCode() + (this.f27873b.hashCode() * 961)) * 31;
        String str = this.f27875e;
        int iHashCode2 = (Arrays.hashCode(this.f27877g) + ((this.f27876f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f27878h;
        return Arrays.hashCode(this.f27879i) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public u1 toMediaItem() {
        return new h1().setMediaId(this.f27873b).setUri(this.f27874c).setCustomCacheKey(this.f27878h).setMimeType(this.f27875e).setStreamKeys(this.f27876f).build();
    }

    public String toString() {
        return this.f27875e + ":" + this.f27873b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27873b);
        parcel.writeString(this.f27874c.toString());
        parcel.writeString(this.f27875e);
        List list = this.f27876f;
        parcel.writeInt(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
        parcel.writeByteArray(this.f27877g);
        parcel.writeString(this.f27878h);
        parcel.writeByteArray(this.f27879i);
    }

    public DownloadRequest(Parcel parcel) {
        this.f27873b = (String) n1.castNonNull(parcel.readString());
        this.f27874c = Uri.parse((String) n1.castNonNull(parcel.readString()));
        this.f27875e = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f27876f = Collections.unmodifiableList(arrayList);
        this.f27877g = parcel.createByteArray();
        this.f27878h = parcel.readString();
        this.f27879i = (byte[]) n1.castNonNull(parcel.createByteArray());
    }
}
