package g6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f57333d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f57334e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57335f;

    /* renamed from: g, reason: collision with root package name */
    public final int f57336g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57337h;

    /* renamed from: i, reason: collision with root package name */
    public int f57338i;

    /* renamed from: j, reason: collision with root package name */
    public int f57339j;

    /* renamed from: k, reason: collision with root package name */
    public int f57340k;

    public e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new z.f(), new z.f(), new z.f());
    }

    @Override // g6.d
    public final d a() {
        Parcel parcel = this.f57334e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f57339j;
        if (i10 == this.f57335f) {
            i10 = this.f57336g;
        }
        return new e(parcel, iDataPosition, i10, o2.o(new StringBuilder(), this.f57337h, "  "), this.f57330a, this.f57331b, this.f57332c);
    }

    @Override // g6.d
    public void closeField() {
        int i10 = this.f57338i;
        if (i10 >= 0) {
            int i11 = this.f57333d.get(i10);
            Parcel parcel = this.f57334e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // g6.d
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f57334e);
    }

    @Override // g6.d
    public final void l(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f57334e, 0);
    }

    @Override // g6.d
    public boolean readBoolean() {
        return this.f57334e.readInt() != 0;
    }

    @Override // g6.d
    public Bundle readBundle() {
        return this.f57334e.readBundle(e.class.getClassLoader());
    }

    @Override // g6.d
    public byte[] readByteArray() {
        Parcel parcel = this.f57334e;
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // g6.d
    public double readDouble() {
        return this.f57334e.readDouble();
    }

    @Override // g6.d
    public boolean readField(int i10) {
        while (this.f57339j < this.f57336g) {
            int i11 = this.f57340k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f57339j;
            Parcel parcel = this.f57334e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f57340k = parcel.readInt();
            this.f57339j += i13;
        }
        return this.f57340k == i10;
    }

    @Override // g6.d
    public float readFloat() {
        return this.f57334e.readFloat();
    }

    @Override // g6.d
    public int readInt() {
        return this.f57334e.readInt();
    }

    @Override // g6.d
    public long readLong() {
        return this.f57334e.readLong();
    }

    @Override // g6.d
    public <T extends Parcelable> T readParcelable() {
        return (T) this.f57334e.readParcelable(e.class.getClassLoader());
    }

    @Override // g6.d
    public String readString() {
        return this.f57334e.readString();
    }

    @Override // g6.d
    public IBinder readStrongBinder() {
        return this.f57334e.readStrongBinder();
    }

    @Override // g6.d
    public void setOutputField(int i10) {
        closeField();
        this.f57338i = i10;
        this.f57333d.put(i10, this.f57334e.dataPosition());
        writeInt(0);
        writeInt(i10);
    }

    @Override // g6.d
    public void writeBoolean(boolean z10) {
        this.f57334e.writeInt(z10 ? 1 : 0);
    }

    @Override // g6.d
    public void writeBundle(Bundle bundle) {
        this.f57334e.writeBundle(bundle);
    }

    @Override // g6.d
    public void writeByteArray(byte[] bArr) {
        Parcel parcel = this.f57334e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // g6.d
    public void writeDouble(double d10) {
        this.f57334e.writeDouble(d10);
    }

    @Override // g6.d
    public void writeFloat(float f10) {
        this.f57334e.writeFloat(f10);
    }

    @Override // g6.d
    public void writeInt(int i10) {
        this.f57334e.writeInt(i10);
    }

    @Override // g6.d
    public void writeLong(long j10) {
        this.f57334e.writeLong(j10);
    }

    @Override // g6.d
    public void writeParcelable(Parcelable parcelable) {
        this.f57334e.writeParcelable(parcelable, 0);
    }

    @Override // g6.d
    public void writeString(String str) {
        this.f57334e.writeString(str);
    }

    @Override // g6.d
    public void writeStrongBinder(IBinder iBinder) {
        this.f57334e.writeStrongBinder(iBinder);
    }

    @Override // g6.d
    public void writeStrongInterface(IInterface iInterface) {
        this.f57334e.writeStrongInterface(iInterface);
    }

    public e(Parcel parcel, int i10, int i11, String str, z.f fVar, z.f fVar2, z.f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f57333d = new SparseIntArray();
        this.f57338i = -1;
        this.f57340k = -1;
        this.f57334e = parcel;
        this.f57335f = i10;
        this.f57336g = i11;
        this.f57339j = i10;
        this.f57337h = str;
    }

    @Override // g6.d
    public void writeByteArray(byte[] bArr, int i10, int i11) {
        Parcel parcel = this.f57334e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr, i10, i11);
        } else {
            parcel.writeInt(-1);
        }
    }
}
