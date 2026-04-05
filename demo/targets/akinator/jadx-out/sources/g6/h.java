package g6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g6.d;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f57346m = Charset.forName(C.UTF16_NAME);

    /* renamed from: d, reason: collision with root package name */
    public final DataInputStream f57347d;

    /* renamed from: e, reason: collision with root package name */
    public final DataOutputStream f57348e;

    /* renamed from: f, reason: collision with root package name */
    public final DataInputStream f57349f;

    /* renamed from: g, reason: collision with root package name */
    public DataOutputStream f57350g;

    /* renamed from: h, reason: collision with root package name */
    public g f57351h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f57352i;

    /* renamed from: j, reason: collision with root package name */
    public int f57353j;

    /* renamed from: k, reason: collision with root package name */
    public int f57354k;

    /* renamed from: l, reason: collision with root package name */
    public int f57355l;

    public h(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new z.f(), new z.f(), new z.f());
    }

    @Override // g6.d
    public final d a() {
        return new h(this.f57349f, this.f57350g, this.f57330a, this.f57331b, this.f57332c);
    }

    @Override // g6.d
    public void closeField() throws IOException {
        g gVar = this.f57351h;
        if (gVar != null) {
            try {
                if (gVar.f57342a.size() != 0) {
                    g gVar2 = this.f57351h;
                    DataOutputStream dataOutputStream = gVar2.f57345d;
                    gVar2.f57343b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = gVar2.f57342a;
                    int size = byteArrayOutputStream.size();
                    dataOutputStream.writeInt((gVar2.f57344c << 16) | (size >= 65535 ? 65535 : size));
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f57351h = null;
            } catch (IOException e10) {
                throw new d.a(e10);
            }
        }
    }

    @Override // g6.d
    public final CharSequence g() {
        return null;
    }

    @Override // g6.d
    public boolean isStream() {
        return true;
    }

    @Override // g6.d
    public final void l(CharSequence charSequence) {
        if (!this.f57352i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public final void p(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int i10 = 0;
        if (obj == null) {
            writeInt(0);
            return;
        }
        if (obj instanceof Bundle) {
            writeInt(1);
            writeBundle((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            writeInt(3);
            writeString((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            writeInt(4);
            k((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writeInt(5);
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            writeInt(6);
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            writeInt(length);
            while (i10 < length) {
                writeInt(zArr[i10] ? 1 : 0);
                i10++;
            }
            return;
        }
        if (obj instanceof Double) {
            writeInt(7);
            writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            writeInt(8);
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            writeInt(length2);
            while (i10 < length2) {
                writeDouble(dArr[i10]);
                i10++;
            }
            return;
        }
        if (obj instanceof Integer) {
            writeInt(9);
            writeInt(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            writeInt(10);
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            writeInt(length3);
            while (i10 < length3) {
                writeInt(iArr[i10]);
                i10++;
            }
            return;
        }
        if (obj instanceof Long) {
            writeInt(11);
            writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            writeInt(12);
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            writeInt(length4);
            while (i10 < length4) {
                writeLong(jArr[i10]);
                i10++;
            }
            return;
        }
        if (obj instanceof Float) {
            writeInt(13);
            writeFloat(((Float) obj).floatValue());
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
        writeInt(14);
        float[] fArr = (float[]) obj;
        int length5 = fArr.length;
        writeInt(length5);
        while (i10 < length5) {
            writeFloat(fArr[i10]);
            i10++;
        }
    }

    @Override // g6.d
    public boolean readBoolean() {
        try {
            return this.f57349f.readBoolean();
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public Bundle readBundle() throws IOException {
        boolean[] zArr;
        double[] dArr;
        int[] iArr;
        long[] jArr;
        float[] fArr;
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = readString();
            int i12 = readInt();
            switch (i12) {
                case 0:
                    bundle.putParcelable(string, null);
                    break;
                case 1:
                    bundle.putBundle(string, readBundle());
                    break;
                case 2:
                    bundle.putBundle(string, readBundle());
                    break;
                case 3:
                    bundle.putString(string, readString());
                    break;
                case 4:
                    bundle.putStringArray(string, (String[]) f(new String[0]));
                    break;
                case 5:
                    bundle.putBoolean(string, readBoolean());
                    break;
                case 6:
                    int i13 = readInt();
                    if (i13 < 0) {
                        zArr = null;
                    } else {
                        zArr = new boolean[i13];
                        for (int i14 = 0; i14 < i13; i14++) {
                            zArr[i14] = readInt() != 0;
                        }
                    }
                    bundle.putBooleanArray(string, zArr);
                    break;
                case 7:
                    bundle.putDouble(string, readDouble());
                    break;
                case 8:
                    int i15 = readInt();
                    if (i15 < 0) {
                        dArr = null;
                    } else {
                        dArr = new double[i15];
                        for (int i16 = 0; i16 < i15; i16++) {
                            dArr[i16] = readDouble();
                        }
                    }
                    bundle.putDoubleArray(string, dArr);
                    break;
                case 9:
                    bundle.putInt(string, readInt());
                    break;
                case 10:
                    int i17 = readInt();
                    if (i17 < 0) {
                        iArr = null;
                    } else {
                        iArr = new int[i17];
                        for (int i18 = 0; i18 < i17; i18++) {
                            iArr[i18] = readInt();
                        }
                    }
                    bundle.putIntArray(string, iArr);
                    break;
                case 11:
                    bundle.putLong(string, readLong());
                    break;
                case 12:
                    int i19 = readInt();
                    if (i19 < 0) {
                        jArr = null;
                    } else {
                        jArr = new long[i19];
                        for (int i20 = 0; i20 < i19; i20++) {
                            jArr[i20] = readLong();
                        }
                    }
                    bundle.putLongArray(string, jArr);
                    break;
                case 13:
                    bundle.putFloat(string, readFloat());
                    break;
                case 14:
                    int i21 = readInt();
                    if (i21 < 0) {
                        fArr = null;
                    } else {
                        fArr = new float[i21];
                        for (int i22 = 0; i22 < i21; i22++) {
                            fArr[i22] = readFloat();
                        }
                    }
                    bundle.putFloatArray(string, fArr);
                    break;
                default:
                    throw new RuntimeException(a.b.e(i12, "Unknown type "));
            }
        }
        return bundle;
    }

    @Override // g6.d
    public byte[] readByteArray() throws IOException {
        DataInputStream dataInputStream = this.f57349f;
        try {
            int i10 = dataInputStream.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public double readDouble() {
        try {
            return this.f57349f.readDouble();
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public boolean readField(int i10) throws IOException {
        while (true) {
            try {
                int i11 = this.f57354k;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                int i12 = this.f57353j;
                int i13 = this.f57355l;
                DataInputStream dataInputStream = this.f57347d;
                if (i12 < i13) {
                    dataInputStream.skip(i13 - i12);
                }
                this.f57355l = -1;
                int i14 = dataInputStream.readInt();
                this.f57353j = 0;
                int i15 = i14 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i15 == 65535) {
                    i15 = dataInputStream.readInt();
                }
                this.f57354k = (i14 >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                this.f57355l = i15;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // g6.d
    public float readFloat() {
        try {
            return this.f57349f.readFloat();
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public int readInt() {
        try {
            return this.f57349f.readInt();
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public long readLong() {
        try {
            return this.f57349f.readLong();
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public <T extends Parcelable> T readParcelable() {
        return null;
    }

    @Override // g6.d
    public String readString() throws IOException {
        DataInputStream dataInputStream = this.f57349f;
        try {
            int i10 = dataInputStream.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            dataInputStream.readFully(bArr);
            return new String(bArr, f57346m);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public IBinder readStrongBinder() {
        return null;
    }

    @Override // g6.d
    public void setOutputField(int i10) throws IOException {
        closeField();
        g gVar = new g(i10, this.f57348e);
        this.f57351h = gVar;
        this.f57350g = gVar.f57343b;
    }

    @Override // g6.d
    public void setSerializationFlags(boolean z10, boolean z11) {
        if (!z10) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f57352i = z11;
    }

    @Override // g6.d
    public void writeBoolean(boolean z10) throws IOException {
        try {
            this.f57350g.writeBoolean(z10);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeBundle(Bundle bundle) throws IOException {
        try {
            if (bundle == null) {
                this.f57350g.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f57350g.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                writeString(str);
                p(bundle.get(str));
            }
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeByteArray(byte[] bArr) throws IOException {
        try {
            if (bArr == null) {
                this.f57350g.writeInt(-1);
            } else {
                this.f57350g.writeInt(bArr.length);
                this.f57350g.write(bArr);
            }
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeDouble(double d10) throws IOException {
        try {
            this.f57350g.writeDouble(d10);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeFloat(float f10) throws IOException {
        try {
            this.f57350g.writeFloat(f10);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeInt(int i10) throws IOException {
        try {
            this.f57350g.writeInt(i10);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeLong(long j10) throws IOException {
        try {
            this.f57350g.writeLong(j10);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeParcelable(Parcelable parcelable) {
        if (!this.f57352i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // g6.d
    public void writeString(String str) throws IOException {
        try {
            if (str == null) {
                this.f57350g.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(f57346m);
            this.f57350g.writeInt(bytes.length);
            this.f57350g.write(bytes);
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }

    @Override // g6.d
    public void writeStrongBinder(IBinder iBinder) {
        if (!this.f57352i) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // g6.d
    public void writeStrongInterface(IInterface iInterface) {
        if (!this.f57352i) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public h(InputStream inputStream, OutputStream outputStream, z.f fVar, z.f fVar2, z.f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f57353j = 0;
        this.f57354k = -1;
        this.f57355l = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new f(this, inputStream)) : null;
        this.f57347d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f57348e = dataOutputStream;
        this.f57349f = dataInputStream;
        this.f57350g = dataOutputStream;
    }

    @Override // g6.d
    public void writeByteArray(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (bArr != null) {
                this.f57350g.writeInt(i11);
                this.f57350g.write(bArr, i10, i11);
            } else {
                this.f57350g.writeInt(-1);
            }
        } catch (IOException e10) {
            throw new d.a(e10);
        }
    }
}
