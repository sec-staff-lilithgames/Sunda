package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.ads.DtbDeviceData;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n();
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public final String f25696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25697b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25698c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f25699d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25700e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25701f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25702g;

    /* renamed from: h, reason: collision with root package name */
    public final List f25703h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d f25704i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25705j;

    /* renamed from: k, reason: collision with root package name */
    public final int f25706k;

    /* renamed from: l, reason: collision with root package name */
    public final float f25707l;

    /* renamed from: m, reason: collision with root package name */
    public final int f25708m;

    /* renamed from: n, reason: collision with root package name */
    public final float f25709n;

    /* renamed from: o, reason: collision with root package name */
    public final int f25710o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f25711p;

    /* renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c f25712q;

    /* renamed from: r, reason: collision with root package name */
    public final int f25713r;

    /* renamed from: s, reason: collision with root package name */
    public final int f25714s;

    /* renamed from: t, reason: collision with root package name */
    public final int f25715t;

    /* renamed from: u, reason: collision with root package name */
    public final int f25716u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25717v;

    /* renamed from: w, reason: collision with root package name */
    public final long f25718w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25719x;

    /* renamed from: y, reason: collision with root package name */
    public final String f25720y;

    /* renamed from: z, reason: collision with root package name */
    public final int f25721z;

    public o(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f25696a = str;
        this.f25700e = str2;
        this.f25701f = str3;
        this.f25698c = str4;
        this.f25697b = i10;
        this.f25702g = i11;
        this.f25705j = i12;
        this.f25706k = i13;
        this.f25707l = f10;
        this.f25708m = i14;
        this.f25709n = f11;
        this.f25711p = bArr;
        this.f25710o = i15;
        this.f25712q = cVar;
        this.f25713r = i16;
        this.f25714s = i17;
        this.f25715t = i18;
        this.f25716u = i19;
        this.f25717v = i20;
        this.f25719x = i21;
        this.f25720y = str5;
        this.f25721z = i22;
        this.f25718w = j10;
        this.f25703h = list == null ? Collections.EMPTY_LIST : list;
        this.f25704i = dVar;
        this.f25699d = bVar;
    }

    public static o a(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    public final int b() {
        int i10;
        int i11 = this.f25705j;
        if (i11 == -1 || (i10 = this.f25706k) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f25697b == oVar.f25697b && this.f25702g == oVar.f25702g && this.f25705j == oVar.f25705j && this.f25706k == oVar.f25706k && this.f25707l == oVar.f25707l && this.f25708m == oVar.f25708m && this.f25709n == oVar.f25709n && this.f25710o == oVar.f25710o && this.f25713r == oVar.f25713r && this.f25714s == oVar.f25714s && this.f25715t == oVar.f25715t && this.f25716u == oVar.f25716u && this.f25717v == oVar.f25717v && this.f25718w == oVar.f25718w && this.f25719x == oVar.f25719x && z.a(this.f25696a, oVar.f25696a) && z.a(this.f25720y, oVar.f25720y) && this.f25721z == oVar.f25721z && z.a(this.f25700e, oVar.f25700e) && z.a(this.f25701f, oVar.f25701f) && z.a(this.f25698c, oVar.f25698c) && z.a(this.f25704i, oVar.f25704i) && z.a(this.f25699d, oVar.f25699d) && z.a(this.f25712q, oVar.f25712q) && Arrays.equals(this.f25711p, oVar.f25711p) && this.f25703h.size() == oVar.f25703h.size()) {
                for (int i10 = 0; i10 < this.f25703h.size(); i10++) {
                    if (!Arrays.equals((byte[]) this.f25703h.get(i10), (byte[]) oVar.f25703h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f25696a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f25700e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25701f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25698c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f25697b) * 31) + this.f25705j) * 31) + this.f25706k) * 31) + this.f25713r) * 31) + this.f25714s) * 31;
            String str5 = this.f25720y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f25721z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.f25704i;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.f25699d;
            this.A = iHashCode6 + (bVar != null ? Arrays.hashCode(bVar.f25660a) : 0);
        }
        return this.A;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f25696a);
        sb2.append(", ");
        sb2.append(this.f25700e);
        sb2.append(", ");
        sb2.append(this.f25701f);
        sb2.append(", ");
        sb2.append(this.f25697b);
        sb2.append(", ");
        sb2.append(this.f25720y);
        sb2.append(", [");
        sb2.append(this.f25705j);
        sb2.append(", ");
        sb2.append(this.f25706k);
        sb2.append(", ");
        sb2.append(this.f25707l);
        sb2.append("], [");
        sb2.append(this.f25713r);
        sb2.append(", ");
        return a.b.f(this.f25714s, "])", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25696a);
        parcel.writeString(this.f25700e);
        parcel.writeString(this.f25701f);
        parcel.writeString(this.f25698c);
        parcel.writeInt(this.f25697b);
        parcel.writeInt(this.f25702g);
        parcel.writeInt(this.f25705j);
        parcel.writeInt(this.f25706k);
        parcel.writeFloat(this.f25707l);
        parcel.writeInt(this.f25708m);
        parcel.writeFloat(this.f25709n);
        parcel.writeInt(this.f25711p != null ? 1 : 0);
        byte[] bArr = this.f25711p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f25710o);
        parcel.writeParcelable(this.f25712q, i10);
        parcel.writeInt(this.f25713r);
        parcel.writeInt(this.f25714s);
        parcel.writeInt(this.f25715t);
        parcel.writeInt(this.f25716u);
        parcel.writeInt(this.f25717v);
        parcel.writeInt(this.f25719x);
        parcel.writeString(this.f25720y);
        parcel.writeInt(this.f25721z);
        parcel.writeLong(this.f25718w);
        int size = this.f25703h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) this.f25703h.get(i11));
        }
        parcel.writeParcelable(this.f25704i, 0);
        parcel.writeParcelable(this.f25699d, 0);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, String str3) {
        return a(str, str2, i10, i11, i12, i13, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i17, String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new o(str, null, str2, null, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static o a(String str, String str2, int i10, String str3, int i11, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j10, List list) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, i11, j10, list, dVar, null);
    }

    public static o a(String str, String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f25701f);
        String str = this.f25720y;
        if (str != null) {
            mediaFormat.setString(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, str);
        }
        a(mediaFormat, "max-input-size", this.f25702g);
        a(mediaFormat, "width", this.f25705j);
        a(mediaFormat, "height", this.f25706k);
        float f10 = this.f25707l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        a(mediaFormat, "rotation-degrees", this.f25708m);
        a(mediaFormat, "channel-count", this.f25713r);
        a(mediaFormat, "sample-rate", this.f25714s);
        a(mediaFormat, "encoder-delay", this.f25716u);
        a(mediaFormat, "encoder-padding", this.f25717v);
        for (int i10 = 0; i10 < this.f25703h.size(); i10++) {
            mediaFormat.setByteBuffer(m.a("csd-", i10), ByteBuffer.wrap((byte[]) this.f25703h.get(i10)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.f25712q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.f26107c);
            a(mediaFormat, "color-standard", cVar.f26105a);
            a(mediaFormat, "color-range", cVar.f26106b);
            byte[] bArr = cVar.f26108d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public o(Parcel parcel) {
        this.f25696a = parcel.readString();
        this.f25700e = parcel.readString();
        this.f25701f = parcel.readString();
        this.f25698c = parcel.readString();
        this.f25697b = parcel.readInt();
        this.f25702g = parcel.readInt();
        this.f25705j = parcel.readInt();
        this.f25706k = parcel.readInt();
        this.f25707l = parcel.readFloat();
        this.f25708m = parcel.readInt();
        this.f25709n = parcel.readFloat();
        this.f25711p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f25710o = parcel.readInt();
        this.f25712q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.f25713r = parcel.readInt();
        this.f25714s = parcel.readInt();
        this.f25715t = parcel.readInt();
        this.f25716u = parcel.readInt();
        this.f25717v = parcel.readInt();
        this.f25719x = parcel.readInt();
        this.f25720y = parcel.readString();
        this.f25721z = parcel.readInt();
        this.f25718w = parcel.readLong();
        int i10 = parcel.readInt();
        this.f25703h = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25703h.add(parcel.createByteArray());
        }
        this.f25704i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.f25699d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}
